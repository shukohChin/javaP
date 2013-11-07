
public class HelloWorld {

	public static void main(String[] args){

		Animal a = new Animal();
		Person p = new Person();
		Dog    d = new Dog();

		a.eat(p);
		p.eat(d);
		p.eat(a);
		d.eat(p);
		d.eat(a);
	}
}
