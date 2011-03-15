/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcCurrencyRelationship;
import org.bimserver.models.ifc2x3.IfcDateAndTime;
import org.bimserver.models.ifc2x3.IfcLibraryInformation;
import org.bimserver.models.ifc2x3.IfcMonetaryUnit;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Currency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCurrencyRelationshipImpl#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCurrencyRelationshipImpl#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCurrencyRelationshipImpl#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCurrencyRelationshipImpl#getExchangeRateAsString <em>Exchange Rate As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCurrencyRelationshipImpl#getRateDateTime <em>Rate Date Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCurrencyRelationshipImpl#getRateSource <em>Rate Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurrencyRelationshipImpl extends IdEObjectImpl implements IfcCurrencyRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurrencyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit getRelatingMonetaryUnit() {
		return (IfcMonetaryUnit)eGet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RelatingMonetaryUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingMonetaryUnit(IfcMonetaryUnit newRelatingMonetaryUnit) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RelatingMonetaryUnit(), newRelatingMonetaryUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit getRelatedMonetaryUnit() {
		return (IfcMonetaryUnit)eGet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RelatedMonetaryUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedMonetaryUnit(IfcMonetaryUnit newRelatedMonetaryUnit) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RelatedMonetaryUnit(), newRelatedMonetaryUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getExchangeRate() {
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeRate(float newExchangeRate) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRate(), newExchangeRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangeRateAsString() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRateAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeRateAsString(String newExchangeRateAsString) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_ExchangeRateAsString(), newExchangeRateAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getRateDateTime() {
		return (IfcDateAndTime)eGet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RateDateTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDateTime(IfcDateAndTime newRateDateTime) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RateDateTime(), newRateDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibraryInformation getRateSource() {
		return (IfcLibraryInformation)eGet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RateSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateSource(IfcLibraryInformation newRateSource) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RateSource(), newRateSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRateSource() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RateSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRateSource() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcCurrencyRelationship_RateSource());
	}

} //IfcCurrencyRelationshipImpl