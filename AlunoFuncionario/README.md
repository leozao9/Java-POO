# Projeto: AlunoFuncionario

Este projeto foi criado para praticar a simulação de  
**herança múltipla** em Java, utilizando os conceitos de  
**herança simples** e **composição**.

Como o Java **não permite herança múltipla de classes**  
(uma classe só pode estender uma única classe), aqui eu simulo  
uma situação onde uma pessoa é **tanto um aluno quanto um funcionário**,  
combinando duas classes diferentes em uma única estrutura.

---

## 🎯 Objetivo

Modelar um objeto que represente uma pessoa que é ao mesmo tempo  
um **aluno** e um **funcionário**, reutilizando os comportamentos  
de ambas as classes sem quebrar as regras da linguagem.

---

## 🧱 Estrutura das classes

- `Pessoa`: classe base com atributos comuns, como nome e idade.
- `Aluno`: representa os dados de um aluno (ex: matrícula, curso).
- `Funcionario`: representa os dados de um funcionário (ex: setor, cargo).
- `AlunoFuncionario`: representa uma pessoa que é ambos.  
  Ela **herda de Pessoa** e **possui** dois objetos:  
  um `Aluno` e um `Funcionario`.

---

## 🛠️ Conceitos aplicados

- Herança
- Composição
- Encapsulamento
- Reutilização de código
- Organização de código orientado a objetos
- Simulação de herança múltipla em Java

---

## 📌 Observações

Este projeto é um exemplo didático, voltado para reforçar  
a compreensão dos conceitos de herança e composição.

Pode ser expandido futuramente com mais funcionalidades,  
como métodos sobrescritos, polimorfismo e entrada de dados via console.