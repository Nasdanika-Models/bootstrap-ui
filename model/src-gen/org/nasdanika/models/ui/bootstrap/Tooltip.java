/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tooltip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Theming mixin ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Tooltip#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Tooltip#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getTooltip()
 * @model
 * @generated
 */
public interface Tooltip extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getTooltip_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Tooltip#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Placement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Placement
	 * @see #setPlacement(Placement)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getTooltip_Placement()
	 * @model unique="false"
	 * @generated
	 */
	Placement getPlacement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Tooltip#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Placement
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(Placement value);

} // Tooltip
