/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;
import Produtos.Cliente;
import Produtos.NewJFrameInicioFunc;
import Produtos.NewJFrameLogin;
import javax.swing.JFrame;


/**
 *
 * @author caroline.mendonca
 * Trabalho Final - REC
 */


public class Clientes extends JFrame {

    public Clientes(int par, int par1) {
    }

    private Cliente cliente;          
    
    private int idCliente1;
    private int idCliente2;
    
    private ClientSideConnection clientSideConnection;

   
    
         
    public int validaCliente() {
        this.setTitle ("Cliente #"+idCliente1);
        if (idCliente1 == 1 || idCliente2 == 1 ) { // Gerente
           return 1;
        } else {
            return 2; // Funcionario
        }
     }
    
    public void connectToServer() {
        clientSideConnection = new ClientSideConnection();
    }
    // Client Connection Inner Class
    private class ClientSideConnection {
        private Socket socket;
        private DataInputStream dataInputStream;
        private DataOutputStream dataOutputStream;
        
        public ClientSideConnection() {
            System.out.println("Cliente conectando");
            try {
                socket = new Socket("localhost", 51734); // Inicia o pedido de conexão ao servidor
                dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream = new DataOutputStream(socket.getOutputStream());
                idCliente1 = dataInputStream.readInt();
                System.out.println("Connected as #"+ idCliente1);
           } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
 
     
    public static void main(String[] args) {
        Clientes cli = new Clientes (500, 100);
        cli.connectToServer();
        NewJFrameLogin login = new NewJFrameLogin();
        login.setVisible(true);
    
        
    }
}
