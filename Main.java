package projeto.hospital;
import java.util.Scanner;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.xml.validation.Validator;



public class Main{
   public static void main(String[] args) {
      Farmacia F1 = new Farmacia();
      Medico M1 = new Medico();  
      ArrayList<Agendamento> consultas = new ArrayList<Agendamento>();

      System.out.println("Você ainda não tem uma conta!");
      Scanner nomeInput = new Scanner(System.in);
      System.out.println("Digite seu nome: ");
      String nomeResultado = nomeInput.nextLine();
      System.out.println("Digite sua senha: ");
      Scanner senhaInput = new Scanner(System.in);
      String senhaResultado = senhaInput.nextLine();
      System.out.println("Digite sua idade: ");
      Scanner idadeInput = new Scanner(System.in);
      String idadeResultado = idadeInput.nextLine();
      Conta c1 = new Conta(nomeResultado, senhaResultado, idadeResultado);

      while(true){
         Scanner input = new Scanner(System.in);
         System.out.println("Bem vindo ao sistema do hospital! Escolha o que deseja fazer:\n ");
         System.out.println("(1) Checar farmácia do hospital");
         System.out.println("(2) Ver os tipos de médicos disponíveis");
         System.out.println("(3) Ver unidades disponíveis");
         System.out.println("(4) Ver consultas");
         System.out.println("(5) Encerrar sistema");
         System.out.println("(6) Checar conta ");
         int resultado = input.nextInt();
         
         switch (resultado) {
            case 1:
            Scanner selecionar = new Scanner(System.in);
            System.out.println("Escolha uma ação: ");
            System.out.println("(1) Ver nome dos remédios");
            System.out.println("(2) Comprar remédio");
            int result = selecionar.nextInt();
            
            switch(result){
               case 1:
               F1.GetRemedios();

               case 2:
               F1.ComprarRemedio();
               break;

               default:
               System.out.println("Insira um valor válido!");
               break;
            }
            break;


            case 2:
            Scanner selecionar2 = new Scanner(System.in);
            System.out.println("Escolha modo de visualização");
            System.out.println("(1) Apenas nome da especialização");
            System.out.println("(2) Completo (Nome do médico, área e dias que atende)");
            int Resultado2 = selecionar2.nextInt();

            switch (Resultado2) {
               case 1:
               M1.GetMedicos();
               break;
      
               case 2:
               M1.Oftamologista();
               M1.Oncologista();
               M1.Ortopedista();
      
               default:
               System.out.println("Insira um valor válido!");
               break;
            }

            case 3:
            Unidade U1 = new Unidade();
            Scanner selecionar3 = new Scanner(System.in);
            System.out.println(U1.getUnidade1());
            System.out.println(U1.getUnidade2());
            System.out.println(U1.getUnidade3());
            break;


            case 4:
            Scanner choose = new Scanner(System.in);
            System.out.println("(1) Ver consultas");
            System.out.println("(2) Marcar Consulta");
            int resposta = choose.nextInt();
            
            switch(resposta){
               case 1:
               //String saida = "";
               for(int i = 0; i < consultas.size(); i++){
               System.out.println(consultas.get(i));
               }
               break;
      
               case 2:
               Scanner MedicoInput = new Scanner(System.in);
               System.out.println("Digite o tipo de médico (ex: Oftamologista)");
               String MedicoResultado = MedicoInput.next();
               Medico V1 = new Medico();
               V1.ValidaMedico(MedicoResultado);
               Scanner mesDiaInput = new Scanner(System.in);
               System.out.println("Digite o mês e o dia que pretende ir (XX/XX): ");
               String mesDiaResultado = mesDiaInput.nextLine();
               AgendamentoValidar A1 = new AgendamentoValidar();
               A1.ValidarDiaDoMes(mesDiaResultado);
               Scanner diaInput = new Scanner(System.in);
               System.out.println("Digite o dia da semana que deseja ir: ");
               String diaResultado = diaInput.nextLine();
               A1.ValidarDiaDaSemana(diaResultado);
               
               if (A1.valor == true){
                  consultas.add(new Agendamento(MedicoResultado, diaResultado, mesDiaResultado));
                  System.out.println("Consulta marcada com sucesso");
               } else {
                  System.out.println("Insira um valor válido!");
                  System.exit(0);
               }
               break;

               default:
            }
            break;
   
            case 5:
            System.exit(0);
            break; 

            case 6:
            System.out.println("Nome: " + c1.getNome());
            System.out.println("Idade: " + c1.getIdade());
            System.out.println("Senha: " +c1.getSenha());
            System.out.println("Remédios comprados: ");
            F1.GetCarrinho();
            break;
   
            default:
            break;
         }
      }
   }
}