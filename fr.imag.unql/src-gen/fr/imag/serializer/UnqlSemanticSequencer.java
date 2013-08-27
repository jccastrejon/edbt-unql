package fr.imag.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.imag.services.UnqlGrammarAccess;
import fr.imag.unql.Connection;
import fr.imag.unql.Definition;
import fr.imag.unql.Program;
import fr.imag.unql.Select;
import fr.imag.unql.UnqlPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class UnqlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UnqlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == UnqlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UnqlPackage.CONNECTION:
				if(context == grammarAccess.getConnectionRule()) {
					sequence_Connection(context, (Connection) semanticObject); 
					return; 
				}
				else break;
			case UnqlPackage.DEFINITION:
				if(context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case UnqlPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case UnqlPackage.SELECT:
				if(context == grammarAccess.getSelectRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING url=STRING (username=STRING password=STRING)?)
	 */
	protected void sequence_Connection(EObject context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING (type='graph' | type='document'))
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (definitions+=Definition* connections+=Connection* queries+=Select*)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=STRING* relations+=STRING* conditions+=STRING*)
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
