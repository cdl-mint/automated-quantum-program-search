/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.momot.util;

import at.ac.tuwien.big.moea.util.CastUtil;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

import quope.QuopePackage;

public final class MomotUtil {

   private static Resource secRes;

   public static <T extends Solution> Iterable<T> asIterables(final Population population, final Class<T> clazz) {
      final List<T> solutions = new ArrayList<>();
      for(final Solution solution : population) {
         solutions.add(CastUtil.asClass(solution, clazz));
      }
      return solutions;
   }

   public static TransformationSolution assertTransformationSolution(final Solution solution) {
      return CastUtil.assertClass(solution, TransformationSolution.class);
   }

   public static TransformationSolution asTransformationSolution(final Solution solution) {
      return CastUtil.asClass(solution, TransformationSolution.class);
   }

   public static EGraph copy(final EGraph original) {
      if(original == null) {
         return null;
      }

      try {
         // Copy the resource: (necessary?)
         // List<EObject> roots = original.getRoots();
         // EObject root = roots.get(0);
         // Resource resource = root.eResource();
         // Copier copier = null;
         // if(resource != null) {
         // Resource copiedResource = new ResourceImpl();
         // copier = new Copier();
         // copiedResource.getContents().addAll(copier.copyAll(resource.getContents()));
         // copier.copyReferences();
         // }

         // Copy the graph:
         return original.copy(null);
      } catch(final Exception e) {
         // System.out.println("MomotUtil.copy(): " + e.getClass().getSimpleName() + ": " + e.getMessage());
         // System.out.flush();
         try {
            return original.copy(null);
         } catch(final Exception ex) {

            // System.out.println("MomotUtil.copy(): " + e.getClass().getSimpleName() + ": " + e.getMessage());
            // System.out.flush();
            final Copier copier = new Copier();
            copier.copyAll(original.getRoots());
            copier.copyReferences();

            Boolean nullObjects = false;
            final EGraph copy = new EGraphImpl(original.size());
            for(final EObject object : original) {
               final EObject objectCopy = copier.get(object);
               if(objectCopy == null) {
                  nullObjects = true;
                  break;
               }
               copy.add(objectCopy);
            }

            if(!nullObjects) {
               return copy;
            } else {
               return new EGraphImpl(EcoreUtil.copyAll(original.getRoots()));
            }
         }
      }
   }

   public static EGraph createEGraph(final EObject root) {

      final HenshinResourceSet secSet = new HenshinResourceSet("src-library");
      secSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("quope", new XMIResourceFactoryImpl());

      // EPackage.Registry.INSTANCE.put(QuopePackage.eNS_URI, QuopePackage.eINSTANCE);

      // final HenshinResourceSet rset = new HenshinResourceSet();
      // EPackage.Registry.INSTANCE.put(myPackage.getNsURI(), myPackage);
      // rset.register
      secRes = secSet.getResource("quantum-operation.quope");
      // r.setURI(URI.createFileURI("src-library"));
      // model.getContents().addAll(r.getContents());

      // final Resource gm = new XMIResourceImpl(URI.createURI("problem/models/merged.xmi"));
      // gm.getContents().addAll(model.getContents());
      // gm.getContents().addAll(r.getContents());

      final EGraph eGraph = new EGraphImpl();

      eGraph.addGraph(root);
      eGraph.addGraph(secRes.getContents().get(0));
      return eGraph;
   }

   public static EGraph createEGraph(final Resource resource) {
      return new EGraphImpl(resource);
   }

   public static HenshinResourceSet createResourceSet() {
      return new HenshinResourceSet();
   }

   public static HenshinResourceSet createResourceSet(final String baseDir) {
      return new HenshinResourceSet(baseDir);
   }

   public static EObject getRoot(final EGraph graph) {
      final EObject obj = graph.getRoots().get(0);
      // EcoreUtil.resolveAll(obj);
      return obj;
   }

   // public static EGraph loadGraph(final HenshinResourceSet set, final String resourceUri) {
   // final Resource model = set.getResource(resourceUri);
   // final HenshinResourceSet secSet = new HenshinResourceSet("src-library");
   // secSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("quope", new XMIResourceFactoryImpl());
   //
   // // final HenshinResourceSet rset = new HenshinResourceSet();
   // // EPackage.Registry.INSTANCE.put(myPackage.getNsURI(), myPackage);
   // // rset.register
   // final Resource r = secSet.getResource("quantum-operation.quope");
   // // r.setURI(URI.createFileURI("src-library"));
   // // model.getContents().addAll(r.getContents());
   //
   // final Resource gm = new ResourceImpl(URI.createURI("problem/models/merged.xmi"));
   // gm.getContents().addAll(model.getContents());
   // gm.getContents().addAll(r.getContents());
   //
   //
   // return new EGraphImpl(gm);
   // }

   public static <T extends EObject> T getRoot(final EGraph graph, final Class<T> rootClass) {
      return CastUtil.asClass(getRoot(graph), rootClass);
   }

   public static EGraph loadGraph(final HenshinResourceSet set, final String resourceUri) {
      EPackage.Registry.INSTANCE.put(QuopePackage.eNS_URI, QuopePackage.eINSTANCE); // Replace MyPackage with the
                                                                                    // appropriate package
      EPackage.Registry.INSTANCE.put("../../src-library/quantum-operation.quope", QuopePackage.eINSTANCE);
      // set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("qucirc", new XtextResourceFactory(null));
      // final ResourceSet x1 = new XtextResourceSet();
      // final Resource rr1 = x1.getResource(URI.createFileURI(resourceUri), true);
      final Resource model = set.getResource(resourceUri);
      // EcoreUtil.resolveAll(model);
      final HenshinResourceSet secSet = new HenshinResourceSet("src-library");
      secSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("quope", new XMIResourceFactoryImpl());

      // EPackage.Registry.INSTANCE.put(QuopePackage.eNS_URI, QuopePackage.eINSTANCE);

      // final HenshinResourceSet rset = new HenshinResourceSet();
      // EPackage.Registry.INSTANCE.put(myPackage.getNsURI(), myPackage);
      // rset.register
      secRes = secSet.getResource("quantum-operation.quope");
      // r.setURI(URI.createFileURI("src-library"));
      // model.getContents().addAll(r.getContents());

      // final Resource gm = new XMIResourceImpl(URI.createURI("problem/models/merged.xmi"));
      // gm.getContents().addAll(model.getContents());
      // gm.getContents().addAll(r.getContents());

      final EGraph eGraph = new EGraphImpl();

      eGraph.addGraph(model.getContents().get(0));
      eGraph.addGraph(secRes.getContents().get(0));

      return eGraph;
   }

   public static EGraph loadGraph(final String resourceUri) {
      return loadGraph(createResourceSet(), resourceUri);
   }

   public static void saveGraph(final EGraph graph, final String targetResourceUri) {
      saveGraph(createResourceSet(), graph, targetResourceUri);
   }

   public static void saveGraph(final HenshinResourceSet set, final EGraph graph, final String targetResource) {
      //
      final Resource r = set.createResource(targetResource);
      // final Map<EObject, URI> secondModelElementsToProxies = new HashMap<>();
      // for(final EObject element : secRes.getContents()) {
      // final URI proxyUri = secRes.getURI().appendFragment(secRes.getURIFragment(element));
      // secondModelElementsToProxies.put(element, proxyUri);
      // }

      // for(final EObject element : graph.getRoots()) {
      // System.out.println(element.eClass().getName());
      // if(element.eClass().getName().equals("QuantumCircuit")) {
      // final EObject copiedElement = EcoreUtil.copy(element);
      // r.getContents().add(copiedElement);
      //
      // // Handle cross-references from the first model to the second model
      // for(final EReference reference : copiedElement.eClass().getEAllReferences()) {
      // if(!reference.isContainment() && reference.isChangeable()) {
      // final EObject referencedElement = (EObject) copiedElement.eGet(reference);
      // if(referencedElement != null && referencedElement.eResource() == secRes) {
      // // If the referenced element is from the second model, create an eProxyURI for it
      // final URI eProxyURI = EcoreUtil.getURI(referencedElement);
      // if(!secondModelElementsMap.containsKey(referencedElement)) {
      // secondModelElementsMap.put(referencedElement, eProxyURI);
      // }
      // // Set the eProxyURI as the reference value in the copied element for the first model
      // copiedElement.eSet(reference, secondModelElementsMap.get(referencedElement));
      // }
      // }
      // }
      // }
      // }
      // try {
      // r.save(null);
      // } catch(final IOException e) {
      // e.printStackTrace();
      // }
      //
      // if(targetResource != null) {
      // set.saveEObject(getRoot(graph), targetResource);

      r.getContents().addAll(graph.getRoots());
      try

      {
         r.save(Collections.emptyMap());
      } catch(final IOException e) {
         System.err.println("Error while saving the resource: " + e.getMessage());
      }
   }

   private MomotUtil() {
   }

   public void copyModelContents(final EObject sourceModel, final EObject targetModel) {
      final EcoreUtil.Copier copier = new EcoreUtil.Copier();
      final EObject copiedModel = copier.copy(sourceModel);
      copier.copyReferences();
      targetModel.eResource().getContents().add(copiedModel);
   }
}
