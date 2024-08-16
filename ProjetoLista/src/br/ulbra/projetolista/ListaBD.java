
package br.ulbra.projetolista;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaBD {
    public ArrayList lista;
    
    public ListaBD(){
        lista = new ArrayList();
    }
    
    public void salvar(String elemento){
        if (elemento.equals("") || elemento.equals(null)){
            JOptionPane.showMessageDialog(null, " coloca algo Jegue");
        }else{
            lista.add(elemento);
            JOptionPane.showMessageDialog(null, elemento + ", Salvo com sucesso");
        }
        
    }
    public String listar(){
        String elementos = "Lista de Perfumes\n";
        if(lista.isEmpty()){
            return "Coloca algo ai o Jegue.";
        } else {
            for (int i =0; i < lista.size(); i++){
            
                elementos +=(i+1)+" - " +lista.get(i) + "\n";
        }
       
        
        return elementos;
    }
}
    public void alterar(int i, String novoElemento){
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        }else if(i >=lista.size() || i<0){
        JOptionPane.showMessageDialog(null, "Perfume não existe!");
        }else{
            lista.set(i, novoElemento);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        }
    }
    public void excluir(int i){
    if(lista.isEmpty()){
        JOptionPane.showConfirmDialog(null, "Lista vazia");
    }else if(i>=lista.size() || i <0){
        JOptionPane.showConfirmDialog(null, "Perfume não existe");
    }else{
        lista.remove(i);
            JOptionPane.showConfirmDialog(null, "excluido com sucesso");
    }
    }
}
