import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //conhecer e importar a classe scanner
        //exibir mensagens usuario
        //obter valores digitados
        //exibir os valores 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá sr, seja bem vindo ao banco Diozinho, por favor digite o numero da sua conta");
        int conta = scanner.nextInt();
        System.out.println("Agora digite o numero da Agencia");
        int agencia = scanner.nextInt();
        System.out.println("O sr(a) se chama:");
        String name = scanner.next();
        System.out.println("Quanto deseja depositar?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + name + 
        ", obrigado por criar sua conta em nosso banco, sua agencia é " + agencia +
         ", conta " + conta + " e seu saldo total de R$" +
          saldo +
           " ja está disponivel para saque");

         scanner.close();
    }
}

/* 
Tutorial
Atributo	Tipo	Exemplo
Numero	Inteiro	1021
Agencia	Texto	067-8
Nome Cliente	Texto	MARIO ANDRADE
Saldo	Decimal	237.48
Revise sobre terminal, main args e a classe Scanner
Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
Programa: "Por favor, digite o número da Agência !"
Usuário: 1021 (depois ENTER para o próximo campo)
Revise sobre concatenação e classe String com método concat
Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.*/
