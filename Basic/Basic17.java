public class Basic17 {
    public static void main(String[] args) {
        int firstNum = 0b10;
        int secondNum = 0b11;
        int sum = Math.addExact(firstNum, secondNum);

        System.out.println(Integer.toBinaryString(sum));
    }
}
