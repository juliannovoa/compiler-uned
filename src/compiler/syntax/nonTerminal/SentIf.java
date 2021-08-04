package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class SentIf extends Sentencia {

	public boolean consistent;

	public SentIf() {
		super();
		consistent = true;
	}

	public SentIf(Sentencias sentencias, SentElse sentElse) {
		super();
		setHasAchievableReturn(sentencias.hasAchievableReturn() && sentElse.hasAchievableReturn());
		final TypeIF sType = sentencias.getReturnType();
		final TypeIF sEType = sentElse.getType();
		if (sType != null) {
			// Rama if tiene un return
			if (sEType == null) {
				// Else no tiene return
				setType(sType);
			} else {
				// Rama else tiene un return
				if (!sType.equals(sEType)) {
					// Tipos inconsistentes
					consistent = false;
				} else {
					// Tipos Consistentes
					setType(sType);
				}
			}
		}
		consistent = true;

	}

	public boolean isConsistent() {
		return consistent;
	}

	public void setConsistent(boolean consistent) {
		this.consistent = consistent;
	}

}
