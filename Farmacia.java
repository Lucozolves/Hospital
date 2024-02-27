package projeto.hospital;

import java.util.Scanner;
import java.util.ArrayList;

class Farmacia {
  ArrayList<String> carrinho = new ArrayList<String>();
  ArrayList<String> remedios = new ArrayList<String>();
  
  Farmacia(){
     this.remedios.add("Paracetamol");
     this.remedios.add("Dipirona");
     this.remedios.add("Buscopan");
     this.remedios.add("Rivotril");
  }

  public void GetCarrinho(){
     for(int i = 0; i < carrinho.size(); i++){
        System.out.println(carrinho.get(i));
    }
  }
  
  public void GetRemedios(){
   for(int i = 0; i < remedios.size(); i++){
       System.out.println(remedios.get(i));
   }
  }

  public void ComprarRemedio(){
     System.out.println("Digite o nome do remédio que deseja comprar: ");
     Scanner escolha = new Scanner(System.in);
     String decidir = escolha.nextLine();
     for (int i = 0; i < remedios.size(); i++){
        if(decidir.equals(remedios.get(i))){
           carrinho.add(decidir);
           System.out.println("Item comprado!");
        }
     }
  }
}