package fr.imag.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.imag.services.UnqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'document'", "'[Definitions]'", "'[Connections]'", "'[Queries]'", "'define'", "'as'", "'connect'", "'url'", "'username'", "'password'", "'select'", "'from'", "'where'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalUnqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnqlParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g"; }


     
     	private UnqlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(UnqlGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgram"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:61:1: ( ruleProgram EOF )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:69:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:73:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:74:1: ( ( rule__Program__Group__0 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:74:1: ( ( rule__Program__Group__0 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:75:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:76:1: ( rule__Program__Group__0 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:76:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDefinition"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:88:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:89:1: ( ruleDefinition EOF )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:90:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition121);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition128); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:97:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:101:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:102:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:102:1: ( ( rule__Definition__Group__0 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:103:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:104:1: ( rule__Definition__Group__0 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:104:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition154);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleConnection"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:116:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:117:1: ( ruleConnection EOF )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:118:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection181);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection188); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:125:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:129:2: ( ( ( rule__Connection__Group__0 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:130:1: ( ( rule__Connection__Group__0 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:130:1: ( ( rule__Connection__Group__0 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:131:1: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:132:1: ( rule__Connection__Group__0 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:132:2: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_rule__Connection__Group__0_in_ruleConnection214);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleSelect"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:144:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:145:1: ( ruleSelect EOF )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:146:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect241);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect248); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:153:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:157:2: ( ( ( rule__Select__Group__0 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:158:1: ( ( rule__Select__Group__0 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:158:1: ( ( rule__Select__Group__0 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:159:1: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:160:1: ( rule__Select__Group__0 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:160:2: rule__Select__Group__0
            {
            pushFollow(FOLLOW_rule__Select__Group__0_in_ruleSelect274);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "rule__Definition__TypeAlternatives_3_0"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:172:1: rule__Definition__TypeAlternatives_3_0 : ( ( 'graph' ) | ( 'document' ) );
    public final void rule__Definition__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:176:1: ( ( 'graph' ) | ( 'document' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:177:1: ( 'graph' )
                    {
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:177:1: ( 'graph' )
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:178:1: 'graph'
                    {
                     before(grammarAccess.getDefinitionAccess().getTypeGraphKeyword_3_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Definition__TypeAlternatives_3_0311); 
                     after(grammarAccess.getDefinitionAccess().getTypeGraphKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:185:6: ( 'document' )
                    {
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:185:6: ( 'document' )
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:186:1: 'document'
                    {
                     before(grammarAccess.getDefinitionAccess().getTypeDocumentKeyword_3_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Definition__TypeAlternatives_3_0331); 
                     after(grammarAccess.getDefinitionAccess().getTypeDocumentKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Definition__TypeAlternatives_3_0"


    // $ANTLR start "rule__Program__Group__0"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:200:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:204:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:205:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__0363);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__0366);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:212:1: rule__Program__Group__0__Impl : ( '[Definitions]' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:216:1: ( ( '[Definitions]' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:217:1: ( '[Definitions]' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:217:1: ( '[Definitions]' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:218:1: '[Definitions]'
            {
             before(grammarAccess.getProgramAccess().getDefinitionsKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Program__Group__0__Impl394); 
             after(grammarAccess.getProgramAccess().getDefinitionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:231:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:235:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:236:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__1425);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__1428);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:243:1: rule__Program__Group__1__Impl : ( ( rule__Program__DefinitionsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:247:1: ( ( ( rule__Program__DefinitionsAssignment_1 )* ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:248:1: ( ( rule__Program__DefinitionsAssignment_1 )* )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:248:1: ( ( rule__Program__DefinitionsAssignment_1 )* )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:249:1: ( rule__Program__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getDefinitionsAssignment_1()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:250:1: ( rule__Program__DefinitionsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:250:2: rule__Program__DefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Program__DefinitionsAssignment_1_in_rule__Program__Group__1__Impl455);
            	    rule__Program__DefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getDefinitionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:260:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:264:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:265:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__2486);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__3_in_rule__Program__Group__2489);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:272:1: rule__Program__Group__2__Impl : ( '[Connections]' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:276:1: ( ( '[Connections]' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:277:1: ( '[Connections]' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:277:1: ( '[Connections]' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:278:1: '[Connections]'
            {
             before(grammarAccess.getProgramAccess().getConnectionsKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Program__Group__2__Impl517); 
             after(grammarAccess.getProgramAccess().getConnectionsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:291:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:295:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:296:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__3548);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__4_in_rule__Program__Group__3551);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:303:1: rule__Program__Group__3__Impl : ( ( rule__Program__ConnectionsAssignment_3 )* ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:307:1: ( ( ( rule__Program__ConnectionsAssignment_3 )* ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:308:1: ( ( rule__Program__ConnectionsAssignment_3 )* )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:308:1: ( ( rule__Program__ConnectionsAssignment_3 )* )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:309:1: ( rule__Program__ConnectionsAssignment_3 )*
            {
             before(grammarAccess.getProgramAccess().getConnectionsAssignment_3()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:310:1: ( rule__Program__ConnectionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:310:2: rule__Program__ConnectionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Program__ConnectionsAssignment_3_in_rule__Program__Group__3__Impl578);
            	    rule__Program__ConnectionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getConnectionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group__4"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:320:1: rule__Program__Group__4 : rule__Program__Group__4__Impl rule__Program__Group__5 ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:324:1: ( rule__Program__Group__4__Impl rule__Program__Group__5 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:325:2: rule__Program__Group__4__Impl rule__Program__Group__5
            {
            pushFollow(FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__4609);
            rule__Program__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__5_in_rule__Program__Group__4612);
            rule__Program__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:332:1: rule__Program__Group__4__Impl : ( '[Queries]' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:336:1: ( ( '[Queries]' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:337:1: ( '[Queries]' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:337:1: ( '[Queries]' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:338:1: '[Queries]'
            {
             before(grammarAccess.getProgramAccess().getQueriesKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Program__Group__4__Impl640); 
             after(grammarAccess.getProgramAccess().getQueriesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group__5"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:351:1: rule__Program__Group__5 : rule__Program__Group__5__Impl ;
    public final void rule__Program__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:355:1: ( rule__Program__Group__5__Impl )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:356:2: rule__Program__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__5671);
            rule__Program__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5"


    // $ANTLR start "rule__Program__Group__5__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:362:1: rule__Program__Group__5__Impl : ( ( rule__Program__QueriesAssignment_5 )* ) ;
    public final void rule__Program__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:366:1: ( ( ( rule__Program__QueriesAssignment_5 )* ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:367:1: ( ( rule__Program__QueriesAssignment_5 )* )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:367:1: ( ( rule__Program__QueriesAssignment_5 )* )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:368:1: ( rule__Program__QueriesAssignment_5 )*
            {
             before(grammarAccess.getProgramAccess().getQueriesAssignment_5()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:369:1: ( rule__Program__QueriesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:369:2: rule__Program__QueriesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Program__QueriesAssignment_5_in_rule__Program__Group__5__Impl698);
            	    rule__Program__QueriesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getQueriesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__5__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:391:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:395:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:396:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0741);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0744);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:403:1: rule__Definition__Group__0__Impl : ( 'define' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:407:1: ( ( 'define' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:408:1: ( 'define' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:408:1: ( 'define' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:409:1: 'define'
            {
             before(grammarAccess.getDefinitionAccess().getDefineKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Definition__Group__0__Impl772); 
             after(grammarAccess.getDefinitionAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:422:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:426:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:427:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1803);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1806);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:434:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:438:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:439:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:439:1: ( ( rule__Definition__NameAssignment_1 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:440:1: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:441:1: ( rule__Definition__NameAssignment_1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:441:2: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl833);
            rule__Definition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:451:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:455:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:456:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2863);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2866);
            rule__Definition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:463:1: rule__Definition__Group__2__Impl : ( 'as' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:467:1: ( ( 'as' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:468:1: ( 'as' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:468:1: ( 'as' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:469:1: 'as'
            {
             before(grammarAccess.getDefinitionAccess().getAsKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Definition__Group__2__Impl894); 
             after(grammarAccess.getDefinitionAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:482:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:486:1: ( rule__Definition__Group__3__Impl )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:487:2: rule__Definition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3925);
            rule__Definition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:493:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__TypeAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:497:1: ( ( ( rule__Definition__TypeAssignment_3 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:498:1: ( ( rule__Definition__TypeAssignment_3 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:498:1: ( ( rule__Definition__TypeAssignment_3 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:499:1: ( rule__Definition__TypeAssignment_3 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAssignment_3()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:500:1: ( rule__Definition__TypeAssignment_3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:500:2: rule__Definition__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Definition__TypeAssignment_3_in_rule__Definition__Group__3__Impl952);
            rule__Definition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:518:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:522:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:523:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__0990);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__0993);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:530:1: rule__Connection__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:534:1: ( ( 'connect' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:535:1: ( 'connect' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:535:1: ( 'connect' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:536:1: 'connect'
            {
             before(grammarAccess.getConnectionAccess().getConnectKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Connection__Group__0__Impl1021); 
             after(grammarAccess.getConnectionAccess().getConnectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:549:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:553:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:554:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11052);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11055);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:561:1: rule__Connection__Group__1__Impl : ( ( rule__Connection__NameAssignment_1 ) ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:565:1: ( ( ( rule__Connection__NameAssignment_1 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:566:1: ( ( rule__Connection__NameAssignment_1 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:566:1: ( ( rule__Connection__NameAssignment_1 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:567:1: ( rule__Connection__NameAssignment_1 )
            {
             before(grammarAccess.getConnectionAccess().getNameAssignment_1()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:568:1: ( rule__Connection__NameAssignment_1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:568:2: rule__Connection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Connection__NameAssignment_1_in_rule__Connection__Group__1__Impl1082);
            rule__Connection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:578:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:582:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:583:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21112);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21115);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:590:1: rule__Connection__Group__2__Impl : ( 'url' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:594:1: ( ( 'url' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:595:1: ( 'url' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:595:1: ( 'url' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:596:1: 'url'
            {
             before(grammarAccess.getConnectionAccess().getUrlKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Connection__Group__2__Impl1143); 
             after(grammarAccess.getConnectionAccess().getUrlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:609:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:613:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:614:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31174);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31177);
            rule__Connection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:621:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__UrlAssignment_3 ) ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:625:1: ( ( ( rule__Connection__UrlAssignment_3 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:626:1: ( ( rule__Connection__UrlAssignment_3 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:626:1: ( ( rule__Connection__UrlAssignment_3 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:627:1: ( rule__Connection__UrlAssignment_3 )
            {
             before(grammarAccess.getConnectionAccess().getUrlAssignment_3()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:628:1: ( rule__Connection__UrlAssignment_3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:628:2: rule__Connection__UrlAssignment_3
            {
            pushFollow(FOLLOW_rule__Connection__UrlAssignment_3_in_rule__Connection__Group__3__Impl1204);
            rule__Connection__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:638:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:642:1: ( rule__Connection__Group__4__Impl )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:643:2: rule__Connection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41234);
            rule__Connection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:649:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__Group_4__0 )? ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:653:1: ( ( ( rule__Connection__Group_4__0 )? ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:654:1: ( ( rule__Connection__Group_4__0 )? )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:654:1: ( ( rule__Connection__Group_4__0 )? )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:655:1: ( rule__Connection__Group_4__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_4()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:656:1: ( rule__Connection__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:656:2: rule__Connection__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1261);
                    rule__Connection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group_4__0"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:676:1: rule__Connection__Group_4__0 : rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 ;
    public final void rule__Connection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:680:1: ( rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:681:2: rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1
            {
            pushFollow(FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__01302);
            rule__Connection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__01305);
            rule__Connection__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__0"


    // $ANTLR start "rule__Connection__Group_4__0__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:688:1: rule__Connection__Group_4__0__Impl : ( 'username' ) ;
    public final void rule__Connection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:692:1: ( ( 'username' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:693:1: ( 'username' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:693:1: ( 'username' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:694:1: 'username'
            {
             before(grammarAccess.getConnectionAccess().getUsernameKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__Connection__Group_4__0__Impl1333); 
             after(grammarAccess.getConnectionAccess().getUsernameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__0__Impl"


    // $ANTLR start "rule__Connection__Group_4__1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:707:1: rule__Connection__Group_4__1 : rule__Connection__Group_4__1__Impl rule__Connection__Group_4__2 ;
    public final void rule__Connection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:711:1: ( rule__Connection__Group_4__1__Impl rule__Connection__Group_4__2 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:712:2: rule__Connection__Group_4__1__Impl rule__Connection__Group_4__2
            {
            pushFollow(FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__11364);
            rule__Connection__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_4__2_in_rule__Connection__Group_4__11367);
            rule__Connection__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__1"


    // $ANTLR start "rule__Connection__Group_4__1__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:719:1: rule__Connection__Group_4__1__Impl : ( ( rule__Connection__UsernameAssignment_4_1 ) ) ;
    public final void rule__Connection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:723:1: ( ( ( rule__Connection__UsernameAssignment_4_1 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:724:1: ( ( rule__Connection__UsernameAssignment_4_1 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:724:1: ( ( rule__Connection__UsernameAssignment_4_1 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:725:1: ( rule__Connection__UsernameAssignment_4_1 )
            {
             before(grammarAccess.getConnectionAccess().getUsernameAssignment_4_1()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:726:1: ( rule__Connection__UsernameAssignment_4_1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:726:2: rule__Connection__UsernameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Connection__UsernameAssignment_4_1_in_rule__Connection__Group_4__1__Impl1394);
            rule__Connection__UsernameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getUsernameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__1__Impl"


    // $ANTLR start "rule__Connection__Group_4__2"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:736:1: rule__Connection__Group_4__2 : rule__Connection__Group_4__2__Impl rule__Connection__Group_4__3 ;
    public final void rule__Connection__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:740:1: ( rule__Connection__Group_4__2__Impl rule__Connection__Group_4__3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:741:2: rule__Connection__Group_4__2__Impl rule__Connection__Group_4__3
            {
            pushFollow(FOLLOW_rule__Connection__Group_4__2__Impl_in_rule__Connection__Group_4__21424);
            rule__Connection__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connection__Group_4__3_in_rule__Connection__Group_4__21427);
            rule__Connection__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__2"


    // $ANTLR start "rule__Connection__Group_4__2__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:748:1: rule__Connection__Group_4__2__Impl : ( 'password' ) ;
    public final void rule__Connection__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:752:1: ( ( 'password' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:753:1: ( 'password' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:753:1: ( 'password' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:754:1: 'password'
            {
             before(grammarAccess.getConnectionAccess().getPasswordKeyword_4_2()); 
            match(input,21,FOLLOW_21_in_rule__Connection__Group_4__2__Impl1455); 
             after(grammarAccess.getConnectionAccess().getPasswordKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__2__Impl"


    // $ANTLR start "rule__Connection__Group_4__3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:767:1: rule__Connection__Group_4__3 : rule__Connection__Group_4__3__Impl ;
    public final void rule__Connection__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:771:1: ( rule__Connection__Group_4__3__Impl )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:772:2: rule__Connection__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Connection__Group_4__3__Impl_in_rule__Connection__Group_4__31486);
            rule__Connection__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__3"


    // $ANTLR start "rule__Connection__Group_4__3__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:778:1: rule__Connection__Group_4__3__Impl : ( ( rule__Connection__PasswordAssignment_4_3 ) ) ;
    public final void rule__Connection__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:782:1: ( ( ( rule__Connection__PasswordAssignment_4_3 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:783:1: ( ( rule__Connection__PasswordAssignment_4_3 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:783:1: ( ( rule__Connection__PasswordAssignment_4_3 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:784:1: ( rule__Connection__PasswordAssignment_4_3 )
            {
             before(grammarAccess.getConnectionAccess().getPasswordAssignment_4_3()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:785:1: ( rule__Connection__PasswordAssignment_4_3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:785:2: rule__Connection__PasswordAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Connection__PasswordAssignment_4_3_in_rule__Connection__Group_4__3__Impl1513);
            rule__Connection__PasswordAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getPasswordAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__3__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:803:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:807:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:808:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__01551);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__1_in_rule__Select__Group__01554);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:815:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:819:1: ( ( 'select' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:820:1: ( 'select' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:820:1: ( 'select' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:821:1: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Select__Group__0__Impl1582); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:834:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:838:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:839:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__11613);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__2_in_rule__Select__Group__11616);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:846:1: rule__Select__Group__1__Impl : ( ( rule__Select__AttributesAssignment_1 )* ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:850:1: ( ( ( rule__Select__AttributesAssignment_1 )* ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:851:1: ( ( rule__Select__AttributesAssignment_1 )* )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:851:1: ( ( rule__Select__AttributesAssignment_1 )* )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:852:1: ( rule__Select__AttributesAssignment_1 )*
            {
             before(grammarAccess.getSelectAccess().getAttributesAssignment_1()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:853:1: ( rule__Select__AttributesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:853:2: rule__Select__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Select__AttributesAssignment_1_in_rule__Select__Group__1__Impl1643);
            	    rule__Select__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:863:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:867:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:868:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__21674);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__3_in_rule__Select__Group__21677);
            rule__Select__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:875:1: rule__Select__Group__2__Impl : ( 'from' ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:879:1: ( ( 'from' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:880:1: ( 'from' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:880:1: ( 'from' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:881:1: 'from'
            {
             before(grammarAccess.getSelectAccess().getFromKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Select__Group__2__Impl1705); 
             after(grammarAccess.getSelectAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:894:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:898:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:899:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_rule__Select__Group__3__Impl_in_rule__Select__Group__31736);
            rule__Select__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group__4_in_rule__Select__Group__31739);
            rule__Select__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:906:1: rule__Select__Group__3__Impl : ( ( rule__Select__RelationsAssignment_3 )* ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:910:1: ( ( ( rule__Select__RelationsAssignment_3 )* ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:911:1: ( ( rule__Select__RelationsAssignment_3 )* )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:911:1: ( ( rule__Select__RelationsAssignment_3 )* )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:912:1: ( rule__Select__RelationsAssignment_3 )*
            {
             before(grammarAccess.getSelectAccess().getRelationsAssignment_3()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:913:1: ( rule__Select__RelationsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:913:2: rule__Select__RelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Select__RelationsAssignment_3_in_rule__Select__Group__3__Impl1766);
            	    rule__Select__RelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getRelationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Select__Group__4"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:923:1: rule__Select__Group__4 : rule__Select__Group__4__Impl ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:927:1: ( rule__Select__Group__4__Impl )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:928:2: rule__Select__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group__4__Impl_in_rule__Select__Group__41797);
            rule__Select__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__4"


    // $ANTLR start "rule__Select__Group__4__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:934:1: rule__Select__Group__4__Impl : ( ( rule__Select__Group_4__0 )? ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:938:1: ( ( ( rule__Select__Group_4__0 )? ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:939:1: ( ( rule__Select__Group_4__0 )? )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:939:1: ( ( rule__Select__Group_4__0 )? )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:940:1: ( rule__Select__Group_4__0 )?
            {
             before(grammarAccess.getSelectAccess().getGroup_4()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:941:1: ( rule__Select__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:941:2: rule__Select__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Select__Group_4__0_in_rule__Select__Group__4__Impl1824);
                    rule__Select__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__4__Impl"


    // $ANTLR start "rule__Select__Group_4__0"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:961:1: rule__Select__Group_4__0 : rule__Select__Group_4__0__Impl rule__Select__Group_4__1 ;
    public final void rule__Select__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:965:1: ( rule__Select__Group_4__0__Impl rule__Select__Group_4__1 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:966:2: rule__Select__Group_4__0__Impl rule__Select__Group_4__1
            {
            pushFollow(FOLLOW_rule__Select__Group_4__0__Impl_in_rule__Select__Group_4__01865);
            rule__Select__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Select__Group_4__1_in_rule__Select__Group_4__01868);
            rule__Select__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__0"


    // $ANTLR start "rule__Select__Group_4__0__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:973:1: rule__Select__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__Select__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:977:1: ( ( 'where' ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:978:1: ( 'where' )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:978:1: ( 'where' )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:979:1: 'where'
            {
             before(grammarAccess.getSelectAccess().getWhereKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Select__Group_4__0__Impl1896); 
             after(grammarAccess.getSelectAccess().getWhereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__0__Impl"


    // $ANTLR start "rule__Select__Group_4__1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:992:1: rule__Select__Group_4__1 : rule__Select__Group_4__1__Impl ;
    public final void rule__Select__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:996:1: ( rule__Select__Group_4__1__Impl )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:997:2: rule__Select__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Select__Group_4__1__Impl_in_rule__Select__Group_4__11927);
            rule__Select__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__1"


    // $ANTLR start "rule__Select__Group_4__1__Impl"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1003:1: rule__Select__Group_4__1__Impl : ( ( rule__Select__ConditionsAssignment_4_1 )* ) ;
    public final void rule__Select__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1007:1: ( ( ( rule__Select__ConditionsAssignment_4_1 )* ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1008:1: ( ( rule__Select__ConditionsAssignment_4_1 )* )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1008:1: ( ( rule__Select__ConditionsAssignment_4_1 )* )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1009:1: ( rule__Select__ConditionsAssignment_4_1 )*
            {
             before(grammarAccess.getSelectAccess().getConditionsAssignment_4_1()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1010:1: ( rule__Select__ConditionsAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1010:2: rule__Select__ConditionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Select__ConditionsAssignment_4_1_in_rule__Select__Group_4__1__Impl1954);
            	    rule__Select__ConditionsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getConditionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_4__1__Impl"


    // $ANTLR start "rule__Program__DefinitionsAssignment_1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1025:1: rule__Program__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Program__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1029:1: ( ( ruleDefinition ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1030:1: ( ruleDefinition )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1030:1: ( ruleDefinition )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1031:1: ruleDefinition
            {
             before(grammarAccess.getProgramAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__Program__DefinitionsAssignment_11994);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DefinitionsAssignment_1"


    // $ANTLR start "rule__Program__ConnectionsAssignment_3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1040:1: rule__Program__ConnectionsAssignment_3 : ( ruleConnection ) ;
    public final void rule__Program__ConnectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1044:1: ( ( ruleConnection ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1045:1: ( ruleConnection )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1045:1: ( ruleConnection )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1046:1: ruleConnection
            {
             before(grammarAccess.getProgramAccess().getConnectionsConnectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConnection_in_rule__Program__ConnectionsAssignment_32025);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getConnectionsConnectionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ConnectionsAssignment_3"


    // $ANTLR start "rule__Program__QueriesAssignment_5"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1055:1: rule__Program__QueriesAssignment_5 : ( ruleSelect ) ;
    public final void rule__Program__QueriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1059:1: ( ( ruleSelect ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1060:1: ( ruleSelect )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1060:1: ( ruleSelect )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1061:1: ruleSelect
            {
             before(grammarAccess.getProgramAccess().getQueriesSelectParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSelect_in_rule__Program__QueriesAssignment_52056);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getQueriesSelectParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__QueriesAssignment_5"


    // $ANTLR start "rule__Definition__NameAssignment_1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1070:1: rule__Definition__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1074:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1075:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1075:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1076:1: RULE_STRING
            {
             before(grammarAccess.getDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Definition__NameAssignment_12087); 
             after(grammarAccess.getDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__NameAssignment_1"


    // $ANTLR start "rule__Definition__TypeAssignment_3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1085:1: rule__Definition__TypeAssignment_3 : ( ( rule__Definition__TypeAlternatives_3_0 ) ) ;
    public final void rule__Definition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1089:1: ( ( ( rule__Definition__TypeAlternatives_3_0 ) ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1090:1: ( ( rule__Definition__TypeAlternatives_3_0 ) )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1090:1: ( ( rule__Definition__TypeAlternatives_3_0 ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1091:1: ( rule__Definition__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getDefinitionAccess().getTypeAlternatives_3_0()); 
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1092:1: ( rule__Definition__TypeAlternatives_3_0 )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1092:2: rule__Definition__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Definition__TypeAlternatives_3_0_in_rule__Definition__TypeAssignment_32118);
            rule__Definition__TypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getTypeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__TypeAssignment_3"


    // $ANTLR start "rule__Connection__NameAssignment_1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1101:1: rule__Connection__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Connection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1105:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1106:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1106:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1107:1: RULE_STRING
            {
             before(grammarAccess.getConnectionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Connection__NameAssignment_12151); 
             after(grammarAccess.getConnectionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__NameAssignment_1"


    // $ANTLR start "rule__Connection__UrlAssignment_3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1116:1: rule__Connection__UrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Connection__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1120:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1121:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1121:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1122:1: RULE_STRING
            {
             before(grammarAccess.getConnectionAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Connection__UrlAssignment_32182); 
             after(grammarAccess.getConnectionAccess().getUrlSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UrlAssignment_3"


    // $ANTLR start "rule__Connection__UsernameAssignment_4_1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1131:1: rule__Connection__UsernameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Connection__UsernameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1135:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1136:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1136:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1137:1: RULE_STRING
            {
             before(grammarAccess.getConnectionAccess().getUsernameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Connection__UsernameAssignment_4_12213); 
             after(grammarAccess.getConnectionAccess().getUsernameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UsernameAssignment_4_1"


    // $ANTLR start "rule__Connection__PasswordAssignment_4_3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1146:1: rule__Connection__PasswordAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__Connection__PasswordAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1150:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1151:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1151:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1152:1: RULE_STRING
            {
             before(grammarAccess.getConnectionAccess().getPasswordSTRINGTerminalRuleCall_4_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Connection__PasswordAssignment_4_32244); 
             after(grammarAccess.getConnectionAccess().getPasswordSTRINGTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__PasswordAssignment_4_3"


    // $ANTLR start "rule__Select__AttributesAssignment_1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1161:1: rule__Select__AttributesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Select__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1165:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1166:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1166:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1167:1: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getAttributesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Select__AttributesAssignment_12275); 
             after(grammarAccess.getSelectAccess().getAttributesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__AttributesAssignment_1"


    // $ANTLR start "rule__Select__RelationsAssignment_3"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1176:1: rule__Select__RelationsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Select__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1180:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1181:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1181:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1182:1: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getRelationsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Select__RelationsAssignment_32306); 
             after(grammarAccess.getSelectAccess().getRelationsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__RelationsAssignment_3"


    // $ANTLR start "rule__Select__ConditionsAssignment_4_1"
    // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1191:1: rule__Select__ConditionsAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Select__ConditionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1195:1: ( ( RULE_STRING ) )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1196:1: ( RULE_STRING )
            {
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1196:1: ( RULE_STRING )
            // ../fr.imag.unql.ui/src-gen/fr/imag/ui/contentassist/antlr/internal/InternalUnql.g:1197:1: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getConditionsSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Select__ConditionsAssignment_4_12337); 
             after(grammarAccess.getSelectAccess().getConditionsSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ConditionsAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0_in_ruleConnection214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0_in_ruleSelect274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Definition__TypeAlternatives_3_0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Definition__TypeAlternatives_3_0331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__0363 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__0366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Program__Group__0__Impl394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__1425 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__DefinitionsAssignment_1_in_rule__Program__Group__1__Impl455 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__2486 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Program__Group__3_in_rule__Program__Group__2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Program__Group__2__Impl517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__3__Impl_in_rule__Program__Group__3548 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Program__Group__4_in_rule__Program__Group__3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ConnectionsAssignment_3_in_rule__Program__Group__3__Impl578 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Program__Group__4__Impl_in_rule__Program__Group__4609 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Program__Group__5_in_rule__Program__Group__4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Program__Group__4__Impl640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__5__Impl_in_rule__Program__Group__5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__QueriesAssignment_5_in_rule__Program__Group__5__Impl698 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__0741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__0744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Definition__Group__0__Impl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__1803 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_1_in_rule__Definition__Group__1__Impl833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__2863 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definition__Group__2__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__TypeAssignment_3_in_rule__Definition__Group__3__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__0990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__0993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Connection__Group__0__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__11052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__NameAssignment_1_in_rule__Connection__Group__1__Impl1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__21112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__21115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Connection__Group__2__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__31174 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Connection__Group__4_in_rule__Connection__Group__31177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__UrlAssignment_3_in_rule__Connection__Group__3__Impl1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group__4__Impl_in_rule__Connection__Group__41234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__0_in_rule__Connection__Group__4__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__0__Impl_in_rule__Connection__Group_4__01302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__1_in_rule__Connection__Group_4__01305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Connection__Group_4__0__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__1__Impl_in_rule__Connection__Group_4__11364 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__2_in_rule__Connection__Group_4__11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__UsernameAssignment_4_1_in_rule__Connection__Group_4__1__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__2__Impl_in_rule__Connection__Group_4__21424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__3_in_rule__Connection__Group_4__21427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Connection__Group_4__2__Impl1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Group_4__3__Impl_in_rule__Connection__Group_4__31486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__PasswordAssignment_4_3_in_rule__Connection__Group_4__3__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__0__Impl_in_rule__Select__Group__01551 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Select__Group__1_in_rule__Select__Group__01554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Select__Group__0__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__1__Impl_in_rule__Select__Group__11613 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Select__Group__2_in_rule__Select__Group__11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__AttributesAssignment_1_in_rule__Select__Group__1__Impl1643 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Select__Group__2__Impl_in_rule__Select__Group__21674 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Select__Group__3_in_rule__Select__Group__21677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Select__Group__2__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group__3__Impl_in_rule__Select__Group__31736 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Select__Group__4_in_rule__Select__Group__31739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__RelationsAssignment_3_in_rule__Select__Group__3__Impl1766 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Select__Group__4__Impl_in_rule__Select__Group__41797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_4__0_in_rule__Select__Group__4__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_4__0__Impl_in_rule__Select__Group_4__01865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Select__Group_4__1_in_rule__Select__Group_4__01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Select__Group_4__0__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__Group_4__1__Impl_in_rule__Select__Group_4__11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Select__ConditionsAssignment_4_1_in_rule__Select__Group_4__1__Impl1954 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Program__DefinitionsAssignment_11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_rule__Program__ConnectionsAssignment_32025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_rule__Program__QueriesAssignment_52056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Definition__NameAssignment_12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__TypeAlternatives_3_0_in_rule__Definition__TypeAssignment_32118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Connection__NameAssignment_12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Connection__UrlAssignment_32182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Connection__UsernameAssignment_4_12213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Connection__PasswordAssignment_4_32244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Select__AttributesAssignment_12275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Select__RelationsAssignment_32306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Select__ConditionsAssignment_4_12337 = new BitSet(new long[]{0x0000000000000002L});

}