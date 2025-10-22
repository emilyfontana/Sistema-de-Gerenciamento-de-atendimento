public class Pilha {
    private No topo;
    private int tamanho;

//histórico de solicitações de serviços

    //id
    //descricao
    //data

    //inicializar Pilha
    public Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }
    //inicilizar tamanho da pilha

    public boolean Vazia(){
        return topo ==  null;
    }

    public void adicionar(String id, String descricao, String data){
//o topo deve sempre apontar para o nó que entrou antes dele

        No pilha = new No (id, topo, descricao, null,  data);
        topo = pilha;
//topo = new No (id, topo, descricao, null,  data); -> sugerido pelo intelij
        // Incrementa tamanho
        tamanho++;

        System.out.println("Solicitação adicionada com sucesso! ID: " + id);


    }

    public void remover(){
        if(Vazia()){
            System.out.println("Não é possível remover pois não há histórico");

        } else{
            System.out.println("Removendo do histórico ...");
            topo = topo.GetProximo();
            tamanho--;


        }
    }

    public void consultar() {
        if (Vazia()) {
            System.out.println("Histórico vazio.");
        } else {
            System.out.println("--- Histórico de Solicitações ---");
            No atual = topo;
            while (atual != null) {  // percorre até o fim da lista
                System.out.println("ID: " + atual.GetId() +
                        " | Descrição: " + atual.GetDescricao() +
                        " | Data: " + atual.GetData());
                atual = atual.GetProximo();
            }
        }
    }

     //---Não foi possivel implemntar dessa forma precisei alterar---
        //percorrer adicionar tamanho
        //No atual = topo;
        //for (int i = 0; i < tamanho; i++)
        // atual = atual.GetProximo();
    //por conta da desatualização de tamanho causa um erro






        //lifo
    // Métodos para adicionar e remover elementos da pilha
}
