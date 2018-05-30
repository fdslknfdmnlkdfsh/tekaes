import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Task4 {

    public static void main(String[] args) {
        task4();
    }

    static void task4(){

        List<ObjectA> defData = new ArrayList<>();
        List<ObjectA> testData = new ArrayList<>();
        List<ObjectA> resData = new ArrayList<>();
        defData.add(new ObjectA(0, "Name1", "Value1"));
        defData.add(new ObjectA(1, "Name2", "Value2"));
        defData.add(new ObjectA(2, "Name3", "Value3"));
        testData.add(new ObjectA(0, "Name1", "Value1"));
        testData.add(new ObjectA(1, "Name2", "Value2"));
        testData.add(new ObjectA(2, "Name3", "Value6"));

        defData.sort(Comparator.comparing(ObjectA::getId));
        testData.sort(Comparator.comparing(ObjectA::getId));


        for(int i = 0; i < defData.size(); i++) {
            ObjectA obj1 = defData.get(i);
            ObjectA obj2 = testData.get(i);
            if ((!obj1.getName().equals(obj2.getName())) || (!obj1.getValue().equals(obj2.getValue()))) {
                resData.clear();
                resData.add(obj2);
                System.out.println("Неэквивалетные данные: " + obj2.getName() + " => " + obj2.getValue());
            }
        }
            if(!resData.isEmpty()) throw new Error("Ошибка проверки");
    }
}
