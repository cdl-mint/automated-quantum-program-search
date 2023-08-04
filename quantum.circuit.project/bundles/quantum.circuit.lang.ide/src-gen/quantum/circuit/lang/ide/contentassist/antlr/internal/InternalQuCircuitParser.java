package quantum.circuit.lang.ide.contentassist.antlr.internal;

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
import quantum.circuit.lang.services.QuCircuitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuCircuitParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'NONE'", "'SHIFT'", "'CHANGE_BLOCK'", "'QuantumCircuit'", "'{'", "'}'", "'QuantumRegister'", "'NumberOfQubits'", "'ClassicRegister'", "'NumberOfBits'", "'Layer'", "','", "'StatePreparation'", "'operation'", "'targetQubits'", "'['", "']'", "'ElementaryQuantumGate'", "'('", "')'", "'controlQubits'", "'angleParameter'", "'AngleParameter'", "'theta'", "'phi'", "'lambda'", "'Measurement'", "'classicBits'", "'CompositeQuantumGate'", "'Loop'", "'loop'", "'loopTargetQubits'", "'iterations'", "'targetQubitsBlockSize'", "'controlQubitsBlockSize'", "'controlQubitsIterationType'", "'targetQubitsIterationType'", "'incrementBy'", "'operations'", "'fixedControlQubits'", "'fixedTargetQubits'", "'loopControlQubits'", "'-'", "'.'", "'inverseForm'", "'incrementBlockTargetQubits'", "'incrementBlockControlQubits'", "'incrementTargetQubits'", "'incrementControlQubits'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(QuCircuitGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQuantumCircuit"
    // InternalQuCircuit.g:53:1: entryRuleQuantumCircuit : ruleQuantumCircuit EOF ;
    public final void entryRuleQuantumCircuit() throws RecognitionException {
        try {
            // InternalQuCircuit.g:54:1: ( ruleQuantumCircuit EOF )
            // InternalQuCircuit.g:55:1: ruleQuantumCircuit EOF
            {
             before(grammarAccess.getQuantumCircuitRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantumCircuit();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitRule()); 
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
    // $ANTLR end "entryRuleQuantumCircuit"


    // $ANTLR start "ruleQuantumCircuit"
    // InternalQuCircuit.g:62:1: ruleQuantumCircuit : ( ( rule__QuantumCircuit__Group__0 ) ) ;
    public final void ruleQuantumCircuit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:66:2: ( ( ( rule__QuantumCircuit__Group__0 ) ) )
            // InternalQuCircuit.g:67:2: ( ( rule__QuantumCircuit__Group__0 ) )
            {
            // InternalQuCircuit.g:67:2: ( ( rule__QuantumCircuit__Group__0 ) )
            // InternalQuCircuit.g:68:3: ( rule__QuantumCircuit__Group__0 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getGroup()); 
            // InternalQuCircuit.g:69:3: ( rule__QuantumCircuit__Group__0 )
            // InternalQuCircuit.g:69:4: rule__QuantumCircuit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getGroup()); 

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
    // $ANTLR end "ruleQuantumCircuit"


    // $ANTLR start "entryRuleQuantumRegister"
    // InternalQuCircuit.g:78:1: entryRuleQuantumRegister : ruleQuantumRegister EOF ;
    public final void entryRuleQuantumRegister() throws RecognitionException {
        try {
            // InternalQuCircuit.g:79:1: ( ruleQuantumRegister EOF )
            // InternalQuCircuit.g:80:1: ruleQuantumRegister EOF
            {
             before(grammarAccess.getQuantumRegisterRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantumRegister();

            state._fsp--;

             after(grammarAccess.getQuantumRegisterRule()); 
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
    // $ANTLR end "entryRuleQuantumRegister"


    // $ANTLR start "ruleQuantumRegister"
    // InternalQuCircuit.g:87:1: ruleQuantumRegister : ( ( rule__QuantumRegister__Group__0 ) ) ;
    public final void ruleQuantumRegister() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:91:2: ( ( ( rule__QuantumRegister__Group__0 ) ) )
            // InternalQuCircuit.g:92:2: ( ( rule__QuantumRegister__Group__0 ) )
            {
            // InternalQuCircuit.g:92:2: ( ( rule__QuantumRegister__Group__0 ) )
            // InternalQuCircuit.g:93:3: ( rule__QuantumRegister__Group__0 )
            {
             before(grammarAccess.getQuantumRegisterAccess().getGroup()); 
            // InternalQuCircuit.g:94:3: ( rule__QuantumRegister__Group__0 )
            // InternalQuCircuit.g:94:4: rule__QuantumRegister__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantumRegisterAccess().getGroup()); 

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
    // $ANTLR end "ruleQuantumRegister"


    // $ANTLR start "entryRuleClassicRegister"
    // InternalQuCircuit.g:103:1: entryRuleClassicRegister : ruleClassicRegister EOF ;
    public final void entryRuleClassicRegister() throws RecognitionException {
        try {
            // InternalQuCircuit.g:104:1: ( ruleClassicRegister EOF )
            // InternalQuCircuit.g:105:1: ruleClassicRegister EOF
            {
             before(grammarAccess.getClassicRegisterRule()); 
            pushFollow(FOLLOW_1);
            ruleClassicRegister();

            state._fsp--;

             after(grammarAccess.getClassicRegisterRule()); 
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
    // $ANTLR end "entryRuleClassicRegister"


    // $ANTLR start "ruleClassicRegister"
    // InternalQuCircuit.g:112:1: ruleClassicRegister : ( ( rule__ClassicRegister__Group__0 ) ) ;
    public final void ruleClassicRegister() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:116:2: ( ( ( rule__ClassicRegister__Group__0 ) ) )
            // InternalQuCircuit.g:117:2: ( ( rule__ClassicRegister__Group__0 ) )
            {
            // InternalQuCircuit.g:117:2: ( ( rule__ClassicRegister__Group__0 ) )
            // InternalQuCircuit.g:118:3: ( rule__ClassicRegister__Group__0 )
            {
             before(grammarAccess.getClassicRegisterAccess().getGroup()); 
            // InternalQuCircuit.g:119:3: ( rule__ClassicRegister__Group__0 )
            // InternalQuCircuit.g:119:4: rule__ClassicRegister__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassicRegisterAccess().getGroup()); 

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
    // $ANTLR end "ruleClassicRegister"


    // $ANTLR start "entryRuleLayer"
    // InternalQuCircuit.g:128:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalQuCircuit.g:129:1: ( ruleLayer EOF )
            // InternalQuCircuit.g:130:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalQuCircuit.g:137:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:141:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalQuCircuit.g:142:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalQuCircuit.g:142:2: ( ( rule__Layer__Group__0 ) )
            // InternalQuCircuit.g:143:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalQuCircuit.g:144:3: ( rule__Layer__Group__0 )
            // InternalQuCircuit.g:144:4: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

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
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleQuantumOperation"
    // InternalQuCircuit.g:153:1: entryRuleQuantumOperation : ruleQuantumOperation EOF ;
    public final void entryRuleQuantumOperation() throws RecognitionException {
        try {
            // InternalQuCircuit.g:154:1: ( ruleQuantumOperation EOF )
            // InternalQuCircuit.g:155:1: ruleQuantumOperation EOF
            {
             before(grammarAccess.getQuantumOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantumOperation();

            state._fsp--;

             after(grammarAccess.getQuantumOperationRule()); 
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
    // $ANTLR end "entryRuleQuantumOperation"


    // $ANTLR start "ruleQuantumOperation"
    // InternalQuCircuit.g:162:1: ruleQuantumOperation : ( ( rule__QuantumOperation__Alternatives ) ) ;
    public final void ruleQuantumOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:166:2: ( ( ( rule__QuantumOperation__Alternatives ) ) )
            // InternalQuCircuit.g:167:2: ( ( rule__QuantumOperation__Alternatives ) )
            {
            // InternalQuCircuit.g:167:2: ( ( rule__QuantumOperation__Alternatives ) )
            // InternalQuCircuit.g:168:3: ( rule__QuantumOperation__Alternatives )
            {
             before(grammarAccess.getQuantumOperationAccess().getAlternatives()); 
            // InternalQuCircuit.g:169:3: ( rule__QuantumOperation__Alternatives )
            // InternalQuCircuit.g:169:4: rule__QuantumOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QuantumOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantumOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuantumOperation"


    // $ANTLR start "entryRuleStatePreparation"
    // InternalQuCircuit.g:178:1: entryRuleStatePreparation : ruleStatePreparation EOF ;
    public final void entryRuleStatePreparation() throws RecognitionException {
        try {
            // InternalQuCircuit.g:179:1: ( ruleStatePreparation EOF )
            // InternalQuCircuit.g:180:1: ruleStatePreparation EOF
            {
             before(grammarAccess.getStatePreparationRule()); 
            pushFollow(FOLLOW_1);
            ruleStatePreparation();

            state._fsp--;

             after(grammarAccess.getStatePreparationRule()); 
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
    // $ANTLR end "entryRuleStatePreparation"


    // $ANTLR start "ruleStatePreparation"
    // InternalQuCircuit.g:187:1: ruleStatePreparation : ( ( rule__StatePreparation__Group__0 ) ) ;
    public final void ruleStatePreparation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:191:2: ( ( ( rule__StatePreparation__Group__0 ) ) )
            // InternalQuCircuit.g:192:2: ( ( rule__StatePreparation__Group__0 ) )
            {
            // InternalQuCircuit.g:192:2: ( ( rule__StatePreparation__Group__0 ) )
            // InternalQuCircuit.g:193:3: ( rule__StatePreparation__Group__0 )
            {
             before(grammarAccess.getStatePreparationAccess().getGroup()); 
            // InternalQuCircuit.g:194:3: ( rule__StatePreparation__Group__0 )
            // InternalQuCircuit.g:194:4: rule__StatePreparation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getGroup()); 

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
    // $ANTLR end "ruleStatePreparation"


    // $ANTLR start "entryRuleElementaryQuantumGate"
    // InternalQuCircuit.g:203:1: entryRuleElementaryQuantumGate : ruleElementaryQuantumGate EOF ;
    public final void entryRuleElementaryQuantumGate() throws RecognitionException {
        try {
            // InternalQuCircuit.g:204:1: ( ruleElementaryQuantumGate EOF )
            // InternalQuCircuit.g:205:1: ruleElementaryQuantumGate EOF
            {
             before(grammarAccess.getElementaryQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            ruleElementaryQuantumGate();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateRule()); 
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
    // $ANTLR end "entryRuleElementaryQuantumGate"


    // $ANTLR start "ruleElementaryQuantumGate"
    // InternalQuCircuit.g:212:1: ruleElementaryQuantumGate : ( ( rule__ElementaryQuantumGate__Group__0 ) ) ;
    public final void ruleElementaryQuantumGate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:216:2: ( ( ( rule__ElementaryQuantumGate__Group__0 ) ) )
            // InternalQuCircuit.g:217:2: ( ( rule__ElementaryQuantumGate__Group__0 ) )
            {
            // InternalQuCircuit.g:217:2: ( ( rule__ElementaryQuantumGate__Group__0 ) )
            // InternalQuCircuit.g:218:3: ( rule__ElementaryQuantumGate__Group__0 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup()); 
            // InternalQuCircuit.g:219:3: ( rule__ElementaryQuantumGate__Group__0 )
            // InternalQuCircuit.g:219:4: rule__ElementaryQuantumGate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup()); 

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
    // $ANTLR end "ruleElementaryQuantumGate"


    // $ANTLR start "entryRuleAngleParameter"
    // InternalQuCircuit.g:228:1: entryRuleAngleParameter : ruleAngleParameter EOF ;
    public final void entryRuleAngleParameter() throws RecognitionException {
        try {
            // InternalQuCircuit.g:229:1: ( ruleAngleParameter EOF )
            // InternalQuCircuit.g:230:1: ruleAngleParameter EOF
            {
             before(grammarAccess.getAngleParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleAngleParameter();

            state._fsp--;

             after(grammarAccess.getAngleParameterRule()); 
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
    // $ANTLR end "entryRuleAngleParameter"


    // $ANTLR start "ruleAngleParameter"
    // InternalQuCircuit.g:237:1: ruleAngleParameter : ( ( rule__AngleParameter__Group__0 ) ) ;
    public final void ruleAngleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:241:2: ( ( ( rule__AngleParameter__Group__0 ) ) )
            // InternalQuCircuit.g:242:2: ( ( rule__AngleParameter__Group__0 ) )
            {
            // InternalQuCircuit.g:242:2: ( ( rule__AngleParameter__Group__0 ) )
            // InternalQuCircuit.g:243:3: ( rule__AngleParameter__Group__0 )
            {
             before(grammarAccess.getAngleParameterAccess().getGroup()); 
            // InternalQuCircuit.g:244:3: ( rule__AngleParameter__Group__0 )
            // InternalQuCircuit.g:244:4: rule__AngleParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleAngleParameter"


    // $ANTLR start "entryRuleMeasurement"
    // InternalQuCircuit.g:253:1: entryRuleMeasurement : ruleMeasurement EOF ;
    public final void entryRuleMeasurement() throws RecognitionException {
        try {
            // InternalQuCircuit.g:254:1: ( ruleMeasurement EOF )
            // InternalQuCircuit.g:255:1: ruleMeasurement EOF
            {
             before(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasurement();

            state._fsp--;

             after(grammarAccess.getMeasurementRule()); 
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
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // InternalQuCircuit.g:262:1: ruleMeasurement : ( ( rule__Measurement__Group__0 ) ) ;
    public final void ruleMeasurement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:266:2: ( ( ( rule__Measurement__Group__0 ) ) )
            // InternalQuCircuit.g:267:2: ( ( rule__Measurement__Group__0 ) )
            {
            // InternalQuCircuit.g:267:2: ( ( rule__Measurement__Group__0 ) )
            // InternalQuCircuit.g:268:3: ( rule__Measurement__Group__0 )
            {
             before(grammarAccess.getMeasurementAccess().getGroup()); 
            // InternalQuCircuit.g:269:3: ( rule__Measurement__Group__0 )
            // InternalQuCircuit.g:269:4: rule__Measurement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getGroup()); 

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
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleCompositeQuantumGate"
    // InternalQuCircuit.g:278:1: entryRuleCompositeQuantumGate : ruleCompositeQuantumGate EOF ;
    public final void entryRuleCompositeQuantumGate() throws RecognitionException {
        try {
            // InternalQuCircuit.g:279:1: ( ruleCompositeQuantumGate EOF )
            // InternalQuCircuit.g:280:1: ruleCompositeQuantumGate EOF
            {
             before(grammarAccess.getCompositeQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeQuantumGate();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateRule()); 
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
    // $ANTLR end "entryRuleCompositeQuantumGate"


    // $ANTLR start "ruleCompositeQuantumGate"
    // InternalQuCircuit.g:287:1: ruleCompositeQuantumGate : ( ( rule__CompositeQuantumGate__Group__0 ) ) ;
    public final void ruleCompositeQuantumGate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:291:2: ( ( ( rule__CompositeQuantumGate__Group__0 ) ) )
            // InternalQuCircuit.g:292:2: ( ( rule__CompositeQuantumGate__Group__0 ) )
            {
            // InternalQuCircuit.g:292:2: ( ( rule__CompositeQuantumGate__Group__0 ) )
            // InternalQuCircuit.g:293:3: ( rule__CompositeQuantumGate__Group__0 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup()); 
            // InternalQuCircuit.g:294:3: ( rule__CompositeQuantumGate__Group__0 )
            // InternalQuCircuit.g:294:4: rule__CompositeQuantumGate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup()); 

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
    // $ANTLR end "ruleCompositeQuantumGate"


    // $ANTLR start "entryRuleLoop"
    // InternalQuCircuit.g:303:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalQuCircuit.g:304:1: ( ruleLoop EOF )
            // InternalQuCircuit.g:305:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalQuCircuit.g:312:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:316:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalQuCircuit.g:317:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalQuCircuit.g:317:2: ( ( rule__Loop__Group__0 ) )
            // InternalQuCircuit.g:318:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalQuCircuit.g:319:3: ( rule__Loop__Group__0 )
            // InternalQuCircuit.g:319:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleOperation"
    // InternalQuCircuit.g:328:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalQuCircuit.g:329:1: ( ruleOperation EOF )
            // InternalQuCircuit.g:330:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalQuCircuit.g:337:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:341:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalQuCircuit.g:342:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalQuCircuit.g:342:2: ( ( rule__Operation__Group__0 ) )
            // InternalQuCircuit.g:343:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalQuCircuit.g:344:3: ( rule__Operation__Group__0 )
            // InternalQuCircuit.g:344:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelector"
    // InternalQuCircuit.g:353:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalQuCircuit.g:354:1: ( ruleSelector EOF )
            // InternalQuCircuit.g:355:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalQuCircuit.g:362:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:366:2: ( ( ( rule__Selector__Alternatives ) ) )
            // InternalQuCircuit.g:367:2: ( ( rule__Selector__Alternatives ) )
            {
            // InternalQuCircuit.g:367:2: ( ( rule__Selector__Alternatives ) )
            // InternalQuCircuit.g:368:3: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // InternalQuCircuit.g:369:3: ( rule__Selector__Alternatives )
            // InternalQuCircuit.g:369:4: rule__Selector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleElementSelector"
    // InternalQuCircuit.g:378:1: entryRuleElementSelector : ruleElementSelector EOF ;
    public final void entryRuleElementSelector() throws RecognitionException {
        try {
            // InternalQuCircuit.g:379:1: ( ruleElementSelector EOF )
            // InternalQuCircuit.g:380:1: ruleElementSelector EOF
            {
             before(grammarAccess.getElementSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleElementSelector();

            state._fsp--;

             after(grammarAccess.getElementSelectorRule()); 
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
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // InternalQuCircuit.g:387:1: ruleElementSelector : ( ( rule__ElementSelector__Group__0 ) ) ;
    public final void ruleElementSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:391:2: ( ( ( rule__ElementSelector__Group__0 ) ) )
            // InternalQuCircuit.g:392:2: ( ( rule__ElementSelector__Group__0 ) )
            {
            // InternalQuCircuit.g:392:2: ( ( rule__ElementSelector__Group__0 ) )
            // InternalQuCircuit.g:393:3: ( rule__ElementSelector__Group__0 )
            {
             before(grammarAccess.getElementSelectorAccess().getGroup()); 
            // InternalQuCircuit.g:394:3: ( rule__ElementSelector__Group__0 )
            // InternalQuCircuit.g:394:4: rule__ElementSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleRangeSelector"
    // InternalQuCircuit.g:403:1: entryRuleRangeSelector : ruleRangeSelector EOF ;
    public final void entryRuleRangeSelector() throws RecognitionException {
        try {
            // InternalQuCircuit.g:404:1: ( ruleRangeSelector EOF )
            // InternalQuCircuit.g:405:1: ruleRangeSelector EOF
            {
             before(grammarAccess.getRangeSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleRangeSelector();

            state._fsp--;

             after(grammarAccess.getRangeSelectorRule()); 
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
    // $ANTLR end "entryRuleRangeSelector"


    // $ANTLR start "ruleRangeSelector"
    // InternalQuCircuit.g:412:1: ruleRangeSelector : ( ( rule__RangeSelector__Group__0 ) ) ;
    public final void ruleRangeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:416:2: ( ( ( rule__RangeSelector__Group__0 ) ) )
            // InternalQuCircuit.g:417:2: ( ( rule__RangeSelector__Group__0 ) )
            {
            // InternalQuCircuit.g:417:2: ( ( rule__RangeSelector__Group__0 ) )
            // InternalQuCircuit.g:418:3: ( rule__RangeSelector__Group__0 )
            {
             before(grammarAccess.getRangeSelectorAccess().getGroup()); 
            // InternalQuCircuit.g:419:3: ( rule__RangeSelector__Group__0 )
            // InternalQuCircuit.g:419:4: rule__RangeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleRangeSelector"


    // $ANTLR start "entryRuleEString"
    // InternalQuCircuit.g:428:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQuCircuit.g:429:1: ( ruleEString EOF )
            // InternalQuCircuit.g:430:1: ruleEString EOF
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
    // InternalQuCircuit.g:437:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:441:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQuCircuit.g:442:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQuCircuit.g:442:2: ( ( rule__EString__Alternatives ) )
            // InternalQuCircuit.g:443:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQuCircuit.g:444:3: ( rule__EString__Alternatives )
            // InternalQuCircuit.g:444:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalQuCircuit.g:453:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalQuCircuit.g:454:1: ( ruleEDoubleObject EOF )
            // InternalQuCircuit.g:455:1: ruleEDoubleObject EOF
            {
             before(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getEDoubleObjectRule()); 
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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalQuCircuit.g:462:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Group__0 ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:466:2: ( ( ( rule__EDoubleObject__Group__0 ) ) )
            // InternalQuCircuit.g:467:2: ( ( rule__EDoubleObject__Group__0 ) )
            {
            // InternalQuCircuit.g:467:2: ( ( rule__EDoubleObject__Group__0 ) )
            // InternalQuCircuit.g:468:3: ( rule__EDoubleObject__Group__0 )
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup()); 
            // InternalQuCircuit.g:469:3: ( rule__EDoubleObject__Group__0 )
            // InternalQuCircuit.g:469:4: rule__EDoubleObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "ruleITERATION_TYPE"
    // InternalQuCircuit.g:478:1: ruleITERATION_TYPE : ( ( rule__ITERATION_TYPE__Alternatives ) ) ;
    public final void ruleITERATION_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:482:1: ( ( ( rule__ITERATION_TYPE__Alternatives ) ) )
            // InternalQuCircuit.g:483:2: ( ( rule__ITERATION_TYPE__Alternatives ) )
            {
            // InternalQuCircuit.g:483:2: ( ( rule__ITERATION_TYPE__Alternatives ) )
            // InternalQuCircuit.g:484:3: ( rule__ITERATION_TYPE__Alternatives )
            {
             before(grammarAccess.getITERATION_TYPEAccess().getAlternatives()); 
            // InternalQuCircuit.g:485:3: ( rule__ITERATION_TYPE__Alternatives )
            // InternalQuCircuit.g:485:4: rule__ITERATION_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ITERATION_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getITERATION_TYPEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleITERATION_TYPE"


    // $ANTLR start "rule__QuantumOperation__Alternatives"
    // InternalQuCircuit.g:493:1: rule__QuantumOperation__Alternatives : ( ( ruleStatePreparation ) | ( ruleElementaryQuantumGate ) | ( ruleMeasurement ) | ( ruleCompositeQuantumGate ) | ( ruleLoop ) );
    public final void rule__QuantumOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:497:1: ( ( ruleStatePreparation ) | ( ruleElementaryQuantumGate ) | ( ruleMeasurement ) | ( ruleCompositeQuantumGate ) | ( ruleLoop ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 39:
                {
                alt1=3;
                }
                break;
            case 41:
                {
                alt1=4;
                }
                break;
            case 42:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalQuCircuit.g:498:2: ( ruleStatePreparation )
                    {
                    // InternalQuCircuit.g:498:2: ( ruleStatePreparation )
                    // InternalQuCircuit.g:499:3: ruleStatePreparation
                    {
                     before(grammarAccess.getQuantumOperationAccess().getStatePreparationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStatePreparation();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getStatePreparationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:504:2: ( ruleElementaryQuantumGate )
                    {
                    // InternalQuCircuit.g:504:2: ( ruleElementaryQuantumGate )
                    // InternalQuCircuit.g:505:3: ruleElementaryQuantumGate
                    {
                     before(grammarAccess.getQuantumOperationAccess().getElementaryQuantumGateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElementaryQuantumGate();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getElementaryQuantumGateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:510:2: ( ruleMeasurement )
                    {
                    // InternalQuCircuit.g:510:2: ( ruleMeasurement )
                    // InternalQuCircuit.g:511:3: ruleMeasurement
                    {
                     before(grammarAccess.getQuantumOperationAccess().getMeasurementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurement();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getMeasurementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQuCircuit.g:516:2: ( ruleCompositeQuantumGate )
                    {
                    // InternalQuCircuit.g:516:2: ( ruleCompositeQuantumGate )
                    // InternalQuCircuit.g:517:3: ruleCompositeQuantumGate
                    {
                     before(grammarAccess.getQuantumOperationAccess().getCompositeQuantumGateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeQuantumGate();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getCompositeQuantumGateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQuCircuit.g:522:2: ( ruleLoop )
                    {
                    // InternalQuCircuit.g:522:2: ( ruleLoop )
                    // InternalQuCircuit.g:523:3: ruleLoop
                    {
                     before(grammarAccess.getQuantumOperationAccess().getLoopParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getLoopParserRuleCall_4()); 

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
    // $ANTLR end "rule__QuantumOperation__Alternatives"


    // $ANTLR start "rule__Selector__Alternatives"
    // InternalQuCircuit.g:532:1: rule__Selector__Alternatives : ( ( ruleElementSelector ) | ( ruleRangeSelector ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:536:1: ( ( ruleElementSelector ) | ( ruleRangeSelector ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==24) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_INT) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==55) ) {
                            alt2=2;
                        }
                        else if ( (LA2_3==EOF||LA2_3==24||LA2_3==29||LA2_3==32) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==24) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_INT) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==55) ) {
                            alt2=2;
                        }
                        else if ( (LA2_3==EOF||LA2_3==24||LA2_3==29||LA2_3==32) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==55) ) {
                    alt2=2;
                }
                else if ( (LA2_3==EOF||LA2_3==24||LA2_3==29||LA2_3==32) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQuCircuit.g:537:2: ( ruleElementSelector )
                    {
                    // InternalQuCircuit.g:537:2: ( ruleElementSelector )
                    // InternalQuCircuit.g:538:3: ruleElementSelector
                    {
                     before(grammarAccess.getSelectorAccess().getElementSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElementSelector();

                    state._fsp--;

                     after(grammarAccess.getSelectorAccess().getElementSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:543:2: ( ruleRangeSelector )
                    {
                    // InternalQuCircuit.g:543:2: ( ruleRangeSelector )
                    // InternalQuCircuit.g:544:3: ruleRangeSelector
                    {
                     before(grammarAccess.getSelectorAccess().getRangeSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRangeSelector();

                    state._fsp--;

                     after(grammarAccess.getSelectorAccess().getRangeSelectorParserRuleCall_1()); 

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
    // $ANTLR end "rule__Selector__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQuCircuit.g:553:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:557:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuCircuit.g:558:2: ( RULE_STRING )
                    {
                    // InternalQuCircuit.g:558:2: ( RULE_STRING )
                    // InternalQuCircuit.g:559:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:564:2: ( RULE_ID )
                    {
                    // InternalQuCircuit.g:564:2: ( RULE_ID )
                    // InternalQuCircuit.g:565:3: RULE_ID
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


    // $ANTLR start "rule__EDoubleObject__Alternatives_4_0"
    // InternalQuCircuit.g:574:1: rule__EDoubleObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDoubleObject__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:578:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuCircuit.g:579:2: ( 'E' )
                    {
                    // InternalQuCircuit.g:579:2: ( 'E' )
                    // InternalQuCircuit.g:580:3: 'E'
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:585:2: ( 'e' )
                    {
                    // InternalQuCircuit.g:585:2: ( 'e' )
                    // InternalQuCircuit.g:586:3: 'e'
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Alternatives_4_0"


    // $ANTLR start "rule__ITERATION_TYPE__Alternatives"
    // InternalQuCircuit.g:595:1: rule__ITERATION_TYPE__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'SHIFT' ) ) | ( ( 'CHANGE_BLOCK' ) ) );
    public final void rule__ITERATION_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:599:1: ( ( ( 'NONE' ) ) | ( ( 'SHIFT' ) ) | ( ( 'CHANGE_BLOCK' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQuCircuit.g:600:2: ( ( 'NONE' ) )
                    {
                    // InternalQuCircuit.g:600:2: ( ( 'NONE' ) )
                    // InternalQuCircuit.g:601:3: ( 'NONE' )
                    {
                     before(grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalQuCircuit.g:602:3: ( 'NONE' )
                    // InternalQuCircuit.g:602:4: 'NONE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:606:2: ( ( 'SHIFT' ) )
                    {
                    // InternalQuCircuit.g:606:2: ( ( 'SHIFT' ) )
                    // InternalQuCircuit.g:607:3: ( 'SHIFT' )
                    {
                     before(grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1()); 
                    // InternalQuCircuit.g:608:3: ( 'SHIFT' )
                    // InternalQuCircuit.g:608:4: 'SHIFT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:612:2: ( ( 'CHANGE_BLOCK' ) )
                    {
                    // InternalQuCircuit.g:612:2: ( ( 'CHANGE_BLOCK' ) )
                    // InternalQuCircuit.g:613:3: ( 'CHANGE_BLOCK' )
                    {
                     before(grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2()); 
                    // InternalQuCircuit.g:614:3: ( 'CHANGE_BLOCK' )
                    // InternalQuCircuit.g:614:4: 'CHANGE_BLOCK'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ITERATION_TYPE__Alternatives"


    // $ANTLR start "rule__QuantumCircuit__Group__0"
    // InternalQuCircuit.g:622:1: rule__QuantumCircuit__Group__0 : rule__QuantumCircuit__Group__0__Impl rule__QuantumCircuit__Group__1 ;
    public final void rule__QuantumCircuit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:626:1: ( rule__QuantumCircuit__Group__0__Impl rule__QuantumCircuit__Group__1 )
            // InternalQuCircuit.g:627:2: rule__QuantumCircuit__Group__0__Impl rule__QuantumCircuit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QuantumCircuit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__1();

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
    // $ANTLR end "rule__QuantumCircuit__Group__0"


    // $ANTLR start "rule__QuantumCircuit__Group__0__Impl"
    // InternalQuCircuit.g:634:1: rule__QuantumCircuit__Group__0__Impl : ( 'QuantumCircuit' ) ;
    public final void rule__QuantumCircuit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:638:1: ( ( 'QuantumCircuit' ) )
            // InternalQuCircuit.g:639:1: ( 'QuantumCircuit' )
            {
            // InternalQuCircuit.g:639:1: ( 'QuantumCircuit' )
            // InternalQuCircuit.g:640:2: 'QuantumCircuit'
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumCircuitKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuantumCircuitAccess().getQuantumCircuitKeyword_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__0__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__1"
    // InternalQuCircuit.g:649:1: rule__QuantumCircuit__Group__1 : rule__QuantumCircuit__Group__1__Impl rule__QuantumCircuit__Group__2 ;
    public final void rule__QuantumCircuit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:653:1: ( rule__QuantumCircuit__Group__1__Impl rule__QuantumCircuit__Group__2 )
            // InternalQuCircuit.g:654:2: rule__QuantumCircuit__Group__1__Impl rule__QuantumCircuit__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QuantumCircuit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__2();

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
    // $ANTLR end "rule__QuantumCircuit__Group__1"


    // $ANTLR start "rule__QuantumCircuit__Group__1__Impl"
    // InternalQuCircuit.g:661:1: rule__QuantumCircuit__Group__1__Impl : ( ( rule__QuantumCircuit__NameAssignment_1 ) ) ;
    public final void rule__QuantumCircuit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:665:1: ( ( ( rule__QuantumCircuit__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:666:1: ( ( rule__QuantumCircuit__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:666:1: ( ( rule__QuantumCircuit__NameAssignment_1 ) )
            // InternalQuCircuit.g:667:2: ( rule__QuantumCircuit__NameAssignment_1 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:668:2: ( rule__QuantumCircuit__NameAssignment_1 )
            // InternalQuCircuit.g:668:3: rule__QuantumCircuit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__1__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__2"
    // InternalQuCircuit.g:676:1: rule__QuantumCircuit__Group__2 : rule__QuantumCircuit__Group__2__Impl rule__QuantumCircuit__Group__3 ;
    public final void rule__QuantumCircuit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:680:1: ( rule__QuantumCircuit__Group__2__Impl rule__QuantumCircuit__Group__3 )
            // InternalQuCircuit.g:681:2: rule__QuantumCircuit__Group__2__Impl rule__QuantumCircuit__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__QuantumCircuit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__3();

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
    // $ANTLR end "rule__QuantumCircuit__Group__2"


    // $ANTLR start "rule__QuantumCircuit__Group__2__Impl"
    // InternalQuCircuit.g:688:1: rule__QuantumCircuit__Group__2__Impl : ( '{' ) ;
    public final void rule__QuantumCircuit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:692:1: ( ( '{' ) )
            // InternalQuCircuit.g:693:1: ( '{' )
            {
            // InternalQuCircuit.g:693:1: ( '{' )
            // InternalQuCircuit.g:694:2: '{'
            {
             before(grammarAccess.getQuantumCircuitAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuantumCircuitAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__2__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__3"
    // InternalQuCircuit.g:703:1: rule__QuantumCircuit__Group__3 : rule__QuantumCircuit__Group__3__Impl rule__QuantumCircuit__Group__4 ;
    public final void rule__QuantumCircuit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:707:1: ( rule__QuantumCircuit__Group__3__Impl rule__QuantumCircuit__Group__4 )
            // InternalQuCircuit.g:708:2: rule__QuantumCircuit__Group__3__Impl rule__QuantumCircuit__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__QuantumCircuit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__4();

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
    // $ANTLR end "rule__QuantumCircuit__Group__3"


    // $ANTLR start "rule__QuantumCircuit__Group__3__Impl"
    // InternalQuCircuit.g:715:1: rule__QuantumCircuit__Group__3__Impl : ( ( rule__QuantumCircuit__QuantumRegistersAssignment_3 ) ) ;
    public final void rule__QuantumCircuit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:719:1: ( ( ( rule__QuantumCircuit__QuantumRegistersAssignment_3 ) ) )
            // InternalQuCircuit.g:720:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_3 ) )
            {
            // InternalQuCircuit.g:720:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_3 ) )
            // InternalQuCircuit.g:721:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_3 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_3()); 
            // InternalQuCircuit.g:722:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_3 )
            // InternalQuCircuit.g:722:3: rule__QuantumCircuit__QuantumRegistersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__QuantumRegistersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_3()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__3__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__4"
    // InternalQuCircuit.g:730:1: rule__QuantumCircuit__Group__4 : rule__QuantumCircuit__Group__4__Impl rule__QuantumCircuit__Group__5 ;
    public final void rule__QuantumCircuit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:734:1: ( rule__QuantumCircuit__Group__4__Impl rule__QuantumCircuit__Group__5 )
            // InternalQuCircuit.g:735:2: rule__QuantumCircuit__Group__4__Impl rule__QuantumCircuit__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__QuantumCircuit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__5();

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
    // $ANTLR end "rule__QuantumCircuit__Group__4"


    // $ANTLR start "rule__QuantumCircuit__Group__4__Impl"
    // InternalQuCircuit.g:742:1: rule__QuantumCircuit__Group__4__Impl : ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4 )* ) ;
    public final void rule__QuantumCircuit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:746:1: ( ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4 )* ) )
            // InternalQuCircuit.g:747:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4 )* )
            {
            // InternalQuCircuit.g:747:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4 )* )
            // InternalQuCircuit.g:748:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_4 )*
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4()); 
            // InternalQuCircuit.g:749:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQuCircuit.g:749:3: rule__QuantumCircuit__QuantumRegistersAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QuantumCircuit__QuantumRegistersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__4__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__5"
    // InternalQuCircuit.g:757:1: rule__QuantumCircuit__Group__5 : rule__QuantumCircuit__Group__5__Impl rule__QuantumCircuit__Group__6 ;
    public final void rule__QuantumCircuit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:761:1: ( rule__QuantumCircuit__Group__5__Impl rule__QuantumCircuit__Group__6 )
            // InternalQuCircuit.g:762:2: rule__QuantumCircuit__Group__5__Impl rule__QuantumCircuit__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__QuantumCircuit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__6();

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
    // $ANTLR end "rule__QuantumCircuit__Group__5"


    // $ANTLR start "rule__QuantumCircuit__Group__5__Impl"
    // InternalQuCircuit.g:769:1: rule__QuantumCircuit__Group__5__Impl : ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* ) ;
    public final void rule__QuantumCircuit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:773:1: ( ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* ) )
            // InternalQuCircuit.g:774:1: ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* )
            {
            // InternalQuCircuit.g:774:1: ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* )
            // InternalQuCircuit.g:775:2: ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )*
            {
             before(grammarAccess.getQuantumCircuitAccess().getClassicRegistersAssignment_5()); 
            // InternalQuCircuit.g:776:2: ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQuCircuit.g:776:3: rule__QuantumCircuit__ClassicRegistersAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QuantumCircuit__ClassicRegistersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQuantumCircuitAccess().getClassicRegistersAssignment_5()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__5__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__6"
    // InternalQuCircuit.g:784:1: rule__QuantumCircuit__Group__6 : rule__QuantumCircuit__Group__6__Impl rule__QuantumCircuit__Group__7 ;
    public final void rule__QuantumCircuit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:788:1: ( rule__QuantumCircuit__Group__6__Impl rule__QuantumCircuit__Group__7 )
            // InternalQuCircuit.g:789:2: rule__QuantumCircuit__Group__6__Impl rule__QuantumCircuit__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__QuantumCircuit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__7();

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
    // $ANTLR end "rule__QuantumCircuit__Group__6"


    // $ANTLR start "rule__QuantumCircuit__Group__6__Impl"
    // InternalQuCircuit.g:796:1: rule__QuantumCircuit__Group__6__Impl : ( ( rule__QuantumCircuit__LayersAssignment_6 ) ) ;
    public final void rule__QuantumCircuit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:800:1: ( ( ( rule__QuantumCircuit__LayersAssignment_6 ) ) )
            // InternalQuCircuit.g:801:1: ( ( rule__QuantumCircuit__LayersAssignment_6 ) )
            {
            // InternalQuCircuit.g:801:1: ( ( rule__QuantumCircuit__LayersAssignment_6 ) )
            // InternalQuCircuit.g:802:2: ( rule__QuantumCircuit__LayersAssignment_6 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_6()); 
            // InternalQuCircuit.g:803:2: ( rule__QuantumCircuit__LayersAssignment_6 )
            // InternalQuCircuit.g:803:3: rule__QuantumCircuit__LayersAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__LayersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_6()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__6__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__7"
    // InternalQuCircuit.g:811:1: rule__QuantumCircuit__Group__7 : rule__QuantumCircuit__Group__7__Impl rule__QuantumCircuit__Group__8 ;
    public final void rule__QuantumCircuit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:815:1: ( rule__QuantumCircuit__Group__7__Impl rule__QuantumCircuit__Group__8 )
            // InternalQuCircuit.g:816:2: rule__QuantumCircuit__Group__7__Impl rule__QuantumCircuit__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__QuantumCircuit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__8();

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
    // $ANTLR end "rule__QuantumCircuit__Group__7"


    // $ANTLR start "rule__QuantumCircuit__Group__7__Impl"
    // InternalQuCircuit.g:823:1: rule__QuantumCircuit__Group__7__Impl : ( ( rule__QuantumCircuit__LayersAssignment_7 )* ) ;
    public final void rule__QuantumCircuit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:827:1: ( ( ( rule__QuantumCircuit__LayersAssignment_7 )* ) )
            // InternalQuCircuit.g:828:1: ( ( rule__QuantumCircuit__LayersAssignment_7 )* )
            {
            // InternalQuCircuit.g:828:1: ( ( rule__QuantumCircuit__LayersAssignment_7 )* )
            // InternalQuCircuit.g:829:2: ( rule__QuantumCircuit__LayersAssignment_7 )*
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_7()); 
            // InternalQuCircuit.g:830:2: ( rule__QuantumCircuit__LayersAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQuCircuit.g:830:3: rule__QuantumCircuit__LayersAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QuantumCircuit__LayersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_7()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__7__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__8"
    // InternalQuCircuit.g:838:1: rule__QuantumCircuit__Group__8 : rule__QuantumCircuit__Group__8__Impl ;
    public final void rule__QuantumCircuit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:842:1: ( rule__QuantumCircuit__Group__8__Impl )
            // InternalQuCircuit.g:843:2: rule__QuantumCircuit__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__8__Impl();

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
    // $ANTLR end "rule__QuantumCircuit__Group__8"


    // $ANTLR start "rule__QuantumCircuit__Group__8__Impl"
    // InternalQuCircuit.g:849:1: rule__QuantumCircuit__Group__8__Impl : ( '}' ) ;
    public final void rule__QuantumCircuit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:853:1: ( ( '}' ) )
            // InternalQuCircuit.g:854:1: ( '}' )
            {
            // InternalQuCircuit.g:854:1: ( '}' )
            // InternalQuCircuit.g:855:2: '}'
            {
             before(grammarAccess.getQuantumCircuitAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuantumCircuitAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__8__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__0"
    // InternalQuCircuit.g:865:1: rule__QuantumRegister__Group__0 : rule__QuantumRegister__Group__0__Impl rule__QuantumRegister__Group__1 ;
    public final void rule__QuantumRegister__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:869:1: ( rule__QuantumRegister__Group__0__Impl rule__QuantumRegister__Group__1 )
            // InternalQuCircuit.g:870:2: rule__QuantumRegister__Group__0__Impl rule__QuantumRegister__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QuantumRegister__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__1();

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
    // $ANTLR end "rule__QuantumRegister__Group__0"


    // $ANTLR start "rule__QuantumRegister__Group__0__Impl"
    // InternalQuCircuit.g:877:1: rule__QuantumRegister__Group__0__Impl : ( () ) ;
    public final void rule__QuantumRegister__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:881:1: ( ( () ) )
            // InternalQuCircuit.g:882:1: ( () )
            {
            // InternalQuCircuit.g:882:1: ( () )
            // InternalQuCircuit.g:883:2: ()
            {
             before(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterAction_0()); 
            // InternalQuCircuit.g:884:2: ()
            // InternalQuCircuit.g:884:3: 
            {
            }

             after(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumRegister__Group__0__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__1"
    // InternalQuCircuit.g:892:1: rule__QuantumRegister__Group__1 : rule__QuantumRegister__Group__1__Impl rule__QuantumRegister__Group__2 ;
    public final void rule__QuantumRegister__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:896:1: ( rule__QuantumRegister__Group__1__Impl rule__QuantumRegister__Group__2 )
            // InternalQuCircuit.g:897:2: rule__QuantumRegister__Group__1__Impl rule__QuantumRegister__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__QuantumRegister__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__2();

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
    // $ANTLR end "rule__QuantumRegister__Group__1"


    // $ANTLR start "rule__QuantumRegister__Group__1__Impl"
    // InternalQuCircuit.g:904:1: rule__QuantumRegister__Group__1__Impl : ( 'QuantumRegister' ) ;
    public final void rule__QuantumRegister__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:908:1: ( ( 'QuantumRegister' ) )
            // InternalQuCircuit.g:909:1: ( 'QuantumRegister' )
            {
            // InternalQuCircuit.g:909:1: ( 'QuantumRegister' )
            // InternalQuCircuit.g:910:2: 'QuantumRegister'
            {
             before(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterKeyword_1()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__1__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__2"
    // InternalQuCircuit.g:919:1: rule__QuantumRegister__Group__2 : rule__QuantumRegister__Group__2__Impl rule__QuantumRegister__Group__3 ;
    public final void rule__QuantumRegister__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:923:1: ( rule__QuantumRegister__Group__2__Impl rule__QuantumRegister__Group__3 )
            // InternalQuCircuit.g:924:2: rule__QuantumRegister__Group__2__Impl rule__QuantumRegister__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__QuantumRegister__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__3();

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
    // $ANTLR end "rule__QuantumRegister__Group__2"


    // $ANTLR start "rule__QuantumRegister__Group__2__Impl"
    // InternalQuCircuit.g:931:1: rule__QuantumRegister__Group__2__Impl : ( ( rule__QuantumRegister__NameAssignment_2 ) ) ;
    public final void rule__QuantumRegister__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:935:1: ( ( ( rule__QuantumRegister__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:936:1: ( ( rule__QuantumRegister__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:936:1: ( ( rule__QuantumRegister__NameAssignment_2 ) )
            // InternalQuCircuit.g:937:2: ( rule__QuantumRegister__NameAssignment_2 )
            {
             before(grammarAccess.getQuantumRegisterAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:938:2: ( rule__QuantumRegister__NameAssignment_2 )
            // InternalQuCircuit.g:938:3: rule__QuantumRegister__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantumRegisterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__2__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__3"
    // InternalQuCircuit.g:946:1: rule__QuantumRegister__Group__3 : rule__QuantumRegister__Group__3__Impl rule__QuantumRegister__Group__4 ;
    public final void rule__QuantumRegister__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:950:1: ( rule__QuantumRegister__Group__3__Impl rule__QuantumRegister__Group__4 )
            // InternalQuCircuit.g:951:2: rule__QuantumRegister__Group__3__Impl rule__QuantumRegister__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__QuantumRegister__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__4();

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
    // $ANTLR end "rule__QuantumRegister__Group__3"


    // $ANTLR start "rule__QuantumRegister__Group__3__Impl"
    // InternalQuCircuit.g:958:1: rule__QuantumRegister__Group__3__Impl : ( '{' ) ;
    public final void rule__QuantumRegister__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:962:1: ( ( '{' ) )
            // InternalQuCircuit.g:963:1: ( '{' )
            {
            // InternalQuCircuit.g:963:1: ( '{' )
            // InternalQuCircuit.g:964:2: '{'
            {
             before(grammarAccess.getQuantumRegisterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__3__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__4"
    // InternalQuCircuit.g:973:1: rule__QuantumRegister__Group__4 : rule__QuantumRegister__Group__4__Impl rule__QuantumRegister__Group__5 ;
    public final void rule__QuantumRegister__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:977:1: ( rule__QuantumRegister__Group__4__Impl rule__QuantumRegister__Group__5 )
            // InternalQuCircuit.g:978:2: rule__QuantumRegister__Group__4__Impl rule__QuantumRegister__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__QuantumRegister__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__5();

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
    // $ANTLR end "rule__QuantumRegister__Group__4"


    // $ANTLR start "rule__QuantumRegister__Group__4__Impl"
    // InternalQuCircuit.g:985:1: rule__QuantumRegister__Group__4__Impl : ( ( rule__QuantumRegister__Group_4__0 )? ) ;
    public final void rule__QuantumRegister__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:989:1: ( ( ( rule__QuantumRegister__Group_4__0 )? ) )
            // InternalQuCircuit.g:990:1: ( ( rule__QuantumRegister__Group_4__0 )? )
            {
            // InternalQuCircuit.g:990:1: ( ( rule__QuantumRegister__Group_4__0 )? )
            // InternalQuCircuit.g:991:2: ( rule__QuantumRegister__Group_4__0 )?
            {
             before(grammarAccess.getQuantumRegisterAccess().getGroup_4()); 
            // InternalQuCircuit.g:992:2: ( rule__QuantumRegister__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQuCircuit.g:992:3: rule__QuantumRegister__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuantumRegister__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantumRegisterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__4__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__5"
    // InternalQuCircuit.g:1000:1: rule__QuantumRegister__Group__5 : rule__QuantumRegister__Group__5__Impl ;
    public final void rule__QuantumRegister__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1004:1: ( rule__QuantumRegister__Group__5__Impl )
            // InternalQuCircuit.g:1005:2: rule__QuantumRegister__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__5__Impl();

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
    // $ANTLR end "rule__QuantumRegister__Group__5"


    // $ANTLR start "rule__QuantumRegister__Group__5__Impl"
    // InternalQuCircuit.g:1011:1: rule__QuantumRegister__Group__5__Impl : ( '}' ) ;
    public final void rule__QuantumRegister__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1015:1: ( ( '}' ) )
            // InternalQuCircuit.g:1016:1: ( '}' )
            {
            // InternalQuCircuit.g:1016:1: ( '}' )
            // InternalQuCircuit.g:1017:2: '}'
            {
             before(grammarAccess.getQuantumRegisterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__5__Impl"


    // $ANTLR start "rule__QuantumRegister__Group_4__0"
    // InternalQuCircuit.g:1027:1: rule__QuantumRegister__Group_4__0 : rule__QuantumRegister__Group_4__0__Impl rule__QuantumRegister__Group_4__1 ;
    public final void rule__QuantumRegister__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1031:1: ( rule__QuantumRegister__Group_4__0__Impl rule__QuantumRegister__Group_4__1 )
            // InternalQuCircuit.g:1032:2: rule__QuantumRegister__Group_4__0__Impl rule__QuantumRegister__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__QuantumRegister__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group_4__1();

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
    // $ANTLR end "rule__QuantumRegister__Group_4__0"


    // $ANTLR start "rule__QuantumRegister__Group_4__0__Impl"
    // InternalQuCircuit.g:1039:1: rule__QuantumRegister__Group_4__0__Impl : ( 'NumberOfQubits' ) ;
    public final void rule__QuantumRegister__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1043:1: ( ( 'NumberOfQubits' ) )
            // InternalQuCircuit.g:1044:1: ( 'NumberOfQubits' )
            {
            // InternalQuCircuit.g:1044:1: ( 'NumberOfQubits' )
            // InternalQuCircuit.g:1045:2: 'NumberOfQubits'
            {
             before(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsKeyword_4_0()); 

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
    // $ANTLR end "rule__QuantumRegister__Group_4__0__Impl"


    // $ANTLR start "rule__QuantumRegister__Group_4__1"
    // InternalQuCircuit.g:1054:1: rule__QuantumRegister__Group_4__1 : rule__QuantumRegister__Group_4__1__Impl ;
    public final void rule__QuantumRegister__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1058:1: ( rule__QuantumRegister__Group_4__1__Impl )
            // InternalQuCircuit.g:1059:2: rule__QuantumRegister__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group_4__1__Impl();

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
    // $ANTLR end "rule__QuantumRegister__Group_4__1"


    // $ANTLR start "rule__QuantumRegister__Group_4__1__Impl"
    // InternalQuCircuit.g:1065:1: rule__QuantumRegister__Group_4__1__Impl : ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) ) ;
    public final void rule__QuantumRegister__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1069:1: ( ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:1070:1: ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:1070:1: ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) )
            // InternalQuCircuit.g:1071:2: ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 )
            {
             before(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsAssignment_4_1()); 
            // InternalQuCircuit.g:1072:2: ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 )
            // InternalQuCircuit.g:1072:3: rule__QuantumRegister__NumberOfQubitsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__NumberOfQubitsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsAssignment_4_1()); 

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
    // $ANTLR end "rule__QuantumRegister__Group_4__1__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__0"
    // InternalQuCircuit.g:1081:1: rule__ClassicRegister__Group__0 : rule__ClassicRegister__Group__0__Impl rule__ClassicRegister__Group__1 ;
    public final void rule__ClassicRegister__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1085:1: ( rule__ClassicRegister__Group__0__Impl rule__ClassicRegister__Group__1 )
            // InternalQuCircuit.g:1086:2: rule__ClassicRegister__Group__0__Impl rule__ClassicRegister__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ClassicRegister__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__1();

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
    // $ANTLR end "rule__ClassicRegister__Group__0"


    // $ANTLR start "rule__ClassicRegister__Group__0__Impl"
    // InternalQuCircuit.g:1093:1: rule__ClassicRegister__Group__0__Impl : ( () ) ;
    public final void rule__ClassicRegister__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1097:1: ( ( () ) )
            // InternalQuCircuit.g:1098:1: ( () )
            {
            // InternalQuCircuit.g:1098:1: ( () )
            // InternalQuCircuit.g:1099:2: ()
            {
             before(grammarAccess.getClassicRegisterAccess().getClassicRegisterAction_0()); 
            // InternalQuCircuit.g:1100:2: ()
            // InternalQuCircuit.g:1100:3: 
            {
            }

             after(grammarAccess.getClassicRegisterAccess().getClassicRegisterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicRegister__Group__0__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__1"
    // InternalQuCircuit.g:1108:1: rule__ClassicRegister__Group__1 : rule__ClassicRegister__Group__1__Impl rule__ClassicRegister__Group__2 ;
    public final void rule__ClassicRegister__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1112:1: ( rule__ClassicRegister__Group__1__Impl rule__ClassicRegister__Group__2 )
            // InternalQuCircuit.g:1113:2: rule__ClassicRegister__Group__1__Impl rule__ClassicRegister__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassicRegister__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__2();

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
    // $ANTLR end "rule__ClassicRegister__Group__1"


    // $ANTLR start "rule__ClassicRegister__Group__1__Impl"
    // InternalQuCircuit.g:1120:1: rule__ClassicRegister__Group__1__Impl : ( 'ClassicRegister' ) ;
    public final void rule__ClassicRegister__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1124:1: ( ( 'ClassicRegister' ) )
            // InternalQuCircuit.g:1125:1: ( 'ClassicRegister' )
            {
            // InternalQuCircuit.g:1125:1: ( 'ClassicRegister' )
            // InternalQuCircuit.g:1126:2: 'ClassicRegister'
            {
             before(grammarAccess.getClassicRegisterAccess().getClassicRegisterKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getClassicRegisterKeyword_1()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__1__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__2"
    // InternalQuCircuit.g:1135:1: rule__ClassicRegister__Group__2 : rule__ClassicRegister__Group__2__Impl rule__ClassicRegister__Group__3 ;
    public final void rule__ClassicRegister__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1139:1: ( rule__ClassicRegister__Group__2__Impl rule__ClassicRegister__Group__3 )
            // InternalQuCircuit.g:1140:2: rule__ClassicRegister__Group__2__Impl rule__ClassicRegister__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ClassicRegister__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__3();

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
    // $ANTLR end "rule__ClassicRegister__Group__2"


    // $ANTLR start "rule__ClassicRegister__Group__2__Impl"
    // InternalQuCircuit.g:1147:1: rule__ClassicRegister__Group__2__Impl : ( ( rule__ClassicRegister__NameAssignment_2 ) ) ;
    public final void rule__ClassicRegister__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1151:1: ( ( ( rule__ClassicRegister__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:1152:1: ( ( rule__ClassicRegister__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:1152:1: ( ( rule__ClassicRegister__NameAssignment_2 ) )
            // InternalQuCircuit.g:1153:2: ( rule__ClassicRegister__NameAssignment_2 )
            {
             before(grammarAccess.getClassicRegisterAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:1154:2: ( rule__ClassicRegister__NameAssignment_2 )
            // InternalQuCircuit.g:1154:3: rule__ClassicRegister__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassicRegisterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__2__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__3"
    // InternalQuCircuit.g:1162:1: rule__ClassicRegister__Group__3 : rule__ClassicRegister__Group__3__Impl rule__ClassicRegister__Group__4 ;
    public final void rule__ClassicRegister__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1166:1: ( rule__ClassicRegister__Group__3__Impl rule__ClassicRegister__Group__4 )
            // InternalQuCircuit.g:1167:2: rule__ClassicRegister__Group__3__Impl rule__ClassicRegister__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ClassicRegister__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__4();

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
    // $ANTLR end "rule__ClassicRegister__Group__3"


    // $ANTLR start "rule__ClassicRegister__Group__3__Impl"
    // InternalQuCircuit.g:1174:1: rule__ClassicRegister__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassicRegister__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1178:1: ( ( '{' ) )
            // InternalQuCircuit.g:1179:1: ( '{' )
            {
            // InternalQuCircuit.g:1179:1: ( '{' )
            // InternalQuCircuit.g:1180:2: '{'
            {
             before(grammarAccess.getClassicRegisterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__3__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__4"
    // InternalQuCircuit.g:1189:1: rule__ClassicRegister__Group__4 : rule__ClassicRegister__Group__4__Impl rule__ClassicRegister__Group__5 ;
    public final void rule__ClassicRegister__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1193:1: ( rule__ClassicRegister__Group__4__Impl rule__ClassicRegister__Group__5 )
            // InternalQuCircuit.g:1194:2: rule__ClassicRegister__Group__4__Impl rule__ClassicRegister__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ClassicRegister__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__5();

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
    // $ANTLR end "rule__ClassicRegister__Group__4"


    // $ANTLR start "rule__ClassicRegister__Group__4__Impl"
    // InternalQuCircuit.g:1201:1: rule__ClassicRegister__Group__4__Impl : ( ( rule__ClassicRegister__Group_4__0 )? ) ;
    public final void rule__ClassicRegister__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1205:1: ( ( ( rule__ClassicRegister__Group_4__0 )? ) )
            // InternalQuCircuit.g:1206:1: ( ( rule__ClassicRegister__Group_4__0 )? )
            {
            // InternalQuCircuit.g:1206:1: ( ( rule__ClassicRegister__Group_4__0 )? )
            // InternalQuCircuit.g:1207:2: ( rule__ClassicRegister__Group_4__0 )?
            {
             before(grammarAccess.getClassicRegisterAccess().getGroup_4()); 
            // InternalQuCircuit.g:1208:2: ( rule__ClassicRegister__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQuCircuit.g:1208:3: rule__ClassicRegister__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicRegister__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicRegisterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__4__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__5"
    // InternalQuCircuit.g:1216:1: rule__ClassicRegister__Group__5 : rule__ClassicRegister__Group__5__Impl ;
    public final void rule__ClassicRegister__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1220:1: ( rule__ClassicRegister__Group__5__Impl )
            // InternalQuCircuit.g:1221:2: rule__ClassicRegister__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__5__Impl();

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
    // $ANTLR end "rule__ClassicRegister__Group__5"


    // $ANTLR start "rule__ClassicRegister__Group__5__Impl"
    // InternalQuCircuit.g:1227:1: rule__ClassicRegister__Group__5__Impl : ( '}' ) ;
    public final void rule__ClassicRegister__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1231:1: ( ( '}' ) )
            // InternalQuCircuit.g:1232:1: ( '}' )
            {
            // InternalQuCircuit.g:1232:1: ( '}' )
            // InternalQuCircuit.g:1233:2: '}'
            {
             before(grammarAccess.getClassicRegisterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__5__Impl"


    // $ANTLR start "rule__ClassicRegister__Group_4__0"
    // InternalQuCircuit.g:1243:1: rule__ClassicRegister__Group_4__0 : rule__ClassicRegister__Group_4__0__Impl rule__ClassicRegister__Group_4__1 ;
    public final void rule__ClassicRegister__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1247:1: ( rule__ClassicRegister__Group_4__0__Impl rule__ClassicRegister__Group_4__1 )
            // InternalQuCircuit.g:1248:2: rule__ClassicRegister__Group_4__0__Impl rule__ClassicRegister__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ClassicRegister__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group_4__1();

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
    // $ANTLR end "rule__ClassicRegister__Group_4__0"


    // $ANTLR start "rule__ClassicRegister__Group_4__0__Impl"
    // InternalQuCircuit.g:1255:1: rule__ClassicRegister__Group_4__0__Impl : ( 'NumberOfBits' ) ;
    public final void rule__ClassicRegister__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1259:1: ( ( 'NumberOfBits' ) )
            // InternalQuCircuit.g:1260:1: ( 'NumberOfBits' )
            {
            // InternalQuCircuit.g:1260:1: ( 'NumberOfBits' )
            // InternalQuCircuit.g:1261:2: 'NumberOfBits'
            {
             before(grammarAccess.getClassicRegisterAccess().getNumberOfBitsKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getNumberOfBitsKeyword_4_0()); 

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
    // $ANTLR end "rule__ClassicRegister__Group_4__0__Impl"


    // $ANTLR start "rule__ClassicRegister__Group_4__1"
    // InternalQuCircuit.g:1270:1: rule__ClassicRegister__Group_4__1 : rule__ClassicRegister__Group_4__1__Impl ;
    public final void rule__ClassicRegister__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1274:1: ( rule__ClassicRegister__Group_4__1__Impl )
            // InternalQuCircuit.g:1275:2: rule__ClassicRegister__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group_4__1__Impl();

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
    // $ANTLR end "rule__ClassicRegister__Group_4__1"


    // $ANTLR start "rule__ClassicRegister__Group_4__1__Impl"
    // InternalQuCircuit.g:1281:1: rule__ClassicRegister__Group_4__1__Impl : ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) ) ;
    public final void rule__ClassicRegister__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1285:1: ( ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:1286:1: ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:1286:1: ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) )
            // InternalQuCircuit.g:1287:2: ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 )
            {
             before(grammarAccess.getClassicRegisterAccess().getNumberOfBitsAssignment_4_1()); 
            // InternalQuCircuit.g:1288:2: ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 )
            // InternalQuCircuit.g:1288:3: rule__ClassicRegister__NumberOfBitsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__NumberOfBitsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicRegisterAccess().getNumberOfBitsAssignment_4_1()); 

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
    // $ANTLR end "rule__ClassicRegister__Group_4__1__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalQuCircuit.g:1297:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1301:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalQuCircuit.g:1302:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

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
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalQuCircuit.g:1309:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1313:1: ( ( () ) )
            // InternalQuCircuit.g:1314:1: ( () )
            {
            // InternalQuCircuit.g:1314:1: ( () )
            // InternalQuCircuit.g:1315:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalQuCircuit.g:1316:2: ()
            // InternalQuCircuit.g:1316:3: 
            {
            }

             after(grammarAccess.getLayerAccess().getLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalQuCircuit.g:1324:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1328:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalQuCircuit.g:1329:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

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
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalQuCircuit.g:1336:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1340:1: ( ( 'Layer' ) )
            // InternalQuCircuit.g:1341:1: ( 'Layer' )
            {
            // InternalQuCircuit.g:1341:1: ( 'Layer' )
            // InternalQuCircuit.g:1342:2: 'Layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_1()); 

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
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalQuCircuit.g:1351:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1355:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalQuCircuit.g:1356:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__3();

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
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalQuCircuit.g:1363:1: rule__Layer__Group__2__Impl : ( ( rule__Layer__NameAssignment_2 ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1367:1: ( ( ( rule__Layer__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:1368:1: ( ( rule__Layer__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:1368:1: ( ( rule__Layer__NameAssignment_2 ) )
            // InternalQuCircuit.g:1369:2: ( rule__Layer__NameAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:1370:2: ( rule__Layer__NameAssignment_2 )
            // InternalQuCircuit.g:1370:3: rule__Layer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // InternalQuCircuit.g:1378:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1382:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalQuCircuit.g:1383:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__4();

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
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // InternalQuCircuit.g:1390:1: rule__Layer__Group__3__Impl : ( '{' ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1394:1: ( ( '{' ) )
            // InternalQuCircuit.g:1395:1: ( '{' )
            {
            // InternalQuCircuit.g:1395:1: ( '{' )
            // InternalQuCircuit.g:1396:2: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // InternalQuCircuit.g:1405:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl rule__Layer__Group__5 ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1409:1: ( rule__Layer__Group__4__Impl rule__Layer__Group__5 )
            // InternalQuCircuit.g:1410:2: rule__Layer__Group__4__Impl rule__Layer__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Layer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__5();

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
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // InternalQuCircuit.g:1417:1: rule__Layer__Group__4__Impl : ( ( rule__Layer__QuantumOperationsAssignment_4 ) ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1421:1: ( ( ( rule__Layer__QuantumOperationsAssignment_4 ) ) )
            // InternalQuCircuit.g:1422:1: ( ( rule__Layer__QuantumOperationsAssignment_4 ) )
            {
            // InternalQuCircuit.g:1422:1: ( ( rule__Layer__QuantumOperationsAssignment_4 ) )
            // InternalQuCircuit.g:1423:2: ( rule__Layer__QuantumOperationsAssignment_4 )
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_4()); 
            // InternalQuCircuit.g:1424:2: ( rule__Layer__QuantumOperationsAssignment_4 )
            // InternalQuCircuit.g:1424:3: rule__Layer__QuantumOperationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Layer__QuantumOperationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_4()); 

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
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__Layer__Group__5"
    // InternalQuCircuit.g:1432:1: rule__Layer__Group__5 : rule__Layer__Group__5__Impl rule__Layer__Group__6 ;
    public final void rule__Layer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1436:1: ( rule__Layer__Group__5__Impl rule__Layer__Group__6 )
            // InternalQuCircuit.g:1437:2: rule__Layer__Group__5__Impl rule__Layer__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Layer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__6();

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
    // $ANTLR end "rule__Layer__Group__5"


    // $ANTLR start "rule__Layer__Group__5__Impl"
    // InternalQuCircuit.g:1444:1: rule__Layer__Group__5__Impl : ( ( rule__Layer__Group_5__0 )* ) ;
    public final void rule__Layer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1448:1: ( ( ( rule__Layer__Group_5__0 )* ) )
            // InternalQuCircuit.g:1449:1: ( ( rule__Layer__Group_5__0 )* )
            {
            // InternalQuCircuit.g:1449:1: ( ( rule__Layer__Group_5__0 )* )
            // InternalQuCircuit.g:1450:2: ( rule__Layer__Group_5__0 )*
            {
             before(grammarAccess.getLayerAccess().getGroup_5()); 
            // InternalQuCircuit.g:1451:2: ( rule__Layer__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQuCircuit.g:1451:3: rule__Layer__Group_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Layer__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Layer__Group__5__Impl"


    // $ANTLR start "rule__Layer__Group__6"
    // InternalQuCircuit.g:1459:1: rule__Layer__Group__6 : rule__Layer__Group__6__Impl ;
    public final void rule__Layer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1463:1: ( rule__Layer__Group__6__Impl )
            // InternalQuCircuit.g:1464:2: rule__Layer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__6__Impl();

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
    // $ANTLR end "rule__Layer__Group__6"


    // $ANTLR start "rule__Layer__Group__6__Impl"
    // InternalQuCircuit.g:1470:1: rule__Layer__Group__6__Impl : ( '}' ) ;
    public final void rule__Layer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1474:1: ( ( '}' ) )
            // InternalQuCircuit.g:1475:1: ( '}' )
            {
            // InternalQuCircuit.g:1475:1: ( '}' )
            // InternalQuCircuit.g:1476:2: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Layer__Group__6__Impl"


    // $ANTLR start "rule__Layer__Group_5__0"
    // InternalQuCircuit.g:1486:1: rule__Layer__Group_5__0 : rule__Layer__Group_5__0__Impl rule__Layer__Group_5__1 ;
    public final void rule__Layer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1490:1: ( rule__Layer__Group_5__0__Impl rule__Layer__Group_5__1 )
            // InternalQuCircuit.g:1491:2: rule__Layer__Group_5__0__Impl rule__Layer__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Layer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_5__1();

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
    // $ANTLR end "rule__Layer__Group_5__0"


    // $ANTLR start "rule__Layer__Group_5__0__Impl"
    // InternalQuCircuit.g:1498:1: rule__Layer__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Layer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1502:1: ( ( ',' ) )
            // InternalQuCircuit.g:1503:1: ( ',' )
            {
            // InternalQuCircuit.g:1503:1: ( ',' )
            // InternalQuCircuit.g:1504:2: ','
            {
             before(grammarAccess.getLayerAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Layer__Group_5__0__Impl"


    // $ANTLR start "rule__Layer__Group_5__1"
    // InternalQuCircuit.g:1513:1: rule__Layer__Group_5__1 : rule__Layer__Group_5__1__Impl ;
    public final void rule__Layer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1517:1: ( rule__Layer__Group_5__1__Impl )
            // InternalQuCircuit.g:1518:2: rule__Layer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_5__1__Impl();

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
    // $ANTLR end "rule__Layer__Group_5__1"


    // $ANTLR start "rule__Layer__Group_5__1__Impl"
    // InternalQuCircuit.g:1524:1: rule__Layer__Group_5__1__Impl : ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) ) ;
    public final void rule__Layer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1528:1: ( ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) ) )
            // InternalQuCircuit.g:1529:1: ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) )
            {
            // InternalQuCircuit.g:1529:1: ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) )
            // InternalQuCircuit.g:1530:2: ( rule__Layer__QuantumOperationsAssignment_5_1 )
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_5_1()); 
            // InternalQuCircuit.g:1531:2: ( rule__Layer__QuantumOperationsAssignment_5_1 )
            // InternalQuCircuit.g:1531:3: rule__Layer__QuantumOperationsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__QuantumOperationsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_5_1()); 

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
    // $ANTLR end "rule__Layer__Group_5__1__Impl"


    // $ANTLR start "rule__StatePreparation__Group__0"
    // InternalQuCircuit.g:1540:1: rule__StatePreparation__Group__0 : rule__StatePreparation__Group__0__Impl rule__StatePreparation__Group__1 ;
    public final void rule__StatePreparation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1544:1: ( rule__StatePreparation__Group__0__Impl rule__StatePreparation__Group__1 )
            // InternalQuCircuit.g:1545:2: rule__StatePreparation__Group__0__Impl rule__StatePreparation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StatePreparation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__1();

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
    // $ANTLR end "rule__StatePreparation__Group__0"


    // $ANTLR start "rule__StatePreparation__Group__0__Impl"
    // InternalQuCircuit.g:1552:1: rule__StatePreparation__Group__0__Impl : ( 'StatePreparation' ) ;
    public final void rule__StatePreparation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1556:1: ( ( 'StatePreparation' ) )
            // InternalQuCircuit.g:1557:1: ( 'StatePreparation' )
            {
            // InternalQuCircuit.g:1557:1: ( 'StatePreparation' )
            // InternalQuCircuit.g:1558:2: 'StatePreparation'
            {
             before(grammarAccess.getStatePreparationAccess().getStatePreparationKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getStatePreparationKeyword_0()); 

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
    // $ANTLR end "rule__StatePreparation__Group__0__Impl"


    // $ANTLR start "rule__StatePreparation__Group__1"
    // InternalQuCircuit.g:1567:1: rule__StatePreparation__Group__1 : rule__StatePreparation__Group__1__Impl rule__StatePreparation__Group__2 ;
    public final void rule__StatePreparation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1571:1: ( rule__StatePreparation__Group__1__Impl rule__StatePreparation__Group__2 )
            // InternalQuCircuit.g:1572:2: rule__StatePreparation__Group__1__Impl rule__StatePreparation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StatePreparation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__2();

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
    // $ANTLR end "rule__StatePreparation__Group__1"


    // $ANTLR start "rule__StatePreparation__Group__1__Impl"
    // InternalQuCircuit.g:1579:1: rule__StatePreparation__Group__1__Impl : ( ( rule__StatePreparation__NameAssignment_1 ) ) ;
    public final void rule__StatePreparation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1583:1: ( ( ( rule__StatePreparation__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:1584:1: ( ( rule__StatePreparation__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:1584:1: ( ( rule__StatePreparation__NameAssignment_1 ) )
            // InternalQuCircuit.g:1585:2: ( rule__StatePreparation__NameAssignment_1 )
            {
             before(grammarAccess.getStatePreparationAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:1586:2: ( rule__StatePreparation__NameAssignment_1 )
            // InternalQuCircuit.g:1586:3: rule__StatePreparation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StatePreparation__Group__1__Impl"


    // $ANTLR start "rule__StatePreparation__Group__2"
    // InternalQuCircuit.g:1594:1: rule__StatePreparation__Group__2 : rule__StatePreparation__Group__2__Impl rule__StatePreparation__Group__3 ;
    public final void rule__StatePreparation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1598:1: ( rule__StatePreparation__Group__2__Impl rule__StatePreparation__Group__3 )
            // InternalQuCircuit.g:1599:2: rule__StatePreparation__Group__2__Impl rule__StatePreparation__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__StatePreparation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__3();

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
    // $ANTLR end "rule__StatePreparation__Group__2"


    // $ANTLR start "rule__StatePreparation__Group__2__Impl"
    // InternalQuCircuit.g:1606:1: rule__StatePreparation__Group__2__Impl : ( '{' ) ;
    public final void rule__StatePreparation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1610:1: ( ( '{' ) )
            // InternalQuCircuit.g:1611:1: ( '{' )
            {
            // InternalQuCircuit.g:1611:1: ( '{' )
            // InternalQuCircuit.g:1612:2: '{'
            {
             before(grammarAccess.getStatePreparationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__StatePreparation__Group__2__Impl"


    // $ANTLR start "rule__StatePreparation__Group__3"
    // InternalQuCircuit.g:1621:1: rule__StatePreparation__Group__3 : rule__StatePreparation__Group__3__Impl rule__StatePreparation__Group__4 ;
    public final void rule__StatePreparation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1625:1: ( rule__StatePreparation__Group__3__Impl rule__StatePreparation__Group__4 )
            // InternalQuCircuit.g:1626:2: rule__StatePreparation__Group__3__Impl rule__StatePreparation__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__StatePreparation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__4();

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
    // $ANTLR end "rule__StatePreparation__Group__3"


    // $ANTLR start "rule__StatePreparation__Group__3__Impl"
    // InternalQuCircuit.g:1633:1: rule__StatePreparation__Group__3__Impl : ( 'operation' ) ;
    public final void rule__StatePreparation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1637:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:1638:1: ( 'operation' )
            {
            // InternalQuCircuit.g:1638:1: ( 'operation' )
            // InternalQuCircuit.g:1639:2: 'operation'
            {
             before(grammarAccess.getStatePreparationAccess().getOperationKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getOperationKeyword_3()); 

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
    // $ANTLR end "rule__StatePreparation__Group__3__Impl"


    // $ANTLR start "rule__StatePreparation__Group__4"
    // InternalQuCircuit.g:1648:1: rule__StatePreparation__Group__4 : rule__StatePreparation__Group__4__Impl rule__StatePreparation__Group__5 ;
    public final void rule__StatePreparation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1652:1: ( rule__StatePreparation__Group__4__Impl rule__StatePreparation__Group__5 )
            // InternalQuCircuit.g:1653:2: rule__StatePreparation__Group__4__Impl rule__StatePreparation__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__StatePreparation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__5();

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
    // $ANTLR end "rule__StatePreparation__Group__4"


    // $ANTLR start "rule__StatePreparation__Group__4__Impl"
    // InternalQuCircuit.g:1660:1: rule__StatePreparation__Group__4__Impl : ( ( rule__StatePreparation__OperationsAssignment_4 ) ) ;
    public final void rule__StatePreparation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1664:1: ( ( ( rule__StatePreparation__OperationsAssignment_4 ) ) )
            // InternalQuCircuit.g:1665:1: ( ( rule__StatePreparation__OperationsAssignment_4 ) )
            {
            // InternalQuCircuit.g:1665:1: ( ( rule__StatePreparation__OperationsAssignment_4 ) )
            // InternalQuCircuit.g:1666:2: ( rule__StatePreparation__OperationsAssignment_4 )
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsAssignment_4()); 
            // InternalQuCircuit.g:1667:2: ( rule__StatePreparation__OperationsAssignment_4 )
            // InternalQuCircuit.g:1667:3: rule__StatePreparation__OperationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__OperationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getOperationsAssignment_4()); 

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
    // $ANTLR end "rule__StatePreparation__Group__4__Impl"


    // $ANTLR start "rule__StatePreparation__Group__5"
    // InternalQuCircuit.g:1675:1: rule__StatePreparation__Group__5 : rule__StatePreparation__Group__5__Impl rule__StatePreparation__Group__6 ;
    public final void rule__StatePreparation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1679:1: ( rule__StatePreparation__Group__5__Impl rule__StatePreparation__Group__6 )
            // InternalQuCircuit.g:1680:2: rule__StatePreparation__Group__5__Impl rule__StatePreparation__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__StatePreparation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__6();

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
    // $ANTLR end "rule__StatePreparation__Group__5"


    // $ANTLR start "rule__StatePreparation__Group__5__Impl"
    // InternalQuCircuit.g:1687:1: rule__StatePreparation__Group__5__Impl : ( ( rule__StatePreparation__Group_5__0 )* ) ;
    public final void rule__StatePreparation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1691:1: ( ( ( rule__StatePreparation__Group_5__0 )* ) )
            // InternalQuCircuit.g:1692:1: ( ( rule__StatePreparation__Group_5__0 )* )
            {
            // InternalQuCircuit.g:1692:1: ( ( rule__StatePreparation__Group_5__0 )* )
            // InternalQuCircuit.g:1693:2: ( rule__StatePreparation__Group_5__0 )*
            {
             before(grammarAccess.getStatePreparationAccess().getGroup_5()); 
            // InternalQuCircuit.g:1694:2: ( rule__StatePreparation__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQuCircuit.g:1694:3: rule__StatePreparation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StatePreparation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStatePreparationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__StatePreparation__Group__5__Impl"


    // $ANTLR start "rule__StatePreparation__Group__6"
    // InternalQuCircuit.g:1702:1: rule__StatePreparation__Group__6 : rule__StatePreparation__Group__6__Impl rule__StatePreparation__Group__7 ;
    public final void rule__StatePreparation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1706:1: ( rule__StatePreparation__Group__6__Impl rule__StatePreparation__Group__7 )
            // InternalQuCircuit.g:1707:2: rule__StatePreparation__Group__6__Impl rule__StatePreparation__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__StatePreparation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__7();

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
    // $ANTLR end "rule__StatePreparation__Group__6"


    // $ANTLR start "rule__StatePreparation__Group__6__Impl"
    // InternalQuCircuit.g:1714:1: rule__StatePreparation__Group__6__Impl : ( 'targetQubits' ) ;
    public final void rule__StatePreparation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1718:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:1719:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:1719:1: ( 'targetQubits' )
            // InternalQuCircuit.g:1720:2: 'targetQubits'
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getTargetQubitsKeyword_6()); 

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
    // $ANTLR end "rule__StatePreparation__Group__6__Impl"


    // $ANTLR start "rule__StatePreparation__Group__7"
    // InternalQuCircuit.g:1729:1: rule__StatePreparation__Group__7 : rule__StatePreparation__Group__7__Impl rule__StatePreparation__Group__8 ;
    public final void rule__StatePreparation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1733:1: ( rule__StatePreparation__Group__7__Impl rule__StatePreparation__Group__8 )
            // InternalQuCircuit.g:1734:2: rule__StatePreparation__Group__7__Impl rule__StatePreparation__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__StatePreparation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__8();

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
    // $ANTLR end "rule__StatePreparation__Group__7"


    // $ANTLR start "rule__StatePreparation__Group__7__Impl"
    // InternalQuCircuit.g:1741:1: rule__StatePreparation__Group__7__Impl : ( '[' ) ;
    public final void rule__StatePreparation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1745:1: ( ( '[' ) )
            // InternalQuCircuit.g:1746:1: ( '[' )
            {
            // InternalQuCircuit.g:1746:1: ( '[' )
            // InternalQuCircuit.g:1747:2: '['
            {
             before(grammarAccess.getStatePreparationAccess().getLeftSquareBracketKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getLeftSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__StatePreparation__Group__7__Impl"


    // $ANTLR start "rule__StatePreparation__Group__8"
    // InternalQuCircuit.g:1756:1: rule__StatePreparation__Group__8 : rule__StatePreparation__Group__8__Impl rule__StatePreparation__Group__9 ;
    public final void rule__StatePreparation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1760:1: ( rule__StatePreparation__Group__8__Impl rule__StatePreparation__Group__9 )
            // InternalQuCircuit.g:1761:2: rule__StatePreparation__Group__8__Impl rule__StatePreparation__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__StatePreparation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__9();

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
    // $ANTLR end "rule__StatePreparation__Group__8"


    // $ANTLR start "rule__StatePreparation__Group__8__Impl"
    // InternalQuCircuit.g:1768:1: rule__StatePreparation__Group__8__Impl : ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) ) ;
    public final void rule__StatePreparation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1772:1: ( ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) ) )
            // InternalQuCircuit.g:1773:1: ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) )
            {
            // InternalQuCircuit.g:1773:1: ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) )
            // InternalQuCircuit.g:1774:2: ( rule__StatePreparation__TargetQubitsAssignment_8 )
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_8()); 
            // InternalQuCircuit.g:1775:2: ( rule__StatePreparation__TargetQubitsAssignment_8 )
            // InternalQuCircuit.g:1775:3: rule__StatePreparation__TargetQubitsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__TargetQubitsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_8()); 

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
    // $ANTLR end "rule__StatePreparation__Group__8__Impl"


    // $ANTLR start "rule__StatePreparation__Group__9"
    // InternalQuCircuit.g:1783:1: rule__StatePreparation__Group__9 : rule__StatePreparation__Group__9__Impl rule__StatePreparation__Group__10 ;
    public final void rule__StatePreparation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1787:1: ( rule__StatePreparation__Group__9__Impl rule__StatePreparation__Group__10 )
            // InternalQuCircuit.g:1788:2: rule__StatePreparation__Group__9__Impl rule__StatePreparation__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__StatePreparation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__10();

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
    // $ANTLR end "rule__StatePreparation__Group__9"


    // $ANTLR start "rule__StatePreparation__Group__9__Impl"
    // InternalQuCircuit.g:1795:1: rule__StatePreparation__Group__9__Impl : ( ( rule__StatePreparation__Group_9__0 )* ) ;
    public final void rule__StatePreparation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1799:1: ( ( ( rule__StatePreparation__Group_9__0 )* ) )
            // InternalQuCircuit.g:1800:1: ( ( rule__StatePreparation__Group_9__0 )* )
            {
            // InternalQuCircuit.g:1800:1: ( ( rule__StatePreparation__Group_9__0 )* )
            // InternalQuCircuit.g:1801:2: ( rule__StatePreparation__Group_9__0 )*
            {
             before(grammarAccess.getStatePreparationAccess().getGroup_9()); 
            // InternalQuCircuit.g:1802:2: ( rule__StatePreparation__Group_9__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQuCircuit.g:1802:3: rule__StatePreparation__Group_9__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StatePreparation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStatePreparationAccess().getGroup_9()); 

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
    // $ANTLR end "rule__StatePreparation__Group__9__Impl"


    // $ANTLR start "rule__StatePreparation__Group__10"
    // InternalQuCircuit.g:1810:1: rule__StatePreparation__Group__10 : rule__StatePreparation__Group__10__Impl rule__StatePreparation__Group__11 ;
    public final void rule__StatePreparation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1814:1: ( rule__StatePreparation__Group__10__Impl rule__StatePreparation__Group__11 )
            // InternalQuCircuit.g:1815:2: rule__StatePreparation__Group__10__Impl rule__StatePreparation__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__StatePreparation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__11();

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
    // $ANTLR end "rule__StatePreparation__Group__10"


    // $ANTLR start "rule__StatePreparation__Group__10__Impl"
    // InternalQuCircuit.g:1822:1: rule__StatePreparation__Group__10__Impl : ( ']' ) ;
    public final void rule__StatePreparation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1826:1: ( ( ']' ) )
            // InternalQuCircuit.g:1827:1: ( ']' )
            {
            // InternalQuCircuit.g:1827:1: ( ']' )
            // InternalQuCircuit.g:1828:2: ']'
            {
             before(grammarAccess.getStatePreparationAccess().getRightSquareBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__StatePreparation__Group__10__Impl"


    // $ANTLR start "rule__StatePreparation__Group__11"
    // InternalQuCircuit.g:1837:1: rule__StatePreparation__Group__11 : rule__StatePreparation__Group__11__Impl ;
    public final void rule__StatePreparation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1841:1: ( rule__StatePreparation__Group__11__Impl )
            // InternalQuCircuit.g:1842:2: rule__StatePreparation__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__11__Impl();

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
    // $ANTLR end "rule__StatePreparation__Group__11"


    // $ANTLR start "rule__StatePreparation__Group__11__Impl"
    // InternalQuCircuit.g:1848:1: rule__StatePreparation__Group__11__Impl : ( '}' ) ;
    public final void rule__StatePreparation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1852:1: ( ( '}' ) )
            // InternalQuCircuit.g:1853:1: ( '}' )
            {
            // InternalQuCircuit.g:1853:1: ( '}' )
            // InternalQuCircuit.g:1854:2: '}'
            {
             before(grammarAccess.getStatePreparationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__StatePreparation__Group__11__Impl"


    // $ANTLR start "rule__StatePreparation__Group_5__0"
    // InternalQuCircuit.g:1864:1: rule__StatePreparation__Group_5__0 : rule__StatePreparation__Group_5__0__Impl rule__StatePreparation__Group_5__1 ;
    public final void rule__StatePreparation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1868:1: ( rule__StatePreparation__Group_5__0__Impl rule__StatePreparation__Group_5__1 )
            // InternalQuCircuit.g:1869:2: rule__StatePreparation__Group_5__0__Impl rule__StatePreparation__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__StatePreparation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_5__1();

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
    // $ANTLR end "rule__StatePreparation__Group_5__0"


    // $ANTLR start "rule__StatePreparation__Group_5__0__Impl"
    // InternalQuCircuit.g:1876:1: rule__StatePreparation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StatePreparation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1880:1: ( ( ',' ) )
            // InternalQuCircuit.g:1881:1: ( ',' )
            {
            // InternalQuCircuit.g:1881:1: ( ',' )
            // InternalQuCircuit.g:1882:2: ','
            {
             before(grammarAccess.getStatePreparationAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__StatePreparation__Group_5__0__Impl"


    // $ANTLR start "rule__StatePreparation__Group_5__1"
    // InternalQuCircuit.g:1891:1: rule__StatePreparation__Group_5__1 : rule__StatePreparation__Group_5__1__Impl ;
    public final void rule__StatePreparation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1895:1: ( rule__StatePreparation__Group_5__1__Impl )
            // InternalQuCircuit.g:1896:2: rule__StatePreparation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_5__1__Impl();

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
    // $ANTLR end "rule__StatePreparation__Group_5__1"


    // $ANTLR start "rule__StatePreparation__Group_5__1__Impl"
    // InternalQuCircuit.g:1902:1: rule__StatePreparation__Group_5__1__Impl : ( ( rule__StatePreparation__OperationsAssignment_5_1 ) ) ;
    public final void rule__StatePreparation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1906:1: ( ( ( rule__StatePreparation__OperationsAssignment_5_1 ) ) )
            // InternalQuCircuit.g:1907:1: ( ( rule__StatePreparation__OperationsAssignment_5_1 ) )
            {
            // InternalQuCircuit.g:1907:1: ( ( rule__StatePreparation__OperationsAssignment_5_1 ) )
            // InternalQuCircuit.g:1908:2: ( rule__StatePreparation__OperationsAssignment_5_1 )
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsAssignment_5_1()); 
            // InternalQuCircuit.g:1909:2: ( rule__StatePreparation__OperationsAssignment_5_1 )
            // InternalQuCircuit.g:1909:3: rule__StatePreparation__OperationsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__OperationsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getOperationsAssignment_5_1()); 

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
    // $ANTLR end "rule__StatePreparation__Group_5__1__Impl"


    // $ANTLR start "rule__StatePreparation__Group_9__0"
    // InternalQuCircuit.g:1918:1: rule__StatePreparation__Group_9__0 : rule__StatePreparation__Group_9__0__Impl rule__StatePreparation__Group_9__1 ;
    public final void rule__StatePreparation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1922:1: ( rule__StatePreparation__Group_9__0__Impl rule__StatePreparation__Group_9__1 )
            // InternalQuCircuit.g:1923:2: rule__StatePreparation__Group_9__0__Impl rule__StatePreparation__Group_9__1
            {
            pushFollow(FOLLOW_21);
            rule__StatePreparation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_9__1();

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
    // $ANTLR end "rule__StatePreparation__Group_9__0"


    // $ANTLR start "rule__StatePreparation__Group_9__0__Impl"
    // InternalQuCircuit.g:1930:1: rule__StatePreparation__Group_9__0__Impl : ( ',' ) ;
    public final void rule__StatePreparation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1934:1: ( ( ',' ) )
            // InternalQuCircuit.g:1935:1: ( ',' )
            {
            // InternalQuCircuit.g:1935:1: ( ',' )
            // InternalQuCircuit.g:1936:2: ','
            {
             before(grammarAccess.getStatePreparationAccess().getCommaKeyword_9_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__StatePreparation__Group_9__0__Impl"


    // $ANTLR start "rule__StatePreparation__Group_9__1"
    // InternalQuCircuit.g:1945:1: rule__StatePreparation__Group_9__1 : rule__StatePreparation__Group_9__1__Impl ;
    public final void rule__StatePreparation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1949:1: ( rule__StatePreparation__Group_9__1__Impl )
            // InternalQuCircuit.g:1950:2: rule__StatePreparation__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_9__1__Impl();

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
    // $ANTLR end "rule__StatePreparation__Group_9__1"


    // $ANTLR start "rule__StatePreparation__Group_9__1__Impl"
    // InternalQuCircuit.g:1956:1: rule__StatePreparation__Group_9__1__Impl : ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) ) ;
    public final void rule__StatePreparation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1960:1: ( ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) ) )
            // InternalQuCircuit.g:1961:1: ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) )
            {
            // InternalQuCircuit.g:1961:1: ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) )
            // InternalQuCircuit.g:1962:2: ( rule__StatePreparation__TargetQubitsAssignment_9_1 )
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_9_1()); 
            // InternalQuCircuit.g:1963:2: ( rule__StatePreparation__TargetQubitsAssignment_9_1 )
            // InternalQuCircuit.g:1963:3: rule__StatePreparation__TargetQubitsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__TargetQubitsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_9_1()); 

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
    // $ANTLR end "rule__StatePreparation__Group_9__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__0"
    // InternalQuCircuit.g:1972:1: rule__ElementaryQuantumGate__Group__0 : rule__ElementaryQuantumGate__Group__0__Impl rule__ElementaryQuantumGate__Group__1 ;
    public final void rule__ElementaryQuantumGate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1976:1: ( rule__ElementaryQuantumGate__Group__0__Impl rule__ElementaryQuantumGate__Group__1 )
            // InternalQuCircuit.g:1977:2: rule__ElementaryQuantumGate__Group__0__Impl rule__ElementaryQuantumGate__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ElementaryQuantumGate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__0__Impl"
    // InternalQuCircuit.g:1984:1: rule__ElementaryQuantumGate__Group__0__Impl : ( 'ElementaryQuantumGate' ) ;
    public final void rule__ElementaryQuantumGate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1988:1: ( ( 'ElementaryQuantumGate' ) )
            // InternalQuCircuit.g:1989:1: ( 'ElementaryQuantumGate' )
            {
            // InternalQuCircuit.g:1989:1: ( 'ElementaryQuantumGate' )
            // InternalQuCircuit.g:1990:2: 'ElementaryQuantumGate'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getElementaryQuantumGateKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getElementaryQuantumGateKeyword_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__1"
    // InternalQuCircuit.g:1999:1: rule__ElementaryQuantumGate__Group__1 : rule__ElementaryQuantumGate__Group__1__Impl rule__ElementaryQuantumGate__Group__2 ;
    public final void rule__ElementaryQuantumGate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2003:1: ( rule__ElementaryQuantumGate__Group__1__Impl rule__ElementaryQuantumGate__Group__2 )
            // InternalQuCircuit.g:2004:2: rule__ElementaryQuantumGate__Group__1__Impl rule__ElementaryQuantumGate__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ElementaryQuantumGate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__2();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__1__Impl"
    // InternalQuCircuit.g:2011:1: rule__ElementaryQuantumGate__Group__1__Impl : ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? ) ;
    public final void rule__ElementaryQuantumGate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2015:1: ( ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? ) )
            // InternalQuCircuit.g:2016:1: ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? )
            {
            // InternalQuCircuit.g:2016:1: ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? )
            // InternalQuCircuit.g:2017:2: ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )?
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getInverseFormAssignment_1()); 
            // InternalQuCircuit.g:2018:2: ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQuCircuit.g:2018:3: rule__ElementaryQuantumGate__InverseFormAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementaryQuantumGate__InverseFormAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getInverseFormAssignment_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__2"
    // InternalQuCircuit.g:2026:1: rule__ElementaryQuantumGate__Group__2 : rule__ElementaryQuantumGate__Group__2__Impl rule__ElementaryQuantumGate__Group__3 ;
    public final void rule__ElementaryQuantumGate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2030:1: ( rule__ElementaryQuantumGate__Group__2__Impl rule__ElementaryQuantumGate__Group__3 )
            // InternalQuCircuit.g:2031:2: rule__ElementaryQuantumGate__Group__2__Impl rule__ElementaryQuantumGate__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ElementaryQuantumGate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__3();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__2"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__2__Impl"
    // InternalQuCircuit.g:2038:1: rule__ElementaryQuantumGate__Group__2__Impl : ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) ) ;
    public final void rule__ElementaryQuantumGate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2042:1: ( ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:2043:1: ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:2043:1: ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) )
            // InternalQuCircuit.g:2044:2: ( rule__ElementaryQuantumGate__NameAssignment_2 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:2045:2: ( rule__ElementaryQuantumGate__NameAssignment_2 )
            // InternalQuCircuit.g:2045:3: rule__ElementaryQuantumGate__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__2__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__3"
    // InternalQuCircuit.g:2053:1: rule__ElementaryQuantumGate__Group__3 : rule__ElementaryQuantumGate__Group__3__Impl rule__ElementaryQuantumGate__Group__4 ;
    public final void rule__ElementaryQuantumGate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2057:1: ( rule__ElementaryQuantumGate__Group__3__Impl rule__ElementaryQuantumGate__Group__4 )
            // InternalQuCircuit.g:2058:2: rule__ElementaryQuantumGate__Group__3__Impl rule__ElementaryQuantumGate__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ElementaryQuantumGate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__4();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__3"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__3__Impl"
    // InternalQuCircuit.g:2065:1: rule__ElementaryQuantumGate__Group__3__Impl : ( '{' ) ;
    public final void rule__ElementaryQuantumGate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2069:1: ( ( '{' ) )
            // InternalQuCircuit.g:2070:1: ( '{' )
            {
            // InternalQuCircuit.g:2070:1: ( '{' )
            // InternalQuCircuit.g:2071:2: '{'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__3__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__4"
    // InternalQuCircuit.g:2080:1: rule__ElementaryQuantumGate__Group__4 : rule__ElementaryQuantumGate__Group__4__Impl rule__ElementaryQuantumGate__Group__5 ;
    public final void rule__ElementaryQuantumGate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2084:1: ( rule__ElementaryQuantumGate__Group__4__Impl rule__ElementaryQuantumGate__Group__5 )
            // InternalQuCircuit.g:2085:2: rule__ElementaryQuantumGate__Group__4__Impl rule__ElementaryQuantumGate__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ElementaryQuantumGate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__5();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__4"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__4__Impl"
    // InternalQuCircuit.g:2092:1: rule__ElementaryQuantumGate__Group__4__Impl : ( ( rule__ElementaryQuantumGate__Group_4__0 )? ) ;
    public final void rule__ElementaryQuantumGate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2096:1: ( ( ( rule__ElementaryQuantumGate__Group_4__0 )? ) )
            // InternalQuCircuit.g:2097:1: ( ( rule__ElementaryQuantumGate__Group_4__0 )? )
            {
            // InternalQuCircuit.g:2097:1: ( ( rule__ElementaryQuantumGate__Group_4__0 )? )
            // InternalQuCircuit.g:2098:2: ( rule__ElementaryQuantumGate__Group_4__0 )?
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_4()); 
            // InternalQuCircuit.g:2099:2: ( rule__ElementaryQuantumGate__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQuCircuit.g:2099:3: rule__ElementaryQuantumGate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementaryQuantumGate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__4__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__5"
    // InternalQuCircuit.g:2107:1: rule__ElementaryQuantumGate__Group__5 : rule__ElementaryQuantumGate__Group__5__Impl rule__ElementaryQuantumGate__Group__6 ;
    public final void rule__ElementaryQuantumGate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2111:1: ( rule__ElementaryQuantumGate__Group__5__Impl rule__ElementaryQuantumGate__Group__6 )
            // InternalQuCircuit.g:2112:2: rule__ElementaryQuantumGate__Group__5__Impl rule__ElementaryQuantumGate__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ElementaryQuantumGate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__6();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__5"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__5__Impl"
    // InternalQuCircuit.g:2119:1: rule__ElementaryQuantumGate__Group__5__Impl : ( 'targetQubits' ) ;
    public final void rule__ElementaryQuantumGate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2123:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:2124:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:2124:1: ( 'targetQubits' )
            // InternalQuCircuit.g:2125:2: 'targetQubits'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsKeyword_5()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__5__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__6"
    // InternalQuCircuit.g:2134:1: rule__ElementaryQuantumGate__Group__6 : rule__ElementaryQuantumGate__Group__6__Impl rule__ElementaryQuantumGate__Group__7 ;
    public final void rule__ElementaryQuantumGate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2138:1: ( rule__ElementaryQuantumGate__Group__6__Impl rule__ElementaryQuantumGate__Group__7 )
            // InternalQuCircuit.g:2139:2: rule__ElementaryQuantumGate__Group__6__Impl rule__ElementaryQuantumGate__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__ElementaryQuantumGate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__7();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__6"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__6__Impl"
    // InternalQuCircuit.g:2146:1: rule__ElementaryQuantumGate__Group__6__Impl : ( '[' ) ;
    public final void rule__ElementaryQuantumGate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2150:1: ( ( '[' ) )
            // InternalQuCircuit.g:2151:1: ( '[' )
            {
            // InternalQuCircuit.g:2151:1: ( '[' )
            // InternalQuCircuit.g:2152:2: '['
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__6__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__7"
    // InternalQuCircuit.g:2161:1: rule__ElementaryQuantumGate__Group__7 : rule__ElementaryQuantumGate__Group__7__Impl rule__ElementaryQuantumGate__Group__8 ;
    public final void rule__ElementaryQuantumGate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2165:1: ( rule__ElementaryQuantumGate__Group__7__Impl rule__ElementaryQuantumGate__Group__8 )
            // InternalQuCircuit.g:2166:2: rule__ElementaryQuantumGate__Group__7__Impl rule__ElementaryQuantumGate__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__ElementaryQuantumGate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__8();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__7"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__7__Impl"
    // InternalQuCircuit.g:2173:1: rule__ElementaryQuantumGate__Group__7__Impl : ( '(' ) ;
    public final void rule__ElementaryQuantumGate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2177:1: ( ( '(' ) )
            // InternalQuCircuit.g:2178:1: ( '(' )
            {
            // InternalQuCircuit.g:2178:1: ( '(' )
            // InternalQuCircuit.g:2179:2: '('
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__7__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__8"
    // InternalQuCircuit.g:2188:1: rule__ElementaryQuantumGate__Group__8 : rule__ElementaryQuantumGate__Group__8__Impl rule__ElementaryQuantumGate__Group__9 ;
    public final void rule__ElementaryQuantumGate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2192:1: ( rule__ElementaryQuantumGate__Group__8__Impl rule__ElementaryQuantumGate__Group__9 )
            // InternalQuCircuit.g:2193:2: rule__ElementaryQuantumGate__Group__8__Impl rule__ElementaryQuantumGate__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__ElementaryQuantumGate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__9();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__8"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__8__Impl"
    // InternalQuCircuit.g:2200:1: rule__ElementaryQuantumGate__Group__8__Impl : ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) ) ;
    public final void rule__ElementaryQuantumGate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2204:1: ( ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) ) )
            // InternalQuCircuit.g:2205:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) )
            {
            // InternalQuCircuit.g:2205:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) )
            // InternalQuCircuit.g:2206:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_8()); 
            // InternalQuCircuit.g:2207:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 )
            // InternalQuCircuit.g:2207:3: rule__ElementaryQuantumGate__TargetQubitsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__TargetQubitsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_8()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__8__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__9"
    // InternalQuCircuit.g:2215:1: rule__ElementaryQuantumGate__Group__9 : rule__ElementaryQuantumGate__Group__9__Impl rule__ElementaryQuantumGate__Group__10 ;
    public final void rule__ElementaryQuantumGate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2219:1: ( rule__ElementaryQuantumGate__Group__9__Impl rule__ElementaryQuantumGate__Group__10 )
            // InternalQuCircuit.g:2220:2: rule__ElementaryQuantumGate__Group__9__Impl rule__ElementaryQuantumGate__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__ElementaryQuantumGate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__10();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__9"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__9__Impl"
    // InternalQuCircuit.g:2227:1: rule__ElementaryQuantumGate__Group__9__Impl : ( ')' ) ;
    public final void rule__ElementaryQuantumGate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2231:1: ( ( ')' ) )
            // InternalQuCircuit.g:2232:1: ( ')' )
            {
            // InternalQuCircuit.g:2232:1: ( ')' )
            // InternalQuCircuit.g:2233:2: ')'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__9__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__10"
    // InternalQuCircuit.g:2242:1: rule__ElementaryQuantumGate__Group__10 : rule__ElementaryQuantumGate__Group__10__Impl rule__ElementaryQuantumGate__Group__11 ;
    public final void rule__ElementaryQuantumGate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2246:1: ( rule__ElementaryQuantumGate__Group__10__Impl rule__ElementaryQuantumGate__Group__11 )
            // InternalQuCircuit.g:2247:2: rule__ElementaryQuantumGate__Group__10__Impl rule__ElementaryQuantumGate__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__ElementaryQuantumGate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__11();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__10"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__10__Impl"
    // InternalQuCircuit.g:2254:1: rule__ElementaryQuantumGate__Group__10__Impl : ( ( rule__ElementaryQuantumGate__Group_10__0 )* ) ;
    public final void rule__ElementaryQuantumGate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2258:1: ( ( ( rule__ElementaryQuantumGate__Group_10__0 )* ) )
            // InternalQuCircuit.g:2259:1: ( ( rule__ElementaryQuantumGate__Group_10__0 )* )
            {
            // InternalQuCircuit.g:2259:1: ( ( rule__ElementaryQuantumGate__Group_10__0 )* )
            // InternalQuCircuit.g:2260:2: ( rule__ElementaryQuantumGate__Group_10__0 )*
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_10()); 
            // InternalQuCircuit.g:2261:2: ( rule__ElementaryQuantumGate__Group_10__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQuCircuit.g:2261:3: rule__ElementaryQuantumGate__Group_10__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ElementaryQuantumGate__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_10()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__10__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__11"
    // InternalQuCircuit.g:2269:1: rule__ElementaryQuantumGate__Group__11 : rule__ElementaryQuantumGate__Group__11__Impl rule__ElementaryQuantumGate__Group__12 ;
    public final void rule__ElementaryQuantumGate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2273:1: ( rule__ElementaryQuantumGate__Group__11__Impl rule__ElementaryQuantumGate__Group__12 )
            // InternalQuCircuit.g:2274:2: rule__ElementaryQuantumGate__Group__11__Impl rule__ElementaryQuantumGate__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__ElementaryQuantumGate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__12();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__11"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__11__Impl"
    // InternalQuCircuit.g:2281:1: rule__ElementaryQuantumGate__Group__11__Impl : ( ']' ) ;
    public final void rule__ElementaryQuantumGate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2285:1: ( ( ']' ) )
            // InternalQuCircuit.g:2286:1: ( ']' )
            {
            // InternalQuCircuit.g:2286:1: ( ']' )
            // InternalQuCircuit.g:2287:2: ']'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_11()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__11__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__12"
    // InternalQuCircuit.g:2296:1: rule__ElementaryQuantumGate__Group__12 : rule__ElementaryQuantumGate__Group__12__Impl rule__ElementaryQuantumGate__Group__13 ;
    public final void rule__ElementaryQuantumGate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2300:1: ( rule__ElementaryQuantumGate__Group__12__Impl rule__ElementaryQuantumGate__Group__13 )
            // InternalQuCircuit.g:2301:2: rule__ElementaryQuantumGate__Group__12__Impl rule__ElementaryQuantumGate__Group__13
            {
            pushFollow(FOLLOW_28);
            rule__ElementaryQuantumGate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__13();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__12"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__12__Impl"
    // InternalQuCircuit.g:2308:1: rule__ElementaryQuantumGate__Group__12__Impl : ( ( rule__ElementaryQuantumGate__Group_12__0 )* ) ;
    public final void rule__ElementaryQuantumGate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2312:1: ( ( ( rule__ElementaryQuantumGate__Group_12__0 )* ) )
            // InternalQuCircuit.g:2313:1: ( ( rule__ElementaryQuantumGate__Group_12__0 )* )
            {
            // InternalQuCircuit.g:2313:1: ( ( rule__ElementaryQuantumGate__Group_12__0 )* )
            // InternalQuCircuit.g:2314:2: ( rule__ElementaryQuantumGate__Group_12__0 )*
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_12()); 
            // InternalQuCircuit.g:2315:2: ( rule__ElementaryQuantumGate__Group_12__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQuCircuit.g:2315:3: rule__ElementaryQuantumGate__Group_12__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ElementaryQuantumGate__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_12()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__12__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__13"
    // InternalQuCircuit.g:2323:1: rule__ElementaryQuantumGate__Group__13 : rule__ElementaryQuantumGate__Group__13__Impl rule__ElementaryQuantumGate__Group__14 ;
    public final void rule__ElementaryQuantumGate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2327:1: ( rule__ElementaryQuantumGate__Group__13__Impl rule__ElementaryQuantumGate__Group__14 )
            // InternalQuCircuit.g:2328:2: rule__ElementaryQuantumGate__Group__13__Impl rule__ElementaryQuantumGate__Group__14
            {
            pushFollow(FOLLOW_28);
            rule__ElementaryQuantumGate__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__14();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__13"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__13__Impl"
    // InternalQuCircuit.g:2335:1: rule__ElementaryQuantumGate__Group__13__Impl : ( ( rule__ElementaryQuantumGate__Group_13__0 )? ) ;
    public final void rule__ElementaryQuantumGate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2339:1: ( ( ( rule__ElementaryQuantumGate__Group_13__0 )? ) )
            // InternalQuCircuit.g:2340:1: ( ( rule__ElementaryQuantumGate__Group_13__0 )? )
            {
            // InternalQuCircuit.g:2340:1: ( ( rule__ElementaryQuantumGate__Group_13__0 )? )
            // InternalQuCircuit.g:2341:2: ( rule__ElementaryQuantumGate__Group_13__0 )?
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_13()); 
            // InternalQuCircuit.g:2342:2: ( rule__ElementaryQuantumGate__Group_13__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQuCircuit.g:2342:3: rule__ElementaryQuantumGate__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementaryQuantumGate__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_13()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__13__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__14"
    // InternalQuCircuit.g:2350:1: rule__ElementaryQuantumGate__Group__14 : rule__ElementaryQuantumGate__Group__14__Impl ;
    public final void rule__ElementaryQuantumGate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2354:1: ( rule__ElementaryQuantumGate__Group__14__Impl )
            // InternalQuCircuit.g:2355:2: rule__ElementaryQuantumGate__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__14__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__14"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__14__Impl"
    // InternalQuCircuit.g:2361:1: rule__ElementaryQuantumGate__Group__14__Impl : ( '}' ) ;
    public final void rule__ElementaryQuantumGate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2365:1: ( ( '}' ) )
            // InternalQuCircuit.g:2366:1: ( '}' )
            {
            // InternalQuCircuit.g:2366:1: ( '}' )
            // InternalQuCircuit.g:2367:2: '}'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__14__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__0"
    // InternalQuCircuit.g:2377:1: rule__ElementaryQuantumGate__Group_4__0 : rule__ElementaryQuantumGate__Group_4__0__Impl rule__ElementaryQuantumGate__Group_4__1 ;
    public final void rule__ElementaryQuantumGate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2381:1: ( rule__ElementaryQuantumGate__Group_4__0__Impl rule__ElementaryQuantumGate__Group_4__1 )
            // InternalQuCircuit.g:2382:2: rule__ElementaryQuantumGate__Group_4__0__Impl rule__ElementaryQuantumGate__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ElementaryQuantumGate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_4__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__0__Impl"
    // InternalQuCircuit.g:2389:1: rule__ElementaryQuantumGate__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__ElementaryQuantumGate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2393:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:2394:1: ( 'operation' )
            {
            // InternalQuCircuit.g:2394:1: ( 'operation' )
            // InternalQuCircuit.g:2395:2: 'operation'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getOperationKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getOperationKeyword_4_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__1"
    // InternalQuCircuit.g:2404:1: rule__ElementaryQuantumGate__Group_4__1 : rule__ElementaryQuantumGate__Group_4__1__Impl ;
    public final void rule__ElementaryQuantumGate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2408:1: ( rule__ElementaryQuantumGate__Group_4__1__Impl )
            // InternalQuCircuit.g:2409:2: rule__ElementaryQuantumGate__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_4__1__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__1__Impl"
    // InternalQuCircuit.g:2415:1: rule__ElementaryQuantumGate__Group_4__1__Impl : ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2419:1: ( ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:2420:1: ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:2420:1: ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) )
            // InternalQuCircuit.g:2421:2: ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getOperationsAssignment_4_1()); 
            // InternalQuCircuit.g:2422:2: ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 )
            // InternalQuCircuit.g:2422:3: rule__ElementaryQuantumGate__OperationsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__OperationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getOperationsAssignment_4_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__0"
    // InternalQuCircuit.g:2431:1: rule__ElementaryQuantumGate__Group_10__0 : rule__ElementaryQuantumGate__Group_10__0__Impl rule__ElementaryQuantumGate__Group_10__1 ;
    public final void rule__ElementaryQuantumGate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2435:1: ( rule__ElementaryQuantumGate__Group_10__0__Impl rule__ElementaryQuantumGate__Group_10__1 )
            // InternalQuCircuit.g:2436:2: rule__ElementaryQuantumGate__Group_10__0__Impl rule__ElementaryQuantumGate__Group_10__1
            {
            pushFollow(FOLLOW_26);
            rule__ElementaryQuantumGate__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__0__Impl"
    // InternalQuCircuit.g:2443:1: rule__ElementaryQuantumGate__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ElementaryQuantumGate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2447:1: ( ( ',' ) )
            // InternalQuCircuit.g:2448:1: ( ',' )
            {
            // InternalQuCircuit.g:2448:1: ( ',' )
            // InternalQuCircuit.g:2449:2: ','
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_10_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__1"
    // InternalQuCircuit.g:2458:1: rule__ElementaryQuantumGate__Group_10__1 : rule__ElementaryQuantumGate__Group_10__1__Impl rule__ElementaryQuantumGate__Group_10__2 ;
    public final void rule__ElementaryQuantumGate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2462:1: ( rule__ElementaryQuantumGate__Group_10__1__Impl rule__ElementaryQuantumGate__Group_10__2 )
            // InternalQuCircuit.g:2463:2: rule__ElementaryQuantumGate__Group_10__1__Impl rule__ElementaryQuantumGate__Group_10__2
            {
            pushFollow(FOLLOW_21);
            rule__ElementaryQuantumGate__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__2();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__1__Impl"
    // InternalQuCircuit.g:2470:1: rule__ElementaryQuantumGate__Group_10__1__Impl : ( '(' ) ;
    public final void rule__ElementaryQuantumGate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2474:1: ( ( '(' ) )
            // InternalQuCircuit.g:2475:1: ( '(' )
            {
            // InternalQuCircuit.g:2475:1: ( '(' )
            // InternalQuCircuit.g:2476:2: '('
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__2"
    // InternalQuCircuit.g:2485:1: rule__ElementaryQuantumGate__Group_10__2 : rule__ElementaryQuantumGate__Group_10__2__Impl rule__ElementaryQuantumGate__Group_10__3 ;
    public final void rule__ElementaryQuantumGate__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2489:1: ( rule__ElementaryQuantumGate__Group_10__2__Impl rule__ElementaryQuantumGate__Group_10__3 )
            // InternalQuCircuit.g:2490:2: rule__ElementaryQuantumGate__Group_10__2__Impl rule__ElementaryQuantumGate__Group_10__3
            {
            pushFollow(FOLLOW_27);
            rule__ElementaryQuantumGate__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__3();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__2"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__2__Impl"
    // InternalQuCircuit.g:2497:1: rule__ElementaryQuantumGate__Group_10__2__Impl : ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2501:1: ( ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) ) )
            // InternalQuCircuit.g:2502:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) )
            {
            // InternalQuCircuit.g:2502:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) )
            // InternalQuCircuit.g:2503:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_10_2()); 
            // InternalQuCircuit.g:2504:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 )
            // InternalQuCircuit.g:2504:3: rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_10_2()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__2__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__3"
    // InternalQuCircuit.g:2512:1: rule__ElementaryQuantumGate__Group_10__3 : rule__ElementaryQuantumGate__Group_10__3__Impl ;
    public final void rule__ElementaryQuantumGate__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2516:1: ( rule__ElementaryQuantumGate__Group_10__3__Impl )
            // InternalQuCircuit.g:2517:2: rule__ElementaryQuantumGate__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__3__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__3"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__3__Impl"
    // InternalQuCircuit.g:2523:1: rule__ElementaryQuantumGate__Group_10__3__Impl : ( ')' ) ;
    public final void rule__ElementaryQuantumGate__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2527:1: ( ( ')' ) )
            // InternalQuCircuit.g:2528:1: ( ')' )
            {
            // InternalQuCircuit.g:2528:1: ( ')' )
            // InternalQuCircuit.g:2529:2: ')'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_10_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_10_3()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__3__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__0"
    // InternalQuCircuit.g:2539:1: rule__ElementaryQuantumGate__Group_12__0 : rule__ElementaryQuantumGate__Group_12__0__Impl rule__ElementaryQuantumGate__Group_12__1 ;
    public final void rule__ElementaryQuantumGate__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2543:1: ( rule__ElementaryQuantumGate__Group_12__0__Impl rule__ElementaryQuantumGate__Group_12__1 )
            // InternalQuCircuit.g:2544:2: rule__ElementaryQuantumGate__Group_12__0__Impl rule__ElementaryQuantumGate__Group_12__1
            {
            pushFollow(FOLLOW_20);
            rule__ElementaryQuantumGate__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__0__Impl"
    // InternalQuCircuit.g:2551:1: rule__ElementaryQuantumGate__Group_12__0__Impl : ( 'controlQubits' ) ;
    public final void rule__ElementaryQuantumGate__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2555:1: ( ( 'controlQubits' ) )
            // InternalQuCircuit.g:2556:1: ( 'controlQubits' )
            {
            // InternalQuCircuit.g:2556:1: ( 'controlQubits' )
            // InternalQuCircuit.g:2557:2: 'controlQubits'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsKeyword_12_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsKeyword_12_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__1"
    // InternalQuCircuit.g:2566:1: rule__ElementaryQuantumGate__Group_12__1 : rule__ElementaryQuantumGate__Group_12__1__Impl rule__ElementaryQuantumGate__Group_12__2 ;
    public final void rule__ElementaryQuantumGate__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2570:1: ( rule__ElementaryQuantumGate__Group_12__1__Impl rule__ElementaryQuantumGate__Group_12__2 )
            // InternalQuCircuit.g:2571:2: rule__ElementaryQuantumGate__Group_12__1__Impl rule__ElementaryQuantumGate__Group_12__2
            {
            pushFollow(FOLLOW_21);
            rule__ElementaryQuantumGate__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__2();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__1__Impl"
    // InternalQuCircuit.g:2578:1: rule__ElementaryQuantumGate__Group_12__1__Impl : ( '[' ) ;
    public final void rule__ElementaryQuantumGate__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2582:1: ( ( '[' ) )
            // InternalQuCircuit.g:2583:1: ( '[' )
            {
            // InternalQuCircuit.g:2583:1: ( '[' )
            // InternalQuCircuit.g:2584:2: '['
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__2"
    // InternalQuCircuit.g:2593:1: rule__ElementaryQuantumGate__Group_12__2 : rule__ElementaryQuantumGate__Group_12__2__Impl rule__ElementaryQuantumGate__Group_12__3 ;
    public final void rule__ElementaryQuantumGate__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2597:1: ( rule__ElementaryQuantumGate__Group_12__2__Impl rule__ElementaryQuantumGate__Group_12__3 )
            // InternalQuCircuit.g:2598:2: rule__ElementaryQuantumGate__Group_12__2__Impl rule__ElementaryQuantumGate__Group_12__3
            {
            pushFollow(FOLLOW_22);
            rule__ElementaryQuantumGate__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__3();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__2"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__2__Impl"
    // InternalQuCircuit.g:2605:1: rule__ElementaryQuantumGate__Group_12__2__Impl : ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2609:1: ( ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) ) )
            // InternalQuCircuit.g:2610:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) )
            {
            // InternalQuCircuit.g:2610:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) )
            // InternalQuCircuit.g:2611:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_2()); 
            // InternalQuCircuit.g:2612:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 )
            // InternalQuCircuit.g:2612:3: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_2()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__2__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__3"
    // InternalQuCircuit.g:2620:1: rule__ElementaryQuantumGate__Group_12__3 : rule__ElementaryQuantumGate__Group_12__3__Impl rule__ElementaryQuantumGate__Group_12__4 ;
    public final void rule__ElementaryQuantumGate__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2624:1: ( rule__ElementaryQuantumGate__Group_12__3__Impl rule__ElementaryQuantumGate__Group_12__4 )
            // InternalQuCircuit.g:2625:2: rule__ElementaryQuantumGate__Group_12__3__Impl rule__ElementaryQuantumGate__Group_12__4
            {
            pushFollow(FOLLOW_22);
            rule__ElementaryQuantumGate__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__4();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__3"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__3__Impl"
    // InternalQuCircuit.g:2632:1: rule__ElementaryQuantumGate__Group_12__3__Impl : ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* ) ;
    public final void rule__ElementaryQuantumGate__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2636:1: ( ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* ) )
            // InternalQuCircuit.g:2637:1: ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* )
            {
            // InternalQuCircuit.g:2637:1: ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* )
            // InternalQuCircuit.g:2638:2: ( rule__ElementaryQuantumGate__Group_12_3__0 )*
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_12_3()); 
            // InternalQuCircuit.g:2639:2: ( rule__ElementaryQuantumGate__Group_12_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQuCircuit.g:2639:3: rule__ElementaryQuantumGate__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ElementaryQuantumGate__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__3__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__4"
    // InternalQuCircuit.g:2647:1: rule__ElementaryQuantumGate__Group_12__4 : rule__ElementaryQuantumGate__Group_12__4__Impl ;
    public final void rule__ElementaryQuantumGate__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2651:1: ( rule__ElementaryQuantumGate__Group_12__4__Impl )
            // InternalQuCircuit.g:2652:2: rule__ElementaryQuantumGate__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__4__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__4"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__4__Impl"
    // InternalQuCircuit.g:2658:1: rule__ElementaryQuantumGate__Group_12__4__Impl : ( ']' ) ;
    public final void rule__ElementaryQuantumGate__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2662:1: ( ( ']' ) )
            // InternalQuCircuit.g:2663:1: ( ']' )
            {
            // InternalQuCircuit.g:2663:1: ( ']' )
            // InternalQuCircuit.g:2664:2: ']'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__4__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__0"
    // InternalQuCircuit.g:2674:1: rule__ElementaryQuantumGate__Group_12_3__0 : rule__ElementaryQuantumGate__Group_12_3__0__Impl rule__ElementaryQuantumGate__Group_12_3__1 ;
    public final void rule__ElementaryQuantumGate__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2678:1: ( rule__ElementaryQuantumGate__Group_12_3__0__Impl rule__ElementaryQuantumGate__Group_12_3__1 )
            // InternalQuCircuit.g:2679:2: rule__ElementaryQuantumGate__Group_12_3__0__Impl rule__ElementaryQuantumGate__Group_12_3__1
            {
            pushFollow(FOLLOW_21);
            rule__ElementaryQuantumGate__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12_3__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__0__Impl"
    // InternalQuCircuit.g:2686:1: rule__ElementaryQuantumGate__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__ElementaryQuantumGate__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2690:1: ( ( ',' ) )
            // InternalQuCircuit.g:2691:1: ( ',' )
            {
            // InternalQuCircuit.g:2691:1: ( ',' )
            // InternalQuCircuit.g:2692:2: ','
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_12_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__1"
    // InternalQuCircuit.g:2701:1: rule__ElementaryQuantumGate__Group_12_3__1 : rule__ElementaryQuantumGate__Group_12_3__1__Impl ;
    public final void rule__ElementaryQuantumGate__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2705:1: ( rule__ElementaryQuantumGate__Group_12_3__1__Impl )
            // InternalQuCircuit.g:2706:2: rule__ElementaryQuantumGate__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__1__Impl"
    // InternalQuCircuit.g:2712:1: rule__ElementaryQuantumGate__Group_12_3__1__Impl : ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2716:1: ( ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) ) )
            // InternalQuCircuit.g:2717:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            {
            // InternalQuCircuit.g:2717:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            // InternalQuCircuit.g:2718:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 
            // InternalQuCircuit.g:2719:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 )
            // InternalQuCircuit.g:2719:3: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__0"
    // InternalQuCircuit.g:2728:1: rule__ElementaryQuantumGate__Group_13__0 : rule__ElementaryQuantumGate__Group_13__0__Impl rule__ElementaryQuantumGate__Group_13__1 ;
    public final void rule__ElementaryQuantumGate__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2732:1: ( rule__ElementaryQuantumGate__Group_13__0__Impl rule__ElementaryQuantumGate__Group_13__1 )
            // InternalQuCircuit.g:2733:2: rule__ElementaryQuantumGate__Group_13__0__Impl rule__ElementaryQuantumGate__Group_13__1
            {
            pushFollow(FOLLOW_30);
            rule__ElementaryQuantumGate__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_13__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__0__Impl"
    // InternalQuCircuit.g:2740:1: rule__ElementaryQuantumGate__Group_13__0__Impl : ( 'angleParameter' ) ;
    public final void rule__ElementaryQuantumGate__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2744:1: ( ( 'angleParameter' ) )
            // InternalQuCircuit.g:2745:1: ( 'angleParameter' )
            {
            // InternalQuCircuit.g:2745:1: ( 'angleParameter' )
            // InternalQuCircuit.g:2746:2: 'angleParameter'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterKeyword_13_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterKeyword_13_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__1"
    // InternalQuCircuit.g:2755:1: rule__ElementaryQuantumGate__Group_13__1 : rule__ElementaryQuantumGate__Group_13__1__Impl ;
    public final void rule__ElementaryQuantumGate__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2759:1: ( rule__ElementaryQuantumGate__Group_13__1__Impl )
            // InternalQuCircuit.g:2760:2: rule__ElementaryQuantumGate__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_13__1__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__1__Impl"
    // InternalQuCircuit.g:2766:1: rule__ElementaryQuantumGate__Group_13__1__Impl : ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2770:1: ( ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) ) )
            // InternalQuCircuit.g:2771:1: ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) )
            {
            // InternalQuCircuit.g:2771:1: ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) )
            // InternalQuCircuit.g:2772:2: ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAssignment_13_1()); 
            // InternalQuCircuit.g:2773:2: ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 )
            // InternalQuCircuit.g:2773:3: rule__ElementaryQuantumGate__AngleParameterAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__AngleParameterAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAssignment_13_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group__0"
    // InternalQuCircuit.g:2782:1: rule__AngleParameter__Group__0 : rule__AngleParameter__Group__0__Impl rule__AngleParameter__Group__1 ;
    public final void rule__AngleParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2786:1: ( rule__AngleParameter__Group__0__Impl rule__AngleParameter__Group__1 )
            // InternalQuCircuit.g:2787:2: rule__AngleParameter__Group__0__Impl rule__AngleParameter__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__AngleParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__1();

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
    // $ANTLR end "rule__AngleParameter__Group__0"


    // $ANTLR start "rule__AngleParameter__Group__0__Impl"
    // InternalQuCircuit.g:2794:1: rule__AngleParameter__Group__0__Impl : ( () ) ;
    public final void rule__AngleParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2798:1: ( ( () ) )
            // InternalQuCircuit.g:2799:1: ( () )
            {
            // InternalQuCircuit.g:2799:1: ( () )
            // InternalQuCircuit.g:2800:2: ()
            {
             before(grammarAccess.getAngleParameterAccess().getAngleParameterAction_0()); 
            // InternalQuCircuit.g:2801:2: ()
            // InternalQuCircuit.g:2801:3: 
            {
            }

             after(grammarAccess.getAngleParameterAccess().getAngleParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AngleParameter__Group__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group__1"
    // InternalQuCircuit.g:2809:1: rule__AngleParameter__Group__1 : rule__AngleParameter__Group__1__Impl rule__AngleParameter__Group__2 ;
    public final void rule__AngleParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2813:1: ( rule__AngleParameter__Group__1__Impl rule__AngleParameter__Group__2 )
            // InternalQuCircuit.g:2814:2: rule__AngleParameter__Group__1__Impl rule__AngleParameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AngleParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__2();

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
    // $ANTLR end "rule__AngleParameter__Group__1"


    // $ANTLR start "rule__AngleParameter__Group__1__Impl"
    // InternalQuCircuit.g:2821:1: rule__AngleParameter__Group__1__Impl : ( 'AngleParameter' ) ;
    public final void rule__AngleParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2825:1: ( ( 'AngleParameter' ) )
            // InternalQuCircuit.g:2826:1: ( 'AngleParameter' )
            {
            // InternalQuCircuit.g:2826:1: ( 'AngleParameter' )
            // InternalQuCircuit.g:2827:2: 'AngleParameter'
            {
             before(grammarAccess.getAngleParameterAccess().getAngleParameterKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getAngleParameterKeyword_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group__2"
    // InternalQuCircuit.g:2836:1: rule__AngleParameter__Group__2 : rule__AngleParameter__Group__2__Impl rule__AngleParameter__Group__3 ;
    public final void rule__AngleParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2840:1: ( rule__AngleParameter__Group__2__Impl rule__AngleParameter__Group__3 )
            // InternalQuCircuit.g:2841:2: rule__AngleParameter__Group__2__Impl rule__AngleParameter__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__3();

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
    // $ANTLR end "rule__AngleParameter__Group__2"


    // $ANTLR start "rule__AngleParameter__Group__2__Impl"
    // InternalQuCircuit.g:2848:1: rule__AngleParameter__Group__2__Impl : ( '{' ) ;
    public final void rule__AngleParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2852:1: ( ( '{' ) )
            // InternalQuCircuit.g:2853:1: ( '{' )
            {
            // InternalQuCircuit.g:2853:1: ( '{' )
            // InternalQuCircuit.g:2854:2: '{'
            {
             before(grammarAccess.getAngleParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AngleParameter__Group__2__Impl"


    // $ANTLR start "rule__AngleParameter__Group__3"
    // InternalQuCircuit.g:2863:1: rule__AngleParameter__Group__3 : rule__AngleParameter__Group__3__Impl rule__AngleParameter__Group__4 ;
    public final void rule__AngleParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2867:1: ( rule__AngleParameter__Group__3__Impl rule__AngleParameter__Group__4 )
            // InternalQuCircuit.g:2868:2: rule__AngleParameter__Group__3__Impl rule__AngleParameter__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__4();

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
    // $ANTLR end "rule__AngleParameter__Group__3"


    // $ANTLR start "rule__AngleParameter__Group__3__Impl"
    // InternalQuCircuit.g:2875:1: rule__AngleParameter__Group__3__Impl : ( ( rule__AngleParameter__Group_3__0 )? ) ;
    public final void rule__AngleParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2879:1: ( ( ( rule__AngleParameter__Group_3__0 )? ) )
            // InternalQuCircuit.g:2880:1: ( ( rule__AngleParameter__Group_3__0 )? )
            {
            // InternalQuCircuit.g:2880:1: ( ( rule__AngleParameter__Group_3__0 )? )
            // InternalQuCircuit.g:2881:2: ( rule__AngleParameter__Group_3__0 )?
            {
             before(grammarAccess.getAngleParameterAccess().getGroup_3()); 
            // InternalQuCircuit.g:2882:2: ( rule__AngleParameter__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQuCircuit.g:2882:3: rule__AngleParameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AngleParameter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAngleParameterAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AngleParameter__Group__3__Impl"


    // $ANTLR start "rule__AngleParameter__Group__4"
    // InternalQuCircuit.g:2890:1: rule__AngleParameter__Group__4 : rule__AngleParameter__Group__4__Impl rule__AngleParameter__Group__5 ;
    public final void rule__AngleParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2894:1: ( rule__AngleParameter__Group__4__Impl rule__AngleParameter__Group__5 )
            // InternalQuCircuit.g:2895:2: rule__AngleParameter__Group__4__Impl rule__AngleParameter__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__5();

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
    // $ANTLR end "rule__AngleParameter__Group__4"


    // $ANTLR start "rule__AngleParameter__Group__4__Impl"
    // InternalQuCircuit.g:2902:1: rule__AngleParameter__Group__4__Impl : ( ( rule__AngleParameter__Group_4__0 )? ) ;
    public final void rule__AngleParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2906:1: ( ( ( rule__AngleParameter__Group_4__0 )? ) )
            // InternalQuCircuit.g:2907:1: ( ( rule__AngleParameter__Group_4__0 )? )
            {
            // InternalQuCircuit.g:2907:1: ( ( rule__AngleParameter__Group_4__0 )? )
            // InternalQuCircuit.g:2908:2: ( rule__AngleParameter__Group_4__0 )?
            {
             before(grammarAccess.getAngleParameterAccess().getGroup_4()); 
            // InternalQuCircuit.g:2909:2: ( rule__AngleParameter__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQuCircuit.g:2909:3: rule__AngleParameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AngleParameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAngleParameterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AngleParameter__Group__4__Impl"


    // $ANTLR start "rule__AngleParameter__Group__5"
    // InternalQuCircuit.g:2917:1: rule__AngleParameter__Group__5 : rule__AngleParameter__Group__5__Impl rule__AngleParameter__Group__6 ;
    public final void rule__AngleParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2921:1: ( rule__AngleParameter__Group__5__Impl rule__AngleParameter__Group__6 )
            // InternalQuCircuit.g:2922:2: rule__AngleParameter__Group__5__Impl rule__AngleParameter__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__6();

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
    // $ANTLR end "rule__AngleParameter__Group__5"


    // $ANTLR start "rule__AngleParameter__Group__5__Impl"
    // InternalQuCircuit.g:2929:1: rule__AngleParameter__Group__5__Impl : ( ( rule__AngleParameter__Group_5__0 )? ) ;
    public final void rule__AngleParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2933:1: ( ( ( rule__AngleParameter__Group_5__0 )? ) )
            // InternalQuCircuit.g:2934:1: ( ( rule__AngleParameter__Group_5__0 )? )
            {
            // InternalQuCircuit.g:2934:1: ( ( rule__AngleParameter__Group_5__0 )? )
            // InternalQuCircuit.g:2935:2: ( rule__AngleParameter__Group_5__0 )?
            {
             before(grammarAccess.getAngleParameterAccess().getGroup_5()); 
            // InternalQuCircuit.g:2936:2: ( rule__AngleParameter__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuCircuit.g:2936:3: rule__AngleParameter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AngleParameter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAngleParameterAccess().getGroup_5()); 

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
    // $ANTLR end "rule__AngleParameter__Group__5__Impl"


    // $ANTLR start "rule__AngleParameter__Group__6"
    // InternalQuCircuit.g:2944:1: rule__AngleParameter__Group__6 : rule__AngleParameter__Group__6__Impl ;
    public final void rule__AngleParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2948:1: ( rule__AngleParameter__Group__6__Impl )
            // InternalQuCircuit.g:2949:2: rule__AngleParameter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__6__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group__6"


    // $ANTLR start "rule__AngleParameter__Group__6__Impl"
    // InternalQuCircuit.g:2955:1: rule__AngleParameter__Group__6__Impl : ( '}' ) ;
    public final void rule__AngleParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2959:1: ( ( '}' ) )
            // InternalQuCircuit.g:2960:1: ( '}' )
            {
            // InternalQuCircuit.g:2960:1: ( '}' )
            // InternalQuCircuit.g:2961:2: '}'
            {
             before(grammarAccess.getAngleParameterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__AngleParameter__Group__6__Impl"


    // $ANTLR start "rule__AngleParameter__Group_3__0"
    // InternalQuCircuit.g:2971:1: rule__AngleParameter__Group_3__0 : rule__AngleParameter__Group_3__0__Impl rule__AngleParameter__Group_3__1 ;
    public final void rule__AngleParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2975:1: ( rule__AngleParameter__Group_3__0__Impl rule__AngleParameter__Group_3__1 )
            // InternalQuCircuit.g:2976:2: rule__AngleParameter__Group_3__0__Impl rule__AngleParameter__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__AngleParameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_3__1();

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
    // $ANTLR end "rule__AngleParameter__Group_3__0"


    // $ANTLR start "rule__AngleParameter__Group_3__0__Impl"
    // InternalQuCircuit.g:2983:1: rule__AngleParameter__Group_3__0__Impl : ( 'theta' ) ;
    public final void rule__AngleParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2987:1: ( ( 'theta' ) )
            // InternalQuCircuit.g:2988:1: ( 'theta' )
            {
            // InternalQuCircuit.g:2988:1: ( 'theta' )
            // InternalQuCircuit.g:2989:2: 'theta'
            {
             before(grammarAccess.getAngleParameterAccess().getThetaKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getThetaKeyword_3_0()); 

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
    // $ANTLR end "rule__AngleParameter__Group_3__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group_3__1"
    // InternalQuCircuit.g:2998:1: rule__AngleParameter__Group_3__1 : rule__AngleParameter__Group_3__1__Impl ;
    public final void rule__AngleParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3002:1: ( rule__AngleParameter__Group_3__1__Impl )
            // InternalQuCircuit.g:3003:2: rule__AngleParameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_3__1__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group_3__1"


    // $ANTLR start "rule__AngleParameter__Group_3__1__Impl"
    // InternalQuCircuit.g:3009:1: rule__AngleParameter__Group_3__1__Impl : ( ( rule__AngleParameter__ThetaAssignment_3_1 ) ) ;
    public final void rule__AngleParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3013:1: ( ( ( rule__AngleParameter__ThetaAssignment_3_1 ) ) )
            // InternalQuCircuit.g:3014:1: ( ( rule__AngleParameter__ThetaAssignment_3_1 ) )
            {
            // InternalQuCircuit.g:3014:1: ( ( rule__AngleParameter__ThetaAssignment_3_1 ) )
            // InternalQuCircuit.g:3015:2: ( rule__AngleParameter__ThetaAssignment_3_1 )
            {
             before(grammarAccess.getAngleParameterAccess().getThetaAssignment_3_1()); 
            // InternalQuCircuit.g:3016:2: ( rule__AngleParameter__ThetaAssignment_3_1 )
            // InternalQuCircuit.g:3016:3: rule__AngleParameter__ThetaAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__ThetaAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getThetaAssignment_3_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group_3__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group_4__0"
    // InternalQuCircuit.g:3025:1: rule__AngleParameter__Group_4__0 : rule__AngleParameter__Group_4__0__Impl rule__AngleParameter__Group_4__1 ;
    public final void rule__AngleParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3029:1: ( rule__AngleParameter__Group_4__0__Impl rule__AngleParameter__Group_4__1 )
            // InternalQuCircuit.g:3030:2: rule__AngleParameter__Group_4__0__Impl rule__AngleParameter__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__AngleParameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_4__1();

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
    // $ANTLR end "rule__AngleParameter__Group_4__0"


    // $ANTLR start "rule__AngleParameter__Group_4__0__Impl"
    // InternalQuCircuit.g:3037:1: rule__AngleParameter__Group_4__0__Impl : ( 'phi' ) ;
    public final void rule__AngleParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3041:1: ( ( 'phi' ) )
            // InternalQuCircuit.g:3042:1: ( 'phi' )
            {
            // InternalQuCircuit.g:3042:1: ( 'phi' )
            // InternalQuCircuit.g:3043:2: 'phi'
            {
             before(grammarAccess.getAngleParameterAccess().getPhiKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getPhiKeyword_4_0()); 

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
    // $ANTLR end "rule__AngleParameter__Group_4__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group_4__1"
    // InternalQuCircuit.g:3052:1: rule__AngleParameter__Group_4__1 : rule__AngleParameter__Group_4__1__Impl ;
    public final void rule__AngleParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3056:1: ( rule__AngleParameter__Group_4__1__Impl )
            // InternalQuCircuit.g:3057:2: rule__AngleParameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_4__1__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group_4__1"


    // $ANTLR start "rule__AngleParameter__Group_4__1__Impl"
    // InternalQuCircuit.g:3063:1: rule__AngleParameter__Group_4__1__Impl : ( ( rule__AngleParameter__PhiAssignment_4_1 ) ) ;
    public final void rule__AngleParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3067:1: ( ( ( rule__AngleParameter__PhiAssignment_4_1 ) ) )
            // InternalQuCircuit.g:3068:1: ( ( rule__AngleParameter__PhiAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:3068:1: ( ( rule__AngleParameter__PhiAssignment_4_1 ) )
            // InternalQuCircuit.g:3069:2: ( rule__AngleParameter__PhiAssignment_4_1 )
            {
             before(grammarAccess.getAngleParameterAccess().getPhiAssignment_4_1()); 
            // InternalQuCircuit.g:3070:2: ( rule__AngleParameter__PhiAssignment_4_1 )
            // InternalQuCircuit.g:3070:3: rule__AngleParameter__PhiAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__PhiAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getPhiAssignment_4_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group_4__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group_5__0"
    // InternalQuCircuit.g:3079:1: rule__AngleParameter__Group_5__0 : rule__AngleParameter__Group_5__0__Impl rule__AngleParameter__Group_5__1 ;
    public final void rule__AngleParameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3083:1: ( rule__AngleParameter__Group_5__0__Impl rule__AngleParameter__Group_5__1 )
            // InternalQuCircuit.g:3084:2: rule__AngleParameter__Group_5__0__Impl rule__AngleParameter__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__AngleParameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_5__1();

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
    // $ANTLR end "rule__AngleParameter__Group_5__0"


    // $ANTLR start "rule__AngleParameter__Group_5__0__Impl"
    // InternalQuCircuit.g:3091:1: rule__AngleParameter__Group_5__0__Impl : ( 'lambda' ) ;
    public final void rule__AngleParameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3095:1: ( ( 'lambda' ) )
            // InternalQuCircuit.g:3096:1: ( 'lambda' )
            {
            // InternalQuCircuit.g:3096:1: ( 'lambda' )
            // InternalQuCircuit.g:3097:2: 'lambda'
            {
             before(grammarAccess.getAngleParameterAccess().getLambdaKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getLambdaKeyword_5_0()); 

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
    // $ANTLR end "rule__AngleParameter__Group_5__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group_5__1"
    // InternalQuCircuit.g:3106:1: rule__AngleParameter__Group_5__1 : rule__AngleParameter__Group_5__1__Impl ;
    public final void rule__AngleParameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3110:1: ( rule__AngleParameter__Group_5__1__Impl )
            // InternalQuCircuit.g:3111:2: rule__AngleParameter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_5__1__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group_5__1"


    // $ANTLR start "rule__AngleParameter__Group_5__1__Impl"
    // InternalQuCircuit.g:3117:1: rule__AngleParameter__Group_5__1__Impl : ( ( rule__AngleParameter__LambdaAssignment_5_1 ) ) ;
    public final void rule__AngleParameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3121:1: ( ( ( rule__AngleParameter__LambdaAssignment_5_1 ) ) )
            // InternalQuCircuit.g:3122:1: ( ( rule__AngleParameter__LambdaAssignment_5_1 ) )
            {
            // InternalQuCircuit.g:3122:1: ( ( rule__AngleParameter__LambdaAssignment_5_1 ) )
            // InternalQuCircuit.g:3123:2: ( rule__AngleParameter__LambdaAssignment_5_1 )
            {
             before(grammarAccess.getAngleParameterAccess().getLambdaAssignment_5_1()); 
            // InternalQuCircuit.g:3124:2: ( rule__AngleParameter__LambdaAssignment_5_1 )
            // InternalQuCircuit.g:3124:3: rule__AngleParameter__LambdaAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__LambdaAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getLambdaAssignment_5_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group_5__1__Impl"


    // $ANTLR start "rule__Measurement__Group__0"
    // InternalQuCircuit.g:3133:1: rule__Measurement__Group__0 : rule__Measurement__Group__0__Impl rule__Measurement__Group__1 ;
    public final void rule__Measurement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3137:1: ( rule__Measurement__Group__0__Impl rule__Measurement__Group__1 )
            // InternalQuCircuit.g:3138:2: rule__Measurement__Group__0__Impl rule__Measurement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Measurement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__1();

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
    // $ANTLR end "rule__Measurement__Group__0"


    // $ANTLR start "rule__Measurement__Group__0__Impl"
    // InternalQuCircuit.g:3145:1: rule__Measurement__Group__0__Impl : ( 'Measurement' ) ;
    public final void rule__Measurement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3149:1: ( ( 'Measurement' ) )
            // InternalQuCircuit.g:3150:1: ( 'Measurement' )
            {
            // InternalQuCircuit.g:3150:1: ( 'Measurement' )
            // InternalQuCircuit.g:3151:2: 'Measurement'
            {
             before(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 

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
    // $ANTLR end "rule__Measurement__Group__0__Impl"


    // $ANTLR start "rule__Measurement__Group__1"
    // InternalQuCircuit.g:3160:1: rule__Measurement__Group__1 : rule__Measurement__Group__1__Impl rule__Measurement__Group__2 ;
    public final void rule__Measurement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3164:1: ( rule__Measurement__Group__1__Impl rule__Measurement__Group__2 )
            // InternalQuCircuit.g:3165:2: rule__Measurement__Group__1__Impl rule__Measurement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Measurement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__2();

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
    // $ANTLR end "rule__Measurement__Group__1"


    // $ANTLR start "rule__Measurement__Group__1__Impl"
    // InternalQuCircuit.g:3172:1: rule__Measurement__Group__1__Impl : ( ( rule__Measurement__NameAssignment_1 ) ) ;
    public final void rule__Measurement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3176:1: ( ( ( rule__Measurement__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:3177:1: ( ( rule__Measurement__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:3177:1: ( ( rule__Measurement__NameAssignment_1 ) )
            // InternalQuCircuit.g:3178:2: ( rule__Measurement__NameAssignment_1 )
            {
             before(grammarAccess.getMeasurementAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:3179:2: ( rule__Measurement__NameAssignment_1 )
            // InternalQuCircuit.g:3179:3: rule__Measurement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Measurement__Group__1__Impl"


    // $ANTLR start "rule__Measurement__Group__2"
    // InternalQuCircuit.g:3187:1: rule__Measurement__Group__2 : rule__Measurement__Group__2__Impl rule__Measurement__Group__3 ;
    public final void rule__Measurement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3191:1: ( rule__Measurement__Group__2__Impl rule__Measurement__Group__3 )
            // InternalQuCircuit.g:3192:2: rule__Measurement__Group__2__Impl rule__Measurement__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Measurement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__3();

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
    // $ANTLR end "rule__Measurement__Group__2"


    // $ANTLR start "rule__Measurement__Group__2__Impl"
    // InternalQuCircuit.g:3199:1: rule__Measurement__Group__2__Impl : ( '{' ) ;
    public final void rule__Measurement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3203:1: ( ( '{' ) )
            // InternalQuCircuit.g:3204:1: ( '{' )
            {
            // InternalQuCircuit.g:3204:1: ( '{' )
            // InternalQuCircuit.g:3205:2: '{'
            {
             before(grammarAccess.getMeasurementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Measurement__Group__2__Impl"


    // $ANTLR start "rule__Measurement__Group__3"
    // InternalQuCircuit.g:3214:1: rule__Measurement__Group__3 : rule__Measurement__Group__3__Impl rule__Measurement__Group__4 ;
    public final void rule__Measurement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3218:1: ( rule__Measurement__Group__3__Impl rule__Measurement__Group__4 )
            // InternalQuCircuit.g:3219:2: rule__Measurement__Group__3__Impl rule__Measurement__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Measurement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__4();

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
    // $ANTLR end "rule__Measurement__Group__3"


    // $ANTLR start "rule__Measurement__Group__3__Impl"
    // InternalQuCircuit.g:3226:1: rule__Measurement__Group__3__Impl : ( ( rule__Measurement__Group_3__0 )? ) ;
    public final void rule__Measurement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3230:1: ( ( ( rule__Measurement__Group_3__0 )? ) )
            // InternalQuCircuit.g:3231:1: ( ( rule__Measurement__Group_3__0 )? )
            {
            // InternalQuCircuit.g:3231:1: ( ( rule__Measurement__Group_3__0 )? )
            // InternalQuCircuit.g:3232:2: ( rule__Measurement__Group_3__0 )?
            {
             before(grammarAccess.getMeasurementAccess().getGroup_3()); 
            // InternalQuCircuit.g:3233:2: ( rule__Measurement__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQuCircuit.g:3233:3: rule__Measurement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Measurement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Measurement__Group__3__Impl"


    // $ANTLR start "rule__Measurement__Group__4"
    // InternalQuCircuit.g:3241:1: rule__Measurement__Group__4 : rule__Measurement__Group__4__Impl rule__Measurement__Group__5 ;
    public final void rule__Measurement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3245:1: ( rule__Measurement__Group__4__Impl rule__Measurement__Group__5 )
            // InternalQuCircuit.g:3246:2: rule__Measurement__Group__4__Impl rule__Measurement__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Measurement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__5();

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
    // $ANTLR end "rule__Measurement__Group__4"


    // $ANTLR start "rule__Measurement__Group__4__Impl"
    // InternalQuCircuit.g:3253:1: rule__Measurement__Group__4__Impl : ( 'targetQubits' ) ;
    public final void rule__Measurement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3257:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:3258:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:3258:1: ( 'targetQubits' )
            // InternalQuCircuit.g:3259:2: 'targetQubits'
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getTargetQubitsKeyword_4()); 

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
    // $ANTLR end "rule__Measurement__Group__4__Impl"


    // $ANTLR start "rule__Measurement__Group__5"
    // InternalQuCircuit.g:3268:1: rule__Measurement__Group__5 : rule__Measurement__Group__5__Impl rule__Measurement__Group__6 ;
    public final void rule__Measurement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3272:1: ( rule__Measurement__Group__5__Impl rule__Measurement__Group__6 )
            // InternalQuCircuit.g:3273:2: rule__Measurement__Group__5__Impl rule__Measurement__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Measurement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__6();

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
    // $ANTLR end "rule__Measurement__Group__5"


    // $ANTLR start "rule__Measurement__Group__5__Impl"
    // InternalQuCircuit.g:3280:1: rule__Measurement__Group__5__Impl : ( '[' ) ;
    public final void rule__Measurement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3284:1: ( ( '[' ) )
            // InternalQuCircuit.g:3285:1: ( '[' )
            {
            // InternalQuCircuit.g:3285:1: ( '[' )
            // InternalQuCircuit.g:3286:2: '['
            {
             before(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Measurement__Group__5__Impl"


    // $ANTLR start "rule__Measurement__Group__6"
    // InternalQuCircuit.g:3295:1: rule__Measurement__Group__6 : rule__Measurement__Group__6__Impl rule__Measurement__Group__7 ;
    public final void rule__Measurement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3299:1: ( rule__Measurement__Group__6__Impl rule__Measurement__Group__7 )
            // InternalQuCircuit.g:3300:2: rule__Measurement__Group__6__Impl rule__Measurement__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Measurement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__7();

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
    // $ANTLR end "rule__Measurement__Group__6"


    // $ANTLR start "rule__Measurement__Group__6__Impl"
    // InternalQuCircuit.g:3307:1: rule__Measurement__Group__6__Impl : ( '(' ) ;
    public final void rule__Measurement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3311:1: ( ( '(' ) )
            // InternalQuCircuit.g:3312:1: ( '(' )
            {
            // InternalQuCircuit.g:3312:1: ( '(' )
            // InternalQuCircuit.g:3313:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Measurement__Group__6__Impl"


    // $ANTLR start "rule__Measurement__Group__7"
    // InternalQuCircuit.g:3322:1: rule__Measurement__Group__7 : rule__Measurement__Group__7__Impl rule__Measurement__Group__8 ;
    public final void rule__Measurement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3326:1: ( rule__Measurement__Group__7__Impl rule__Measurement__Group__8 )
            // InternalQuCircuit.g:3327:2: rule__Measurement__Group__7__Impl rule__Measurement__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Measurement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__8();

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
    // $ANTLR end "rule__Measurement__Group__7"


    // $ANTLR start "rule__Measurement__Group__7__Impl"
    // InternalQuCircuit.g:3334:1: rule__Measurement__Group__7__Impl : ( ( rule__Measurement__TargetQubitsAssignment_7 ) ) ;
    public final void rule__Measurement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3338:1: ( ( ( rule__Measurement__TargetQubitsAssignment_7 ) ) )
            // InternalQuCircuit.g:3339:1: ( ( rule__Measurement__TargetQubitsAssignment_7 ) )
            {
            // InternalQuCircuit.g:3339:1: ( ( rule__Measurement__TargetQubitsAssignment_7 ) )
            // InternalQuCircuit.g:3340:2: ( rule__Measurement__TargetQubitsAssignment_7 )
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_7()); 
            // InternalQuCircuit.g:3341:2: ( rule__Measurement__TargetQubitsAssignment_7 )
            // InternalQuCircuit.g:3341:3: rule__Measurement__TargetQubitsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__TargetQubitsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_7()); 

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
    // $ANTLR end "rule__Measurement__Group__7__Impl"


    // $ANTLR start "rule__Measurement__Group__8"
    // InternalQuCircuit.g:3349:1: rule__Measurement__Group__8 : rule__Measurement__Group__8__Impl rule__Measurement__Group__9 ;
    public final void rule__Measurement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3353:1: ( rule__Measurement__Group__8__Impl rule__Measurement__Group__9 )
            // InternalQuCircuit.g:3354:2: rule__Measurement__Group__8__Impl rule__Measurement__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Measurement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__9();

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
    // $ANTLR end "rule__Measurement__Group__8"


    // $ANTLR start "rule__Measurement__Group__8__Impl"
    // InternalQuCircuit.g:3361:1: rule__Measurement__Group__8__Impl : ( ')' ) ;
    public final void rule__Measurement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3365:1: ( ( ')' ) )
            // InternalQuCircuit.g:3366:1: ( ')' )
            {
            // InternalQuCircuit.g:3366:1: ( ')' )
            // InternalQuCircuit.g:3367:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__Measurement__Group__8__Impl"


    // $ANTLR start "rule__Measurement__Group__9"
    // InternalQuCircuit.g:3376:1: rule__Measurement__Group__9 : rule__Measurement__Group__9__Impl rule__Measurement__Group__10 ;
    public final void rule__Measurement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3380:1: ( rule__Measurement__Group__9__Impl rule__Measurement__Group__10 )
            // InternalQuCircuit.g:3381:2: rule__Measurement__Group__9__Impl rule__Measurement__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Measurement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__10();

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
    // $ANTLR end "rule__Measurement__Group__9"


    // $ANTLR start "rule__Measurement__Group__9__Impl"
    // InternalQuCircuit.g:3388:1: rule__Measurement__Group__9__Impl : ( ( rule__Measurement__Group_9__0 )* ) ;
    public final void rule__Measurement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3392:1: ( ( ( rule__Measurement__Group_9__0 )* ) )
            // InternalQuCircuit.g:3393:1: ( ( rule__Measurement__Group_9__0 )* )
            {
            // InternalQuCircuit.g:3393:1: ( ( rule__Measurement__Group_9__0 )* )
            // InternalQuCircuit.g:3394:2: ( rule__Measurement__Group_9__0 )*
            {
             before(grammarAccess.getMeasurementAccess().getGroup_9()); 
            // InternalQuCircuit.g:3395:2: ( rule__Measurement__Group_9__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQuCircuit.g:3395:3: rule__Measurement__Group_9__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Measurement__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMeasurementAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Measurement__Group__9__Impl"


    // $ANTLR start "rule__Measurement__Group__10"
    // InternalQuCircuit.g:3403:1: rule__Measurement__Group__10 : rule__Measurement__Group__10__Impl rule__Measurement__Group__11 ;
    public final void rule__Measurement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3407:1: ( rule__Measurement__Group__10__Impl rule__Measurement__Group__11 )
            // InternalQuCircuit.g:3408:2: rule__Measurement__Group__10__Impl rule__Measurement__Group__11
            {
            pushFollow(FOLLOW_33);
            rule__Measurement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__11();

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
    // $ANTLR end "rule__Measurement__Group__10"


    // $ANTLR start "rule__Measurement__Group__10__Impl"
    // InternalQuCircuit.g:3415:1: rule__Measurement__Group__10__Impl : ( ']' ) ;
    public final void rule__Measurement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3419:1: ( ( ']' ) )
            // InternalQuCircuit.g:3420:1: ( ']' )
            {
            // InternalQuCircuit.g:3420:1: ( ']' )
            // InternalQuCircuit.g:3421:2: ']'
            {
             before(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__Measurement__Group__10__Impl"


    // $ANTLR start "rule__Measurement__Group__11"
    // InternalQuCircuit.g:3430:1: rule__Measurement__Group__11 : rule__Measurement__Group__11__Impl rule__Measurement__Group__12 ;
    public final void rule__Measurement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3434:1: ( rule__Measurement__Group__11__Impl rule__Measurement__Group__12 )
            // InternalQuCircuit.g:3435:2: rule__Measurement__Group__11__Impl rule__Measurement__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Measurement__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__12();

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
    // $ANTLR end "rule__Measurement__Group__11"


    // $ANTLR start "rule__Measurement__Group__11__Impl"
    // InternalQuCircuit.g:3442:1: rule__Measurement__Group__11__Impl : ( 'classicBits' ) ;
    public final void rule__Measurement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3446:1: ( ( 'classicBits' ) )
            // InternalQuCircuit.g:3447:1: ( 'classicBits' )
            {
            // InternalQuCircuit.g:3447:1: ( 'classicBits' )
            // InternalQuCircuit.g:3448:2: 'classicBits'
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsKeyword_11()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getClassicBitsKeyword_11()); 

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
    // $ANTLR end "rule__Measurement__Group__11__Impl"


    // $ANTLR start "rule__Measurement__Group__12"
    // InternalQuCircuit.g:3457:1: rule__Measurement__Group__12 : rule__Measurement__Group__12__Impl rule__Measurement__Group__13 ;
    public final void rule__Measurement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3461:1: ( rule__Measurement__Group__12__Impl rule__Measurement__Group__13 )
            // InternalQuCircuit.g:3462:2: rule__Measurement__Group__12__Impl rule__Measurement__Group__13
            {
            pushFollow(FOLLOW_26);
            rule__Measurement__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__13();

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
    // $ANTLR end "rule__Measurement__Group__12"


    // $ANTLR start "rule__Measurement__Group__12__Impl"
    // InternalQuCircuit.g:3469:1: rule__Measurement__Group__12__Impl : ( '[' ) ;
    public final void rule__Measurement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3473:1: ( ( '[' ) )
            // InternalQuCircuit.g:3474:1: ( '[' )
            {
            // InternalQuCircuit.g:3474:1: ( '[' )
            // InternalQuCircuit.g:3475:2: '['
            {
             before(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__Measurement__Group__12__Impl"


    // $ANTLR start "rule__Measurement__Group__13"
    // InternalQuCircuit.g:3484:1: rule__Measurement__Group__13 : rule__Measurement__Group__13__Impl rule__Measurement__Group__14 ;
    public final void rule__Measurement__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3488:1: ( rule__Measurement__Group__13__Impl rule__Measurement__Group__14 )
            // InternalQuCircuit.g:3489:2: rule__Measurement__Group__13__Impl rule__Measurement__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__Measurement__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__14();

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
    // $ANTLR end "rule__Measurement__Group__13"


    // $ANTLR start "rule__Measurement__Group__13__Impl"
    // InternalQuCircuit.g:3496:1: rule__Measurement__Group__13__Impl : ( '(' ) ;
    public final void rule__Measurement__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3500:1: ( ( '(' ) )
            // InternalQuCircuit.g:3501:1: ( '(' )
            {
            // InternalQuCircuit.g:3501:1: ( '(' )
            // InternalQuCircuit.g:3502:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_13()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__Measurement__Group__13__Impl"


    // $ANTLR start "rule__Measurement__Group__14"
    // InternalQuCircuit.g:3511:1: rule__Measurement__Group__14 : rule__Measurement__Group__14__Impl rule__Measurement__Group__15 ;
    public final void rule__Measurement__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3515:1: ( rule__Measurement__Group__14__Impl rule__Measurement__Group__15 )
            // InternalQuCircuit.g:3516:2: rule__Measurement__Group__14__Impl rule__Measurement__Group__15
            {
            pushFollow(FOLLOW_27);
            rule__Measurement__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__15();

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
    // $ANTLR end "rule__Measurement__Group__14"


    // $ANTLR start "rule__Measurement__Group__14__Impl"
    // InternalQuCircuit.g:3523:1: rule__Measurement__Group__14__Impl : ( ( rule__Measurement__ClassicBitsAssignment_14 ) ) ;
    public final void rule__Measurement__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3527:1: ( ( ( rule__Measurement__ClassicBitsAssignment_14 ) ) )
            // InternalQuCircuit.g:3528:1: ( ( rule__Measurement__ClassicBitsAssignment_14 ) )
            {
            // InternalQuCircuit.g:3528:1: ( ( rule__Measurement__ClassicBitsAssignment_14 ) )
            // InternalQuCircuit.g:3529:2: ( rule__Measurement__ClassicBitsAssignment_14 )
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_14()); 
            // InternalQuCircuit.g:3530:2: ( rule__Measurement__ClassicBitsAssignment_14 )
            // InternalQuCircuit.g:3530:3: rule__Measurement__ClassicBitsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__ClassicBitsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_14()); 

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
    // $ANTLR end "rule__Measurement__Group__14__Impl"


    // $ANTLR start "rule__Measurement__Group__15"
    // InternalQuCircuit.g:3538:1: rule__Measurement__Group__15 : rule__Measurement__Group__15__Impl rule__Measurement__Group__16 ;
    public final void rule__Measurement__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3542:1: ( rule__Measurement__Group__15__Impl rule__Measurement__Group__16 )
            // InternalQuCircuit.g:3543:2: rule__Measurement__Group__15__Impl rule__Measurement__Group__16
            {
            pushFollow(FOLLOW_22);
            rule__Measurement__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__16();

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
    // $ANTLR end "rule__Measurement__Group__15"


    // $ANTLR start "rule__Measurement__Group__15__Impl"
    // InternalQuCircuit.g:3550:1: rule__Measurement__Group__15__Impl : ( ')' ) ;
    public final void rule__Measurement__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3554:1: ( ( ')' ) )
            // InternalQuCircuit.g:3555:1: ( ')' )
            {
            // InternalQuCircuit.g:3555:1: ( ')' )
            // InternalQuCircuit.g:3556:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_15()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_15()); 

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
    // $ANTLR end "rule__Measurement__Group__15__Impl"


    // $ANTLR start "rule__Measurement__Group__16"
    // InternalQuCircuit.g:3565:1: rule__Measurement__Group__16 : rule__Measurement__Group__16__Impl rule__Measurement__Group__17 ;
    public final void rule__Measurement__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3569:1: ( rule__Measurement__Group__16__Impl rule__Measurement__Group__17 )
            // InternalQuCircuit.g:3570:2: rule__Measurement__Group__16__Impl rule__Measurement__Group__17
            {
            pushFollow(FOLLOW_22);
            rule__Measurement__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__17();

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
    // $ANTLR end "rule__Measurement__Group__16"


    // $ANTLR start "rule__Measurement__Group__16__Impl"
    // InternalQuCircuit.g:3577:1: rule__Measurement__Group__16__Impl : ( ( rule__Measurement__Group_16__0 )* ) ;
    public final void rule__Measurement__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3581:1: ( ( ( rule__Measurement__Group_16__0 )* ) )
            // InternalQuCircuit.g:3582:1: ( ( rule__Measurement__Group_16__0 )* )
            {
            // InternalQuCircuit.g:3582:1: ( ( rule__Measurement__Group_16__0 )* )
            // InternalQuCircuit.g:3583:2: ( rule__Measurement__Group_16__0 )*
            {
             before(grammarAccess.getMeasurementAccess().getGroup_16()); 
            // InternalQuCircuit.g:3584:2: ( rule__Measurement__Group_16__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQuCircuit.g:3584:3: rule__Measurement__Group_16__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Measurement__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMeasurementAccess().getGroup_16()); 

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
    // $ANTLR end "rule__Measurement__Group__16__Impl"


    // $ANTLR start "rule__Measurement__Group__17"
    // InternalQuCircuit.g:3592:1: rule__Measurement__Group__17 : rule__Measurement__Group__17__Impl rule__Measurement__Group__18 ;
    public final void rule__Measurement__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3596:1: ( rule__Measurement__Group__17__Impl rule__Measurement__Group__18 )
            // InternalQuCircuit.g:3597:2: rule__Measurement__Group__17__Impl rule__Measurement__Group__18
            {
            pushFollow(FOLLOW_23);
            rule__Measurement__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__18();

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
    // $ANTLR end "rule__Measurement__Group__17"


    // $ANTLR start "rule__Measurement__Group__17__Impl"
    // InternalQuCircuit.g:3604:1: rule__Measurement__Group__17__Impl : ( ']' ) ;
    public final void rule__Measurement__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3608:1: ( ( ']' ) )
            // InternalQuCircuit.g:3609:1: ( ']' )
            {
            // InternalQuCircuit.g:3609:1: ( ']' )
            // InternalQuCircuit.g:3610:2: ']'
            {
             before(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_17()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_17()); 

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
    // $ANTLR end "rule__Measurement__Group__17__Impl"


    // $ANTLR start "rule__Measurement__Group__18"
    // InternalQuCircuit.g:3619:1: rule__Measurement__Group__18 : rule__Measurement__Group__18__Impl ;
    public final void rule__Measurement__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3623:1: ( rule__Measurement__Group__18__Impl )
            // InternalQuCircuit.g:3624:2: rule__Measurement__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group__18__Impl();

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
    // $ANTLR end "rule__Measurement__Group__18"


    // $ANTLR start "rule__Measurement__Group__18__Impl"
    // InternalQuCircuit.g:3630:1: rule__Measurement__Group__18__Impl : ( '}' ) ;
    public final void rule__Measurement__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3634:1: ( ( '}' ) )
            // InternalQuCircuit.g:3635:1: ( '}' )
            {
            // InternalQuCircuit.g:3635:1: ( '}' )
            // InternalQuCircuit.g:3636:2: '}'
            {
             before(grammarAccess.getMeasurementAccess().getRightCurlyBracketKeyword_18()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightCurlyBracketKeyword_18()); 

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
    // $ANTLR end "rule__Measurement__Group__18__Impl"


    // $ANTLR start "rule__Measurement__Group_3__0"
    // InternalQuCircuit.g:3646:1: rule__Measurement__Group_3__0 : rule__Measurement__Group_3__0__Impl rule__Measurement__Group_3__1 ;
    public final void rule__Measurement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3650:1: ( rule__Measurement__Group_3__0__Impl rule__Measurement__Group_3__1 )
            // InternalQuCircuit.g:3651:2: rule__Measurement__Group_3__0__Impl rule__Measurement__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Measurement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_3__1();

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
    // $ANTLR end "rule__Measurement__Group_3__0"


    // $ANTLR start "rule__Measurement__Group_3__0__Impl"
    // InternalQuCircuit.g:3658:1: rule__Measurement__Group_3__0__Impl : ( 'operation' ) ;
    public final void rule__Measurement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3662:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:3663:1: ( 'operation' )
            {
            // InternalQuCircuit.g:3663:1: ( 'operation' )
            // InternalQuCircuit.g:3664:2: 'operation'
            {
             before(grammarAccess.getMeasurementAccess().getOperationKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getOperationKeyword_3_0()); 

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
    // $ANTLR end "rule__Measurement__Group_3__0__Impl"


    // $ANTLR start "rule__Measurement__Group_3__1"
    // InternalQuCircuit.g:3673:1: rule__Measurement__Group_3__1 : rule__Measurement__Group_3__1__Impl ;
    public final void rule__Measurement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3677:1: ( rule__Measurement__Group_3__1__Impl )
            // InternalQuCircuit.g:3678:2: rule__Measurement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group_3__1__Impl();

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
    // $ANTLR end "rule__Measurement__Group_3__1"


    // $ANTLR start "rule__Measurement__Group_3__1__Impl"
    // InternalQuCircuit.g:3684:1: rule__Measurement__Group_3__1__Impl : ( ( rule__Measurement__OperationsAssignment_3_1 ) ) ;
    public final void rule__Measurement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3688:1: ( ( ( rule__Measurement__OperationsAssignment_3_1 ) ) )
            // InternalQuCircuit.g:3689:1: ( ( rule__Measurement__OperationsAssignment_3_1 ) )
            {
            // InternalQuCircuit.g:3689:1: ( ( rule__Measurement__OperationsAssignment_3_1 ) )
            // InternalQuCircuit.g:3690:2: ( rule__Measurement__OperationsAssignment_3_1 )
            {
             before(grammarAccess.getMeasurementAccess().getOperationsAssignment_3_1()); 
            // InternalQuCircuit.g:3691:2: ( rule__Measurement__OperationsAssignment_3_1 )
            // InternalQuCircuit.g:3691:3: rule__Measurement__OperationsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__OperationsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getOperationsAssignment_3_1()); 

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
    // $ANTLR end "rule__Measurement__Group_3__1__Impl"


    // $ANTLR start "rule__Measurement__Group_9__0"
    // InternalQuCircuit.g:3700:1: rule__Measurement__Group_9__0 : rule__Measurement__Group_9__0__Impl rule__Measurement__Group_9__1 ;
    public final void rule__Measurement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3704:1: ( rule__Measurement__Group_9__0__Impl rule__Measurement__Group_9__1 )
            // InternalQuCircuit.g:3705:2: rule__Measurement__Group_9__0__Impl rule__Measurement__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__Measurement__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__1();

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
    // $ANTLR end "rule__Measurement__Group_9__0"


    // $ANTLR start "rule__Measurement__Group_9__0__Impl"
    // InternalQuCircuit.g:3712:1: rule__Measurement__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Measurement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3716:1: ( ( ',' ) )
            // InternalQuCircuit.g:3717:1: ( ',' )
            {
            // InternalQuCircuit.g:3717:1: ( ',' )
            // InternalQuCircuit.g:3718:2: ','
            {
             before(grammarAccess.getMeasurementAccess().getCommaKeyword_9_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Measurement__Group_9__0__Impl"


    // $ANTLR start "rule__Measurement__Group_9__1"
    // InternalQuCircuit.g:3727:1: rule__Measurement__Group_9__1 : rule__Measurement__Group_9__1__Impl rule__Measurement__Group_9__2 ;
    public final void rule__Measurement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3731:1: ( rule__Measurement__Group_9__1__Impl rule__Measurement__Group_9__2 )
            // InternalQuCircuit.g:3732:2: rule__Measurement__Group_9__1__Impl rule__Measurement__Group_9__2
            {
            pushFollow(FOLLOW_21);
            rule__Measurement__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__2();

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
    // $ANTLR end "rule__Measurement__Group_9__1"


    // $ANTLR start "rule__Measurement__Group_9__1__Impl"
    // InternalQuCircuit.g:3739:1: rule__Measurement__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Measurement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3743:1: ( ( '(' ) )
            // InternalQuCircuit.g:3744:1: ( '(' )
            {
            // InternalQuCircuit.g:3744:1: ( '(' )
            // InternalQuCircuit.g:3745:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_9_1()); 

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
    // $ANTLR end "rule__Measurement__Group_9__1__Impl"


    // $ANTLR start "rule__Measurement__Group_9__2"
    // InternalQuCircuit.g:3754:1: rule__Measurement__Group_9__2 : rule__Measurement__Group_9__2__Impl rule__Measurement__Group_9__3 ;
    public final void rule__Measurement__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3758:1: ( rule__Measurement__Group_9__2__Impl rule__Measurement__Group_9__3 )
            // InternalQuCircuit.g:3759:2: rule__Measurement__Group_9__2__Impl rule__Measurement__Group_9__3
            {
            pushFollow(FOLLOW_27);
            rule__Measurement__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__3();

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
    // $ANTLR end "rule__Measurement__Group_9__2"


    // $ANTLR start "rule__Measurement__Group_9__2__Impl"
    // InternalQuCircuit.g:3766:1: rule__Measurement__Group_9__2__Impl : ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) ) ;
    public final void rule__Measurement__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3770:1: ( ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) ) )
            // InternalQuCircuit.g:3771:1: ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) )
            {
            // InternalQuCircuit.g:3771:1: ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) )
            // InternalQuCircuit.g:3772:2: ( rule__Measurement__TargetQubitsAssignment_9_2 )
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_9_2()); 
            // InternalQuCircuit.g:3773:2: ( rule__Measurement__TargetQubitsAssignment_9_2 )
            // InternalQuCircuit.g:3773:3: rule__Measurement__TargetQubitsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__TargetQubitsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_9_2()); 

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
    // $ANTLR end "rule__Measurement__Group_9__2__Impl"


    // $ANTLR start "rule__Measurement__Group_9__3"
    // InternalQuCircuit.g:3781:1: rule__Measurement__Group_9__3 : rule__Measurement__Group_9__3__Impl ;
    public final void rule__Measurement__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3785:1: ( rule__Measurement__Group_9__3__Impl )
            // InternalQuCircuit.g:3786:2: rule__Measurement__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__3__Impl();

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
    // $ANTLR end "rule__Measurement__Group_9__3"


    // $ANTLR start "rule__Measurement__Group_9__3__Impl"
    // InternalQuCircuit.g:3792:1: rule__Measurement__Group_9__3__Impl : ( ')' ) ;
    public final void rule__Measurement__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3796:1: ( ( ')' ) )
            // InternalQuCircuit.g:3797:1: ( ')' )
            {
            // InternalQuCircuit.g:3797:1: ( ')' )
            // InternalQuCircuit.g:3798:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_9_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_9_3()); 

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
    // $ANTLR end "rule__Measurement__Group_9__3__Impl"


    // $ANTLR start "rule__Measurement__Group_16__0"
    // InternalQuCircuit.g:3808:1: rule__Measurement__Group_16__0 : rule__Measurement__Group_16__0__Impl rule__Measurement__Group_16__1 ;
    public final void rule__Measurement__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3812:1: ( rule__Measurement__Group_16__0__Impl rule__Measurement__Group_16__1 )
            // InternalQuCircuit.g:3813:2: rule__Measurement__Group_16__0__Impl rule__Measurement__Group_16__1
            {
            pushFollow(FOLLOW_26);
            rule__Measurement__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__1();

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
    // $ANTLR end "rule__Measurement__Group_16__0"


    // $ANTLR start "rule__Measurement__Group_16__0__Impl"
    // InternalQuCircuit.g:3820:1: rule__Measurement__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Measurement__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3824:1: ( ( ',' ) )
            // InternalQuCircuit.g:3825:1: ( ',' )
            {
            // InternalQuCircuit.g:3825:1: ( ',' )
            // InternalQuCircuit.g:3826:2: ','
            {
             before(grammarAccess.getMeasurementAccess().getCommaKeyword_16_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getCommaKeyword_16_0()); 

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
    // $ANTLR end "rule__Measurement__Group_16__0__Impl"


    // $ANTLR start "rule__Measurement__Group_16__1"
    // InternalQuCircuit.g:3835:1: rule__Measurement__Group_16__1 : rule__Measurement__Group_16__1__Impl rule__Measurement__Group_16__2 ;
    public final void rule__Measurement__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3839:1: ( rule__Measurement__Group_16__1__Impl rule__Measurement__Group_16__2 )
            // InternalQuCircuit.g:3840:2: rule__Measurement__Group_16__1__Impl rule__Measurement__Group_16__2
            {
            pushFollow(FOLLOW_21);
            rule__Measurement__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__2();

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
    // $ANTLR end "rule__Measurement__Group_16__1"


    // $ANTLR start "rule__Measurement__Group_16__1__Impl"
    // InternalQuCircuit.g:3847:1: rule__Measurement__Group_16__1__Impl : ( '(' ) ;
    public final void rule__Measurement__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3851:1: ( ( '(' ) )
            // InternalQuCircuit.g:3852:1: ( '(' )
            {
            // InternalQuCircuit.g:3852:1: ( '(' )
            // InternalQuCircuit.g:3853:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_16_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_16_1()); 

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
    // $ANTLR end "rule__Measurement__Group_16__1__Impl"


    // $ANTLR start "rule__Measurement__Group_16__2"
    // InternalQuCircuit.g:3862:1: rule__Measurement__Group_16__2 : rule__Measurement__Group_16__2__Impl rule__Measurement__Group_16__3 ;
    public final void rule__Measurement__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3866:1: ( rule__Measurement__Group_16__2__Impl rule__Measurement__Group_16__3 )
            // InternalQuCircuit.g:3867:2: rule__Measurement__Group_16__2__Impl rule__Measurement__Group_16__3
            {
            pushFollow(FOLLOW_27);
            rule__Measurement__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__3();

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
    // $ANTLR end "rule__Measurement__Group_16__2"


    // $ANTLR start "rule__Measurement__Group_16__2__Impl"
    // InternalQuCircuit.g:3874:1: rule__Measurement__Group_16__2__Impl : ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) ) ;
    public final void rule__Measurement__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3878:1: ( ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) ) )
            // InternalQuCircuit.g:3879:1: ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) )
            {
            // InternalQuCircuit.g:3879:1: ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) )
            // InternalQuCircuit.g:3880:2: ( rule__Measurement__ClassicBitsAssignment_16_2 )
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_16_2()); 
            // InternalQuCircuit.g:3881:2: ( rule__Measurement__ClassicBitsAssignment_16_2 )
            // InternalQuCircuit.g:3881:3: rule__Measurement__ClassicBitsAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__ClassicBitsAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_16_2()); 

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
    // $ANTLR end "rule__Measurement__Group_16__2__Impl"


    // $ANTLR start "rule__Measurement__Group_16__3"
    // InternalQuCircuit.g:3889:1: rule__Measurement__Group_16__3 : rule__Measurement__Group_16__3__Impl ;
    public final void rule__Measurement__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3893:1: ( rule__Measurement__Group_16__3__Impl )
            // InternalQuCircuit.g:3894:2: rule__Measurement__Group_16__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__3__Impl();

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
    // $ANTLR end "rule__Measurement__Group_16__3"


    // $ANTLR start "rule__Measurement__Group_16__3__Impl"
    // InternalQuCircuit.g:3900:1: rule__Measurement__Group_16__3__Impl : ( ')' ) ;
    public final void rule__Measurement__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3904:1: ( ( ')' ) )
            // InternalQuCircuit.g:3905:1: ( ')' )
            {
            // InternalQuCircuit.g:3905:1: ( ')' )
            // InternalQuCircuit.g:3906:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_16_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_16_3()); 

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
    // $ANTLR end "rule__Measurement__Group_16__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__0"
    // InternalQuCircuit.g:3916:1: rule__CompositeQuantumGate__Group__0 : rule__CompositeQuantumGate__Group__0__Impl rule__CompositeQuantumGate__Group__1 ;
    public final void rule__CompositeQuantumGate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3920:1: ( rule__CompositeQuantumGate__Group__0__Impl rule__CompositeQuantumGate__Group__1 )
            // InternalQuCircuit.g:3921:2: rule__CompositeQuantumGate__Group__0__Impl rule__CompositeQuantumGate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeQuantumGate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group__0__Impl"
    // InternalQuCircuit.g:3928:1: rule__CompositeQuantumGate__Group__0__Impl : ( 'CompositeQuantumGate' ) ;
    public final void rule__CompositeQuantumGate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3932:1: ( ( 'CompositeQuantumGate' ) )
            // InternalQuCircuit.g:3933:1: ( 'CompositeQuantumGate' )
            {
            // InternalQuCircuit.g:3933:1: ( 'CompositeQuantumGate' )
            // InternalQuCircuit.g:3934:2: 'CompositeQuantumGate'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getCompositeQuantumGateKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getCompositeQuantumGateKeyword_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__1"
    // InternalQuCircuit.g:3943:1: rule__CompositeQuantumGate__Group__1 : rule__CompositeQuantumGate__Group__1__Impl rule__CompositeQuantumGate__Group__2 ;
    public final void rule__CompositeQuantumGate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3947:1: ( rule__CompositeQuantumGate__Group__1__Impl rule__CompositeQuantumGate__Group__2 )
            // InternalQuCircuit.g:3948:2: rule__CompositeQuantumGate__Group__1__Impl rule__CompositeQuantumGate__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CompositeQuantumGate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__2();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group__1__Impl"
    // InternalQuCircuit.g:3955:1: rule__CompositeQuantumGate__Group__1__Impl : ( ( rule__CompositeQuantumGate__NameAssignment_1 ) ) ;
    public final void rule__CompositeQuantumGate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3959:1: ( ( ( rule__CompositeQuantumGate__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:3960:1: ( ( rule__CompositeQuantumGate__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:3960:1: ( ( rule__CompositeQuantumGate__NameAssignment_1 ) )
            // InternalQuCircuit.g:3961:2: ( rule__CompositeQuantumGate__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:3962:2: ( rule__CompositeQuantumGate__NameAssignment_1 )
            // InternalQuCircuit.g:3962:3: rule__CompositeQuantumGate__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__2"
    // InternalQuCircuit.g:3970:1: rule__CompositeQuantumGate__Group__2 : rule__CompositeQuantumGate__Group__2__Impl rule__CompositeQuantumGate__Group__3 ;
    public final void rule__CompositeQuantumGate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3974:1: ( rule__CompositeQuantumGate__Group__2__Impl rule__CompositeQuantumGate__Group__3 )
            // InternalQuCircuit.g:3975:2: rule__CompositeQuantumGate__Group__2__Impl rule__CompositeQuantumGate__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__CompositeQuantumGate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__3();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__2"


    // $ANTLR start "rule__CompositeQuantumGate__Group__2__Impl"
    // InternalQuCircuit.g:3982:1: rule__CompositeQuantumGate__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeQuantumGate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3986:1: ( ( '{' ) )
            // InternalQuCircuit.g:3987:1: ( '{' )
            {
            // InternalQuCircuit.g:3987:1: ( '{' )
            // InternalQuCircuit.g:3988:2: '{'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__2__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__3"
    // InternalQuCircuit.g:3997:1: rule__CompositeQuantumGate__Group__3 : rule__CompositeQuantumGate__Group__3__Impl rule__CompositeQuantumGate__Group__4 ;
    public final void rule__CompositeQuantumGate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4001:1: ( rule__CompositeQuantumGate__Group__3__Impl rule__CompositeQuantumGate__Group__4 )
            // InternalQuCircuit.g:4002:2: rule__CompositeQuantumGate__Group__3__Impl rule__CompositeQuantumGate__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__CompositeQuantumGate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__4();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__3"


    // $ANTLR start "rule__CompositeQuantumGate__Group__3__Impl"
    // InternalQuCircuit.g:4009:1: rule__CompositeQuantumGate__Group__3__Impl : ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? ) ;
    public final void rule__CompositeQuantumGate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4013:1: ( ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? ) )
            // InternalQuCircuit.g:4014:1: ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? )
            {
            // InternalQuCircuit.g:4014:1: ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? )
            // InternalQuCircuit.g:4015:2: ( rule__CompositeQuantumGate__InverseFormAssignment_3 )?
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getInverseFormAssignment_3()); 
            // InternalQuCircuit.g:4016:2: ( rule__CompositeQuantumGate__InverseFormAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQuCircuit.g:4016:3: rule__CompositeQuantumGate__InverseFormAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeQuantumGate__InverseFormAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getInverseFormAssignment_3()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__4"
    // InternalQuCircuit.g:4024:1: rule__CompositeQuantumGate__Group__4 : rule__CompositeQuantumGate__Group__4__Impl rule__CompositeQuantumGate__Group__5 ;
    public final void rule__CompositeQuantumGate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4028:1: ( rule__CompositeQuantumGate__Group__4__Impl rule__CompositeQuantumGate__Group__5 )
            // InternalQuCircuit.g:4029:2: rule__CompositeQuantumGate__Group__4__Impl rule__CompositeQuantumGate__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__CompositeQuantumGate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__5();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__4"


    // $ANTLR start "rule__CompositeQuantumGate__Group__4__Impl"
    // InternalQuCircuit.g:4036:1: rule__CompositeQuantumGate__Group__4__Impl : ( ( rule__CompositeQuantumGate__Group_4__0 )? ) ;
    public final void rule__CompositeQuantumGate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4040:1: ( ( ( rule__CompositeQuantumGate__Group_4__0 )? ) )
            // InternalQuCircuit.g:4041:1: ( ( rule__CompositeQuantumGate__Group_4__0 )? )
            {
            // InternalQuCircuit.g:4041:1: ( ( rule__CompositeQuantumGate__Group_4__0 )? )
            // InternalQuCircuit.g:4042:2: ( rule__CompositeQuantumGate__Group_4__0 )?
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_4()); 
            // InternalQuCircuit.g:4043:2: ( rule__CompositeQuantumGate__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQuCircuit.g:4043:3: rule__CompositeQuantumGate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeQuantumGate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__4__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__5"
    // InternalQuCircuit.g:4051:1: rule__CompositeQuantumGate__Group__5 : rule__CompositeQuantumGate__Group__5__Impl rule__CompositeQuantumGate__Group__6 ;
    public final void rule__CompositeQuantumGate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4055:1: ( rule__CompositeQuantumGate__Group__5__Impl rule__CompositeQuantumGate__Group__6 )
            // InternalQuCircuit.g:4056:2: rule__CompositeQuantumGate__Group__5__Impl rule__CompositeQuantumGate__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__CompositeQuantumGate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__6();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__5"


    // $ANTLR start "rule__CompositeQuantumGate__Group__5__Impl"
    // InternalQuCircuit.g:4063:1: rule__CompositeQuantumGate__Group__5__Impl : ( 'targetQubits' ) ;
    public final void rule__CompositeQuantumGate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4067:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:4068:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:4068:1: ( 'targetQubits' )
            // InternalQuCircuit.g:4069:2: 'targetQubits'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsKeyword_5()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__5__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__6"
    // InternalQuCircuit.g:4078:1: rule__CompositeQuantumGate__Group__6 : rule__CompositeQuantumGate__Group__6__Impl rule__CompositeQuantumGate__Group__7 ;
    public final void rule__CompositeQuantumGate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4082:1: ( rule__CompositeQuantumGate__Group__6__Impl rule__CompositeQuantumGate__Group__7 )
            // InternalQuCircuit.g:4083:2: rule__CompositeQuantumGate__Group__6__Impl rule__CompositeQuantumGate__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__CompositeQuantumGate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__7();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__6"


    // $ANTLR start "rule__CompositeQuantumGate__Group__6__Impl"
    // InternalQuCircuit.g:4090:1: rule__CompositeQuantumGate__Group__6__Impl : ( '[' ) ;
    public final void rule__CompositeQuantumGate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4094:1: ( ( '[' ) )
            // InternalQuCircuit.g:4095:1: ( '[' )
            {
            // InternalQuCircuit.g:4095:1: ( '[' )
            // InternalQuCircuit.g:4096:2: '['
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__6__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__7"
    // InternalQuCircuit.g:4105:1: rule__CompositeQuantumGate__Group__7 : rule__CompositeQuantumGate__Group__7__Impl rule__CompositeQuantumGate__Group__8 ;
    public final void rule__CompositeQuantumGate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4109:1: ( rule__CompositeQuantumGate__Group__7__Impl rule__CompositeQuantumGate__Group__8 )
            // InternalQuCircuit.g:4110:2: rule__CompositeQuantumGate__Group__7__Impl rule__CompositeQuantumGate__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__CompositeQuantumGate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__8();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__7"


    // $ANTLR start "rule__CompositeQuantumGate__Group__7__Impl"
    // InternalQuCircuit.g:4117:1: rule__CompositeQuantumGate__Group__7__Impl : ( '(' ) ;
    public final void rule__CompositeQuantumGate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4121:1: ( ( '(' ) )
            // InternalQuCircuit.g:4122:1: ( '(' )
            {
            // InternalQuCircuit.g:4122:1: ( '(' )
            // InternalQuCircuit.g:4123:2: '('
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__7__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__8"
    // InternalQuCircuit.g:4132:1: rule__CompositeQuantumGate__Group__8 : rule__CompositeQuantumGate__Group__8__Impl rule__CompositeQuantumGate__Group__9 ;
    public final void rule__CompositeQuantumGate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4136:1: ( rule__CompositeQuantumGate__Group__8__Impl rule__CompositeQuantumGate__Group__9 )
            // InternalQuCircuit.g:4137:2: rule__CompositeQuantumGate__Group__8__Impl rule__CompositeQuantumGate__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__CompositeQuantumGate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__9();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__8"


    // $ANTLR start "rule__CompositeQuantumGate__Group__8__Impl"
    // InternalQuCircuit.g:4144:1: rule__CompositeQuantumGate__Group__8__Impl : ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) ) ;
    public final void rule__CompositeQuantumGate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4148:1: ( ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) ) )
            // InternalQuCircuit.g:4149:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) )
            {
            // InternalQuCircuit.g:4149:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) )
            // InternalQuCircuit.g:4150:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_8()); 
            // InternalQuCircuit.g:4151:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 )
            // InternalQuCircuit.g:4151:3: rule__CompositeQuantumGate__TargetQubitsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__TargetQubitsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_8()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__8__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__9"
    // InternalQuCircuit.g:4159:1: rule__CompositeQuantumGate__Group__9 : rule__CompositeQuantumGate__Group__9__Impl rule__CompositeQuantumGate__Group__10 ;
    public final void rule__CompositeQuantumGate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4163:1: ( rule__CompositeQuantumGate__Group__9__Impl rule__CompositeQuantumGate__Group__10 )
            // InternalQuCircuit.g:4164:2: rule__CompositeQuantumGate__Group__9__Impl rule__CompositeQuantumGate__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__CompositeQuantumGate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__10();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__9"


    // $ANTLR start "rule__CompositeQuantumGate__Group__9__Impl"
    // InternalQuCircuit.g:4171:1: rule__CompositeQuantumGate__Group__9__Impl : ( ')' ) ;
    public final void rule__CompositeQuantumGate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4175:1: ( ( ')' ) )
            // InternalQuCircuit.g:4176:1: ( ')' )
            {
            // InternalQuCircuit.g:4176:1: ( ')' )
            // InternalQuCircuit.g:4177:2: ')'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__9__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__10"
    // InternalQuCircuit.g:4186:1: rule__CompositeQuantumGate__Group__10 : rule__CompositeQuantumGate__Group__10__Impl rule__CompositeQuantumGate__Group__11 ;
    public final void rule__CompositeQuantumGate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4190:1: ( rule__CompositeQuantumGate__Group__10__Impl rule__CompositeQuantumGate__Group__11 )
            // InternalQuCircuit.g:4191:2: rule__CompositeQuantumGate__Group__10__Impl rule__CompositeQuantumGate__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__CompositeQuantumGate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__11();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__10"


    // $ANTLR start "rule__CompositeQuantumGate__Group__10__Impl"
    // InternalQuCircuit.g:4198:1: rule__CompositeQuantumGate__Group__10__Impl : ( ( rule__CompositeQuantumGate__Group_10__0 )* ) ;
    public final void rule__CompositeQuantumGate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4202:1: ( ( ( rule__CompositeQuantumGate__Group_10__0 )* ) )
            // InternalQuCircuit.g:4203:1: ( ( rule__CompositeQuantumGate__Group_10__0 )* )
            {
            // InternalQuCircuit.g:4203:1: ( ( rule__CompositeQuantumGate__Group_10__0 )* )
            // InternalQuCircuit.g:4204:2: ( rule__CompositeQuantumGate__Group_10__0 )*
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_10()); 
            // InternalQuCircuit.g:4205:2: ( rule__CompositeQuantumGate__Group_10__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQuCircuit.g:4205:3: rule__CompositeQuantumGate__Group_10__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CompositeQuantumGate__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_10()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__10__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__11"
    // InternalQuCircuit.g:4213:1: rule__CompositeQuantumGate__Group__11 : rule__CompositeQuantumGate__Group__11__Impl rule__CompositeQuantumGate__Group__12 ;
    public final void rule__CompositeQuantumGate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4217:1: ( rule__CompositeQuantumGate__Group__11__Impl rule__CompositeQuantumGate__Group__12 )
            // InternalQuCircuit.g:4218:2: rule__CompositeQuantumGate__Group__11__Impl rule__CompositeQuantumGate__Group__12
            {
            pushFollow(FOLLOW_35);
            rule__CompositeQuantumGate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__12();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__11"


    // $ANTLR start "rule__CompositeQuantumGate__Group__11__Impl"
    // InternalQuCircuit.g:4225:1: rule__CompositeQuantumGate__Group__11__Impl : ( ']' ) ;
    public final void rule__CompositeQuantumGate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4229:1: ( ( ']' ) )
            // InternalQuCircuit.g:4230:1: ( ']' )
            {
            // InternalQuCircuit.g:4230:1: ( ']' )
            // InternalQuCircuit.g:4231:2: ']'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_11()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__11__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__12"
    // InternalQuCircuit.g:4240:1: rule__CompositeQuantumGate__Group__12 : rule__CompositeQuantumGate__Group__12__Impl rule__CompositeQuantumGate__Group__13 ;
    public final void rule__CompositeQuantumGate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4244:1: ( rule__CompositeQuantumGate__Group__12__Impl rule__CompositeQuantumGate__Group__13 )
            // InternalQuCircuit.g:4245:2: rule__CompositeQuantumGate__Group__12__Impl rule__CompositeQuantumGate__Group__13
            {
            pushFollow(FOLLOW_35);
            rule__CompositeQuantumGate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__13();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__12"


    // $ANTLR start "rule__CompositeQuantumGate__Group__12__Impl"
    // InternalQuCircuit.g:4252:1: rule__CompositeQuantumGate__Group__12__Impl : ( ( rule__CompositeQuantumGate__Group_12__0 )? ) ;
    public final void rule__CompositeQuantumGate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4256:1: ( ( ( rule__CompositeQuantumGate__Group_12__0 )? ) )
            // InternalQuCircuit.g:4257:1: ( ( rule__CompositeQuantumGate__Group_12__0 )? )
            {
            // InternalQuCircuit.g:4257:1: ( ( rule__CompositeQuantumGate__Group_12__0 )? )
            // InternalQuCircuit.g:4258:2: ( rule__CompositeQuantumGate__Group_12__0 )?
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_12()); 
            // InternalQuCircuit.g:4259:2: ( rule__CompositeQuantumGate__Group_12__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQuCircuit.g:4259:3: rule__CompositeQuantumGate__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeQuantumGate__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_12()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__12__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__13"
    // InternalQuCircuit.g:4267:1: rule__CompositeQuantumGate__Group__13 : rule__CompositeQuantumGate__Group__13__Impl ;
    public final void rule__CompositeQuantumGate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4271:1: ( rule__CompositeQuantumGate__Group__13__Impl )
            // InternalQuCircuit.g:4272:2: rule__CompositeQuantumGate__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__13__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__13"


    // $ANTLR start "rule__CompositeQuantumGate__Group__13__Impl"
    // InternalQuCircuit.g:4278:1: rule__CompositeQuantumGate__Group__13__Impl : ( '}' ) ;
    public final void rule__CompositeQuantumGate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4282:1: ( ( '}' ) )
            // InternalQuCircuit.g:4283:1: ( '}' )
            {
            // InternalQuCircuit.g:4283:1: ( '}' )
            // InternalQuCircuit.g:4284:2: '}'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__13__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__0"
    // InternalQuCircuit.g:4294:1: rule__CompositeQuantumGate__Group_4__0 : rule__CompositeQuantumGate__Group_4__0__Impl rule__CompositeQuantumGate__Group_4__1 ;
    public final void rule__CompositeQuantumGate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4298:1: ( rule__CompositeQuantumGate__Group_4__0__Impl rule__CompositeQuantumGate__Group_4__1 )
            // InternalQuCircuit.g:4299:2: rule__CompositeQuantumGate__Group_4__0__Impl rule__CompositeQuantumGate__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeQuantumGate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_4__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__0__Impl"
    // InternalQuCircuit.g:4306:1: rule__CompositeQuantumGate__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__CompositeQuantumGate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4310:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:4311:1: ( 'operation' )
            {
            // InternalQuCircuit.g:4311:1: ( 'operation' )
            // InternalQuCircuit.g:4312:2: 'operation'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getOperationKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getOperationKeyword_4_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__1"
    // InternalQuCircuit.g:4321:1: rule__CompositeQuantumGate__Group_4__1 : rule__CompositeQuantumGate__Group_4__1__Impl ;
    public final void rule__CompositeQuantumGate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4325:1: ( rule__CompositeQuantumGate__Group_4__1__Impl )
            // InternalQuCircuit.g:4326:2: rule__CompositeQuantumGate__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_4__1__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__1__Impl"
    // InternalQuCircuit.g:4332:1: rule__CompositeQuantumGate__Group_4__1__Impl : ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) ) ;
    public final void rule__CompositeQuantumGate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4336:1: ( ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:4337:1: ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:4337:1: ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) )
            // InternalQuCircuit.g:4338:2: ( rule__CompositeQuantumGate__OperationsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getOperationsAssignment_4_1()); 
            // InternalQuCircuit.g:4339:2: ( rule__CompositeQuantumGate__OperationsAssignment_4_1 )
            // InternalQuCircuit.g:4339:3: rule__CompositeQuantumGate__OperationsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__OperationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getOperationsAssignment_4_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__0"
    // InternalQuCircuit.g:4348:1: rule__CompositeQuantumGate__Group_10__0 : rule__CompositeQuantumGate__Group_10__0__Impl rule__CompositeQuantumGate__Group_10__1 ;
    public final void rule__CompositeQuantumGate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4352:1: ( rule__CompositeQuantumGate__Group_10__0__Impl rule__CompositeQuantumGate__Group_10__1 )
            // InternalQuCircuit.g:4353:2: rule__CompositeQuantumGate__Group_10__0__Impl rule__CompositeQuantumGate__Group_10__1
            {
            pushFollow(FOLLOW_26);
            rule__CompositeQuantumGate__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__0__Impl"
    // InternalQuCircuit.g:4360:1: rule__CompositeQuantumGate__Group_10__0__Impl : ( ',' ) ;
    public final void rule__CompositeQuantumGate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4364:1: ( ( ',' ) )
            // InternalQuCircuit.g:4365:1: ( ',' )
            {
            // InternalQuCircuit.g:4365:1: ( ',' )
            // InternalQuCircuit.g:4366:2: ','
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_10_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__1"
    // InternalQuCircuit.g:4375:1: rule__CompositeQuantumGate__Group_10__1 : rule__CompositeQuantumGate__Group_10__1__Impl rule__CompositeQuantumGate__Group_10__2 ;
    public final void rule__CompositeQuantumGate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4379:1: ( rule__CompositeQuantumGate__Group_10__1__Impl rule__CompositeQuantumGate__Group_10__2 )
            // InternalQuCircuit.g:4380:2: rule__CompositeQuantumGate__Group_10__1__Impl rule__CompositeQuantumGate__Group_10__2
            {
            pushFollow(FOLLOW_21);
            rule__CompositeQuantumGate__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__2();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__1__Impl"
    // InternalQuCircuit.g:4387:1: rule__CompositeQuantumGate__Group_10__1__Impl : ( '(' ) ;
    public final void rule__CompositeQuantumGate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4391:1: ( ( '(' ) )
            // InternalQuCircuit.g:4392:1: ( '(' )
            {
            // InternalQuCircuit.g:4392:1: ( '(' )
            // InternalQuCircuit.g:4393:2: '('
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__2"
    // InternalQuCircuit.g:4402:1: rule__CompositeQuantumGate__Group_10__2 : rule__CompositeQuantumGate__Group_10__2__Impl rule__CompositeQuantumGate__Group_10__3 ;
    public final void rule__CompositeQuantumGate__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4406:1: ( rule__CompositeQuantumGate__Group_10__2__Impl rule__CompositeQuantumGate__Group_10__3 )
            // InternalQuCircuit.g:4407:2: rule__CompositeQuantumGate__Group_10__2__Impl rule__CompositeQuantumGate__Group_10__3
            {
            pushFollow(FOLLOW_27);
            rule__CompositeQuantumGate__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__3();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__2"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__2__Impl"
    // InternalQuCircuit.g:4414:1: rule__CompositeQuantumGate__Group_10__2__Impl : ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) ) ;
    public final void rule__CompositeQuantumGate__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4418:1: ( ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) ) )
            // InternalQuCircuit.g:4419:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) )
            {
            // InternalQuCircuit.g:4419:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) )
            // InternalQuCircuit.g:4420:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_10_2()); 
            // InternalQuCircuit.g:4421:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 )
            // InternalQuCircuit.g:4421:3: rule__CompositeQuantumGate__TargetQubitsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__TargetQubitsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_10_2()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__2__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__3"
    // InternalQuCircuit.g:4429:1: rule__CompositeQuantumGate__Group_10__3 : rule__CompositeQuantumGate__Group_10__3__Impl ;
    public final void rule__CompositeQuantumGate__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4433:1: ( rule__CompositeQuantumGate__Group_10__3__Impl )
            // InternalQuCircuit.g:4434:2: rule__CompositeQuantumGate__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__3__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__3"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__3__Impl"
    // InternalQuCircuit.g:4440:1: rule__CompositeQuantumGate__Group_10__3__Impl : ( ')' ) ;
    public final void rule__CompositeQuantumGate__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4444:1: ( ( ')' ) )
            // InternalQuCircuit.g:4445:1: ( ')' )
            {
            // InternalQuCircuit.g:4445:1: ( ')' )
            // InternalQuCircuit.g:4446:2: ')'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_10_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_10_3()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__0"
    // InternalQuCircuit.g:4456:1: rule__CompositeQuantumGate__Group_12__0 : rule__CompositeQuantumGate__Group_12__0__Impl rule__CompositeQuantumGate__Group_12__1 ;
    public final void rule__CompositeQuantumGate__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4460:1: ( rule__CompositeQuantumGate__Group_12__0__Impl rule__CompositeQuantumGate__Group_12__1 )
            // InternalQuCircuit.g:4461:2: rule__CompositeQuantumGate__Group_12__0__Impl rule__CompositeQuantumGate__Group_12__1
            {
            pushFollow(FOLLOW_20);
            rule__CompositeQuantumGate__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__0__Impl"
    // InternalQuCircuit.g:4468:1: rule__CompositeQuantumGate__Group_12__0__Impl : ( 'controlQubits' ) ;
    public final void rule__CompositeQuantumGate__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4472:1: ( ( 'controlQubits' ) )
            // InternalQuCircuit.g:4473:1: ( 'controlQubits' )
            {
            // InternalQuCircuit.g:4473:1: ( 'controlQubits' )
            // InternalQuCircuit.g:4474:2: 'controlQubits'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsKeyword_12_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsKeyword_12_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__1"
    // InternalQuCircuit.g:4483:1: rule__CompositeQuantumGate__Group_12__1 : rule__CompositeQuantumGate__Group_12__1__Impl rule__CompositeQuantumGate__Group_12__2 ;
    public final void rule__CompositeQuantumGate__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4487:1: ( rule__CompositeQuantumGate__Group_12__1__Impl rule__CompositeQuantumGate__Group_12__2 )
            // InternalQuCircuit.g:4488:2: rule__CompositeQuantumGate__Group_12__1__Impl rule__CompositeQuantumGate__Group_12__2
            {
            pushFollow(FOLLOW_21);
            rule__CompositeQuantumGate__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__2();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__1__Impl"
    // InternalQuCircuit.g:4495:1: rule__CompositeQuantumGate__Group_12__1__Impl : ( '[' ) ;
    public final void rule__CompositeQuantumGate__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4499:1: ( ( '[' ) )
            // InternalQuCircuit.g:4500:1: ( '[' )
            {
            // InternalQuCircuit.g:4500:1: ( '[' )
            // InternalQuCircuit.g:4501:2: '['
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__2"
    // InternalQuCircuit.g:4510:1: rule__CompositeQuantumGate__Group_12__2 : rule__CompositeQuantumGate__Group_12__2__Impl rule__CompositeQuantumGate__Group_12__3 ;
    public final void rule__CompositeQuantumGate__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4514:1: ( rule__CompositeQuantumGate__Group_12__2__Impl rule__CompositeQuantumGate__Group_12__3 )
            // InternalQuCircuit.g:4515:2: rule__CompositeQuantumGate__Group_12__2__Impl rule__CompositeQuantumGate__Group_12__3
            {
            pushFollow(FOLLOW_22);
            rule__CompositeQuantumGate__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__3();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__2"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__2__Impl"
    // InternalQuCircuit.g:4522:1: rule__CompositeQuantumGate__Group_12__2__Impl : ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) ) ;
    public final void rule__CompositeQuantumGate__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4526:1: ( ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) ) )
            // InternalQuCircuit.g:4527:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) )
            {
            // InternalQuCircuit.g:4527:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) )
            // InternalQuCircuit.g:4528:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_2()); 
            // InternalQuCircuit.g:4529:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 )
            // InternalQuCircuit.g:4529:3: rule__CompositeQuantumGate__ControlQubitsAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__ControlQubitsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_2()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__2__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__3"
    // InternalQuCircuit.g:4537:1: rule__CompositeQuantumGate__Group_12__3 : rule__CompositeQuantumGate__Group_12__3__Impl rule__CompositeQuantumGate__Group_12__4 ;
    public final void rule__CompositeQuantumGate__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4541:1: ( rule__CompositeQuantumGate__Group_12__3__Impl rule__CompositeQuantumGate__Group_12__4 )
            // InternalQuCircuit.g:4542:2: rule__CompositeQuantumGate__Group_12__3__Impl rule__CompositeQuantumGate__Group_12__4
            {
            pushFollow(FOLLOW_22);
            rule__CompositeQuantumGate__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__4();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__3"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__3__Impl"
    // InternalQuCircuit.g:4549:1: rule__CompositeQuantumGate__Group_12__3__Impl : ( ( rule__CompositeQuantumGate__Group_12_3__0 )* ) ;
    public final void rule__CompositeQuantumGate__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4553:1: ( ( ( rule__CompositeQuantumGate__Group_12_3__0 )* ) )
            // InternalQuCircuit.g:4554:1: ( ( rule__CompositeQuantumGate__Group_12_3__0 )* )
            {
            // InternalQuCircuit.g:4554:1: ( ( rule__CompositeQuantumGate__Group_12_3__0 )* )
            // InternalQuCircuit.g:4555:2: ( rule__CompositeQuantumGate__Group_12_3__0 )*
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_12_3()); 
            // InternalQuCircuit.g:4556:2: ( rule__CompositeQuantumGate__Group_12_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQuCircuit.g:4556:3: rule__CompositeQuantumGate__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CompositeQuantumGate__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__4"
    // InternalQuCircuit.g:4564:1: rule__CompositeQuantumGate__Group_12__4 : rule__CompositeQuantumGate__Group_12__4__Impl ;
    public final void rule__CompositeQuantumGate__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4568:1: ( rule__CompositeQuantumGate__Group_12__4__Impl )
            // InternalQuCircuit.g:4569:2: rule__CompositeQuantumGate__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__4__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__4"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__4__Impl"
    // InternalQuCircuit.g:4575:1: rule__CompositeQuantumGate__Group_12__4__Impl : ( ']' ) ;
    public final void rule__CompositeQuantumGate__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4579:1: ( ( ']' ) )
            // InternalQuCircuit.g:4580:1: ( ']' )
            {
            // InternalQuCircuit.g:4580:1: ( ']' )
            // InternalQuCircuit.g:4581:2: ']'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__4__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__0"
    // InternalQuCircuit.g:4591:1: rule__CompositeQuantumGate__Group_12_3__0 : rule__CompositeQuantumGate__Group_12_3__0__Impl rule__CompositeQuantumGate__Group_12_3__1 ;
    public final void rule__CompositeQuantumGate__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4595:1: ( rule__CompositeQuantumGate__Group_12_3__0__Impl rule__CompositeQuantumGate__Group_12_3__1 )
            // InternalQuCircuit.g:4596:2: rule__CompositeQuantumGate__Group_12_3__0__Impl rule__CompositeQuantumGate__Group_12_3__1
            {
            pushFollow(FOLLOW_21);
            rule__CompositeQuantumGate__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12_3__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__0__Impl"
    // InternalQuCircuit.g:4603:1: rule__CompositeQuantumGate__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeQuantumGate__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4607:1: ( ( ',' ) )
            // InternalQuCircuit.g:4608:1: ( ',' )
            {
            // InternalQuCircuit.g:4608:1: ( ',' )
            // InternalQuCircuit.g:4609:2: ','
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_12_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__1"
    // InternalQuCircuit.g:4618:1: rule__CompositeQuantumGate__Group_12_3__1 : rule__CompositeQuantumGate__Group_12_3__1__Impl ;
    public final void rule__CompositeQuantumGate__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4622:1: ( rule__CompositeQuantumGate__Group_12_3__1__Impl )
            // InternalQuCircuit.g:4623:2: rule__CompositeQuantumGate__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__1__Impl"
    // InternalQuCircuit.g:4629:1: rule__CompositeQuantumGate__Group_12_3__1__Impl : ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) ) ;
    public final void rule__CompositeQuantumGate__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4633:1: ( ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) ) )
            // InternalQuCircuit.g:4634:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            {
            // InternalQuCircuit.g:4634:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            // InternalQuCircuit.g:4635:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 
            // InternalQuCircuit.g:4636:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 )
            // InternalQuCircuit.g:4636:3: rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__1__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalQuCircuit.g:4645:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4649:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalQuCircuit.g:4650:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

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
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalQuCircuit.g:4657:1: rule__Loop__Group__0__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4661:1: ( ( 'Loop' ) )
            // InternalQuCircuit.g:4662:1: ( 'Loop' )
            {
            // InternalQuCircuit.g:4662:1: ( 'Loop' )
            // InternalQuCircuit.g:4663:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_0()); 

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
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalQuCircuit.g:4672:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4676:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalQuCircuit.g:4677:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

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
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalQuCircuit.g:4684:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__NameAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4688:1: ( ( ( rule__Loop__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:4689:1: ( ( rule__Loop__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:4689:1: ( ( rule__Loop__NameAssignment_1 ) )
            // InternalQuCircuit.g:4690:2: ( rule__Loop__NameAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:4691:2: ( rule__Loop__NameAssignment_1 )
            // InternalQuCircuit.g:4691:3: rule__Loop__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalQuCircuit.g:4699:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4703:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalQuCircuit.g:4704:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

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
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalQuCircuit.g:4711:1: rule__Loop__Group__2__Impl : ( '{' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4715:1: ( ( '{' ) )
            // InternalQuCircuit.g:4716:1: ( '{' )
            {
            // InternalQuCircuit.g:4716:1: ( '{' )
            // InternalQuCircuit.g:4717:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalQuCircuit.g:4726:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4730:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalQuCircuit.g:4731:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

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
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalQuCircuit.g:4738:1: rule__Loop__Group__3__Impl : ( ( rule__Loop__InverseFormAssignment_3 )? ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4742:1: ( ( ( rule__Loop__InverseFormAssignment_3 )? ) )
            // InternalQuCircuit.g:4743:1: ( ( rule__Loop__InverseFormAssignment_3 )? )
            {
            // InternalQuCircuit.g:4743:1: ( ( rule__Loop__InverseFormAssignment_3 )? )
            // InternalQuCircuit.g:4744:2: ( rule__Loop__InverseFormAssignment_3 )?
            {
             before(grammarAccess.getLoopAccess().getInverseFormAssignment_3()); 
            // InternalQuCircuit.g:4745:2: ( rule__Loop__InverseFormAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQuCircuit.g:4745:3: rule__Loop__InverseFormAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__InverseFormAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getInverseFormAssignment_3()); 

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
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalQuCircuit.g:4753:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4757:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalQuCircuit.g:4758:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

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
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalQuCircuit.g:4765:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4769:1: ( ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? ) )
            // InternalQuCircuit.g:4770:1: ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? )
            {
            // InternalQuCircuit.g:4770:1: ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? )
            // InternalQuCircuit.g:4771:2: ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsAssignment_4()); 
            // InternalQuCircuit.g:4772:2: ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQuCircuit.g:4772:3: rule__Loop__IncrementBlockTargetQubitsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementBlockTargetQubitsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsAssignment_4()); 

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
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__5"
    // InternalQuCircuit.g:4780:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4784:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalQuCircuit.g:4785:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

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
    // $ANTLR end "rule__Loop__Group__5"


    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalQuCircuit.g:4792:1: rule__Loop__Group__5__Impl : ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4796:1: ( ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? ) )
            // InternalQuCircuit.g:4797:1: ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? )
            {
            // InternalQuCircuit.g:4797:1: ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? )
            // InternalQuCircuit.g:4798:2: ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsAssignment_5()); 
            // InternalQuCircuit.g:4799:2: ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==59) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQuCircuit.g:4799:3: rule__Loop__IncrementBlockControlQubitsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementBlockControlQubitsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsAssignment_5()); 

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
    // $ANTLR end "rule__Loop__Group__5__Impl"


    // $ANTLR start "rule__Loop__Group__6"
    // InternalQuCircuit.g:4807:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl rule__Loop__Group__7 ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4811:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalQuCircuit.g:4812:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__7();

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
    // $ANTLR end "rule__Loop__Group__6"


    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalQuCircuit.g:4819:1: rule__Loop__Group__6__Impl : ( ( rule__Loop__Group_6__0 )? ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4823:1: ( ( ( rule__Loop__Group_6__0 )? ) )
            // InternalQuCircuit.g:4824:1: ( ( rule__Loop__Group_6__0 )? )
            {
            // InternalQuCircuit.g:4824:1: ( ( rule__Loop__Group_6__0 )? )
            // InternalQuCircuit.g:4825:2: ( rule__Loop__Group_6__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_6()); 
            // InternalQuCircuit.g:4826:2: ( rule__Loop__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQuCircuit.g:4826:3: rule__Loop__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Loop__Group__6__Impl"


    // $ANTLR start "rule__Loop__Group__7"
    // InternalQuCircuit.g:4834:1: rule__Loop__Group__7 : rule__Loop__Group__7__Impl rule__Loop__Group__8 ;
    public final void rule__Loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4838:1: ( rule__Loop__Group__7__Impl rule__Loop__Group__8 )
            // InternalQuCircuit.g:4839:2: rule__Loop__Group__7__Impl rule__Loop__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__8();

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
    // $ANTLR end "rule__Loop__Group__7"


    // $ANTLR start "rule__Loop__Group__7__Impl"
    // InternalQuCircuit.g:4846:1: rule__Loop__Group__7__Impl : ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? ) ;
    public final void rule__Loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4850:1: ( ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? ) )
            // InternalQuCircuit.g:4851:1: ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? )
            {
            // InternalQuCircuit.g:4851:1: ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? )
            // InternalQuCircuit.g:4852:2: ( rule__Loop__IncrementTargetQubitsAssignment_7 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementTargetQubitsAssignment_7()); 
            // InternalQuCircuit.g:4853:2: ( rule__Loop__IncrementTargetQubitsAssignment_7 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==60) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQuCircuit.g:4853:3: rule__Loop__IncrementTargetQubitsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementTargetQubitsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementTargetQubitsAssignment_7()); 

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
    // $ANTLR end "rule__Loop__Group__7__Impl"


    // $ANTLR start "rule__Loop__Group__8"
    // InternalQuCircuit.g:4861:1: rule__Loop__Group__8 : rule__Loop__Group__8__Impl rule__Loop__Group__9 ;
    public final void rule__Loop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4865:1: ( rule__Loop__Group__8__Impl rule__Loop__Group__9 )
            // InternalQuCircuit.g:4866:2: rule__Loop__Group__8__Impl rule__Loop__Group__9
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__9();

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
    // $ANTLR end "rule__Loop__Group__8"


    // $ANTLR start "rule__Loop__Group__8__Impl"
    // InternalQuCircuit.g:4873:1: rule__Loop__Group__8__Impl : ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? ) ;
    public final void rule__Loop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4877:1: ( ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? ) )
            // InternalQuCircuit.g:4878:1: ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? )
            {
            // InternalQuCircuit.g:4878:1: ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? )
            // InternalQuCircuit.g:4879:2: ( rule__Loop__IncrementControlQubitsAssignment_8 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementControlQubitsAssignment_8()); 
            // InternalQuCircuit.g:4880:2: ( rule__Loop__IncrementControlQubitsAssignment_8 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==61) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQuCircuit.g:4880:3: rule__Loop__IncrementControlQubitsAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementControlQubitsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementControlQubitsAssignment_8()); 

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
    // $ANTLR end "rule__Loop__Group__8__Impl"


    // $ANTLR start "rule__Loop__Group__9"
    // InternalQuCircuit.g:4888:1: rule__Loop__Group__9 : rule__Loop__Group__9__Impl rule__Loop__Group__10 ;
    public final void rule__Loop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4892:1: ( rule__Loop__Group__9__Impl rule__Loop__Group__10 )
            // InternalQuCircuit.g:4893:2: rule__Loop__Group__9__Impl rule__Loop__Group__10
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__10();

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
    // $ANTLR end "rule__Loop__Group__9"


    // $ANTLR start "rule__Loop__Group__9__Impl"
    // InternalQuCircuit.g:4900:1: rule__Loop__Group__9__Impl : ( ( rule__Loop__Group_9__0 )? ) ;
    public final void rule__Loop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4904:1: ( ( ( rule__Loop__Group_9__0 )? ) )
            // InternalQuCircuit.g:4905:1: ( ( rule__Loop__Group_9__0 )? )
            {
            // InternalQuCircuit.g:4905:1: ( ( rule__Loop__Group_9__0 )? )
            // InternalQuCircuit.g:4906:2: ( rule__Loop__Group_9__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_9()); 
            // InternalQuCircuit.g:4907:2: ( rule__Loop__Group_9__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQuCircuit.g:4907:3: rule__Loop__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Loop__Group__9__Impl"


    // $ANTLR start "rule__Loop__Group__10"
    // InternalQuCircuit.g:4915:1: rule__Loop__Group__10 : rule__Loop__Group__10__Impl rule__Loop__Group__11 ;
    public final void rule__Loop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4919:1: ( rule__Loop__Group__10__Impl rule__Loop__Group__11 )
            // InternalQuCircuit.g:4920:2: rule__Loop__Group__10__Impl rule__Loop__Group__11
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__11();

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
    // $ANTLR end "rule__Loop__Group__10"


    // $ANTLR start "rule__Loop__Group__10__Impl"
    // InternalQuCircuit.g:4927:1: rule__Loop__Group__10__Impl : ( ( rule__Loop__Group_10__0 )? ) ;
    public final void rule__Loop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4931:1: ( ( ( rule__Loop__Group_10__0 )? ) )
            // InternalQuCircuit.g:4932:1: ( ( rule__Loop__Group_10__0 )? )
            {
            // InternalQuCircuit.g:4932:1: ( ( rule__Loop__Group_10__0 )? )
            // InternalQuCircuit.g:4933:2: ( rule__Loop__Group_10__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_10()); 
            // InternalQuCircuit.g:4934:2: ( rule__Loop__Group_10__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQuCircuit.g:4934:3: rule__Loop__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Loop__Group__10__Impl"


    // $ANTLR start "rule__Loop__Group__11"
    // InternalQuCircuit.g:4942:1: rule__Loop__Group__11 : rule__Loop__Group__11__Impl rule__Loop__Group__12 ;
    public final void rule__Loop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4946:1: ( rule__Loop__Group__11__Impl rule__Loop__Group__12 )
            // InternalQuCircuit.g:4947:2: rule__Loop__Group__11__Impl rule__Loop__Group__12
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__12();

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
    // $ANTLR end "rule__Loop__Group__11"


    // $ANTLR start "rule__Loop__Group__11__Impl"
    // InternalQuCircuit.g:4954:1: rule__Loop__Group__11__Impl : ( ( rule__Loop__Group_11__0 )? ) ;
    public final void rule__Loop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4958:1: ( ( ( rule__Loop__Group_11__0 )? ) )
            // InternalQuCircuit.g:4959:1: ( ( rule__Loop__Group_11__0 )? )
            {
            // InternalQuCircuit.g:4959:1: ( ( rule__Loop__Group_11__0 )? )
            // InternalQuCircuit.g:4960:2: ( rule__Loop__Group_11__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_11()); 
            // InternalQuCircuit.g:4961:2: ( rule__Loop__Group_11__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQuCircuit.g:4961:3: rule__Loop__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Loop__Group__11__Impl"


    // $ANTLR start "rule__Loop__Group__12"
    // InternalQuCircuit.g:4969:1: rule__Loop__Group__12 : rule__Loop__Group__12__Impl rule__Loop__Group__13 ;
    public final void rule__Loop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4973:1: ( rule__Loop__Group__12__Impl rule__Loop__Group__13 )
            // InternalQuCircuit.g:4974:2: rule__Loop__Group__12__Impl rule__Loop__Group__13
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__13();

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
    // $ANTLR end "rule__Loop__Group__12"


    // $ANTLR start "rule__Loop__Group__12__Impl"
    // InternalQuCircuit.g:4981:1: rule__Loop__Group__12__Impl : ( ( rule__Loop__Group_12__0 )? ) ;
    public final void rule__Loop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4985:1: ( ( ( rule__Loop__Group_12__0 )? ) )
            // InternalQuCircuit.g:4986:1: ( ( rule__Loop__Group_12__0 )? )
            {
            // InternalQuCircuit.g:4986:1: ( ( rule__Loop__Group_12__0 )? )
            // InternalQuCircuit.g:4987:2: ( rule__Loop__Group_12__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_12()); 
            // InternalQuCircuit.g:4988:2: ( rule__Loop__Group_12__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQuCircuit.g:4988:3: rule__Loop__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Loop__Group__12__Impl"


    // $ANTLR start "rule__Loop__Group__13"
    // InternalQuCircuit.g:4996:1: rule__Loop__Group__13 : rule__Loop__Group__13__Impl rule__Loop__Group__14 ;
    public final void rule__Loop__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5000:1: ( rule__Loop__Group__13__Impl rule__Loop__Group__14 )
            // InternalQuCircuit.g:5001:2: rule__Loop__Group__13__Impl rule__Loop__Group__14
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__14();

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
    // $ANTLR end "rule__Loop__Group__13"


    // $ANTLR start "rule__Loop__Group__13__Impl"
    // InternalQuCircuit.g:5008:1: rule__Loop__Group__13__Impl : ( ( rule__Loop__Group_13__0 )? ) ;
    public final void rule__Loop__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5012:1: ( ( ( rule__Loop__Group_13__0 )? ) )
            // InternalQuCircuit.g:5013:1: ( ( rule__Loop__Group_13__0 )? )
            {
            // InternalQuCircuit.g:5013:1: ( ( rule__Loop__Group_13__0 )? )
            // InternalQuCircuit.g:5014:2: ( rule__Loop__Group_13__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_13()); 
            // InternalQuCircuit.g:5015:2: ( rule__Loop__Group_13__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQuCircuit.g:5015:3: rule__Loop__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Loop__Group__13__Impl"


    // $ANTLR start "rule__Loop__Group__14"
    // InternalQuCircuit.g:5023:1: rule__Loop__Group__14 : rule__Loop__Group__14__Impl rule__Loop__Group__15 ;
    public final void rule__Loop__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5027:1: ( rule__Loop__Group__14__Impl rule__Loop__Group__15 )
            // InternalQuCircuit.g:5028:2: rule__Loop__Group__14__Impl rule__Loop__Group__15
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__15();

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
    // $ANTLR end "rule__Loop__Group__14"


    // $ANTLR start "rule__Loop__Group__14__Impl"
    // InternalQuCircuit.g:5035:1: rule__Loop__Group__14__Impl : ( ( rule__Loop__Group_14__0 )? ) ;
    public final void rule__Loop__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5039:1: ( ( ( rule__Loop__Group_14__0 )? ) )
            // InternalQuCircuit.g:5040:1: ( ( rule__Loop__Group_14__0 )? )
            {
            // InternalQuCircuit.g:5040:1: ( ( rule__Loop__Group_14__0 )? )
            // InternalQuCircuit.g:5041:2: ( rule__Loop__Group_14__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_14()); 
            // InternalQuCircuit.g:5042:2: ( rule__Loop__Group_14__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQuCircuit.g:5042:3: rule__Loop__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_14()); 

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
    // $ANTLR end "rule__Loop__Group__14__Impl"


    // $ANTLR start "rule__Loop__Group__15"
    // InternalQuCircuit.g:5050:1: rule__Loop__Group__15 : rule__Loop__Group__15__Impl rule__Loop__Group__16 ;
    public final void rule__Loop__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5054:1: ( rule__Loop__Group__15__Impl rule__Loop__Group__16 )
            // InternalQuCircuit.g:5055:2: rule__Loop__Group__15__Impl rule__Loop__Group__16
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__16();

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
    // $ANTLR end "rule__Loop__Group__15"


    // $ANTLR start "rule__Loop__Group__15__Impl"
    // InternalQuCircuit.g:5062:1: rule__Loop__Group__15__Impl : ( 'targetQubits' ) ;
    public final void rule__Loop__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5066:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:5067:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:5067:1: ( 'targetQubits' )
            // InternalQuCircuit.g:5068:2: 'targetQubits'
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsKeyword_15()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsKeyword_15()); 

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
    // $ANTLR end "rule__Loop__Group__15__Impl"


    // $ANTLR start "rule__Loop__Group__16"
    // InternalQuCircuit.g:5077:1: rule__Loop__Group__16 : rule__Loop__Group__16__Impl rule__Loop__Group__17 ;
    public final void rule__Loop__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5081:1: ( rule__Loop__Group__16__Impl rule__Loop__Group__17 )
            // InternalQuCircuit.g:5082:2: rule__Loop__Group__16__Impl rule__Loop__Group__17
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__17();

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
    // $ANTLR end "rule__Loop__Group__16"


    // $ANTLR start "rule__Loop__Group__16__Impl"
    // InternalQuCircuit.g:5089:1: rule__Loop__Group__16__Impl : ( '[' ) ;
    public final void rule__Loop__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5093:1: ( ( '[' ) )
            // InternalQuCircuit.g:5094:1: ( '[' )
            {
            // InternalQuCircuit.g:5094:1: ( '[' )
            // InternalQuCircuit.g:5095:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_16()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_16()); 

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
    // $ANTLR end "rule__Loop__Group__16__Impl"


    // $ANTLR start "rule__Loop__Group__17"
    // InternalQuCircuit.g:5104:1: rule__Loop__Group__17 : rule__Loop__Group__17__Impl rule__Loop__Group__18 ;
    public final void rule__Loop__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5108:1: ( rule__Loop__Group__17__Impl rule__Loop__Group__18 )
            // InternalQuCircuit.g:5109:2: rule__Loop__Group__17__Impl rule__Loop__Group__18
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__18();

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
    // $ANTLR end "rule__Loop__Group__17"


    // $ANTLR start "rule__Loop__Group__17__Impl"
    // InternalQuCircuit.g:5116:1: rule__Loop__Group__17__Impl : ( '(' ) ;
    public final void rule__Loop__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5120:1: ( ( '(' ) )
            // InternalQuCircuit.g:5121:1: ( '(' )
            {
            // InternalQuCircuit.g:5121:1: ( '(' )
            // InternalQuCircuit.g:5122:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_17()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_17()); 

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
    // $ANTLR end "rule__Loop__Group__17__Impl"


    // $ANTLR start "rule__Loop__Group__18"
    // InternalQuCircuit.g:5131:1: rule__Loop__Group__18 : rule__Loop__Group__18__Impl rule__Loop__Group__19 ;
    public final void rule__Loop__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5135:1: ( rule__Loop__Group__18__Impl rule__Loop__Group__19 )
            // InternalQuCircuit.g:5136:2: rule__Loop__Group__18__Impl rule__Loop__Group__19
            {
            pushFollow(FOLLOW_27);
            rule__Loop__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__19();

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
    // $ANTLR end "rule__Loop__Group__18"


    // $ANTLR start "rule__Loop__Group__18__Impl"
    // InternalQuCircuit.g:5143:1: rule__Loop__Group__18__Impl : ( ( rule__Loop__TargetQubitsAssignment_18 ) ) ;
    public final void rule__Loop__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5147:1: ( ( ( rule__Loop__TargetQubitsAssignment_18 ) ) )
            // InternalQuCircuit.g:5148:1: ( ( rule__Loop__TargetQubitsAssignment_18 ) )
            {
            // InternalQuCircuit.g:5148:1: ( ( rule__Loop__TargetQubitsAssignment_18 ) )
            // InternalQuCircuit.g:5149:2: ( rule__Loop__TargetQubitsAssignment_18 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsAssignment_18()); 
            // InternalQuCircuit.g:5150:2: ( rule__Loop__TargetQubitsAssignment_18 )
            // InternalQuCircuit.g:5150:3: rule__Loop__TargetQubitsAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsAssignment_18()); 

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
    // $ANTLR end "rule__Loop__Group__18__Impl"


    // $ANTLR start "rule__Loop__Group__19"
    // InternalQuCircuit.g:5158:1: rule__Loop__Group__19 : rule__Loop__Group__19__Impl rule__Loop__Group__20 ;
    public final void rule__Loop__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5162:1: ( rule__Loop__Group__19__Impl rule__Loop__Group__20 )
            // InternalQuCircuit.g:5163:2: rule__Loop__Group__19__Impl rule__Loop__Group__20
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__20();

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
    // $ANTLR end "rule__Loop__Group__19"


    // $ANTLR start "rule__Loop__Group__19__Impl"
    // InternalQuCircuit.g:5170:1: rule__Loop__Group__19__Impl : ( ')' ) ;
    public final void rule__Loop__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5174:1: ( ( ')' ) )
            // InternalQuCircuit.g:5175:1: ( ')' )
            {
            // InternalQuCircuit.g:5175:1: ( ')' )
            // InternalQuCircuit.g:5176:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_19()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_19()); 

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
    // $ANTLR end "rule__Loop__Group__19__Impl"


    // $ANTLR start "rule__Loop__Group__20"
    // InternalQuCircuit.g:5185:1: rule__Loop__Group__20 : rule__Loop__Group__20__Impl rule__Loop__Group__21 ;
    public final void rule__Loop__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5189:1: ( rule__Loop__Group__20__Impl rule__Loop__Group__21 )
            // InternalQuCircuit.g:5190:2: rule__Loop__Group__20__Impl rule__Loop__Group__21
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__21();

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
    // $ANTLR end "rule__Loop__Group__20"


    // $ANTLR start "rule__Loop__Group__20__Impl"
    // InternalQuCircuit.g:5197:1: rule__Loop__Group__20__Impl : ( ( rule__Loop__Group_20__0 )* ) ;
    public final void rule__Loop__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5201:1: ( ( ( rule__Loop__Group_20__0 )* ) )
            // InternalQuCircuit.g:5202:1: ( ( rule__Loop__Group_20__0 )* )
            {
            // InternalQuCircuit.g:5202:1: ( ( rule__Loop__Group_20__0 )* )
            // InternalQuCircuit.g:5203:2: ( rule__Loop__Group_20__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_20()); 
            // InternalQuCircuit.g:5204:2: ( rule__Loop__Group_20__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==24) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalQuCircuit.g:5204:3: rule__Loop__Group_20__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Loop__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_20()); 

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
    // $ANTLR end "rule__Loop__Group__20__Impl"


    // $ANTLR start "rule__Loop__Group__21"
    // InternalQuCircuit.g:5212:1: rule__Loop__Group__21 : rule__Loop__Group__21__Impl rule__Loop__Group__22 ;
    public final void rule__Loop__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5216:1: ( rule__Loop__Group__21__Impl rule__Loop__Group__22 )
            // InternalQuCircuit.g:5217:2: rule__Loop__Group__21__Impl rule__Loop__Group__22
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__22();

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
    // $ANTLR end "rule__Loop__Group__21"


    // $ANTLR start "rule__Loop__Group__21__Impl"
    // InternalQuCircuit.g:5224:1: rule__Loop__Group__21__Impl : ( ']' ) ;
    public final void rule__Loop__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5228:1: ( ( ']' ) )
            // InternalQuCircuit.g:5229:1: ( ']' )
            {
            // InternalQuCircuit.g:5229:1: ( ']' )
            // InternalQuCircuit.g:5230:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_21()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_21()); 

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
    // $ANTLR end "rule__Loop__Group__21__Impl"


    // $ANTLR start "rule__Loop__Group__22"
    // InternalQuCircuit.g:5239:1: rule__Loop__Group__22 : rule__Loop__Group__22__Impl rule__Loop__Group__23 ;
    public final void rule__Loop__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5243:1: ( rule__Loop__Group__22__Impl rule__Loop__Group__23 )
            // InternalQuCircuit.g:5244:2: rule__Loop__Group__22__Impl rule__Loop__Group__23
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__23();

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
    // $ANTLR end "rule__Loop__Group__22"


    // $ANTLR start "rule__Loop__Group__22__Impl"
    // InternalQuCircuit.g:5251:1: rule__Loop__Group__22__Impl : ( ( rule__Loop__Group_22__0 )? ) ;
    public final void rule__Loop__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5255:1: ( ( ( rule__Loop__Group_22__0 )? ) )
            // InternalQuCircuit.g:5256:1: ( ( rule__Loop__Group_22__0 )? )
            {
            // InternalQuCircuit.g:5256:1: ( ( rule__Loop__Group_22__0 )? )
            // InternalQuCircuit.g:5257:2: ( rule__Loop__Group_22__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_22()); 
            // InternalQuCircuit.g:5258:2: ( rule__Loop__Group_22__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQuCircuit.g:5258:3: rule__Loop__Group_22__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_22__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_22()); 

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
    // $ANTLR end "rule__Loop__Group__22__Impl"


    // $ANTLR start "rule__Loop__Group__23"
    // InternalQuCircuit.g:5266:1: rule__Loop__Group__23 : rule__Loop__Group__23__Impl rule__Loop__Group__24 ;
    public final void rule__Loop__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5270:1: ( rule__Loop__Group__23__Impl rule__Loop__Group__24 )
            // InternalQuCircuit.g:5271:2: rule__Loop__Group__23__Impl rule__Loop__Group__24
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__24();

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
    // $ANTLR end "rule__Loop__Group__23"


    // $ANTLR start "rule__Loop__Group__23__Impl"
    // InternalQuCircuit.g:5278:1: rule__Loop__Group__23__Impl : ( ( rule__Loop__Group_23__0 )? ) ;
    public final void rule__Loop__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5282:1: ( ( ( rule__Loop__Group_23__0 )? ) )
            // InternalQuCircuit.g:5283:1: ( ( rule__Loop__Group_23__0 )? )
            {
            // InternalQuCircuit.g:5283:1: ( ( rule__Loop__Group_23__0 )? )
            // InternalQuCircuit.g:5284:2: ( rule__Loop__Group_23__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_23()); 
            // InternalQuCircuit.g:5285:2: ( rule__Loop__Group_23__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==52) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQuCircuit.g:5285:3: rule__Loop__Group_23__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_23__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_23()); 

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
    // $ANTLR end "rule__Loop__Group__23__Impl"


    // $ANTLR start "rule__Loop__Group__24"
    // InternalQuCircuit.g:5293:1: rule__Loop__Group__24 : rule__Loop__Group__24__Impl rule__Loop__Group__25 ;
    public final void rule__Loop__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5297:1: ( rule__Loop__Group__24__Impl rule__Loop__Group__25 )
            // InternalQuCircuit.g:5298:2: rule__Loop__Group__24__Impl rule__Loop__Group__25
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__25();

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
    // $ANTLR end "rule__Loop__Group__24"


    // $ANTLR start "rule__Loop__Group__24__Impl"
    // InternalQuCircuit.g:5305:1: rule__Loop__Group__24__Impl : ( ( rule__Loop__Group_24__0 )? ) ;
    public final void rule__Loop__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5309:1: ( ( ( rule__Loop__Group_24__0 )? ) )
            // InternalQuCircuit.g:5310:1: ( ( rule__Loop__Group_24__0 )? )
            {
            // InternalQuCircuit.g:5310:1: ( ( rule__Loop__Group_24__0 )? )
            // InternalQuCircuit.g:5311:2: ( rule__Loop__Group_24__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_24()); 
            // InternalQuCircuit.g:5312:2: ( rule__Loop__Group_24__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQuCircuit.g:5312:3: rule__Loop__Group_24__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_24__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_24()); 

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
    // $ANTLR end "rule__Loop__Group__24__Impl"


    // $ANTLR start "rule__Loop__Group__25"
    // InternalQuCircuit.g:5320:1: rule__Loop__Group__25 : rule__Loop__Group__25__Impl rule__Loop__Group__26 ;
    public final void rule__Loop__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5324:1: ( rule__Loop__Group__25__Impl rule__Loop__Group__26 )
            // InternalQuCircuit.g:5325:2: rule__Loop__Group__25__Impl rule__Loop__Group__26
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__26();

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
    // $ANTLR end "rule__Loop__Group__25"


    // $ANTLR start "rule__Loop__Group__25__Impl"
    // InternalQuCircuit.g:5332:1: rule__Loop__Group__25__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5336:1: ( ( 'loop' ) )
            // InternalQuCircuit.g:5337:1: ( 'loop' )
            {
            // InternalQuCircuit.g:5337:1: ( 'loop' )
            // InternalQuCircuit.g:5338:2: 'loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_25()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_25()); 

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
    // $ANTLR end "rule__Loop__Group__25__Impl"


    // $ANTLR start "rule__Loop__Group__26"
    // InternalQuCircuit.g:5347:1: rule__Loop__Group__26 : rule__Loop__Group__26__Impl rule__Loop__Group__27 ;
    public final void rule__Loop__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5351:1: ( rule__Loop__Group__26__Impl rule__Loop__Group__27 )
            // InternalQuCircuit.g:5352:2: rule__Loop__Group__26__Impl rule__Loop__Group__27
            {
            pushFollow(FOLLOW_38);
            rule__Loop__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__27();

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
    // $ANTLR end "rule__Loop__Group__26"


    // $ANTLR start "rule__Loop__Group__26__Impl"
    // InternalQuCircuit.g:5359:1: rule__Loop__Group__26__Impl : ( ( rule__Loop__LoopAssignment_26 ) ) ;
    public final void rule__Loop__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5363:1: ( ( ( rule__Loop__LoopAssignment_26 ) ) )
            // InternalQuCircuit.g:5364:1: ( ( rule__Loop__LoopAssignment_26 ) )
            {
            // InternalQuCircuit.g:5364:1: ( ( rule__Loop__LoopAssignment_26 ) )
            // InternalQuCircuit.g:5365:2: ( rule__Loop__LoopAssignment_26 )
            {
             before(grammarAccess.getLoopAccess().getLoopAssignment_26()); 
            // InternalQuCircuit.g:5366:2: ( rule__Loop__LoopAssignment_26 )
            // InternalQuCircuit.g:5366:3: rule__Loop__LoopAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopAssignment_26()); 

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
    // $ANTLR end "rule__Loop__Group__26__Impl"


    // $ANTLR start "rule__Loop__Group__27"
    // InternalQuCircuit.g:5374:1: rule__Loop__Group__27 : rule__Loop__Group__27__Impl rule__Loop__Group__28 ;
    public final void rule__Loop__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5378:1: ( rule__Loop__Group__27__Impl rule__Loop__Group__28 )
            // InternalQuCircuit.g:5379:2: rule__Loop__Group__27__Impl rule__Loop__Group__28
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__28();

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
    // $ANTLR end "rule__Loop__Group__27"


    // $ANTLR start "rule__Loop__Group__27__Impl"
    // InternalQuCircuit.g:5386:1: rule__Loop__Group__27__Impl : ( 'loopTargetQubits' ) ;
    public final void rule__Loop__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5390:1: ( ( 'loopTargetQubits' ) )
            // InternalQuCircuit.g:5391:1: ( 'loopTargetQubits' )
            {
            // InternalQuCircuit.g:5391:1: ( 'loopTargetQubits' )
            // InternalQuCircuit.g:5392:2: 'loopTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsKeyword_27()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopTargetQubitsKeyword_27()); 

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
    // $ANTLR end "rule__Loop__Group__27__Impl"


    // $ANTLR start "rule__Loop__Group__28"
    // InternalQuCircuit.g:5401:1: rule__Loop__Group__28 : rule__Loop__Group__28__Impl rule__Loop__Group__29 ;
    public final void rule__Loop__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5405:1: ( rule__Loop__Group__28__Impl rule__Loop__Group__29 )
            // InternalQuCircuit.g:5406:2: rule__Loop__Group__28__Impl rule__Loop__Group__29
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__29();

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
    // $ANTLR end "rule__Loop__Group__28"


    // $ANTLR start "rule__Loop__Group__28__Impl"
    // InternalQuCircuit.g:5413:1: rule__Loop__Group__28__Impl : ( '[' ) ;
    public final void rule__Loop__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5417:1: ( ( '[' ) )
            // InternalQuCircuit.g:5418:1: ( '[' )
            {
            // InternalQuCircuit.g:5418:1: ( '[' )
            // InternalQuCircuit.g:5419:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_28()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_28()); 

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
    // $ANTLR end "rule__Loop__Group__28__Impl"


    // $ANTLR start "rule__Loop__Group__29"
    // InternalQuCircuit.g:5428:1: rule__Loop__Group__29 : rule__Loop__Group__29__Impl rule__Loop__Group__30 ;
    public final void rule__Loop__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5432:1: ( rule__Loop__Group__29__Impl rule__Loop__Group__30 )
            // InternalQuCircuit.g:5433:2: rule__Loop__Group__29__Impl rule__Loop__Group__30
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__30();

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
    // $ANTLR end "rule__Loop__Group__29"


    // $ANTLR start "rule__Loop__Group__29__Impl"
    // InternalQuCircuit.g:5440:1: rule__Loop__Group__29__Impl : ( '(' ) ;
    public final void rule__Loop__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5444:1: ( ( '(' ) )
            // InternalQuCircuit.g:5445:1: ( '(' )
            {
            // InternalQuCircuit.g:5445:1: ( '(' )
            // InternalQuCircuit.g:5446:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_29()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_29()); 

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
    // $ANTLR end "rule__Loop__Group__29__Impl"


    // $ANTLR start "rule__Loop__Group__30"
    // InternalQuCircuit.g:5455:1: rule__Loop__Group__30 : rule__Loop__Group__30__Impl rule__Loop__Group__31 ;
    public final void rule__Loop__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5459:1: ( rule__Loop__Group__30__Impl rule__Loop__Group__31 )
            // InternalQuCircuit.g:5460:2: rule__Loop__Group__30__Impl rule__Loop__Group__31
            {
            pushFollow(FOLLOW_27);
            rule__Loop__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__31();

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
    // $ANTLR end "rule__Loop__Group__30"


    // $ANTLR start "rule__Loop__Group__30__Impl"
    // InternalQuCircuit.g:5467:1: rule__Loop__Group__30__Impl : ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) ) ;
    public final void rule__Loop__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5471:1: ( ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) ) )
            // InternalQuCircuit.g:5472:1: ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) )
            {
            // InternalQuCircuit.g:5472:1: ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) )
            // InternalQuCircuit.g:5473:2: ( rule__Loop__LoopTargetQubitsAssignment_30 )
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_30()); 
            // InternalQuCircuit.g:5474:2: ( rule__Loop__LoopTargetQubitsAssignment_30 )
            // InternalQuCircuit.g:5474:3: rule__Loop__LoopTargetQubitsAssignment_30
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopTargetQubitsAssignment_30();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_30()); 

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
    // $ANTLR end "rule__Loop__Group__30__Impl"


    // $ANTLR start "rule__Loop__Group__31"
    // InternalQuCircuit.g:5482:1: rule__Loop__Group__31 : rule__Loop__Group__31__Impl rule__Loop__Group__32 ;
    public final void rule__Loop__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5486:1: ( rule__Loop__Group__31__Impl rule__Loop__Group__32 )
            // InternalQuCircuit.g:5487:2: rule__Loop__Group__31__Impl rule__Loop__Group__32
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__32();

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
    // $ANTLR end "rule__Loop__Group__31"


    // $ANTLR start "rule__Loop__Group__31__Impl"
    // InternalQuCircuit.g:5494:1: rule__Loop__Group__31__Impl : ( ')' ) ;
    public final void rule__Loop__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5498:1: ( ( ')' ) )
            // InternalQuCircuit.g:5499:1: ( ')' )
            {
            // InternalQuCircuit.g:5499:1: ( ')' )
            // InternalQuCircuit.g:5500:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_31()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_31()); 

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
    // $ANTLR end "rule__Loop__Group__31__Impl"


    // $ANTLR start "rule__Loop__Group__32"
    // InternalQuCircuit.g:5509:1: rule__Loop__Group__32 : rule__Loop__Group__32__Impl rule__Loop__Group__33 ;
    public final void rule__Loop__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5513:1: ( rule__Loop__Group__32__Impl rule__Loop__Group__33 )
            // InternalQuCircuit.g:5514:2: rule__Loop__Group__32__Impl rule__Loop__Group__33
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__33();

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
    // $ANTLR end "rule__Loop__Group__32"


    // $ANTLR start "rule__Loop__Group__32__Impl"
    // InternalQuCircuit.g:5521:1: rule__Loop__Group__32__Impl : ( ( rule__Loop__Group_32__0 )* ) ;
    public final void rule__Loop__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5525:1: ( ( ( rule__Loop__Group_32__0 )* ) )
            // InternalQuCircuit.g:5526:1: ( ( rule__Loop__Group_32__0 )* )
            {
            // InternalQuCircuit.g:5526:1: ( ( rule__Loop__Group_32__0 )* )
            // InternalQuCircuit.g:5527:2: ( rule__Loop__Group_32__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_32()); 
            // InternalQuCircuit.g:5528:2: ( rule__Loop__Group_32__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==24) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalQuCircuit.g:5528:3: rule__Loop__Group_32__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Loop__Group_32__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_32()); 

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
    // $ANTLR end "rule__Loop__Group__32__Impl"


    // $ANTLR start "rule__Loop__Group__33"
    // InternalQuCircuit.g:5536:1: rule__Loop__Group__33 : rule__Loop__Group__33__Impl rule__Loop__Group__34 ;
    public final void rule__Loop__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5540:1: ( rule__Loop__Group__33__Impl rule__Loop__Group__34 )
            // InternalQuCircuit.g:5541:2: rule__Loop__Group__33__Impl rule__Loop__Group__34
            {
            pushFollow(FOLLOW_39);
            rule__Loop__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__34();

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
    // $ANTLR end "rule__Loop__Group__33"


    // $ANTLR start "rule__Loop__Group__33__Impl"
    // InternalQuCircuit.g:5548:1: rule__Loop__Group__33__Impl : ( ']' ) ;
    public final void rule__Loop__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5552:1: ( ( ']' ) )
            // InternalQuCircuit.g:5553:1: ( ']' )
            {
            // InternalQuCircuit.g:5553:1: ( ']' )
            // InternalQuCircuit.g:5554:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_33()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_33()); 

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
    // $ANTLR end "rule__Loop__Group__33__Impl"


    // $ANTLR start "rule__Loop__Group__34"
    // InternalQuCircuit.g:5563:1: rule__Loop__Group__34 : rule__Loop__Group__34__Impl rule__Loop__Group__35 ;
    public final void rule__Loop__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5567:1: ( rule__Loop__Group__34__Impl rule__Loop__Group__35 )
            // InternalQuCircuit.g:5568:2: rule__Loop__Group__34__Impl rule__Loop__Group__35
            {
            pushFollow(FOLLOW_39);
            rule__Loop__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__35();

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
    // $ANTLR end "rule__Loop__Group__34"


    // $ANTLR start "rule__Loop__Group__34__Impl"
    // InternalQuCircuit.g:5575:1: rule__Loop__Group__34__Impl : ( ( rule__Loop__Group_34__0 )? ) ;
    public final void rule__Loop__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5579:1: ( ( ( rule__Loop__Group_34__0 )? ) )
            // InternalQuCircuit.g:5580:1: ( ( rule__Loop__Group_34__0 )? )
            {
            // InternalQuCircuit.g:5580:1: ( ( rule__Loop__Group_34__0 )? )
            // InternalQuCircuit.g:5581:2: ( rule__Loop__Group_34__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_34()); 
            // InternalQuCircuit.g:5582:2: ( rule__Loop__Group_34__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQuCircuit.g:5582:3: rule__Loop__Group_34__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_34__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_34()); 

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
    // $ANTLR end "rule__Loop__Group__34__Impl"


    // $ANTLR start "rule__Loop__Group__35"
    // InternalQuCircuit.g:5590:1: rule__Loop__Group__35 : rule__Loop__Group__35__Impl ;
    public final void rule__Loop__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5594:1: ( rule__Loop__Group__35__Impl )
            // InternalQuCircuit.g:5595:2: rule__Loop__Group__35__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__35__Impl();

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
    // $ANTLR end "rule__Loop__Group__35"


    // $ANTLR start "rule__Loop__Group__35__Impl"
    // InternalQuCircuit.g:5601:1: rule__Loop__Group__35__Impl : ( '}' ) ;
    public final void rule__Loop__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5605:1: ( ( '}' ) )
            // InternalQuCircuit.g:5606:1: ( '}' )
            {
            // InternalQuCircuit.g:5606:1: ( '}' )
            // InternalQuCircuit.g:5607:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_35()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_35()); 

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
    // $ANTLR end "rule__Loop__Group__35__Impl"


    // $ANTLR start "rule__Loop__Group_6__0"
    // InternalQuCircuit.g:5617:1: rule__Loop__Group_6__0 : rule__Loop__Group_6__0__Impl rule__Loop__Group_6__1 ;
    public final void rule__Loop__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5621:1: ( rule__Loop__Group_6__0__Impl rule__Loop__Group_6__1 )
            // InternalQuCircuit.g:5622:2: rule__Loop__Group_6__0__Impl rule__Loop__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Loop__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_6__1();

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
    // $ANTLR end "rule__Loop__Group_6__0"


    // $ANTLR start "rule__Loop__Group_6__0__Impl"
    // InternalQuCircuit.g:5629:1: rule__Loop__Group_6__0__Impl : ( 'iterations' ) ;
    public final void rule__Loop__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5633:1: ( ( 'iterations' ) )
            // InternalQuCircuit.g:5634:1: ( 'iterations' )
            {
            // InternalQuCircuit.g:5634:1: ( 'iterations' )
            // InternalQuCircuit.g:5635:2: 'iterations'
            {
             before(grammarAccess.getLoopAccess().getIterationsKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIterationsKeyword_6_0()); 

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
    // $ANTLR end "rule__Loop__Group_6__0__Impl"


    // $ANTLR start "rule__Loop__Group_6__1"
    // InternalQuCircuit.g:5644:1: rule__Loop__Group_6__1 : rule__Loop__Group_6__1__Impl ;
    public final void rule__Loop__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5648:1: ( rule__Loop__Group_6__1__Impl )
            // InternalQuCircuit.g:5649:2: rule__Loop__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_6__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_6__1"


    // $ANTLR start "rule__Loop__Group_6__1__Impl"
    // InternalQuCircuit.g:5655:1: rule__Loop__Group_6__1__Impl : ( ( rule__Loop__IterationsAssignment_6_1 ) ) ;
    public final void rule__Loop__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5659:1: ( ( ( rule__Loop__IterationsAssignment_6_1 ) ) )
            // InternalQuCircuit.g:5660:1: ( ( rule__Loop__IterationsAssignment_6_1 ) )
            {
            // InternalQuCircuit.g:5660:1: ( ( rule__Loop__IterationsAssignment_6_1 ) )
            // InternalQuCircuit.g:5661:2: ( rule__Loop__IterationsAssignment_6_1 )
            {
             before(grammarAccess.getLoopAccess().getIterationsAssignment_6_1()); 
            // InternalQuCircuit.g:5662:2: ( rule__Loop__IterationsAssignment_6_1 )
            // InternalQuCircuit.g:5662:3: rule__Loop__IterationsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__IterationsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getIterationsAssignment_6_1()); 

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
    // $ANTLR end "rule__Loop__Group_6__1__Impl"


    // $ANTLR start "rule__Loop__Group_9__0"
    // InternalQuCircuit.g:5671:1: rule__Loop__Group_9__0 : rule__Loop__Group_9__0__Impl rule__Loop__Group_9__1 ;
    public final void rule__Loop__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5675:1: ( rule__Loop__Group_9__0__Impl rule__Loop__Group_9__1 )
            // InternalQuCircuit.g:5676:2: rule__Loop__Group_9__0__Impl rule__Loop__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__Loop__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_9__1();

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
    // $ANTLR end "rule__Loop__Group_9__0"


    // $ANTLR start "rule__Loop__Group_9__0__Impl"
    // InternalQuCircuit.g:5683:1: rule__Loop__Group_9__0__Impl : ( 'targetQubitsBlockSize' ) ;
    public final void rule__Loop__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5687:1: ( ( 'targetQubitsBlockSize' ) )
            // InternalQuCircuit.g:5688:1: ( 'targetQubitsBlockSize' )
            {
            // InternalQuCircuit.g:5688:1: ( 'targetQubitsBlockSize' )
            // InternalQuCircuit.g:5689:2: 'targetQubitsBlockSize'
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeKeyword_9_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeKeyword_9_0()); 

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
    // $ANTLR end "rule__Loop__Group_9__0__Impl"


    // $ANTLR start "rule__Loop__Group_9__1"
    // InternalQuCircuit.g:5698:1: rule__Loop__Group_9__1 : rule__Loop__Group_9__1__Impl ;
    public final void rule__Loop__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5702:1: ( rule__Loop__Group_9__1__Impl )
            // InternalQuCircuit.g:5703:2: rule__Loop__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_9__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_9__1"


    // $ANTLR start "rule__Loop__Group_9__1__Impl"
    // InternalQuCircuit.g:5709:1: rule__Loop__Group_9__1__Impl : ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) ) ;
    public final void rule__Loop__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5713:1: ( ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) ) )
            // InternalQuCircuit.g:5714:1: ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) )
            {
            // InternalQuCircuit.g:5714:1: ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) )
            // InternalQuCircuit.g:5715:2: ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeAssignment_9_1()); 
            // InternalQuCircuit.g:5716:2: ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 )
            // InternalQuCircuit.g:5716:3: rule__Loop__TargetQubitsBlockSizeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsBlockSizeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeAssignment_9_1()); 

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
    // $ANTLR end "rule__Loop__Group_9__1__Impl"


    // $ANTLR start "rule__Loop__Group_10__0"
    // InternalQuCircuit.g:5725:1: rule__Loop__Group_10__0 : rule__Loop__Group_10__0__Impl rule__Loop__Group_10__1 ;
    public final void rule__Loop__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5729:1: ( rule__Loop__Group_10__0__Impl rule__Loop__Group_10__1 )
            // InternalQuCircuit.g:5730:2: rule__Loop__Group_10__0__Impl rule__Loop__Group_10__1
            {
            pushFollow(FOLLOW_12);
            rule__Loop__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_10__1();

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
    // $ANTLR end "rule__Loop__Group_10__0"


    // $ANTLR start "rule__Loop__Group_10__0__Impl"
    // InternalQuCircuit.g:5737:1: rule__Loop__Group_10__0__Impl : ( 'controlQubitsBlockSize' ) ;
    public final void rule__Loop__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5741:1: ( ( 'controlQubitsBlockSize' ) )
            // InternalQuCircuit.g:5742:1: ( 'controlQubitsBlockSize' )
            {
            // InternalQuCircuit.g:5742:1: ( 'controlQubitsBlockSize' )
            // InternalQuCircuit.g:5743:2: 'controlQubitsBlockSize'
            {
             before(grammarAccess.getLoopAccess().getControlQubitsBlockSizeKeyword_10_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsBlockSizeKeyword_10_0()); 

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
    // $ANTLR end "rule__Loop__Group_10__0__Impl"


    // $ANTLR start "rule__Loop__Group_10__1"
    // InternalQuCircuit.g:5752:1: rule__Loop__Group_10__1 : rule__Loop__Group_10__1__Impl ;
    public final void rule__Loop__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5756:1: ( rule__Loop__Group_10__1__Impl )
            // InternalQuCircuit.g:5757:2: rule__Loop__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_10__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_10__1"


    // $ANTLR start "rule__Loop__Group_10__1__Impl"
    // InternalQuCircuit.g:5763:1: rule__Loop__Group_10__1__Impl : ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) ) ;
    public final void rule__Loop__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5767:1: ( ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) ) )
            // InternalQuCircuit.g:5768:1: ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) )
            {
            // InternalQuCircuit.g:5768:1: ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) )
            // InternalQuCircuit.g:5769:2: ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsBlockSizeAssignment_10_1()); 
            // InternalQuCircuit.g:5770:2: ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 )
            // InternalQuCircuit.g:5770:3: rule__Loop__ControlQubitsBlockSizeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsBlockSizeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsBlockSizeAssignment_10_1()); 

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
    // $ANTLR end "rule__Loop__Group_10__1__Impl"


    // $ANTLR start "rule__Loop__Group_11__0"
    // InternalQuCircuit.g:5779:1: rule__Loop__Group_11__0 : rule__Loop__Group_11__0__Impl rule__Loop__Group_11__1 ;
    public final void rule__Loop__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5783:1: ( rule__Loop__Group_11__0__Impl rule__Loop__Group_11__1 )
            // InternalQuCircuit.g:5784:2: rule__Loop__Group_11__0__Impl rule__Loop__Group_11__1
            {
            pushFollow(FOLLOW_40);
            rule__Loop__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_11__1();

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
    // $ANTLR end "rule__Loop__Group_11__0"


    // $ANTLR start "rule__Loop__Group_11__0__Impl"
    // InternalQuCircuit.g:5791:1: rule__Loop__Group_11__0__Impl : ( 'controlQubitsIterationType' ) ;
    public final void rule__Loop__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5795:1: ( ( 'controlQubitsIterationType' ) )
            // InternalQuCircuit.g:5796:1: ( 'controlQubitsIterationType' )
            {
            // InternalQuCircuit.g:5796:1: ( 'controlQubitsIterationType' )
            // InternalQuCircuit.g:5797:2: 'controlQubitsIterationType'
            {
             before(grammarAccess.getLoopAccess().getControlQubitsIterationTypeKeyword_11_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsIterationTypeKeyword_11_0()); 

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
    // $ANTLR end "rule__Loop__Group_11__0__Impl"


    // $ANTLR start "rule__Loop__Group_11__1"
    // InternalQuCircuit.g:5806:1: rule__Loop__Group_11__1 : rule__Loop__Group_11__1__Impl ;
    public final void rule__Loop__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5810:1: ( rule__Loop__Group_11__1__Impl )
            // InternalQuCircuit.g:5811:2: rule__Loop__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_11__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_11__1"


    // $ANTLR start "rule__Loop__Group_11__1__Impl"
    // InternalQuCircuit.g:5817:1: rule__Loop__Group_11__1__Impl : ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) ) ;
    public final void rule__Loop__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5821:1: ( ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) ) )
            // InternalQuCircuit.g:5822:1: ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) )
            {
            // InternalQuCircuit.g:5822:1: ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) )
            // InternalQuCircuit.g:5823:2: ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsIterationTypeAssignment_11_1()); 
            // InternalQuCircuit.g:5824:2: ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 )
            // InternalQuCircuit.g:5824:3: rule__Loop__ControlQubitsIterationTypeAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsIterationTypeAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsIterationTypeAssignment_11_1()); 

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
    // $ANTLR end "rule__Loop__Group_11__1__Impl"


    // $ANTLR start "rule__Loop__Group_12__0"
    // InternalQuCircuit.g:5833:1: rule__Loop__Group_12__0 : rule__Loop__Group_12__0__Impl rule__Loop__Group_12__1 ;
    public final void rule__Loop__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5837:1: ( rule__Loop__Group_12__0__Impl rule__Loop__Group_12__1 )
            // InternalQuCircuit.g:5838:2: rule__Loop__Group_12__0__Impl rule__Loop__Group_12__1
            {
            pushFollow(FOLLOW_40);
            rule__Loop__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_12__1();

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
    // $ANTLR end "rule__Loop__Group_12__0"


    // $ANTLR start "rule__Loop__Group_12__0__Impl"
    // InternalQuCircuit.g:5845:1: rule__Loop__Group_12__0__Impl : ( 'targetQubitsIterationType' ) ;
    public final void rule__Loop__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5849:1: ( ( 'targetQubitsIterationType' ) )
            // InternalQuCircuit.g:5850:1: ( 'targetQubitsIterationType' )
            {
            // InternalQuCircuit.g:5850:1: ( 'targetQubitsIterationType' )
            // InternalQuCircuit.g:5851:2: 'targetQubitsIterationType'
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeKeyword_12_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeKeyword_12_0()); 

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
    // $ANTLR end "rule__Loop__Group_12__0__Impl"


    // $ANTLR start "rule__Loop__Group_12__1"
    // InternalQuCircuit.g:5860:1: rule__Loop__Group_12__1 : rule__Loop__Group_12__1__Impl ;
    public final void rule__Loop__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5864:1: ( rule__Loop__Group_12__1__Impl )
            // InternalQuCircuit.g:5865:2: rule__Loop__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_12__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_12__1"


    // $ANTLR start "rule__Loop__Group_12__1__Impl"
    // InternalQuCircuit.g:5871:1: rule__Loop__Group_12__1__Impl : ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) ) ;
    public final void rule__Loop__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5875:1: ( ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) ) )
            // InternalQuCircuit.g:5876:1: ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) )
            {
            // InternalQuCircuit.g:5876:1: ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) )
            // InternalQuCircuit.g:5877:2: ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeAssignment_12_1()); 
            // InternalQuCircuit.g:5878:2: ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 )
            // InternalQuCircuit.g:5878:3: rule__Loop__TargetQubitsIterationTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsIterationTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeAssignment_12_1()); 

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
    // $ANTLR end "rule__Loop__Group_12__1__Impl"


    // $ANTLR start "rule__Loop__Group_13__0"
    // InternalQuCircuit.g:5887:1: rule__Loop__Group_13__0 : rule__Loop__Group_13__0__Impl rule__Loop__Group_13__1 ;
    public final void rule__Loop__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5891:1: ( rule__Loop__Group_13__0__Impl rule__Loop__Group_13__1 )
            // InternalQuCircuit.g:5892:2: rule__Loop__Group_13__0__Impl rule__Loop__Group_13__1
            {
            pushFollow(FOLLOW_12);
            rule__Loop__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_13__1();

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
    // $ANTLR end "rule__Loop__Group_13__0"


    // $ANTLR start "rule__Loop__Group_13__0__Impl"
    // InternalQuCircuit.g:5899:1: rule__Loop__Group_13__0__Impl : ( 'incrementBy' ) ;
    public final void rule__Loop__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5903:1: ( ( 'incrementBy' ) )
            // InternalQuCircuit.g:5904:1: ( 'incrementBy' )
            {
            // InternalQuCircuit.g:5904:1: ( 'incrementBy' )
            // InternalQuCircuit.g:5905:2: 'incrementBy'
            {
             before(grammarAccess.getLoopAccess().getIncrementByKeyword_13_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementByKeyword_13_0()); 

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
    // $ANTLR end "rule__Loop__Group_13__0__Impl"


    // $ANTLR start "rule__Loop__Group_13__1"
    // InternalQuCircuit.g:5914:1: rule__Loop__Group_13__1 : rule__Loop__Group_13__1__Impl ;
    public final void rule__Loop__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5918:1: ( rule__Loop__Group_13__1__Impl )
            // InternalQuCircuit.g:5919:2: rule__Loop__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_13__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_13__1"


    // $ANTLR start "rule__Loop__Group_13__1__Impl"
    // InternalQuCircuit.g:5925:1: rule__Loop__Group_13__1__Impl : ( ( rule__Loop__IncrementByAssignment_13_1 ) ) ;
    public final void rule__Loop__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5929:1: ( ( ( rule__Loop__IncrementByAssignment_13_1 ) ) )
            // InternalQuCircuit.g:5930:1: ( ( rule__Loop__IncrementByAssignment_13_1 ) )
            {
            // InternalQuCircuit.g:5930:1: ( ( rule__Loop__IncrementByAssignment_13_1 ) )
            // InternalQuCircuit.g:5931:2: ( rule__Loop__IncrementByAssignment_13_1 )
            {
             before(grammarAccess.getLoopAccess().getIncrementByAssignment_13_1()); 
            // InternalQuCircuit.g:5932:2: ( rule__Loop__IncrementByAssignment_13_1 )
            // InternalQuCircuit.g:5932:3: rule__Loop__IncrementByAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__IncrementByAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getIncrementByAssignment_13_1()); 

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
    // $ANTLR end "rule__Loop__Group_13__1__Impl"


    // $ANTLR start "rule__Loop__Group_14__0"
    // InternalQuCircuit.g:5941:1: rule__Loop__Group_14__0 : rule__Loop__Group_14__0__Impl rule__Loop__Group_14__1 ;
    public final void rule__Loop__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5945:1: ( rule__Loop__Group_14__0__Impl rule__Loop__Group_14__1 )
            // InternalQuCircuit.g:5946:2: rule__Loop__Group_14__0__Impl rule__Loop__Group_14__1
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__1();

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
    // $ANTLR end "rule__Loop__Group_14__0"


    // $ANTLR start "rule__Loop__Group_14__0__Impl"
    // InternalQuCircuit.g:5953:1: rule__Loop__Group_14__0__Impl : ( 'operations' ) ;
    public final void rule__Loop__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5957:1: ( ( 'operations' ) )
            // InternalQuCircuit.g:5958:1: ( 'operations' )
            {
            // InternalQuCircuit.g:5958:1: ( 'operations' )
            // InternalQuCircuit.g:5959:2: 'operations'
            {
             before(grammarAccess.getLoopAccess().getOperationsKeyword_14_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getOperationsKeyword_14_0()); 

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
    // $ANTLR end "rule__Loop__Group_14__0__Impl"


    // $ANTLR start "rule__Loop__Group_14__1"
    // InternalQuCircuit.g:5968:1: rule__Loop__Group_14__1 : rule__Loop__Group_14__1__Impl rule__Loop__Group_14__2 ;
    public final void rule__Loop__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5972:1: ( rule__Loop__Group_14__1__Impl rule__Loop__Group_14__2 )
            // InternalQuCircuit.g:5973:2: rule__Loop__Group_14__1__Impl rule__Loop__Group_14__2
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__2();

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
    // $ANTLR end "rule__Loop__Group_14__1"


    // $ANTLR start "rule__Loop__Group_14__1__Impl"
    // InternalQuCircuit.g:5980:1: rule__Loop__Group_14__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5984:1: ( ( '(' ) )
            // InternalQuCircuit.g:5985:1: ( '(' )
            {
            // InternalQuCircuit.g:5985:1: ( '(' )
            // InternalQuCircuit.g:5986:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_14_1()); 

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
    // $ANTLR end "rule__Loop__Group_14__1__Impl"


    // $ANTLR start "rule__Loop__Group_14__2"
    // InternalQuCircuit.g:5995:1: rule__Loop__Group_14__2 : rule__Loop__Group_14__2__Impl rule__Loop__Group_14__3 ;
    public final void rule__Loop__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5999:1: ( rule__Loop__Group_14__2__Impl rule__Loop__Group_14__3 )
            // InternalQuCircuit.g:6000:2: rule__Loop__Group_14__2__Impl rule__Loop__Group_14__3
            {
            pushFollow(FOLLOW_41);
            rule__Loop__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__3();

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
    // $ANTLR end "rule__Loop__Group_14__2"


    // $ANTLR start "rule__Loop__Group_14__2__Impl"
    // InternalQuCircuit.g:6007:1: rule__Loop__Group_14__2__Impl : ( ( rule__Loop__OperationsAssignment_14_2 ) ) ;
    public final void rule__Loop__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6011:1: ( ( ( rule__Loop__OperationsAssignment_14_2 ) ) )
            // InternalQuCircuit.g:6012:1: ( ( rule__Loop__OperationsAssignment_14_2 ) )
            {
            // InternalQuCircuit.g:6012:1: ( ( rule__Loop__OperationsAssignment_14_2 ) )
            // InternalQuCircuit.g:6013:2: ( rule__Loop__OperationsAssignment_14_2 )
            {
             before(grammarAccess.getLoopAccess().getOperationsAssignment_14_2()); 
            // InternalQuCircuit.g:6014:2: ( rule__Loop__OperationsAssignment_14_2 )
            // InternalQuCircuit.g:6014:3: rule__Loop__OperationsAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__OperationsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getOperationsAssignment_14_2()); 

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
    // $ANTLR end "rule__Loop__Group_14__2__Impl"


    // $ANTLR start "rule__Loop__Group_14__3"
    // InternalQuCircuit.g:6022:1: rule__Loop__Group_14__3 : rule__Loop__Group_14__3__Impl rule__Loop__Group_14__4 ;
    public final void rule__Loop__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6026:1: ( rule__Loop__Group_14__3__Impl rule__Loop__Group_14__4 )
            // InternalQuCircuit.g:6027:2: rule__Loop__Group_14__3__Impl rule__Loop__Group_14__4
            {
            pushFollow(FOLLOW_41);
            rule__Loop__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__4();

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
    // $ANTLR end "rule__Loop__Group_14__3"


    // $ANTLR start "rule__Loop__Group_14__3__Impl"
    // InternalQuCircuit.g:6034:1: rule__Loop__Group_14__3__Impl : ( ( rule__Loop__Group_14_3__0 )* ) ;
    public final void rule__Loop__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6038:1: ( ( ( rule__Loop__Group_14_3__0 )* ) )
            // InternalQuCircuit.g:6039:1: ( ( rule__Loop__Group_14_3__0 )* )
            {
            // InternalQuCircuit.g:6039:1: ( ( rule__Loop__Group_14_3__0 )* )
            // InternalQuCircuit.g:6040:2: ( rule__Loop__Group_14_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_14_3()); 
            // InternalQuCircuit.g:6041:2: ( rule__Loop__Group_14_3__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==24) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalQuCircuit.g:6041:3: rule__Loop__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Loop__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_14_3()); 

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
    // $ANTLR end "rule__Loop__Group_14__3__Impl"


    // $ANTLR start "rule__Loop__Group_14__4"
    // InternalQuCircuit.g:6049:1: rule__Loop__Group_14__4 : rule__Loop__Group_14__4__Impl ;
    public final void rule__Loop__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6053:1: ( rule__Loop__Group_14__4__Impl )
            // InternalQuCircuit.g:6054:2: rule__Loop__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_14__4"


    // $ANTLR start "rule__Loop__Group_14__4__Impl"
    // InternalQuCircuit.g:6060:1: rule__Loop__Group_14__4__Impl : ( ')' ) ;
    public final void rule__Loop__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6064:1: ( ( ')' ) )
            // InternalQuCircuit.g:6065:1: ( ')' )
            {
            // InternalQuCircuit.g:6065:1: ( ')' )
            // InternalQuCircuit.g:6066:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_14_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_14_4()); 

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
    // $ANTLR end "rule__Loop__Group_14__4__Impl"


    // $ANTLR start "rule__Loop__Group_14_3__0"
    // InternalQuCircuit.g:6076:1: rule__Loop__Group_14_3__0 : rule__Loop__Group_14_3__0__Impl rule__Loop__Group_14_3__1 ;
    public final void rule__Loop__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6080:1: ( rule__Loop__Group_14_3__0__Impl rule__Loop__Group_14_3__1 )
            // InternalQuCircuit.g:6081:2: rule__Loop__Group_14_3__0__Impl rule__Loop__Group_14_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14_3__1();

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
    // $ANTLR end "rule__Loop__Group_14_3__0"


    // $ANTLR start "rule__Loop__Group_14_3__0__Impl"
    // InternalQuCircuit.g:6088:1: rule__Loop__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6092:1: ( ( ',' ) )
            // InternalQuCircuit.g:6093:1: ( ',' )
            {
            // InternalQuCircuit.g:6093:1: ( ',' )
            // InternalQuCircuit.g:6094:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_14_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_14_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_14_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_14_3__1"
    // InternalQuCircuit.g:6103:1: rule__Loop__Group_14_3__1 : rule__Loop__Group_14_3__1__Impl ;
    public final void rule__Loop__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6107:1: ( rule__Loop__Group_14_3__1__Impl )
            // InternalQuCircuit.g:6108:2: rule__Loop__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_14_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_14_3__1"


    // $ANTLR start "rule__Loop__Group_14_3__1__Impl"
    // InternalQuCircuit.g:6114:1: rule__Loop__Group_14_3__1__Impl : ( ( rule__Loop__OperationsAssignment_14_3_1 ) ) ;
    public final void rule__Loop__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6118:1: ( ( ( rule__Loop__OperationsAssignment_14_3_1 ) ) )
            // InternalQuCircuit.g:6119:1: ( ( rule__Loop__OperationsAssignment_14_3_1 ) )
            {
            // InternalQuCircuit.g:6119:1: ( ( rule__Loop__OperationsAssignment_14_3_1 ) )
            // InternalQuCircuit.g:6120:2: ( rule__Loop__OperationsAssignment_14_3_1 )
            {
             before(grammarAccess.getLoopAccess().getOperationsAssignment_14_3_1()); 
            // InternalQuCircuit.g:6121:2: ( rule__Loop__OperationsAssignment_14_3_1 )
            // InternalQuCircuit.g:6121:3: rule__Loop__OperationsAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__OperationsAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getOperationsAssignment_14_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_14_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_20__0"
    // InternalQuCircuit.g:6130:1: rule__Loop__Group_20__0 : rule__Loop__Group_20__0__Impl rule__Loop__Group_20__1 ;
    public final void rule__Loop__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6134:1: ( rule__Loop__Group_20__0__Impl rule__Loop__Group_20__1 )
            // InternalQuCircuit.g:6135:2: rule__Loop__Group_20__0__Impl rule__Loop__Group_20__1
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__1();

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
    // $ANTLR end "rule__Loop__Group_20__0"


    // $ANTLR start "rule__Loop__Group_20__0__Impl"
    // InternalQuCircuit.g:6142:1: rule__Loop__Group_20__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6146:1: ( ( ',' ) )
            // InternalQuCircuit.g:6147:1: ( ',' )
            {
            // InternalQuCircuit.g:6147:1: ( ',' )
            // InternalQuCircuit.g:6148:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_20_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_20_0()); 

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
    // $ANTLR end "rule__Loop__Group_20__0__Impl"


    // $ANTLR start "rule__Loop__Group_20__1"
    // InternalQuCircuit.g:6157:1: rule__Loop__Group_20__1 : rule__Loop__Group_20__1__Impl rule__Loop__Group_20__2 ;
    public final void rule__Loop__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6161:1: ( rule__Loop__Group_20__1__Impl rule__Loop__Group_20__2 )
            // InternalQuCircuit.g:6162:2: rule__Loop__Group_20__1__Impl rule__Loop__Group_20__2
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__2();

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
    // $ANTLR end "rule__Loop__Group_20__1"


    // $ANTLR start "rule__Loop__Group_20__1__Impl"
    // InternalQuCircuit.g:6169:1: rule__Loop__Group_20__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6173:1: ( ( '(' ) )
            // InternalQuCircuit.g:6174:1: ( '(' )
            {
            // InternalQuCircuit.g:6174:1: ( '(' )
            // InternalQuCircuit.g:6175:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_20_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_20_1()); 

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
    // $ANTLR end "rule__Loop__Group_20__1__Impl"


    // $ANTLR start "rule__Loop__Group_20__2"
    // InternalQuCircuit.g:6184:1: rule__Loop__Group_20__2 : rule__Loop__Group_20__2__Impl rule__Loop__Group_20__3 ;
    public final void rule__Loop__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6188:1: ( rule__Loop__Group_20__2__Impl rule__Loop__Group_20__3 )
            // InternalQuCircuit.g:6189:2: rule__Loop__Group_20__2__Impl rule__Loop__Group_20__3
            {
            pushFollow(FOLLOW_27);
            rule__Loop__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__3();

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
    // $ANTLR end "rule__Loop__Group_20__2"


    // $ANTLR start "rule__Loop__Group_20__2__Impl"
    // InternalQuCircuit.g:6196:1: rule__Loop__Group_20__2__Impl : ( ( rule__Loop__TargetQubitsAssignment_20_2 ) ) ;
    public final void rule__Loop__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6200:1: ( ( ( rule__Loop__TargetQubitsAssignment_20_2 ) ) )
            // InternalQuCircuit.g:6201:1: ( ( rule__Loop__TargetQubitsAssignment_20_2 ) )
            {
            // InternalQuCircuit.g:6201:1: ( ( rule__Loop__TargetQubitsAssignment_20_2 ) )
            // InternalQuCircuit.g:6202:2: ( rule__Loop__TargetQubitsAssignment_20_2 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsAssignment_20_2()); 
            // InternalQuCircuit.g:6203:2: ( rule__Loop__TargetQubitsAssignment_20_2 )
            // InternalQuCircuit.g:6203:3: rule__Loop__TargetQubitsAssignment_20_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsAssignment_20_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsAssignment_20_2()); 

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
    // $ANTLR end "rule__Loop__Group_20__2__Impl"


    // $ANTLR start "rule__Loop__Group_20__3"
    // InternalQuCircuit.g:6211:1: rule__Loop__Group_20__3 : rule__Loop__Group_20__3__Impl ;
    public final void rule__Loop__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6215:1: ( rule__Loop__Group_20__3__Impl )
            // InternalQuCircuit.g:6216:2: rule__Loop__Group_20__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__3__Impl();

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
    // $ANTLR end "rule__Loop__Group_20__3"


    // $ANTLR start "rule__Loop__Group_20__3__Impl"
    // InternalQuCircuit.g:6222:1: rule__Loop__Group_20__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6226:1: ( ( ')' ) )
            // InternalQuCircuit.g:6227:1: ( ')' )
            {
            // InternalQuCircuit.g:6227:1: ( ')' )
            // InternalQuCircuit.g:6228:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_20_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_20_3()); 

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
    // $ANTLR end "rule__Loop__Group_20__3__Impl"


    // $ANTLR start "rule__Loop__Group_22__0"
    // InternalQuCircuit.g:6238:1: rule__Loop__Group_22__0 : rule__Loop__Group_22__0__Impl rule__Loop__Group_22__1 ;
    public final void rule__Loop__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6242:1: ( rule__Loop__Group_22__0__Impl rule__Loop__Group_22__1 )
            // InternalQuCircuit.g:6243:2: rule__Loop__Group_22__0__Impl rule__Loop__Group_22__1
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__1();

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
    // $ANTLR end "rule__Loop__Group_22__0"


    // $ANTLR start "rule__Loop__Group_22__0__Impl"
    // InternalQuCircuit.g:6250:1: rule__Loop__Group_22__0__Impl : ( 'controlQubits' ) ;
    public final void rule__Loop__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6254:1: ( ( 'controlQubits' ) )
            // InternalQuCircuit.g:6255:1: ( 'controlQubits' )
            {
            // InternalQuCircuit.g:6255:1: ( 'controlQubits' )
            // InternalQuCircuit.g:6256:2: 'controlQubits'
            {
             before(grammarAccess.getLoopAccess().getControlQubitsKeyword_22_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsKeyword_22_0()); 

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
    // $ANTLR end "rule__Loop__Group_22__0__Impl"


    // $ANTLR start "rule__Loop__Group_22__1"
    // InternalQuCircuit.g:6265:1: rule__Loop__Group_22__1 : rule__Loop__Group_22__1__Impl rule__Loop__Group_22__2 ;
    public final void rule__Loop__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6269:1: ( rule__Loop__Group_22__1__Impl rule__Loop__Group_22__2 )
            // InternalQuCircuit.g:6270:2: rule__Loop__Group_22__1__Impl rule__Loop__Group_22__2
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__2();

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
    // $ANTLR end "rule__Loop__Group_22__1"


    // $ANTLR start "rule__Loop__Group_22__1__Impl"
    // InternalQuCircuit.g:6277:1: rule__Loop__Group_22__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6281:1: ( ( '[' ) )
            // InternalQuCircuit.g:6282:1: ( '[' )
            {
            // InternalQuCircuit.g:6282:1: ( '[' )
            // InternalQuCircuit.g:6283:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_22_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_22_1()); 

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
    // $ANTLR end "rule__Loop__Group_22__1__Impl"


    // $ANTLR start "rule__Loop__Group_22__2"
    // InternalQuCircuit.g:6292:1: rule__Loop__Group_22__2 : rule__Loop__Group_22__2__Impl rule__Loop__Group_22__3 ;
    public final void rule__Loop__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6296:1: ( rule__Loop__Group_22__2__Impl rule__Loop__Group_22__3 )
            // InternalQuCircuit.g:6297:2: rule__Loop__Group_22__2__Impl rule__Loop__Group_22__3
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_22__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__3();

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
    // $ANTLR end "rule__Loop__Group_22__2"


    // $ANTLR start "rule__Loop__Group_22__2__Impl"
    // InternalQuCircuit.g:6304:1: rule__Loop__Group_22__2__Impl : ( ( rule__Loop__ControlQubitsAssignment_22_2 ) ) ;
    public final void rule__Loop__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6308:1: ( ( ( rule__Loop__ControlQubitsAssignment_22_2 ) ) )
            // InternalQuCircuit.g:6309:1: ( ( rule__Loop__ControlQubitsAssignment_22_2 ) )
            {
            // InternalQuCircuit.g:6309:1: ( ( rule__Loop__ControlQubitsAssignment_22_2 ) )
            // InternalQuCircuit.g:6310:2: ( rule__Loop__ControlQubitsAssignment_22_2 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_2()); 
            // InternalQuCircuit.g:6311:2: ( rule__Loop__ControlQubitsAssignment_22_2 )
            // InternalQuCircuit.g:6311:3: rule__Loop__ControlQubitsAssignment_22_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsAssignment_22_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_2()); 

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
    // $ANTLR end "rule__Loop__Group_22__2__Impl"


    // $ANTLR start "rule__Loop__Group_22__3"
    // InternalQuCircuit.g:6319:1: rule__Loop__Group_22__3 : rule__Loop__Group_22__3__Impl rule__Loop__Group_22__4 ;
    public final void rule__Loop__Group_22__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6323:1: ( rule__Loop__Group_22__3__Impl rule__Loop__Group_22__4 )
            // InternalQuCircuit.g:6324:2: rule__Loop__Group_22__3__Impl rule__Loop__Group_22__4
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_22__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__4();

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
    // $ANTLR end "rule__Loop__Group_22__3"


    // $ANTLR start "rule__Loop__Group_22__3__Impl"
    // InternalQuCircuit.g:6331:1: rule__Loop__Group_22__3__Impl : ( ( rule__Loop__Group_22_3__0 )* ) ;
    public final void rule__Loop__Group_22__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6335:1: ( ( ( rule__Loop__Group_22_3__0 )* ) )
            // InternalQuCircuit.g:6336:1: ( ( rule__Loop__Group_22_3__0 )* )
            {
            // InternalQuCircuit.g:6336:1: ( ( rule__Loop__Group_22_3__0 )* )
            // InternalQuCircuit.g:6337:2: ( rule__Loop__Group_22_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_22_3()); 
            // InternalQuCircuit.g:6338:2: ( rule__Loop__Group_22_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==24) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalQuCircuit.g:6338:3: rule__Loop__Group_22_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Loop__Group_22_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_22_3()); 

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
    // $ANTLR end "rule__Loop__Group_22__3__Impl"


    // $ANTLR start "rule__Loop__Group_22__4"
    // InternalQuCircuit.g:6346:1: rule__Loop__Group_22__4 : rule__Loop__Group_22__4__Impl ;
    public final void rule__Loop__Group_22__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6350:1: ( rule__Loop__Group_22__4__Impl )
            // InternalQuCircuit.g:6351:2: rule__Loop__Group_22__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_22__4"


    // $ANTLR start "rule__Loop__Group_22__4__Impl"
    // InternalQuCircuit.g:6357:1: rule__Loop__Group_22__4__Impl : ( ']' ) ;
    public final void rule__Loop__Group_22__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6361:1: ( ( ']' ) )
            // InternalQuCircuit.g:6362:1: ( ']' )
            {
            // InternalQuCircuit.g:6362:1: ( ']' )
            // InternalQuCircuit.g:6363:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_22_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_22_4()); 

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
    // $ANTLR end "rule__Loop__Group_22__4__Impl"


    // $ANTLR start "rule__Loop__Group_22_3__0"
    // InternalQuCircuit.g:6373:1: rule__Loop__Group_22_3__0 : rule__Loop__Group_22_3__0__Impl rule__Loop__Group_22_3__1 ;
    public final void rule__Loop__Group_22_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6377:1: ( rule__Loop__Group_22_3__0__Impl rule__Loop__Group_22_3__1 )
            // InternalQuCircuit.g:6378:2: rule__Loop__Group_22_3__0__Impl rule__Loop__Group_22_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_22_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22_3__1();

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
    // $ANTLR end "rule__Loop__Group_22_3__0"


    // $ANTLR start "rule__Loop__Group_22_3__0__Impl"
    // InternalQuCircuit.g:6385:1: rule__Loop__Group_22_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_22_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6389:1: ( ( ',' ) )
            // InternalQuCircuit.g:6390:1: ( ',' )
            {
            // InternalQuCircuit.g:6390:1: ( ',' )
            // InternalQuCircuit.g:6391:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_22_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_22_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_22_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_22_3__1"
    // InternalQuCircuit.g:6400:1: rule__Loop__Group_22_3__1 : rule__Loop__Group_22_3__1__Impl ;
    public final void rule__Loop__Group_22_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6404:1: ( rule__Loop__Group_22_3__1__Impl )
            // InternalQuCircuit.g:6405:2: rule__Loop__Group_22_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_22_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_22_3__1"


    // $ANTLR start "rule__Loop__Group_22_3__1__Impl"
    // InternalQuCircuit.g:6411:1: rule__Loop__Group_22_3__1__Impl : ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) ) ;
    public final void rule__Loop__Group_22_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6415:1: ( ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) ) )
            // InternalQuCircuit.g:6416:1: ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) )
            {
            // InternalQuCircuit.g:6416:1: ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) )
            // InternalQuCircuit.g:6417:2: ( rule__Loop__ControlQubitsAssignment_22_3_1 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_3_1()); 
            // InternalQuCircuit.g:6418:2: ( rule__Loop__ControlQubitsAssignment_22_3_1 )
            // InternalQuCircuit.g:6418:3: rule__Loop__ControlQubitsAssignment_22_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsAssignment_22_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_22_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_23__0"
    // InternalQuCircuit.g:6427:1: rule__Loop__Group_23__0 : rule__Loop__Group_23__0__Impl rule__Loop__Group_23__1 ;
    public final void rule__Loop__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6431:1: ( rule__Loop__Group_23__0__Impl rule__Loop__Group_23__1 )
            // InternalQuCircuit.g:6432:2: rule__Loop__Group_23__0__Impl rule__Loop__Group_23__1
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__1();

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
    // $ANTLR end "rule__Loop__Group_23__0"


    // $ANTLR start "rule__Loop__Group_23__0__Impl"
    // InternalQuCircuit.g:6439:1: rule__Loop__Group_23__0__Impl : ( 'fixedControlQubits' ) ;
    public final void rule__Loop__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6443:1: ( ( 'fixedControlQubits' ) )
            // InternalQuCircuit.g:6444:1: ( 'fixedControlQubits' )
            {
            // InternalQuCircuit.g:6444:1: ( 'fixedControlQubits' )
            // InternalQuCircuit.g:6445:2: 'fixedControlQubits'
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsKeyword_23_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getFixedControlQubitsKeyword_23_0()); 

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
    // $ANTLR end "rule__Loop__Group_23__0__Impl"


    // $ANTLR start "rule__Loop__Group_23__1"
    // InternalQuCircuit.g:6454:1: rule__Loop__Group_23__1 : rule__Loop__Group_23__1__Impl rule__Loop__Group_23__2 ;
    public final void rule__Loop__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6458:1: ( rule__Loop__Group_23__1__Impl rule__Loop__Group_23__2 )
            // InternalQuCircuit.g:6459:2: rule__Loop__Group_23__1__Impl rule__Loop__Group_23__2
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__2();

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
    // $ANTLR end "rule__Loop__Group_23__1"


    // $ANTLR start "rule__Loop__Group_23__1__Impl"
    // InternalQuCircuit.g:6466:1: rule__Loop__Group_23__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6470:1: ( ( '[' ) )
            // InternalQuCircuit.g:6471:1: ( '[' )
            {
            // InternalQuCircuit.g:6471:1: ( '[' )
            // InternalQuCircuit.g:6472:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_23_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_23_1()); 

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
    // $ANTLR end "rule__Loop__Group_23__1__Impl"


    // $ANTLR start "rule__Loop__Group_23__2"
    // InternalQuCircuit.g:6481:1: rule__Loop__Group_23__2 : rule__Loop__Group_23__2__Impl rule__Loop__Group_23__3 ;
    public final void rule__Loop__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6485:1: ( rule__Loop__Group_23__2__Impl rule__Loop__Group_23__3 )
            // InternalQuCircuit.g:6486:2: rule__Loop__Group_23__2__Impl rule__Loop__Group_23__3
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__3();

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
    // $ANTLR end "rule__Loop__Group_23__2"


    // $ANTLR start "rule__Loop__Group_23__2__Impl"
    // InternalQuCircuit.g:6493:1: rule__Loop__Group_23__2__Impl : ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) ) ;
    public final void rule__Loop__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6497:1: ( ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) ) )
            // InternalQuCircuit.g:6498:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) )
            {
            // InternalQuCircuit.g:6498:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) )
            // InternalQuCircuit.g:6499:2: ( rule__Loop__FixedControlQubitsAssignment_23_2 )
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_2()); 
            // InternalQuCircuit.g:6500:2: ( rule__Loop__FixedControlQubitsAssignment_23_2 )
            // InternalQuCircuit.g:6500:3: rule__Loop__FixedControlQubitsAssignment_23_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedControlQubitsAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_2()); 

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
    // $ANTLR end "rule__Loop__Group_23__2__Impl"


    // $ANTLR start "rule__Loop__Group_23__3"
    // InternalQuCircuit.g:6508:1: rule__Loop__Group_23__3 : rule__Loop__Group_23__3__Impl rule__Loop__Group_23__4 ;
    public final void rule__Loop__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6512:1: ( rule__Loop__Group_23__3__Impl rule__Loop__Group_23__4 )
            // InternalQuCircuit.g:6513:2: rule__Loop__Group_23__3__Impl rule__Loop__Group_23__4
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_23__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__4();

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
    // $ANTLR end "rule__Loop__Group_23__3"


    // $ANTLR start "rule__Loop__Group_23__3__Impl"
    // InternalQuCircuit.g:6520:1: rule__Loop__Group_23__3__Impl : ( ( rule__Loop__Group_23_3__0 )* ) ;
    public final void rule__Loop__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6524:1: ( ( ( rule__Loop__Group_23_3__0 )* ) )
            // InternalQuCircuit.g:6525:1: ( ( rule__Loop__Group_23_3__0 )* )
            {
            // InternalQuCircuit.g:6525:1: ( ( rule__Loop__Group_23_3__0 )* )
            // InternalQuCircuit.g:6526:2: ( rule__Loop__Group_23_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_23_3()); 
            // InternalQuCircuit.g:6527:2: ( rule__Loop__Group_23_3__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==24) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalQuCircuit.g:6527:3: rule__Loop__Group_23_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Loop__Group_23_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_23_3()); 

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
    // $ANTLR end "rule__Loop__Group_23__3__Impl"


    // $ANTLR start "rule__Loop__Group_23__4"
    // InternalQuCircuit.g:6535:1: rule__Loop__Group_23__4 : rule__Loop__Group_23__4__Impl ;
    public final void rule__Loop__Group_23__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6539:1: ( rule__Loop__Group_23__4__Impl )
            // InternalQuCircuit.g:6540:2: rule__Loop__Group_23__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_23__4"


    // $ANTLR start "rule__Loop__Group_23__4__Impl"
    // InternalQuCircuit.g:6546:1: rule__Loop__Group_23__4__Impl : ( ']' ) ;
    public final void rule__Loop__Group_23__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6550:1: ( ( ']' ) )
            // InternalQuCircuit.g:6551:1: ( ']' )
            {
            // InternalQuCircuit.g:6551:1: ( ']' )
            // InternalQuCircuit.g:6552:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_23_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_23_4()); 

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
    // $ANTLR end "rule__Loop__Group_23__4__Impl"


    // $ANTLR start "rule__Loop__Group_23_3__0"
    // InternalQuCircuit.g:6562:1: rule__Loop__Group_23_3__0 : rule__Loop__Group_23_3__0__Impl rule__Loop__Group_23_3__1 ;
    public final void rule__Loop__Group_23_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6566:1: ( rule__Loop__Group_23_3__0__Impl rule__Loop__Group_23_3__1 )
            // InternalQuCircuit.g:6567:2: rule__Loop__Group_23_3__0__Impl rule__Loop__Group_23_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_23_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23_3__1();

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
    // $ANTLR end "rule__Loop__Group_23_3__0"


    // $ANTLR start "rule__Loop__Group_23_3__0__Impl"
    // InternalQuCircuit.g:6574:1: rule__Loop__Group_23_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_23_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6578:1: ( ( ',' ) )
            // InternalQuCircuit.g:6579:1: ( ',' )
            {
            // InternalQuCircuit.g:6579:1: ( ',' )
            // InternalQuCircuit.g:6580:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_23_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_23_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_23_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_23_3__1"
    // InternalQuCircuit.g:6589:1: rule__Loop__Group_23_3__1 : rule__Loop__Group_23_3__1__Impl ;
    public final void rule__Loop__Group_23_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6593:1: ( rule__Loop__Group_23_3__1__Impl )
            // InternalQuCircuit.g:6594:2: rule__Loop__Group_23_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_23_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_23_3__1"


    // $ANTLR start "rule__Loop__Group_23_3__1__Impl"
    // InternalQuCircuit.g:6600:1: rule__Loop__Group_23_3__1__Impl : ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) ) ;
    public final void rule__Loop__Group_23_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6604:1: ( ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) ) )
            // InternalQuCircuit.g:6605:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) )
            {
            // InternalQuCircuit.g:6605:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) )
            // InternalQuCircuit.g:6606:2: ( rule__Loop__FixedControlQubitsAssignment_23_3_1 )
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_3_1()); 
            // InternalQuCircuit.g:6607:2: ( rule__Loop__FixedControlQubitsAssignment_23_3_1 )
            // InternalQuCircuit.g:6607:3: rule__Loop__FixedControlQubitsAssignment_23_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedControlQubitsAssignment_23_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_23_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_24__0"
    // InternalQuCircuit.g:6616:1: rule__Loop__Group_24__0 : rule__Loop__Group_24__0__Impl rule__Loop__Group_24__1 ;
    public final void rule__Loop__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6620:1: ( rule__Loop__Group_24__0__Impl rule__Loop__Group_24__1 )
            // InternalQuCircuit.g:6621:2: rule__Loop__Group_24__0__Impl rule__Loop__Group_24__1
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__1();

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
    // $ANTLR end "rule__Loop__Group_24__0"


    // $ANTLR start "rule__Loop__Group_24__0__Impl"
    // InternalQuCircuit.g:6628:1: rule__Loop__Group_24__0__Impl : ( 'fixedTargetQubits' ) ;
    public final void rule__Loop__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6632:1: ( ( 'fixedTargetQubits' ) )
            // InternalQuCircuit.g:6633:1: ( 'fixedTargetQubits' )
            {
            // InternalQuCircuit.g:6633:1: ( 'fixedTargetQubits' )
            // InternalQuCircuit.g:6634:2: 'fixedTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsKeyword_24_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getFixedTargetQubitsKeyword_24_0()); 

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
    // $ANTLR end "rule__Loop__Group_24__0__Impl"


    // $ANTLR start "rule__Loop__Group_24__1"
    // InternalQuCircuit.g:6643:1: rule__Loop__Group_24__1 : rule__Loop__Group_24__1__Impl rule__Loop__Group_24__2 ;
    public final void rule__Loop__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6647:1: ( rule__Loop__Group_24__1__Impl rule__Loop__Group_24__2 )
            // InternalQuCircuit.g:6648:2: rule__Loop__Group_24__1__Impl rule__Loop__Group_24__2
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_24__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__2();

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
    // $ANTLR end "rule__Loop__Group_24__1"


    // $ANTLR start "rule__Loop__Group_24__1__Impl"
    // InternalQuCircuit.g:6655:1: rule__Loop__Group_24__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6659:1: ( ( '[' ) )
            // InternalQuCircuit.g:6660:1: ( '[' )
            {
            // InternalQuCircuit.g:6660:1: ( '[' )
            // InternalQuCircuit.g:6661:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_24_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_24_1()); 

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
    // $ANTLR end "rule__Loop__Group_24__1__Impl"


    // $ANTLR start "rule__Loop__Group_24__2"
    // InternalQuCircuit.g:6670:1: rule__Loop__Group_24__2 : rule__Loop__Group_24__2__Impl rule__Loop__Group_24__3 ;
    public final void rule__Loop__Group_24__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6674:1: ( rule__Loop__Group_24__2__Impl rule__Loop__Group_24__3 )
            // InternalQuCircuit.g:6675:2: rule__Loop__Group_24__2__Impl rule__Loop__Group_24__3
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_24__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__3();

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
    // $ANTLR end "rule__Loop__Group_24__2"


    // $ANTLR start "rule__Loop__Group_24__2__Impl"
    // InternalQuCircuit.g:6682:1: rule__Loop__Group_24__2__Impl : ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) ) ;
    public final void rule__Loop__Group_24__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6686:1: ( ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) ) )
            // InternalQuCircuit.g:6687:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) )
            {
            // InternalQuCircuit.g:6687:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) )
            // InternalQuCircuit.g:6688:2: ( rule__Loop__FixedTargetQubitsAssignment_24_2 )
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_2()); 
            // InternalQuCircuit.g:6689:2: ( rule__Loop__FixedTargetQubitsAssignment_24_2 )
            // InternalQuCircuit.g:6689:3: rule__Loop__FixedTargetQubitsAssignment_24_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedTargetQubitsAssignment_24_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_2()); 

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
    // $ANTLR end "rule__Loop__Group_24__2__Impl"


    // $ANTLR start "rule__Loop__Group_24__3"
    // InternalQuCircuit.g:6697:1: rule__Loop__Group_24__3 : rule__Loop__Group_24__3__Impl rule__Loop__Group_24__4 ;
    public final void rule__Loop__Group_24__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6701:1: ( rule__Loop__Group_24__3__Impl rule__Loop__Group_24__4 )
            // InternalQuCircuit.g:6702:2: rule__Loop__Group_24__3__Impl rule__Loop__Group_24__4
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_24__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__4();

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
    // $ANTLR end "rule__Loop__Group_24__3"


    // $ANTLR start "rule__Loop__Group_24__3__Impl"
    // InternalQuCircuit.g:6709:1: rule__Loop__Group_24__3__Impl : ( ( rule__Loop__Group_24_3__0 )* ) ;
    public final void rule__Loop__Group_24__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6713:1: ( ( ( rule__Loop__Group_24_3__0 )* ) )
            // InternalQuCircuit.g:6714:1: ( ( rule__Loop__Group_24_3__0 )* )
            {
            // InternalQuCircuit.g:6714:1: ( ( rule__Loop__Group_24_3__0 )* )
            // InternalQuCircuit.g:6715:2: ( rule__Loop__Group_24_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_24_3()); 
            // InternalQuCircuit.g:6716:2: ( rule__Loop__Group_24_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==24) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalQuCircuit.g:6716:3: rule__Loop__Group_24_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Loop__Group_24_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_24_3()); 

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
    // $ANTLR end "rule__Loop__Group_24__3__Impl"


    // $ANTLR start "rule__Loop__Group_24__4"
    // InternalQuCircuit.g:6724:1: rule__Loop__Group_24__4 : rule__Loop__Group_24__4__Impl ;
    public final void rule__Loop__Group_24__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6728:1: ( rule__Loop__Group_24__4__Impl )
            // InternalQuCircuit.g:6729:2: rule__Loop__Group_24__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_24__4"


    // $ANTLR start "rule__Loop__Group_24__4__Impl"
    // InternalQuCircuit.g:6735:1: rule__Loop__Group_24__4__Impl : ( ']' ) ;
    public final void rule__Loop__Group_24__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6739:1: ( ( ']' ) )
            // InternalQuCircuit.g:6740:1: ( ']' )
            {
            // InternalQuCircuit.g:6740:1: ( ']' )
            // InternalQuCircuit.g:6741:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_24_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_24_4()); 

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
    // $ANTLR end "rule__Loop__Group_24__4__Impl"


    // $ANTLR start "rule__Loop__Group_24_3__0"
    // InternalQuCircuit.g:6751:1: rule__Loop__Group_24_3__0 : rule__Loop__Group_24_3__0__Impl rule__Loop__Group_24_3__1 ;
    public final void rule__Loop__Group_24_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6755:1: ( rule__Loop__Group_24_3__0__Impl rule__Loop__Group_24_3__1 )
            // InternalQuCircuit.g:6756:2: rule__Loop__Group_24_3__0__Impl rule__Loop__Group_24_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_24_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24_3__1();

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
    // $ANTLR end "rule__Loop__Group_24_3__0"


    // $ANTLR start "rule__Loop__Group_24_3__0__Impl"
    // InternalQuCircuit.g:6763:1: rule__Loop__Group_24_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_24_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6767:1: ( ( ',' ) )
            // InternalQuCircuit.g:6768:1: ( ',' )
            {
            // InternalQuCircuit.g:6768:1: ( ',' )
            // InternalQuCircuit.g:6769:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_24_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_24_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_24_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_24_3__1"
    // InternalQuCircuit.g:6778:1: rule__Loop__Group_24_3__1 : rule__Loop__Group_24_3__1__Impl ;
    public final void rule__Loop__Group_24_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6782:1: ( rule__Loop__Group_24_3__1__Impl )
            // InternalQuCircuit.g:6783:2: rule__Loop__Group_24_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_24_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_24_3__1"


    // $ANTLR start "rule__Loop__Group_24_3__1__Impl"
    // InternalQuCircuit.g:6789:1: rule__Loop__Group_24_3__1__Impl : ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) ) ;
    public final void rule__Loop__Group_24_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6793:1: ( ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) ) )
            // InternalQuCircuit.g:6794:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) )
            {
            // InternalQuCircuit.g:6794:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) )
            // InternalQuCircuit.g:6795:2: ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 )
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_3_1()); 
            // InternalQuCircuit.g:6796:2: ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 )
            // InternalQuCircuit.g:6796:3: rule__Loop__FixedTargetQubitsAssignment_24_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedTargetQubitsAssignment_24_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_24_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_32__0"
    // InternalQuCircuit.g:6805:1: rule__Loop__Group_32__0 : rule__Loop__Group_32__0__Impl rule__Loop__Group_32__1 ;
    public final void rule__Loop__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6809:1: ( rule__Loop__Group_32__0__Impl rule__Loop__Group_32__1 )
            // InternalQuCircuit.g:6810:2: rule__Loop__Group_32__0__Impl rule__Loop__Group_32__1
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group_32__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__1();

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
    // $ANTLR end "rule__Loop__Group_32__0"


    // $ANTLR start "rule__Loop__Group_32__0__Impl"
    // InternalQuCircuit.g:6817:1: rule__Loop__Group_32__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6821:1: ( ( ',' ) )
            // InternalQuCircuit.g:6822:1: ( ',' )
            {
            // InternalQuCircuit.g:6822:1: ( ',' )
            // InternalQuCircuit.g:6823:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_32_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_32_0()); 

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
    // $ANTLR end "rule__Loop__Group_32__0__Impl"


    // $ANTLR start "rule__Loop__Group_32__1"
    // InternalQuCircuit.g:6832:1: rule__Loop__Group_32__1 : rule__Loop__Group_32__1__Impl rule__Loop__Group_32__2 ;
    public final void rule__Loop__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6836:1: ( rule__Loop__Group_32__1__Impl rule__Loop__Group_32__2 )
            // InternalQuCircuit.g:6837:2: rule__Loop__Group_32__1__Impl rule__Loop__Group_32__2
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_32__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__2();

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
    // $ANTLR end "rule__Loop__Group_32__1"


    // $ANTLR start "rule__Loop__Group_32__1__Impl"
    // InternalQuCircuit.g:6844:1: rule__Loop__Group_32__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6848:1: ( ( '(' ) )
            // InternalQuCircuit.g:6849:1: ( '(' )
            {
            // InternalQuCircuit.g:6849:1: ( '(' )
            // InternalQuCircuit.g:6850:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_32_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_32_1()); 

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
    // $ANTLR end "rule__Loop__Group_32__1__Impl"


    // $ANTLR start "rule__Loop__Group_32__2"
    // InternalQuCircuit.g:6859:1: rule__Loop__Group_32__2 : rule__Loop__Group_32__2__Impl rule__Loop__Group_32__3 ;
    public final void rule__Loop__Group_32__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6863:1: ( rule__Loop__Group_32__2__Impl rule__Loop__Group_32__3 )
            // InternalQuCircuit.g:6864:2: rule__Loop__Group_32__2__Impl rule__Loop__Group_32__3
            {
            pushFollow(FOLLOW_27);
            rule__Loop__Group_32__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__3();

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
    // $ANTLR end "rule__Loop__Group_32__2"


    // $ANTLR start "rule__Loop__Group_32__2__Impl"
    // InternalQuCircuit.g:6871:1: rule__Loop__Group_32__2__Impl : ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) ) ;
    public final void rule__Loop__Group_32__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6875:1: ( ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) ) )
            // InternalQuCircuit.g:6876:1: ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) )
            {
            // InternalQuCircuit.g:6876:1: ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) )
            // InternalQuCircuit.g:6877:2: ( rule__Loop__LoopTargetQubitsAssignment_32_2 )
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_32_2()); 
            // InternalQuCircuit.g:6878:2: ( rule__Loop__LoopTargetQubitsAssignment_32_2 )
            // InternalQuCircuit.g:6878:3: rule__Loop__LoopTargetQubitsAssignment_32_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopTargetQubitsAssignment_32_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_32_2()); 

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
    // $ANTLR end "rule__Loop__Group_32__2__Impl"


    // $ANTLR start "rule__Loop__Group_32__3"
    // InternalQuCircuit.g:6886:1: rule__Loop__Group_32__3 : rule__Loop__Group_32__3__Impl ;
    public final void rule__Loop__Group_32__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6890:1: ( rule__Loop__Group_32__3__Impl )
            // InternalQuCircuit.g:6891:2: rule__Loop__Group_32__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__3__Impl();

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
    // $ANTLR end "rule__Loop__Group_32__3"


    // $ANTLR start "rule__Loop__Group_32__3__Impl"
    // InternalQuCircuit.g:6897:1: rule__Loop__Group_32__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group_32__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6901:1: ( ( ')' ) )
            // InternalQuCircuit.g:6902:1: ( ')' )
            {
            // InternalQuCircuit.g:6902:1: ( ')' )
            // InternalQuCircuit.g:6903:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_32_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_32_3()); 

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
    // $ANTLR end "rule__Loop__Group_32__3__Impl"


    // $ANTLR start "rule__Loop__Group_34__0"
    // InternalQuCircuit.g:6913:1: rule__Loop__Group_34__0 : rule__Loop__Group_34__0__Impl rule__Loop__Group_34__1 ;
    public final void rule__Loop__Group_34__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6917:1: ( rule__Loop__Group_34__0__Impl rule__Loop__Group_34__1 )
            // InternalQuCircuit.g:6918:2: rule__Loop__Group_34__0__Impl rule__Loop__Group_34__1
            {
            pushFollow(FOLLOW_20);
            rule__Loop__Group_34__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__1();

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
    // $ANTLR end "rule__Loop__Group_34__0"


    // $ANTLR start "rule__Loop__Group_34__0__Impl"
    // InternalQuCircuit.g:6925:1: rule__Loop__Group_34__0__Impl : ( 'loopControlQubits' ) ;
    public final void rule__Loop__Group_34__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6929:1: ( ( 'loopControlQubits' ) )
            // InternalQuCircuit.g:6930:1: ( 'loopControlQubits' )
            {
            // InternalQuCircuit.g:6930:1: ( 'loopControlQubits' )
            // InternalQuCircuit.g:6931:2: 'loopControlQubits'
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsKeyword_34_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopControlQubitsKeyword_34_0()); 

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
    // $ANTLR end "rule__Loop__Group_34__0__Impl"


    // $ANTLR start "rule__Loop__Group_34__1"
    // InternalQuCircuit.g:6940:1: rule__Loop__Group_34__1 : rule__Loop__Group_34__1__Impl rule__Loop__Group_34__2 ;
    public final void rule__Loop__Group_34__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6944:1: ( rule__Loop__Group_34__1__Impl rule__Loop__Group_34__2 )
            // InternalQuCircuit.g:6945:2: rule__Loop__Group_34__1__Impl rule__Loop__Group_34__2
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group_34__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__2();

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
    // $ANTLR end "rule__Loop__Group_34__1"


    // $ANTLR start "rule__Loop__Group_34__1__Impl"
    // InternalQuCircuit.g:6952:1: rule__Loop__Group_34__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_34__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6956:1: ( ( '[' ) )
            // InternalQuCircuit.g:6957:1: ( '[' )
            {
            // InternalQuCircuit.g:6957:1: ( '[' )
            // InternalQuCircuit.g:6958:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_34_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_34_1()); 

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
    // $ANTLR end "rule__Loop__Group_34__1__Impl"


    // $ANTLR start "rule__Loop__Group_34__2"
    // InternalQuCircuit.g:6967:1: rule__Loop__Group_34__2 : rule__Loop__Group_34__2__Impl rule__Loop__Group_34__3 ;
    public final void rule__Loop__Group_34__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6971:1: ( rule__Loop__Group_34__2__Impl rule__Loop__Group_34__3 )
            // InternalQuCircuit.g:6972:2: rule__Loop__Group_34__2__Impl rule__Loop__Group_34__3
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_34__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__3();

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
    // $ANTLR end "rule__Loop__Group_34__2"


    // $ANTLR start "rule__Loop__Group_34__2__Impl"
    // InternalQuCircuit.g:6979:1: rule__Loop__Group_34__2__Impl : ( '(' ) ;
    public final void rule__Loop__Group_34__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6983:1: ( ( '(' ) )
            // InternalQuCircuit.g:6984:1: ( '(' )
            {
            // InternalQuCircuit.g:6984:1: ( '(' )
            // InternalQuCircuit.g:6985:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_2()); 

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
    // $ANTLR end "rule__Loop__Group_34__2__Impl"


    // $ANTLR start "rule__Loop__Group_34__3"
    // InternalQuCircuit.g:6994:1: rule__Loop__Group_34__3 : rule__Loop__Group_34__3__Impl rule__Loop__Group_34__4 ;
    public final void rule__Loop__Group_34__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6998:1: ( rule__Loop__Group_34__3__Impl rule__Loop__Group_34__4 )
            // InternalQuCircuit.g:6999:2: rule__Loop__Group_34__3__Impl rule__Loop__Group_34__4
            {
            pushFollow(FOLLOW_27);
            rule__Loop__Group_34__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__4();

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
    // $ANTLR end "rule__Loop__Group_34__3"


    // $ANTLR start "rule__Loop__Group_34__3__Impl"
    // InternalQuCircuit.g:7006:1: rule__Loop__Group_34__3__Impl : ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) ) ;
    public final void rule__Loop__Group_34__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7010:1: ( ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) ) )
            // InternalQuCircuit.g:7011:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) )
            {
            // InternalQuCircuit.g:7011:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) )
            // InternalQuCircuit.g:7012:2: ( rule__Loop__LoopControlQubitsAssignment_34_3 )
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_3()); 
            // InternalQuCircuit.g:7013:2: ( rule__Loop__LoopControlQubitsAssignment_34_3 )
            // InternalQuCircuit.g:7013:3: rule__Loop__LoopControlQubitsAssignment_34_3
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopControlQubitsAssignment_34_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_3()); 

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
    // $ANTLR end "rule__Loop__Group_34__3__Impl"


    // $ANTLR start "rule__Loop__Group_34__4"
    // InternalQuCircuit.g:7021:1: rule__Loop__Group_34__4 : rule__Loop__Group_34__4__Impl rule__Loop__Group_34__5 ;
    public final void rule__Loop__Group_34__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7025:1: ( rule__Loop__Group_34__4__Impl rule__Loop__Group_34__5 )
            // InternalQuCircuit.g:7026:2: rule__Loop__Group_34__4__Impl rule__Loop__Group_34__5
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_34__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__5();

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
    // $ANTLR end "rule__Loop__Group_34__4"


    // $ANTLR start "rule__Loop__Group_34__4__Impl"
    // InternalQuCircuit.g:7033:1: rule__Loop__Group_34__4__Impl : ( ')' ) ;
    public final void rule__Loop__Group_34__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7037:1: ( ( ')' ) )
            // InternalQuCircuit.g:7038:1: ( ')' )
            {
            // InternalQuCircuit.g:7038:1: ( ')' )
            // InternalQuCircuit.g:7039:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_4()); 

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
    // $ANTLR end "rule__Loop__Group_34__4__Impl"


    // $ANTLR start "rule__Loop__Group_34__5"
    // InternalQuCircuit.g:7048:1: rule__Loop__Group_34__5 : rule__Loop__Group_34__5__Impl rule__Loop__Group_34__6 ;
    public final void rule__Loop__Group_34__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7052:1: ( rule__Loop__Group_34__5__Impl rule__Loop__Group_34__6 )
            // InternalQuCircuit.g:7053:2: rule__Loop__Group_34__5__Impl rule__Loop__Group_34__6
            {
            pushFollow(FOLLOW_22);
            rule__Loop__Group_34__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__6();

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
    // $ANTLR end "rule__Loop__Group_34__5"


    // $ANTLR start "rule__Loop__Group_34__5__Impl"
    // InternalQuCircuit.g:7060:1: rule__Loop__Group_34__5__Impl : ( ( rule__Loop__Group_34_5__0 )* ) ;
    public final void rule__Loop__Group_34__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7064:1: ( ( ( rule__Loop__Group_34_5__0 )* ) )
            // InternalQuCircuit.g:7065:1: ( ( rule__Loop__Group_34_5__0 )* )
            {
            // InternalQuCircuit.g:7065:1: ( ( rule__Loop__Group_34_5__0 )* )
            // InternalQuCircuit.g:7066:2: ( rule__Loop__Group_34_5__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_34_5()); 
            // InternalQuCircuit.g:7067:2: ( rule__Loop__Group_34_5__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==24) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalQuCircuit.g:7067:3: rule__Loop__Group_34_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Loop__Group_34_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_34_5()); 

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
    // $ANTLR end "rule__Loop__Group_34__5__Impl"


    // $ANTLR start "rule__Loop__Group_34__6"
    // InternalQuCircuit.g:7075:1: rule__Loop__Group_34__6 : rule__Loop__Group_34__6__Impl ;
    public final void rule__Loop__Group_34__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7079:1: ( rule__Loop__Group_34__6__Impl )
            // InternalQuCircuit.g:7080:2: rule__Loop__Group_34__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__6__Impl();

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
    // $ANTLR end "rule__Loop__Group_34__6"


    // $ANTLR start "rule__Loop__Group_34__6__Impl"
    // InternalQuCircuit.g:7086:1: rule__Loop__Group_34__6__Impl : ( ']' ) ;
    public final void rule__Loop__Group_34__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7090:1: ( ( ']' ) )
            // InternalQuCircuit.g:7091:1: ( ']' )
            {
            // InternalQuCircuit.g:7091:1: ( ']' )
            // InternalQuCircuit.g:7092:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_34_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_34_6()); 

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
    // $ANTLR end "rule__Loop__Group_34__6__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__0"
    // InternalQuCircuit.g:7102:1: rule__Loop__Group_34_5__0 : rule__Loop__Group_34_5__0__Impl rule__Loop__Group_34_5__1 ;
    public final void rule__Loop__Group_34_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7106:1: ( rule__Loop__Group_34_5__0__Impl rule__Loop__Group_34_5__1 )
            // InternalQuCircuit.g:7107:2: rule__Loop__Group_34_5__0__Impl rule__Loop__Group_34_5__1
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group_34_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__1();

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
    // $ANTLR end "rule__Loop__Group_34_5__0"


    // $ANTLR start "rule__Loop__Group_34_5__0__Impl"
    // InternalQuCircuit.g:7114:1: rule__Loop__Group_34_5__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_34_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7118:1: ( ( ',' ) )
            // InternalQuCircuit.g:7119:1: ( ',' )
            {
            // InternalQuCircuit.g:7119:1: ( ',' )
            // InternalQuCircuit.g:7120:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_34_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_34_5_0()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__0__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__1"
    // InternalQuCircuit.g:7129:1: rule__Loop__Group_34_5__1 : rule__Loop__Group_34_5__1__Impl rule__Loop__Group_34_5__2 ;
    public final void rule__Loop__Group_34_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7133:1: ( rule__Loop__Group_34_5__1__Impl rule__Loop__Group_34_5__2 )
            // InternalQuCircuit.g:7134:2: rule__Loop__Group_34_5__1__Impl rule__Loop__Group_34_5__2
            {
            pushFollow(FOLLOW_21);
            rule__Loop__Group_34_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__2();

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
    // $ANTLR end "rule__Loop__Group_34_5__1"


    // $ANTLR start "rule__Loop__Group_34_5__1__Impl"
    // InternalQuCircuit.g:7141:1: rule__Loop__Group_34_5__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_34_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7145:1: ( ( '(' ) )
            // InternalQuCircuit.g:7146:1: ( '(' )
            {
            // InternalQuCircuit.g:7146:1: ( '(' )
            // InternalQuCircuit.g:7147:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_5_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_5_1()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__1__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__2"
    // InternalQuCircuit.g:7156:1: rule__Loop__Group_34_5__2 : rule__Loop__Group_34_5__2__Impl rule__Loop__Group_34_5__3 ;
    public final void rule__Loop__Group_34_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7160:1: ( rule__Loop__Group_34_5__2__Impl rule__Loop__Group_34_5__3 )
            // InternalQuCircuit.g:7161:2: rule__Loop__Group_34_5__2__Impl rule__Loop__Group_34_5__3
            {
            pushFollow(FOLLOW_27);
            rule__Loop__Group_34_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__3();

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
    // $ANTLR end "rule__Loop__Group_34_5__2"


    // $ANTLR start "rule__Loop__Group_34_5__2__Impl"
    // InternalQuCircuit.g:7168:1: rule__Loop__Group_34_5__2__Impl : ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) ) ;
    public final void rule__Loop__Group_34_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7172:1: ( ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) ) )
            // InternalQuCircuit.g:7173:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) )
            {
            // InternalQuCircuit.g:7173:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) )
            // InternalQuCircuit.g:7174:2: ( rule__Loop__LoopControlQubitsAssignment_34_5_2 )
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_5_2()); 
            // InternalQuCircuit.g:7175:2: ( rule__Loop__LoopControlQubitsAssignment_34_5_2 )
            // InternalQuCircuit.g:7175:3: rule__Loop__LoopControlQubitsAssignment_34_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopControlQubitsAssignment_34_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_5_2()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__2__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__3"
    // InternalQuCircuit.g:7183:1: rule__Loop__Group_34_5__3 : rule__Loop__Group_34_5__3__Impl ;
    public final void rule__Loop__Group_34_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7187:1: ( rule__Loop__Group_34_5__3__Impl )
            // InternalQuCircuit.g:7188:2: rule__Loop__Group_34_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__3__Impl();

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
    // $ANTLR end "rule__Loop__Group_34_5__3"


    // $ANTLR start "rule__Loop__Group_34_5__3__Impl"
    // InternalQuCircuit.g:7194:1: rule__Loop__Group_34_5__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group_34_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7198:1: ( ( ')' ) )
            // InternalQuCircuit.g:7199:1: ( ')' )
            {
            // InternalQuCircuit.g:7199:1: ( ')' )
            // InternalQuCircuit.g:7200:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_5_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_5_3()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalQuCircuit.g:7210:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7214:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalQuCircuit.g:7215:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalQuCircuit.g:7222:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__OperationAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7226:1: ( ( ( rule__Operation__OperationAssignment_0 ) ) )
            // InternalQuCircuit.g:7227:1: ( ( rule__Operation__OperationAssignment_0 ) )
            {
            // InternalQuCircuit.g:7227:1: ( ( rule__Operation__OperationAssignment_0 ) )
            // InternalQuCircuit.g:7228:2: ( rule__Operation__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getOperationAssignment_0()); 
            // InternalQuCircuit.g:7229:2: ( rule__Operation__OperationAssignment_0 )
            // InternalQuCircuit.g:7229:3: rule__Operation__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperationAssignment_0()); 

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
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalQuCircuit.g:7237:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7241:1: ( rule__Operation__Group__1__Impl )
            // InternalQuCircuit.g:7242:2: rule__Operation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__1__Impl();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalQuCircuit.g:7248:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__Group_1__0 )? ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7252:1: ( ( ( rule__Operation__Group_1__0 )? ) )
            // InternalQuCircuit.g:7253:1: ( ( rule__Operation__Group_1__0 )? )
            {
            // InternalQuCircuit.g:7253:1: ( ( rule__Operation__Group_1__0 )? )
            // InternalQuCircuit.g:7254:2: ( rule__Operation__Group_1__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_1()); 
            // InternalQuCircuit.g:7255:2: ( rule__Operation__Group_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalQuCircuit.g:7255:3: rule__Operation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group_1__0"
    // InternalQuCircuit.g:7264:1: rule__Operation__Group_1__0 : rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 ;
    public final void rule__Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7268:1: ( rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 )
            // InternalQuCircuit.g:7269:2: rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__1();

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
    // $ANTLR end "rule__Operation__Group_1__0"


    // $ANTLR start "rule__Operation__Group_1__0__Impl"
    // InternalQuCircuit.g:7276:1: rule__Operation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7280:1: ( ( '(' ) )
            // InternalQuCircuit.g:7281:1: ( '(' )
            {
            // InternalQuCircuit.g:7281:1: ( '(' )
            // InternalQuCircuit.g:7282:2: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Operation__Group_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_1__1"
    // InternalQuCircuit.g:7291:1: rule__Operation__Group_1__1 : rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 ;
    public final void rule__Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7295:1: ( rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 )
            // InternalQuCircuit.g:7296:2: rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__2();

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
    // $ANTLR end "rule__Operation__Group_1__1"


    // $ANTLR start "rule__Operation__Group_1__1__Impl"
    // InternalQuCircuit.g:7303:1: rule__Operation__Group_1__1__Impl : ( ( rule__Operation__QuboAssignment_1_1 ) ) ;
    public final void rule__Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7307:1: ( ( ( rule__Operation__QuboAssignment_1_1 ) ) )
            // InternalQuCircuit.g:7308:1: ( ( rule__Operation__QuboAssignment_1_1 ) )
            {
            // InternalQuCircuit.g:7308:1: ( ( rule__Operation__QuboAssignment_1_1 ) )
            // InternalQuCircuit.g:7309:2: ( rule__Operation__QuboAssignment_1_1 )
            {
             before(grammarAccess.getOperationAccess().getQuboAssignment_1_1()); 
            // InternalQuCircuit.g:7310:2: ( rule__Operation__QuboAssignment_1_1 )
            // InternalQuCircuit.g:7310:3: rule__Operation__QuboAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__QuboAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getQuboAssignment_1_1()); 

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
    // $ANTLR end "rule__Operation__Group_1__1__Impl"


    // $ANTLR start "rule__Operation__Group_1__2"
    // InternalQuCircuit.g:7318:1: rule__Operation__Group_1__2 : rule__Operation__Group_1__2__Impl ;
    public final void rule__Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7322:1: ( rule__Operation__Group_1__2__Impl )
            // InternalQuCircuit.g:7323:2: rule__Operation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__2__Impl();

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
    // $ANTLR end "rule__Operation__Group_1__2"


    // $ANTLR start "rule__Operation__Group_1__2__Impl"
    // InternalQuCircuit.g:7329:1: rule__Operation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7333:1: ( ( ')' ) )
            // InternalQuCircuit.g:7334:1: ( ')' )
            {
            // InternalQuCircuit.g:7334:1: ( ')' )
            // InternalQuCircuit.g:7335:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Operation__Group_1__2__Impl"


    // $ANTLR start "rule__ElementSelector__Group__0"
    // InternalQuCircuit.g:7345:1: rule__ElementSelector__Group__0 : rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 ;
    public final void rule__ElementSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7349:1: ( rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 )
            // InternalQuCircuit.g:7350:2: rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ElementSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__1();

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
    // $ANTLR end "rule__ElementSelector__Group__0"


    // $ANTLR start "rule__ElementSelector__Group__0__Impl"
    // InternalQuCircuit.g:7357:1: rule__ElementSelector__Group__0__Impl : ( () ) ;
    public final void rule__ElementSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7361:1: ( ( () ) )
            // InternalQuCircuit.g:7362:1: ( () )
            {
            // InternalQuCircuit.g:7362:1: ( () )
            // InternalQuCircuit.g:7363:2: ()
            {
             before(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 
            // InternalQuCircuit.g:7364:2: ()
            // InternalQuCircuit.g:7364:3: 
            {
            }

             after(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__0__Impl"


    // $ANTLR start "rule__ElementSelector__Group__1"
    // InternalQuCircuit.g:7372:1: rule__ElementSelector__Group__1 : rule__ElementSelector__Group__1__Impl rule__ElementSelector__Group__2 ;
    public final void rule__ElementSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7376:1: ( rule__ElementSelector__Group__1__Impl rule__ElementSelector__Group__2 )
            // InternalQuCircuit.g:7377:2: rule__ElementSelector__Group__1__Impl rule__ElementSelector__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ElementSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__2();

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
    // $ANTLR end "rule__ElementSelector__Group__1"


    // $ANTLR start "rule__ElementSelector__Group__1__Impl"
    // InternalQuCircuit.g:7384:1: rule__ElementSelector__Group__1__Impl : ( ( rule__ElementSelector__Group_1__0 )? ) ;
    public final void rule__ElementSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7388:1: ( ( ( rule__ElementSelector__Group_1__0 )? ) )
            // InternalQuCircuit.g:7389:1: ( ( rule__ElementSelector__Group_1__0 )? )
            {
            // InternalQuCircuit.g:7389:1: ( ( rule__ElementSelector__Group_1__0 )? )
            // InternalQuCircuit.g:7390:2: ( rule__ElementSelector__Group_1__0 )?
            {
             before(grammarAccess.getElementSelectorAccess().getGroup_1()); 
            // InternalQuCircuit.g:7391:2: ( rule__ElementSelector__Group_1__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQuCircuit.g:7391:3: rule__ElementSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementSelector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementSelectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ElementSelector__Group__1__Impl"


    // $ANTLR start "rule__ElementSelector__Group__2"
    // InternalQuCircuit.g:7399:1: rule__ElementSelector__Group__2 : rule__ElementSelector__Group__2__Impl ;
    public final void rule__ElementSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7403:1: ( rule__ElementSelector__Group__2__Impl )
            // InternalQuCircuit.g:7404:2: rule__ElementSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__2__Impl();

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
    // $ANTLR end "rule__ElementSelector__Group__2"


    // $ANTLR start "rule__ElementSelector__Group__2__Impl"
    // InternalQuCircuit.g:7410:1: rule__ElementSelector__Group__2__Impl : ( ( rule__ElementSelector__IndexAssignment_2 ) ) ;
    public final void rule__ElementSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7414:1: ( ( ( rule__ElementSelector__IndexAssignment_2 ) ) )
            // InternalQuCircuit.g:7415:1: ( ( rule__ElementSelector__IndexAssignment_2 ) )
            {
            // InternalQuCircuit.g:7415:1: ( ( rule__ElementSelector__IndexAssignment_2 ) )
            // InternalQuCircuit.g:7416:2: ( rule__ElementSelector__IndexAssignment_2 )
            {
             before(grammarAccess.getElementSelectorAccess().getIndexAssignment_2()); 
            // InternalQuCircuit.g:7417:2: ( rule__ElementSelector__IndexAssignment_2 )
            // InternalQuCircuit.g:7417:3: rule__ElementSelector__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementSelectorAccess().getIndexAssignment_2()); 

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
    // $ANTLR end "rule__ElementSelector__Group__2__Impl"


    // $ANTLR start "rule__ElementSelector__Group_1__0"
    // InternalQuCircuit.g:7426:1: rule__ElementSelector__Group_1__0 : rule__ElementSelector__Group_1__0__Impl rule__ElementSelector__Group_1__1 ;
    public final void rule__ElementSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7430:1: ( rule__ElementSelector__Group_1__0__Impl rule__ElementSelector__Group_1__1 )
            // InternalQuCircuit.g:7431:2: rule__ElementSelector__Group_1__0__Impl rule__ElementSelector__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__ElementSelector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group_1__1();

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
    // $ANTLR end "rule__ElementSelector__Group_1__0"


    // $ANTLR start "rule__ElementSelector__Group_1__0__Impl"
    // InternalQuCircuit.g:7438:1: rule__ElementSelector__Group_1__0__Impl : ( ( rule__ElementSelector__RegisterAssignment_1_0 ) ) ;
    public final void rule__ElementSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7442:1: ( ( ( rule__ElementSelector__RegisterAssignment_1_0 ) ) )
            // InternalQuCircuit.g:7443:1: ( ( rule__ElementSelector__RegisterAssignment_1_0 ) )
            {
            // InternalQuCircuit.g:7443:1: ( ( rule__ElementSelector__RegisterAssignment_1_0 ) )
            // InternalQuCircuit.g:7444:2: ( rule__ElementSelector__RegisterAssignment_1_0 )
            {
             before(grammarAccess.getElementSelectorAccess().getRegisterAssignment_1_0()); 
            // InternalQuCircuit.g:7445:2: ( rule__ElementSelector__RegisterAssignment_1_0 )
            // InternalQuCircuit.g:7445:3: rule__ElementSelector__RegisterAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__RegisterAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getElementSelectorAccess().getRegisterAssignment_1_0()); 

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
    // $ANTLR end "rule__ElementSelector__Group_1__0__Impl"


    // $ANTLR start "rule__ElementSelector__Group_1__1"
    // InternalQuCircuit.g:7453:1: rule__ElementSelector__Group_1__1 : rule__ElementSelector__Group_1__1__Impl ;
    public final void rule__ElementSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7457:1: ( rule__ElementSelector__Group_1__1__Impl )
            // InternalQuCircuit.g:7458:2: rule__ElementSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group_1__1__Impl();

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
    // $ANTLR end "rule__ElementSelector__Group_1__1"


    // $ANTLR start "rule__ElementSelector__Group_1__1__Impl"
    // InternalQuCircuit.g:7464:1: rule__ElementSelector__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ElementSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7468:1: ( ( ',' ) )
            // InternalQuCircuit.g:7469:1: ( ',' )
            {
            // InternalQuCircuit.g:7469:1: ( ',' )
            // InternalQuCircuit.g:7470:2: ','
            {
             before(grammarAccess.getElementSelectorAccess().getCommaKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getElementSelectorAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__ElementSelector__Group_1__1__Impl"


    // $ANTLR start "rule__RangeSelector__Group__0"
    // InternalQuCircuit.g:7480:1: rule__RangeSelector__Group__0 : rule__RangeSelector__Group__0__Impl rule__RangeSelector__Group__1 ;
    public final void rule__RangeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7484:1: ( rule__RangeSelector__Group__0__Impl rule__RangeSelector__Group__1 )
            // InternalQuCircuit.g:7485:2: rule__RangeSelector__Group__0__Impl rule__RangeSelector__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__RangeSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__1();

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
    // $ANTLR end "rule__RangeSelector__Group__0"


    // $ANTLR start "rule__RangeSelector__Group__0__Impl"
    // InternalQuCircuit.g:7492:1: rule__RangeSelector__Group__0__Impl : ( () ) ;
    public final void rule__RangeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7496:1: ( ( () ) )
            // InternalQuCircuit.g:7497:1: ( () )
            {
            // InternalQuCircuit.g:7497:1: ( () )
            // InternalQuCircuit.g:7498:2: ()
            {
             before(grammarAccess.getRangeSelectorAccess().getRangeSelectorAction_0()); 
            // InternalQuCircuit.g:7499:2: ()
            // InternalQuCircuit.g:7499:3: 
            {
            }

             after(grammarAccess.getRangeSelectorAccess().getRangeSelectorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeSelector__Group__0__Impl"


    // $ANTLR start "rule__RangeSelector__Group__1"
    // InternalQuCircuit.g:7507:1: rule__RangeSelector__Group__1 : rule__RangeSelector__Group__1__Impl rule__RangeSelector__Group__2 ;
    public final void rule__RangeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7511:1: ( rule__RangeSelector__Group__1__Impl rule__RangeSelector__Group__2 )
            // InternalQuCircuit.g:7512:2: rule__RangeSelector__Group__1__Impl rule__RangeSelector__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__RangeSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__2();

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
    // $ANTLR end "rule__RangeSelector__Group__1"


    // $ANTLR start "rule__RangeSelector__Group__1__Impl"
    // InternalQuCircuit.g:7519:1: rule__RangeSelector__Group__1__Impl : ( ( rule__RangeSelector__Group_1__0 )? ) ;
    public final void rule__RangeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7523:1: ( ( ( rule__RangeSelector__Group_1__0 )? ) )
            // InternalQuCircuit.g:7524:1: ( ( rule__RangeSelector__Group_1__0 )? )
            {
            // InternalQuCircuit.g:7524:1: ( ( rule__RangeSelector__Group_1__0 )? )
            // InternalQuCircuit.g:7525:2: ( rule__RangeSelector__Group_1__0 )?
            {
             before(grammarAccess.getRangeSelectorAccess().getGroup_1()); 
            // InternalQuCircuit.g:7526:2: ( rule__RangeSelector__Group_1__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_STRING && LA56_0<=RULE_ID)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQuCircuit.g:7526:3: rule__RangeSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RangeSelector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRangeSelectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RangeSelector__Group__1__Impl"


    // $ANTLR start "rule__RangeSelector__Group__2"
    // InternalQuCircuit.g:7534:1: rule__RangeSelector__Group__2 : rule__RangeSelector__Group__2__Impl rule__RangeSelector__Group__3 ;
    public final void rule__RangeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7538:1: ( rule__RangeSelector__Group__2__Impl rule__RangeSelector__Group__3 )
            // InternalQuCircuit.g:7539:2: rule__RangeSelector__Group__2__Impl rule__RangeSelector__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__RangeSelector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__3();

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
    // $ANTLR end "rule__RangeSelector__Group__2"


    // $ANTLR start "rule__RangeSelector__Group__2__Impl"
    // InternalQuCircuit.g:7546:1: rule__RangeSelector__Group__2__Impl : ( ( rule__RangeSelector__BeginAssignment_2 ) ) ;
    public final void rule__RangeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7550:1: ( ( ( rule__RangeSelector__BeginAssignment_2 ) ) )
            // InternalQuCircuit.g:7551:1: ( ( rule__RangeSelector__BeginAssignment_2 ) )
            {
            // InternalQuCircuit.g:7551:1: ( ( rule__RangeSelector__BeginAssignment_2 ) )
            // InternalQuCircuit.g:7552:2: ( rule__RangeSelector__BeginAssignment_2 )
            {
             before(grammarAccess.getRangeSelectorAccess().getBeginAssignment_2()); 
            // InternalQuCircuit.g:7553:2: ( rule__RangeSelector__BeginAssignment_2 )
            // InternalQuCircuit.g:7553:3: rule__RangeSelector__BeginAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__BeginAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getBeginAssignment_2()); 

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
    // $ANTLR end "rule__RangeSelector__Group__2__Impl"


    // $ANTLR start "rule__RangeSelector__Group__3"
    // InternalQuCircuit.g:7561:1: rule__RangeSelector__Group__3 : rule__RangeSelector__Group__3__Impl rule__RangeSelector__Group__4 ;
    public final void rule__RangeSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7565:1: ( rule__RangeSelector__Group__3__Impl rule__RangeSelector__Group__4 )
            // InternalQuCircuit.g:7566:2: rule__RangeSelector__Group__3__Impl rule__RangeSelector__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RangeSelector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__4();

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
    // $ANTLR end "rule__RangeSelector__Group__3"


    // $ANTLR start "rule__RangeSelector__Group__3__Impl"
    // InternalQuCircuit.g:7573:1: rule__RangeSelector__Group__3__Impl : ( '-' ) ;
    public final void rule__RangeSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7577:1: ( ( '-' ) )
            // InternalQuCircuit.g:7578:1: ( '-' )
            {
            // InternalQuCircuit.g:7578:1: ( '-' )
            // InternalQuCircuit.g:7579:2: '-'
            {
             before(grammarAccess.getRangeSelectorAccess().getHyphenMinusKeyword_3()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getHyphenMinusKeyword_3()); 

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
    // $ANTLR end "rule__RangeSelector__Group__3__Impl"


    // $ANTLR start "rule__RangeSelector__Group__4"
    // InternalQuCircuit.g:7588:1: rule__RangeSelector__Group__4 : rule__RangeSelector__Group__4__Impl ;
    public final void rule__RangeSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7592:1: ( rule__RangeSelector__Group__4__Impl )
            // InternalQuCircuit.g:7593:2: rule__RangeSelector__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__4__Impl();

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
    // $ANTLR end "rule__RangeSelector__Group__4"


    // $ANTLR start "rule__RangeSelector__Group__4__Impl"
    // InternalQuCircuit.g:7599:1: rule__RangeSelector__Group__4__Impl : ( ( rule__RangeSelector__EndAssignment_4 ) ) ;
    public final void rule__RangeSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7603:1: ( ( ( rule__RangeSelector__EndAssignment_4 ) ) )
            // InternalQuCircuit.g:7604:1: ( ( rule__RangeSelector__EndAssignment_4 ) )
            {
            // InternalQuCircuit.g:7604:1: ( ( rule__RangeSelector__EndAssignment_4 ) )
            // InternalQuCircuit.g:7605:2: ( rule__RangeSelector__EndAssignment_4 )
            {
             before(grammarAccess.getRangeSelectorAccess().getEndAssignment_4()); 
            // InternalQuCircuit.g:7606:2: ( rule__RangeSelector__EndAssignment_4 )
            // InternalQuCircuit.g:7606:3: rule__RangeSelector__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getEndAssignment_4()); 

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
    // $ANTLR end "rule__RangeSelector__Group__4__Impl"


    // $ANTLR start "rule__RangeSelector__Group_1__0"
    // InternalQuCircuit.g:7615:1: rule__RangeSelector__Group_1__0 : rule__RangeSelector__Group_1__0__Impl rule__RangeSelector__Group_1__1 ;
    public final void rule__RangeSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7619:1: ( rule__RangeSelector__Group_1__0__Impl rule__RangeSelector__Group_1__1 )
            // InternalQuCircuit.g:7620:2: rule__RangeSelector__Group_1__0__Impl rule__RangeSelector__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__RangeSelector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group_1__1();

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
    // $ANTLR end "rule__RangeSelector__Group_1__0"


    // $ANTLR start "rule__RangeSelector__Group_1__0__Impl"
    // InternalQuCircuit.g:7627:1: rule__RangeSelector__Group_1__0__Impl : ( ( rule__RangeSelector__RegisterAssignment_1_0 ) ) ;
    public final void rule__RangeSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7631:1: ( ( ( rule__RangeSelector__RegisterAssignment_1_0 ) ) )
            // InternalQuCircuit.g:7632:1: ( ( rule__RangeSelector__RegisterAssignment_1_0 ) )
            {
            // InternalQuCircuit.g:7632:1: ( ( rule__RangeSelector__RegisterAssignment_1_0 ) )
            // InternalQuCircuit.g:7633:2: ( rule__RangeSelector__RegisterAssignment_1_0 )
            {
             before(grammarAccess.getRangeSelectorAccess().getRegisterAssignment_1_0()); 
            // InternalQuCircuit.g:7634:2: ( rule__RangeSelector__RegisterAssignment_1_0 )
            // InternalQuCircuit.g:7634:3: rule__RangeSelector__RegisterAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__RegisterAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getRegisterAssignment_1_0()); 

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
    // $ANTLR end "rule__RangeSelector__Group_1__0__Impl"


    // $ANTLR start "rule__RangeSelector__Group_1__1"
    // InternalQuCircuit.g:7642:1: rule__RangeSelector__Group_1__1 : rule__RangeSelector__Group_1__1__Impl ;
    public final void rule__RangeSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7646:1: ( rule__RangeSelector__Group_1__1__Impl )
            // InternalQuCircuit.g:7647:2: rule__RangeSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group_1__1__Impl();

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
    // $ANTLR end "rule__RangeSelector__Group_1__1"


    // $ANTLR start "rule__RangeSelector__Group_1__1__Impl"
    // InternalQuCircuit.g:7653:1: rule__RangeSelector__Group_1__1__Impl : ( ',' ) ;
    public final void rule__RangeSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7657:1: ( ( ',' ) )
            // InternalQuCircuit.g:7658:1: ( ',' )
            {
            // InternalQuCircuit.g:7658:1: ( ',' )
            // InternalQuCircuit.g:7659:2: ','
            {
             before(grammarAccess.getRangeSelectorAccess().getCommaKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__RangeSelector__Group_1__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__0"
    // InternalQuCircuit.g:7669:1: rule__EDoubleObject__Group__0 : rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 ;
    public final void rule__EDoubleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7673:1: ( rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 )
            // InternalQuCircuit.g:7674:2: rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EDoubleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__1();

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
    // $ANTLR end "rule__EDoubleObject__Group__0"


    // $ANTLR start "rule__EDoubleObject__Group__0__Impl"
    // InternalQuCircuit.g:7681:1: rule__EDoubleObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDoubleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7685:1: ( ( ( '-' )? ) )
            // InternalQuCircuit.g:7686:1: ( ( '-' )? )
            {
            // InternalQuCircuit.g:7686:1: ( ( '-' )? )
            // InternalQuCircuit.g:7687:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalQuCircuit.g:7688:2: ( '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQuCircuit.g:7688:3: '-'
                    {
                    match(input,55,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__1"
    // InternalQuCircuit.g:7696:1: rule__EDoubleObject__Group__1 : rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2 ;
    public final void rule__EDoubleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7700:1: ( rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2 )
            // InternalQuCircuit.g:7701:2: rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__EDoubleObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__2();

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
    // $ANTLR end "rule__EDoubleObject__Group__1"


    // $ANTLR start "rule__EDoubleObject__Group__1__Impl"
    // InternalQuCircuit.g:7708:1: rule__EDoubleObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDoubleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7712:1: ( ( ( RULE_INT )? ) )
            // InternalQuCircuit.g:7713:1: ( ( RULE_INT )? )
            {
            // InternalQuCircuit.g:7713:1: ( ( RULE_INT )? )
            // InternalQuCircuit.g:7714:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1()); 
            // InternalQuCircuit.g:7715:2: ( RULE_INT )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQuCircuit.g:7715:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__2"
    // InternalQuCircuit.g:7723:1: rule__EDoubleObject__Group__2 : rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3 ;
    public final void rule__EDoubleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7727:1: ( rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3 )
            // InternalQuCircuit.g:7728:2: rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EDoubleObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__3();

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
    // $ANTLR end "rule__EDoubleObject__Group__2"


    // $ANTLR start "rule__EDoubleObject__Group__2__Impl"
    // InternalQuCircuit.g:7735:1: rule__EDoubleObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EDoubleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7739:1: ( ( '.' ) )
            // InternalQuCircuit.g:7740:1: ( '.' )
            {
            // InternalQuCircuit.g:7740:1: ( '.' )
            // InternalQuCircuit.g:7741:2: '.'
            {
             before(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__2__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__3"
    // InternalQuCircuit.g:7750:1: rule__EDoubleObject__Group__3 : rule__EDoubleObject__Group__3__Impl rule__EDoubleObject__Group__4 ;
    public final void rule__EDoubleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7754:1: ( rule__EDoubleObject__Group__3__Impl rule__EDoubleObject__Group__4 )
            // InternalQuCircuit.g:7755:2: rule__EDoubleObject__Group__3__Impl rule__EDoubleObject__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__EDoubleObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__4();

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
    // $ANTLR end "rule__EDoubleObject__Group__3"


    // $ANTLR start "rule__EDoubleObject__Group__3__Impl"
    // InternalQuCircuit.g:7762:1: rule__EDoubleObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7766:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:7767:1: ( RULE_INT )
            {
            // InternalQuCircuit.g:7767:1: ( RULE_INT )
            // InternalQuCircuit.g:7768:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__3__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__4"
    // InternalQuCircuit.g:7777:1: rule__EDoubleObject__Group__4 : rule__EDoubleObject__Group__4__Impl ;
    public final void rule__EDoubleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7781:1: ( rule__EDoubleObject__Group__4__Impl )
            // InternalQuCircuit.g:7782:2: rule__EDoubleObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__4__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group__4"


    // $ANTLR start "rule__EDoubleObject__Group__4__Impl"
    // InternalQuCircuit.g:7788:1: rule__EDoubleObject__Group__4__Impl : ( ( rule__EDoubleObject__Group_4__0 )? ) ;
    public final void rule__EDoubleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7792:1: ( ( ( rule__EDoubleObject__Group_4__0 )? ) )
            // InternalQuCircuit.g:7793:1: ( ( rule__EDoubleObject__Group_4__0 )? )
            {
            // InternalQuCircuit.g:7793:1: ( ( rule__EDoubleObject__Group_4__0 )? )
            // InternalQuCircuit.g:7794:2: ( rule__EDoubleObject__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup_4()); 
            // InternalQuCircuit.g:7795:2: ( rule__EDoubleObject__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=11 && LA59_0<=12)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQuCircuit.g:7795:3: rule__EDoubleObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDoubleObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__4__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_4__0"
    // InternalQuCircuit.g:7804:1: rule__EDoubleObject__Group_4__0 : rule__EDoubleObject__Group_4__0__Impl rule__EDoubleObject__Group_4__1 ;
    public final void rule__EDoubleObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7808:1: ( rule__EDoubleObject__Group_4__0__Impl rule__EDoubleObject__Group_4__1 )
            // InternalQuCircuit.g:7809:2: rule__EDoubleObject__Group_4__0__Impl rule__EDoubleObject__Group_4__1
            {
            pushFollow(FOLLOW_45);
            rule__EDoubleObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_4__1();

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
    // $ANTLR end "rule__EDoubleObject__Group_4__0"


    // $ANTLR start "rule__EDoubleObject__Group_4__0__Impl"
    // InternalQuCircuit.g:7816:1: rule__EDoubleObject__Group_4__0__Impl : ( ( rule__EDoubleObject__Alternatives_4_0 ) ) ;
    public final void rule__EDoubleObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7820:1: ( ( ( rule__EDoubleObject__Alternatives_4_0 ) ) )
            // InternalQuCircuit.g:7821:1: ( ( rule__EDoubleObject__Alternatives_4_0 ) )
            {
            // InternalQuCircuit.g:7821:1: ( ( rule__EDoubleObject__Alternatives_4_0 ) )
            // InternalQuCircuit.g:7822:2: ( rule__EDoubleObject__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleObjectAccess().getAlternatives_4_0()); 
            // InternalQuCircuit.g:7823:2: ( rule__EDoubleObject__Alternatives_4_0 )
            // InternalQuCircuit.g:7823:3: rule__EDoubleObject__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_4__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_4__1"
    // InternalQuCircuit.g:7831:1: rule__EDoubleObject__Group_4__1 : rule__EDoubleObject__Group_4__1__Impl rule__EDoubleObject__Group_4__2 ;
    public final void rule__EDoubleObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7835:1: ( rule__EDoubleObject__Group_4__1__Impl rule__EDoubleObject__Group_4__2 )
            // InternalQuCircuit.g:7836:2: rule__EDoubleObject__Group_4__1__Impl rule__EDoubleObject__Group_4__2
            {
            pushFollow(FOLLOW_45);
            rule__EDoubleObject__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_4__2();

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
    // $ANTLR end "rule__EDoubleObject__Group_4__1"


    // $ANTLR start "rule__EDoubleObject__Group_4__1__Impl"
    // InternalQuCircuit.g:7843:1: rule__EDoubleObject__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDoubleObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7847:1: ( ( ( '-' )? ) )
            // InternalQuCircuit.g:7848:1: ( ( '-' )? )
            {
            // InternalQuCircuit.g:7848:1: ( ( '-' )? )
            // InternalQuCircuit.g:7849:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_4_1()); 
            // InternalQuCircuit.g:7850:2: ( '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==55) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalQuCircuit.g:7850:3: '-'
                    {
                    match(input,55,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_4__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_4__2"
    // InternalQuCircuit.g:7858:1: rule__EDoubleObject__Group_4__2 : rule__EDoubleObject__Group_4__2__Impl ;
    public final void rule__EDoubleObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7862:1: ( rule__EDoubleObject__Group_4__2__Impl )
            // InternalQuCircuit.g:7863:2: rule__EDoubleObject__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group_4__2"


    // $ANTLR start "rule__EDoubleObject__Group_4__2__Impl"
    // InternalQuCircuit.g:7869:1: rule__EDoubleObject__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7873:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:7874:1: ( RULE_INT )
            {
            // InternalQuCircuit.g:7874:1: ( RULE_INT )
            // InternalQuCircuit.g:7875:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_4__2__Impl"


    // $ANTLR start "rule__QuantumCircuit__NameAssignment_1"
    // InternalQuCircuit.g:7885:1: rule__QuantumCircuit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__QuantumCircuit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7889:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:7890:2: ( ruleEString )
            {
            // InternalQuCircuit.g:7890:2: ( ruleEString )
            // InternalQuCircuit.g:7891:3: ruleEString
            {
             before(grammarAccess.getQuantumCircuitAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__NameAssignment_1"


    // $ANTLR start "rule__QuantumCircuit__QuantumRegistersAssignment_3"
    // InternalQuCircuit.g:7900:1: rule__QuantumCircuit__QuantumRegistersAssignment_3 : ( ruleQuantumRegister ) ;
    public final void rule__QuantumCircuit__QuantumRegistersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7904:1: ( ( ruleQuantumRegister ) )
            // InternalQuCircuit.g:7905:2: ( ruleQuantumRegister )
            {
            // InternalQuCircuit.g:7905:2: ( ruleQuantumRegister )
            // InternalQuCircuit.g:7906:3: ruleQuantumRegister
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumRegister();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__QuantumRegistersAssignment_3"


    // $ANTLR start "rule__QuantumCircuit__QuantumRegistersAssignment_4"
    // InternalQuCircuit.g:7915:1: rule__QuantumCircuit__QuantumRegistersAssignment_4 : ( ruleQuantumRegister ) ;
    public final void rule__QuantumCircuit__QuantumRegistersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7919:1: ( ( ruleQuantumRegister ) )
            // InternalQuCircuit.g:7920:2: ( ruleQuantumRegister )
            {
            // InternalQuCircuit.g:7920:2: ( ruleQuantumRegister )
            // InternalQuCircuit.g:7921:3: ruleQuantumRegister
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumRegister();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__QuantumRegistersAssignment_4"


    // $ANTLR start "rule__QuantumCircuit__ClassicRegistersAssignment_5"
    // InternalQuCircuit.g:7930:1: rule__QuantumCircuit__ClassicRegistersAssignment_5 : ( ruleClassicRegister ) ;
    public final void rule__QuantumCircuit__ClassicRegistersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7934:1: ( ( ruleClassicRegister ) )
            // InternalQuCircuit.g:7935:2: ( ruleClassicRegister )
            {
            // InternalQuCircuit.g:7935:2: ( ruleClassicRegister )
            // InternalQuCircuit.g:7936:3: ruleClassicRegister
            {
             before(grammarAccess.getQuantumCircuitAccess().getClassicRegistersClassicRegisterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClassicRegister();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getClassicRegistersClassicRegisterParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__ClassicRegistersAssignment_5"


    // $ANTLR start "rule__QuantumCircuit__LayersAssignment_6"
    // InternalQuCircuit.g:7945:1: rule__QuantumCircuit__LayersAssignment_6 : ( ruleLayer ) ;
    public final void rule__QuantumCircuit__LayersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7949:1: ( ( ruleLayer ) )
            // InternalQuCircuit.g:7950:2: ( ruleLayer )
            {
            // InternalQuCircuit.g:7950:2: ( ruleLayer )
            // InternalQuCircuit.g:7951:3: ruleLayer
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__LayersAssignment_6"


    // $ANTLR start "rule__QuantumCircuit__LayersAssignment_7"
    // InternalQuCircuit.g:7960:1: rule__QuantumCircuit__LayersAssignment_7 : ( ruleLayer ) ;
    public final void rule__QuantumCircuit__LayersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7964:1: ( ( ruleLayer ) )
            // InternalQuCircuit.g:7965:2: ( ruleLayer )
            {
            // InternalQuCircuit.g:7965:2: ( ruleLayer )
            // InternalQuCircuit.g:7966:3: ruleLayer
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__LayersAssignment_7"


    // $ANTLR start "rule__QuantumRegister__NameAssignment_2"
    // InternalQuCircuit.g:7975:1: rule__QuantumRegister__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuantumRegister__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7979:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:7980:2: ( ruleEString )
            {
            // InternalQuCircuit.g:7980:2: ( ruleEString )
            // InternalQuCircuit.g:7981:3: ruleEString
            {
             before(grammarAccess.getQuantumRegisterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuantumRegisterAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QuantumRegister__NameAssignment_2"


    // $ANTLR start "rule__QuantumRegister__NumberOfQubitsAssignment_4_1"
    // InternalQuCircuit.g:7990:1: rule__QuantumRegister__NumberOfQubitsAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__QuantumRegister__NumberOfQubitsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7994:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:7995:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:7995:2: ( RULE_INT )
            // InternalQuCircuit.g:7996:3: RULE_INT
            {
             before(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__QuantumRegister__NumberOfQubitsAssignment_4_1"


    // $ANTLR start "rule__ClassicRegister__NameAssignment_2"
    // InternalQuCircuit.g:8005:1: rule__ClassicRegister__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ClassicRegister__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8009:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8010:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8010:2: ( ruleEString )
            // InternalQuCircuit.g:8011:3: ruleEString
            {
             before(grammarAccess.getClassicRegisterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicRegisterAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ClassicRegister__NameAssignment_2"


    // $ANTLR start "rule__ClassicRegister__NumberOfBitsAssignment_4_1"
    // InternalQuCircuit.g:8020:1: rule__ClassicRegister__NumberOfBitsAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ClassicRegister__NumberOfBitsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8024:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8025:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8025:2: ( RULE_INT )
            // InternalQuCircuit.g:8026:3: RULE_INT
            {
             before(grammarAccess.getClassicRegisterAccess().getNumberOfBitsINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getNumberOfBitsINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ClassicRegister__NumberOfBitsAssignment_4_1"


    // $ANTLR start "rule__Layer__NameAssignment_2"
    // InternalQuCircuit.g:8035:1: rule__Layer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Layer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8039:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8040:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8040:2: ( ruleEString )
            // InternalQuCircuit.g:8041:3: ruleEString
            {
             before(grammarAccess.getLayerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Layer__NameAssignment_2"


    // $ANTLR start "rule__Layer__QuantumOperationsAssignment_4"
    // InternalQuCircuit.g:8050:1: rule__Layer__QuantumOperationsAssignment_4 : ( ruleQuantumOperation ) ;
    public final void rule__Layer__QuantumOperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8054:1: ( ( ruleQuantumOperation ) )
            // InternalQuCircuit.g:8055:2: ( ruleQuantumOperation )
            {
            // InternalQuCircuit.g:8055:2: ( ruleQuantumOperation )
            // InternalQuCircuit.g:8056:3: ruleQuantumOperation
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumOperation();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Layer__QuantumOperationsAssignment_4"


    // $ANTLR start "rule__Layer__QuantumOperationsAssignment_5_1"
    // InternalQuCircuit.g:8065:1: rule__Layer__QuantumOperationsAssignment_5_1 : ( ruleQuantumOperation ) ;
    public final void rule__Layer__QuantumOperationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8069:1: ( ( ruleQuantumOperation ) )
            // InternalQuCircuit.g:8070:2: ( ruleQuantumOperation )
            {
            // InternalQuCircuit.g:8070:2: ( ruleQuantumOperation )
            // InternalQuCircuit.g:8071:3: ruleQuantumOperation
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumOperation();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Layer__QuantumOperationsAssignment_5_1"


    // $ANTLR start "rule__StatePreparation__NameAssignment_1"
    // InternalQuCircuit.g:8080:1: rule__StatePreparation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StatePreparation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8084:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8085:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8085:2: ( ruleEString )
            // InternalQuCircuit.g:8086:3: ruleEString
            {
             before(grammarAccess.getStatePreparationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StatePreparation__NameAssignment_1"


    // $ANTLR start "rule__StatePreparation__OperationsAssignment_4"
    // InternalQuCircuit.g:8095:1: rule__StatePreparation__OperationsAssignment_4 : ( ruleOperation ) ;
    public final void rule__StatePreparation__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8099:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8100:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8100:2: ( ruleOperation )
            // InternalQuCircuit.g:8101:3: ruleOperation
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StatePreparation__OperationsAssignment_4"


    // $ANTLR start "rule__StatePreparation__OperationsAssignment_5_1"
    // InternalQuCircuit.g:8110:1: rule__StatePreparation__OperationsAssignment_5_1 : ( ruleOperation ) ;
    public final void rule__StatePreparation__OperationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8114:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8115:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8115:2: ( ruleOperation )
            // InternalQuCircuit.g:8116:3: ruleOperation
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__StatePreparation__OperationsAssignment_5_1"


    // $ANTLR start "rule__StatePreparation__TargetQubitsAssignment_8"
    // InternalQuCircuit.g:8125:1: rule__StatePreparation__TargetQubitsAssignment_8 : ( ruleSelector ) ;
    public final void rule__StatePreparation__TargetQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8129:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8130:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8130:2: ( ruleSelector )
            // InternalQuCircuit.g:8131:3: ruleSelector
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__StatePreparation__TargetQubitsAssignment_8"


    // $ANTLR start "rule__StatePreparation__TargetQubitsAssignment_9_1"
    // InternalQuCircuit.g:8140:1: rule__StatePreparation__TargetQubitsAssignment_9_1 : ( ruleSelector ) ;
    public final void rule__StatePreparation__TargetQubitsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8144:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8145:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8145:2: ( ruleSelector )
            // InternalQuCircuit.g:8146:3: ruleSelector
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__StatePreparation__TargetQubitsAssignment_9_1"


    // $ANTLR start "rule__ElementaryQuantumGate__InverseFormAssignment_1"
    // InternalQuCircuit.g:8155:1: rule__ElementaryQuantumGate__InverseFormAssignment_1 : ( ( 'inverseForm' ) ) ;
    public final void rule__ElementaryQuantumGate__InverseFormAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8159:1: ( ( ( 'inverseForm' ) ) )
            // InternalQuCircuit.g:8160:2: ( ( 'inverseForm' ) )
            {
            // InternalQuCircuit.g:8160:2: ( ( 'inverseForm' ) )
            // InternalQuCircuit.g:8161:3: ( 'inverseForm' )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 
            // InternalQuCircuit.g:8162:3: ( 'inverseForm' )
            // InternalQuCircuit.g:8163:4: 'inverseForm'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__InverseFormAssignment_1"


    // $ANTLR start "rule__ElementaryQuantumGate__NameAssignment_2"
    // InternalQuCircuit.g:8174:1: rule__ElementaryQuantumGate__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ElementaryQuantumGate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8178:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8179:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8179:2: ( ruleEString )
            // InternalQuCircuit.g:8180:3: ruleEString
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__NameAssignment_2"


    // $ANTLR start "rule__ElementaryQuantumGate__OperationsAssignment_4_1"
    // InternalQuCircuit.g:8189:1: rule__ElementaryQuantumGate__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__ElementaryQuantumGate__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8193:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8194:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8194:2: ( ruleOperation )
            // InternalQuCircuit.g:8195:3: ruleOperation
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__OperationsAssignment_4_1"


    // $ANTLR start "rule__ElementaryQuantumGate__TargetQubitsAssignment_8"
    // InternalQuCircuit.g:8204:1: rule__ElementaryQuantumGate__TargetQubitsAssignment_8 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__TargetQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8208:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8209:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8209:2: ( ruleSelector )
            // InternalQuCircuit.g:8210:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__TargetQubitsAssignment_8"


    // $ANTLR start "rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2"
    // InternalQuCircuit.g:8219:1: rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8223:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8224:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8224:2: ( ruleSelector )
            // InternalQuCircuit.g:8225:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2"


    // $ANTLR start "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2"
    // InternalQuCircuit.g:8234:1: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8238:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8239:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8239:2: ( ruleSelector )
            // InternalQuCircuit.g:8240:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2"


    // $ANTLR start "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1"
    // InternalQuCircuit.g:8249:1: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8253:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8254:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8254:2: ( ruleSelector )
            // InternalQuCircuit.g:8255:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1"


    // $ANTLR start "rule__ElementaryQuantumGate__AngleParameterAssignment_13_1"
    // InternalQuCircuit.g:8264:1: rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 : ( ruleAngleParameter ) ;
    public final void rule__ElementaryQuantumGate__AngleParameterAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8268:1: ( ( ruleAngleParameter ) )
            // InternalQuCircuit.g:8269:2: ( ruleAngleParameter )
            {
            // InternalQuCircuit.g:8269:2: ( ruleAngleParameter )
            // InternalQuCircuit.g:8270:3: ruleAngleParameter
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAngleParameterParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAngleParameter();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAngleParameterParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__AngleParameterAssignment_13_1"


    // $ANTLR start "rule__AngleParameter__ThetaAssignment_3_1"
    // InternalQuCircuit.g:8279:1: rule__AngleParameter__ThetaAssignment_3_1 : ( ruleEDoubleObject ) ;
    public final void rule__AngleParameter__ThetaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8283:1: ( ( ruleEDoubleObject ) )
            // InternalQuCircuit.g:8284:2: ( ruleEDoubleObject )
            {
            // InternalQuCircuit.g:8284:2: ( ruleEDoubleObject )
            // InternalQuCircuit.g:8285:3: ruleEDoubleObject
            {
             before(grammarAccess.getAngleParameterAccess().getThetaEDoubleObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getAngleParameterAccess().getThetaEDoubleObjectParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AngleParameter__ThetaAssignment_3_1"


    // $ANTLR start "rule__AngleParameter__PhiAssignment_4_1"
    // InternalQuCircuit.g:8294:1: rule__AngleParameter__PhiAssignment_4_1 : ( ruleEDoubleObject ) ;
    public final void rule__AngleParameter__PhiAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8298:1: ( ( ruleEDoubleObject ) )
            // InternalQuCircuit.g:8299:2: ( ruleEDoubleObject )
            {
            // InternalQuCircuit.g:8299:2: ( ruleEDoubleObject )
            // InternalQuCircuit.g:8300:3: ruleEDoubleObject
            {
             before(grammarAccess.getAngleParameterAccess().getPhiEDoubleObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getAngleParameterAccess().getPhiEDoubleObjectParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__AngleParameter__PhiAssignment_4_1"


    // $ANTLR start "rule__AngleParameter__LambdaAssignment_5_1"
    // InternalQuCircuit.g:8309:1: rule__AngleParameter__LambdaAssignment_5_1 : ( ruleEDoubleObject ) ;
    public final void rule__AngleParameter__LambdaAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8313:1: ( ( ruleEDoubleObject ) )
            // InternalQuCircuit.g:8314:2: ( ruleEDoubleObject )
            {
            // InternalQuCircuit.g:8314:2: ( ruleEDoubleObject )
            // InternalQuCircuit.g:8315:3: ruleEDoubleObject
            {
             before(grammarAccess.getAngleParameterAccess().getLambdaEDoubleObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getAngleParameterAccess().getLambdaEDoubleObjectParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__AngleParameter__LambdaAssignment_5_1"


    // $ANTLR start "rule__Measurement__NameAssignment_1"
    // InternalQuCircuit.g:8324:1: rule__Measurement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Measurement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8328:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8329:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8329:2: ( ruleEString )
            // InternalQuCircuit.g:8330:3: ruleEString
            {
             before(grammarAccess.getMeasurementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Measurement__NameAssignment_1"


    // $ANTLR start "rule__Measurement__OperationsAssignment_3_1"
    // InternalQuCircuit.g:8339:1: rule__Measurement__OperationsAssignment_3_1 : ( ruleOperation ) ;
    public final void rule__Measurement__OperationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8343:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8344:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8344:2: ( ruleOperation )
            // InternalQuCircuit.g:8345:3: ruleOperation
            {
             before(grammarAccess.getMeasurementAccess().getOperationsOperationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getOperationsOperationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Measurement__OperationsAssignment_3_1"


    // $ANTLR start "rule__Measurement__TargetQubitsAssignment_7"
    // InternalQuCircuit.g:8354:1: rule__Measurement__TargetQubitsAssignment_7 : ( ruleSelector ) ;
    public final void rule__Measurement__TargetQubitsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8358:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8359:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8359:2: ( ruleSelector )
            // InternalQuCircuit.g:8360:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Measurement__TargetQubitsAssignment_7"


    // $ANTLR start "rule__Measurement__TargetQubitsAssignment_9_2"
    // InternalQuCircuit.g:8369:1: rule__Measurement__TargetQubitsAssignment_9_2 : ( ruleSelector ) ;
    public final void rule__Measurement__TargetQubitsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8373:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8374:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8374:2: ( ruleSelector )
            // InternalQuCircuit.g:8375:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Measurement__TargetQubitsAssignment_9_2"


    // $ANTLR start "rule__Measurement__ClassicBitsAssignment_14"
    // InternalQuCircuit.g:8384:1: rule__Measurement__ClassicBitsAssignment_14 : ( ruleSelector ) ;
    public final void rule__Measurement__ClassicBitsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8388:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8389:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8389:2: ( ruleSelector )
            // InternalQuCircuit.g:8390:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Measurement__ClassicBitsAssignment_14"


    // $ANTLR start "rule__Measurement__ClassicBitsAssignment_16_2"
    // InternalQuCircuit.g:8399:1: rule__Measurement__ClassicBitsAssignment_16_2 : ( ruleSelector ) ;
    public final void rule__Measurement__ClassicBitsAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8403:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8404:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8404:2: ( ruleSelector )
            // InternalQuCircuit.g:8405:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_16_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_16_2_0()); 

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
    // $ANTLR end "rule__Measurement__ClassicBitsAssignment_16_2"


    // $ANTLR start "rule__CompositeQuantumGate__NameAssignment_1"
    // InternalQuCircuit.g:8414:1: rule__CompositeQuantumGate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeQuantumGate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8418:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8419:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8419:2: ( ruleEString )
            // InternalQuCircuit.g:8420:3: ruleEString
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__NameAssignment_1"


    // $ANTLR start "rule__CompositeQuantumGate__InverseFormAssignment_3"
    // InternalQuCircuit.g:8429:1: rule__CompositeQuantumGate__InverseFormAssignment_3 : ( ( 'inverseForm' ) ) ;
    public final void rule__CompositeQuantumGate__InverseFormAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8433:1: ( ( ( 'inverseForm' ) ) )
            // InternalQuCircuit.g:8434:2: ( ( 'inverseForm' ) )
            {
            // InternalQuCircuit.g:8434:2: ( ( 'inverseForm' ) )
            // InternalQuCircuit.g:8435:3: ( 'inverseForm' )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 
            // InternalQuCircuit.g:8436:3: ( 'inverseForm' )
            // InternalQuCircuit.g:8437:4: 'inverseForm'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__InverseFormAssignment_3"


    // $ANTLR start "rule__CompositeQuantumGate__OperationsAssignment_4_1"
    // InternalQuCircuit.g:8448:1: rule__CompositeQuantumGate__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__CompositeQuantumGate__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8452:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8453:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8453:2: ( ruleOperation )
            // InternalQuCircuit.g:8454:3: ruleOperation
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__OperationsAssignment_4_1"


    // $ANTLR start "rule__CompositeQuantumGate__TargetQubitsAssignment_8"
    // InternalQuCircuit.g:8463:1: rule__CompositeQuantumGate__TargetQubitsAssignment_8 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__TargetQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8467:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8468:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8468:2: ( ruleSelector )
            // InternalQuCircuit.g:8469:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__TargetQubitsAssignment_8"


    // $ANTLR start "rule__CompositeQuantumGate__TargetQubitsAssignment_10_2"
    // InternalQuCircuit.g:8478:1: rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__TargetQubitsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8482:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8483:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8483:2: ( ruleSelector )
            // InternalQuCircuit.g:8484:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__TargetQubitsAssignment_10_2"


    // $ANTLR start "rule__CompositeQuantumGate__ControlQubitsAssignment_12_2"
    // InternalQuCircuit.g:8493:1: rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__ControlQubitsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8497:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8498:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8498:2: ( ruleSelector )
            // InternalQuCircuit.g:8499:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__ControlQubitsAssignment_12_2"


    // $ANTLR start "rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1"
    // InternalQuCircuit.g:8508:1: rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8512:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8513:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8513:2: ( ruleSelector )
            // InternalQuCircuit.g:8514:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1"


    // $ANTLR start "rule__Loop__NameAssignment_1"
    // InternalQuCircuit.g:8523:1: rule__Loop__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Loop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8527:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8528:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8528:2: ( ruleEString )
            // InternalQuCircuit.g:8529:3: ruleEString
            {
             before(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Loop__NameAssignment_1"


    // $ANTLR start "rule__Loop__InverseFormAssignment_3"
    // InternalQuCircuit.g:8538:1: rule__Loop__InverseFormAssignment_3 : ( ( 'inverseForm' ) ) ;
    public final void rule__Loop__InverseFormAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8542:1: ( ( ( 'inverseForm' ) ) )
            // InternalQuCircuit.g:8543:2: ( ( 'inverseForm' ) )
            {
            // InternalQuCircuit.g:8543:2: ( ( 'inverseForm' ) )
            // InternalQuCircuit.g:8544:3: ( 'inverseForm' )
            {
             before(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 
            // InternalQuCircuit.g:8545:3: ( 'inverseForm' )
            // InternalQuCircuit.g:8546:4: 'inverseForm'
            {
             before(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 

            }

             after(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 

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
    // $ANTLR end "rule__Loop__InverseFormAssignment_3"


    // $ANTLR start "rule__Loop__IncrementBlockTargetQubitsAssignment_4"
    // InternalQuCircuit.g:8557:1: rule__Loop__IncrementBlockTargetQubitsAssignment_4 : ( ( 'incrementBlockTargetQubits' ) ) ;
    public final void rule__Loop__IncrementBlockTargetQubitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8561:1: ( ( ( 'incrementBlockTargetQubits' ) ) )
            // InternalQuCircuit.g:8562:2: ( ( 'incrementBlockTargetQubits' ) )
            {
            // InternalQuCircuit.g:8562:2: ( ( 'incrementBlockTargetQubits' ) )
            // InternalQuCircuit.g:8563:3: ( 'incrementBlockTargetQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 
            // InternalQuCircuit.g:8564:3: ( 'incrementBlockTargetQubits' )
            // InternalQuCircuit.g:8565:4: 'incrementBlockTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 

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
    // $ANTLR end "rule__Loop__IncrementBlockTargetQubitsAssignment_4"


    // $ANTLR start "rule__Loop__IncrementBlockControlQubitsAssignment_5"
    // InternalQuCircuit.g:8576:1: rule__Loop__IncrementBlockControlQubitsAssignment_5 : ( ( 'incrementBlockControlQubits' ) ) ;
    public final void rule__Loop__IncrementBlockControlQubitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8580:1: ( ( ( 'incrementBlockControlQubits' ) ) )
            // InternalQuCircuit.g:8581:2: ( ( 'incrementBlockControlQubits' ) )
            {
            // InternalQuCircuit.g:8581:2: ( ( 'incrementBlockControlQubits' ) )
            // InternalQuCircuit.g:8582:3: ( 'incrementBlockControlQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 
            // InternalQuCircuit.g:8583:3: ( 'incrementBlockControlQubits' )
            // InternalQuCircuit.g:8584:4: 'incrementBlockControlQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 

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
    // $ANTLR end "rule__Loop__IncrementBlockControlQubitsAssignment_5"


    // $ANTLR start "rule__Loop__IterationsAssignment_6_1"
    // InternalQuCircuit.g:8595:1: rule__Loop__IterationsAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Loop__IterationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8599:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8600:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8600:2: ( RULE_INT )
            // InternalQuCircuit.g:8601:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getIterationsINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIterationsINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Loop__IterationsAssignment_6_1"


    // $ANTLR start "rule__Loop__IncrementTargetQubitsAssignment_7"
    // InternalQuCircuit.g:8610:1: rule__Loop__IncrementTargetQubitsAssignment_7 : ( ( 'incrementTargetQubits' ) ) ;
    public final void rule__Loop__IncrementTargetQubitsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8614:1: ( ( ( 'incrementTargetQubits' ) ) )
            // InternalQuCircuit.g:8615:2: ( ( 'incrementTargetQubits' ) )
            {
            // InternalQuCircuit.g:8615:2: ( ( 'incrementTargetQubits' ) )
            // InternalQuCircuit.g:8616:3: ( 'incrementTargetQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 
            // InternalQuCircuit.g:8617:3: ( 'incrementTargetQubits' )
            // InternalQuCircuit.g:8618:4: 'incrementTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 

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
    // $ANTLR end "rule__Loop__IncrementTargetQubitsAssignment_7"


    // $ANTLR start "rule__Loop__IncrementControlQubitsAssignment_8"
    // InternalQuCircuit.g:8629:1: rule__Loop__IncrementControlQubitsAssignment_8 : ( ( 'incrementControlQubits' ) ) ;
    public final void rule__Loop__IncrementControlQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8633:1: ( ( ( 'incrementControlQubits' ) ) )
            // InternalQuCircuit.g:8634:2: ( ( 'incrementControlQubits' ) )
            {
            // InternalQuCircuit.g:8634:2: ( ( 'incrementControlQubits' ) )
            // InternalQuCircuit.g:8635:3: ( 'incrementControlQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 
            // InternalQuCircuit.g:8636:3: ( 'incrementControlQubits' )
            // InternalQuCircuit.g:8637:4: 'incrementControlQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 

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
    // $ANTLR end "rule__Loop__IncrementControlQubitsAssignment_8"


    // $ANTLR start "rule__Loop__TargetQubitsBlockSizeAssignment_9_1"
    // InternalQuCircuit.g:8648:1: rule__Loop__TargetQubitsBlockSizeAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__Loop__TargetQubitsBlockSizeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8652:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8653:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8653:2: ( RULE_INT )
            // InternalQuCircuit.g:8654:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeINTTerminalRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsBlockSizeAssignment_9_1"


    // $ANTLR start "rule__Loop__ControlQubitsBlockSizeAssignment_10_1"
    // InternalQuCircuit.g:8663:1: rule__Loop__ControlQubitsBlockSizeAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__Loop__ControlQubitsBlockSizeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8667:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8668:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8668:2: ( RULE_INT )
            // InternalQuCircuit.g:8669:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getControlQubitsBlockSizeINTTerminalRuleCall_10_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsBlockSizeINTTerminalRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsBlockSizeAssignment_10_1"


    // $ANTLR start "rule__Loop__ControlQubitsIterationTypeAssignment_11_1"
    // InternalQuCircuit.g:8678:1: rule__Loop__ControlQubitsIterationTypeAssignment_11_1 : ( ruleITERATION_TYPE ) ;
    public final void rule__Loop__ControlQubitsIterationTypeAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8682:1: ( ( ruleITERATION_TYPE ) )
            // InternalQuCircuit.g:8683:2: ( ruleITERATION_TYPE )
            {
            // InternalQuCircuit.g:8683:2: ( ruleITERATION_TYPE )
            // InternalQuCircuit.g:8684:3: ruleITERATION_TYPE
            {
             before(grammarAccess.getLoopAccess().getControlQubitsIterationTypeITERATION_TYPEEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleITERATION_TYPE();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getControlQubitsIterationTypeITERATION_TYPEEnumRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsIterationTypeAssignment_11_1"


    // $ANTLR start "rule__Loop__TargetQubitsIterationTypeAssignment_12_1"
    // InternalQuCircuit.g:8693:1: rule__Loop__TargetQubitsIterationTypeAssignment_12_1 : ( ruleITERATION_TYPE ) ;
    public final void rule__Loop__TargetQubitsIterationTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8697:1: ( ( ruleITERATION_TYPE ) )
            // InternalQuCircuit.g:8698:2: ( ruleITERATION_TYPE )
            {
            // InternalQuCircuit.g:8698:2: ( ruleITERATION_TYPE )
            // InternalQuCircuit.g:8699:3: ruleITERATION_TYPE
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeITERATION_TYPEEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleITERATION_TYPE();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeITERATION_TYPEEnumRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsIterationTypeAssignment_12_1"


    // $ANTLR start "rule__Loop__IncrementByAssignment_13_1"
    // InternalQuCircuit.g:8708:1: rule__Loop__IncrementByAssignment_13_1 : ( RULE_INT ) ;
    public final void rule__Loop__IncrementByAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8712:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8713:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8713:2: ( RULE_INT )
            // InternalQuCircuit.g:8714:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getIncrementByINTTerminalRuleCall_13_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementByINTTerminalRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Loop__IncrementByAssignment_13_1"


    // $ANTLR start "rule__Loop__OperationsAssignment_14_2"
    // InternalQuCircuit.g:8723:1: rule__Loop__OperationsAssignment_14_2 : ( ruleOperation ) ;
    public final void rule__Loop__OperationsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8727:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8728:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8728:2: ( ruleOperation )
            // InternalQuCircuit.g:8729:3: ruleOperation
            {
             before(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_2_0()); 

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
    // $ANTLR end "rule__Loop__OperationsAssignment_14_2"


    // $ANTLR start "rule__Loop__OperationsAssignment_14_3_1"
    // InternalQuCircuit.g:8738:1: rule__Loop__OperationsAssignment_14_3_1 : ( ruleOperation ) ;
    public final void rule__Loop__OperationsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8742:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8743:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8743:2: ( ruleOperation )
            // InternalQuCircuit.g:8744:3: ruleOperation
            {
             before(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_3_1_0()); 

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
    // $ANTLR end "rule__Loop__OperationsAssignment_14_3_1"


    // $ANTLR start "rule__Loop__TargetQubitsAssignment_18"
    // InternalQuCircuit.g:8753:1: rule__Loop__TargetQubitsAssignment_18 : ( ruleSelector ) ;
    public final void rule__Loop__TargetQubitsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8757:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8758:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8758:2: ( ruleSelector )
            // InternalQuCircuit.g:8759:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsAssignment_18"


    // $ANTLR start "rule__Loop__TargetQubitsAssignment_20_2"
    // InternalQuCircuit.g:8768:1: rule__Loop__TargetQubitsAssignment_20_2 : ( ruleSelector ) ;
    public final void rule__Loop__TargetQubitsAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8772:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8773:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8773:2: ( ruleSelector )
            // InternalQuCircuit.g:8774:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_20_2_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsAssignment_20_2"


    // $ANTLR start "rule__Loop__ControlQubitsAssignment_22_2"
    // InternalQuCircuit.g:8783:1: rule__Loop__ControlQubitsAssignment_22_2 : ( ruleSelector ) ;
    public final void rule__Loop__ControlQubitsAssignment_22_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8787:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8788:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8788:2: ( ruleSelector )
            // InternalQuCircuit.g:8789:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_2_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsAssignment_22_2"


    // $ANTLR start "rule__Loop__ControlQubitsAssignment_22_3_1"
    // InternalQuCircuit.g:8798:1: rule__Loop__ControlQubitsAssignment_22_3_1 : ( ruleSelector ) ;
    public final void rule__Loop__ControlQubitsAssignment_22_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8802:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8803:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8803:2: ( ruleSelector )
            // InternalQuCircuit.g:8804:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_3_1_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsAssignment_22_3_1"


    // $ANTLR start "rule__Loop__FixedControlQubitsAssignment_23_2"
    // InternalQuCircuit.g:8813:1: rule__Loop__FixedControlQubitsAssignment_23_2 : ( ruleSelector ) ;
    public final void rule__Loop__FixedControlQubitsAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8817:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8818:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8818:2: ( ruleSelector )
            // InternalQuCircuit.g:8819:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_2_0()); 

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
    // $ANTLR end "rule__Loop__FixedControlQubitsAssignment_23_2"


    // $ANTLR start "rule__Loop__FixedControlQubitsAssignment_23_3_1"
    // InternalQuCircuit.g:8828:1: rule__Loop__FixedControlQubitsAssignment_23_3_1 : ( ruleSelector ) ;
    public final void rule__Loop__FixedControlQubitsAssignment_23_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8832:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8833:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8833:2: ( ruleSelector )
            // InternalQuCircuit.g:8834:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_3_1_0()); 

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
    // $ANTLR end "rule__Loop__FixedControlQubitsAssignment_23_3_1"


    // $ANTLR start "rule__Loop__FixedTargetQubitsAssignment_24_2"
    // InternalQuCircuit.g:8843:1: rule__Loop__FixedTargetQubitsAssignment_24_2 : ( ruleSelector ) ;
    public final void rule__Loop__FixedTargetQubitsAssignment_24_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8847:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8848:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8848:2: ( ruleSelector )
            // InternalQuCircuit.g:8849:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_2_0()); 

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
    // $ANTLR end "rule__Loop__FixedTargetQubitsAssignment_24_2"


    // $ANTLR start "rule__Loop__FixedTargetQubitsAssignment_24_3_1"
    // InternalQuCircuit.g:8858:1: rule__Loop__FixedTargetQubitsAssignment_24_3_1 : ( ruleSelector ) ;
    public final void rule__Loop__FixedTargetQubitsAssignment_24_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8862:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8863:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8863:2: ( ruleSelector )
            // InternalQuCircuit.g:8864:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_3_1_0()); 

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
    // $ANTLR end "rule__Loop__FixedTargetQubitsAssignment_24_3_1"


    // $ANTLR start "rule__Loop__LoopAssignment_26"
    // InternalQuCircuit.g:8873:1: rule__Loop__LoopAssignment_26 : ( ( ruleEString ) ) ;
    public final void rule__Loop__LoopAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8877:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:8878:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:8878:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:8879:3: ( ruleEString )
            {
             before(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationCrossReference_26_0()); 
            // InternalQuCircuit.g:8880:3: ( ruleEString )
            // InternalQuCircuit.g:8881:4: ruleEString
            {
             before(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationEStringParserRuleCall_26_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationEStringParserRuleCall_26_0_1()); 

            }

             after(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationCrossReference_26_0()); 

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
    // $ANTLR end "rule__Loop__LoopAssignment_26"


    // $ANTLR start "rule__Loop__LoopTargetQubitsAssignment_30"
    // InternalQuCircuit.g:8892:1: rule__Loop__LoopTargetQubitsAssignment_30 : ( ruleSelector ) ;
    public final void rule__Loop__LoopTargetQubitsAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8896:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8897:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8897:2: ( ruleSelector )
            // InternalQuCircuit.g:8898:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_30_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_30_0()); 

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
    // $ANTLR end "rule__Loop__LoopTargetQubitsAssignment_30"


    // $ANTLR start "rule__Loop__LoopTargetQubitsAssignment_32_2"
    // InternalQuCircuit.g:8907:1: rule__Loop__LoopTargetQubitsAssignment_32_2 : ( ruleSelector ) ;
    public final void rule__Loop__LoopTargetQubitsAssignment_32_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8911:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8912:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8912:2: ( ruleSelector )
            // InternalQuCircuit.g:8913:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_32_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_32_2_0()); 

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
    // $ANTLR end "rule__Loop__LoopTargetQubitsAssignment_32_2"


    // $ANTLR start "rule__Loop__LoopControlQubitsAssignment_34_3"
    // InternalQuCircuit.g:8922:1: rule__Loop__LoopControlQubitsAssignment_34_3 : ( ruleSelector ) ;
    public final void rule__Loop__LoopControlQubitsAssignment_34_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8926:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8927:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8927:2: ( ruleSelector )
            // InternalQuCircuit.g:8928:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_3_0()); 

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
    // $ANTLR end "rule__Loop__LoopControlQubitsAssignment_34_3"


    // $ANTLR start "rule__Loop__LoopControlQubitsAssignment_34_5_2"
    // InternalQuCircuit.g:8937:1: rule__Loop__LoopControlQubitsAssignment_34_5_2 : ( ruleSelector ) ;
    public final void rule__Loop__LoopControlQubitsAssignment_34_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8941:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8942:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8942:2: ( ruleSelector )
            // InternalQuCircuit.g:8943:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_5_2_0()); 

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
    // $ANTLR end "rule__Loop__LoopControlQubitsAssignment_34_5_2"


    // $ANTLR start "rule__Operation__OperationAssignment_0"
    // InternalQuCircuit.g:8952:1: rule__Operation__OperationAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Operation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8956:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:8957:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:8957:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:8958:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationCrossReference_0_0()); 
            // InternalQuCircuit.g:8959:3: ( ruleEString )
            // InternalQuCircuit.g:8960:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationCrossReference_0_0()); 

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
    // $ANTLR end "rule__Operation__OperationAssignment_0"


    // $ANTLR start "rule__Operation__QuboAssignment_1_1"
    // InternalQuCircuit.g:8971:1: rule__Operation__QuboAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Operation__QuboAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8975:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:8976:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:8976:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:8977:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getQuboQuboCrossReference_1_1_0()); 
            // InternalQuCircuit.g:8978:3: ( ruleEString )
            // InternalQuCircuit.g:8979:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getQuboQuboEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getQuboQuboEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getQuboQuboCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Operation__QuboAssignment_1_1"


    // $ANTLR start "rule__ElementSelector__RegisterAssignment_1_0"
    // InternalQuCircuit.g:8990:1: rule__ElementSelector__RegisterAssignment_1_0 : ( ( ruleEString ) ) ;
    public final void rule__ElementSelector__RegisterAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8994:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:8995:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:8995:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:8996:3: ( ruleEString )
            {
             before(grammarAccess.getElementSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 
            // InternalQuCircuit.g:8997:3: ( ruleEString )
            // InternalQuCircuit.g:8998:4: ruleEString
            {
             before(grammarAccess.getElementSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElementSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getElementSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__ElementSelector__RegisterAssignment_1_0"


    // $ANTLR start "rule__ElementSelector__IndexAssignment_2"
    // InternalQuCircuit.g:9009:1: rule__ElementSelector__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__ElementSelector__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9013:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:9014:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:9014:2: ( RULE_INT )
            // InternalQuCircuit.g:9015:3: RULE_INT
            {
             before(grammarAccess.getElementSelectorAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementSelectorAccess().getIndexINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElementSelector__IndexAssignment_2"


    // $ANTLR start "rule__RangeSelector__RegisterAssignment_1_0"
    // InternalQuCircuit.g:9024:1: rule__RangeSelector__RegisterAssignment_1_0 : ( ( ruleEString ) ) ;
    public final void rule__RangeSelector__RegisterAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9028:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:9029:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:9029:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:9030:3: ( ruleEString )
            {
             before(grammarAccess.getRangeSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 
            // InternalQuCircuit.g:9031:3: ( ruleEString )
            // InternalQuCircuit.g:9032:4: ruleEString
            {
             before(grammarAccess.getRangeSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRangeSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getRangeSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__RangeSelector__RegisterAssignment_1_0"


    // $ANTLR start "rule__RangeSelector__BeginAssignment_2"
    // InternalQuCircuit.g:9043:1: rule__RangeSelector__BeginAssignment_2 : ( RULE_INT ) ;
    public final void rule__RangeSelector__BeginAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9047:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:9048:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:9048:2: ( RULE_INT )
            // InternalQuCircuit.g:9049:3: RULE_INT
            {
             before(grammarAccess.getRangeSelectorAccess().getBeginINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getBeginINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RangeSelector__BeginAssignment_2"


    // $ANTLR start "rule__RangeSelector__EndAssignment_4"
    // InternalQuCircuit.g:9058:1: rule__RangeSelector__EndAssignment_4 : ( RULE_INT ) ;
    public final void rule__RangeSelector__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9062:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:9063:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:9063:2: ( RULE_INT )
            // InternalQuCircuit.g:9064:3: RULE_INT
            {
             before(grammarAccess.getRangeSelectorAccess().getEndINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getEndINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RangeSelector__EndAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000A80000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000AC0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000A80002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000068042000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0180000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x020000000C000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x3E0FE00008000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0030080200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000040L});

}