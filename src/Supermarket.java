import java.util.PriorityQueue;
import java.util.Queue;

public class Supermarket {
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

    private PriorityQueue<Cliente> clientQueue = new PriorityQueue<Cliente>();

    public void addClient(Cliente client){
        clientQueue.add(client);
    }
    public  void removeClient(Cliente client){
        clientQueue.remove(client);
    }
    public Cliente getNextClient(){
        return clientQueue.peek();
    }
    public int getNumberClients(){
        return clientQueue.size();
    }

}
