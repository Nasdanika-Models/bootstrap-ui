/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Progress#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Progress#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Progress#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Progress#isAnimated <em>Animated</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getProgress()
 * @model
 * @generated
 */
public interface Progress extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  0..100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getProgress_Value()
	 * @model unique="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Progress#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #setColor(Color)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getProgress_Color()
	 * @model unique="false"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Progress#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Striped</em>' attribute.
	 * @see #setStriped(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getProgress_Striped()
	 * @model unique="false"
	 * @generated
	 */
	boolean isStriped();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Progress#isStriped <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Striped</em>' attribute.
	 * @see #isStriped()
	 * @generated
	 */
	void setStriped(boolean value);

	/**
	 * Returns the value of the '<em><b>Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animated</em>' attribute.
	 * @see #setAnimated(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getProgress_Animated()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAnimated();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Progress#isAnimated <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animated</em>' attribute.
	 * @see #isAnimated()
	 * @generated
	 */
	void setAnimated(boolean value);

} // Progress
