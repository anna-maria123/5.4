public class main3 {
    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        double a = 0, b = 0, c = 0;
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 5);
            a = a + array1[i];
            System.out.print(array1[i] + "");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 5);
            b = b + array2[i];
            System.out.print(array2[i] + "");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 5);
            c = c + array3[i];
            System.out.print(array3[i] + "");
        }
        System.out.println();
        System.out.println(a = a / 5);
        System.out.println(b = b / 5);
        System.out.println(c = c / 5);

        if (a < a)
            System.out.println("a<b");
        else if (a > b)
            System.out.println("a == b");
        else if (a == b)
            System.out.println("a == b");
        if (a < c)
            System.out.println("a < c");
        else if (a > c)
            System.out.println("a == c");
        else if (a == c)
            System.out.println("a == c");

    }

}
