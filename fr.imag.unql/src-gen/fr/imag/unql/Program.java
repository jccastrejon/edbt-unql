/**
 */
package fr.imag.unql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imag.unql.Program#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link fr.imag.unql.Program#getConnections <em>Connections</em>}</li>
 *   <li>{@link fr.imag.unql.Program#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imag.unql.UnqlPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.unql.Definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see fr.imag.unql.UnqlPackage#getProgram_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<Definition> getDefinitions();

  /**
   * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.unql.Connection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connections</em>' containment reference list.
   * @see fr.imag.unql.UnqlPackage#getProgram_Connections()
   * @model containment="true"
   * @generated
   */
  EList<Connection> getConnections();

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link fr.imag.unql.Select}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see fr.imag.unql.UnqlPackage#getProgram_Queries()
   * @model containment="true"
   * @generated
   */
  EList<Select> getQueries();

} // Program
