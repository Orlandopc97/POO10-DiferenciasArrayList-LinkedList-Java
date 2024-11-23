import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//FIRST IN FIRST OUT
public class Main {
    public static void main(String[] args) {


        //Guardar distintos objetos de tipo persona en el ArrayList
        //Arreglo (lista) de objetos
        //Solo cambia el nombre al crearlo
        //Se importa sola la libreria que contiene la clase LinkedList
        List<Persona> listaArray = new ArrayList<Persona>();
        //Agregar Personas (elementos) al final de la lista
        listaArray.add(new Persona(1, "Dulce", 26));
        listaArray.add(new Persona(2, "Monse", 30));
        listaArray.add(new Persona(3, "Gustavo", 55));
        listaArray.add(new Persona(4, "Rocio", 53));
        listaArray.add(new Persona(5, "Mariano", 78));

        //Se puede agregar un elemento al inicio de la lista
        //En la posicion 0 del indice se agregara este elemento (objeto) Persona
        listaArray.add(0,new Persona(6, "Javier",50));


        System.out.println("-------------");

        //Guardar distintos objetos de tipo persona en el ArrayList
        //Arreglo (lista) de objetos
                                  //Solo cambia el nombre al crearlo
                                    //Se importa sola la libreria que contiene la clase LinkedList
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        //Agregar Personas (elementos) al final de la lista
        listaLinked.add(new Persona(1, "Jesu", 26));
        listaLinked.add(new Persona(2, "orlando", 30));
        listaLinked.add(new Persona(3, "Jose", 55));
        listaLinked.add(new Persona(4, "Maria", 53));
        listaLinked.add(new Persona(5, "Luis", 78));
        //Se puede agregar un elemento al inicio de la lista
                    //En la posicion 0 del indice se agregara este elemento (objeto) Persona
        //Por defecto lo agrega al inicio
        listaLinked.add(0,new Persona(6, "Javier",50));

        //Remove en ArrayList
            //Se hace por medjio de la posicion en el indice del array
        listaArray.remove(1);


        //Remove en LinkedList
        String nombreBorrar = "Maria";
        //Recorrer por foreach (foreach = por cada (uno))
             //Recorrer Persona por cada persona (variable) creada dentro de la lista
        for (Persona persona: listaLinked){
            if (persona.getNombre().equals("Maria")) {
                listaLinked.remove(persona);
                System.out.println("Este es el nombre de la persona que se borro: " + persona.getNombre());
                //break; //cortar el bucle de recorrer
            }
        }
        //Reacomoda los elementos, ya que se elimino un registro
        System.out.println(listaLinked.get(4).getNombre());

        //
        System.out.println("-----LUEGO DE ELIMINAR ");
        //Recorrido por foreach
        System.out.println("ARRAYLIST");
        for (Persona personaArray: listaArray){
            System.out.println("Prueba: " + personaArray.getNombre());
        }
        System.out.println("LINKEDLIST");
        for (Persona personaLinked: listaLinked){
            System.out.println("prueba: " + personaLinked.getNombre());
        }

        System.out.println("QUE TAMAÑO TIENEN LAS LISTAS ");
        System.out.println("Arraylist: " + listaArray.size());
        System.out.println("Linkedlist: " + listaLinked.size());

        //Obtener el primer objeto
        System.out.println("-----PRIMER Y ULTIMO OBJETO-------");
        //System.out.println("Primer objeto de linkedlist: " + listaLinked.stream().findFirst().get().getNombre());
        //System.out.println("hi : " + ((LinkedList<Persona>) listaLinked).getLast().toString());
        System.out.println("Primero: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo: " + listaLinked.getLast().toString());

        //El metodo clear para borrar completamente la lista
        System.out.println("------Borrar lista--------");
        listaArray.clear();
        listaLinked.clear();

        //Comprobar si la lista esta vacia
        System.out.println("Arraylista: " + listaArray.isEmpty());
        System.out.println("Linkedlist: " + listaLinked.isEmpty());



/*
        LinkedList<Persona> lista = new LinkedList<Persona>();
        lista.add(new Persona(1, "Jesu", 26));
        lista.add(new Persona(2, "orlando", 30));
        lista.add(new Persona(3, "Jose", 55));
        lista.add(new Persona(4, "Maria", 53));
        lista.add(new Persona(5, "Luis", 78));
*/




    }
}

/*
COLECCIONES:

        -Son estructuras similares a los arreglos pero su principal característica es que son dinámicos,
         su tamaño y cantidad de elementos puede variar en el tiempo.
        -En java, se emplean mediante la INTERFAZ "Collections", que permite implementar una serie de métodos comunes
         como son: AÑADIR, ELIMINAR, OBTENER EL TAMAÑO DE LA COLECCIÓN, etc.
        -Tienen el tamaño que se quiera y la capacidad de manera dinamica ajustandose a lo que se requiera.

        Tipos principales de Collections:
            -LIST           De los mas utilizados
            -SET
            -QUEUE
            -MAP            De los mas utilizados


        *ARRAYLIST:
            -Las lista son un conjunto de elementos relacionados entre si que tienen un determinado orden.
            -Su tamaño es dinámico (puede cambiar en el tiempo).

            *CARACTERISTICAS:

                >Es un tipo de CLASE ESPECIAL que se representa como una matriz dinámica qu e permite almacenar elementos.
                >Hereda de la clase AbstractList, la cual implementa la Interfaz List.
                >Permite colecciones o elementos duplicados.
                >El orden de los registros es el orden que fueron insertados.
                >Permite acceso aleatorio (tiene índice)
                >Manipulacion lenta (se necesita recorrer todo el arraylist para hacer un cambio).
                >Solo se pueden agregar (inserción) elementos a la lista

            -En java existen diferentes tipos de listas:
                +ArrayList  (FIFO)
                +LinkedList (FIFO)
                +Stack      (LIFO)

            Tipo de orden que pueden tener las listas:
                -FIFO: First in First Out (El primero en entrar es el primero en salir)
                -LIFO: Last in First Out (El ultimo que entro va a ser el primero en salir)


        *LINKEDLIST: (Lista Enlazada)

            -Tipo de CLASE ESPECIAL
            -Representan a una LISTA DOBLEMEMTE ENLAZADA (forma de recorrerlo de ida y vuelta, ambas direcciones)
            -Permite duplicados
            -Mantiene el orden de inserción
            -Manipulación más rápida
            -Puede ser usada/tratada no solo como lista, sino también como PILA, o como COLA
            -Permite hacer INSERCIONES o ELIMINACIONES al principio o al final de la colección
             (por eso es que puede ser tratado como una pila o cola), ejemplo agregar al inicio con el INDICE[0]
                >Podemos agregar registros al principio y al final

                [0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]


        *Diferencias entre ARRAYLIIST y LINKEDLIST:


        Linked List:

       null <---[0]    [1]<---[2]<---[3]
                [0]--->[1]--->[2]--->[3]--->null
                head                tail



        Array = vector

        [0]--->[1]--->[2]--->[3]--->[4]

        Los arraylist si tienen una posicion como los vectores, solo se agregan al final
        En cambio las linkedlist no ya que se puede agregar otro elemento en cualquier lugar

        Para borrar un elemento en el arraylist se debe indicar la posicion [2] mediante el metodo remove,
        luego reacomoda los demas valores para ocupar esa posicion vacia.
        En cambio en la linkedlist se elimina el elemento y se reacomodan los punteros que señalan los elementos


        LAS PILAS (STACKS)
        -Representan a las pilas en la vida real (pila de objetos)
        -Las pilas cumplen con el modelo LIFO (El ultimo en entrar sera el primero en salir)
        -Las pilas tienen sus propios metodos diferentes a arraylist y linkedist








 */