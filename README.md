# Sistema de Atendimento – Estruturas de Dados em Java

- Aluna: Emily Pontes Fontana
- Turma: 4U noite

## 📘 Descrição do Projeto
Este projeto implementa **duas estruturas de dados fundamentais (Pilha e Fila)** utilizando listas encadeadas seguindo as regras da atividade da disciplina.

- **Pilha (Histórico de Solicitações)** → armazena o histórico das solicitações de serviço realizadas.
- **Fila (Ordem de Atendimento)** → gerencia a ordem em que os clientes serão atendidos.

---

## ⚙️ Funcionalidades

### 🔹 Pilha – Histórico de Solicitações (LIFO)
- Adicionar uma nova solicitação ao histórico 
- Remover a última solicitação adicionada
- Consultar todo o histórico em ordem (do topo até o primeiro elemento);
- Verificar se a pilha está vazia.

Cada nó da pilha contém:
- `ID da solicitação`
- `Descrição`
- `Data e hora`

---

### 🔹 Fila – Ordem de Atendimento (FIFO)
- Adicionar cliente à fila 
- Atender o próximo cliente
- Consultar toda a fila de atendimento em ordem;
- Verificar se a fila está vazia.

Cada nó da fila contém:
- `ID do cliente`
- `Nome`
- `Motivo do atendimento`

---
## 🖥️ Execução do Programa

### 1️⃣ Compile o projeto
No terminal ou PowerShell, dentro do diretório do projeto:

```bash
javac Main.java
```

```bash
java Main
```

---

Em seguida o sistema exibirá o menu para interação com o usuário
