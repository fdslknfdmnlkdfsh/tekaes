import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Task1 {

    private static int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static List<Integer> numbers = Arrays.stream(x).boxed().collect(Collectors.toList());


    public static void main(String[] args) throws InterruptedException {
        task1(10);
    }


    static void task1(int countThreads) throws InterruptedException {

        for(int i = 0; i <countThreads; i++) {
            int number = (int) (Math.random() * numbers.size());
            while(numbers.isEmpty()) Thread.sleep(10);
            String nameThread = numbers.get(number).toString();
            numbers.remove(number);
            System.out.println(numbers);
            new Task1Thread(nameThread).start();
        }
    }
}
