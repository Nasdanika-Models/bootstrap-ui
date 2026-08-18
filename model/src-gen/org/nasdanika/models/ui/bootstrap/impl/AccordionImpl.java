/**
 */
package org.nasdanika.models.ui.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.ui.bootstrap.Accordion;
import org.nasdanika.models.ui.bootstrap.AccordionItem;
import org.nasdanika.models.ui.bootstrap.BootstrapPackage;

import org.nasdanika.models.ui.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accordion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.AccordionImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.AccordionImpl#isAlwaysOpen <em>Always Open</em>}</li>
 *   <li>{@link org.nasdanika.models.ui.bootstrap.impl.AccordionImpl#isFlush <em>Flush</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccordionImpl extends ElementImpl implements Accordion {
	/**
	 * The default value of the '{@link #isAlwaysOpen() <em>Always Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlwaysOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALWAYS_OPEN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFlush() <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlush()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUSH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccordionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.ACCORDION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccordionItem> getItems() {
		return (EList<AccordionItem>)eDynamicGet(BootstrapPackage.ACCORDION__ITEMS, BootstrapPackage.Literals.ACCORDION__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAlwaysOpen() {
		return (Boolean)eDynamicGet(BootstrapPackage.ACCORDION__ALWAYS_OPEN, BootstrapPackage.Literals.ACCORDION__ALWAYS_OPEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlwaysOpen(boolean newAlwaysOpen) {
		eDynamicSet(BootstrapPackage.ACCORDION__ALWAYS_OPEN, BootstrapPackage.Literals.ACCORDION__ALWAYS_OPEN, newAlwaysOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFlush() {
		return (Boolean)eDynamicGet(BootstrapPackage.ACCORDION__FLUSH, BootstrapPackage.Literals.ACCORDION__FLUSH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlush(boolean newFlush) {
		eDynamicSet(BootstrapPackage.ACCORDION__FLUSH, BootstrapPackage.Literals.ACCORDION__FLUSH, newFlush);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.ACCORDION__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.ACCORDION__ITEMS:
				return getItems();
			case BootstrapPackage.ACCORDION__ALWAYS_OPEN:
				return isAlwaysOpen();
			case BootstrapPackage.ACCORDION__FLUSH:
				return isFlush();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.ACCORDION__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends AccordionItem>)newValue);
				return;
			case BootstrapPackage.ACCORDION__ALWAYS_OPEN:
				setAlwaysOpen((Boolean)newValue);
				return;
			case BootstrapPackage.ACCORDION__FLUSH:
				setFlush((Boolean)newValue);
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
			case BootstrapPackage.ACCORDION__ITEMS:
				getItems().clear();
				return;
			case BootstrapPackage.ACCORDION__ALWAYS_OPEN:
				setAlwaysOpen(ALWAYS_OPEN_EDEFAULT);
				return;
			case BootstrapPackage.ACCORDION__FLUSH:
				setFlush(FLUSH_EDEFAULT);
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
			case BootstrapPackage.ACCORDION__ITEMS:
				return !getItems().isEmpty();
			case BootstrapPackage.ACCORDION__ALWAYS_OPEN:
				return isAlwaysOpen() != ALWAYS_OPEN_EDEFAULT;
			case BootstrapPackage.ACCORDION__FLUSH:
				return isFlush() != FLUSH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AccordionImpl
