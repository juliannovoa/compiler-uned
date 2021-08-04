package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class Variables extends NonTerminal {

	private TypeIF type;
	private boolean asignable;

	public Variables() {
		super();
	}

	public Variables(TypeIF type, boolean asignable) {
		super();
		this.type = type;
		this.asignable = asignable;
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
		final Variables other = (Variables) obj;
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
		return "Variables [type=" + type + "]";
	}

	public boolean isAsignable() {
		return asignable;
	}

	public void setAsignable(boolean asignable) {
		this.asignable = asignable;
	}

}
