import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class smart {
    private static Map<String, String[]> javaQuestionsOptions = new HashMap<>();
    static {
        javaQuestionsOptions.put("Which keyword is used to inherit a class in Java?", new String[]{"extends", "implements", "inherits", "super"});
        javaQuestionsOptions.put("Which of the following is not a primitive data type?", new String[]{"String", "int", "char", "boolean"});
        javaQuestionsOptions.put("Which method is used to start a thread in Java?", new String[]{"start()", "run()", "init()", "execute()"});
        javaQuestionsOptions.put("Which of the following is used to create an object in Java?", new String[]{"new", "create", "object", "instantiate"});
        javaQuestionsOptions.put("Which keyword is used to define a constant variable in Java?", new String[]{"final", "const", "static", "immutable"});
    }
    private static String[][] printStatements = {
        {"What will be the output of the following code?\nSystem.out.println(5 + 3 * 2);", "11"},
        {"What will be the output of the following code?\nSystem.out.println(\"Hello\" + \" World!\");", "Hello World!"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        int wrongAnswers = 0;

        System.out.println("Welcome to the Java Quiz!");
        System.out.println("Choose the correct answer for the following questions:\n");
        for (Map.Entry<String, String[]> entry : javaQuestionsOptions.entrySet()) {
            String question = entry.getKey();
            String[] options = entry.getValue();

            System.out.println(question);
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            int userChoice = scanner.nextInt();

            if (options[userChoice - 1].equalsIgnoreCase(options[0])) {
                System.out.println("Correct!\n");
                correctAnswers++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + options[0] + "\n");
                wrongAnswers++;
            }
        }
        scanner.nextLine(); 
        System.out.println("Now, let's move on to the print statement questions:\n");
        for (int i = 0; i < printStatements.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + printStatements[i][0]);
            String userAnswer = scanner.nextLine().trim();  
            if (userAnswer.equalsIgnoreCase(printStatements[i][1])) {
                System.out.println("Correct!\n");
                correctAnswers++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + printStatements[i][1] + "\n");
                wrongAnswers++;
            }
        }

        System.out.println("Quiz over! Your final score is:");
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Wrong answers: " + wrongAnswers);
        System.out.println("Total score: " + correctAnswers + " out of " + (javaQuestionsOptions.size() + printStatements.length));
        scanner.close();
    }
}
