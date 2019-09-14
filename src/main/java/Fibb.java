public class Fibb {



    static int givenNumber(int n){
        int a = 1;
        int b = 1;
        int c = 1;

        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    static int givNum(int n) {
        if(n < 3) return 1;

        return givNum(n - 2) + givNum(n - 1);
    }




}
