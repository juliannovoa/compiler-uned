package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeArray.
 */

public class TypeArray extends TypeBase {
	private TypeIF type;
	private int firstPosition;
	private int lastPosition;

	/**
	 * Constructor for TypeArray.
	 *
	 * @param scope
	 *            The declaration scope.
	 */
	public TypeArray(ScopeIF scope) {
		super(scope);
	}

	/**
	 * Constructor for TypeArray.
	 *
	 * @param scope
	 *            The declaration scope.
	 * @param name
	 *            The name of the type.
	 */
	public TypeArray(ScopeIF scope, String name) {
		super(scope, name);
	}

	public TypeArray(ScopeIF scope, String name, TypeIF baseType, int firstPosition, int lastPosition) {
		super(scope, name);
		this.type = baseType;
		this.firstPosition = firstPosition;
		this.lastPosition = lastPosition;
	}

	/**
	 * Returns the size of the type.
	 *
	 * @return the size of the type.
	 */
	@Override
	public int getSize() {
		return lastPosition - firstPosition + 1;
	}

	public TypeIF getBaseType() {
		return type;
	}

	public void setType(TypeIF type) {
		this.type = type;
	}

	public int getFirstPosition() {
		return firstPosition;
	}

	public void setFirstPosition(int firstPosition) {
		this.firstPosition = firstPosition;
	}

	public int getLastPosition() {
		return lastPosition;
	}

	public void setLastPosition(int lastPosition) {
		this.lastPosition = lastPosition;
	}
}
