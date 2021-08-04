package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class ValorConst extends NonTerminal {

	private TypeIF type;
	private int value;

	public ValorConst() {
		super();
	}

	public ValorConst(TypeIF type) {
		super();
		this.type = type;
	}

	public ValorConst(TypeIF type, int value) {
		super();
		this.type = type;
		this.value = value;
	}

	public TypeIF getType() {
		return type;
	}

	public void setType(TypeIF type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + value;
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
		final ValorConst other = (ValorConst) obj;
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		if (value != other.value) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ValorConst [type=" + type + ", value=" + value + "]";
	}

}
