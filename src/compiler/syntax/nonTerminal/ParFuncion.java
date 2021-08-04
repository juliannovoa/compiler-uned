package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ParFuncion extends NonTerminal {

	private final List<TypeIF> paramList;

	public ParFuncion() {
		super();
		paramList = new ArrayList<>();
	}

	public ParFuncion(TypeIF type) {
		super();
		paramList = new ArrayList<>();
		paramList.add(type);
	}

	public void addParamType(TypeIF type) {
		paramList.add(type);
	}

	public List<TypeIF> getParamList() {
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
		final ParFuncion other = (ParFuncion) obj;
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
		return "ParFuncion [paramList=" + paramList + "]";
	}

}
