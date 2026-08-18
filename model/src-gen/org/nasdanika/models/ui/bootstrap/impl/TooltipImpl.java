/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Placement;
import org.nasdanika.models.ui.bootstrap.Tooltip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tooltip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.TooltipImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.TooltipImpl#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TooltipImpl extends MinimalEObjectImpl.Container implements Tooltip {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final Placement PLACEMENT_EDEFAULT = Placement.TOP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TooltipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TOOLTIP;
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
	public String getText() {
		return (String)eDynamicGet(BootstrapPackage.TOOLTIP__TEXT, BootstrapPackage.Literals.TOOLTIP__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eDynamicSet(BootstrapPackage.TOOLTIP__TEXT, BootstrapPackage.Literals.TOOLTIP__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Placement getPlacement() {
		return (Placement)eDynamicGet(BootstrapPackage.TOOLTIP__PLACEMENT, BootstrapPackage.Literals.TOOLTIP__PLACEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacement(Placement newPlacement) {
		eDynamicSet(BootstrapPackage.TOOLTIP__PLACEMENT, BootstrapPackage.Literals.TOOLTIP__PLACEMENT, newPlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.TOOLTIP__TEXT:
				return getText();
			case BootstrapPackage.TOOLTIP__PLACEMENT:
				return getPlacement();
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
			case BootstrapPackage.TOOLTIP__TEXT:
				setText((String)newValue);
				return;
			case BootstrapPackage.TOOLTIP__PLACEMENT:
				setPlacement((Placement)newValue);
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
			case BootstrapPackage.TOOLTIP__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case BootstrapPackage.TOOLTIP__PLACEMENT:
				setPlacement(PLACEMENT_EDEFAULT);
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
			case BootstrapPackage.TOOLTIP__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case BootstrapPackage.TOOLTIP__PLACEMENT:
				return getPlacement() != PLACEMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TooltipImpl
