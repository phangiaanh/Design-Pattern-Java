class DuplicateString implements StrategyString {
	@Override
	public String doOperation(String string1, String string2) {
		return string1 + string1 + string2 + string2;
	}
}

class ConcatenateString implements StrategyString {
	@Override
	public String doOperation(String string1, String string2) {
		return string1 + string2;
	}
}

class AcronymString implements StrategyString {
	@Override
	public String doOperation(String string1, String string2) {
		return string1.replaceAll("\\B.|\\P{L}", "").toUpperCase() + string2.replaceAll("\\B.|\\P{L}", "").toUpperCase();  
	}
}

public class StrategyDemo {
	public static void main(String[] args) {
		System.out.println("Initial String: (De Dam Duc, Cao Cute)");

		Strategy context = new Strategy(new DuplicateString());
		System.out.println(context.executeOperation("De Dam Duc", "Cao Cute"));
		
		context = new Strategy(new ConcatenateString());
		System.out.println(context.executeOperation("De Dam Duc", "Cao Cute"));
		
		context = new Strategy(new AcronymString());
		System.out.println(context.executeOperation("De Dam Duc", "Cao Cute"));
	}
}
