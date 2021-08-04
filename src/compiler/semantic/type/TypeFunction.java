package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeFunction.
 */
public class TypeFunction extends TypeProcedure {

	private TypeIF returnType;

	/**
	 * Constructor for TypeFunction.
	 *
	 * @param scope
	 *            The declaration scope.
	 */
	public TypeFunction(ScopeIF scope) {
		super(scope);
	}

	/**
	 * Constructor for TypeFunction.
	 *
	 * @param scope
	 *            The declaration scope
	 * @param name
	 *            The name of the function.
	 */
	public TypeFunction(ScopeIF scope, String name) {
		super(scope, name);
	}

	public TypeFunction(ScopeIF scope, String name, TypeIF returnType) {
		super(scope, name);
		this.returnType = returnType;
	}

	/**
	 * Returns the size of the type.
	 *
	 * @return the size of the type.
	 */
	@Override
	public int getSize() {
		// TODO: Student work
		return 1;
	}

	public TypeIF getReturnType() {
		return returnType;
	}

	public void setReturnType(TypeIF returnType) {
		this.returnType = returnType;
	}
}
