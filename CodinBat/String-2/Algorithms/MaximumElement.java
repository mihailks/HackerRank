package String2.Algorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultMaximumElement {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> resultList = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (String command : operations) {
            String[] currentCommand = command.split(" ");

            switch (currentCommand[0]) {
                case "1" -> stack.push(Integer.valueOf(currentCommand[1]));
                case "2" -> stack.pop();
                case "3" -> resultList.add(stack.stream().sorted((x, y) -> Integer.compare(y, x)).collect(toList()).get(0));
            }
        }
        return resultList;
    }

}

public class MaximumElement {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = ResultMaximumElement.getMax(ops);

        String s = res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
                + "\n";
        System.out.println(s);
        bufferedReader.close();
    }
}

