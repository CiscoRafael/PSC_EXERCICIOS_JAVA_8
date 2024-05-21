package empregadoo;
import java.util.*;
public class Main {
    static ArrayList<Empregado> empregados = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        int menu = 0;
        do {
            System.out.println("1. Criar novo Emprego\n2. Promover empregado\n3. Aumentar salário do empregado\n4. Demitir empregado\n5. Fazer aniversário do empregado\n6. Mostrar detalhes do empregado\n7. Sair");
            menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Nome do empregado");
                    String nome = input.nextLine();
                    System.out.println("Idade do empregado");
                    int idade = input.nextInt();
                    System.out.println("Salário do empregado");
                    double salario = input.nextDouble();
                    Empregado novEmpregado = new Empregado(nome, idade, salario);
                    empregados.add(novEmpregado);
                    break;
                case 2:
                    Empregado empregadoPromovido = selecionarEmpregado();
                    empregadoPromovido.promover();
                    break;
                case 3:
                    Empregado empregadoAumento = selecionarEmpregado();
                    empregadoAumento.aumentarSalario(input.nextInt());
                    break;
                case 4:
                    Empregado empregadoDemitido = selecionarEmpregado();
                    System.out.println("Qual a razão da demissão?\n1- Justa causa\n2- Decisão do empregador\n3- Aposentadoria");
                    int razao = input.nextInt();
                    empregadoDemitido.demitir(razao);
                    empregados.remove(empregadoDemitido);
                    break;
                case 5:
                    Empregado empregadoAniversariante = selecionarEmpregado();
                    empregadoAniversariante.fazerAniversario();
                    break;
                case 6:
                    Empregado listaEmpregados = selecionarEmpregado();
                    System.out.println(listaEmpregados);
                    break;
                default:
                    if(menu!=7){
                        System.out.println("Opção inválida");
                    }
                    
                    break;
            } 
        } while (menu!=7);
        input.close();  
    }
    

    public static Empregado selecionarEmpregado(){
        System.out.println("Escolha o empregado");
        for(int i = 0; i< empregados.size(); i++){
            System.out.println((i+1) + "- " + empregados.get(i).getNome());
        }
        int indice = input.nextInt();
        input.nextLine();
        return empregados.get(indice-1);
    }
}
