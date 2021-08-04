package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Cuerpo extends NonTerminal {

	private TypeIF returnType;

	public Cuerpo() {
		super();
		returnType = null;
	}

	public Cuerpo(TypeIF type) {
		super();
		returnType = type;
	}

	public TypeIF getReturnType() {
		return returnType;
	}

	public void setReturnType(TypeIF returnType) {
		this.returnType = returnType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((returnType == null) ? 0 : returnType.hashCode());
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
		final Cuerpo other = (Cuerpo) obj;
		if (returnType == null) {
			if (other.returnType != null) {
				return false;
			}
		} else if (!returnType.equals(other.returnType)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Cuerpo [returnType=" + returnType + "]";
	}

}
