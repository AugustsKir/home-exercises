package io.codelex.arithmetic.practice;

public class Exercise6Coza {
    public static void main(String[] args) {
        int firstNum;
        int secondNum = 110;
        StringBuilder output = new StringBuilder();
        for (firstNum = 1; firstNum < secondNum; firstNum++) {
            if (firstNum % 3 == 0 && firstNum % 5 == 0 && firstNum % 7 == 0) {
                System.out.print(" CozaLozaWoza ");
            } else if (firstNum % 5 == 0 && firstNum % 7 == 0) {
                System.out.print(" LozaWoza ");
            } else if (firstNum % 3 == 0 && firstNum % 7 == 0) {
                System.out.print(" CozaWoza ");
            } else if (firstNum % 3 == 0 && firstNum % 5 == 0) {
                System.out.print(" CozaLoza ");
            } else if (firstNum % 3 == 0) {
                System.out.print(" Coza ");
            } else if (firstNum % 5 == 0) {
                System.out.print(" Loza ");
            } else if (firstNum % 7 == 0) {
                System.out.print(" Woza ");
            } else {
                System.out.print(" " + firstNum + " ");
            }
            if (firstNum % 11 == 0) {
                System.out.print("\n");
            }

            /*if (firstNum % 3 == 0) {
                output.append("Coza");
            }
            if (firstNum % 5 == 0) {
                output.append("Loza");
            }
            if (firstNum % 7 == 0) {
                output.append("Woza");
            }
            if (output.toString().equals(" ")) {
                output.append(firstNum);
            }
            if (firstNum % 11 == 0) {
                output.append("\n");
            }*/


        }
        System.out.println(output);

    }
}
