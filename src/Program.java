import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        if (length == 0) {
            System.out.println("Пустий рядок!");
            return;
        } else if (length == 1) {
            System.out.println(input);
            return;
        }

        LinkedList<String> linkedList = new LinkedList<>();
        char firstChar = input.charAt(0);
        String charString = String.valueOf(firstChar);
        linkedList.offer(charString);

        for (int i = 1; i < length; i++) {
            int size = linkedList.size();
            for (int j = 0; j < size; j++) {
                String combination = linkedList.poll();
                char currentChar = input.charAt(i);
                linkedList.offer(combination + currentChar);
                linkedList.offer(combination + "." + currentChar);
            }
        }

        System.out.println(linkedList);
        System.out.println(linkedList.size());
    }
}
