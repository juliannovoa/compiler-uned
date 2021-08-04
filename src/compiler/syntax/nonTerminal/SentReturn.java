package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SentReturn extends Sentencia {

	public SentReturn(TypeIF type) {
		super(true, type);
	}

	public SentReturn() {
		super();
	}

}
