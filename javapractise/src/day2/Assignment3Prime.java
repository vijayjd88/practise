package day2;

public class Assignment3Prime {
    public static void main(String[] args) {
        int odd = 3;
        boolean flag = false;
        System.out.println("Enter the number : ");
        int n = Read.sc.nextInt();
        if (n == 2) {
            System.out.println("Number is prime");
        } else if (n % 2 == 0) {
            System.out.println("Number is not prime");
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {

                if (n % i == 0) {
                    flag = true;
                    // System.out.println("Number is not prime");
                    break;
                }
            }
            if (flag) {
                System.out.println("Number is not prime");
            } else {
                System.out.println("Number is prime");
            }
                // System.out.println("Number is prime");
            }
        }
    }

