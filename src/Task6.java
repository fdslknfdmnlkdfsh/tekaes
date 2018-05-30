class Task6 {

    public static void main(String[] args) {
        task6("aaabbcccd");
    }

    static void task6(String str){


        char[] charAr = str.toCharArray();
        char[] alphabetAr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x','y', 'z' };
        for(int i = 0; i < alphabetAr.length; i++) {
            int index = 0;
            for(int j = 0; j < charAr.length; j++) {
                if(alphabetAr[i] == charAr[j]) index++;
            }
            if(index != 0) System.out.print(Integer.toString(index) + alphabetAr[i]);
        }


 //       List<Character> charMap = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
   //     CharBuffer.wrap(charAr).chars().collect();
//        List<Character> resMap = charMap.stream()
//                .filter
//                .collect(Collectors.toList());
//        resMap.forEach(System.out::println);
    }
}

