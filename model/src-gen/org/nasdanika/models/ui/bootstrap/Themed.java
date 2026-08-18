/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Themed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mixin for Bootstrap theming: background, text, border colors, a local
 * color mode, and an optional tooltip. Mixed into Bootstrap classes
 * alongside their core UI supertypes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Themed#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Themed#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Themed#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Themed#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Themed#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getThemed()
 * @model abstract="true"
 * @generated
 */
public interface Themed extends EObject {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #setBackground(Color)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getThemed_Background()
	 * @model unique="false"
	 * @generated
	 */
	Color getBackground();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Themed#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Color value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #setTextColor(Color)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getThemed_TextColor()
	 * @model unique="false"
	 * @generated
	 */
	Color getTextColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Themed#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(Color value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #setBorder(Color)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getThemed_Border()
	 * @model unique="false"
	 * @generated
	 */
	Color getBorder();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Themed#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(Color value);

	/**
	 * Returns the value of the '<em><b>Color Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.ColorMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Mode</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.ColorMode
	 * @see #setColorMode(ColorMode)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getThemed_ColorMode()
	 * @model unique="false"
	 * @generated
	 */
	ColorMode getColorMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Themed#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Mode</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.ColorMode
	 * @see #getColorMode()
	 * @generated
	 */
	void setColorMode(ColorMode value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' containment reference.
	 * @see #setTooltip(Tooltip)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getThemed_Tooltip()
	 * @model containment="true"
	 * @generated
	 */
	Tooltip getTooltip();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Themed#getTooltip <em>Tooltip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' containment reference.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(Tooltip value);

} // Themed
