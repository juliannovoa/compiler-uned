package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class IdArray extends Expresion {

	public IdArray() {
		super();
	}

	public IdArray(TypeIF type) {
		super(type);
	}

	@Override
	public String toString() {
		return "IdArray [getType()=" + getType() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", getIntermediateCode()=" + getIntermediateCode() + ", getTemp()=" + getTemp() + ", getClass()="
				+ getClass() + "]";
	}

}
