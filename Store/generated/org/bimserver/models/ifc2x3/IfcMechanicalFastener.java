/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Fastener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameterAsString <em>Nominal Diameter As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLengthAsString <em>Nominal Length As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalFastener()
 * @model
 * @generated
 */
public interface IfcMechanicalFastener extends IfcFastener {
	/**
	 * Returns the value of the '<em><b>Nominal Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #setNominalDiameter(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalFastener_NominalDiameter()
	 * @model unsettable="true"
	 * @generated
	 */
	float getNominalDiameter();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter</em>' attribute.
	 * @see #isSetNominalDiameter()
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @generated
	 */
	void setNominalDiameter(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(float)
	 * @generated
	 */
	void unsetNominalDiameter();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameter <em>Nominal Diameter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Diameter</em>' attribute is set.
	 * @see #unsetNominalDiameter()
	 * @see #getNominalDiameter()
	 * @see #setNominalDiameter(float)
	 * @generated
	 */
	boolean isSetNominalDiameter();

	/**
	 * Returns the value of the '<em><b>Nominal Diameter As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter As String</em>' attribute.
	 * @see #isSetNominalDiameterAsString()
	 * @see #unsetNominalDiameterAsString()
	 * @see #setNominalDiameterAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalFastener_NominalDiameterAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getNominalDiameterAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameterAsString <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter As String</em>' attribute.
	 * @see #isSetNominalDiameterAsString()
	 * @see #unsetNominalDiameterAsString()
	 * @see #getNominalDiameterAsString()
	 * @generated
	 */
	void setNominalDiameterAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameterAsString <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalDiameterAsString()
	 * @see #getNominalDiameterAsString()
	 * @see #setNominalDiameterAsString(String)
	 * @generated
	 */
	void unsetNominalDiameterAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalDiameterAsString <em>Nominal Diameter As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Diameter As String</em>' attribute is set.
	 * @see #unsetNominalDiameterAsString()
	 * @see #getNominalDiameterAsString()
	 * @see #setNominalDiameterAsString(String)
	 * @generated
	 */
	boolean isSetNominalDiameterAsString();

	/**
	 * Returns the value of the '<em><b>Nominal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Length</em>' attribute.
	 * @see #isSetNominalLength()
	 * @see #unsetNominalLength()
	 * @see #setNominalLength(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalFastener_NominalLength()
	 * @model unsettable="true"
	 * @generated
	 */
	float getNominalLength();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Length</em>' attribute.
	 * @see #isSetNominalLength()
	 * @see #unsetNominalLength()
	 * @see #getNominalLength()
	 * @generated
	 */
	void setNominalLength(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalLength()
	 * @see #getNominalLength()
	 * @see #setNominalLength(float)
	 * @generated
	 */
	void unsetNominalLength();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLength <em>Nominal Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Length</em>' attribute is set.
	 * @see #unsetNominalLength()
	 * @see #getNominalLength()
	 * @see #setNominalLength(float)
	 * @generated
	 */
	boolean isSetNominalLength();

	/**
	 * Returns the value of the '<em><b>Nominal Length As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Length As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Length As String</em>' attribute.
	 * @see #isSetNominalLengthAsString()
	 * @see #unsetNominalLengthAsString()
	 * @see #setNominalLengthAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalFastener_NominalLengthAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getNominalLengthAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLengthAsString <em>Nominal Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Length As String</em>' attribute.
	 * @see #isSetNominalLengthAsString()
	 * @see #unsetNominalLengthAsString()
	 * @see #getNominalLengthAsString()
	 * @generated
	 */
	void setNominalLengthAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLengthAsString <em>Nominal Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalLengthAsString()
	 * @see #getNominalLengthAsString()
	 * @see #setNominalLengthAsString(String)
	 * @generated
	 */
	void unsetNominalLengthAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener#getNominalLengthAsString <em>Nominal Length As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Length As String</em>' attribute is set.
	 * @see #unsetNominalLengthAsString()
	 * @see #getNominalLengthAsString()
	 * @see #setNominalLengthAsString(String)
	 * @generated
	 */
	boolean isSetNominalLengthAsString();

} // IfcMechanicalFastener