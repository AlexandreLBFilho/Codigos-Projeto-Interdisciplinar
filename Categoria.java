public class Categoria {

    public static String classificarMaquinario(int tipo) {
        String resposta = " ";
    	if (tipo == 1) {
        	resposta = "Máquinas de Usinagem";
        } else if(tipo == 2) {
        	resposta = "Equipamentos de Solda e Corte";
        } else {
        	resposta = "Máquinas de Conformação";
        }
    return resposta;	
    }
    
    public static String classificarRecurso(int tipo) {
        String resposta = " ";
    	if (tipo == 1) {
        	resposta = "Matéria-Prima";
        } else if(tipo == 2) {
        	resposta = "Insumos e Consumíveis";
        } else {
        	resposta = "Ferramentas e Acessórios";
        }
    return resposta;	
    }
}
