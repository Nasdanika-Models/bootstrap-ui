/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Modal#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Modal#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Modal#isCentered <em>Centered</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Modal#isScrollable <em>Scrollable</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getModal()
 * @model
 * @generated
 */
public interface Modal extends Container, Themed {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getModal_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Modal#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Size
	 * @see #setSize(Size)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getModal_Size()
	 * @model unique="false"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Modal#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centered</em>' attribute.
	 * @see #setCentered(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getModal_Centered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCentered();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Modal#isCentered <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centered</em>' attribute.
	 * @see #isCentered()
	 * @generated
	 */
	void setCentered(boolean value);

	/**
	 * Returns the value of the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollable</em>' attribute.
	 * @see #setScrollable(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getModal_Scrollable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isScrollable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Modal#isScrollable <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollable</em>' attribute.
	 * @see #isScrollable()
	 * @generated
	 */
	void setScrollable(boolean value);

} // Modal
