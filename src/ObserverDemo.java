class Upper extends Observer {
	
	public Upper(TextSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("The uppercase of the new content is: " + subject.readContent().toUpperCase());
	}
}

class Lower extends Observer {
	
	public Lower(TextSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("The lowercase of the new content is: " + subject.readContent().toLowerCase());
	}
}


public class ObserverDemo {
	public static void main(String[] args) {
		TextSubject newText = new TextSubject("Phan Gia Anh");
		
		Upper upperText = new Upper(newText);
		Lower lowerText = new Lower(newText);
		
		System.out.println("<Test 1:> Nothing changed: " + newText.readContent());
		
		System.out.println("<Test 2> Changing newText to: Mai Hoang Anh Thu");
		newText.writeContent("Mai Hoang Anh Thu");
		
		System.out.println("<Test 3> Changing newText to: De <3 Cao");
		newText.writeContent("De <3 Cao");
	}
}
