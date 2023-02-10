public class MyClass {

    public static void main(String[] args) {

        String firstName = "Isequiel";
        String lastName = "Nascimento";
        String fullName = getFullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String getFullName(String firstName, String lastName) {
        return "The method result is " + firstName.concat(" ").concat(lastName);
    }
}