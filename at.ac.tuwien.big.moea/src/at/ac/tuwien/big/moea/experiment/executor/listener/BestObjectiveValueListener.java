package at.ac.tuwien.big.moea.experiment.executor.listener;

import at.ac.tuwien.big.moea.experiment.executor.SearchExecutor;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.moeaframework.core.Solution;
import org.moeaframework.util.progress.ProgressEvent;

public class BestObjectiveValueListener extends AbstractProgressListener {

   // private int nfeCount = 0;
   private final int objectiveIdx;
   private int nfeCount = 0;

   private CSVWriter writer;
   private FileWriter fWriter;

   public BestObjectiveValueListener(final int objectiveIdx) {
      try {
         Files.createDirectories(Paths.get("output", "objectives", "runs"));
      } catch(final IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      this.objectiveIdx = objectiveIdx;
      this.writer = null;
   }

   @Override
   public void update(final ProgressEvent event) {
      final int currentNFE = event.getCurrentNFE();
      // event.getCurrentAlgorithm() != null &&
      if(event.getCurrentAlgorithm() != null) {
         final String algName = ((SearchExecutor) event.getExecutor()).getName();
         final int noOfRun = event.getCurrentSeed();
         nfeCount++;

         if(this.writer == null) {
            try {
               fWriter = new FileWriter(Path.of("output", "objectives", "runs", algName + noOfRun + ".csv").toFile());
               writer = new CSVWriter(fWriter);
               final String[] out = { "Evaluation", "Generation", "Fitness" };
               writer.writeNext(out);

            } catch(final IOException e) {
               e.printStackTrace();
            }
         }

         double bestVal = Double.POSITIVE_INFINITY;
         for(final Solution s : event.getCurrentAlgorithm().getResult()) {
            final double v = s.getObjective(this.objectiveIdx);
            bestVal = v < bestVal ? v : bestVal;
         }

         final String[] out = { String.valueOf(currentNFE), String.valueOf(nfeCount), String.valueOf(bestVal * -1.0) };
         writer.writeNext(out);
         try {
            writer.flush();
         } catch(final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

      }
      if(event.isSeedFinished()) {
         nfeCount = 0;
         try {
            this.writer.close();
            this.fWriter.close();
            this.writer = null;
            this.fWriter = null;
         } catch(final IOException e) {
            e.printStackTrace();
         }
      }

   }

}
