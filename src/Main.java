public class Main {
    /*
    Scrivere un programma Java che permetta di gestire la coda di un supermercato. In particolare, deve essere possibile eseguire le seguenti operazioni:

inserimento in coda di un cliente
rimozione dalla coda di un cliente
ottenere prossimo cliente da servire
ottenere il numero di clienti attualmente in coda
Ogni cliente ha nome, cognome, età e un id univoco. La coda, ovviamente, va gestita secondo la politica FIFO.

PLUS 🏍 : Modificare la coda per favorire le persone più anziane

Suggerimento: scegliete bene la struttura dati (una possibile soluzione potrebbe essere la PriorityQueue, che è un tipo di coda fornito da Java ad esempio...)
     */
    public static void main(String[] args) {
        Supermarket s = new Supermarket();
        Cliente c1 = new Cliente("Cliente1", "cogn1", 23);
        Cliente c2 = new Cliente("Cliente2", "cogn2", 50);
        Cliente c3 = new Cliente("Cliente3", "cogn3", 60);
        Cliente c4 = new Cliente("Cliente4", "cogn4", 10);

        s.addClient(c1);
        s.addClient(c2);
        s.addClient(c3);
        s.addClient(c4);
        System.out.println(s.getNumberClients());
        System.out.println(s.getNextClient());
        s.removeClient(s.getNextClient());
        System.out.println(s.getNextClient());
        s.removeClient(s.getNextClient());
        System.out.println(s.getNextClient());
    }
}

