package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class ProcParam extends NonTerminal {

	private List<SymbolIF> procParamList;

	public ProcParam() {
		super();
		procParamList = new ArrayList<>();
	}

	public List<SymbolIF> getParamList() {
		return procParamList;
	}

	public void addParam(SymbolIF newParam) {
		procParamList.add(newParam);
	}

	public void setProcParamList(List<SymbolIF> procParamList) {
		this.procParamList = procParamList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((procParamList == null) ? 0 : procParamList.hashCode());
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
		final ProcParam other = (ProcParam) obj;
		if (procParamList == null) {
			if (other.procParamList != null) {
				return false;
			}
		} else if (!procParamList.equals(other.procParamList)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ProcParam [procParamList=" + procParamList + "]";
	}

}
