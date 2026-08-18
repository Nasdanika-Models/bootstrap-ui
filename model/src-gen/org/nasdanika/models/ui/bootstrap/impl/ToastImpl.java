/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Toast;

import org.nasdanika.models.ui.impl.ContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ToastImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ToastImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ToastImpl#isAutohide <em>Autohide</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToastImpl extends ContainerImpl implements Toast {
	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELAY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAutohide() <em>Autohide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutohide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOHIDE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TOAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return (String)eDynamicGet(BootstrapPackage.TOAST__HEADER, BootstrapPackage.Literals.TOAST__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		eDynamicSet(BootstrapPackage.TOAST__HEADER, BootstrapPackage.Literals.TOAST__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDelay() {
		return (Integer)eDynamicGet(BootstrapPackage.TOAST__DELAY, BootstrapPackage.Literals.TOAST__DELAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(Integer newDelay) {
		eDynamicSet(BootstrapPackage.TOAST__DELAY, BootstrapPackage.Literals.TOAST__DELAY, newDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutohide() {
		return (Boolean)eDynamicGet(BootstrapPackage.TOAST__AUTOHIDE, BootstrapPackage.Literals.TOAST__AUTOHIDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutohide(boolean newAutohide) {
		eDynamicSet(BootstrapPackage.TOAST__AUTOHIDE, BootstrapPackage.Literals.TOAST__AUTOHIDE, newAutohide);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.TOAST__HEADER:
				return getHeader();
			case BootstrapPackage.TOAST__DELAY:
				return getDelay();
			case BootstrapPackage.TOAST__AUTOHIDE:
				return isAutohide();
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
			case BootstrapPackage.TOAST__HEADER:
				setHeader((String)newValue);
				return;
			case BootstrapPackage.TOAST__DELAY:
				setDelay((Integer)newValue);
				return;
			case BootstrapPackage.TOAST__AUTOHIDE:
				setAutohide((Boolean)newValue);
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
			case BootstrapPackage.TOAST__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case BootstrapPackage.TOAST__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case BootstrapPackage.TOAST__AUTOHIDE:
				setAutohide(AUTOHIDE_EDEFAULT);
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
			case BootstrapPackage.TOAST__HEADER:
				return HEADER_EDEFAULT == null ? getHeader() != null : !HEADER_EDEFAULT.equals(getHeader());
			case BootstrapPackage.TOAST__DELAY:
				return DELAY_EDEFAULT == null ? getDelay() != null : !DELAY_EDEFAULT.equals(getDelay());
			case BootstrapPackage.TOAST__AUTOHIDE:
				return isAutohide() != AUTOHIDE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ToastImpl
