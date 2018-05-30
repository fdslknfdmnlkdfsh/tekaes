class Task7 {

    public static void main(String[] args) {
        task7();
    }

    static void task7(){

        for(int x = 1; x <= 100; x++) {
            if (x % 15 == 0) System.out.println("FizzBuzz");
            else if (x % 3 == 0) System.out.println("Fizz");
            else if (x % 5 == 0) System.out.println("Buzz");
            else System.out.println(x);
        }
    }
}
