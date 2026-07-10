# Reservation System - Java Exceptions

Projeto desenvolvido durante o estudo de **Tratamento de Exceções em Java**, com foco na evolução da solução por meio de refatorações e aplicação de boas práticas de Programação Orientada a Objetos (POO).

O principal objetivo deste projeto é demonstrar como uma aplicação pode evoluir de uma implementação com responsabilidades mal distribuídas para uma solução mais organizada, reutilizável e alinhada aos princípios da orientação a objetos.

---

## 📚 Conceitos praticados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Delegação de responsabilidades
- Validação de regras de negócio
- Tratamento de exceções
- Exceções personalizadas
- Refatoração de código
- Organização e manutenção de código

---

## 🚀 Evolução do projeto

O desenvolvimento foi dividido em commits que representam a evolução da solução:

### ✅ Initial Commit
Estrutura inicial do projeto.

### ❌ Very Bad Solution
- Validações realizadas na classe principal (`Program`).
- A entidade `Reservation` não era responsável por validar seu próprio estado.
- Forte acoplamento entre a interface e a regra de negócio.

### ⚠️ Bad Solution
- Parte das validações foi movida para a entidade.
- Os métodos retornavam mensagens (`String`) indicando erro.
- A solução ainda apresentava limitações:
  - Não permitia tratamento adequado de exceções.
  - Misturava lógica de negócio com mensagens de erro.
  - Dependia do programador lembrar de verificar os retornos.

### ✅ Good Solution
Implementação utilizando tratamento de exceções.

Melhorias aplicadas:

- Regras de negócio encapsuladas na entidade `Reservation`.
- Criação de exceções personalizadas para representar erros de negócio.
- Separação entre fluxo normal da aplicação e tratamento de erros.
- Código mais limpo, organizado e de fácil manutenção.

---

## 💡 Aprendizados

Durante este projeto foi possível compreender a importância de:

- Delegar responsabilidades para a própria entidade.
- Evitar lógica de negócio na classe principal.
- Utilizar exceções para representar situações inválidas.
- Escrever código mais limpo e reutilizável.
- Refatorar uma solução mantendo o mesmo objetivo de negócio.

---

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Git
- GitHub

---

## 📌 Objetivo

Este repositório foi criado com fins de estudo para registrar a evolução da implementação de um sistema de reservas em Java, aplicando conceitos fundamentais de orientação a objetos e tratamento de exceções.

Cada commit representa uma etapa importante da evolução da solução, permitindo visualizar a melhoria contínua do código ao longo do desenvolvimento.
