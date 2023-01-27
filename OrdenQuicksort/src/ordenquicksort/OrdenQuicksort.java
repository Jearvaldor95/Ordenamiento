package ordenquicksort;

/**
 *
 * @author USUARIO
 */
public class OrdenQuicksort {

    public static void main(String[] args) {
        int[] arreglo = {100,5, 11, 7, 4, 12, 4, 75, 1, 3, 23, 4, 45};
        QuickSort o = new QuickSort();
        o.OrdenarQuickSort(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
