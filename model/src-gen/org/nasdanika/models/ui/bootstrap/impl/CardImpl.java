/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.ui.Element;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Card;
import org.nasdanika.models.ui.bootstrap.Color;
import org.nasdanika.models.ui.bootstrap.ColorMode;
import org.nasdanika.models.ui.bootstrap.Themed;
import org.nasdanika.models.ui.bootstrap.Tooltip;

import org.nasdanika.models.ui.impl.ContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getColorMode <em>Color Mode</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.CardImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends ContainerImpl implements Card {
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
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBackground() {
		return (Color)eDynamicGet(BootstrapPackage.CARD__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(Color newBackground) {
		eDynamicSet(BootstrapPackage.CARD__BACKGROUND, BootstrapPackage.Literals.THEMED__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getTextColor() {
		return (Color)eDynamicGet(BootstrapPackage.CARD__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(Color newTextColor) {
		eDynamicSet(BootstrapPackage.CARD__TEXT_COLOR, BootstrapPackage.Literals.THEMED__TEXT_COLOR, newTextColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getBorder() {
		return (Color)eDynamicGet(BootstrapPackage.CARD__BORDER, BootstrapPackage.Literals.THEMED__BORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(Color newBorder) {
		eDynamicSet(BootstrapPackage.CARD__BORDER, BootstrapPackage.Literals.THEMED__BORDER, newBorder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColorMode getColorMode() {
		return (ColorMode)eDynamicGet(BootstrapPackage.CARD__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColorMode(ColorMode newColorMode) {
		eDynamicSet(BootstrapPackage.CARD__COLOR_MODE, BootstrapPackage.Literals.THEMED__COLOR_MODE, newColorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip getTooltip() {
		return (Tooltip)eDynamicGet(BootstrapPackage.CARD__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTooltip(Tooltip newTooltip, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTooltip, BootstrapPackage.CARD__TOOLTIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTooltip(Tooltip newTooltip) {
		eDynamicSet(BootstrapPackage.CARD__TOOLTIP, BootstrapPackage.Literals.THEMED__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(BootstrapPackage.CARD__TITLE, BootstrapPackage.Literals.CARD__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(BootstrapPackage.CARD__TITLE, BootstrapPackage.Literals.CARD__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getHeader() {
		return (Element)eDynamicGet(BootstrapPackage.CARD__HEADER, BootstrapPackage.Literals.CARD__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Element newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, BootstrapPackage.CARD__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(Element newHeader) {
		eDynamicSet(BootstrapPackage.CARD__HEADER, BootstrapPackage.Literals.CARD__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getFooter() {
		return (Element)eDynamicGet(BootstrapPackage.CARD__FOOTER, BootstrapPackage.Literals.CARD__FOOTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(Element newFooter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFooter, BootstrapPackage.CARD__FOOTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooter(Element newFooter) {
		eDynamicSet(BootstrapPackage.CARD__FOOTER, BootstrapPackage.Literals.CARD__FOOTER, newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return (String)eDynamicGet(BootstrapPackage.CARD__IMAGE, BootstrapPackage.Literals.CARD__IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		eDynamicSet(BootstrapPackage.CARD__IMAGE, BootstrapPackage.Literals.CARD__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.CARD__TOOLTIP:
				return basicSetTooltip(null, msgs);
			case BootstrapPackage.CARD__HEADER:
				return basicSetHeader(null, msgs);
			case BootstrapPackage.CARD__FOOTER:
				return basicSetFooter(null, msgs);
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
			case BootstrapPackage.CARD__BACKGROUND:
				return getBackground();
			case BootstrapPackage.CARD__TEXT_COLOR:
				return getTextColor();
			case BootstrapPackage.CARD__BORDER:
				return getBorder();
			case BootstrapPackage.CARD__COLOR_MODE:
				return getColorMode();
			case BootstrapPackage.CARD__TOOLTIP:
				return getTooltip();
			case BootstrapPackage.CARD__TITLE:
				return getTitle();
			case BootstrapPackage.CARD__HEADER:
				return getHeader();
			case BootstrapPackage.CARD__FOOTER:
				return getFooter();
			case BootstrapPackage.CARD__IMAGE:
				return getImage();
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
			case BootstrapPackage.CARD__BACKGROUND:
				setBackground((Color)newValue);
				return;
			case BootstrapPackage.CARD__TEXT_COLOR:
				setTextColor((Color)newValue);
				return;
			case BootstrapPackage.CARD__BORDER:
				setBorder((Color)newValue);
				return;
			case BootstrapPackage.CARD__COLOR_MODE:
				setColorMode((ColorMode)newValue);
				return;
			case BootstrapPackage.CARD__TOOLTIP:
				setTooltip((Tooltip)newValue);
				return;
			case BootstrapPackage.CARD__TITLE:
				setTitle((String)newValue);
				return;
			case BootstrapPackage.CARD__HEADER:
				setHeader((Element)newValue);
				return;
			case BootstrapPackage.CARD__FOOTER:
				setFooter((Element)newValue);
				return;
			case BootstrapPackage.CARD__IMAGE:
				setImage((String)newValue);
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
			case BootstrapPackage.CARD__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case BootstrapPackage.CARD__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case BootstrapPackage.CARD__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case BootstrapPackage.CARD__COLOR_MODE:
				setColorMode(COLOR_MODE_EDEFAULT);
				return;
			case BootstrapPackage.CARD__TOOLTIP:
				setTooltip((Tooltip)null);
				return;
			case BootstrapPackage.CARD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case BootstrapPackage.CARD__HEADER:
				setHeader((Element)null);
				return;
			case BootstrapPackage.CARD__FOOTER:
				setFooter((Element)null);
				return;
			case BootstrapPackage.CARD__IMAGE:
				setImage(IMAGE_EDEFAULT);
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
			case BootstrapPackage.CARD__BACKGROUND:
				return getBackground() != BACKGROUND_EDEFAULT;
			case BootstrapPackage.CARD__TEXT_COLOR:
				return getTextColor() != TEXT_COLOR_EDEFAULT;
			case BootstrapPackage.CARD__BORDER:
				return getBorder() != BORDER_EDEFAULT;
			case BootstrapPackage.CARD__COLOR_MODE:
				return getColorMode() != COLOR_MODE_EDEFAULT;
			case BootstrapPackage.CARD__TOOLTIP:
				return getTooltip() != null;
			case BootstrapPackage.CARD__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case BootstrapPackage.CARD__HEADER:
				return getHeader() != null;
			case BootstrapPackage.CARD__FOOTER:
				return getFooter() != null;
			case BootstrapPackage.CARD__IMAGE:
				return IMAGE_EDEFAULT == null ? getImage() != null : !IMAGE_EDEFAULT.equals(getImage());
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
				case BootstrapPackage.CARD__BACKGROUND: return BootstrapPackage.THEMED__BACKGROUND;
				case BootstrapPackage.CARD__TEXT_COLOR: return BootstrapPackage.THEMED__TEXT_COLOR;
				case BootstrapPackage.CARD__BORDER: return BootstrapPackage.THEMED__BORDER;
				case BootstrapPackage.CARD__COLOR_MODE: return BootstrapPackage.THEMED__COLOR_MODE;
				case BootstrapPackage.CARD__TOOLTIP: return BootstrapPackage.THEMED__TOOLTIP;
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
				case BootstrapPackage.THEMED__BACKGROUND: return BootstrapPackage.CARD__BACKGROUND;
				case BootstrapPackage.THEMED__TEXT_COLOR: return BootstrapPackage.CARD__TEXT_COLOR;
				case BootstrapPackage.THEMED__BORDER: return BootstrapPackage.CARD__BORDER;
				case BootstrapPackage.THEMED__COLOR_MODE: return BootstrapPackage.CARD__COLOR_MODE;
				case BootstrapPackage.THEMED__TOOLTIP: return BootstrapPackage.CARD__TOOLTIP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CardImpl
