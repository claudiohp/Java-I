package polimorfismo;

public class Main {

	public static void main(String[] args) {
//		Person p = new Student();
//		Student s = new Person(); // Erro de compilação
//		Student s = new Student();

//		Student s1 = new Student();
//		s1.m1();
		
//		Student student = new Student();
//		s1.m1();
/*
 * Classe Pessoa recebe a variavel P, p pertence a classe Pessoa. Que recebe 		
 */
//		Person p = new Student();
//		p.m1();
		Employee [] p = new Professor[3];
		p[0] = new Professor("Joao", 300, 12);
		p[1] = new Professor("Paulo", 320, 15);
		p[2] = new Professor("Joao", 310, 16);
		System.out.println(p[2].getSalary());
		Employee [] s = new Secretary[2];
		s[0] = new Secretary("Joana", 600, 1200);
		s[1] = new Secretary("Patricia", 300, 2000);
		
	}
}
