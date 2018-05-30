import java.util.*;

class Task5 {

    public static void main(String[] args) {
        task5();
    }

    static void task5(){

        List<String> defKeys = new ArrayList<>();
        List<String> dbKeys = new ArrayList<>();
        List<String> resA = new ArrayList<>();
        defKeys.add("1");
        defKeys.add("2");
        defKeys.add("3");
        defKeys.add("4");
        defKeys.add("5");
        dbKeys.add("1");
        dbKeys.add("2");
        dbKeys.add("3");
        dbKeys.add("4");
        dbKeys.add("6");

        for(int i = 0; i < dbKeys.size(); i++) {
            if (!defKeys.contains(dbKeys.get(i))) {
                resA.clear();
                resA.add(dbKeys.get(i));
                System.out.println("Лишние ключи в бд: " + resA);
            }
        }

        for(int i = 0; i < defKeys.size(); i++) {
            if (!dbKeys.contains(defKeys.get(i))) {
                resA.clear();
                resA.add(defKeys.get(i));
                System.out.println("Ключи, которых нет в бд: " + resA);
            }
        }
    }
}
