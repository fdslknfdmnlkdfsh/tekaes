import java.util.List;
import java.util.stream.Collectors;

class Task3 {

    public static void main(String[] args){
        task3("aaabccddd");
    }

    static void task3(String str) {
        List<Character> charAr = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        reviser(charAr);
        str = charAr.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println(str);
    }

    private static List<Character> reviser(List<Character> charAr) {
        for(int i = 0; i < charAr.size()-1; i++)
            if (charAr.get(i) == charAr.get(i + 1)) {
                charAr.remove(i);
                charAr.remove(i);
                reviser(charAr);
            }
            return charAr;
    }
}