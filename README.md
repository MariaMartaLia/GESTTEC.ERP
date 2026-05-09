# GESTTEC ERP

Sistema ERP focado em vendas, estoque e produção, desenvolvido para aprofundamento prático em arquitetura backend, modelagem relacional, APIs REST e integração frontend.

O projeto simula cenários reais de sistemas corporativos utilizados em empresas de varejo, restaurantes, controle de estoque e gestão comercial.

---

# Objetivos do Projeto

* Aplicar conceitos reais de engenharia de software
* Desenvolver arquitetura backend escalável
* Praticar modelagem de banco de dados relacional
* Construir APIs REST utilizando Spring Boot
* Estruturar integração frontend com React e Angular
* Simular fluxo real de sistemas ERP corporativos

---

# Funcionalidades Modeladas

## Gestão de Produtos

* Cadastro de produtos
* Controle de categorias
* Controle de marcas
* Controle de tipos de produto
* Controle de status ativo/inativo
* Controle de produtos perecíveis
* Controle de código de barras

## Controle de Estoque

* Movimentação de entrada e saída
* Controle de quantidade em estoque
* Histórico de movimentações
* Controle de validade de ingredientes

## Gestão de Vendas

* Registro de vendas
* Controle de itens vendidos
* Subtotal e valor total
* Status da venda
* Histórico de operações

## Produção e Receitas

* Cadastro de receitas
* Associação de ingredientes
* Quantidade e unidade de medida
* Estrutura N:N utilizando entidade associativa

---

# Modelagem de Banco de Dados

O projeto foi estruturado utilizando modelagem relacional profissional com:

* DER (Diagrama Entidade Relacionamento)
* Crow’s Foot Notation
* Relacionamentos 1:N
* Relacionamentos N:N
* Entidades associativas
* Chaves primárias e estrangeiras
* Organização por domínio de negócio

---

# Arquitetura Utilizada

O projeto segue separação em camadas:

```text
Controller
↓
Service
↓
Repository
↓
Database
```

Com foco em:

* Clean Code
* Organização de domínio
* Escalabilidade
* Boas práticas backend
* Separação de responsabilidades

---

# Tecnologias Utilizadas

## Backend

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* API REST

## Banco de Dados

* MySQL
* PostgreSQL
* SQL
* Modelagem Relacional

## Frontend

* React
* Angular
* TypeScript
* HTML5
* CSS3

## Ferramentas

* Git
* GitHub
* Draw.io
* IntelliJ IDEA
* VS Code
* Postman

---

# Conceitos Aplicados

* Modelagem relacional
* CRUD completo
* Relacionamentos entre entidades
* Consumo de API REST
* Organização em camadas
* Versionamento Git
* Estruturação de backend corporativo
* Integração frontend/backend
* Manipulação de dados
* Regras de negócio
* Controle transacional

---

# Próximos Passos

* Implementação completa da API REST
* Autenticação e autorização com Spring Security
* Integração frontend React
* Dashboard administrativo
* Relatórios e métricas
* Dockerização da aplicação
* Deploy em cloud

---

# Competências Desenvolvidas

* Backend Java
* Spring Boot
* Banco de Dados Relacional
* SQL
* Modelagem DER
* APIs REST
* Git/GitHub
* React
* Angular
* TypeScript
* Arquitetura de Sistemas
* Engenharia de Software

---

# Projeto Desenvolvido Para

* Aprendizado prático de backend
* Simulação de sistemas corporativos reais
* Evolução em arquitetura de software
* Consolidação de conhecimentos em Java e Banco de Dados
* Desenvolvimento de portfólio profissional

## DER do Projeto

![DER](der/gesttec-der.png)