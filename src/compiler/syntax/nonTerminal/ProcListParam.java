package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class ProcListParam extends NonTerminal {

	private final List<SymbolIF> paramList;

	public ProcListParam() {
		super();
		paramList = new ArrayList<>();
	}

	public void addParameters(List<SymbolIF> newParam) {
		paramList.addAll(0, newParam);
	}

	public List<SymbolIF> getParamList() {
		return paramList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paramList == null) ? 0 : paramList.hashCode());
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
		final ProcListParam other = (ProcListParam) obj;
		if (paramList == null) {
			if (other.paramList != null) {
				return false;
			}
		} else if (!paramList.equals(other.paramList)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ProcListParam [paramList=" + paramList + "]";
	}

}
