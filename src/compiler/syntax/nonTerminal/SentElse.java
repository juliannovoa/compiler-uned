package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SentElse extends Sentencia {

	public SentElse(boolean hasAchievableReturn, TypeIF type) {
		super(hasAchievableReturn, type);
	}

	public SentElse() {
		super();
	}

}
