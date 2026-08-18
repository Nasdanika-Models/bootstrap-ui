/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.nasdanika.models.ui.Container;
import org.nasdanika.models.ui.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Card#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Card#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Card#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Card#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends Container, Themed {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getCard_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Card#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Element)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getCard_Header()
	 * @model containment="true"
	 * @generated
	 */
	Element getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Card#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Element value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(Element)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getCard_Footer()
	 * @model containment="true"
	 * @generated
	 */
	Element getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Card#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(Element value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Image displayed at the top of the card.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getCard_Image()
	 * @model unique="false"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Card#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

} // Card
