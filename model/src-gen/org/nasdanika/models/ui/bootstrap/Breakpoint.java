/**
 */
package org.nasdanika.models.ui.bootstrap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Breakpoint</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.ui.bootstrap.BootstrapPackage#getBreakpoint()
 * @model
 * @generated
 */
public enum Breakpoint implements Enumerator {
	/**
	 * The '<em><b>XS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XS_VALUE
	 * @generated
	 * @ordered
	 */
	XS(0, "XS", "XS"),

	/**
	 * The '<em><b>SM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM_VALUE
	 * @generated
	 * @ordered
	 */
	SM(0, "SM", "SM"),

	/**
	 * The '<em><b>MD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MD_VALUE
	 * @generated
	 * @ordered
	 */
	MD(0, "MD", "MD"),

	/**
	 * The '<em><b>LG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LG_VALUE
	 * @generated
	 * @ordered
	 */
	LG(0, "LG", "LG"),

	/**
	 * The '<em><b>XL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XL_VALUE
	 * @generated
	 * @ordered
	 */
	XL(0, "XL", "XL"),

	/**
	 * The '<em><b>XXL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XXL_VALUE
	 * @generated
	 * @ordered
	 */
	XXL(0, "XXL", "XXL");

	/**
	 * The '<em><b>XS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XS_VALUE = 0;

	/**
	 * The '<em><b>SM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SM_VALUE = 0;

	/**
	 * The '<em><b>MD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MD_VALUE = 0;

	/**
	 * The '<em><b>LG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LG_VALUE = 0;

	/**
	 * The '<em><b>XL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XL_VALUE = 0;

	/**
	 * The '<em><b>XXL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XXL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XXL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Breakpoint</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Breakpoint[] VALUES_ARRAY =
		new Breakpoint[] {
			XS,
			SM,
			MD,
			LG,
			XL,
			XXL,
		};

	/**
	 * A public read-only list of all the '<em><b>Breakpoint</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Breakpoint> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Breakpoint</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Breakpoint get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Breakpoint result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Breakpoint</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Breakpoint getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Breakpoint result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Breakpoint</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Breakpoint get(int value) {
		switch (value) {
			case XS_VALUE: return XS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Breakpoint(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Breakpoint
