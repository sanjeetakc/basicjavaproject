public class GreetsUser {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        var name = scanner.nextLine();
        System.out.println("Hello"+ " " + name);

    }
}
