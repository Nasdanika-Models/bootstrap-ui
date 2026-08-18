/**
 */
package org.nasdanika.models.ui.bootstrap;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.ui.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.Column#getSpans <em>Spans</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends Container {
	/**
	 * Returns the value of the '<em><b>Spans</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ui.bootstrap.Span}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spans</em>' containment reference list.
	 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getColumn_Spans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Span> getSpans();

} // Column
