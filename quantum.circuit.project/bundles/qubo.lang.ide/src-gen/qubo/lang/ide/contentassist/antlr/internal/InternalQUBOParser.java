package qubo.lang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import qubo.lang.services.QUBOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQUBOParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Qubo'", "'{'", "'}'", "'matrix'", "'['", "']'", "','"
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

    	public void setGrammarAccess(QUBOGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleQubo"
    // InternalQUBO.g:53:1: entryRuleQubo : ruleQubo EOF ;
    public final void entryRuleQubo() throws RecognitionException {
        try {
            // InternalQUBO.g:54:1: ( ruleQubo EOF )
            // InternalQUBO.g:55:1: ruleQubo EOF
            {
             before(grammarAccess.getQuboRule()); 
            pushFollow(FOLLOW_1);
            ruleQubo();

            state._fsp--;

             after(grammarAccess.getQuboRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQubo"


    // $ANTLR start "ruleQubo"
    // InternalQUBO.g:62:1: ruleQubo : ( ( rule__Qubo__Group__0 ) ) ;
    public final void ruleQubo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:66:2: ( ( ( rule__Qubo__Group__0 ) ) )
            // InternalQUBO.g:67:2: ( ( rule__Qubo__Group__0 ) )
            {
            // InternalQUBO.g:67:2: ( ( rule__Qubo__Group__0 ) )
            // InternalQUBO.g:68:3: ( rule__Qubo__Group__0 )
            {
             before(grammarAccess.getQuboAccess().getGroup()); 
            // InternalQUBO.g:69:3: ( rule__Qubo__Group__0 )
            // InternalQUBO.g:69:4: rule__Qubo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuboAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQubo"


    // $ANTLR start "entryRuleMatrix"
    // InternalQUBO.g:78:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // InternalQUBO.g:79:1: ( ruleMatrix EOF )
            // InternalQUBO.g:80:1: ruleMatrix EOF
            {
             before(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMatrixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalQUBO.g:87:1: ruleMatrix : ( ( rule__Matrix__Group__0 ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:91:2: ( ( ( rule__Matrix__Group__0 ) ) )
            // InternalQUBO.g:92:2: ( ( rule__Matrix__Group__0 ) )
            {
            // InternalQUBO.g:92:2: ( ( rule__Matrix__Group__0 ) )
            // InternalQUBO.g:93:3: ( rule__Matrix__Group__0 )
            {
             before(grammarAccess.getMatrixAccess().getGroup()); 
            // InternalQUBO.g:94:3: ( rule__Matrix__Group__0 )
            // InternalQUBO.g:94:4: rule__Matrix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleRow"
    // InternalQUBO.g:103:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalQUBO.g:104:1: ( ruleRow EOF )
            // InternalQUBO.g:105:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalQUBO.g:112:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:116:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalQUBO.g:117:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalQUBO.g:117:2: ( ( rule__Row__Group__0 ) )
            // InternalQUBO.g:118:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalQUBO.g:119:3: ( rule__Row__Group__0 )
            // InternalQUBO.g:119:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalQUBO.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalQUBO.g:129:1: ( ruleColumn EOF )
            // InternalQUBO.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalQUBO.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalQUBO.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalQUBO.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalQUBO.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalQUBO.g:144:3: ( rule__Column__Group__0 )
            // InternalQUBO.g:144:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleEDouble"
    // InternalQUBO.g:153:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalQUBO.g:154:1: ( ruleEDouble EOF )
            // InternalQUBO.g:155:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalQUBO.g:162:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:166:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalQUBO.g:167:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalQUBO.g:167:2: ( ( rule__EDouble__Alternatives ) )
            // InternalQUBO.g:168:3: ( rule__EDouble__Alternatives )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            // InternalQUBO.g:169:3: ( rule__EDouble__Alternatives )
            // InternalQUBO.g:169:4: rule__EDouble__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalQUBO.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQUBO.g:179:1: ( ruleEString EOF )
            // InternalQUBO.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQUBO.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQUBO.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQUBO.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalQUBO.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQUBO.g:194:3: ( rule__EString__Alternatives )
            // InternalQUBO.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EDouble__Alternatives"
    // InternalQUBO.g:202:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:206:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_E_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_E_DOUBLE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQUBO.g:207:2: ( RULE_E_INT )
                    {
                    // InternalQUBO.g:207:2: ( RULE_E_INT )
                    // InternalQUBO.g:208:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQUBO.g:213:2: ( RULE_E_DOUBLE )
                    {
                    // InternalQUBO.g:213:2: ( RULE_E_DOUBLE )
                    // InternalQUBO.g:214:3: RULE_E_DOUBLE
                    {
                     before(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_E_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQUBO.g:223:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:227:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQUBO.g:228:2: ( RULE_STRING )
                    {
                    // InternalQUBO.g:228:2: ( RULE_STRING )
                    // InternalQUBO.g:229:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQUBO.g:234:2: ( RULE_ID )
                    {
                    // InternalQUBO.g:234:2: ( RULE_ID )
                    // InternalQUBO.g:235:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Qubo__Group__0"
    // InternalQUBO.g:244:1: rule__Qubo__Group__0 : rule__Qubo__Group__0__Impl rule__Qubo__Group__1 ;
    public final void rule__Qubo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:248:1: ( rule__Qubo__Group__0__Impl rule__Qubo__Group__1 )
            // InternalQUBO.g:249:2: rule__Qubo__Group__0__Impl rule__Qubo__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Qubo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__0"


    // $ANTLR start "rule__Qubo__Group__0__Impl"
    // InternalQUBO.g:256:1: rule__Qubo__Group__0__Impl : ( () ) ;
    public final void rule__Qubo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:260:1: ( ( () ) )
            // InternalQUBO.g:261:1: ( () )
            {
            // InternalQUBO.g:261:1: ( () )
            // InternalQUBO.g:262:2: ()
            {
             before(grammarAccess.getQuboAccess().getQuboAction_0()); 
            // InternalQUBO.g:263:2: ()
            // InternalQUBO.g:263:3: 
            {
            }

             after(grammarAccess.getQuboAccess().getQuboAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__0__Impl"


    // $ANTLR start "rule__Qubo__Group__1"
    // InternalQUBO.g:271:1: rule__Qubo__Group__1 : rule__Qubo__Group__1__Impl rule__Qubo__Group__2 ;
    public final void rule__Qubo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:275:1: ( rule__Qubo__Group__1__Impl rule__Qubo__Group__2 )
            // InternalQUBO.g:276:2: rule__Qubo__Group__1__Impl rule__Qubo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Qubo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__1"


    // $ANTLR start "rule__Qubo__Group__1__Impl"
    // InternalQUBO.g:283:1: rule__Qubo__Group__1__Impl : ( 'Qubo' ) ;
    public final void rule__Qubo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:287:1: ( ( 'Qubo' ) )
            // InternalQUBO.g:288:1: ( 'Qubo' )
            {
            // InternalQUBO.g:288:1: ( 'Qubo' )
            // InternalQUBO.g:289:2: 'Qubo'
            {
             before(grammarAccess.getQuboAccess().getQuboKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getQuboKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__1__Impl"


    // $ANTLR start "rule__Qubo__Group__2"
    // InternalQUBO.g:298:1: rule__Qubo__Group__2 : rule__Qubo__Group__2__Impl rule__Qubo__Group__3 ;
    public final void rule__Qubo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:302:1: ( rule__Qubo__Group__2__Impl rule__Qubo__Group__3 )
            // InternalQUBO.g:303:2: rule__Qubo__Group__2__Impl rule__Qubo__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Qubo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__2"


    // $ANTLR start "rule__Qubo__Group__2__Impl"
    // InternalQUBO.g:310:1: rule__Qubo__Group__2__Impl : ( ( rule__Qubo__NameAssignment_2 ) ) ;
    public final void rule__Qubo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:314:1: ( ( ( rule__Qubo__NameAssignment_2 ) ) )
            // InternalQUBO.g:315:1: ( ( rule__Qubo__NameAssignment_2 ) )
            {
            // InternalQUBO.g:315:1: ( ( rule__Qubo__NameAssignment_2 ) )
            // InternalQUBO.g:316:2: ( rule__Qubo__NameAssignment_2 )
            {
             before(grammarAccess.getQuboAccess().getNameAssignment_2()); 
            // InternalQUBO.g:317:2: ( rule__Qubo__NameAssignment_2 )
            // InternalQUBO.g:317:3: rule__Qubo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuboAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__2__Impl"


    // $ANTLR start "rule__Qubo__Group__3"
    // InternalQUBO.g:325:1: rule__Qubo__Group__3 : rule__Qubo__Group__3__Impl rule__Qubo__Group__4 ;
    public final void rule__Qubo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:329:1: ( rule__Qubo__Group__3__Impl rule__Qubo__Group__4 )
            // InternalQUBO.g:330:2: rule__Qubo__Group__3__Impl rule__Qubo__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Qubo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__3"


    // $ANTLR start "rule__Qubo__Group__3__Impl"
    // InternalQUBO.g:337:1: rule__Qubo__Group__3__Impl : ( '{' ) ;
    public final void rule__Qubo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:341:1: ( ( '{' ) )
            // InternalQUBO.g:342:1: ( '{' )
            {
            // InternalQUBO.g:342:1: ( '{' )
            // InternalQUBO.g:343:2: '{'
            {
             before(grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__3__Impl"


    // $ANTLR start "rule__Qubo__Group__4"
    // InternalQUBO.g:352:1: rule__Qubo__Group__4 : rule__Qubo__Group__4__Impl rule__Qubo__Group__5 ;
    public final void rule__Qubo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:356:1: ( rule__Qubo__Group__4__Impl rule__Qubo__Group__5 )
            // InternalQUBO.g:357:2: rule__Qubo__Group__4__Impl rule__Qubo__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Qubo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__4"


    // $ANTLR start "rule__Qubo__Group__4__Impl"
    // InternalQUBO.g:364:1: rule__Qubo__Group__4__Impl : ( ( rule__Qubo__Group_4__0 )? ) ;
    public final void rule__Qubo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:368:1: ( ( ( rule__Qubo__Group_4__0 )? ) )
            // InternalQUBO.g:369:1: ( ( rule__Qubo__Group_4__0 )? )
            {
            // InternalQUBO.g:369:1: ( ( rule__Qubo__Group_4__0 )? )
            // InternalQUBO.g:370:2: ( rule__Qubo__Group_4__0 )?
            {
             before(grammarAccess.getQuboAccess().getGroup_4()); 
            // InternalQUBO.g:371:2: ( rule__Qubo__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQUBO.g:371:3: rule__Qubo__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qubo__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuboAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__4__Impl"


    // $ANTLR start "rule__Qubo__Group__5"
    // InternalQUBO.g:379:1: rule__Qubo__Group__5 : rule__Qubo__Group__5__Impl ;
    public final void rule__Qubo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:383:1: ( rule__Qubo__Group__5__Impl )
            // InternalQUBO.g:384:2: rule__Qubo__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__5"


    // $ANTLR start "rule__Qubo__Group__5__Impl"
    // InternalQUBO.g:390:1: rule__Qubo__Group__5__Impl : ( '}' ) ;
    public final void rule__Qubo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:394:1: ( ( '}' ) )
            // InternalQUBO.g:395:1: ( '}' )
            {
            // InternalQUBO.g:395:1: ( '}' )
            // InternalQUBO.g:396:2: '}'
            {
             before(grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__5__Impl"


    // $ANTLR start "rule__Qubo__Group_4__0"
    // InternalQUBO.g:406:1: rule__Qubo__Group_4__0 : rule__Qubo__Group_4__0__Impl rule__Qubo__Group_4__1 ;
    public final void rule__Qubo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:410:1: ( rule__Qubo__Group_4__0__Impl rule__Qubo__Group_4__1 )
            // InternalQUBO.g:411:2: rule__Qubo__Group_4__0__Impl rule__Qubo__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Qubo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_4__0"


    // $ANTLR start "rule__Qubo__Group_4__0__Impl"
    // InternalQUBO.g:418:1: rule__Qubo__Group_4__0__Impl : ( 'matrix' ) ;
    public final void rule__Qubo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:422:1: ( ( 'matrix' ) )
            // InternalQUBO.g:423:1: ( 'matrix' )
            {
            // InternalQUBO.g:423:1: ( 'matrix' )
            // InternalQUBO.g:424:2: 'matrix'
            {
             before(grammarAccess.getQuboAccess().getMatrixKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getMatrixKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_4__0__Impl"


    // $ANTLR start "rule__Qubo__Group_4__1"
    // InternalQUBO.g:433:1: rule__Qubo__Group_4__1 : rule__Qubo__Group_4__1__Impl ;
    public final void rule__Qubo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:437:1: ( rule__Qubo__Group_4__1__Impl )
            // InternalQUBO.g:438:2: rule__Qubo__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_4__1"


    // $ANTLR start "rule__Qubo__Group_4__1__Impl"
    // InternalQUBO.g:444:1: rule__Qubo__Group_4__1__Impl : ( ( rule__Qubo__MatrixAssignment_4_1 ) ) ;
    public final void rule__Qubo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:448:1: ( ( ( rule__Qubo__MatrixAssignment_4_1 ) ) )
            // InternalQUBO.g:449:1: ( ( rule__Qubo__MatrixAssignment_4_1 ) )
            {
            // InternalQUBO.g:449:1: ( ( rule__Qubo__MatrixAssignment_4_1 ) )
            // InternalQUBO.g:450:2: ( rule__Qubo__MatrixAssignment_4_1 )
            {
             before(grammarAccess.getQuboAccess().getMatrixAssignment_4_1()); 
            // InternalQUBO.g:451:2: ( rule__Qubo__MatrixAssignment_4_1 )
            // InternalQUBO.g:451:3: rule__Qubo__MatrixAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__MatrixAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuboAccess().getMatrixAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_4__1__Impl"


    // $ANTLR start "rule__Matrix__Group__0"
    // InternalQUBO.g:460:1: rule__Matrix__Group__0 : rule__Matrix__Group__0__Impl rule__Matrix__Group__1 ;
    public final void rule__Matrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:464:1: ( rule__Matrix__Group__0__Impl rule__Matrix__Group__1 )
            // InternalQUBO.g:465:2: rule__Matrix__Group__0__Impl rule__Matrix__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Matrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__0"


    // $ANTLR start "rule__Matrix__Group__0__Impl"
    // InternalQUBO.g:472:1: rule__Matrix__Group__0__Impl : ( () ) ;
    public final void rule__Matrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:476:1: ( ( () ) )
            // InternalQUBO.g:477:1: ( () )
            {
            // InternalQUBO.g:477:1: ( () )
            // InternalQUBO.g:478:2: ()
            {
             before(grammarAccess.getMatrixAccess().getMatrixAction_0()); 
            // InternalQUBO.g:479:2: ()
            // InternalQUBO.g:479:3: 
            {
            }

             after(grammarAccess.getMatrixAccess().getMatrixAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__0__Impl"


    // $ANTLR start "rule__Matrix__Group__1"
    // InternalQUBO.g:487:1: rule__Matrix__Group__1 : rule__Matrix__Group__1__Impl rule__Matrix__Group__2 ;
    public final void rule__Matrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:491:1: ( rule__Matrix__Group__1__Impl rule__Matrix__Group__2 )
            // InternalQUBO.g:492:2: rule__Matrix__Group__1__Impl rule__Matrix__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Matrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__1"


    // $ANTLR start "rule__Matrix__Group__1__Impl"
    // InternalQUBO.g:499:1: rule__Matrix__Group__1__Impl : ( '[' ) ;
    public final void rule__Matrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:503:1: ( ( '[' ) )
            // InternalQUBO.g:504:1: ( '[' )
            {
            // InternalQUBO.g:504:1: ( '[' )
            // InternalQUBO.g:505:2: '['
            {
             before(grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__1__Impl"


    // $ANTLR start "rule__Matrix__Group__2"
    // InternalQUBO.g:514:1: rule__Matrix__Group__2 : rule__Matrix__Group__2__Impl rule__Matrix__Group__3 ;
    public final void rule__Matrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:518:1: ( rule__Matrix__Group__2__Impl rule__Matrix__Group__3 )
            // InternalQUBO.g:519:2: rule__Matrix__Group__2__Impl rule__Matrix__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Matrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__2"


    // $ANTLR start "rule__Matrix__Group__2__Impl"
    // InternalQUBO.g:526:1: rule__Matrix__Group__2__Impl : ( ( rule__Matrix__Group_2__0 )? ) ;
    public final void rule__Matrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:530:1: ( ( ( rule__Matrix__Group_2__0 )? ) )
            // InternalQUBO.g:531:1: ( ( rule__Matrix__Group_2__0 )? )
            {
            // InternalQUBO.g:531:1: ( ( rule__Matrix__Group_2__0 )? )
            // InternalQUBO.g:532:2: ( rule__Matrix__Group_2__0 )?
            {
             before(grammarAccess.getMatrixAccess().getGroup_2()); 
            // InternalQUBO.g:533:2: ( rule__Matrix__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQUBO.g:533:3: rule__Matrix__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matrix__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__2__Impl"


    // $ANTLR start "rule__Matrix__Group__3"
    // InternalQUBO.g:541:1: rule__Matrix__Group__3 : rule__Matrix__Group__3__Impl ;
    public final void rule__Matrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:545:1: ( rule__Matrix__Group__3__Impl )
            // InternalQUBO.g:546:2: rule__Matrix__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__3"


    // $ANTLR start "rule__Matrix__Group__3__Impl"
    // InternalQUBO.g:552:1: rule__Matrix__Group__3__Impl : ( ']' ) ;
    public final void rule__Matrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:556:1: ( ( ']' ) )
            // InternalQUBO.g:557:1: ( ']' )
            {
            // InternalQUBO.g:557:1: ( ']' )
            // InternalQUBO.g:558:2: ']'
            {
             before(grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__3__Impl"


    // $ANTLR start "rule__Matrix__Group_2__0"
    // InternalQUBO.g:568:1: rule__Matrix__Group_2__0 : rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1 ;
    public final void rule__Matrix__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:572:1: ( rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1 )
            // InternalQUBO.g:573:2: rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Matrix__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__0"


    // $ANTLR start "rule__Matrix__Group_2__0__Impl"
    // InternalQUBO.g:580:1: rule__Matrix__Group_2__0__Impl : ( ( rule__Matrix__RowsAssignment_2_0 ) ) ;
    public final void rule__Matrix__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:584:1: ( ( ( rule__Matrix__RowsAssignment_2_0 ) ) )
            // InternalQUBO.g:585:1: ( ( rule__Matrix__RowsAssignment_2_0 ) )
            {
            // InternalQUBO.g:585:1: ( ( rule__Matrix__RowsAssignment_2_0 ) )
            // InternalQUBO.g:586:2: ( rule__Matrix__RowsAssignment_2_0 )
            {
             before(grammarAccess.getMatrixAccess().getRowsAssignment_2_0()); 
            // InternalQUBO.g:587:2: ( rule__Matrix__RowsAssignment_2_0 )
            // InternalQUBO.g:587:3: rule__Matrix__RowsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__RowsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getRowsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__0__Impl"


    // $ANTLR start "rule__Matrix__Group_2__1"
    // InternalQUBO.g:595:1: rule__Matrix__Group_2__1 : rule__Matrix__Group_2__1__Impl ;
    public final void rule__Matrix__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:599:1: ( rule__Matrix__Group_2__1__Impl )
            // InternalQUBO.g:600:2: rule__Matrix__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__1"


    // $ANTLR start "rule__Matrix__Group_2__1__Impl"
    // InternalQUBO.g:606:1: rule__Matrix__Group_2__1__Impl : ( ( rule__Matrix__Group_2_1__0 )* ) ;
    public final void rule__Matrix__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:610:1: ( ( ( rule__Matrix__Group_2_1__0 )* ) )
            // InternalQUBO.g:611:1: ( ( rule__Matrix__Group_2_1__0 )* )
            {
            // InternalQUBO.g:611:1: ( ( rule__Matrix__Group_2_1__0 )* )
            // InternalQUBO.g:612:2: ( rule__Matrix__Group_2_1__0 )*
            {
             before(grammarAccess.getMatrixAccess().getGroup_2_1()); 
            // InternalQUBO.g:613:2: ( rule__Matrix__Group_2_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQUBO.g:613:3: rule__Matrix__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Matrix__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMatrixAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__1__Impl"


    // $ANTLR start "rule__Matrix__Group_2_1__0"
    // InternalQUBO.g:622:1: rule__Matrix__Group_2_1__0 : rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1 ;
    public final void rule__Matrix__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:626:1: ( rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1 )
            // InternalQUBO.g:627:2: rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Matrix__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__0"


    // $ANTLR start "rule__Matrix__Group_2_1__0__Impl"
    // InternalQUBO.g:634:1: rule__Matrix__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Matrix__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:638:1: ( ( ',' ) )
            // InternalQUBO.g:639:1: ( ',' )
            {
            // InternalQUBO.g:639:1: ( ',' )
            // InternalQUBO.g:640:2: ','
            {
             before(grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__0__Impl"


    // $ANTLR start "rule__Matrix__Group_2_1__1"
    // InternalQUBO.g:649:1: rule__Matrix__Group_2_1__1 : rule__Matrix__Group_2_1__1__Impl ;
    public final void rule__Matrix__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:653:1: ( rule__Matrix__Group_2_1__1__Impl )
            // InternalQUBO.g:654:2: rule__Matrix__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__1"


    // $ANTLR start "rule__Matrix__Group_2_1__1__Impl"
    // InternalQUBO.g:660:1: rule__Matrix__Group_2_1__1__Impl : ( ( rule__Matrix__RowsAssignment_2_1_1 ) ) ;
    public final void rule__Matrix__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:664:1: ( ( ( rule__Matrix__RowsAssignment_2_1_1 ) ) )
            // InternalQUBO.g:665:1: ( ( rule__Matrix__RowsAssignment_2_1_1 ) )
            {
            // InternalQUBO.g:665:1: ( ( rule__Matrix__RowsAssignment_2_1_1 ) )
            // InternalQUBO.g:666:2: ( rule__Matrix__RowsAssignment_2_1_1 )
            {
             before(grammarAccess.getMatrixAccess().getRowsAssignment_2_1_1()); 
            // InternalQUBO.g:667:2: ( rule__Matrix__RowsAssignment_2_1_1 )
            // InternalQUBO.g:667:3: rule__Matrix__RowsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__RowsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getRowsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__1__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalQUBO.g:676:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:680:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalQUBO.g:681:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalQUBO.g:688:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:692:1: ( ( () ) )
            // InternalQUBO.g:693:1: ( () )
            {
            // InternalQUBO.g:693:1: ( () )
            // InternalQUBO.g:694:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_0()); 
            // InternalQUBO.g:695:2: ()
            // InternalQUBO.g:695:3: 
            {
            }

             after(grammarAccess.getRowAccess().getRowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalQUBO.g:703:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:707:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalQUBO.g:708:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalQUBO.g:715:1: rule__Row__Group__1__Impl : ( '[' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:719:1: ( ( '[' ) )
            // InternalQUBO.g:720:1: ( '[' )
            {
            // InternalQUBO.g:720:1: ( '[' )
            // InternalQUBO.g:721:2: '['
            {
             before(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalQUBO.g:730:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:734:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalQUBO.g:735:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalQUBO.g:742:1: rule__Row__Group__2__Impl : ( ( rule__Row__Group_2__0 )? ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:746:1: ( ( ( rule__Row__Group_2__0 )? ) )
            // InternalQUBO.g:747:1: ( ( rule__Row__Group_2__0 )? )
            {
            // InternalQUBO.g:747:1: ( ( rule__Row__Group_2__0 )? )
            // InternalQUBO.g:748:2: ( rule__Row__Group_2__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_2()); 
            // InternalQUBO.g:749:2: ( rule__Row__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_E_INT && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQUBO.g:749:3: rule__Row__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalQUBO.g:757:1: rule__Row__Group__3 : rule__Row__Group__3__Impl ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:761:1: ( rule__Row__Group__3__Impl )
            // InternalQUBO.g:762:2: rule__Row__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalQUBO.g:768:1: rule__Row__Group__3__Impl : ( ']' ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:772:1: ( ( ']' ) )
            // InternalQUBO.g:773:1: ( ']' )
            {
            // InternalQUBO.g:773:1: ( ']' )
            // InternalQUBO.g:774:2: ']'
            {
             before(grammarAccess.getRowAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group_2__0"
    // InternalQUBO.g:784:1: rule__Row__Group_2__0 : rule__Row__Group_2__0__Impl rule__Row__Group_2__1 ;
    public final void rule__Row__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:788:1: ( rule__Row__Group_2__0__Impl rule__Row__Group_2__1 )
            // InternalQUBO.g:789:2: rule__Row__Group_2__0__Impl rule__Row__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Row__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__0"


    // $ANTLR start "rule__Row__Group_2__0__Impl"
    // InternalQUBO.g:796:1: rule__Row__Group_2__0__Impl : ( ( rule__Row__ColumnsAssignment_2_0 ) ) ;
    public final void rule__Row__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:800:1: ( ( ( rule__Row__ColumnsAssignment_2_0 ) ) )
            // InternalQUBO.g:801:1: ( ( rule__Row__ColumnsAssignment_2_0 ) )
            {
            // InternalQUBO.g:801:1: ( ( rule__Row__ColumnsAssignment_2_0 ) )
            // InternalQUBO.g:802:2: ( rule__Row__ColumnsAssignment_2_0 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_2_0()); 
            // InternalQUBO.g:803:2: ( rule__Row__ColumnsAssignment_2_0 )
            // InternalQUBO.g:803:3: rule__Row__ColumnsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__0__Impl"


    // $ANTLR start "rule__Row__Group_2__1"
    // InternalQUBO.g:811:1: rule__Row__Group_2__1 : rule__Row__Group_2__1__Impl ;
    public final void rule__Row__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:815:1: ( rule__Row__Group_2__1__Impl )
            // InternalQUBO.g:816:2: rule__Row__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__1"


    // $ANTLR start "rule__Row__Group_2__1__Impl"
    // InternalQUBO.g:822:1: rule__Row__Group_2__1__Impl : ( ( rule__Row__Group_2_1__0 )* ) ;
    public final void rule__Row__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:826:1: ( ( ( rule__Row__Group_2_1__0 )* ) )
            // InternalQUBO.g:827:1: ( ( rule__Row__Group_2_1__0 )* )
            {
            // InternalQUBO.g:827:1: ( ( rule__Row__Group_2_1__0 )* )
            // InternalQUBO.g:828:2: ( rule__Row__Group_2_1__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_2_1()); 
            // InternalQUBO.g:829:2: ( rule__Row__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQUBO.g:829:3: rule__Row__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Row__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__1__Impl"


    // $ANTLR start "rule__Row__Group_2_1__0"
    // InternalQUBO.g:838:1: rule__Row__Group_2_1__0 : rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1 ;
    public final void rule__Row__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:842:1: ( rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1 )
            // InternalQUBO.g:843:2: rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Row__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__0"


    // $ANTLR start "rule__Row__Group_2_1__0__Impl"
    // InternalQUBO.g:850:1: rule__Row__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:854:1: ( ( ',' ) )
            // InternalQUBO.g:855:1: ( ',' )
            {
            // InternalQUBO.g:855:1: ( ',' )
            // InternalQUBO.g:856:2: ','
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__0__Impl"


    // $ANTLR start "rule__Row__Group_2_1__1"
    // InternalQUBO.g:865:1: rule__Row__Group_2_1__1 : rule__Row__Group_2_1__1__Impl ;
    public final void rule__Row__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:869:1: ( rule__Row__Group_2_1__1__Impl )
            // InternalQUBO.g:870:2: rule__Row__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__1"


    // $ANTLR start "rule__Row__Group_2_1__1__Impl"
    // InternalQUBO.g:876:1: rule__Row__Group_2_1__1__Impl : ( ( rule__Row__ColumnsAssignment_2_1_1 ) ) ;
    public final void rule__Row__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:880:1: ( ( ( rule__Row__ColumnsAssignment_2_1_1 ) ) )
            // InternalQUBO.g:881:1: ( ( rule__Row__ColumnsAssignment_2_1_1 ) )
            {
            // InternalQUBO.g:881:1: ( ( rule__Row__ColumnsAssignment_2_1_1 ) )
            // InternalQUBO.g:882:2: ( rule__Row__ColumnsAssignment_2_1_1 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_2_1_1()); 
            // InternalQUBO.g:883:2: ( rule__Row__ColumnsAssignment_2_1_1 )
            // InternalQUBO.g:883:3: rule__Row__ColumnsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalQUBO.g:892:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:896:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalQUBO.g:897:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalQUBO.g:904:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:908:1: ( ( () ) )
            // InternalQUBO.g:909:1: ( () )
            {
            // InternalQUBO.g:909:1: ( () )
            // InternalQUBO.g:910:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalQUBO.g:911:2: ()
            // InternalQUBO.g:911:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalQUBO.g:919:1: rule__Column__Group__1 : rule__Column__Group__1__Impl ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:923:1: ( rule__Column__Group__1__Impl )
            // InternalQUBO.g:924:2: rule__Column__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalQUBO.g:930:1: rule__Column__Group__1__Impl : ( ( rule__Column__ValueAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:934:1: ( ( ( rule__Column__ValueAssignment_1 ) ) )
            // InternalQUBO.g:935:1: ( ( rule__Column__ValueAssignment_1 ) )
            {
            // InternalQUBO.g:935:1: ( ( rule__Column__ValueAssignment_1 ) )
            // InternalQUBO.g:936:2: ( rule__Column__ValueAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getValueAssignment_1()); 
            // InternalQUBO.g:937:2: ( rule__Column__ValueAssignment_1 )
            // InternalQUBO.g:937:3: rule__Column__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Qubo__NameAssignment_2"
    // InternalQUBO.g:946:1: rule__Qubo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Qubo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:950:1: ( ( ruleEString ) )
            // InternalQUBO.g:951:2: ( ruleEString )
            {
            // InternalQUBO.g:951:2: ( ruleEString )
            // InternalQUBO.g:952:3: ruleEString
            {
             before(grammarAccess.getQuboAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuboAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__NameAssignment_2"


    // $ANTLR start "rule__Qubo__MatrixAssignment_4_1"
    // InternalQUBO.g:961:1: rule__Qubo__MatrixAssignment_4_1 : ( ruleMatrix ) ;
    public final void rule__Qubo__MatrixAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:965:1: ( ( ruleMatrix ) )
            // InternalQUBO.g:966:2: ( ruleMatrix )
            {
            // InternalQUBO.g:966:2: ( ruleMatrix )
            // InternalQUBO.g:967:3: ruleMatrix
            {
             before(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__MatrixAssignment_4_1"


    // $ANTLR start "rule__Matrix__RowsAssignment_2_0"
    // InternalQUBO.g:976:1: rule__Matrix__RowsAssignment_2_0 : ( ruleRow ) ;
    public final void rule__Matrix__RowsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:980:1: ( ( ruleRow ) )
            // InternalQUBO.g:981:2: ( ruleRow )
            {
            // InternalQUBO.g:981:2: ( ruleRow )
            // InternalQUBO.g:982:3: ruleRow
            {
             before(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__RowsAssignment_2_0"


    // $ANTLR start "rule__Matrix__RowsAssignment_2_1_1"
    // InternalQUBO.g:991:1: rule__Matrix__RowsAssignment_2_1_1 : ( ruleRow ) ;
    public final void rule__Matrix__RowsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:995:1: ( ( ruleRow ) )
            // InternalQUBO.g:996:2: ( ruleRow )
            {
            // InternalQUBO.g:996:2: ( ruleRow )
            // InternalQUBO.g:997:3: ruleRow
            {
             before(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__RowsAssignment_2_1_1"


    // $ANTLR start "rule__Row__ColumnsAssignment_2_0"
    // InternalQUBO.g:1006:1: rule__Row__ColumnsAssignment_2_0 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1010:1: ( ( ruleColumn ) )
            // InternalQUBO.g:1011:2: ( ruleColumn )
            {
            // InternalQUBO.g:1011:2: ( ruleColumn )
            // InternalQUBO.g:1012:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ColumnsAssignment_2_0"


    // $ANTLR start "rule__Row__ColumnsAssignment_2_1_1"
    // InternalQUBO.g:1021:1: rule__Row__ColumnsAssignment_2_1_1 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1025:1: ( ( ruleColumn ) )
            // InternalQUBO.g:1026:2: ( ruleColumn )
            {
            // InternalQUBO.g:1026:2: ( ruleColumn )
            // InternalQUBO.g:1027:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ColumnsAssignment_2_1_1"


    // $ANTLR start "rule__Column__ValueAssignment_1"
    // InternalQUBO.g:1036:1: rule__Column__ValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Column__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1040:1: ( ( ruleEDouble ) )
            // InternalQUBO.g:1041:2: ( ruleEDouble )
            {
            // InternalQUBO.g:1041:2: ( ruleEDouble )
            // InternalQUBO.g:1042:3: ruleEDouble
            {
             before(grammarAccess.getColumnAccess().getValueEDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getValueEDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});

}