package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ProcParenParam extends NonTerminal {

	private final List<SymbolIF> parameters;

	public ProcParenParam() {
		super();
		parameters = new ArrayList<>();
	}

	public ProcParenParam(List<SymbolIF> parameters) {
		super();
		this.parameters = parameters;
	}

	public List<SymbolIF> getParameters() {
		return parameters;
	}

	public List<TypeIF> getTypeList() {
		final List<TypeIF> output = new ArrayList<>();
		for (final SymbolIF symbol : parameters) {
			output.add(symbol.getType());
		}
		return output;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parameters == null) ? 0 : parameters.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ProcParenParam other = (ProcParenParam) obj;
		if (parameters == null) {
			if (other.parameters != null) {
				return false;
			}
		} else if (!parameters.equals(other.parameters)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ProcParenParam [parameters=" + parameters + "]";
	}

}
