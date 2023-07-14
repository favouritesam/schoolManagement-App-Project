import dto.request.RegisterRequest;
import dto.response.RegistrationResponse;
import service.StudentServiceImpl;
import service.StudentServiceRepository;

import java.util.Scanner;

public class Main {
   private static StudentServiceRepository studentServiceRepository = new StudentServiceImpl();
    public static void mainMenu(){
        System.out.println("""
                    Enter 1 to register
                    Enter 2 to updateProfile
                    Enter 3 to go back to main menu
                    """);
    }
    public static void main(String[] args) {

        Main.mainMenu();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        switch (userInput){
            case "1": register();
        }
    }

    private static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("enter parents phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("enter class");
        String classRoom = scanner.nextLine();
        System.out.println("how old are you ");
        int age = scanner.nextInt();
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setName(name);
        registerRequest.setAge(age);
        registerRequest.setParentPhoneNumber(phoneNumber);
        registerRequest.setClassRoom(classRoom);
        System.out.println(studentServiceRepository.Register(registerRequest));
        mainMenu();
    }
}