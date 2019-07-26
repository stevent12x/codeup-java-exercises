public class StringExercise {

    public static void main(String[] args) {
        String message = "We don't need no education \nWe don't need no thought control Check \"this\" out!, \"s inside of \"s! In windows, the main drive is usually C:\\ I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(message.substring(0, message.indexOf("Check")) + "\n\n" + (message.substring(message.indexOf("Check") , message.lastIndexOf("In"))) + "\n\n" + (message.substring(message.indexOf("In"), (message.lastIndexOf("I"))) + "\n\n" + message.substring(message.lastIndexOf("I"))));
    }
}
