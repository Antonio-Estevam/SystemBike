
package bicicletariasystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Produto {
    private int idProd;
    private String marcaProd;
    private String modeloProd;
    private String dataEntrada;
    private String tipoProd;
    private String descriProd;
    private boolean estado;
    private double valorProd; 
    
    //Construtor Padrão
    public Produto(){}
    
    //Construtor personalizado 
    public Produto(String marcaProd, String modeloProd, String tipoProd, String descriProd, boolean estado, double valorProd) {
        Random numAle = new Random();
        
        this.idProd = numAle.nextInt(199);
        this.marcaProd = marcaProd;
        this.modeloProd = modeloProd;
        this.dataEntrada = "";
        this.tipoProd = tipoProd;
        this.descriProd = descriProd;
        this.estado = estado;
        this.valorProd = valorProd;
    }
    
    public void cadastrarProduto(String marcaProd, String modeloProd, String tipoProd, String descriProd, boolean estado, double valorProd){
        Random numAle = new Random();
        
        this.idProd = numAle.nextInt(199);
        this.marcaProd = marcaProd;
        this.modeloProd = modeloProd;
        this.dataEntrada = this.getDate();
        this.tipoProd = tipoProd;
        this.descriProd = descriProd;
        this.estado = estado;
        this.valorProd = valorProd;
        
        this.mostrarProduto();
    } 
    
    //Método mostrar produto
    public void  mostrarProduto(){
        String tpShow;
        
        if(getEstado()){
            tpShow = "Nova ";
        }else{
            tpShow = "Usada ";
        }
        
        String show = "ID: 8486"+getIdProd()+" Tipo: "
                + ""+getTipoProd()+" Marca: "+getMarcaProd()+" Modelo: "
                + ""+getModeloProd()+" Data de entrada: "+getDataEntrada()+""
                + " Descrição: "+getDescriProd()+" Estado: "
                + ""+tpShow+" Preço: "+getValorProd()+"";
        System.out.println(show);       
    } 
    
      //Método desconto
    public void  desconto(double desconto){
        this.valorProd =  this.valorProd - ( this.valorProd *(desconto/100)); 
        
        System.out.println("Desconto de "+desconto+"% aplicado sobre o valor do produto. Novo Preço = "+this.valorProd);
    }
    
       //Sobrecarga no método desconto
     public void  desconto(double desconto,double desconto2){
        desconto = desconto + desconto2; 
        this.valorProd =  this.valorProd - ( this.valorProd *(desconto/100)); 
        
        System.out.println("Desconto de "+desconto+"% aplicado sobre o valor do produto. Novo Preço = "+this.valorProd);
    }
     
        //Método para pegar a data do cadastramento
    public  String getDate() { 
	DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
}
    
    
    
    
    

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd() {
        Random numAle = new Random();
        this.idProd = numAle.nextInt(199);
        
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public String getModeloProd() {
        return modeloProd;
    }

    public void setModeloProd(String modeloProd) {
        this.modeloProd = modeloProd;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada() {
        this.dataEntrada = this.getDate();
        
        
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
       if ("B".equals(tipoProd) || "b".equals(tipoProd)){
           this.tipoProd = "Bicicleta";
       }else if ("P".equals(tipoProd) || "p".equals(tipoProd) ){
           this.tipoProd = "Peça";
       }else{ this.tipoProd = "Bicicleta";}

// this.tipoProd = tipoProd;
    }

    public String getDescriProd() {
        return descriProd;
    }

    public void setDescriProd(String descriProd) {
        this.descriProd = descriProd;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }
    
    
}
