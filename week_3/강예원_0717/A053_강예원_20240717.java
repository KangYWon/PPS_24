package week_3.강예원_0717;
//정수를 저장하는 스택을 구현하고, 입력으로 주어지는 스택 관련 명령을 처리하는 문제

import java.io.*;
import java.util.*;

public class A053_강예원_20240717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.push(value);
            } else if (command.equals("pop")) {
                bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
            } else if (command.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write((stack.isEmpty() ? 1 : 0) + "\n");
            } else if (command.equals("top")) {
                bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}