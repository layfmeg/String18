public class Main {
    public static void test (String[] args) {
        String name = "hello";

        String result = name.replaceAll("hello", "olleh");
        System.out.println(result);
    }
    public static void main(String[] args) {
        String sentence = "Обожаю язык программирования Java";
        char ch1 = sentence.charAt(0);
        char ch2 = sentence.charAt(5);
        char ch3 = sentence.charAt(9);
        System.out.println("Буква 0 индекса это: " + ch1);
        System.out.println("Буква 5 индекса это: " + ch2);
        System.out.println("Буква 9 индекса это: " + ch3);
    }
    }
