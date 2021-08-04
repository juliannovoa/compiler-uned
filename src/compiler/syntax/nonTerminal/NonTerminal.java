package compiler.syntax.nonTerminal;

import java.util.ArrayList;
import java.util.List;

import es.uned.lsi.compiler.intermediate.QuadrupleIF;
import es.uned.lsi.compiler.intermediate.TemporalIF;
import es.uned.lsi.compiler.syntax.nonTerminal.NonTerminalIF;

/**
 * Abstract class for non terminals.
 */
public abstract class NonTerminal implements NonTerminalIF {

	private TemporalIF temp;
	private List<QuadrupleIF> intermediateCode;

	/**
	 * Constructor for NonTerminal.
	 */
	public NonTerminal() {
		super();
		this.intermediateCode = new ArrayList<>();
	}

	/**
	 * Returns the intermediateCode.
	 * 
	 * @return Returns the intermediateCode.
	 */
	@Override
	public List<QuadrupleIF> getIntermediateCode() {
		return intermediateCode;
	}

	/**
	 * Sets The intermediateCode.
	 * 
	 * @param intermediateCode
	 *            The intermediateCode to set.
	 */
	@Override
	public void setIntermediateCode(List<QuadrupleIF> intermediateCode) {
		this.intermediateCode = intermediateCode;
	}

	public TemporalIF getTemp() {
		return temp;
	}

	public void setTemp(TemporalIF temp) {
		this.temp = temp;
	}

}