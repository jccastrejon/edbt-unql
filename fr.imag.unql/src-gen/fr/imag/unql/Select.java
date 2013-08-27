/**
 */
package fr.imag.unql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.imag.unql.Select#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.imag.unql.Select#getRelations <em>Relations</em>}</li>
 *   <li>{@link fr.imag.unql.Select#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.imag.unql.UnqlPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute list.
   * @see fr.imag.unql.UnqlPackage#getSelect_Attributes()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttributes();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' attribute list.
   * @see fr.imag.unql.UnqlPackage#getSelect_Relations()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelations();

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' attribute list.
   * @see fr.imag.unql.UnqlPackage#getSelect_Conditions()
   * @model unique="false"
   * @generated
   */
  EList<String> getConditions();

} // Select
