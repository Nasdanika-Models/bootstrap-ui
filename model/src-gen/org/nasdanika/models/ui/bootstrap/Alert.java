/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Alert#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Alert#isDismissible <em>Dismissible</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends Container, Themed {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #setColor(Color)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getAlert_Color()
	 * @model unique="false"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Alert#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Dismissible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dismissible</em>' attribute.
	 * @see #setDismissible(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getAlert_Dismissible()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDismissible();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Alert#isDismissible <em>Dismissible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dismissible</em>' attribute.
	 * @see #isDismissible()
	 * @generated
	 */
	void setDismissible(boolean value);

} // Alert
