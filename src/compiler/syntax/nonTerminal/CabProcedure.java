package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.type.TypeIF;

public class CabProcedure extends Cuerpo {

	private String id;
	private int line;

	public CabProcedure(String id) {
		super();
		this.id = id;
	}

	public CabProcedure(TypeIF type, String id, int line) {
		super(type);
		this.id = id;
		this.line = line;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public boolean sameReturnType(TypeIF type) {
		final TypeIF rType = getReturnType();
		if (rType == null) {
			return rType == type;
		} else {
			return rType.equals(type);
		}
	}

}
