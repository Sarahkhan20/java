//Factorial of a given number

class FactorialNumber{
    public static void main(String args[]){
        int i, fact = 1, number;
number=4;
for (i = 1; i <= number; i++) {
    fact *= i;
}
    System.out.println("Factorial pf "+number+"is:"+fact);
    }
}