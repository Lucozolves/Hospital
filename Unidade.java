package projeto.hospital;

class Unidade{

  String Unidade1;
  String Unidade2;
  String Unidade3;
  
  Unidade(){
    System.out.println("Unidades Disponíveis:");
    this.Unidade1 = "Av. Generalíssimo Deodoro, 848 - Umarizal, Belém - PA, 66055-240";
   this.Unidade2 = "R. Arsenal, 150 - Cidade Velha, Belém - PA, 66023-110";
   this.Unidade3 = "R. Cônego Jerônimo Pimentel, SN - 220 - Umarizal, Belém - PA, 66050-450";
  }

  public String getUnidade1() {
   return Unidade1;
  }

  public String getUnidade2() {
   return Unidade2;
  }

  public String getUnidade3() {
   return Unidade3;
  }
}
