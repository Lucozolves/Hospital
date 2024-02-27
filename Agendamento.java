package projeto.hospital;

class Agendamento{
  String nome;
  String dia;
  String mes;
  
  Agendamento(String nome, String mes, String dia){
  this.nome = nome;
  this.dia = dia;
  this.mes = mes;
  }
  
  public String getDia() {
    return dia;
  }

  public String getMes() {
    return mes;
  }

  public String getNome() {
    return nome;
  }

  public String toString(){
  return "Tipo de médico: " +getNome()+"\nMês e dia: "+getMes()+"\nDia da semana: "+getDia()+"\n";
  }
}