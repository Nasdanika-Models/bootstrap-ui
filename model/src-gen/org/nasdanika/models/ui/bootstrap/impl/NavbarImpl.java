/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Breakpoint;
import org.nasdanika.models.ui.bootstrap.Color;
import org.nasdanika.models.ui.bootstrap.ColorMode;
import org.nasdanika.models.ui.bootstrap.Navbar;
import org.nasdanika.models.ui.bootstrap.Themed;
import org.nasdanika.models.ui.bootstrap.Tooltip;

import org.nasdanika.models.ui.impl.ContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navbar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getExpand <em>Expand</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.NavbarImpl#getBrandLocation <em>Brand Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavbarImpl extends ContainerImpl implements Navbar {
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
	 * The default value of the '{@link #getExpand() <em>Expand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpand()
	 * @generated
	 * @ordered
	 */
	protected static final Breakpoint EXPAND_EDEFAULT = Breakpoint.XS;

	/**
	 * The default value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBrandLocation() <em>Brand Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_LOCATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavbarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.NAVBAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackground() {
		return (Color)eDynamicGet(BootstrapPackage.NAVBAR__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Color newBackground) {
		eDynamicSet(BootstrapPackage.NAVBAR__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getTextColor() {
		return (Color)eDynamicGet(BootstrapPackage.NAVBAR__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(Color newTextColor) {
		eDynamicSet(BootstrapPackage.NAVBAR__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, newTextColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBorder() {
		return (Color)eDynamicGet(BootstrapPackage.NAVBAR__BORDER, BootstrapPackage.Literals.THEMED__BORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(Color newBorder) {
		eDynamicSet(BootstrapPackage.NAVBAR__BORDER, BootstrapPackage.Literals.THEMED__BORDER, newBorder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorMode getColorMode() {
		return (ColorMode)eDynamicGet(BootstrapPackage.NAVBAR__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorMode(ColorMode newColorMode) {
		eDynamicSet(BootstrapPackage.NAVBAR__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip getTooltip() {
		return (Tooltip)eDynamicGet(BootstrapPackage.NAVBAR__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTooltip(Tooltip newTooltip, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTooltip, BootstrapPackage.NAVBAR__TOOLTIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTooltip(Tooltip newTooltip) {
		eDynamicSet(BootstrapPackage.NAVBAR__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Breakpoint getExpand() {
		return (Breakpoint)eDynamicGet(BootstrapPackage.NAVBAR__EXPAND, BootstrapPackage.Literals.NAVBAR__EXPAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpand(Breakpoint newExpand) {
		eDynamicSet(BootstrapPackage.NAVBAR__EXPAND, BootstrapPackage.Literals.NAVBAR__EXPAND, newExpand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrand() {
		return (String)eDynamicGet(BootstrapPackage.NAVBAR__BRAND, BootstrapPackage.Literals.NAVBAR__BRAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrand(String newBrand) {
		eDynamicSet(BootstrapPackage.NAVBAR__BRAND, BootstrapPackage.Literals.NAVBAR__BRAND, newBrand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrandLocation() {
		return (String)eDynamicGet(BootstrapPackage.NAVBAR__BRAND_LOCATION, BootstrapPackage.Literals.NAVBAR__BRAND_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrandLocation(String newBrandLocation) {
		eDynamicSet(BootstrapPackage.NAVBAR__BRAND_LOCATION, BootstrapPackage.Literals.NAVBAR__BRAND_LOCATION, newBrandLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.NAVBAR__TOOLTIP:
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
			case BootstrapPackage.NAVBAR__BACKGROUND:
				return getBackground();
			case BootstrapPackage.NAVBAR__TEXT_COLOR:
				return getTextColor();
			case BootstrapPackage.NAVBAR__BORDER:
				return getBorder();
			case BootstrapPackage.NAVBAR__COLOR_MODE:
				return getColorMode();
			case BootstrapPackage.NAVBAR__TOOLTIP:
				return getTooltip();
			case BootstrapPackage.NAVBAR__EXPAND:
				return getExpand();
			case BootstrapPackage.NAVBAR__BRAND:
				return getBrand();
			case BootstrapPackage.NAVBAR__BRAND_LOCATION:
				return getBrandLocation();
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
			case BootstrapPackage.NAVBAR__BACKGROUND:
				setBackground((Color)newValue);
				return;
			case BootstrapPackage.NAVBAR__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case BootstrapPackage.NAVBAR__BORDER:
				setBorder((Color)newValue);
				return;
			case BootstrapPackage.NAVBAR__COLOR_MODE:
				setColorMode((ColorMode)newValue);
				return;
			case BootstrapPackage.NAVBAR__TOOLTIP:
				setTooltip((Tooltip)newValue);
				return;
			case BootstrapPackage.NAVBAR__EXPAND:
				setExpand((Breakpoint)newValue);
				return;
			case BootstrapPackage.NAVBAR__BRAND:
				setBrand((String)newValue);
				return;
			case BootstrapPackage.NAVBAR__BRAND_LOCATION:
				setBrandLocation((String)newValue);
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
			case BootstrapPackage.NAVBAR__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case BootstrapPackage.NAVBAR__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case BootstrapPackage.NAVBAR__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case BootstrapPackage.NAVBAR__COLOR_MODE:
				setColorMode(COLOR_MODE_EDEFAULT);
				return;
			case BootstrapPackage.NAVBAR__TOOLTIP:
				setTooltip((Tooltip)null);
				return;
			case BootstrapPackage.NAVBAR__EXPAND:
				setExpand(EXPAND_EDEFAULT);
				return;
			case BootstrapPackage.NAVBAR__BRAND:
				setBrand(BRAND_EDEFAULT);
				return;
			case BootstrapPackage.NAVBAR__BRAND_LOCATION:
				setBrandLocation(BRAND_LOCATION_EDEFAULT);
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
			case BootstrapPackage.NAVBAR__BACKGROUND:
				return getBackground() != BACKGROUND_EDEFAULT;
			case BootstrapPackage.NAVBAR__TEXT_COLOR:
				return getTextColor() != TEXT_COLOR_EDEFAULT;
			case BootstrapPackage.NAVBAR__BORDER:
				return getBorder() != BORDER_EDEFAULT;
			case BootstrapPackage.NAVBAR__COLOR_MODE:
				return getColorMode() != COLOR_MODE_EDEFAULT;
			case BootstrapPackage.NAVBAR__TOOLTIP:
				return getTooltip() != null;
			case BootstrapPackage.NAVBAR__EXPAND:
				return getExpand() != EXPAND_EDEFAULT;
			case BootstrapPackage.NAVBAR__BRAND:
				return BRAND_EDEFAULT == null ? getBrand() != null : !BRAND_EDEFAULT.equals(getBrand());
			case BootstrapPackage.NAVBAR__BRAND_LOCATION:
				return BRAND_LOCATION_EDEFAULT == null ? getBrandLocation() != null : !BRAND_LOCATION_EDEFAULT.equals(getBrandLocation());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Themed.class) {
			switch (derivedFeatureID) {
				case BootstrapPackage.NAVBAR__BACKGROUND: return BootstrapPackage.THEMED__BACKGROUND;
				case BootstrapPackage.NAVBAR__TEXT_COLOR: return BootstrapPackage.THEMED__TEXT_COLOR;
				case BootstrapPackage.NAVBAR__BORDER: return BootstrapPackage.THEMED__BORDER;
				case BootstrapPackage.NAVBAR__COLOR_MODE: return BootstrapPackage.THEMED__COLOR_MODE;
				case BootstrapPackage.NAVBAR__TOOLTIP: return BootstrapPackage.THEMED__TOOLTIP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Themed.class) {
			switch (baseFeatureID) {
				case BootstrapPackage.THEMED__BACKGROUND: return BootstrapPackage.NAVBAR__BACKGROUND;
				case BootstrapPackage.THEMED__TEXT_COLOR: return BootstrapPackage.NAVBAR__TEXT_COLOR;
				case BootstrapPackage.THEMED__BORDER: return BootstrapPackage.NAVBAR__BORDER;
				case BootstrapPackage.THEMED__COLOR_MODE: return BootstrapPackage.NAVBAR__COLOR_MODE;
				case BootstrapPackage.THEMED__TOOLTIP: return BootstrapPackage.NAVBAR__TOOLTIP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NavbarImpl
