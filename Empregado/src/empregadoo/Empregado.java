package empregadoo;
public class Empregado{
    private String nome;
    private int idade;
    private double salario;
    Empregado(String nome, int idade, double salario){
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if(idade>=16 && idade<=65){
            this.idade = idade;
        } else{
            System.out.println("Idade inválida para um empregado");
        }
        
    }

    public Double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        if(salario>=800){
            this.salario = salario;
        } else{
            System.out.println("Valor de salário deve ser maior");
        }
        
    }
    
    public boolean promover(){
        if(idade>18){
            aumentarSalario(25);
            System.out.println("Empregado promovido");
            return true;
        } else{
            System.out.println("O empregado não tem idade suficiente para ser promovido");
            return false;
        }
    }

    public void aumentarSalario(int aumento){
        salario += salario*aumento/100;
    }

    public boolean demitir(int razao){
        switch (razao) {
            case 1:
                System.out.println("Cumprir aviso prévio");
                break;
            case 2:
                System.out.println("O empregado deverá receber uma multa de " + (salario*40)/100);
                break;
            case 3:
                if(salario>=1000 && salario<=2000){
                    System.out.println("O salario da aposentadoria é = 1500");
                } else if(salario<=3000){
                    System.out.println("O salario da aposentadoria é = 2500");
                } else if(salario<=4000){
                    System.out.println("O salario da aposentadoria é = 3500");
                } else if(salario>4000){
                    System.out.println("O salario da aposentadoria é = 4000");
                } else{
                    System.out.println("Sem direito a aposentadoria");
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("Funcionário demitido");
        return true;
    }

    public void fazerAniversario(){
        idade += 1;
        System.out.println("Feliz aniversário " + nome);
    }

    @Override
    public String toString(){
        return "Empregado: " + nome + "\nIdade: " + idade + "\nSalário: " + salario;
    }
}
