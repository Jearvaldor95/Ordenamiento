public class Main {
    public static void main(String []args){
        int []arreglo = {3,5,8,6,1,4,2,34,90,67,87};
        Burbuja b = new Burbuja();
        b.OrdenBurbuja(arreglo);
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
    
}
