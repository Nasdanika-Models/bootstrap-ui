/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.ui.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accordion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Accordion#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Accordion#isAlwaysOpen <em>Always Open</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Accordion#isFlush <em>Flush</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getAccordion()
 * @model
 * @generated
 */
public interface Accordion extends Element {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.bootstrap.AccordionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getAccordion_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccordionItem> getItems();

	/**
	 * Returns the value of the '<em><b>Always Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Open</em>' attribute.
	 * @see #setAlwaysOpen(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getAccordion_AlwaysOpen()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAlwaysOpen();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Accordion#isAlwaysOpen <em>Always Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Open</em>' attribute.
	 * @see #isAlwaysOpen()
	 * @generated
	 */
	void setAlwaysOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush</em>' attribute.
	 * @see #setFlush(boolean)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getAccordion_Flush()
	 * @model unique="false"
	 * @generated
	 */
	boolean isFlush();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Accordion#isFlush <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush</em>' attribute.
	 * @see #isFlush()
	 * @generated
	 */
	void setFlush(boolean value);

} // Accordion
