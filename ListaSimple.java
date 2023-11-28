
public class ListaSimple{
    Node top;

    //Métodos para los casos de inserción de nodos
    public boolean insertaPrimerNodo(String dato){
        if (top == null) { //La lista no está vacía
            top = new Node();
            top.name = dato;
            top.next = null;

            return true;
        }
        else {
            return false;
        }
    }

    public void insertaAntesPrimerNodo(String nombre){
        Node temp; 
        temp = new Node ();
        temp.name = nombre;
        temp.next = this.top;
        this.top = temp;
        temp = null;
    }

    public void insertaAlFinal(String nombre){
        Node temp = new Node ();
        temp.name = nombre;
        temp.next = null;
        //Node temp2;
        Node temp2 = this.top;

        while (temp2.next != null)
            temp2 = temp2.next;

        temp2.next = temp;
        temp = null;
        temp2 = null;
    }

    public boolean insertaEntreNodos(String nombre, String buscado){
        Node temp = new Node();
        temp.name = nombre;
        Node temp2 = this.top;

        //boolean NodoNoEncontrado = true;

        while ( (temp2 != null) 
                && temp2.name.equals(buscado) == false ) {    
                 temp2 = temp2.next;
        }

        if (temp2 != null){  //Nodo buscado se encontró
            temp.next = temp2.next;
            temp2.next = temp;
            temp = null;
            temp2 = null;
            return true;
        }
        else return false;
    } 

    public void imprimir(){
        for (Node temp = this.top; temp != null; temp = temp.next){
            System.out.print("[ " + temp.name + " ] -> ");
        }

        System.out.print("[X]\n"); 
    }

    public String toString(){
        String cadAux = "";
        for (Node temp = this.top; temp != null; temp = temp.next){
            cadAux += "[ " + temp.name + " ] -> ";
        }

        cadAux += "[X]\n"; 

        return cadAux;
    }

    //Métodos de borrado
    public void borrarPrimerNodo(){
        this.top = this.top.next;
    }

    //Borrar cualquier nodo que no sea el primero
    public boolean borrarCualquierNodo(String buscado){
        Node temp = this.top;

        while ( (temp != null) 
                && temp.name.equals(buscado) == false ) {    
                 temp = temp.next;
        }

        if (temp != null){  //Nodo buscado se encontró
            temp.next = temp.next.next;
            temp = null;
            
            return true;
        }
        else return false;
    }
    
    //Busca un nodo por el valor de su campo clave y devolver una referencia.
    public Node BuscarNodo(String buscado)
    {
        Node temp1 = top;
        
        while (temp1 != null && !temp1.equals(buscado))
        {    
                 temp1 = temp1.next;
        }
        
        // Verifica si se encontró el nodo o si temp1 es null
        if (temp1 != null) {
            return temp1;
        } else {
            // En este punto, el nodo no se encontró
            return null;
        }
    }

    //Buscar un nodo por su campo clave e insertar un nuevo nodo después de él.
    public void AgregarNodoBuscado(String buscado, String nuevo)
    {
        Node temp2 = top;
        Node ValorBuscado = BuscarNodo(buscado);
        
        if (temp2 == ValorBuscado){
            Node temp = new Node();
            temp.name = nuevo;
            temp.next = ValorBuscado.next;
            ValorBuscado.next = temp;
            }
    }
    
    //Intercambiar un nodo por otro buscado.
    public void IntercambiarNodo(String buscado, String nuevo)
    {
        Node valorEncontrado = BuscarNodo(buscado);

        if (valorEncontrado != null)
        {
             Node temp2 = top;

            while (temp2 != null && !temp2.name.equalsIgnoreCase(buscado))
            {
                temp2 = temp2.next;
            }

            temp2.name = nuevo;
            temp2 = null;
        }
    }
 }
