/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Text;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Badge#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Badge#isPill <em>Pill</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getBadge()
 * @model
 * @generated
 */
public interface Badge extends Text {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #setColor(Color)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getBadge_Color()
	 * @model unique="false"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Badge#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Pill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pill</em>' attribute.
	 * @see #setPill(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getBadge_Pill()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPill();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Badge#isPill <em>Pill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pill</em>' attribute.
	 * @see #isPill()
	 * @generated
	 */
	void setPill(boolean value);

} // Badge
