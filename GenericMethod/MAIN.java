package GenericMethod;

import GENERICSKULLANIM.VERITABANI;

public class MAIN {
    public static void main(String[] args) {
        Integer[] intDizi={1,2,3,4,56,6,7};
        String[] stringDizi={"ali","veli","ahmet"};
        Double[] doubleDizi={1.2,3.4,5.6,7.8};

        System.out.println(" int dizi");
        System.out.println("-------------");
        yazdir(intDizi);

        System.out.println("string dizi");
        System.out.println("------------");
        yazdir(stringDizi);

        System.out.println("double dizi");
        System.out.println("-------------------");
        yazdir(doubleDizi);


    }
    public static <T> void yazdir(T[]dizi){
        for (T deger:dizi){
            System.out.println(deger);
        }

    }
}
