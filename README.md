# Documentação do Projeto

**Integrantes:**
* Gabrielle
* Vitor Dross
* Pedro H.
* Elisandro Jr.
* Sandro Molling
* Nícolas Welter

---

## Sobre a Aplicação

### Problema
Qual o problema estamos tentando resolver?  
> Pessoas viciadas que têm dificuldade em pedir ajuda.

### Público-Alvo
Para quem estamos criando?  
> Para pessoas com problemas de vícios em geral.

### Solução
O que estamos propondo?  
> Um sistema que busca agir como uma rede de apoio, onde pessoas podem compartilhar hobbies, gostos e sua jornada contra seus vícios.

---

## MVP (Produto Mínimo Viável)

Qual é o menor recorte dessa solução que podemos construir?  
> Um sistema em **Java** com as funções básicas necessárias para o suporte destas pessoas, funcionando via **console**.

### Precisamos ter:
- [x] Input de mensagens anonimamente (sem criação de usuário)
- [x] Spring Boot
- [x] Banco de dados para salvar as postagens
- [x] Feed público das mensagens
- [x] Sistema local (sem servidor em rede)
- [x] Opção de colocar um nome de identificação em cada mensagem (opcional)

### Podemos deixar para depois:
- [ ] Criação de usuário (anônimo ou registrado)
- [ ] Compartilhamento de imagem

---

## Pesquisas e Arquitetura

* **Como integrar o banco de dados com o Java?**  
  Utilizando **JPA** (Java Persistence API) para conectar, consultar e modificar dados.

* **Como organizar as classes?**  
  Separação em pastas distintas para:
  * Funcionalidades básicas no `Main`
  * Conexão com o banco de dados
  * Interface web (futura / expansão)

---

## Ideia de Interface (Console)

```
Olá! Escolha uma opção: 
[1] Envie uma mensagem
[2] Visualize todas as mensagens 
[3] Sair
```

### Fluxo das Opções:

* **Opção 1:**
  ```
  Digite uma mensagem:
  "..."
  Mensagem enviada com sucesso! (Retorna ao menu principal)
  ```

* **Opção 2:**
  ```
  ------------------------------------------------
  Nome provisório (ou Anônimo)
      Mensagem....
  ------------------------------------------------
  Nome provisório (ou Anônimo)
      Mensagem....
  ------------------------------------------------
  [Continuação das postagens...]
  ```

* **Opção 3:**
  * Sai do loop e encerra a execução do sistema.

---
