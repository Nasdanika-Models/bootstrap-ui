/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Spinner#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Spinner#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Spinner#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getSpinner()
 * @model
 * @generated
 */
public interface Spinner extends Element {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.SpinnerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.SpinnerKind
	 * @see #setKind(SpinnerKind)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getSpinner_Kind()
	 * @model unique="false"
	 * @generated
	 */
	SpinnerKind getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Spinner#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.SpinnerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SpinnerKind value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #setColor(Color)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getSpinner_Color()
	 * @model unique="false"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Spinner#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Size
	 * @see #setSize(Size)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getSpinner_Size()
	 * @model unique="false"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Spinner#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

} // Spinner
