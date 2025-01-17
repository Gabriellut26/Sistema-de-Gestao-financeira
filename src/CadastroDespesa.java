import java.util.ArrayList;

public class CadastroDespesa {

    static ArrayList <DespesaCredito> lista_cCreditos = new ArrayList<>();
    static ArrayList <DespesaDebito> lista_cDespesaDebitos = new ArrayList<>();
    static ArrayList <Assinaturas> lista_cAssinaturas = new ArrayList<>();


    static void adicionarDespesaCredito(DespesaCredito d){
        lista_cCreditos.add(d);
    }
    static void removerDespesaCredito(DespesaCredito d){
        lista_cCreditos.remove(d);
    }
    static void adicionarDespesaDebito(DespesaDebito d){
        lista_cDespesaDebitos.add(d);
    }
    static void removerDespesaDebito(DespesaDebito d){
        lista_cDespesaDebitos.remove(d);
    }
    static void adicionarAssinatura(Assinaturas d){
        lista_cAssinaturas.add(d);
    }
    static void removerAssinatura(Assinaturas d){
        lista_cAssinaturas.remove(d);
    }


    static String listarDespesasCredito(ContaBancaria conta){
        String dados = "";
        for(DespesaCredito d :lista_cCreditos){
            dados += d.getNome() + d.getCategoria();
        }
        return dados;
    }
    static String listarAssinaturas(ContaBancaria conta){
        String dados = "";
        for(Assinaturas a :lista_cAssinaturas){
            dados += a.getNome() + a.getCategoria();
        }
        return dados;
    }
    static String listarDespesasDebito(ContaBancaria conta){
        String dados = "";
        for(DespesaDebito d :lista_cDespesaDebitos){
            dados += d.getValor() + d.getCategoria();
        }
        return dados;
    }
    static ArrayList<Assinaturas> getLista_cAssinaturas(){
        return lista_cAssinaturas;
    }
}