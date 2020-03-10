import java.util.Arrays;


public class FelderUndMehr {
    public static void main(String[] args) {
        //schauen wir uns ein altbekanntes array an
        int []feld = new int[] {1, 2, 3};

        //es gibt eine Hilfsmethode die ein array ausgibt
        System.out.println(Arrays.toString(feld));
        System.out.println("---------");

        //2 dimensionales array - array in array
        int[][] feld2dim = new int[3][4];

        //einem Element etwas zuweisen
        feld2dim[1][2] = 42;
        System.out.println(Arrays.toString(feld2dim[0]));
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));
        System.out.println("---------------");

        //andere Initialisierung
        int[][] feld2dim2 = new int [][] {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(feld2dim2[0]));
        System.out.println(Arrays.toString(feld2dim2[1]));
        System.out.println("----------------");

        //Input string
        String str = "Hallo Zam";
        System.out.println(str.length());
        //Strings dürfen nicht mit = verglichen werden
        //aber equals kann verwendet werden
        System.out.println(str.equals("hallo"));
    }
}
