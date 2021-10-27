public class DefineOddEvenNumber {
    public static void main(String[] args) {
        int number = 21; //change the number
        
        if (number % 2 == 0 || number == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}