import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] productos = new String[7];

        int total = productos.length;


        productos[0] = "Kingston pendrive";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro ssd Samsung externo";
        productos[3] = "Asus NoteBook";
        productos[4] = "MacBook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        System.out.println("=== Usando for===");
        for (int i = 0; i < total; i++){
            System.out.println("para indice " +  i  + " : " + productos[i]);
        }

        System.out.println("=== Usando foreach===");

        for (String prod: productos){
            System.out.println("prod = " + prod);
        }


        System.out.println("=== Usando while===");
        int i = 0;
        while (i < total)
        {
            System.out.println("para indice " +  i  + " : " + productos[i]);
            i++;
        }

        System.out.println("=== Usando Do while===");
        int j = 0;

        do {
            System.out.println("para indice " +  j  + " : " + productos[j]);
            j++;
        }while (j < total);






        int [] numeros = new int[4];


    }
}
