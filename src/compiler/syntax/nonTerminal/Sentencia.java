package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Sentencia extends NonTerminal {

	private boolean hasAchievableReturn;
	private TypeIF type;

	public Sentencia() {
		super();
		hasAchievableReturn = false;
		type = null;
	}

	public Sentencia(boolean hasAchievableReturn, TypeIF type) {
		super();
		this.hasAchievableReturn = hasAchievableReturn;
		this.type = type;
	}

	public boolean hasAchievableReturn() {
		return hasAchievableReturn;
	}

	public void setHasAchievableReturn(boolean hasAchievableReturn) {
		this.hasAchievableReturn = hasAchievableReturn;
	}

	public TypeIF getType() {
		return type;
	}

	public void setType(TypeIF type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasAchievableReturn ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final Sentencia other = (Sentencia) obj;
		if (hasAchievableReturn != other.hasAchievableReturn) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Sentencia [hasAchievableReturn=" + hasAchievableReturn + ", type=" + type + "]";
	}

}
