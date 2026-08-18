/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Toast#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Toast#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Toast#isAutohide <em>Autohide</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getToast()
 * @model
 * @generated
 */
public interface Toast extends Container {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getToast_Header()
	 * @model unique="false"
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Toast#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(Integer)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getToast_Delay()
	 * @model unique="false"
	 * @generated
	 */
	Integer getDelay();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Toast#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Integer value);

	/**
	 * Returns the value of the '<em><b>Autohide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autohide</em>' attribute.
	 * @see #setAutohide(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getToast_Autohide()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAutohide();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Toast#isAutohide <em>Autohide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autohide</em>' attribute.
	 * @see #isAutohide()
	 * @generated
	 */
	void setAutohide(boolean value);

} // Toast
