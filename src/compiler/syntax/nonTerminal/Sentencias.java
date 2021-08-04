package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Sentencias extends NonTerminal {

	private boolean hasAchievableReturn;
	private boolean consistent;
	private TypeIF type;

	public Sentencias() {
		super();
		hasAchievableReturn = false;
		consistent = true;
		type = null;
	}

	public Sentencias(Sentencia sentencia) {
		super();
		hasAchievableReturn = sentencia.hasAchievableReturn();
		consistent = true;
		type = sentencia.getType();
	}

	public void addSentencia(Sentencia sentencia) {
		final TypeIF sentenceType = sentencia.getType();
		// Comprobamos que exista consistencia entre los tipos de retorno.
		if (consistent && sentenceType != null) {
			// La que añadimos tiene un return
			hasAchievableReturn = hasAchievableReturn || sentencia.hasAchievableReturn();
			if (type == null) {
				// El grupo aun no tiene return
				type = sentenceType;
			} else {
				// El grupo tiene return
				if (!type.equals(sentenceType)) {
					// Hay inconsistencia de tipos
					consistent = false;
				}
			}
		}
	}

	public boolean isConsistent() {
		return consistent;
	}

	public void setConsistent(boolean consistent) {
		this.consistent = consistent;
	}

	public TypeIF getReturnType() {
		return type;
	}

	public void setType(TypeIF type) {
		this.type = type;
	}

	public boolean hasAchievableReturn() {
		return hasAchievableReturn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (consistent ? 1231 : 1237);
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
		final Sentencias other = (Sentencias) obj;
		if (consistent != other.consistent) {
			return false;
		}
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
		return "Sentencias [hasAchievableReturn=" + hasAchievableReturn + ", consistent=" + consistent + ", type="
				+ type + "]";
	}

}
