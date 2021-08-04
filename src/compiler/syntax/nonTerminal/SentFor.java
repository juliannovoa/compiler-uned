package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SentFor extends Sentencia {

	public SentFor(TypeIF type) {
		super(false, type);
	}

	public SentFor() {
		super();
	}

}
