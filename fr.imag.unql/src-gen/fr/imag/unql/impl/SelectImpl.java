/**
 */
package fr.imag.unql.impl;

import fr.imag.unql.Select;
import fr.imag.unql.UnqlPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.imag.unql.impl.SelectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link fr.imag.unql.impl.SelectImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link fr.imag.unql.impl.SelectImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectImpl extends MinimalEObjectImpl.Container implements Select
{
  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<String> attributes;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<String> relations;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<String> conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnqlPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EDataTypeEList<String>(String.class, this, UnqlPackage.SELECT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRelations()
  {
    if (relations == null)
    {
      relations = new EDataTypeEList<String>(String.class, this, UnqlPackage.SELECT__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EDataTypeEList<String>(String.class, this, UnqlPackage.SELECT__CONDITIONS);
    }
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnqlPackage.SELECT__ATTRIBUTES:
        return getAttributes();
      case UnqlPackage.SELECT__RELATIONS:
        return getRelations();
      case UnqlPackage.SELECT__CONDITIONS:
        return getConditions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnqlPackage.SELECT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends String>)newValue);
        return;
      case UnqlPackage.SELECT__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends String>)newValue);
        return;
      case UnqlPackage.SELECT__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnqlPackage.SELECT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case UnqlPackage.SELECT__RELATIONS:
        getRelations().clear();
        return;
      case UnqlPackage.SELECT__CONDITIONS:
        getConditions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnqlPackage.SELECT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case UnqlPackage.SELECT__RELATIONS:
        return relations != null && !relations.isEmpty();
      case UnqlPackage.SELECT__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (attributes: ");
    result.append(attributes);
    result.append(", relations: ");
    result.append(relations);
    result.append(", conditions: ");
    result.append(conditions);
    result.append(')');
    return result.toString();
  }

} //SelectImpl
