# Mini-Projeto — POO em Java (Aulas 01 a 04)

Aluno: Ermesly Blanc  
Turma: SPL0400102NNA  

---

## Objetivo

Aplicar os conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, incluindo:

- Criação e uso de objetos  
- Encapsulamento (get/set)  
- Construtores e sobrecarga  
- Herança e polimorfismo  

---

## Estrutura do Projeto

mini-projeto-poo-aulas01-04/
├── src/
│ ├── Pessoa.java
│ ├── Aluno.java
│ ├── Professor.java
│ └── EscolaApp.java
└── README.md

---

## Descrição das Classes

### Pessoa
Classe base com os atributos:
- `nome`, `idade`, `email`  
Inclui métodos getters/setters com validação e o método `exibirInformacoes()`.

### Aluno
Subclasse de `Pessoa` com atributos:
- `matricula`, `notaMedia`  
Sobrescreve o método `exibirInformacoes()` para mostrar dados específicos.

### Professor
Subclasse de `Pessoa` com atributos:
- `disciplina`, `salario`  
Também sobrescreve `exibirInformacoes()` com detalhes do professor.

### EscolaApp
Classe principal responsável por instanciar objetos de `Aluno` e `Professor`, exibindo as informações no console (demonstra o polimorfismo).

---

## Execução

Você pode executar o projeto de duas formas: pelo **Prompt de Comando (CMD)** ou pelo **terminal do VS Code**.

### 1. Executando pelo CMD

Dentro da pasta `src`, digite:

```bash
javac *.java
java EscolaApp


2. Executando pelo VS Code (caso o CMD não funcione)

Se o terminal do CMD não reconhecer os comandos javac ou java, você pode rodar o projeto diretamente dentro do VS Code:

Abra o arquivo EscolaApp.java.

No topo da janela do VS Code, clique no botão Run (ou Executar).

Se o botão não aparecer, pressione Ctrl + F5.

O programa será compilado e executado automaticamente no terminal integrado do VS Code.



Saída esperada

=== Aluno ===
Nome: João Silva
Idade: 16
Email: joao@email.com
Matrícula: A123
Nota média: 8.7

=== Professor ===
Nome: Maria Souza
Idade: 35
Email: maria@escola.com
Disciplina: Matemática
Salário: R$ 4500.0


Diagrama de Classes
Pessoa
 ├── nome : String
 ├── idade : int
 ├── email : String
 ├── +exibirInformacoes()
 │
 ├── Aluno
 │   ├── matricula : String
 │   ├── notaMedia : double
 │   └── +exibirInformacoes()
 │
 └── Professor
     ├── disciplina : String
     ├── salario : double
     └── +exibirInformacoes()

![Diagrama de Classes](image/diagrama-classes.png)
