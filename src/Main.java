import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(null);
        liste.add(4);
        liste.add(5);
        liste.add(1);

        System.out.println(liste.indexOf(null));
        liste.add(2,15);//ekleyince önündeki elemanları öteliyor
        System.out.println(liste.contains(10));//içerip içermediğini kontrol ediyor
        /*
        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        */
        //iki liste olusturup add ve addall metodu ile listeler birlestirilebilir
        //ya da sublist ile alt liste oluşturulabilir

        List<Integer> liste2 = liste.subList(2,5);
        System.out.println(liste2);

        /*
        Integer[] asd = liste.toArray(new Integer[0]);
        System.out.println(asd[0]);
        */
        for (Integer element : liste){
            System.out.println(element);
        }
    }
}