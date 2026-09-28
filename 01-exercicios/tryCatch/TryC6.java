package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vConta = 3000;

        try {
            System.out.println("Informe o valor que deseja sacar: ");
            float vSaque = scanner.nextFloat();

            if (vSaque <= 0) {
                System.out.println("ERRO: o valor do saque deve ser maior que zero.");
            } else if (vSaque > vConta) {
                System.out.println("ERRO: saldo insuficiente.");
            } else {
                System.out.println("Saque realizado com sucesso!");
                vConta -= vSaque;
                System.out.println("Saldo restante: R$ " + vConta);
            }

        } catch (InputMismatchException e) {
            System.out.println("ERRO: digite um valor numérico válido.");
        } finally {
            System.out.println("Operação encerrada");
            scanner.close();
        }
    }
}

// "Você foi contratado para ajustar o modulo de
// pagamentos do SafeBank. O sistema atual fecha
// inesperadamente quando o usuário digita um valor
// inválido ou tenta sacar mais do que possui. Sua
// tarefa é envolver a lógica de saque em uma
// estrutura de tratamento de erros que:

// Capture erros de digitação (ex:
// InputMismatchException).

// Previna divisões por zero ou valores negativos.

// Utilize o bloco finally para exibir a mensagem
// 'Operação encerrada' independente do que
// aconteça."