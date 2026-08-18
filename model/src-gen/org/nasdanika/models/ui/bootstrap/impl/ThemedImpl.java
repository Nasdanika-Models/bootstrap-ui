/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Color;
import org.nasdanika.models.ui.bootstrap.ColorMode;
import org.nasdanika.models.ui.bootstrap.Themed;
import org.nasdanika.models.ui.bootstrap.Tooltip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Themed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ThemedImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ThemedImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ThemedImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ThemedImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ThemedImpl#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThemedImpl extends MinimalEObjectImpl.Container implements Themed {
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final Color BACKGROUND_EDEFAULT = Color.PRIMARY;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color TEXT_COLOR_EDEFAULT = Color.PRIMARY;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final Color BORDER_EDEFAULT = Color.PRIMARY;

	/**
	 * The default value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected static final ColorMode COLOR_MODE_EDEFAULT = ColorMode.LIGHT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThemedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.THEMED;
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
	public Color getBackground() {
		return (Color)eDynamicGet(BootstrapPackage.THEMED__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Color newBackground) {
		eDynamicSet(BootstrapPackage.THEMED__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getTextColor() {
		return (Color)eDynamicGet(BootstrapPackage.THEMED__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(Color newTextColor) {
		eDynamicSet(BootstrapPackage.THEMED__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, newTextColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBorder() {
		return (Color)eDynamicGet(BootstrapPackage.THEMED__BORDER, BootstrapPackage.Literals.THEMED__BORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(Color newBorder) {
		eDynamicSet(BootstrapPackage.THEMED__BORDER, BootstrapPackage.Literals.THEMED__BORDER, newBorder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorMode getColorMode() {
		return (ColorMode)eDynamicGet(BootstrapPackage.THEMED__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorMode(ColorMode newColorMode) {
		eDynamicSet(BootstrapPackage.THEMED__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip getTooltip() {
		return (Tooltip)eDynamicGet(BootstrapPackage.THEMED__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTooltip(Tooltip newTooltip, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTooltip, BootstrapPackage.THEMED__TOOLTIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTooltip(Tooltip newTooltip) {
		eDynamicSet(BootstrapPackage.THEMED__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.THEMED__TOOLTIP:
				return basicSetTooltip(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.THEMED__BACKGROUND:
				return getBackground();
			case BootstrapPackage.THEMED__TEXT_COLOR:
				return getTextColor();
			case BootstrapPackage.THEMED__BORDER:
				return getBorder();
			case BootstrapPackage.THEMED__COLOR_MODE:
				return getColorMode();
			case BootstrapPackage.THEMED__TOOLTIP:
				return getTooltip();
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
			case BootstrapPackage.THEMED__BACKGROUND:
				setBackground((Color)newValue);
				return;
			case BootstrapPackage.THEMED__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case BootstrapPackage.THEMED__BORDER:
				setBorder((Color)newValue);
				return;
			case BootstrapPackage.THEMED__COLOR_MODE:
				setColorMode((ColorMode)newValue);
				return;
			case BootstrapPackage.THEMED__TOOLTIP:
				setTooltip((Tooltip)newValue);
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
			case BootstrapPackage.THEMED__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case BootstrapPackage.THEMED__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case BootstrapPackage.THEMED__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case BootstrapPackage.THEMED__COLOR_MODE:
				setColorMode(COLOR_MODE_EDEFAULT);
				return;
			case BootstrapPackage.THEMED__TOOLTIP:
				setTooltip((Tooltip)null);
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
			case BootstrapPackage.THEMED__BACKGROUND:
				return getBackground() != BACKGROUND_EDEFAULT;
			case BootstrapPackage.THEMED__TEXT_COLOR:
				return getTextColor() != TEXT_COLOR_EDEFAULT;
			case BootstrapPackage.THEMED__BORDER:
				return getBorder() != BORDER_EDEFAULT;
			case BootstrapPackage.THEMED__COLOR_MODE:
				return getColorMode() != COLOR_MODE_EDEFAULT;
			case BootstrapPackage.THEMED__TOOLTIP:
				return getTooltip() != null;
		}
		return super.eIsSet(featureID);
	}

} //ThemedImpl
