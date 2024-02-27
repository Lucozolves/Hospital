package projeto.hospital;

class AgendamentoValidar{
  boolean valor;
  public void ValidarDiaDaSemana(String semana){
     String[] diaSemana = {"segunda","terça","quarta","quinta","sexta","sábado","domingo"};
     for(int i = 0; i < diaSemana.length; i++){
        if(semana.equals(diaSemana[i])){
          this.valor = true;
        }}
     }
  
  public void ValidarDiaDoMes(String dia){
  
     if(dia.length() < 5 || dia.contains("/") == false){
     System.out.println("Dia do mês inválido!");
     System.exit(0);
     }
  
  }
}
