/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produtos;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author caroline.mendonca
 */
public class Produtos {

    static void cadastrarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the descricaoProd
     */
    public String getDescricaoProd() {
        return descricaoProd;
    }

    /**
     * @param descricaoProd the descricaoProd to set
     */
    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }

    /**
     * @return the valorUni
     */
    public String getValorUni() {
        return valorUni;
    }

    /**
     * @param valorUni the valorUni to set
     */
    public void setValorUni(String valorUni) {
        this.valorUni = valorUni;
    }

    /**
     * @return the valorTotal
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    private String descricaoProd;
    private String dataInicio;
    private int quant;
    private String valorUni;
    private String valorTotal;
    
    public Produtos(){
        
    }
    
     public Produtos(String descricaoProd, String dataInicio, int quant, String valorUni,String valorTotal){
          this.descricaoProd = descricaoProd;
          this.dataInicio = dataInicio;
          this.quant = quant;
          this.valorUni = valorUni;
          this.valorTotal = valorTotal;
          
    }
     
   
     
     
     
    
    
}
