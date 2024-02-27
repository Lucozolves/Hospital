package projeto.hospital;

class Medico{
  String tipo1;
  String tipo2;
  String tipo3;
  String diaSemanaSelecionado;
  
  Medico(){
     this.tipo1 = "Oftamologista";
     this.tipo2 = "Ortopedista";
     this.tipo3 = "Oncologista";
  }
  
  public void GetMedicos(){
  
     System.out.println(tipo1);
     System.out.println(tipo2);
     System.out.println(tipo3);
  
  }

  public void Oftamologista(){
  String medicoNome = "Joaquim Farias";
  System.out.println(tipo1);
     System.out.println("Nome: " + medicoNome);
  }
  
  public void Ortopedista(){
     String medicoNome = "Amanda Freitas";
     System.out.println(tipo2);
     System.out.println("Nome: " + medicoNome);
     }
  
  public void Oncologista(){
     String medicoNome = "José Augusto";
     System.out.println(tipo3);
     System.out.println("Nome: " + medicoNome);
  }
  
  public void ValidaMedico(String nome){
     if(nome.equals(tipo1) == false && nome.equals(tipo2) == false && nome.equals(tipo3)==false) {
        System.out.println("Tipo de médico indisponível!");
        System.exit(0);
  
    }
  }
}