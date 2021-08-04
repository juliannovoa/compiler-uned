package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */

public class SymbolParameter extends SymbolBase {

	/**
	 * Constructor for SymbolParameter.
	 * 
	 * @param scope
	 *            The declaration scope.
	 * @param name
	 *            The symbol name.
	 * @param type
	 *            The symbol type.
	 */
	public SymbolParameter(ScopeIF scope, String name, TypeIF type) {
		super(scope, name, type);
	}

	public SymbolParameter(String name, TypeIF type) {
		super(null, name, type);
	}

}
