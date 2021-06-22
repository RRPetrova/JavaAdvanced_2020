package ex_09_InfixToPostfix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        ArrayDeque<String> stackOperators = new ArrayDeque<>();  //lifo
        ArrayDeque<String> numbersQueue = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String symbol = input[i];

            if (Character.isLetterOrDigit(symbol.charAt(0))) {
                numbersQueue.offer(symbol);
            } else {
                if (stackOperators.isEmpty()) {
                    stackOperators.push(symbol);
                } else {
                    //7 + 13 / ( 12 - 4 )
                    // 7 13 12 -4
                    // + / ( - )
                    String lastOperator = stackOperators.peek();
                    switch (symbol) {
                        case "+":
                        case "-":
                            if (lastOperator.equals("(")) {
                                stackOperators.push(symbol);
                            } else {
                                numbersQueue.offer(stackOperators.pop());
                                stackOperators.push(symbol);
                            }
                            break;
                        case "*":
                        case "/":
                            if (lastOperator.equals("*") || lastOperator.equals("/")) {
                                numbersQueue.offer(stackOperators.pop());
                                stackOperators.push(symbol);
                            } else {
                                stackOperators.push(symbol);
                                //operator lifo   nums fifo
                            }
                            break;
                        case "(":
                            stackOperators.push(symbol);
                            break;
                        case ")":
                            while (!stackOperators.peek().equals("(")) {
                                numbersQueue.offer(stackOperators.pop());
                            }
                            stackOperators.pop();
                            break;
                    }
                }
            }
        }
        while (!numbersQueue.isEmpty()) {
            System.out.print(numbersQueue.poll() + " ");
        }
        while (!stackOperators.isEmpty()) {
            System.out.print(stackOperators.pop() + " ");
        }
        System.out.println();
    }
}
