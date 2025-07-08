package exercises.javabase;

public class Main {
    public static void main(String[] args) {
        Studente test = new Studente("Test", "Testing", 123);

        System.out.println(test.toString());

        ContoBancario test2 = new ContoBancario("testing123");
        System.out.println(test2.getAccountBalance());
        test2.deposit(100);
        test2.withdraw(25);
        System.out.println(test2.getAccountBalance());
    }
}
