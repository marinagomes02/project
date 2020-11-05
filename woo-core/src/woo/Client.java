package woo;

import java.util.ArrayList;

public class Client {

    private String clientId;
    private String clientName;
    private String clientAddress;
    private String clientLevel;
    private int clientPoints;
    private ArrayList<Transaction> clientTransac;
    
    public Client(String clientId, String clientName, String StringAddress) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientAddress =clientAddress;
    }
}