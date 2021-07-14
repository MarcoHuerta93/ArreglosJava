import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston pendrive";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro ssd Samsung externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String pro1 = productos[0];
        String pro2 = productos[1];
        String pro3 = productos[2];
        String pro4 = productos[3];
        String pro5 = productos[4];
        String pro6 = productos[5];
        String pro7 = productos[6];





        System.out.println("productos[0] = " + pro1);
        System.out.println("productos[1] = " + pro2);
        System.out.println("productos[2] = " + pro3);
        System.out.println("productos[3] = " + pro4);
        System.out.println("productos[4] = " + pro5);
        System.out.println("productos[5] = " + pro6);
        System.out.println("productos[6] = " + pro7);



        int [] numeros = new int[4];

        numeros [0] = 1;
        numeros [1] = Integer.valueOf("2");
        numeros [2] =  (int) 3L;
        numeros [3] = -4;


        int i = numeros [0];
        int j = numeros [1];
        int k = numeros [2];
        int l = numeros [numeros.length -1];// para obtener el último valor


        System.out.println("i" + i);
        System.out.println("j" + j);
        System.out.println("k" + k);
        System.out.println("l" + l);
    }
}
