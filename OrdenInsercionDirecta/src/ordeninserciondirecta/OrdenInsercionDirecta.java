package ordeninserciondirecta;

/**
 *
 * @author USUARIO
 */
public class OrdenInsercionDirecta {

    public static void main(String[] args) {
        int[] arreglo = {5, 11, 7, 15, 4, 12, 23, 4, 2, 1, 45};
        InsercionDirecta o = new InsercionDirecta();
        o.InserccionDirecta(arreglo);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
