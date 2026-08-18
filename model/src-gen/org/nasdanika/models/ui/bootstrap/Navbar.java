/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Navbar#getExpand <em>Expand</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Navbar#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Navbar#getBrandLocation <em>Brand Location</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getNavbar()
 * @model
 * @generated
 */
public interface Navbar extends Container, Themed {
	/**
	 * Returns the value of the '<em><b>Expand</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Breakpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Breakpoint at which the navbar expands from collapsed to horizontal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expand</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Breakpoint
	 * @see #setExpand(Breakpoint)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getNavbar_Expand()
	 * @model unique="false"
	 * @generated
	 */
	Breakpoint getExpand();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Navbar#getExpand <em>Expand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Breakpoint
	 * @see #getExpand()
	 * @generated
	 */
	void setExpand(Breakpoint value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getNavbar_Brand()
	 * @model unique="false"
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Navbar#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

	/**
	 * Returns the value of the '<em><b>Brand Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand Location</em>' attribute.
	 * @see #setBrandLocation(String)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getNavbar_BrandLocation()
	 * @model unique="false"
	 * @generated
	 */
	String getBrandLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Navbar#getBrandLocation <em>Brand Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand Location</em>' attribute.
	 * @see #getBrandLocation()
	 * @generated
	 */
	void setBrandLocation(String value);

} // Navbar
