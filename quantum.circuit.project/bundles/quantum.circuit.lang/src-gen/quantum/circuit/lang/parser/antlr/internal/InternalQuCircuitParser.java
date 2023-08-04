package quantum.circuit.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import quantum.circuit.lang.services.QuCircuitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuCircuitParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'QuantumCircuit'", "'{'", "'}'", "'QuantumRegister'", "'NumberOfQubits'", "'ClassicRegister'", "'NumberOfBits'", "'Layer'", "','", "'StatePreparation'", "'operation'", "'targetQubits'", "'['", "']'", "'ElementaryQuantumGate'", "'inverseForm'", "'('", "')'", "'controlQubits'", "'angleParameter'", "'AngleParameter'", "'theta'", "'phi'", "'lambda'", "'Measurement'", "'classicBits'", "'CompositeQuantumGate'", "'Loop'", "'incrementBlockTargetQubits'", "'incrementBlockControlQubits'", "'iterations'", "'incrementTargetQubits'", "'incrementControlQubits'", "'targetQubitsBlockSize'", "'controlQubitsBlockSize'", "'controlQubitsIterationType'", "'targetQubitsIterationType'", "'incrementBy'", "'operations'", "'fixedControlQubits'", "'fixedTargetQubits'", "'loop'", "'loopTargetQubits'", "'loopControlQubits'", "'-'", "'.'", "'E'", "'e'", "'NONE'", "'SHIFT'", "'CHANGE_BLOCK'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQuCircuitParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuCircuitParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuCircuitParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuCircuit.g"; }



     	private QuCircuitGrammarAccess grammarAccess;

        public InternalQuCircuitParser(TokenStream input, QuCircuitGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QuantumCircuit";
       	}

       	@Override
       	protected QuCircuitGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuantumCircuit"
    // InternalQuCircuit.g:65:1: entryRuleQuantumCircuit returns [EObject current=null] : iv_ruleQuantumCircuit= ruleQuantumCircuit EOF ;
    public final EObject entryRuleQuantumCircuit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantumCircuit = null;


        try {
            // InternalQuCircuit.g:65:55: (iv_ruleQuantumCircuit= ruleQuantumCircuit EOF )
            // InternalQuCircuit.g:66:2: iv_ruleQuantumCircuit= ruleQuantumCircuit EOF
            {
             newCompositeNode(grammarAccess.getQuantumCircuitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantumCircuit=ruleQuantumCircuit();

            state._fsp--;

             current =iv_ruleQuantumCircuit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantumCircuit"


    // $ANTLR start "ruleQuantumCircuit"
    // InternalQuCircuit.g:72:1: ruleQuantumCircuit returns [EObject current=null] : (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_quantumRegisters_3_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) )* ( (lv_classicRegisters_5_0= ruleClassicRegister ) )* ( (lv_layers_6_0= ruleLayer ) ) ( (lv_layers_7_0= ruleLayer ) )* otherlv_8= '}' ) ;
    public final EObject ruleQuantumCircuit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_quantumRegisters_3_0 = null;

        EObject lv_quantumRegisters_4_0 = null;

        EObject lv_classicRegisters_5_0 = null;

        EObject lv_layers_6_0 = null;

        EObject lv_layers_7_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:78:2: ( (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_quantumRegisters_3_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) )* ( (lv_classicRegisters_5_0= ruleClassicRegister ) )* ( (lv_layers_6_0= ruleLayer ) ) ( (lv_layers_7_0= ruleLayer ) )* otherlv_8= '}' ) )
            // InternalQuCircuit.g:79:2: (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_quantumRegisters_3_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) )* ( (lv_classicRegisters_5_0= ruleClassicRegister ) )* ( (lv_layers_6_0= ruleLayer ) ) ( (lv_layers_7_0= ruleLayer ) )* otherlv_8= '}' )
            {
            // InternalQuCircuit.g:79:2: (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_quantumRegisters_3_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) )* ( (lv_classicRegisters_5_0= ruleClassicRegister ) )* ( (lv_layers_6_0= ruleLayer ) ) ( (lv_layers_7_0= ruleLayer ) )* otherlv_8= '}' )
            // InternalQuCircuit.g:80:3: otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_quantumRegisters_3_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) )* ( (lv_classicRegisters_5_0= ruleClassicRegister ) )* ( (lv_layers_6_0= ruleLayer ) ) ( (lv_layers_7_0= ruleLayer ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantumCircuitAccess().getQuantumCircuitKeyword_0());
            		
            // InternalQuCircuit.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:85:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getQuantumCircuitAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:107:3: ( (lv_quantumRegisters_3_0= ruleQuantumRegister ) )
            // InternalQuCircuit.g:108:4: (lv_quantumRegisters_3_0= ruleQuantumRegister )
            {
            // InternalQuCircuit.g:108:4: (lv_quantumRegisters_3_0= ruleQuantumRegister )
            // InternalQuCircuit.g:109:5: lv_quantumRegisters_3_0= ruleQuantumRegister
            {

            					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_quantumRegisters_3_0=ruleQuantumRegister();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            					}
            					add(
            						current,
            						"quantumRegisters",
            						lv_quantumRegisters_3_0,
            						"quantum.circuit.lang.QuCircuit.QuantumRegister");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:126:3: ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuCircuit.g:127:4: (lv_quantumRegisters_4_0= ruleQuantumRegister )
            	    {
            	    // InternalQuCircuit.g:127:4: (lv_quantumRegisters_4_0= ruleQuantumRegister )
            	    // InternalQuCircuit.g:128:5: lv_quantumRegisters_4_0= ruleQuantumRegister
            	    {

            	    					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_quantumRegisters_4_0=ruleQuantumRegister();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"quantumRegisters",
            	    						lv_quantumRegisters_4_0,
            	    						"quantum.circuit.lang.QuCircuit.QuantumRegister");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalQuCircuit.g:145:3: ( (lv_classicRegisters_5_0= ruleClassicRegister ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQuCircuit.g:146:4: (lv_classicRegisters_5_0= ruleClassicRegister )
            	    {
            	    // InternalQuCircuit.g:146:4: (lv_classicRegisters_5_0= ruleClassicRegister )
            	    // InternalQuCircuit.g:147:5: lv_classicRegisters_5_0= ruleClassicRegister
            	    {

            	    					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getClassicRegistersClassicRegisterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_classicRegisters_5_0=ruleClassicRegister();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classicRegisters",
            	    						lv_classicRegisters_5_0,
            	    						"quantum.circuit.lang.QuCircuit.ClassicRegister");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalQuCircuit.g:164:3: ( (lv_layers_6_0= ruleLayer ) )
            // InternalQuCircuit.g:165:4: (lv_layers_6_0= ruleLayer )
            {
            // InternalQuCircuit.g:165:4: (lv_layers_6_0= ruleLayer )
            // InternalQuCircuit.g:166:5: lv_layers_6_0= ruleLayer
            {

            					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_layers_6_0=ruleLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            					}
            					add(
            						current,
            						"layers",
            						lv_layers_6_0,
            						"quantum.circuit.lang.QuCircuit.Layer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:183:3: ( (lv_layers_7_0= ruleLayer ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQuCircuit.g:184:4: (lv_layers_7_0= ruleLayer )
            	    {
            	    // InternalQuCircuit.g:184:4: (lv_layers_7_0= ruleLayer )
            	    // InternalQuCircuit.g:185:5: lv_layers_7_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_layers_7_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layers",
            	    						lv_layers_7_0,
            	    						"quantum.circuit.lang.QuCircuit.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getQuantumCircuitAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantumCircuit"


    // $ANTLR start "entryRuleQuantumRegister"
    // InternalQuCircuit.g:210:1: entryRuleQuantumRegister returns [EObject current=null] : iv_ruleQuantumRegister= ruleQuantumRegister EOF ;
    public final EObject entryRuleQuantumRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantumRegister = null;


        try {
            // InternalQuCircuit.g:210:56: (iv_ruleQuantumRegister= ruleQuantumRegister EOF )
            // InternalQuCircuit.g:211:2: iv_ruleQuantumRegister= ruleQuantumRegister EOF
            {
             newCompositeNode(grammarAccess.getQuantumRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantumRegister=ruleQuantumRegister();

            state._fsp--;

             current =iv_ruleQuantumRegister; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantumRegister"


    // $ANTLR start "ruleQuantumRegister"
    // InternalQuCircuit.g:217:1: ruleQuantumRegister returns [EObject current=null] : ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleQuantumRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_numberOfQubits_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:223:2: ( ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) )
            // InternalQuCircuit.g:224:2: ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            {
            // InternalQuCircuit.g:224:2: ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            // InternalQuCircuit.g:225:3: () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}'
            {
            // InternalQuCircuit.g:225:3: ()
            // InternalQuCircuit.g:226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantumRegisterAccess().getQuantumRegisterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuantumRegisterAccess().getQuantumRegisterKeyword_1());
            		
            // InternalQuCircuit.g:236:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQuCircuit.g:237:4: (lv_name_2_0= ruleEString )
            {
            // InternalQuCircuit.g:237:4: (lv_name_2_0= ruleEString )
            // InternalQuCircuit.g:238:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantumRegisterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantumRegisterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantumRegisterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:259:3: (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuCircuit.g:260:4: otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsKeyword_4_0());
                    			
                    // InternalQuCircuit.g:264:4: ( (lv_numberOfQubits_5_0= RULE_INT ) )
                    // InternalQuCircuit.g:265:5: (lv_numberOfQubits_5_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:265:5: (lv_numberOfQubits_5_0= RULE_INT )
                    // InternalQuCircuit.g:266:6: lv_numberOfQubits_5_0= RULE_INT
                    {
                    lv_numberOfQubits_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_numberOfQubits_5_0, grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantumRegisterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"numberOfQubits",
                    							lv_numberOfQubits_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQuantumRegisterAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantumRegister"


    // $ANTLR start "entryRuleClassicRegister"
    // InternalQuCircuit.g:291:1: entryRuleClassicRegister returns [EObject current=null] : iv_ruleClassicRegister= ruleClassicRegister EOF ;
    public final EObject entryRuleClassicRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassicRegister = null;


        try {
            // InternalQuCircuit.g:291:56: (iv_ruleClassicRegister= ruleClassicRegister EOF )
            // InternalQuCircuit.g:292:2: iv_ruleClassicRegister= ruleClassicRegister EOF
            {
             newCompositeNode(grammarAccess.getClassicRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassicRegister=ruleClassicRegister();

            state._fsp--;

             current =iv_ruleClassicRegister; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassicRegister"


    // $ANTLR start "ruleClassicRegister"
    // InternalQuCircuit.g:298:1: ruleClassicRegister returns [EObject current=null] : ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleClassicRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_numberOfBits_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:304:2: ( ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) )
            // InternalQuCircuit.g:305:2: ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            {
            // InternalQuCircuit.g:305:2: ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            // InternalQuCircuit.g:306:3: () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}'
            {
            // InternalQuCircuit.g:306:3: ()
            // InternalQuCircuit.g:307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassicRegisterAccess().getClassicRegisterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassicRegisterAccess().getClassicRegisterKeyword_1());
            		
            // InternalQuCircuit.g:317:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQuCircuit.g:318:4: (lv_name_2_0= ruleEString )
            {
            // InternalQuCircuit.g:318:4: (lv_name_2_0= ruleEString )
            // InternalQuCircuit.g:319:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassicRegisterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassicRegisterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getClassicRegisterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:340:3: (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQuCircuit.g:341:4: otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassicRegisterAccess().getNumberOfBitsKeyword_4_0());
                    			
                    // InternalQuCircuit.g:345:4: ( (lv_numberOfBits_5_0= RULE_INT ) )
                    // InternalQuCircuit.g:346:5: (lv_numberOfBits_5_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:346:5: (lv_numberOfBits_5_0= RULE_INT )
                    // InternalQuCircuit.g:347:6: lv_numberOfBits_5_0= RULE_INT
                    {
                    lv_numberOfBits_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_numberOfBits_5_0, grammarAccess.getClassicRegisterAccess().getNumberOfBitsINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassicRegisterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"numberOfBits",
                    							lv_numberOfBits_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClassicRegisterAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassicRegister"


    // $ANTLR start "entryRuleLayer"
    // InternalQuCircuit.g:372:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalQuCircuit.g:372:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalQuCircuit.g:373:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalQuCircuit.g:379:1: ruleLayer returns [EObject current=null] : ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_quantumOperations_4_0 = null;

        EObject lv_quantumOperations_6_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:385:2: ( ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' ) )
            // InternalQuCircuit.g:386:2: ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' )
            {
            // InternalQuCircuit.g:386:2: ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' )
            // InternalQuCircuit.g:387:3: () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}'
            {
            // InternalQuCircuit.g:387:3: ()
            // InternalQuCircuit.g:388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
            		
            // InternalQuCircuit.g:398:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQuCircuit.g:399:4: (lv_name_2_0= ruleEString )
            {
            // InternalQuCircuit.g:399:4: (lv_name_2_0= ruleEString )
            // InternalQuCircuit.g:400:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:421:3: ( (lv_quantumOperations_4_0= ruleQuantumOperation ) )
            // InternalQuCircuit.g:422:4: (lv_quantumOperations_4_0= ruleQuantumOperation )
            {
            // InternalQuCircuit.g:422:4: (lv_quantumOperations_4_0= ruleQuantumOperation )
            // InternalQuCircuit.g:423:5: lv_quantumOperations_4_0= ruleQuantumOperation
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_quantumOperations_4_0=ruleQuantumOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"quantumOperations",
            						lv_quantumOperations_4_0,
            						"quantum.circuit.lang.QuCircuit.QuantumOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:440:3: (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQuCircuit.g:441:4: otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalQuCircuit.g:445:4: ( (lv_quantumOperations_6_0= ruleQuantumOperation ) )
            	    // InternalQuCircuit.g:446:5: (lv_quantumOperations_6_0= ruleQuantumOperation )
            	    {
            	    // InternalQuCircuit.g:446:5: (lv_quantumOperations_6_0= ruleQuantumOperation )
            	    // InternalQuCircuit.g:447:6: lv_quantumOperations_6_0= ruleQuantumOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_quantumOperations_6_0=ruleQuantumOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLayerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"quantumOperations",
            	    							lv_quantumOperations_6_0,
            	    							"quantum.circuit.lang.QuCircuit.QuantumOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleQuantumOperation"
    // InternalQuCircuit.g:473:1: entryRuleQuantumOperation returns [EObject current=null] : iv_ruleQuantumOperation= ruleQuantumOperation EOF ;
    public final EObject entryRuleQuantumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantumOperation = null;


        try {
            // InternalQuCircuit.g:473:57: (iv_ruleQuantumOperation= ruleQuantumOperation EOF )
            // InternalQuCircuit.g:474:2: iv_ruleQuantumOperation= ruleQuantumOperation EOF
            {
             newCompositeNode(grammarAccess.getQuantumOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantumOperation=ruleQuantumOperation();

            state._fsp--;

             current =iv_ruleQuantumOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantumOperation"


    // $ANTLR start "ruleQuantumOperation"
    // InternalQuCircuit.g:480:1: ruleQuantumOperation returns [EObject current=null] : (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop ) ;
    public final EObject ruleQuantumOperation() throws RecognitionException {
        EObject current = null;

        EObject this_StatePreparation_0 = null;

        EObject this_ElementaryQuantumGate_1 = null;

        EObject this_Measurement_2 = null;

        EObject this_CompositeQuantumGate_3 = null;

        EObject this_Loop_4 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:486:2: ( (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop ) )
            // InternalQuCircuit.g:487:2: (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop )
            {
            // InternalQuCircuit.g:487:2: (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 35:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            case 38:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQuCircuit.g:488:3: this_StatePreparation_0= ruleStatePreparation
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getStatePreparationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StatePreparation_0=ruleStatePreparation();

                    state._fsp--;


                    			current = this_StatePreparation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:497:3: this_ElementaryQuantumGate_1= ruleElementaryQuantumGate
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getElementaryQuantumGateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementaryQuantumGate_1=ruleElementaryQuantumGate();

                    state._fsp--;


                    			current = this_ElementaryQuantumGate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:506:3: this_Measurement_2= ruleMeasurement
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getMeasurementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Measurement_2=ruleMeasurement();

                    state._fsp--;


                    			current = this_Measurement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQuCircuit.g:515:3: this_CompositeQuantumGate_3= ruleCompositeQuantumGate
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getCompositeQuantumGateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeQuantumGate_3=ruleCompositeQuantumGate();

                    state._fsp--;


                    			current = this_CompositeQuantumGate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQuCircuit.g:524:3: this_Loop_4= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getLoopParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_4=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantumOperation"


    // $ANTLR start "entryRuleStatePreparation"
    // InternalQuCircuit.g:536:1: entryRuleStatePreparation returns [EObject current=null] : iv_ruleStatePreparation= ruleStatePreparation EOF ;
    public final EObject entryRuleStatePreparation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatePreparation = null;


        try {
            // InternalQuCircuit.g:536:57: (iv_ruleStatePreparation= ruleStatePreparation EOF )
            // InternalQuCircuit.g:537:2: iv_ruleStatePreparation= ruleStatePreparation EOF
            {
             newCompositeNode(grammarAccess.getStatePreparationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatePreparation=ruleStatePreparation();

            state._fsp--;

             current =iv_ruleStatePreparation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatePreparation"


    // $ANTLR start "ruleStatePreparation"
    // InternalQuCircuit.g:543:1: ruleStatePreparation returns [EObject current=null] : (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' ) ;
    public final EObject ruleStatePreparation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_4_0 = null;

        EObject lv_operations_6_0 = null;

        EObject lv_targetQubits_9_0 = null;

        EObject lv_targetQubits_11_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:549:2: ( (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' ) )
            // InternalQuCircuit.g:550:2: (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' )
            {
            // InternalQuCircuit.g:550:2: (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' )
            // InternalQuCircuit.g:551:3: otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStatePreparationAccess().getStatePreparationKeyword_0());
            		
            // InternalQuCircuit.g:555:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:556:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:556:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:557:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStatePreparationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStatePreparationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStatePreparationAccess().getOperationKeyword_3());
            		
            // InternalQuCircuit.g:582:3: ( (lv_operations_4_0= ruleOperation ) )
            // InternalQuCircuit.g:583:4: (lv_operations_4_0= ruleOperation )
            {
            // InternalQuCircuit.g:583:4: (lv_operations_4_0= ruleOperation )
            // InternalQuCircuit.g:584:5: lv_operations_4_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_operations_4_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_4_0,
            						"quantum.circuit.lang.QuCircuit.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:601:3: (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQuCircuit.g:602:4: otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStatePreparationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalQuCircuit.g:606:4: ( (lv_operations_6_0= ruleOperation ) )
            	    // InternalQuCircuit.g:607:5: (lv_operations_6_0= ruleOperation )
            	    {
            	    // InternalQuCircuit.g:607:5: (lv_operations_6_0= ruleOperation )
            	    // InternalQuCircuit.g:608:6: lv_operations_6_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_operations_6_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operations",
            	    							lv_operations_6_0,
            	    							"quantum.circuit.lang.QuCircuit.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getStatePreparationAccess().getTargetQubitsKeyword_6());
            		
            otherlv_8=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getStatePreparationAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalQuCircuit.g:634:3: ( (lv_targetQubits_9_0= ruleSelector ) )
            // InternalQuCircuit.g:635:4: (lv_targetQubits_9_0= ruleSelector )
            {
            // InternalQuCircuit.g:635:4: (lv_targetQubits_9_0= ruleSelector )
            // InternalQuCircuit.g:636:5: lv_targetQubits_9_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_targetQubits_9_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_9_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:653:3: (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQuCircuit.g:654:4: otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_17); 

            	    				newLeafNode(otherlv_10, grammarAccess.getStatePreparationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalQuCircuit.g:658:4: ( (lv_targetQubits_11_0= ruleSelector ) )
            	    // InternalQuCircuit.g:659:5: (lv_targetQubits_11_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:659:5: (lv_targetQubits_11_0= ruleSelector )
            	    // InternalQuCircuit.g:660:6: lv_targetQubits_11_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_targetQubits_11_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_11_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_12=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getStatePreparationAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getStatePreparationAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatePreparation"


    // $ANTLR start "entryRuleElementaryQuantumGate"
    // InternalQuCircuit.g:690:1: entryRuleElementaryQuantumGate returns [EObject current=null] : iv_ruleElementaryQuantumGate= ruleElementaryQuantumGate EOF ;
    public final EObject entryRuleElementaryQuantumGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryQuantumGate = null;


        try {
            // InternalQuCircuit.g:690:62: (iv_ruleElementaryQuantumGate= ruleElementaryQuantumGate EOF )
            // InternalQuCircuit.g:691:2: iv_ruleElementaryQuantumGate= ruleElementaryQuantumGate EOF
            {
             newCompositeNode(grammarAccess.getElementaryQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementaryQuantumGate=ruleElementaryQuantumGate();

            state._fsp--;

             current =iv_ruleElementaryQuantumGate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementaryQuantumGate"


    // $ANTLR start "ruleElementaryQuantumGate"
    // InternalQuCircuit.g:697:1: ruleElementaryQuantumGate returns [EObject current=null] : (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleElementaryQuantumGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inverseForm_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operations_5_0 = null;

        EObject lv_targetQubits_9_0 = null;

        EObject lv_targetQubits_13_0 = null;

        EObject lv_controlQubits_18_0 = null;

        EObject lv_controlQubits_20_0 = null;

        EObject lv_angleParameter_23_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:703:2: ( (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' ) )
            // InternalQuCircuit.g:704:2: (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' )
            {
            // InternalQuCircuit.g:704:2: (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' )
            // InternalQuCircuit.g:705:3: otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getElementaryQuantumGateAccess().getElementaryQuantumGateKeyword_0());
            		
            // InternalQuCircuit.g:709:3: ( (lv_inverseForm_1_0= 'inverseForm' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQuCircuit.g:710:4: (lv_inverseForm_1_0= 'inverseForm' )
                    {
                    // InternalQuCircuit.g:710:4: (lv_inverseForm_1_0= 'inverseForm' )
                    // InternalQuCircuit.g:711:5: lv_inverseForm_1_0= 'inverseForm'
                    {
                    lv_inverseForm_1_0=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(lv_inverseForm_1_0, grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElementaryQuantumGateRule());
                    					}
                    					setWithLastConsumed(current, "inverseForm", lv_inverseForm_1_0 != null, "inverseForm");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:723:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQuCircuit.g:724:4: (lv_name_2_0= ruleEString )
            {
            // InternalQuCircuit.g:724:4: (lv_name_2_0= ruleEString )
            // InternalQuCircuit.g:725:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getElementaryQuantumGateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:746:3: (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQuCircuit.g:747:4: otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getElementaryQuantumGateAccess().getOperationKeyword_4_0());
                    			
                    // InternalQuCircuit.g:751:4: ( (lv_operations_5_0= ruleOperation ) )
                    // InternalQuCircuit.g:752:5: (lv_operations_5_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:752:5: (lv_operations_5_0= ruleOperation )
                    // InternalQuCircuit.g:753:6: lv_operations_5_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_operations_5_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_5_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsKeyword_5());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_7());
            		
            // InternalQuCircuit.g:783:3: ( (lv_targetQubits_9_0= ruleSelector ) )
            // InternalQuCircuit.g:784:4: (lv_targetQubits_9_0= ruleSelector )
            {
            // InternalQuCircuit.g:784:4: (lv_targetQubits_9_0= ruleSelector )
            // InternalQuCircuit.g:785:5: lv_targetQubits_9_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_23);
            lv_targetQubits_9_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_9_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_9());
            		
            // InternalQuCircuit.g:806:3: (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQuCircuit.g:807:4: otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')'
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_22); 

            	    				newLeafNode(otherlv_11, grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_10_0());
            	    			
            	    otherlv_12=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_12, grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_10_1());
            	    			
            	    // InternalQuCircuit.g:815:4: ( (lv_targetQubits_13_0= ruleSelector ) )
            	    // InternalQuCircuit.g:816:5: (lv_targetQubits_13_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:816:5: (lv_targetQubits_13_0= ruleSelector )
            	    // InternalQuCircuit.g:817:6: lv_targetQubits_13_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_targetQubits_13_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_13_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,28,FOLLOW_18); 

            	    				newLeafNode(otherlv_14, grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_10_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_15=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_15, grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_11());
            		
            // InternalQuCircuit.g:843:3: (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQuCircuit.g:844:4: otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']'
            	    {
            	    otherlv_16=(Token)match(input,29,FOLLOW_16); 

            	    				newLeafNode(otherlv_16, grammarAccess.getElementaryQuantumGateAccess().getControlQubitsKeyword_12_0());
            	    			
            	    otherlv_17=(Token)match(input,23,FOLLOW_17); 

            	    				newLeafNode(otherlv_17, grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_12_1());
            	    			
            	    // InternalQuCircuit.g:852:4: ( (lv_controlQubits_18_0= ruleSelector ) )
            	    // InternalQuCircuit.g:853:5: (lv_controlQubits_18_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:853:5: (lv_controlQubits_18_0= ruleSelector )
            	    // InternalQuCircuit.g:854:6: lv_controlQubits_18_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_controlQubits_18_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"controlQubits",
            	    							lv_controlQubits_18_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQuCircuit.g:871:4: (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==19) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalQuCircuit.g:872:5: otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,19,FOLLOW_17); 

            	    	    					newLeafNode(otherlv_19, grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_12_3_0());
            	    	    				
            	    	    // InternalQuCircuit.g:876:5: ( (lv_controlQubits_20_0= ruleSelector ) )
            	    	    // InternalQuCircuit.g:877:6: (lv_controlQubits_20_0= ruleSelector )
            	    	    {
            	    	    // InternalQuCircuit.g:877:6: (lv_controlQubits_20_0= ruleSelector )
            	    	    // InternalQuCircuit.g:878:7: lv_controlQubits_20_0= ruleSelector
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_18);
            	    	    lv_controlQubits_20_0=ruleSelector();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"controlQubits",
            	    	    								lv_controlQubits_20_0,
            	    	    								"quantum.circuit.lang.QuCircuit.Selector");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,24,FOLLOW_24); 

            	    				newLeafNode(otherlv_21, grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_12_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalQuCircuit.g:901:3: (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQuCircuit.g:902:4: otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) )
                    {
                    otherlv_22=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getElementaryQuantumGateAccess().getAngleParameterKeyword_13_0());
                    			
                    // InternalQuCircuit.g:906:4: ( (lv_angleParameter_23_0= ruleAngleParameter ) )
                    // InternalQuCircuit.g:907:5: (lv_angleParameter_23_0= ruleAngleParameter )
                    {
                    // InternalQuCircuit.g:907:5: (lv_angleParameter_23_0= ruleAngleParameter )
                    // InternalQuCircuit.g:908:6: lv_angleParameter_23_0= ruleAngleParameter
                    {

                    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAngleParameterParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_angleParameter_23_0=ruleAngleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
                    						}
                    						set(
                    							current,
                    							"angleParameter",
                    							lv_angleParameter_23_0,
                    							"quantum.circuit.lang.QuCircuit.AngleParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getElementaryQuantumGateAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementaryQuantumGate"


    // $ANTLR start "entryRuleAngleParameter"
    // InternalQuCircuit.g:934:1: entryRuleAngleParameter returns [EObject current=null] : iv_ruleAngleParameter= ruleAngleParameter EOF ;
    public final EObject entryRuleAngleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngleParameter = null;


        try {
            // InternalQuCircuit.g:934:55: (iv_ruleAngleParameter= ruleAngleParameter EOF )
            // InternalQuCircuit.g:935:2: iv_ruleAngleParameter= ruleAngleParameter EOF
            {
             newCompositeNode(grammarAccess.getAngleParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngleParameter=ruleAngleParameter();

            state._fsp--;

             current =iv_ruleAngleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAngleParameter"


    // $ANTLR start "ruleAngleParameter"
    // InternalQuCircuit.g:941:1: ruleAngleParameter returns [EObject current=null] : ( () otherlv_1= 'AngleParameter' otherlv_2= '{' (otherlv_3= 'theta' ( (lv_theta_4_0= ruleEDoubleObject ) ) )? (otherlv_5= 'phi' ( (lv_phi_6_0= ruleEDoubleObject ) ) )? (otherlv_7= 'lambda' ( (lv_lambda_8_0= ruleEDoubleObject ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAngleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_theta_4_0 = null;

        AntlrDatatypeRuleToken lv_phi_6_0 = null;

        AntlrDatatypeRuleToken lv_lambda_8_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:947:2: ( ( () otherlv_1= 'AngleParameter' otherlv_2= '{' (otherlv_3= 'theta' ( (lv_theta_4_0= ruleEDoubleObject ) ) )? (otherlv_5= 'phi' ( (lv_phi_6_0= ruleEDoubleObject ) ) )? (otherlv_7= 'lambda' ( (lv_lambda_8_0= ruleEDoubleObject ) ) )? otherlv_9= '}' ) )
            // InternalQuCircuit.g:948:2: ( () otherlv_1= 'AngleParameter' otherlv_2= '{' (otherlv_3= 'theta' ( (lv_theta_4_0= ruleEDoubleObject ) ) )? (otherlv_5= 'phi' ( (lv_phi_6_0= ruleEDoubleObject ) ) )? (otherlv_7= 'lambda' ( (lv_lambda_8_0= ruleEDoubleObject ) ) )? otherlv_9= '}' )
            {
            // InternalQuCircuit.g:948:2: ( () otherlv_1= 'AngleParameter' otherlv_2= '{' (otherlv_3= 'theta' ( (lv_theta_4_0= ruleEDoubleObject ) ) )? (otherlv_5= 'phi' ( (lv_phi_6_0= ruleEDoubleObject ) ) )? (otherlv_7= 'lambda' ( (lv_lambda_8_0= ruleEDoubleObject ) ) )? otherlv_9= '}' )
            // InternalQuCircuit.g:949:3: () otherlv_1= 'AngleParameter' otherlv_2= '{' (otherlv_3= 'theta' ( (lv_theta_4_0= ruleEDoubleObject ) ) )? (otherlv_5= 'phi' ( (lv_phi_6_0= ruleEDoubleObject ) ) )? (otherlv_7= 'lambda' ( (lv_lambda_8_0= ruleEDoubleObject ) ) )? otherlv_9= '}'
            {
            // InternalQuCircuit.g:949:3: ()
            // InternalQuCircuit.g:950:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAngleParameterAccess().getAngleParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAngleParameterAccess().getAngleParameterKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getAngleParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:964:3: (otherlv_3= 'theta' ( (lv_theta_4_0= ruleEDoubleObject ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQuCircuit.g:965:4: otherlv_3= 'theta' ( (lv_theta_4_0= ruleEDoubleObject ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getAngleParameterAccess().getThetaKeyword_3_0());
                    			
                    // InternalQuCircuit.g:969:4: ( (lv_theta_4_0= ruleEDoubleObject ) )
                    // InternalQuCircuit.g:970:5: (lv_theta_4_0= ruleEDoubleObject )
                    {
                    // InternalQuCircuit.g:970:5: (lv_theta_4_0= ruleEDoubleObject )
                    // InternalQuCircuit.g:971:6: lv_theta_4_0= ruleEDoubleObject
                    {

                    						newCompositeNode(grammarAccess.getAngleParameterAccess().getThetaEDoubleObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_theta_4_0=ruleEDoubleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAngleParameterRule());
                    						}
                    						set(
                    							current,
                    							"theta",
                    							lv_theta_4_0,
                    							"quantum.circuit.lang.QuCircuit.EDoubleObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:989:3: (otherlv_5= 'phi' ( (lv_phi_6_0= ruleEDoubleObject ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQuCircuit.g:990:4: otherlv_5= 'phi' ( (lv_phi_6_0= ruleEDoubleObject ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getAngleParameterAccess().getPhiKeyword_4_0());
                    			
                    // InternalQuCircuit.g:994:4: ( (lv_phi_6_0= ruleEDoubleObject ) )
                    // InternalQuCircuit.g:995:5: (lv_phi_6_0= ruleEDoubleObject )
                    {
                    // InternalQuCircuit.g:995:5: (lv_phi_6_0= ruleEDoubleObject )
                    // InternalQuCircuit.g:996:6: lv_phi_6_0= ruleEDoubleObject
                    {

                    						newCompositeNode(grammarAccess.getAngleParameterAccess().getPhiEDoubleObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_phi_6_0=ruleEDoubleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAngleParameterRule());
                    						}
                    						set(
                    							current,
                    							"phi",
                    							lv_phi_6_0,
                    							"quantum.circuit.lang.QuCircuit.EDoubleObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1014:3: (otherlv_7= 'lambda' ( (lv_lambda_8_0= ruleEDoubleObject ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQuCircuit.g:1015:4: otherlv_7= 'lambda' ( (lv_lambda_8_0= ruleEDoubleObject ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getAngleParameterAccess().getLambdaKeyword_5_0());
                    			
                    // InternalQuCircuit.g:1019:4: ( (lv_lambda_8_0= ruleEDoubleObject ) )
                    // InternalQuCircuit.g:1020:5: (lv_lambda_8_0= ruleEDoubleObject )
                    {
                    // InternalQuCircuit.g:1020:5: (lv_lambda_8_0= ruleEDoubleObject )
                    // InternalQuCircuit.g:1021:6: lv_lambda_8_0= ruleEDoubleObject
                    {

                    						newCompositeNode(grammarAccess.getAngleParameterAccess().getLambdaEDoubleObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_lambda_8_0=ruleEDoubleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAngleParameterRule());
                    						}
                    						set(
                    							current,
                    							"lambda",
                    							lv_lambda_8_0,
                    							"quantum.circuit.lang.QuCircuit.EDoubleObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAngleParameterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAngleParameter"


    // $ANTLR start "entryRuleMeasurement"
    // InternalQuCircuit.g:1047:1: entryRuleMeasurement returns [EObject current=null] : iv_ruleMeasurement= ruleMeasurement EOF ;
    public final EObject entryRuleMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurement = null;


        try {
            // InternalQuCircuit.g:1047:52: (iv_ruleMeasurement= ruleMeasurement EOF )
            // InternalQuCircuit.g:1048:2: iv_ruleMeasurement= ruleMeasurement EOF
            {
             newCompositeNode(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurement=ruleMeasurement();

            state._fsp--;

             current =iv_ruleMeasurement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // InternalQuCircuit.g:1054:1: ruleMeasurement returns [EObject current=null] : (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' ) ;
    public final EObject ruleMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_4_0 = null;

        EObject lv_targetQubits_8_0 = null;

        EObject lv_targetQubits_12_0 = null;

        EObject lv_classicBits_18_0 = null;

        EObject lv_classicBits_22_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:1060:2: ( (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' ) )
            // InternalQuCircuit.g:1061:2: (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' )
            {
            // InternalQuCircuit.g:1061:2: (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' )
            // InternalQuCircuit.g:1062:3: otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasurementAccess().getMeasurementKeyword_0());
            		
            // InternalQuCircuit.g:1066:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:1067:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:1067:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:1068:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasurementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasurementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasurementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:1089:3: (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQuCircuit.g:1090:4: otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasurementAccess().getOperationKeyword_3_0());
                    			
                    // InternalQuCircuit.g:1094:4: ( (lv_operations_4_0= ruleOperation ) )
                    // InternalQuCircuit.g:1095:5: (lv_operations_4_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:1095:5: (lv_operations_4_0= ruleOperation )
                    // InternalQuCircuit.g:1096:6: lv_operations_4_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getMeasurementAccess().getOperationsOperationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_operations_4_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_4_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasurementAccess().getTargetQubitsKeyword_4());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_6());
            		
            // InternalQuCircuit.g:1126:3: ( (lv_targetQubits_8_0= ruleSelector ) )
            // InternalQuCircuit.g:1127:4: (lv_targetQubits_8_0= ruleSelector )
            {
            // InternalQuCircuit.g:1127:4: (lv_targetQubits_8_0= ruleSelector )
            // InternalQuCircuit.g:1128:5: lv_targetQubits_8_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_targetQubits_8_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasurementRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_8_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_8());
            		
            // InternalQuCircuit.g:1149:3: (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQuCircuit.g:1150:4: otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')'
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_22); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasurementAccess().getCommaKeyword_9_0());
            	    			
            	    otherlv_11=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_11, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_9_1());
            	    			
            	    // InternalQuCircuit.g:1158:4: ( (lv_targetQubits_12_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1159:5: (lv_targetQubits_12_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1159:5: (lv_targetQubits_12_0= ruleSelector )
            	    // InternalQuCircuit.g:1160:6: lv_targetQubits_12_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_targetQubits_12_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMeasurementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_12_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_13=(Token)match(input,28,FOLLOW_18); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_9_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_14=(Token)match(input,24,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_15=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getMeasurementAccess().getClassicBitsKeyword_11());
            		
            otherlv_16=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_16, grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_12());
            		
            otherlv_17=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_17, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_13());
            		
            // InternalQuCircuit.g:1198:3: ( (lv_classicBits_18_0= ruleSelector ) )
            // InternalQuCircuit.g:1199:4: (lv_classicBits_18_0= ruleSelector )
            {
            // InternalQuCircuit.g:1199:4: (lv_classicBits_18_0= ruleSelector )
            // InternalQuCircuit.g:1200:5: lv_classicBits_18_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_23);
            lv_classicBits_18_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasurementRule());
            					}
            					add(
            						current,
            						"classicBits",
            						lv_classicBits_18_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_19, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_15());
            		
            // InternalQuCircuit.g:1221:3: (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQuCircuit.g:1222:4: otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')'
            	    {
            	    otherlv_20=(Token)match(input,19,FOLLOW_22); 

            	    				newLeafNode(otherlv_20, grammarAccess.getMeasurementAccess().getCommaKeyword_16_0());
            	    			
            	    otherlv_21=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_21, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_16_1());
            	    			
            	    // InternalQuCircuit.g:1230:4: ( (lv_classicBits_22_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1231:5: (lv_classicBits_22_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1231:5: (lv_classicBits_22_0= ruleSelector )
            	    // InternalQuCircuit.g:1232:6: lv_classicBits_22_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_16_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_classicBits_22_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMeasurementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classicBits",
            	    							lv_classicBits_22_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_23=(Token)match(input,28,FOLLOW_18); 

            	    				newLeafNode(otherlv_23, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_16_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_24=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_24, grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_17());
            		
            otherlv_25=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getMeasurementAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleCompositeQuantumGate"
    // InternalQuCircuit.g:1266:1: entryRuleCompositeQuantumGate returns [EObject current=null] : iv_ruleCompositeQuantumGate= ruleCompositeQuantumGate EOF ;
    public final EObject entryRuleCompositeQuantumGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeQuantumGate = null;


        try {
            // InternalQuCircuit.g:1266:61: (iv_ruleCompositeQuantumGate= ruleCompositeQuantumGate EOF )
            // InternalQuCircuit.g:1267:2: iv_ruleCompositeQuantumGate= ruleCompositeQuantumGate EOF
            {
             newCompositeNode(grammarAccess.getCompositeQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeQuantumGate=ruleCompositeQuantumGate();

            state._fsp--;

             current =iv_ruleCompositeQuantumGate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeQuantumGate"


    // $ANTLR start "ruleCompositeQuantumGate"
    // InternalQuCircuit.g:1273:1: ruleCompositeQuantumGate returns [EObject current=null] : (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) ;
    public final EObject ruleCompositeQuantumGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_inverseForm_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_5_0 = null;

        EObject lv_targetQubits_9_0 = null;

        EObject lv_targetQubits_13_0 = null;

        EObject lv_controlQubits_18_0 = null;

        EObject lv_controlQubits_20_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:1279:2: ( (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) )
            // InternalQuCircuit.g:1280:2: (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            {
            // InternalQuCircuit.g:1280:2: (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            // InternalQuCircuit.g:1281:3: otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeQuantumGateAccess().getCompositeQuantumGateKeyword_0());
            		
            // InternalQuCircuit.g:1285:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:1286:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:1286:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:1287:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeQuantumGateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:1308:3: ( (lv_inverseForm_3_0= 'inverseForm' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuCircuit.g:1309:4: (lv_inverseForm_3_0= 'inverseForm' )
                    {
                    // InternalQuCircuit.g:1309:4: (lv_inverseForm_3_0= 'inverseForm' )
                    // InternalQuCircuit.g:1310:5: lv_inverseForm_3_0= 'inverseForm'
                    {
                    lv_inverseForm_3_0=(Token)match(input,26,FOLLOW_20); 

                    					newLeafNode(lv_inverseForm_3_0, grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompositeQuantumGateRule());
                    					}
                    					setWithLastConsumed(current, "inverseForm", lv_inverseForm_3_0 != null, "inverseForm");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1322:3: (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQuCircuit.g:1323:4: otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeQuantumGateAccess().getOperationKeyword_4_0());
                    			
                    // InternalQuCircuit.g:1327:4: ( (lv_operations_5_0= ruleOperation ) )
                    // InternalQuCircuit.g:1328:5: (lv_operations_5_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:1328:5: (lv_operations_5_0= ruleOperation )
                    // InternalQuCircuit.g:1329:6: lv_operations_5_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_operations_5_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_5_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsKeyword_5());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_7());
            		
            // InternalQuCircuit.g:1359:3: ( (lv_targetQubits_9_0= ruleSelector ) )
            // InternalQuCircuit.g:1360:4: (lv_targetQubits_9_0= ruleSelector )
            {
            // InternalQuCircuit.g:1360:4: (lv_targetQubits_9_0= ruleSelector )
            // InternalQuCircuit.g:1361:5: lv_targetQubits_9_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_23);
            lv_targetQubits_9_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_9_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_9());
            		
            // InternalQuCircuit.g:1382:3: (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQuCircuit.g:1383:4: otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')'
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_22); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_10_0());
            	    			
            	    otherlv_12=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_10_1());
            	    			
            	    // InternalQuCircuit.g:1391:4: ( (lv_targetQubits_13_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1392:5: (lv_targetQubits_13_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1392:5: (lv_targetQubits_13_0= ruleSelector )
            	    // InternalQuCircuit.g:1393:6: lv_targetQubits_13_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_targetQubits_13_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_13_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,28,FOLLOW_18); 

            	    				newLeafNode(otherlv_14, grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_10_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_15=(Token)match(input,24,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_11());
            		
            // InternalQuCircuit.g:1419:3: (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQuCircuit.g:1420:4: otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']'
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeQuantumGateAccess().getControlQubitsKeyword_12_0());
                    			
                    otherlv_17=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_12_1());
                    			
                    // InternalQuCircuit.g:1428:4: ( (lv_controlQubits_18_0= ruleSelector ) )
                    // InternalQuCircuit.g:1429:5: (lv_controlQubits_18_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:1429:5: (lv_controlQubits_18_0= ruleSelector )
                    // InternalQuCircuit.g:1430:6: lv_controlQubits_18_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_controlQubits_18_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
                    						}
                    						add(
                    							current,
                    							"controlQubits",
                    							lv_controlQubits_18_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:1447:4: (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==19) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalQuCircuit.g:1448:5: otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) )
                    	    {
                    	    otherlv_19=(Token)match(input,19,FOLLOW_17); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalQuCircuit.g:1452:5: ( (lv_controlQubits_20_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:1453:6: (lv_controlQubits_20_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:1453:6: (lv_controlQubits_20_0= ruleSelector )
                    	    // InternalQuCircuit.g:1454:7: lv_controlQubits_20_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_controlQubits_20_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controlQubits",
                    	    								lv_controlQubits_20_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getCompositeQuantumGateAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeQuantumGate"


    // $ANTLR start "entryRuleLoop"
    // InternalQuCircuit.g:1485:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalQuCircuit.g:1485:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalQuCircuit.g:1486:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalQuCircuit.g:1492:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_inverseForm_3_0=null;
        Token lv_incrementBlockTargetQubits_4_0=null;
        Token lv_incrementBlockControlQubits_5_0=null;
        Token otherlv_6=null;
        Token lv_iterations_7_0=null;
        Token lv_incrementTargetQubits_8_0=null;
        Token lv_incrementControlQubits_9_0=null;
        Token otherlv_10=null;
        Token lv_targetQubitsBlockSize_11_0=null;
        Token otherlv_12=null;
        Token lv_controlQubitsBlockSize_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_incrementBy_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_72=null;
        Token otherlv_74=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_controlQubitsIterationType_15_0 = null;

        Enumerator lv_targetQubitsIterationType_17_0 = null;

        EObject lv_operations_22_0 = null;

        EObject lv_operations_24_0 = null;

        EObject lv_targetQubits_29_0 = null;

        EObject lv_targetQubits_33_0 = null;

        EObject lv_controlQubits_38_0 = null;

        EObject lv_controlQubits_40_0 = null;

        EObject lv_fixedControlQubits_44_0 = null;

        EObject lv_fixedControlQubits_46_0 = null;

        EObject lv_fixedTargetQubits_50_0 = null;

        EObject lv_fixedTargetQubits_52_0 = null;

        EObject lv_loopTargetQubits_59_0 = null;

        EObject lv_loopTargetQubits_63_0 = null;

        EObject lv_loopControlQubits_69_0 = null;

        EObject lv_loopControlQubits_73_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:1498:2: ( (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' ) )
            // InternalQuCircuit.g:1499:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' )
            {
            // InternalQuCircuit.g:1499:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' )
            // InternalQuCircuit.g:1500:3: otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            // InternalQuCircuit.g:1504:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:1505:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:1505:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:1506:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:1527:3: ( (lv_inverseForm_3_0= 'inverseForm' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQuCircuit.g:1528:4: (lv_inverseForm_3_0= 'inverseForm' )
                    {
                    // InternalQuCircuit.g:1528:4: (lv_inverseForm_3_0= 'inverseForm' )
                    // InternalQuCircuit.g:1529:5: lv_inverseForm_3_0= 'inverseForm'
                    {
                    lv_inverseForm_3_0=(Token)match(input,26,FOLLOW_34); 

                    					newLeafNode(lv_inverseForm_3_0, grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "inverseForm", lv_inverseForm_3_0 != null, "inverseForm");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1541:3: ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQuCircuit.g:1542:4: (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' )
                    {
                    // InternalQuCircuit.g:1542:4: (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' )
                    // InternalQuCircuit.g:1543:5: lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits'
                    {
                    lv_incrementBlockTargetQubits_4_0=(Token)match(input,39,FOLLOW_35); 

                    					newLeafNode(lv_incrementBlockTargetQubits_4_0, grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementBlockTargetQubits", lv_incrementBlockTargetQubits_4_0 != null, "incrementBlockTargetQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1555:3: ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQuCircuit.g:1556:4: (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' )
                    {
                    // InternalQuCircuit.g:1556:4: (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' )
                    // InternalQuCircuit.g:1557:5: lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits'
                    {
                    lv_incrementBlockControlQubits_5_0=(Token)match(input,40,FOLLOW_36); 

                    					newLeafNode(lv_incrementBlockControlQubits_5_0, grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementBlockControlQubits", lv_incrementBlockControlQubits_5_0 != null, "incrementBlockControlQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1569:3: (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQuCircuit.g:1570:4: otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getIterationsKeyword_6_0());
                    			
                    // InternalQuCircuit.g:1574:4: ( (lv_iterations_7_0= RULE_INT ) )
                    // InternalQuCircuit.g:1575:5: (lv_iterations_7_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1575:5: (lv_iterations_7_0= RULE_INT )
                    // InternalQuCircuit.g:1576:6: lv_iterations_7_0= RULE_INT
                    {
                    lv_iterations_7_0=(Token)match(input,RULE_INT,FOLLOW_37); 

                    						newLeafNode(lv_iterations_7_0, grammarAccess.getLoopAccess().getIterationsINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iterations",
                    							lv_iterations_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1593:3: ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQuCircuit.g:1594:4: (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' )
                    {
                    // InternalQuCircuit.g:1594:4: (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' )
                    // InternalQuCircuit.g:1595:5: lv_incrementTargetQubits_8_0= 'incrementTargetQubits'
                    {
                    lv_incrementTargetQubits_8_0=(Token)match(input,42,FOLLOW_38); 

                    					newLeafNode(lv_incrementTargetQubits_8_0, grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementTargetQubits", lv_incrementTargetQubits_8_0 != null, "incrementTargetQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1607:3: ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQuCircuit.g:1608:4: (lv_incrementControlQubits_9_0= 'incrementControlQubits' )
                    {
                    // InternalQuCircuit.g:1608:4: (lv_incrementControlQubits_9_0= 'incrementControlQubits' )
                    // InternalQuCircuit.g:1609:5: lv_incrementControlQubits_9_0= 'incrementControlQubits'
                    {
                    lv_incrementControlQubits_9_0=(Token)match(input,43,FOLLOW_39); 

                    					newLeafNode(lv_incrementControlQubits_9_0, grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementControlQubits", lv_incrementControlQubits_9_0 != null, "incrementControlQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1621:3: (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQuCircuit.g:1622:4: otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getTargetQubitsBlockSizeKeyword_9_0());
                    			
                    // InternalQuCircuit.g:1626:4: ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) )
                    // InternalQuCircuit.g:1627:5: (lv_targetQubitsBlockSize_11_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1627:5: (lv_targetQubitsBlockSize_11_0= RULE_INT )
                    // InternalQuCircuit.g:1628:6: lv_targetQubitsBlockSize_11_0= RULE_INT
                    {
                    lv_targetQubitsBlockSize_11_0=(Token)match(input,RULE_INT,FOLLOW_40); 

                    						newLeafNode(lv_targetQubitsBlockSize_11_0, grammarAccess.getLoopAccess().getTargetQubitsBlockSizeINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"targetQubitsBlockSize",
                    							lv_targetQubitsBlockSize_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1645:3: (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQuCircuit.g:1646:4: otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getLoopAccess().getControlQubitsBlockSizeKeyword_10_0());
                    			
                    // InternalQuCircuit.g:1650:4: ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) )
                    // InternalQuCircuit.g:1651:5: (lv_controlQubitsBlockSize_13_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1651:5: (lv_controlQubitsBlockSize_13_0= RULE_INT )
                    // InternalQuCircuit.g:1652:6: lv_controlQubitsBlockSize_13_0= RULE_INT
                    {
                    lv_controlQubitsBlockSize_13_0=(Token)match(input,RULE_INT,FOLLOW_41); 

                    						newLeafNode(lv_controlQubitsBlockSize_13_0, grammarAccess.getLoopAccess().getControlQubitsBlockSizeINTTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"controlQubitsBlockSize",
                    							lv_controlQubitsBlockSize_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1669:3: (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQuCircuit.g:1670:4: otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) )
                    {
                    otherlv_14=(Token)match(input,46,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getLoopAccess().getControlQubitsIterationTypeKeyword_11_0());
                    			
                    // InternalQuCircuit.g:1674:4: ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) )
                    // InternalQuCircuit.g:1675:5: (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE )
                    {
                    // InternalQuCircuit.g:1675:5: (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE )
                    // InternalQuCircuit.g:1676:6: lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getControlQubitsIterationTypeITERATION_TYPEEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_controlQubitsIterationType_15_0=ruleITERATION_TYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"controlQubitsIterationType",
                    							lv_controlQubitsIterationType_15_0,
                    							"quantum.circuit.lang.QuCircuit.ITERATION_TYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1694:3: (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQuCircuit.g:1695:4: otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) )
                    {
                    otherlv_16=(Token)match(input,47,FOLLOW_42); 

                    				newLeafNode(otherlv_16, grammarAccess.getLoopAccess().getTargetQubitsIterationTypeKeyword_12_0());
                    			
                    // InternalQuCircuit.g:1699:4: ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) )
                    // InternalQuCircuit.g:1700:5: (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE )
                    {
                    // InternalQuCircuit.g:1700:5: (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE )
                    // InternalQuCircuit.g:1701:6: lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeITERATION_TYPEEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_targetQubitsIterationType_17_0=ruleITERATION_TYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"targetQubitsIterationType",
                    							lv_targetQubitsIterationType_17_0,
                    							"quantum.circuit.lang.QuCircuit.ITERATION_TYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1719:3: (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQuCircuit.g:1720:4: otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) )
                    {
                    otherlv_18=(Token)match(input,48,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getLoopAccess().getIncrementByKeyword_13_0());
                    			
                    // InternalQuCircuit.g:1724:4: ( (lv_incrementBy_19_0= RULE_INT ) )
                    // InternalQuCircuit.g:1725:5: (lv_incrementBy_19_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1725:5: (lv_incrementBy_19_0= RULE_INT )
                    // InternalQuCircuit.g:1726:6: lv_incrementBy_19_0= RULE_INT
                    {
                    lv_incrementBy_19_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    						newLeafNode(lv_incrementBy_19_0, grammarAccess.getLoopAccess().getIncrementByINTTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"incrementBy",
                    							lv_incrementBy_19_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1743:3: (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQuCircuit.g:1744:4: otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,49,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getLoopAccess().getOperationsKeyword_14_0());
                    			
                    otherlv_21=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_14_1());
                    			
                    // InternalQuCircuit.g:1752:4: ( (lv_operations_22_0= ruleOperation ) )
                    // InternalQuCircuit.g:1753:5: (lv_operations_22_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:1753:5: (lv_operations_22_0= ruleOperation )
                    // InternalQuCircuit.g:1754:6: lv_operations_22_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_operations_22_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_22_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:1771:4: (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==19) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalQuCircuit.g:1772:5: otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getLoopAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalQuCircuit.g:1776:5: ( (lv_operations_24_0= ruleOperation ) )
                    	    // InternalQuCircuit.g:1777:6: (lv_operations_24_0= ruleOperation )
                    	    {
                    	    // InternalQuCircuit.g:1777:6: (lv_operations_24_0= ruleOperation )
                    	    // InternalQuCircuit.g:1778:7: lv_operations_24_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_operations_24_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_24_0,
                    	    								"quantum.circuit.lang.QuCircuit.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_25, grammarAccess.getLoopAccess().getRightParenthesisKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_26, grammarAccess.getLoopAccess().getTargetQubitsKeyword_15());
            		
            otherlv_27=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_27, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_16());
            		
            otherlv_28=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_28, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_17());
            		
            // InternalQuCircuit.g:1813:3: ( (lv_targetQubits_29_0= ruleSelector ) )
            // InternalQuCircuit.g:1814:4: (lv_targetQubits_29_0= ruleSelector )
            {
            // InternalQuCircuit.g:1814:4: (lv_targetQubits_29_0= ruleSelector )
            // InternalQuCircuit.g:1815:5: lv_targetQubits_29_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_23);
            lv_targetQubits_29_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_29_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_30, grammarAccess.getLoopAccess().getRightParenthesisKeyword_19());
            		
            // InternalQuCircuit.g:1836:3: (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalQuCircuit.g:1837:4: otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')'
            	    {
            	    otherlv_31=(Token)match(input,19,FOLLOW_22); 

            	    				newLeafNode(otherlv_31, grammarAccess.getLoopAccess().getCommaKeyword_20_0());
            	    			
            	    otherlv_32=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_32, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_20_1());
            	    			
            	    // InternalQuCircuit.g:1845:4: ( (lv_targetQubits_33_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1846:5: (lv_targetQubits_33_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1846:5: (lv_targetQubits_33_0= ruleSelector )
            	    // InternalQuCircuit.g:1847:6: lv_targetQubits_33_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_20_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_targetQubits_33_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLoopRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_33_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_34=(Token)match(input,28,FOLLOW_18); 

            	    				newLeafNode(otherlv_34, grammarAccess.getLoopAccess().getRightParenthesisKeyword_20_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_35=(Token)match(input,24,FOLLOW_47); 

            			newLeafNode(otherlv_35, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_21());
            		
            // InternalQuCircuit.g:1873:3: (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQuCircuit.g:1874:4: otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']'
                    {
                    otherlv_36=(Token)match(input,29,FOLLOW_16); 

                    				newLeafNode(otherlv_36, grammarAccess.getLoopAccess().getControlQubitsKeyword_22_0());
                    			
                    otherlv_37=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_37, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_22_1());
                    			
                    // InternalQuCircuit.g:1882:4: ( (lv_controlQubits_38_0= ruleSelector ) )
                    // InternalQuCircuit.g:1883:5: (lv_controlQubits_38_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:1883:5: (lv_controlQubits_38_0= ruleSelector )
                    // InternalQuCircuit.g:1884:6: lv_controlQubits_38_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_controlQubits_38_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"controlQubits",
                    							lv_controlQubits_38_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:1901:4: (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==19) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalQuCircuit.g:1902:5: otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) )
                    	    {
                    	    otherlv_39=(Token)match(input,19,FOLLOW_17); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getLoopAccess().getCommaKeyword_22_3_0());
                    	    				
                    	    // InternalQuCircuit.g:1906:5: ( (lv_controlQubits_40_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:1907:6: (lv_controlQubits_40_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:1907:6: (lv_controlQubits_40_0= ruleSelector )
                    	    // InternalQuCircuit.g:1908:7: lv_controlQubits_40_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_controlQubits_40_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controlQubits",
                    	    								lv_controlQubits_40_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,24,FOLLOW_48); 

                    				newLeafNode(otherlv_41, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_22_4());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:1931:3: (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQuCircuit.g:1932:4: otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']'
                    {
                    otherlv_42=(Token)match(input,50,FOLLOW_16); 

                    				newLeafNode(otherlv_42, grammarAccess.getLoopAccess().getFixedControlQubitsKeyword_23_0());
                    			
                    otherlv_43=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_43, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_23_1());
                    			
                    // InternalQuCircuit.g:1940:4: ( (lv_fixedControlQubits_44_0= ruleSelector ) )
                    // InternalQuCircuit.g:1941:5: (lv_fixedControlQubits_44_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:1941:5: (lv_fixedControlQubits_44_0= ruleSelector )
                    // InternalQuCircuit.g:1942:6: lv_fixedControlQubits_44_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_fixedControlQubits_44_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"fixedControlQubits",
                    							lv_fixedControlQubits_44_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:1959:4: (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==19) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalQuCircuit.g:1960:5: otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) )
                    	    {
                    	    otherlv_45=(Token)match(input,19,FOLLOW_17); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getLoopAccess().getCommaKeyword_23_3_0());
                    	    				
                    	    // InternalQuCircuit.g:1964:5: ( (lv_fixedControlQubits_46_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:1965:6: (lv_fixedControlQubits_46_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:1965:6: (lv_fixedControlQubits_46_0= ruleSelector )
                    	    // InternalQuCircuit.g:1966:7: lv_fixedControlQubits_46_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_fixedControlQubits_46_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fixedControlQubits",
                    	    								lv_fixedControlQubits_46_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,24,FOLLOW_49); 

                    				newLeafNode(otherlv_47, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_23_4());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:1989:3: (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQuCircuit.g:1990:4: otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']'
                    {
                    otherlv_48=(Token)match(input,51,FOLLOW_16); 

                    				newLeafNode(otherlv_48, grammarAccess.getLoopAccess().getFixedTargetQubitsKeyword_24_0());
                    			
                    otherlv_49=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_49, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_24_1());
                    			
                    // InternalQuCircuit.g:1998:4: ( (lv_fixedTargetQubits_50_0= ruleSelector ) )
                    // InternalQuCircuit.g:1999:5: (lv_fixedTargetQubits_50_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:1999:5: (lv_fixedTargetQubits_50_0= ruleSelector )
                    // InternalQuCircuit.g:2000:6: lv_fixedTargetQubits_50_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_fixedTargetQubits_50_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"fixedTargetQubits",
                    							lv_fixedTargetQubits_50_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:2017:4: (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==19) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalQuCircuit.g:2018:5: otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) )
                    	    {
                    	    otherlv_51=(Token)match(input,19,FOLLOW_17); 

                    	    					newLeafNode(otherlv_51, grammarAccess.getLoopAccess().getCommaKeyword_24_3_0());
                    	    				
                    	    // InternalQuCircuit.g:2022:5: ( (lv_fixedTargetQubits_52_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:2023:6: (lv_fixedTargetQubits_52_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:2023:6: (lv_fixedTargetQubits_52_0= ruleSelector )
                    	    // InternalQuCircuit.g:2024:7: lv_fixedTargetQubits_52_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_fixedTargetQubits_52_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fixedTargetQubits",
                    	    								lv_fixedTargetQubits_52_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,24,FOLLOW_50); 

                    				newLeafNode(otherlv_53, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_24_4());
                    			

                    }
                    break;

            }

            otherlv_54=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_54, grammarAccess.getLoopAccess().getLoopKeyword_25());
            		
            // InternalQuCircuit.g:2051:3: ( ( ruleEString ) )
            // InternalQuCircuit.g:2052:4: ( ruleEString )
            {
            // InternalQuCircuit.g:2052:4: ( ruleEString )
            // InternalQuCircuit.g:2053:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationCrossReference_26_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_56=(Token)match(input,53,FOLLOW_16); 

            			newLeafNode(otherlv_56, grammarAccess.getLoopAccess().getLoopTargetQubitsKeyword_27());
            		
            otherlv_57=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_57, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_28());
            		
            otherlv_58=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_58, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_29());
            		
            // InternalQuCircuit.g:2079:3: ( (lv_loopTargetQubits_59_0= ruleSelector ) )
            // InternalQuCircuit.g:2080:4: (lv_loopTargetQubits_59_0= ruleSelector )
            {
            // InternalQuCircuit.g:2080:4: (lv_loopTargetQubits_59_0= ruleSelector )
            // InternalQuCircuit.g:2081:5: lv_loopTargetQubits_59_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_30_0());
            				
            pushFollow(FOLLOW_23);
            lv_loopTargetQubits_59_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					add(
            						current,
            						"loopTargetQubits",
            						lv_loopTargetQubits_59_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_60=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_60, grammarAccess.getLoopAccess().getRightParenthesisKeyword_31());
            		
            // InternalQuCircuit.g:2102:3: (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==19) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalQuCircuit.g:2103:4: otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')'
            	    {
            	    otherlv_61=(Token)match(input,19,FOLLOW_22); 

            	    				newLeafNode(otherlv_61, grammarAccess.getLoopAccess().getCommaKeyword_32_0());
            	    			
            	    otherlv_62=(Token)match(input,27,FOLLOW_17); 

            	    				newLeafNode(otherlv_62, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_32_1());
            	    			
            	    // InternalQuCircuit.g:2111:4: ( (lv_loopTargetQubits_63_0= ruleSelector ) )
            	    // InternalQuCircuit.g:2112:5: (lv_loopTargetQubits_63_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:2112:5: (lv_loopTargetQubits_63_0= ruleSelector )
            	    // InternalQuCircuit.g:2113:6: lv_loopTargetQubits_63_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_32_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_loopTargetQubits_63_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLoopRule());
            	    						}
            	    						add(
            	    							current,
            	    							"loopTargetQubits",
            	    							lv_loopTargetQubits_63_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_64=(Token)match(input,28,FOLLOW_18); 

            	    				newLeafNode(otherlv_64, grammarAccess.getLoopAccess().getRightParenthesisKeyword_32_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_65=(Token)match(input,24,FOLLOW_52); 

            			newLeafNode(otherlv_65, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_33());
            		
            // InternalQuCircuit.g:2139:3: (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQuCircuit.g:2140:4: otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']'
                    {
                    otherlv_66=(Token)match(input,54,FOLLOW_16); 

                    				newLeafNode(otherlv_66, grammarAccess.getLoopAccess().getLoopControlQubitsKeyword_34_0());
                    			
                    otherlv_67=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_67, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_34_1());
                    			
                    otherlv_68=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_68, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_2());
                    			
                    // InternalQuCircuit.g:2152:4: ( (lv_loopControlQubits_69_0= ruleSelector ) )
                    // InternalQuCircuit.g:2153:5: (lv_loopControlQubits_69_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:2153:5: (lv_loopControlQubits_69_0= ruleSelector )
                    // InternalQuCircuit.g:2154:6: lv_loopControlQubits_69_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_3_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_loopControlQubits_69_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"loopControlQubits",
                    							lv_loopControlQubits_69_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_70=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_70, grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_4());
                    			
                    // InternalQuCircuit.g:2175:4: (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==19) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalQuCircuit.g:2176:5: otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')'
                    	    {
                    	    otherlv_71=(Token)match(input,19,FOLLOW_22); 

                    	    					newLeafNode(otherlv_71, grammarAccess.getLoopAccess().getCommaKeyword_34_5_0());
                    	    				
                    	    otherlv_72=(Token)match(input,27,FOLLOW_17); 

                    	    					newLeafNode(otherlv_72, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_5_1());
                    	    				
                    	    // InternalQuCircuit.g:2184:5: ( (lv_loopControlQubits_73_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:2185:6: (lv_loopControlQubits_73_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:2185:6: (lv_loopControlQubits_73_0= ruleSelector )
                    	    // InternalQuCircuit.g:2186:7: lv_loopControlQubits_73_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_5_2_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_loopControlQubits_73_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loopControlQubits",
                    	    								lv_loopControlQubits_73_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_74=(Token)match(input,28,FOLLOW_18); 

                    	    					newLeafNode(otherlv_74, grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_5_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_75=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_75, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_34_6());
                    			

                    }
                    break;

            }

            otherlv_76=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_76, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_35());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleOperation"
    // InternalQuCircuit.g:2221:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalQuCircuit.g:2221:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalQuCircuit.g:2222:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalQuCircuit.g:2228:1: ruleOperation returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2234:2: ( ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? ) )
            // InternalQuCircuit.g:2235:2: ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? )
            {
            // InternalQuCircuit.g:2235:2: ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? )
            // InternalQuCircuit.g:2236:3: ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )?
            {
            // InternalQuCircuit.g:2236:3: ( ( ruleEString ) )
            // InternalQuCircuit.g:2237:4: ( ruleEString )
            {
            // InternalQuCircuit.g:2237:4: ( ruleEString )
            // InternalQuCircuit.g:2238:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationCrossReference_0_0());
            				
            pushFollow(FOLLOW_53);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:2252:3: (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==27) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQuCircuit.g:2253:4: otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalQuCircuit.g:2257:4: ( ( ruleEString ) )
                    // InternalQuCircuit.g:2258:5: ( ruleEString )
                    {
                    // InternalQuCircuit.g:2258:5: ( ruleEString )
                    // InternalQuCircuit.g:2259:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperationAccess().getQuboQuboCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelector"
    // InternalQuCircuit.g:2282:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalQuCircuit.g:2282:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalQuCircuit.g:2283:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalQuCircuit.g:2289:1: ruleSelector returns [EObject current=null] : (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_ElementSelector_0 = null;

        EObject this_RangeSelector_1 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:2295:2: ( (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector ) )
            // InternalQuCircuit.g:2296:2: (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector )
            {
            // InternalQuCircuit.g:2296:2: (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector )
            int alt51=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==19) ) {
                    int LA51_4 = input.LA(3);

                    if ( (LA51_4==RULE_INT) ) {
                        int LA51_3 = input.LA(4);

                        if ( (LA51_3==EOF||LA51_3==19||LA51_3==24||LA51_3==28) ) {
                            alt51=1;
                        }
                        else if ( (LA51_3==55) ) {
                            alt51=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==19) ) {
                    int LA51_4 = input.LA(3);

                    if ( (LA51_4==RULE_INT) ) {
                        int LA51_3 = input.LA(4);

                        if ( (LA51_3==EOF||LA51_3==19||LA51_3==24||LA51_3==28) ) {
                            alt51=1;
                        }
                        else if ( (LA51_3==55) ) {
                            alt51=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA51_3 = input.LA(2);

                if ( (LA51_3==EOF||LA51_3==19||LA51_3==24||LA51_3==28) ) {
                    alt51=1;
                }
                else if ( (LA51_3==55) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalQuCircuit.g:2297:3: this_ElementSelector_0= ruleElementSelector
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getElementSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementSelector_0=ruleElementSelector();

                    state._fsp--;


                    			current = this_ElementSelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:2306:3: this_RangeSelector_1= ruleRangeSelector
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getRangeSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeSelector_1=ruleRangeSelector();

                    state._fsp--;


                    			current = this_RangeSelector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleElementSelector"
    // InternalQuCircuit.g:2318:1: entryRuleElementSelector returns [EObject current=null] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final EObject entryRuleElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSelector = null;


        try {
            // InternalQuCircuit.g:2318:56: (iv_ruleElementSelector= ruleElementSelector EOF )
            // InternalQuCircuit.g:2319:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
             newCompositeNode(grammarAccess.getElementSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementSelector=ruleElementSelector();

            state._fsp--;

             current =iv_ruleElementSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // InternalQuCircuit.g:2325:1: ruleElementSelector returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) ) ;
    public final EObject ruleElementSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_index_3_0=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2331:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) ) )
            // InternalQuCircuit.g:2332:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) )
            {
            // InternalQuCircuit.g:2332:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) )
            // InternalQuCircuit.g:2333:3: () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) )
            {
            // InternalQuCircuit.g:2333:3: ()
            // InternalQuCircuit.g:2334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementSelectorAccess().getElementSelectorAction_0(),
            					current);
            			

            }

            // InternalQuCircuit.g:2340:3: ( ( ( ruleEString ) ) otherlv_2= ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQuCircuit.g:2341:4: ( ( ruleEString ) ) otherlv_2= ','
                    {
                    // InternalQuCircuit.g:2341:4: ( ( ruleEString ) )
                    // InternalQuCircuit.g:2342:5: ( ruleEString )
                    {
                    // InternalQuCircuit.g:2342:5: ( ruleEString )
                    // InternalQuCircuit.g:2343:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementSelectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getElementSelectorAccess().getRegisterRegisterCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementSelectorAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2362:3: ( (lv_index_3_0= RULE_INT ) )
            // InternalQuCircuit.g:2363:4: (lv_index_3_0= RULE_INT )
            {
            // InternalQuCircuit.g:2363:4: (lv_index_3_0= RULE_INT )
            // InternalQuCircuit.g:2364:5: lv_index_3_0= RULE_INT
            {
            lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_index_3_0, grammarAccess.getElementSelectorAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleRangeSelector"
    // InternalQuCircuit.g:2384:1: entryRuleRangeSelector returns [EObject current=null] : iv_ruleRangeSelector= ruleRangeSelector EOF ;
    public final EObject entryRuleRangeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeSelector = null;


        try {
            // InternalQuCircuit.g:2384:54: (iv_ruleRangeSelector= ruleRangeSelector EOF )
            // InternalQuCircuit.g:2385:2: iv_ruleRangeSelector= ruleRangeSelector EOF
            {
             newCompositeNode(grammarAccess.getRangeSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeSelector=ruleRangeSelector();

            state._fsp--;

             current =iv_ruleRangeSelector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeSelector"


    // $ANTLR start "ruleRangeSelector"
    // InternalQuCircuit.g:2391:1: ruleRangeSelector returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) ) ;
    public final EObject ruleRangeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_begin_3_0=null;
        Token otherlv_4=null;
        Token lv_end_5_0=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2397:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) ) )
            // InternalQuCircuit.g:2398:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) )
            {
            // InternalQuCircuit.g:2398:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) )
            // InternalQuCircuit.g:2399:3: () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) )
            {
            // InternalQuCircuit.g:2399:3: ()
            // InternalQuCircuit.g:2400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeSelectorAccess().getRangeSelectorAction_0(),
            					current);
            			

            }

            // InternalQuCircuit.g:2406:3: ( ( ( ruleEString ) ) otherlv_2= ',' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalQuCircuit.g:2407:4: ( ( ruleEString ) ) otherlv_2= ','
                    {
                    // InternalQuCircuit.g:2407:4: ( ( ruleEString ) )
                    // InternalQuCircuit.g:2408:5: ( ruleEString )
                    {
                    // InternalQuCircuit.g:2408:5: ( ruleEString )
                    // InternalQuCircuit.g:2409:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeSelectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRangeSelectorAccess().getRegisterRegisterCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRangeSelectorAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2428:3: ( (lv_begin_3_0= RULE_INT ) )
            // InternalQuCircuit.g:2429:4: (lv_begin_3_0= RULE_INT )
            {
            // InternalQuCircuit.g:2429:4: (lv_begin_3_0= RULE_INT )
            // InternalQuCircuit.g:2430:5: lv_begin_3_0= RULE_INT
            {
            lv_begin_3_0=(Token)match(input,RULE_INT,FOLLOW_55); 

            					newLeafNode(lv_begin_3_0, grammarAccess.getRangeSelectorAccess().getBeginINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"begin",
            						lv_begin_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeSelectorAccess().getHyphenMinusKeyword_3());
            		
            // InternalQuCircuit.g:2450:3: ( (lv_end_5_0= RULE_INT ) )
            // InternalQuCircuit.g:2451:4: (lv_end_5_0= RULE_INT )
            {
            // InternalQuCircuit.g:2451:4: (lv_end_5_0= RULE_INT )
            // InternalQuCircuit.g:2452:5: lv_end_5_0= RULE_INT
            {
            lv_end_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_5_0, grammarAccess.getRangeSelectorAccess().getEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeSelector"


    // $ANTLR start "entryRuleEString"
    // InternalQuCircuit.g:2472:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQuCircuit.g:2472:47: (iv_ruleEString= ruleEString EOF )
            // InternalQuCircuit.g:2473:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQuCircuit.g:2479:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2485:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQuCircuit.g:2486:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQuCircuit.g:2486:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalQuCircuit.g:2487:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:2495:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalQuCircuit.g:2506:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalQuCircuit.g:2506:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalQuCircuit.g:2507:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalQuCircuit.g:2513:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2519:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalQuCircuit.g:2520:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalQuCircuit.g:2520:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalQuCircuit.g:2521:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalQuCircuit.g:2521:3: (kw= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQuCircuit.g:2522:4: kw= '-'
                    {
                    kw=(Token)match(input,55,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2528:3: (this_INT_1= RULE_INT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_INT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQuCircuit.g:2529:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_57); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,56,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_58); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3());
            		
            // InternalQuCircuit.g:2549:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=57 && LA59_0<=58)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQuCircuit.g:2550:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalQuCircuit.g:2550:4: (kw= 'E' | kw= 'e' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==57) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==58) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalQuCircuit.g:2551:5: kw= 'E'
                            {
                            kw=(Token)match(input,57,FOLLOW_59); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQuCircuit.g:2557:5: kw= 'e'
                            {
                            kw=(Token)match(input,58,FOLLOW_59); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQuCircuit.g:2563:4: (kw= '-' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==55) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalQuCircuit.g:2564:5: kw= '-'
                            {
                            kw=(Token)match(input,55,FOLLOW_9); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "ruleITERATION_TYPE"
    // InternalQuCircuit.g:2582:1: ruleITERATION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) ) ;
    public final Enumerator ruleITERATION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2588:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) ) )
            // InternalQuCircuit.g:2589:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) )
            {
            // InternalQuCircuit.g:2589:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt60=1;
                }
                break;
            case 60:
                {
                alt60=2;
                }
                break;
            case 61:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalQuCircuit.g:2590:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalQuCircuit.g:2590:3: (enumLiteral_0= 'NONE' )
                    // InternalQuCircuit.g:2591:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:2598:3: (enumLiteral_1= 'SHIFT' )
                    {
                    // InternalQuCircuit.g:2598:3: (enumLiteral_1= 'SHIFT' )
                    // InternalQuCircuit.g:2599:4: enumLiteral_1= 'SHIFT'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:2606:3: (enumLiteral_2= 'CHANGE_BLOCK' )
                    {
                    // InternalQuCircuit.g:2606:3: (enumLiteral_2= 'CHANGE_BLOCK' )
                    // InternalQuCircuit.g:2607:4: enumLiteral_2= 'CHANGE_BLOCK'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleITERATION_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000056000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006802100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000700002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0180000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000004600000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0003FF8004400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003FF8000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003FF0000400000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0003FE0000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003FC0000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003F80000400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003F00000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003E00000400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003C00000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003800000400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0003000000400000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x001C000020000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000000002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0080000000000010L});

}