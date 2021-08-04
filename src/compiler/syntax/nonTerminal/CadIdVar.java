package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

public class CadIdVar extends NonTerminal {

	private List<String> idList;

	public CadIdVar() {
		super();
		idList = new ArrayList<>();
	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}

	public void addIdToList(String newID) {
		idList.add(0, newID);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idList == null) ? 0 : idList.hashCode());
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
		final CadIdVar other = (CadIdVar) obj;
		if (idList == null) {
			if (other.idList != null) {
				return false;
			}
		} else if (!idList.equals(other.idList)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "CadIdVar [idList=" + idList + "]";
	}

}
