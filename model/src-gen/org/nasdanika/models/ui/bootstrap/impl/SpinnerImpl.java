/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.ui.bootstrap.BootstrapPackage;
import org.nasdanika.models.ui.bootstrap.Color;
import org.nasdanika.models.ui.bootstrap.Size;
import org.nasdanika.models.ui.bootstrap.Spinner;
import org.nasdanika.models.ui.bootstrap.SpinnerKind;

import org.nasdanika.models.ui.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.SpinnerImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.SpinnerImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.SpinnerImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpinnerImpl extends ElementImpl implements Spinner {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SpinnerKind KIND_EDEFAULT = SpinnerKind.BORDER;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.SMALL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpinnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.SPINNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpinnerKind getKind() {
		return (SpinnerKind)eDynamicGet(BootstrapPackage.SPINNER__KIND, BootstrapPackage.Literals.SPINNER__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(SpinnerKind newKind) {
		eDynamicSet(BootstrapPackage.SPINNER__KIND, BootstrapPackage.Literals.SPINNER__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Color getColor() {
		return (Color)eDynamicGet(BootstrapPackage.SPINNER__COLOR, BootstrapPackage.Literals.SPINNER__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(Color newColor) {
		eDynamicSet(BootstrapPackage.SPINNER__COLOR, BootstrapPackage.Literals.SPINNER__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size getSize() {
		return (Size)eDynamicGet(BootstrapPackage.SPINNER__SIZE, BootstrapPackage.Literals.SPINNER__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Size newSize) {
		eDynamicSet(BootstrapPackage.SPINNER__SIZE, BootstrapPackage.Literals.SPINNER__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.SPINNER__KIND:
				return getKind();
			case BootstrapPackage.SPINNER__COLOR:
				return getColor();
			case BootstrapPackage.SPINNER__SIZE:
				return getSize();
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
			case BootstrapPackage.SPINNER__KIND:
				setKind((SpinnerKind)newValue);
				return;
			case BootstrapPackage.SPINNER__COLOR:
				setColor((Color)newValue);
				return;
			case BootstrapPackage.SPINNER__SIZE:
				setSize((Size)newValue);
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
			case BootstrapPackage.SPINNER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case BootstrapPackage.SPINNER__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BootstrapPackage.SPINNER__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case BootstrapPackage.SPINNER__KIND:
				return getKind() != KIND_EDEFAULT;
			case BootstrapPackage.SPINNER__COLOR:
				return getColor() != COLOR_EDEFAULT;
			case BootstrapPackage.SPINNER__SIZE:
				return getSize() != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SpinnerImpl
