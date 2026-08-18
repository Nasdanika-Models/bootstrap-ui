/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Per-breakpoint width: 1..12, 0 meaning auto.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Span#getBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Span#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getSpan()
 * @model
 * @generated
 */
public interface Span extends EObject {
	/**
	 * Returns the value of the '<em><b>Breakpoint</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ui.bootstrap.Breakpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoint</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Breakpoint
	 * @see #setBreakpoint(Breakpoint)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getSpan_Breakpoint()
	 * @model unique="false"
	 * @generated
	 */
	Breakpoint getBreakpoint();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Span#getBreakpoint <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoint</em>' attribute.
	 * @see org.nasdanika.models.ui.bootstrap.Breakpoint
	 * @see #getBreakpoint()
	 * @generated
	 */
	void setBreakpoint(Breakpoint value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getSpan_Width()
	 * @model unique="false"
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ui.bootstrap.Span#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

} // Span
