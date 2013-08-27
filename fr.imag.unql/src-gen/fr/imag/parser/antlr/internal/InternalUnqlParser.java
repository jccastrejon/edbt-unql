package fr.imag.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imag.services.UnqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[Definitions]'", "'[Connections]'", "'[Queries]'", "'define'", "'as'", "'graph'", "'document'", "'connect'", "'url'", "'username'", "'password'", "'select'", "'from'", "'where'"
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
    public String getGrammarFileName() { return "../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g"; }



     	private UnqlGrammarAccess grammarAccess;
     	
        public InternalUnqlParser(TokenStream input, UnqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected UnqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:76:1: ruleProgram returns [EObject current=null] : (otherlv_0= '[Definitions]' ( (lv_definitions_1_0= ruleDefinition ) )* otherlv_2= '[Connections]' ( (lv_connections_3_0= ruleConnection ) )* otherlv_4= '[Queries]' ( (lv_queries_5_0= ruleSelect ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_definitions_1_0 = null;

        EObject lv_connections_3_0 = null;

        EObject lv_queries_5_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:79:28: ( (otherlv_0= '[Definitions]' ( (lv_definitions_1_0= ruleDefinition ) )* otherlv_2= '[Connections]' ( (lv_connections_3_0= ruleConnection ) )* otherlv_4= '[Queries]' ( (lv_queries_5_0= ruleSelect ) )* ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:80:1: (otherlv_0= '[Definitions]' ( (lv_definitions_1_0= ruleDefinition ) )* otherlv_2= '[Connections]' ( (lv_connections_3_0= ruleConnection ) )* otherlv_4= '[Queries]' ( (lv_queries_5_0= ruleSelect ) )* )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:80:1: (otherlv_0= '[Definitions]' ( (lv_definitions_1_0= ruleDefinition ) )* otherlv_2= '[Connections]' ( (lv_connections_3_0= ruleConnection ) )* otherlv_4= '[Queries]' ( (lv_queries_5_0= ruleSelect ) )* )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:80:3: otherlv_0= '[Definitions]' ( (lv_definitions_1_0= ruleDefinition ) )* otherlv_2= '[Connections]' ( (lv_connections_3_0= ruleConnection ) )* otherlv_4= '[Queries]' ( (lv_queries_5_0= ruleSelect ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getDefinitionsKeyword_0());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:84:1: ( (lv_definitions_1_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:85:1: (lv_definitions_1_0= ruleDefinition )
            	    {
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:85:1: (lv_definitions_1_0= ruleDefinition )
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:86:3: lv_definitions_1_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleProgram143);
            	    lv_definitions_1_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_1_0, 
            	            		"Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProgram156); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getConnectionsKeyword_2());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:106:1: ( (lv_connections_3_0= ruleConnection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:107:1: (lv_connections_3_0= ruleConnection )
            	    {
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:107:1: (lv_connections_3_0= ruleConnection )
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:108:3: lv_connections_3_0= ruleConnection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getConnectionsConnectionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnection_in_ruleProgram177);
            	    lv_connections_3_0=ruleConnection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connections",
            	            		lv_connections_3_0, 
            	            		"Connection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProgram190); 

                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getQueriesKeyword_4());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:128:1: ( (lv_queries_5_0= ruleSelect ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:129:1: (lv_queries_5_0= ruleSelect )
            	    {
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:129:1: (lv_queries_5_0= ruleSelect )
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:130:3: lv_queries_5_0= ruleSelect
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getQueriesSelectParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelect_in_ruleProgram211);
            	    lv_queries_5_0=ruleSelect();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"queries",
            	            		lv_queries_5_0, 
            	            		"Select");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDefinition"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:154:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:155:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:156:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition248);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition258); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:163:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;

         enterRule(); 
            
        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:166:28: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) ) ) ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:167:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) ) ) )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:167:1: (otherlv_0= 'define' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) ) ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:167:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDefinition295); 

                	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefineKeyword_0());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:171:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:172:1: (lv_name_1_0= RULE_STRING )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:172:1: (lv_name_1_0= RULE_STRING )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:173:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefinition312); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDefinition329); 

                	newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getAsKeyword_2());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:193:1: ( ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:194:1: ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:194:1: ( (lv_type_3_1= 'graph' | lv_type_3_2= 'document' ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:195:1: (lv_type_3_1= 'graph' | lv_type_3_2= 'document' )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:195:1: (lv_type_3_1= 'graph' | lv_type_3_2= 'document' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:196:3: lv_type_3_1= 'graph'
                    {
                    lv_type_3_1=(Token)match(input,16,FOLLOW_16_in_ruleDefinition349); 

                            newLeafNode(lv_type_3_1, grammarAccess.getDefinitionAccess().getTypeGraphKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:208:8: lv_type_3_2= 'document'
                    {
                    lv_type_3_2=(Token)match(input,17,FOLLOW_17_in_ruleDefinition378); 

                            newLeafNode(lv_type_3_2, grammarAccess.getDefinitionAccess().getTypeDocumentKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleConnection"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:231:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:232:2: (iv_ruleConnection= ruleConnection EOF )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:233:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection430);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection440); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:240:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'connect' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'url' ( (lv_url_3_0= RULE_STRING ) ) (otherlv_4= 'username' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_password_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_url_3_0=null;
        Token otherlv_4=null;
        Token lv_username_5_0=null;
        Token otherlv_6=null;
        Token lv_password_7_0=null;

         enterRule(); 
            
        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:243:28: ( (otherlv_0= 'connect' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'url' ( (lv_url_3_0= RULE_STRING ) ) (otherlv_4= 'username' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_password_7_0= RULE_STRING ) ) )? ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:244:1: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'url' ( (lv_url_3_0= RULE_STRING ) ) (otherlv_4= 'username' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_password_7_0= RULE_STRING ) ) )? )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:244:1: (otherlv_0= 'connect' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'url' ( (lv_url_3_0= RULE_STRING ) ) (otherlv_4= 'username' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_password_7_0= RULE_STRING ) ) )? )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:244:3: otherlv_0= 'connect' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'url' ( (lv_url_3_0= RULE_STRING ) ) (otherlv_4= 'username' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_password_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleConnection477); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectKeyword_0());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:248:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:249:1: (lv_name_1_0= RULE_STRING )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:249:1: (lv_name_1_0= RULE_STRING )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:250:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConnection494); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConnectionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleConnection511); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getUrlKeyword_2());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:270:1: ( (lv_url_3_0= RULE_STRING ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:271:1: (lv_url_3_0= RULE_STRING )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:271:1: (lv_url_3_0= RULE_STRING )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:272:3: lv_url_3_0= RULE_STRING
            {
            lv_url_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConnection528); 

            			newLeafNode(lv_url_3_0, grammarAccess.getConnectionAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:288:2: (otherlv_4= 'username' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_password_7_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:288:4: otherlv_4= 'username' ( (lv_username_5_0= RULE_STRING ) ) otherlv_6= 'password' ( (lv_password_7_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConnection546); 

                        	newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getUsernameKeyword_4_0());
                        
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:292:1: ( (lv_username_5_0= RULE_STRING ) )
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:293:1: (lv_username_5_0= RULE_STRING )
                    {
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:293:1: (lv_username_5_0= RULE_STRING )
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:294:3: lv_username_5_0= RULE_STRING
                    {
                    lv_username_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConnection563); 

                    			newLeafNode(lv_username_5_0, grammarAccess.getConnectionAccess().getUsernameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"username",
                            		lv_username_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleConnection580); 

                        	newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getPasswordKeyword_4_2());
                        
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:314:1: ( (lv_password_7_0= RULE_STRING ) )
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:315:1: (lv_password_7_0= RULE_STRING )
                    {
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:315:1: (lv_password_7_0= RULE_STRING )
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:316:3: lv_password_7_0= RULE_STRING
                    {
                    lv_password_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConnection597); 

                    			newLeafNode(lv_password_7_0, grammarAccess.getConnectionAccess().getPasswordSTRINGTerminalRuleCall_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"password",
                            		lv_password_7_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleSelect"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:340:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:341:2: (iv_ruleSelect= ruleSelect EOF )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:342:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect640);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect650); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:349:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_attributes_1_0= RULE_STRING ) )* otherlv_2= 'from' ( (lv_relations_3_0= RULE_STRING ) )* (otherlv_4= 'where' ( (lv_conditions_5_0= RULE_STRING ) )* )? ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attributes_1_0=null;
        Token otherlv_2=null;
        Token lv_relations_3_0=null;
        Token otherlv_4=null;
        Token lv_conditions_5_0=null;

         enterRule(); 
            
        try {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:352:28: ( (otherlv_0= 'select' ( (lv_attributes_1_0= RULE_STRING ) )* otherlv_2= 'from' ( (lv_relations_3_0= RULE_STRING ) )* (otherlv_4= 'where' ( (lv_conditions_5_0= RULE_STRING ) )* )? ) )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:353:1: (otherlv_0= 'select' ( (lv_attributes_1_0= RULE_STRING ) )* otherlv_2= 'from' ( (lv_relations_3_0= RULE_STRING ) )* (otherlv_4= 'where' ( (lv_conditions_5_0= RULE_STRING ) )* )? )
            {
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:353:1: (otherlv_0= 'select' ( (lv_attributes_1_0= RULE_STRING ) )* otherlv_2= 'from' ( (lv_relations_3_0= RULE_STRING ) )* (otherlv_4= 'where' ( (lv_conditions_5_0= RULE_STRING ) )* )? )
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:353:3: otherlv_0= 'select' ( (lv_attributes_1_0= RULE_STRING ) )* otherlv_2= 'from' ( (lv_relations_3_0= RULE_STRING ) )* (otherlv_4= 'where' ( (lv_conditions_5_0= RULE_STRING ) )* )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSelect687); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:357:1: ( (lv_attributes_1_0= RULE_STRING ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:358:1: (lv_attributes_1_0= RULE_STRING )
            	    {
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:358:1: (lv_attributes_1_0= RULE_STRING )
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:359:3: lv_attributes_1_0= RULE_STRING
            	    {
            	    lv_attributes_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelect704); 

            	    			newLeafNode(lv_attributes_1_0, grammarAccess.getSelectAccess().getAttributesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSelectRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSelect722); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getFromKeyword_2());
                
            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:379:1: ( (lv_relations_3_0= RULE_STRING ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:380:1: (lv_relations_3_0= RULE_STRING )
            	    {
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:380:1: (lv_relations_3_0= RULE_STRING )
            	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:381:3: lv_relations_3_0= RULE_STRING
            	    {
            	    lv_relations_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelect739); 

            	    			newLeafNode(lv_relations_3_0, grammarAccess.getSelectAccess().getRelationsSTRINGTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSelectRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"relations",
            	            		lv_relations_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:397:3: (otherlv_4= 'where' ( (lv_conditions_5_0= RULE_STRING ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:397:5: otherlv_4= 'where' ( (lv_conditions_5_0= RULE_STRING ) )*
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleSelect758); 

                        	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getWhereKeyword_4_0());
                        
                    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:401:1: ( (lv_conditions_5_0= RULE_STRING ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:402:1: (lv_conditions_5_0= RULE_STRING )
                    	    {
                    	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:402:1: (lv_conditions_5_0= RULE_STRING )
                    	    // ../fr.imag.unql/src-gen/fr/imag/parser/antlr/internal/InternalUnql.g:403:3: lv_conditions_5_0= RULE_STRING
                    	    {
                    	    lv_conditions_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelect775); 

                    	    			newLeafNode(lv_conditions_5_0, grammarAccess.getSelectAccess().getConditionsSTRINGTerminalRuleCall_4_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSelectRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"conditions",
                    	            		lv_conditions_5_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "ruleSelect"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProgram122 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleProgram143 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleProgram156 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleConnection_in_ruleProgram177 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleProgram190 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleProgram211 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDefinition295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefinition312 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDefinition329 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleDefinition349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDefinition378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleConnection477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConnection494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConnection511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConnection528 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleConnection546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConnection563 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConnection580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConnection597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSelect687 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelect704 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_ruleSelect722 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelect739 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_ruleSelect758 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelect775 = new BitSet(new long[]{0x0000000000000012L});

}