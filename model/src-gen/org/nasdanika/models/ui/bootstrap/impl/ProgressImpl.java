/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Color;
import org.nasdanika.models.ui.bootstrap.Progress;

import org.nasdanika.models.ui.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ProgressImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ProgressImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ProgressImpl#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.ProgressImpl#isAnimated <em>Animated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressImpl extends ElementImpl implements Progress {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

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
	 * The default value of the '{@link #isStriped() <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStriped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIPED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAnimated() <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANIMATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.PROGRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValue() {
		return (Double)eDynamicGet(BootstrapPackage.PROGRESS__VALUE, BootstrapPackage.Literals.PROGRESS__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(double newValue) {
		eDynamicSet(BootstrapPackage.PROGRESS__VALUE, BootstrapPackage.Literals.PROGRESS__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColor() {
		return (Color)eDynamicGet(BootstrapPackage.PROGRESS__COLOR, BootstrapPackage.Literals.PROGRESS__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Color newColor) {
		eDynamicSet(BootstrapPackage.PROGRESS__COLOR, BootstrapPackage.Literals.PROGRESS__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStriped() {
		return (Boolean)eDynamicGet(BootstrapPackage.PROGRESS__STRIPED, BootstrapPackage.Literals.PROGRESS__STRIPED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStriped(boolean newStriped) {
		eDynamicSet(BootstrapPackage.PROGRESS__STRIPED, BootstrapPackage.Literals.PROGRESS__STRIPED, newStriped);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnimated() {
		return (Boolean)eDynamicGet(BootstrapPackage.PROGRESS__ANIMATED, BootstrapPackage.Literals.PROGRESS__ANIMATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnimated(boolean newAnimated) {
		eDynamicSet(BootstrapPackage.PROGRESS__ANIMATED, BootstrapPackage.Literals.PROGRESS__ANIMATED, newAnimated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.PROGRESS__VALUE:
				return getValue();
			case BootstrapPackage.PROGRESS__COLOR:
				return getColor();
			case BootstrapPackage.PROGRESS__STRIPED:
				return isStriped();
			case BootstrapPackage.PROGRESS__ANIMATED:
				return isAnimated();
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
			case BootstrapPackage.PROGRESS__VALUE:
				setValue((Double)newValue);
				return;
			case BootstrapPackage.PROGRESS__COLOR:
				setColor((Color)newValue);
				return;
			case BootstrapPackage.PROGRESS__STRIPED:
				setStriped((Boolean)newValue);
				return;
			case BootstrapPackage.PROGRESS__ANIMATED:
				setAnimated((Boolean)newValue);
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
			case BootstrapPackage.PROGRESS__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BootstrapPackage.PROGRESS__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BootstrapPackage.PROGRESS__STRIPED:
				setStriped(STRIPED_EDEFAULT);
				return;
			case BootstrapPackage.PROGRESS__ANIMATED:
				setAnimated(ANIMATED_EDEFAULT);
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
			case BootstrapPackage.PROGRESS__VALUE:
				return getValue() != VALUE_EDEFAULT;
			case BootstrapPackage.PROGRESS__COLOR:
				return getColor() != COLOR_EDEFAULT;
			case BootstrapPackage.PROGRESS__STRIPED:
				return isStriped() != STRIPED_EDEFAULT;
			case BootstrapPackage.PROGRESS__ANIMATED:
				return isAnimated() != ANIMATED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ProgressImpl
