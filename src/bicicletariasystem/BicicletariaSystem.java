
package bicicletariasystem;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class BicicletariaSystem {
    
    
    public static void main(String[] args) {
        Produto pd01 = new Produto(); 
     int opc;
        do { 
            System.out.println("**********************************************\n" +
            "             MENU PRINCIPAL\n" +
            "\n"+
            "    1 – Criar Objeto\n" +
            "    2 – Criar Objeto Inserindo Dados Pelo Construtor\n" +
            "    3 – Inserir/Alterar Dados Do Objeto\n" +
            "    4 - Mostrar Produto\n"+        
            "    5 – Desconto no Preço\n" + 
            "    0 – Sair Do Sistema\n");
            
            System.out.print("Escolha a Opção Desejada: ");                    
            
            Scanner entrada = new Scanner(System.in);
            opc =  entrada.nextInt();  
            
            ClassValida.ValidaOpcMenu(opc);
            
                switch(opc) {
                case 1:
                    {  //Criar Objeto  usando SET                     
                                          
                    System.out.println("\nObjeto Crido com sucesso!!!");
                    
                        pd01.setIdProd();
                        pd01.setMarcaProd("Trek");
                        pd01.setModeloProd("Stark 2018");
                        pd01.setDataEntrada();
                        pd01.setTipoProd("BICICLETA");
                        pd01.setDescriProd("alumínio - freio a disco - câmbio shimano - 24 marchas COR PRETA");
                        pd01.setEstado(true);
                        pd01.setValorProd(1500);  
                        
                        pd01.mostrarProduto();
                        
                    } 
                  break;
                case 2:
                    { //Criar Objeto Inserindo Dados Pelo Construtor
                        int idProd;
                        String marcaProd = "Monark";
                        String modeloProd ="Aro 26";
                        String dataEntrada ;
                        String tipoProd = "Bicicleta";
                        String descriProd = "Freio Varão Barra Circular Vermelho";
                        boolean estado = true;
                        double valorProd = 584.90; 
                        
                         pd01 = new Produto(marcaProd, modeloProd, tipoProd, descriProd, estado, valorProd);  
                        
                        System.out.println("\n Objeto Criado  Inserindo Dados Pelo Construtor.");
                        pd01.mostrarProduto();
                    }                  
                  break;
                case 3:
                      { 
                        int idProd;
                        String marcaProd, modeloProd, dataEntrada, tipoProd, descriProd;
                        String estado;
                        double valorProd;
                        
                                        
                        pd01 = new Produto(); 
                        System.out.println("Cadastrando nova bicicleta ou peça:");
                        
                        System.out.print("\nQual Produto deseja cadastrar? \n    B - para BICICLETA ou P - para PEÇA \n ");
                        pd01.setTipoProd(entrada.next());
                        
                        System.out.print(" - "+pd01.getTipoProd());
                        
                        System.out.print("\nMarca: ");
                        pd01.setMarcaProd(entrada.next());
                        
                        System.out.println("\n Modelo: ");
                        pd01.setModeloProd(entrada.next());
                        
                        System.out.println("\n Descrição: ");
                        pd01.setDescriProd(entrada.next());
                        
                        System.out.println("\nNova ou Usada? (N - U)");
                         estado = entrada.next();                    
                         
                          if(estado.equals("N") || estado.equals("n")){
                            pd01.setEstado(true);
                        }else{
                            pd01.setEstado(false);
                        }
                        
                        System.out.println("\nPreço: ");
                        pd01.setValorProd(entrada.nextDouble());
                        
                        pd01.setDataEntrada();
                        pd01.mostrarProduto();
                    }                 
                    break;
                case 4:
                   {                      
                      pd01.mostrarProduto();
                      
                   }
                   //
                    break;
                case 5:
                    {   
                        String tipoDesc;
                        System.out.println("A - Desconto de 10% B - Desconto de 20%, C - Digitar o desconto");
                        tipoDesc = entrada.next();                        
                        
                        if(ClassValida.ValidaDescontoOpc(tipoDesc)){
                           
                            switch(tipoDesc) {
                                        case "a":
                                        {
                                            pd01.desconto(10);
                                        }
                                         break;
                                        case "b":
                                        {
                                            pd01.desconto(10,10);
                                        }
                                         break;
                                        case "c":
                                        {
                                            System.out.println("Digite o desconto:");
                                            pd01.desconto(entrada.nextDouble()); }
                                         break;                                      
                            }
                        }else{ 
                            System.out.println("\n---Voce digitou algo errado, não foi possivel aplicar o desconto---\n");
                        }
                    }                 
                    break;    
                case 0:
                   {System.out.println("x sair ");}
                   
                    break;
                default:
                  {System.out.println("Eroo você digitou algo errado");}
                    }
            } while ( opc != 0 );
            }   
    }
    

