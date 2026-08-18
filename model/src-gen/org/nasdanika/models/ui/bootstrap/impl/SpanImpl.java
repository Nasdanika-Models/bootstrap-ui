/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Breakpoint;
import org.nasdanika.models.ui.bootstrap.Span;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.SpanImpl#getBreakpoint <em>Breakpoint</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.SpanImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanImpl extends MinimalEObjectImpl.Container implements Span {
	/**
	 * The default value of the '{@link #getBreakpoint() <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpoint()
	 * @generated
	 * @ordered
	 */
	protected static final Breakpoint BREAKPOINT_EDEFAULT = Breakpoint.XS;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Breakpoint getBreakpoint() {
		return (Breakpoint)eDynamicGet(BootstrapPackage.SPAN__BREAKPOINT, BootstrapPackage.Literals.SPAN__BREAKPOINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBreakpoint(Breakpoint newBreakpoint) {
		eDynamicSet(BootstrapPackage.SPAN__BREAKPOINT, BootstrapPackage.Literals.SPAN__BREAKPOINT, newBreakpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWidth() {
		return (Integer)eDynamicGet(BootstrapPackage.SPAN__WIDTH, BootstrapPackage.Literals.SPAN__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Integer newWidth) {
		eDynamicSet(BootstrapPackage.SPAN__WIDTH, BootstrapPackage.Literals.SPAN__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.SPAN__BREAKPOINT:
				return getBreakpoint();
			case BootstrapPackage.SPAN__WIDTH:
				return getWidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.SPAN__BREAKPOINT:
				setBreakpoint((Breakpoint)newValue);
				return;
			case BootstrapPackage.SPAN__WIDTH:
				setWidth((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BootstrapPackage.SPAN__BREAKPOINT:
				setBreakpoint(BREAKPOINT_EDEFAULT);
				return;
			case BootstrapPackage.SPAN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BootstrapPackage.SPAN__BREAKPOINT:
				return getBreakpoint() != BREAKPOINT_EDEFAULT;
			case BootstrapPackage.SPAN__WIDTH:
				return WIDTH_EDEFAULT == null ? getWidth() != null : !WIDTH_EDEFAULT.equals(getWidth());
		}
		return super.eIsSet(featureID);
	}

} //SpanImpl
