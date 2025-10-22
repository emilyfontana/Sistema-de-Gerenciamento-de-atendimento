public class No {

    private String id;
    private No proximo;
    private String descricao;
    private String nome;  // usado apenas na Fila
    private String data;
    //id e descricao coincide com ambos fila e pilha

    //data = pilha
    //nome = fila


//construtor
    public No(String id, No proximo, String descricao, String nome, String data){
        this.id = id;
        this.proximo = proximo;
        this.descricao = descricao;
        this.nome = nome;
        this.data = data;




    }

    public String GetId(){
        return id;

    }

    public void SetId(String id){
        this.id = id;

    }

    public No GetProximo(){
        return proximo;
    }

    public void SetProximo(No proximo){
        this.proximo = proximo;
    }

    public String GetDescricao(){
        return descricao;
    }

    public void SetDescricao(String descricao){
        this.descricao = descricao;
    }

    public String GetData() {
        return data;
    }
    public void SetData(String data) {
        this.data = data;
    }
    public String GetNome() {
        return nome;
    }
    public void SetNome(String nome) {
        this.nome = nome;
    }




}

