public class Main {
    public static void main(String[] args) {
        System.out.println(mathUtil.isPrime(6));
        System.out.println(mathUtil.gcd(36 , 6));
        System.out.println(mathUtil.lcm(4, 6));
        System.out.println(mathUtil.fibonacci(10));
        System.out.println(mathUtil.factorial(11));

        mathUtil util = new mathUtil();
        System.out.println(util.sumOfDigits(345));
        System.out.println(util.isPerfectNumber(9));
        System.out.println(util.reverseNumber(789));
        System.out.println(util.nextPrime(7));
    }
}
