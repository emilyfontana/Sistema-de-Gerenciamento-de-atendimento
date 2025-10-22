public class Fila {
    private No frente;
    private No tras;
    private int tamanho;

    // Métodos para adicionar e atender clientes na fila
    //ordem de atendimento dos clientes

    //fifo

    //id
    //nome
    //descricao

    //construtor

    public Fila(){
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

    public boolean Vazia(){
        return frente == null;
        //deletei return tras pois é unreacheble
    }

    public void adicionar(String id, String nome, String descricao){


        No fila = new No(id,null, descricao, nome, null);

        if (Vazia()) { // fila vazia
            frente = fila;
            tras = fila; //mesmo elemento pois estava vazia
        } else { //proximas inserções
            tras.SetProximo(fila); // adiciona no final
            tras = fila;            // atualiza o último elemento
        }
        tamanho++;
        System.out.println("Cliente adicionado: " + nome + " (ID: " + id + ")");


    }

    //remover
    public void remover(){
        if(Vazia()){
            System.out.println("Não é possível remover pois não há fila");

        } else{
            System.out.println("Próximo atendimento ...");
            frente = frente.GetProximo();
            tamanho--;

        }
    }

    //consultar

    public void consultar() {
        if (Vazia()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("Fila de Clientes: ");
            No atual = frente;
            while (atual != null) {  // percorre até o último
                System.out.println("ID: " + atual.GetId() +
                        " | Nome: " + atual.GetNome() +
                        " | Motivo: " + atual.GetDescricao());
                atual = atual.GetProximo();
            }
        }


    }
        //percorrer adicionar tamanho
        // mesma situação em pilha ----> for (int i = 0; i < tamanho; i++){









}
