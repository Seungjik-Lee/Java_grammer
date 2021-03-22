
public class CompFriend extends Friend {

	String depart;

	public CompFriend(String name, String number, String depart) {
		super(name, number);
		// TODO Auto-generated constructor stub
		this.depart = depart;
	}

	// alt + shift + s + s
	@Override
	public String toString() {
		return "CompFriend [depart=" + depart + ", name=" + name + ", number=" + number + "]";
	}
}
