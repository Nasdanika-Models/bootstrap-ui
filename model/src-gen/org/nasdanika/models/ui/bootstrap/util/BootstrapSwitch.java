/**
 */
package org.nasdanika.models.ui.bootstrap.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.governance.Governed;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

import org.nasdanika.models.ui.Checkbox;
import org.nasdanika.models.ui.Container;
import org.nasdanika.models.ui.Element;
import org.nasdanika.models.ui.Input;
import org.nasdanika.models.ui.Layout;
import org.nasdanika.models.ui.Text;

import org.nasdanika.models.ui.bootstrap.*;

import org.nasdanika.models.work.Workable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage
 * @generated
 */
public class BootstrapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BootstrapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapSwitch() {
		if (modelPackage == null) {
			modelPackage = BootstrapPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BootstrapPackage.TOOLTIP: {
				Tooltip tooltip = (Tooltip)theEObject;
				T result = caseTooltip(tooltip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.THEMED: {
				Themed themed = (Themed)theEObject;
				T result = caseThemed(themed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseContainer(page);
				if (result == null) result = caseThemed(page);
				if (result == null) result = caseElement(page);
				if (result == null) result = caseWorkable(page);
				if (result == null) result = caseStringIdentity(page);
				if (result == null) result = caseDocumented(page);
				if (result == null) result = caseMarked(page);
				if (result == null) result = caseGoverned(page);
				if (result == null) result = caseModelElement(page);
				if (result == null) result = caseReferrable(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = caseLayout(row);
				if (result == null) result = caseContainer(row);
				if (result == null) result = caseElement(row);
				if (result == null) result = caseWorkable(row);
				if (result == null) result = caseStringIdentity(row);
				if (result == null) result = caseDocumented(row);
				if (result == null) result = caseMarked(row);
				if (result == null) result = caseGoverned(row);
				if (result == null) result = caseModelElement(row);
				if (result == null) result = caseReferrable(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.SPAN: {
				Span span = (Span)theEObject;
				T result = caseSpan(span);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseContainer(column);
				if (result == null) result = caseElement(column);
				if (result == null) result = caseWorkable(column);
				if (result == null) result = caseStringIdentity(column);
				if (result == null) result = caseDocumented(column);
				if (result == null) result = caseMarked(column);
				if (result == null) result = caseGoverned(column);
				if (result == null) result = caseModelElement(column);
				if (result == null) result = caseReferrable(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseUi_Button(button);
				if (result == null) result = caseElement(button);
				if (result == null) result = caseWorkable(button);
				if (result == null) result = caseStringIdentity(button);
				if (result == null) result = caseDocumented(button);
				if (result == null) result = caseMarked(button);
				if (result == null) result = caseGoverned(button);
				if (result == null) result = caseModelElement(button);
				if (result == null) result = caseReferrable(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ALERT: {
				Alert alert = (Alert)theEObject;
				T result = caseAlert(alert);
				if (result == null) result = caseContainer(alert);
				if (result == null) result = caseThemed(alert);
				if (result == null) result = caseElement(alert);
				if (result == null) result = caseWorkable(alert);
				if (result == null) result = caseStringIdentity(alert);
				if (result == null) result = caseDocumented(alert);
				if (result == null) result = caseMarked(alert);
				if (result == null) result = caseGoverned(alert);
				if (result == null) result = caseModelElement(alert);
				if (result == null) result = caseReferrable(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T result = caseBadge(badge);
				if (result == null) result = caseText(badge);
				if (result == null) result = caseElement(badge);
				if (result == null) result = caseWorkable(badge);
				if (result == null) result = caseStringIdentity(badge);
				if (result == null) result = caseDocumented(badge);
				if (result == null) result = caseMarked(badge);
				if (result == null) result = caseGoverned(badge);
				if (result == null) result = caseModelElement(badge);
				if (result == null) result = caseReferrable(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CARD: {
				Card card = (Card)theEObject;
				T result = caseCard(card);
				if (result == null) result = caseContainer(card);
				if (result == null) result = caseThemed(card);
				if (result == null) result = caseElement(card);
				if (result == null) result = caseWorkable(card);
				if (result == null) result = caseStringIdentity(card);
				if (result == null) result = caseDocumented(card);
				if (result == null) result = caseMarked(card);
				if (result == null) result = caseGoverned(card);
				if (result == null) result = caseModelElement(card);
				if (result == null) result = caseReferrable(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.MODAL: {
				Modal modal = (Modal)theEObject;
				T result = caseModal(modal);
				if (result == null) result = caseContainer(modal);
				if (result == null) result = caseThemed(modal);
				if (result == null) result = caseElement(modal);
				if (result == null) result = caseWorkable(modal);
				if (result == null) result = caseStringIdentity(modal);
				if (result == null) result = caseDocumented(modal);
				if (result == null) result = caseMarked(modal);
				if (result == null) result = caseGoverned(modal);
				if (result == null) result = caseModelElement(modal);
				if (result == null) result = caseReferrable(modal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACCORDION_ITEM: {
				AccordionItem accordionItem = (AccordionItem)theEObject;
				T result = caseAccordionItem(accordionItem);
				if (result == null) result = caseContainer(accordionItem);
				if (result == null) result = caseElement(accordionItem);
				if (result == null) result = caseWorkable(accordionItem);
				if (result == null) result = caseStringIdentity(accordionItem);
				if (result == null) result = caseDocumented(accordionItem);
				if (result == null) result = caseMarked(accordionItem);
				if (result == null) result = caseGoverned(accordionItem);
				if (result == null) result = caseModelElement(accordionItem);
				if (result == null) result = caseReferrable(accordionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACCORDION: {
				Accordion accordion = (Accordion)theEObject;
				T result = caseAccordion(accordion);
				if (result == null) result = caseElement(accordion);
				if (result == null) result = caseWorkable(accordion);
				if (result == null) result = caseStringIdentity(accordion);
				if (result == null) result = caseDocumented(accordion);
				if (result == null) result = caseMarked(accordion);
				if (result == null) result = caseGoverned(accordion);
				if (result == null) result = caseModelElement(accordion);
				if (result == null) result = caseReferrable(accordion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.NAVBAR: {
				Navbar navbar = (Navbar)theEObject;
				T result = caseNavbar(navbar);
				if (result == null) result = caseContainer(navbar);
				if (result == null) result = caseThemed(navbar);
				if (result == null) result = caseElement(navbar);
				if (result == null) result = caseWorkable(navbar);
				if (result == null) result = caseStringIdentity(navbar);
				if (result == null) result = caseDocumented(navbar);
				if (result == null) result = caseMarked(navbar);
				if (result == null) result = caseGoverned(navbar);
				if (result == null) result = caseModelElement(navbar);
				if (result == null) result = caseReferrable(navbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.SPINNER: {
				Spinner spinner = (Spinner)theEObject;
				T result = caseSpinner(spinner);
				if (result == null) result = caseElement(spinner);
				if (result == null) result = caseWorkable(spinner);
				if (result == null) result = caseStringIdentity(spinner);
				if (result == null) result = caseDocumented(spinner);
				if (result == null) result = caseMarked(spinner);
				if (result == null) result = caseGoverned(spinner);
				if (result == null) result = caseModelElement(spinner);
				if (result == null) result = caseReferrable(spinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.PROGRESS: {
				Progress progress = (Progress)theEObject;
				T result = caseProgress(progress);
				if (result == null) result = caseElement(progress);
				if (result == null) result = caseWorkable(progress);
				if (result == null) result = caseStringIdentity(progress);
				if (result == null) result = caseDocumented(progress);
				if (result == null) result = caseMarked(progress);
				if (result == null) result = caseGoverned(progress);
				if (result == null) result = caseModelElement(progress);
				if (result == null) result = caseReferrable(progress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TOAST: {
				Toast toast = (Toast)theEObject;
				T result = caseToast(toast);
				if (result == null) result = caseContainer(toast);
				if (result == null) result = caseElement(toast);
				if (result == null) result = caseWorkable(toast);
				if (result == null) result = caseStringIdentity(toast);
				if (result == null) result = caseDocumented(toast);
				if (result == null) result = caseMarked(toast);
				if (result == null) result = caseGoverned(toast);
				if (result == null) result = caseModelElement(toast);
				if (result == null) result = caseReferrable(toast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.SWITCH: {
				org.nasdanika.models.ui.bootstrap.Switch switch_ = (org.nasdanika.models.ui.bootstrap.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseCheckbox(switch_);
				if (result == null) result = caseInput(switch_);
				if (result == null) result = caseElement(switch_);
				if (result == null) result = caseWorkable(switch_);
				if (result == null) result = caseStringIdentity(switch_);
				if (result == null) result = caseDocumented(switch_);
				if (result == null) result = caseMarked(switch_);
				if (result == null) result = caseGoverned(switch_);
				if (result == null) result = caseModelElement(switch_);
				if (result == null) result = caseReferrable(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooltip(Tooltip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Themed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Themed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThemed(Themed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpan(Span object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlert(Alert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadge(Badge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModal(Modal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordionItem(AccordionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccordion(Accordion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavbar(Navbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinner(Spinner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Progress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Progress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgress(Progress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToast(Toast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(org.nasdanika.models.ui.bootstrap.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoverned(Governed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkable(Workable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUi_Button(org.nasdanika.models.ui.Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckbox(Checkbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BootstrapSwitch
