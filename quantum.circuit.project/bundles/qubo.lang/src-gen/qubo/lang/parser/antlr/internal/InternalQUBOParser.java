package qubo.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import qubo.lang.services.QUBOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQUBOParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Qubo'", "'{'", "'matrix'", "'}'", "'['", "','", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_E_DOUBLE=5;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_E_INT=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators


        public InternalQUBOParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQUBOParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQUBOParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQUBO.g"; }



     	private QUBOGrammarAccess grammarAccess;

        public InternalQUBOParser(TokenStream input, QUBOGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Qubo";
       	}

       	@Override
       	protected QUBOGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQubo"
    // InternalQUBO.g:64:1: entryRuleQubo returns [EObject current=null] : iv_ruleQubo= ruleQubo EOF ;
    public final EObject entryRuleQubo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQubo = null;


        try {
            // InternalQUBO.g:64:45: (iv_ruleQubo= ruleQubo EOF )
            // InternalQUBO.g:65:2: iv_ruleQubo= ruleQubo EOF
            {
             newCompositeNode(grammarAccess.getQuboRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQubo=ruleQubo();

            state._fsp--;

             current =iv_ruleQubo; 
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
    // $ANTLR end "entryRuleQubo"


    // $ANTLR start "ruleQubo"
    // InternalQUBO.g:71:1: ruleQubo returns [EObject current=null] : ( () otherlv_1= 'Qubo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'matrix' ( (lv_matrix_5_0= ruleMatrix ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleQubo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_matrix_5_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:77:2: ( ( () otherlv_1= 'Qubo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'matrix' ( (lv_matrix_5_0= ruleMatrix ) ) )? otherlv_6= '}' ) )
            // InternalQUBO.g:78:2: ( () otherlv_1= 'Qubo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'matrix' ( (lv_matrix_5_0= ruleMatrix ) ) )? otherlv_6= '}' )
            {
            // InternalQUBO.g:78:2: ( () otherlv_1= 'Qubo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'matrix' ( (lv_matrix_5_0= ruleMatrix ) ) )? otherlv_6= '}' )
            // InternalQUBO.g:79:3: () otherlv_1= 'Qubo' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'matrix' ( (lv_matrix_5_0= ruleMatrix ) ) )? otherlv_6= '}'
            {
            // InternalQUBO.g:79:3: ()
            // InternalQUBO.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuboAccess().getQuboAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuboAccess().getQuboKeyword_1());
            		
            // InternalQUBO.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQUBO.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalQUBO.g:91:4: (lv_name_2_0= ruleEString )
            // InternalQUBO.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuboAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuboRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"qubo.lang.QUBO.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQUBO.g:113:3: (otherlv_4= 'matrix' ( (lv_matrix_5_0= ruleMatrix ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQUBO.g:114:4: otherlv_4= 'matrix' ( (lv_matrix_5_0= ruleMatrix ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuboAccess().getMatrixKeyword_4_0());
                    			
                    // InternalQUBO.g:118:4: ( (lv_matrix_5_0= ruleMatrix ) )
                    // InternalQUBO.g:119:5: (lv_matrix_5_0= ruleMatrix )
                    {
                    // InternalQUBO.g:119:5: (lv_matrix_5_0= ruleMatrix )
                    // InternalQUBO.g:120:6: lv_matrix_5_0= ruleMatrix
                    {

                    						newCompositeNode(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_matrix_5_0=ruleMatrix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuboRule());
                    						}
                    						set(
                    							current,
                    							"matrix",
                    							lv_matrix_5_0,
                    							"qubo.lang.QUBO.Matrix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleQubo"


    // $ANTLR start "entryRuleMatrix"
    // InternalQUBO.g:146:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalQUBO.g:146:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalQUBO.g:147:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
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
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalQUBO.g:153:1: ruleMatrix returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rows_2_0 = null;

        EObject lv_rows_4_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:159:2: ( ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' ) )
            // InternalQUBO.g:160:2: ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' )
            {
            // InternalQUBO.g:160:2: ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' )
            // InternalQUBO.g:161:3: () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']'
            {
            // InternalQUBO.g:161:3: ()
            // InternalQUBO.g:162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatrixAccess().getMatrixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalQUBO.g:172:3: ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQUBO.g:173:4: ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )*
                    {
                    // InternalQUBO.g:173:4: ( (lv_rows_2_0= ruleRow ) )
                    // InternalQUBO.g:174:5: (lv_rows_2_0= ruleRow )
                    {
                    // InternalQUBO.g:174:5: (lv_rows_2_0= ruleRow )
                    // InternalQUBO.g:175:6: lv_rows_2_0= ruleRow
                    {

                    						newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rows_2_0=ruleRow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatrixRule());
                    						}
                    						add(
                    							current,
                    							"rows",
                    							lv_rows_2_0,
                    							"qubo.lang.QUBO.Row");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQUBO.g:192:4: (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalQUBO.g:193:5: otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalQUBO.g:197:5: ( (lv_rows_4_0= ruleRow ) )
                    	    // InternalQUBO.g:198:6: (lv_rows_4_0= ruleRow )
                    	    {
                    	    // InternalQUBO.g:198:6: (lv_rows_4_0= ruleRow )
                    	    // InternalQUBO.g:199:7: lv_rows_4_0= ruleRow
                    	    {

                    	    							newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_rows_4_0=ruleRow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMatrixRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rows",
                    	    								lv_rows_4_0,
                    	    								"qubo.lang.QUBO.Row");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleRow"
    // InternalQUBO.g:226:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalQUBO.g:226:44: (iv_ruleRow= ruleRow EOF )
            // InternalQUBO.g:227:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalQUBO.g:233:1: ruleRow returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:239:2: ( ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' ) )
            // InternalQUBO.g:240:2: ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' )
            {
            // InternalQUBO.g:240:2: ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' )
            // InternalQUBO.g:241:3: () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']'
            {
            // InternalQUBO.g:241:3: ()
            // InternalQUBO.g:242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalQUBO.g:252:3: ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_E_INT && LA5_0<=RULE_E_DOUBLE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQUBO.g:253:4: ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
                    {
                    // InternalQUBO.g:253:4: ( (lv_columns_2_0= ruleColumn ) )
                    // InternalQUBO.g:254:5: (lv_columns_2_0= ruleColumn )
                    {
                    // InternalQUBO.g:254:5: (lv_columns_2_0= ruleColumn )
                    // InternalQUBO.g:255:6: lv_columns_2_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_columns_2_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_2_0,
                    							"qubo.lang.QUBO.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQUBO.g:272:4: (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalQUBO.g:273:5: otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getRowAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalQUBO.g:277:5: ( (lv_columns_4_0= ruleColumn ) )
                    	    // InternalQUBO.g:278:6: (lv_columns_4_0= ruleColumn )
                    	    {
                    	    // InternalQUBO.g:278:6: (lv_columns_4_0= ruleColumn )
                    	    // InternalQUBO.g:279:7: lv_columns_4_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_columns_4_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_4_0,
                    	    								"qubo.lang.QUBO.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRowAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalQUBO.g:306:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalQUBO.g:306:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalQUBO.g:307:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalQUBO.g:313:1: ruleColumn returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEDouble ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:319:2: ( ( () ( (lv_value_1_0= ruleEDouble ) ) ) )
            // InternalQUBO.g:320:2: ( () ( (lv_value_1_0= ruleEDouble ) ) )
            {
            // InternalQUBO.g:320:2: ( () ( (lv_value_1_0= ruleEDouble ) ) )
            // InternalQUBO.g:321:3: () ( (lv_value_1_0= ruleEDouble ) )
            {
            // InternalQUBO.g:321:3: ()
            // InternalQUBO.g:322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            // InternalQUBO.g:328:3: ( (lv_value_1_0= ruleEDouble ) )
            // InternalQUBO.g:329:4: (lv_value_1_0= ruleEDouble )
            {
            // InternalQUBO.g:329:4: (lv_value_1_0= ruleEDouble )
            // InternalQUBO.g:330:5: lv_value_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getValueEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"qubo.lang.QUBO.EDouble");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleEDouble"
    // InternalQUBO.g:351:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalQUBO.g:351:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalQUBO.g:352:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalQUBO.g:358:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalQUBO.g:364:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalQUBO.g:365:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalQUBO.g:365:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_E_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_E_DOUBLE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQUBO.g:366:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQUBO.g:374:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); 

                    			current.merge(this_E_DOUBLE_1);
                    		

                    			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalQUBO.g:385:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQUBO.g:385:47: (iv_ruleEString= ruleEString EOF )
            // InternalQUBO.g:386:2: iv_ruleEString= ruleEString EOF
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
    // InternalQUBO.g:392:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQUBO.g:398:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQUBO.g:399:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQUBO.g:399:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQUBO.g:400:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQUBO.g:408:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});

}