
public class BoxMana {
	BoxMana() {
		Box<Apple> abox = new Box<Apple>(new Apple());
		Box<Orange> bbox = new Box<Orange>(new Orange());

		Apple a = (Apple) abox.getObj();
		Orange o = (Orange) bbox.getObj();

		System.out.println(a);
		System.out.println(o);
	}

	public static void main(String[] args) {
		new BoxMana();
	}
}
