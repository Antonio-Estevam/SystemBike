
package bicicletariasystem;
public class ClassValida {
   
        //Valida opção do menu
    public static void ValidaOpcMenu(int param){
        
        if (param == 1 || param == 2 || param == 3 || param == 4 || param == 5 || param == 0){
            
        }else{
            System.out.println("Opção não estar disponivel! ");
        }
      }
       
        //valida a opçao de desconto 
    public static boolean ValidaDescontoOpc(String atributo){       
        boolean rsu;
        
        if (atributo.length() > 1){
           
            rsu = false;
            
        }else{
            if("a".equals(atributo) || "b".equals(atributo) || "c".equals(atributo)){
            System.out.println("\n");
             rsu = true;
             
            }else{
            rsu = false;
            }
        }   
        
            
     return rsu;
    }   
    
}