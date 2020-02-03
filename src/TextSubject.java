import java.util.*;

public class TextSubject {
	private ArrayList<Observer> listObserver = new ArrayList<>();
	private String content;
	
	public TextSubject() {
		content = "";
	}
	
	public TextSubject(String initContent) {
		content = initContent;
	}
	
	public String readContent() {
		return content;
	}
	
	public void writeContent(String newContent) {
		content = newContent;
		notifyAllObserver();
	}
	
	public void attach(Observer observer) {
		listObserver.add(observer);
	}
	
	private void notifyAllObserver() {
		for (Observer observer : listObserver) {
			observer.update();
		}
	}
}
