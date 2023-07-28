package EmulateQuestPackage;


public class EmulateQuestClass {
    public static void main(String[] args) {

        String a = "Казак";                                                         //TRUE
        String b = "А роза упала на лапу Азора";                                    //TRUE
        String c = "хехе_А роза упала на лапу Азора_хехе";                          //FALSE
        String d = "ехех???..?,?,?,--%45777А роза упала на лапу%%№. Азора_хехе";    //TRUE
        String e = "Do geese see God?";                                             //TRUE
        String f = "Madam, I'm Adam";                                               //TRUE
        String g = "нА доМе чемОдан ";                                              //TRUE
        String h = "нА доМе чемО0дан ";                                             //TRUE

        System.out.printf("%B\n", isPalindrome(a));
        System.out.printf("%B\n", isPalindrome(b));
        System.out.printf("%B\n", isPalindrome(c));
        System.out.printf("%B\n", isPalindrome(d));
        System.out.printf("%B\n", isPalindrome(e));
        System.out.printf("%B\n", isPalindrome(f));
        System.out.printf("%B\n", isPalindrome(g));
        System.out.printf("%B\n", isPalindrome(h));

    }

    static boolean isPalindrome(String string) {
        int first = 0;
        int last = string.length() - 1;

        while (first < last) {
            if (Character.toLowerCase(string.toCharArray()[first]) == Character.toUpperCase(string.toCharArray()[first])) {
                first++;
                continue;
            }
            if (Character.toLowerCase(string.toCharArray()[last]) == Character.toUpperCase(string.toCharArray()[last])) {
                last--;
                continue;
            }
            if (Character.toLowerCase(string.toCharArray()[first]) == Character.toLowerCase(string.toCharArray()[last])) {
                first++;
                last--;
            } else {
                return false;
            }
        }
        return true;
    }
}
