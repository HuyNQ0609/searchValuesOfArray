import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michel", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "David", "William"};
        System.out.println("Enter the name you want to find: ");
        String name = scanner.nextLine();
        boolean checkName = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                checkName = true;
                System.out.println("Position of the students in the list" + name + " is:" + i);
                break;
            }
        }
        if (!checkName) {
            System.out.println("The name you are looking for is not in the list!");
        }
    }
}