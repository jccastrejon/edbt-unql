/*
* generated by Xtext
*/

package fr.imag.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class UnqlGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefinitionsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDefinitionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDefinitionsDefinitionParserRuleCall_1_0 = (RuleCall)cDefinitionsAssignment_1.eContents().get(0);
		private final Keyword cConnectionsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cConnectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConnectionsConnectionParserRuleCall_3_0 = (RuleCall)cConnectionsAssignment_3.eContents().get(0);
		private final Keyword cQueriesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cQueriesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cQueriesSelectParserRuleCall_5_0 = (RuleCall)cQueriesAssignment_5.eContents().get(0);
		
		//Program:
		//	"[Definitions]" definitions+=Definition* "[Connections]" connections+=Connection* "[Queries]" queries+=Select*;
		public ParserRule getRule() { return rule; }

		//"[Definitions]" definitions+=Definition* "[Connections]" connections+=Connection* "[Queries]" queries+=Select*
		public Group getGroup() { return cGroup; }

		//"[Definitions]"
		public Keyword getDefinitionsKeyword_0() { return cDefinitionsKeyword_0; }

		//definitions+=Definition*
		public Assignment getDefinitionsAssignment_1() { return cDefinitionsAssignment_1; }

		//Definition
		public RuleCall getDefinitionsDefinitionParserRuleCall_1_0() { return cDefinitionsDefinitionParserRuleCall_1_0; }

		//"[Connections]"
		public Keyword getConnectionsKeyword_2() { return cConnectionsKeyword_2; }

		//connections+=Connection*
		public Assignment getConnectionsAssignment_3() { return cConnectionsAssignment_3; }

		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_3_0() { return cConnectionsConnectionParserRuleCall_3_0; }

		//"[Queries]"
		public Keyword getQueriesKeyword_4() { return cQueriesKeyword_4; }

		//queries+=Select*
		public Assignment getQueriesAssignment_5() { return cQueriesAssignment_5; }

		//Select
		public RuleCall getQueriesSelectParserRuleCall_5_0() { return cQueriesSelectParserRuleCall_5_0; }
	}

	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Definition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Alternatives cTypeAlternatives_3_0 = (Alternatives)cTypeAssignment_3.eContents().get(0);
		private final Keyword cTypeGraphKeyword_3_0_0 = (Keyword)cTypeAlternatives_3_0.eContents().get(0);
		private final Keyword cTypeDocumentKeyword_3_0_1 = (Keyword)cTypeAlternatives_3_0.eContents().get(1);
		
		//Definition:
		//	"define" name=STRING "as" type=("graph" | "document");
		public ParserRule getRule() { return rule; }

		//"define" name=STRING "as" type=("graph" | "document")
		public Group getGroup() { return cGroup; }

		//"define"
		public Keyword getDefineKeyword_0() { return cDefineKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//"as"
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }

		//type=("graph" | "document")
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//"graph" | "document"
		public Alternatives getTypeAlternatives_3_0() { return cTypeAlternatives_3_0; }

		//"graph"
		public Keyword getTypeGraphKeyword_3_0_0() { return cTypeGraphKeyword_3_0_0; }

		//"document"
		public Keyword getTypeDocumentKeyword_3_0_1() { return cTypeDocumentKeyword_3_0_1; }
	}

	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cUrlKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUrlAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUrlSTRINGTerminalRuleCall_3_0 = (RuleCall)cUrlAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cUsernameKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cUsernameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cUsernameSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cUsernameAssignment_4_1.eContents().get(0);
		private final Keyword cPasswordKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cPasswordAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final RuleCall cPasswordSTRINGTerminalRuleCall_4_3_0 = (RuleCall)cPasswordAssignment_4_3.eContents().get(0);
		
		//Connection:
		//	"connect" name=STRING "url" url=STRING ("username" username=STRING "password" password=STRING)?;
		public ParserRule getRule() { return rule; }

		//"connect" name=STRING "url" url=STRING ("username" username=STRING "password" password=STRING)?
		public Group getGroup() { return cGroup; }

		//"connect"
		public Keyword getConnectKeyword_0() { return cConnectKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//"url"
		public Keyword getUrlKeyword_2() { return cUrlKeyword_2; }

		//url=STRING
		public Assignment getUrlAssignment_3() { return cUrlAssignment_3; }

		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_3_0() { return cUrlSTRINGTerminalRuleCall_3_0; }

		//("username" username=STRING "password" password=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"username"
		public Keyword getUsernameKeyword_4_0() { return cUsernameKeyword_4_0; }

		//username=STRING
		public Assignment getUsernameAssignment_4_1() { return cUsernameAssignment_4_1; }

		//STRING
		public RuleCall getUsernameSTRINGTerminalRuleCall_4_1_0() { return cUsernameSTRINGTerminalRuleCall_4_1_0; }

		//"password"
		public Keyword getPasswordKeyword_4_2() { return cPasswordKeyword_4_2; }

		//password=STRING
		public Assignment getPasswordAssignment_4_3() { return cPasswordAssignment_4_3; }

		//STRING
		public RuleCall getPasswordSTRINGTerminalRuleCall_4_3_0() { return cPasswordSTRINGTerminalRuleCall_4_3_0; }
	}

	public class SelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Select");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttributesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttributesSTRINGTerminalRuleCall_1_0 = (RuleCall)cAttributesAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRelationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRelationsSTRINGTerminalRuleCall_3_0 = (RuleCall)cRelationsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cWhereKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cConditionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cConditionsSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cConditionsAssignment_4_1.eContents().get(0);
		
		//Select:
		//	"select" attributes+=STRING* "from" relations+=STRING* ("where" conditions+=STRING*)?;
		public ParserRule getRule() { return rule; }

		//"select" attributes+=STRING* "from" relations+=STRING* ("where" conditions+=STRING*)?
		public Group getGroup() { return cGroup; }

		//"select"
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }

		//attributes+=STRING*
		public Assignment getAttributesAssignment_1() { return cAttributesAssignment_1; }

		//STRING
		public RuleCall getAttributesSTRINGTerminalRuleCall_1_0() { return cAttributesSTRINGTerminalRuleCall_1_0; }

		//"from"
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }

		//relations+=STRING*
		public Assignment getRelationsAssignment_3() { return cRelationsAssignment_3; }

		//STRING
		public RuleCall getRelationsSTRINGTerminalRuleCall_3_0() { return cRelationsSTRINGTerminalRuleCall_3_0; }

		//("where" conditions+=STRING*)?
		public Group getGroup_4() { return cGroup_4; }

		//"where"
		public Keyword getWhereKeyword_4_0() { return cWhereKeyword_4_0; }

		//conditions+=STRING*
		public Assignment getConditionsAssignment_4_1() { return cConditionsAssignment_4_1; }

		//STRING
		public RuleCall getConditionsSTRINGTerminalRuleCall_4_1_0() { return cConditionsSTRINGTerminalRuleCall_4_1_0; }
	}
	
	
	private ProgramElements pProgram;
	private DefinitionElements pDefinition;
	private ConnectionElements pConnection;
	private SelectElements pSelect;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public UnqlGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.imag.Unql".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//	"[Definitions]" definitions+=Definition* "[Connections]" connections+=Connection* "[Queries]" queries+=Select*;
	public ProgramElements getProgramAccess() {
		return (pProgram != null) ? pProgram : (pProgram = new ProgramElements());
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//Definition:
	//	"define" name=STRING "as" type=("graph" | "document");
	public DefinitionElements getDefinitionAccess() {
		return (pDefinition != null) ? pDefinition : (pDefinition = new DefinitionElements());
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}

	//Connection:
	//	"connect" name=STRING "url" url=STRING ("username" username=STRING "password" password=STRING)?;
	public ConnectionElements getConnectionAccess() {
		return (pConnection != null) ? pConnection : (pConnection = new ConnectionElements());
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}

	//Select:
	//	"select" attributes+=STRING* "from" relations+=STRING* ("where" conditions+=STRING*)?;
	public SelectElements getSelectAccess() {
		return (pSelect != null) ? pSelect : (pSelect = new SelectElements());
	}
	
	public ParserRule getSelectRule() {
		return getSelectAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
