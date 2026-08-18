/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Color;
import org.nasdanika.models.ui.bootstrap.ColorMode;
import org.nasdanika.models.ui.bootstrap.Page;
import org.nasdanika.models.ui.bootstrap.Themed;
import org.nasdanika.models.ui.bootstrap.Tooltip;

import org.nasdanika.models.ui.impl.ContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.PageImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.PageImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.PageImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.PageImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.PageImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.PageImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends ContainerImpl implements Page {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackground() {
		return (Color)eDynamicGet(BootstrapPackage.PAGE__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Color newBackground) {
		eDynamicSet(BootstrapPackage.PAGE__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getTextColor() {
		return (Color)eDynamicGet(BootstrapPackage.PAGE__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(Color newTextColor) {
		eDynamicSet(BootstrapPackage.PAGE__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, newTextColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBorder() {
		return (Color)eDynamicGet(BootstrapPackage.PAGE__BORDER, BootstrapPackage.Literals.THEMED__BORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(Color newBorder) {
		eDynamicSet(BootstrapPackage.PAGE__BORDER, BootstrapPackage.Literals.THEMED__BORDER, newBorder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorMode getColorMode() {
		return (ColorMode)eDynamicGet(BootstrapPackage.PAGE__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorMode(ColorMode newColorMode) {
		eDynamicSet(BootstrapPackage.PAGE__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip getTooltip() {
		return (Tooltip)eDynamicGet(BootstrapPackage.PAGE__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTooltip(Tooltip newTooltip, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTooltip, BootstrapPackage.PAGE__TOOLTIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTooltip(Tooltip newTooltip) {
		eDynamicSet(BootstrapPackage.PAGE__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(BootstrapPackage.PAGE__TITLE, BootstrapPackage.Literals.PAGE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(BootstrapPackage.PAGE__TITLE, BootstrapPackage.Literals.PAGE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.PAGE__TOOLTIP:
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
			case BootstrapPackage.PAGE__BACKGROUND:
				return getBackground();
			case BootstrapPackage.PAGE__TEXT_COLOR:
				return getTextColor();
			case BootstrapPackage.PAGE__BORDER:
				return getBorder();
			case BootstrapPackage.PAGE__COLOR_MODE:
				return getColorMode();
			case BootstrapPackage.PAGE__TOOLTIP:
				return getTooltip();
			case BootstrapPackage.PAGE__TITLE:
				return getTitle();
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
			case BootstrapPackage.PAGE__BACKGROUND:
				setBackground((Color)newValue);
				return;
			case BootstrapPackage.PAGE__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case BootstrapPackage.PAGE__BORDER:
				setBorder((Color)newValue);
				return;
			case BootstrapPackage.PAGE__COLOR_MODE:
				setColorMode((ColorMode)newValue);
				return;
			case BootstrapPackage.PAGE__TOOLTIP:
				setTooltip((Tooltip)newValue);
				return;
			case BootstrapPackage.PAGE__TITLE:
				setTitle((String)newValue);
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
			case BootstrapPackage.PAGE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case BootstrapPackage.PAGE__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case BootstrapPackage.PAGE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case BootstrapPackage.PAGE__COLOR_MODE:
				setColorMode(COLOR_MODE_EDEFAULT);
				return;
			case BootstrapPackage.PAGE__TOOLTIP:
				setTooltip((Tooltip)null);
				return;
			case BootstrapPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case BootstrapPackage.PAGE__BACKGROUND:
				return getBackground() != BACKGROUND_EDEFAULT;
			case BootstrapPackage.PAGE__TEXT_COLOR:
				return getTextColor() != TEXT_COLOR_EDEFAULT;
			case BootstrapPackage.PAGE__BORDER:
				return getBorder() != BORDER_EDEFAULT;
			case BootstrapPackage.PAGE__COLOR_MODE:
				return getColorMode() != COLOR_MODE_EDEFAULT;
			case BootstrapPackage.PAGE__TOOLTIP:
				return getTooltip() != null;
			case BootstrapPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
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
				case BootstrapPackage.PAGE__BACKGROUND: return BootstrapPackage.THEMED__BACKGROUND;
				case BootstrapPackage.PAGE__TEXT_COLOR: return BootstrapPackage.THEMED__TEXT_COLOR;
				case BootstrapPackage.PAGE__BORDER: return BootstrapPackage.THEMED__BORDER;
				case BootstrapPackage.PAGE__COLOR_MODE: return BootstrapPackage.THEMED__COLOR_MODE;
				case BootstrapPackage.PAGE__TOOLTIP: return BootstrapPackage.THEMED__TOOLTIP;
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
				case BootstrapPackage.THEMED__BACKGROUND: return BootstrapPackage.PAGE__BACKGROUND;
				case BootstrapPackage.THEMED__TEXT_COLOR: return BootstrapPackage.PAGE__TEXT_COLOR;
				case BootstrapPackage.THEMED__BORDER: return BootstrapPackage.PAGE__BORDER;
				case BootstrapPackage.THEMED__COLOR_MODE: return BootstrapPackage.PAGE__COLOR_MODE;
				case BootstrapPackage.THEMED__TOOLTIP: return BootstrapPackage.PAGE__TOOLTIP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PageImpl
