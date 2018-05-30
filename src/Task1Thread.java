public class Task1Thread extends Thread {

    public Task1Thread(String nameThread) {
        super(nameThread);
    }


    public void run() {
        System.out.println("Поток с цифрой " + getName());
        try {
            sleep((int)(Math.random() * 10000));
        } catch (InterruptedException e) {
           // e.printStackTrace();
        }
        Task1.numbers.add(Integer.parseInt(getName()));
        System.out.println("Текущее состояние массива: " + Task1.numbers);
    }
}
