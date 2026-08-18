/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Color;
import org.nasdanika.models.ui.bootstrap.ColorMode;
import org.nasdanika.models.ui.bootstrap.Modal;
import org.nasdanika.models.ui.bootstrap.Size;
import org.nasdanika.models.ui.bootstrap.Themed;
import org.nasdanika.models.ui.bootstrap.Tooltip;

import org.nasdanika.models.ui.impl.ContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#isCentered <em>Centered</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ModalImpl#isScrollable <em>Scrollable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModalImpl extends ContainerImpl implements Modal {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.SMALL;

	/**
	 * The default value of the '{@link #isCentered() <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCentered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CENTERED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrollable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCROLLABLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.MODAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackground() {
		return (Color)eDynamicGet(BootstrapPackage.MODAL__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Color newBackground) {
		eDynamicSet(BootstrapPackage.MODAL__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getTextColor() {
		return (Color)eDynamicGet(BootstrapPackage.MODAL__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(Color newTextColor) {
		eDynamicSet(BootstrapPackage.MODAL__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, newTextColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBorder() {
		return (Color)eDynamicGet(BootstrapPackage.MODAL__BORDER, BootstrapPackage.Literals.THEMED__BORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(Color newBorder) {
		eDynamicSet(BootstrapPackage.MODAL__BORDER, BootstrapPackage.Literals.THEMED__BORDER, newBorder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorMode getColorMode() {
		return (ColorMode)eDynamicGet(BootstrapPackage.MODAL__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorMode(ColorMode newColorMode) {
		eDynamicSet(BootstrapPackage.MODAL__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip getTooltip() {
		return (Tooltip)eDynamicGet(BootstrapPackage.MODAL__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTooltip(Tooltip newTooltip, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTooltip, BootstrapPackage.MODAL__TOOLTIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTooltip(Tooltip newTooltip) {
		eDynamicSet(BootstrapPackage.MODAL__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(BootstrapPackage.MODAL__TITLE, BootstrapPackage.Literals.MODAL__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(BootstrapPackage.MODAL__TITLE, BootstrapPackage.Literals.MODAL__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size getSize() {
		return (Size)eDynamicGet(BootstrapPackage.MODAL__SIZE, BootstrapPackage.Literals.MODAL__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Size newSize) {
		eDynamicSet(BootstrapPackage.MODAL__SIZE, BootstrapPackage.Literals.MODAL__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCentered() {
		return (Boolean)eDynamicGet(BootstrapPackage.MODAL__CENTERED, BootstrapPackage.Literals.MODAL__CENTERED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCentered(boolean newCentered) {
		eDynamicSet(BootstrapPackage.MODAL__CENTERED, BootstrapPackage.Literals.MODAL__CENTERED, newCentered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isScrollable() {
		return (Boolean)eDynamicGet(BootstrapPackage.MODAL__SCROLLABLE, BootstrapPackage.Literals.MODAL__SCROLLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScrollable(boolean newScrollable) {
		eDynamicSet(BootstrapPackage.MODAL__SCROLLABLE, BootstrapPackage.Literals.MODAL__SCROLLABLE, newScrollable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.MODAL__TOOLTIP:
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
			case BootstrapPackage.MODAL__BACKGROUND:
				return getBackground();
			case BootstrapPackage.MODAL__TEXT_COLOR:
				return getTextColor();
			case BootstrapPackage.MODAL__BORDER:
				return getBorder();
			case BootstrapPackage.MODAL__COLOR_MODE:
				return getColorMode();
			case BootstrapPackage.MODAL__TOOLTIP:
				return getTooltip();
			case BootstrapPackage.MODAL__TITLE:
				return getTitle();
			case BootstrapPackage.MODAL__SIZE:
				return getSize();
			case BootstrapPackage.MODAL__CENTERED:
				return isCentered();
			case BootstrapPackage.MODAL__SCROLLABLE:
				return isScrollable();
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
			case BootstrapPackage.MODAL__BACKGROUND:
				setBackground((Color)newValue);
				return;
			case BootstrapPackage.MODAL__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case BootstrapPackage.MODAL__BORDER:
				setBorder((Color)newValue);
				return;
			case BootstrapPackage.MODAL__COLOR_MODE:
				setColorMode((ColorMode)newValue);
				return;
			case BootstrapPackage.MODAL__TOOLTIP:
				setTooltip((Tooltip)newValue);
				return;
			case BootstrapPackage.MODAL__TITLE:
				setTitle((String)newValue);
				return;
			case BootstrapPackage.MODAL__SIZE:
				setSize((Size)newValue);
				return;
			case BootstrapPackage.MODAL__CENTERED:
				setCentered((Boolean)newValue);
				return;
			case BootstrapPackage.MODAL__SCROLLABLE:
				setScrollable((Boolean)newValue);
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
			case BootstrapPackage.MODAL__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case BootstrapPackage.MODAL__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case BootstrapPackage.MODAL__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case BootstrapPackage.MODAL__COLOR_MODE:
				setColorMode(COLOR_MODE_EDEFAULT);
				return;
			case BootstrapPackage.MODAL__TOOLTIP:
				setTooltip((Tooltip)null);
				return;
			case BootstrapPackage.MODAL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case BootstrapPackage.MODAL__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case BootstrapPackage.MODAL__CENTERED:
				setCentered(CENTERED_EDEFAULT);
				return;
			case BootstrapPackage.MODAL__SCROLLABLE:
				setScrollable(SCROLLABLE_EDEFAULT);
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
			case BootstrapPackage.MODAL__BACKGROUND:
				return getBackground() != BACKGROUND_EDEFAULT;
			case BootstrapPackage.MODAL__TEXT_COLOR:
				return getTextColor() != TEXT_COLOR_EDEFAULT;
			case BootstrapPackage.MODAL__BORDER:
				return getBorder() != BORDER_EDEFAULT;
			case BootstrapPackage.MODAL__COLOR_MODE:
				return getColorMode() != COLOR_MODE_EDEFAULT;
			case BootstrapPackage.MODAL__TOOLTIP:
				return getTooltip() != null;
			case BootstrapPackage.MODAL__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case BootstrapPackage.MODAL__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case BootstrapPackage.MODAL__CENTERED:
				return isCentered() != CENTERED_EDEFAULT;
			case BootstrapPackage.MODAL__SCROLLABLE:
				return isScrollable() != SCROLLABLE_EDEFAULT;
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
				case BootstrapPackage.MODAL__BACKGROUND: return BootstrapPackage.THEMED__BACKGROUND;
				case BootstrapPackage.MODAL__TEXT_COLOR: return BootstrapPackage.THEMED__TEXT_COLOR;
				case BootstrapPackage.MODAL__BORDER: return BootstrapPackage.THEMED__BORDER;
				case BootstrapPackage.MODAL__COLOR_MODE: return BootstrapPackage.THEMED__COLOR_MODE;
				case BootstrapPackage.MODAL__TOOLTIP: return BootstrapPackage.THEMED__TOOLTIP;
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
				case BootstrapPackage.THEMED__BACKGROUND: return BootstrapPackage.MODAL__BACKGROUND;
				case BootstrapPackage.THEMED__TEXT_COLOR: return BootstrapPackage.MODAL__TEXT_COLOR;
				case BootstrapPackage.THEMED__BORDER: return BootstrapPackage.MODAL__BORDER;
				case BootstrapPackage.THEMED__COLOR_MODE: return BootstrapPackage.MODAL__COLOR_MODE;
				case BootstrapPackage.THEMED__TOOLTIP: return BootstrapPackage.MODAL__TOOLTIP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ModalImpl
