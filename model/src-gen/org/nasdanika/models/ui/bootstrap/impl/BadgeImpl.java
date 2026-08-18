/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.bootstrap.Badge;
import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Color;

import org.nasdanika.models.ui.impl.TextImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Badge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.BadgeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.BadgeImpl#isPill <em>Pill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BadgeImpl extends TextImpl implements Badge {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.PRIMARY;

	/**
	 * The default value of the '{@link #isPill() <em>Pill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPill()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PILL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BadgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.BADGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColor() {
		return (Color)eDynamicGet(BootstrapPackage.BADGE__COLOR, BootstrapPackage.Literals.BADGE__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Color newColor) {
		eDynamicSet(BootstrapPackage.BADGE__COLOR, BootstrapPackage.Literals.BADGE__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPill() {
		return (Boolean)eDynamicGet(BootstrapPackage.BADGE__PILL, BootstrapPackage.Literals.BADGE__PILL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPill(boolean newPill) {
		eDynamicSet(BootstrapPackage.BADGE__PILL, BootstrapPackage.Literals.BADGE__PILL, newPill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.BADGE__COLOR:
				return getColor();
			case BootstrapPackage.BADGE__PILL:
				return isPill();
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
			case BootstrapPackage.BADGE__COLOR:
				setColor((Color)newValue);
				return;
			case BootstrapPackage.BADGE__PILL:
				setPill((Boolean)newValue);
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
			case BootstrapPackage.BADGE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BootstrapPackage.BADGE__PILL:
				setPill(PILL_EDEFAULT);
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
			case BootstrapPackage.BADGE__COLOR:
				return getColor() != COLOR_EDEFAULT;
			case BootstrapPackage.BADGE__PILL:
				return isPill() != PILL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //BadgeImpl
