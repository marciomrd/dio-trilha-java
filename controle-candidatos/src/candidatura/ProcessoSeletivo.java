package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
    }
    
    static void selecaoCandidato(){ 
        String [] candidatos = {"FELIPE", "MARCIO", "JULIA", "LUCAS","LUANA","ANA"}
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 3 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "solicitou este valor de salário" + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "Foi selecionado para a vaga");
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato" + candidato + "não foi selecionado para vaga");
            }

            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


    static void analisarSalario(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
