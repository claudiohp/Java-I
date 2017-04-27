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
		Employee [] e = new Employee[5];
		e[0] = new Professor("Joao", 300, 12);
		e[1] = new Professor("Paulo", 320, 15);
		e[2] = new Professor("Joao", 310, 16);
		e[3] = new Secretary("Joana", 600, 1200);
		e[4] = new Secretary("Patricia", 300, 2000);
		
		for( Employee e1: e){
			System.out.println(e1);
		}
	
	}
}
