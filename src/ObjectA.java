public class ObjectA {

    int id;
    String name;
    String value;

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public ObjectA(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}
