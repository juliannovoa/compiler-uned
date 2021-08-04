package compiler.semantic.type;

import java.util.List;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeProcedure.
 */

public class TypeProcedure extends TypeBase {

	private List<TypeIF> paramTypeList;

	/**
	 * Constructor for TypeProcedure.
	 *
	 * @param scope
	 *            The declaration scope.
	 */
	public TypeProcedure(ScopeIF scope) {
		super(scope);
	}

	/**
	 * Constructor for TypeProcedure.
	 *
	 * @param scope
	 *            The declaration scope
	 * @param name
	 *            The name of the procedure.
	 */
	public TypeProcedure(ScopeIF scope, String name) {
		super(scope, name);
	}

	public void addParameters(List<TypeIF> paramTypeList) {
		this.paramTypeList = paramTypeList;
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

	public List<TypeIF> getParamTypeList() {
		return paramTypeList;
	}

	public void setParamTypeList(List<TypeIF> paramTypeList) {
		this.paramTypeList = paramTypeList;
	}

}
