
public class UsaLista{

    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();

        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("O");
        lista.insertaAlFinal("Y");
        lista.insertaEntreNodos("R", "A");
        lista.imprimir();
        lista.BuscarNodo("H");
        lista.AgregarNodoBuscado("M","H");
        lista.IntercambiarNodo("J","H");
        System.out.print(lista);
    }

}
