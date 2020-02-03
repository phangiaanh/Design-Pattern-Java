public class Strategy {
	private StrategyString operation;
	
	public Strategy(StrategyString operation) {
		this.operation = operation;
	}
	
	public String executeOperation(String string1, String string2) {
		return operation.doOperation(string1, string2);
	}
}
