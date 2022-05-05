import java.util.*;

interface AnonClass{
    public void anonMethod();
};

public class Actividad13 {

    public static void main(String args[]) {
        List<String> lista = new ArrayList<String>();
        lista.add("palabra");
        lista.add("prueba");
        lista.add("ahora");
        lista.add("binocular");
        lista.add("sol");
        lista.add("programacion");
        lista.add("string");
        lista.add("lista");
        lista.add("hola");
        lista.add("word");

        //utilizando clases anonimas
        AnonClass anon1 = new AnonClass() {
            public void anonMethod() {
                System.out.println("Orden alfabetico con clase anonima:");
                lista.sort(Comparator.naturalOrder());
                System.out.println(lista);
            }
        };
        anon1.anonMethod();

        AnonClass anon2 = new AnonClass() {
            public void anonMethod() {
                System.out.println("Por longitud con clase anonima:");
                lista.sort(Comparator.comparing(String::length));
                System.out.println(lista);
            }
        };
        anon2.anonMethod();

        System.out.println();
        //expresion lambda
        System.out.println("Orden alfabetico con lambda:");
        lista.sort((x, y) -> x.compareTo(y));
        System.out.println(lista);

        //aqui se restan las longitudes, si el resultado es positivo x es mas largo que y, o si el resultado es negativo y es mas largo que x
        System.out.println("Por longitud con lambda:");
        lista.sort((x, y) -> x.length() - y.length());
        System.out.println(lista);

        System.out.println();
        //metodos de referencia
        System.out.println("Orden alfabetico con metodos de referencia:");
        lista.sort(String::compareTo);
        System.out.println(lista);

        System.out.println("Por longitud con metodos de referencia:");
        lista.sort(Comparator.comparing(String::length));
        System.out.println(lista);
    }
}