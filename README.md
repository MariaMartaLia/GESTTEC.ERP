# Gesttack ERP

Sistema ERP em desenvolvimento com foco em controle de estoque, vendas, receitas e gerenciamento operacional.

O projeto está sendo construído para simular cenários reais de sistemas corporativos, aplicando conceitos de modelagem de domínio, arquitetura backend e relacionamentos complexos entre entidades.

---

# Objetivo

O Gesttack ERP foi criado com o objetivo de aprofundar conhecimentos em:

- Java e Programação Orientada a Objetos (POO)
- Arquitetura Backend
- Modelagem de Banco de Dados
- Relacionamentos SQL
- Estruturação de sistemas corporativos
- Controle transacional
- Regras de negócio
- Organização de domínio
- Versionamento com Git/GitHub

---

# Tecnologias

## Backend

- Java
- Spring Boot
- Hibernate / JPA
- Maven

## Banco de Dados

- PostgreSQL
- SQL

## Frontend (Planejado)

- React
- Angular

---

# Funcionalidades

## Produtos e Catálogo

- Cadastro de produtos
- Controle de categorias
- Controle de marcas
- Controle de tipos
- Ativação e desativação de produtos

## Estoque

- Controle de estoque mínimo e máximo
- Histórico de movimentações
- Entrada e saída de estoque
- Controle de perecíveis

## Vendas

- Registro de vendas
- Controle de itens de venda
- Cálculo de subtotal
- Estrutura para cálculo de valor total

## Receitas e Produção

- Cadastro de receitas
- Associação de ingredientes
- Controle de quantidade por receita
- Relacionamento N:N utilizando entidade intermediária

---

# Modelagem do Sistema

O sistema foi estruturado utilizando conceitos reais de modelagem relacional:

- Primary Keys (PK)
- Foreign Keys (FK)
- Integridade referencial
- Relacionamentos 1:1
- Relacionamentos 1:N
- Relacionamentos N:N
- Entidades intermediárias
- Encapsulamento
- Modelagem orientada a objetos

---

# Entidades Principais

## Entidades de Domínio

- Produto
- Categoria
- Marca
- Tipo
- Estoque
- Venda
- Ingrediente
- Receita
- MovimentacaoEstoque

## Entidades Intermediárias

- ItemVenda
- ReceitaIngrediente

---

# Relacionamentos Complexos

O sistema utiliza entidades intermediárias para representar relacionamentos N:N com atributos adicionais.

## Exemplo

### Receita ↔ Ingrediente

Uma receita pode possuir vários ingredientes, e um ingrediente pode participar de várias receitas.

Para resolver esse relacionamento foi criada a entidade:

```text
ReceitaIngrediente
```

Ela armazena:

- Ingrediente
- Quantidade
- Unidade de medida

---

# Estrutura do Projeto

```text
Gesttack-ERP/
│
├── backend/
│   ├── src/
│   ├── entity/
│   ├── repository/
│   ├── service/
│   └── resources/
│
├── database/
├── der/
├── docs/
├── frontend-react/
├── frontend-angular/
└── README.md
```

---

# Arquitetura Backend

O backend está sendo estruturado utilizando:

- Entities
- Services
- Repositories
- Controllers
- DTOs (planejado)
- Regras de negócio
- Encapsulamento de domínio

---

# DER do Sistema

Diagrama Entidade Relacionamento (DER) do banco de dados do Gesttack ERP.

![DER do Gesttack ERP](der/gesttack-der.png)

---

# Status do Projeto

## Banco de Dados

- [x] Modelagem relacional
- [x] Estrutura PostgreSQL
- [x] Relacionamentos SQL
- [x] Integridade referencial
- [x] Testes com INSERT e JOIN

## Backend

- [x] Estrutura Spring Boot
- [x] Entidades Java
- [x] Relacionamentos orientados a objetos
- [x] Encapsulamento
- [x] Métodos de domínio
- [ ] Regras de negócio
- [ ] Camada Service
- [ ] Repositories JPA
- [ ] API REST
- [ ] DTOs
- [ ] Tratamento de exceções
- [ ] Validações

## Frontend

- [ ] React
- [ ] Angular

---

# Aprendizados Aplicados

Durante o desenvolvimento estão sendo aplicados conceitos de:

- Programação Orientada a Objetos
- Modelagem de domínio
- Arquitetura backend
- Banco de dados relacionais
- Estrutura ERP
- Encapsulamento
- Relacionamentos complexos
- Organização de entidades
- Controle de estoque
- Versionamento com Git/GitHub

---

# Objetivo Futuro do Projeto

O objetivo futuro é transformar o Gesttack ERP em uma aplicação completa com:

- API REST
- Autenticação e autorização
- Dashboard administrativo
- Gestão completa de estoque
- Gestão de vendas
- Controle de produção
- Relatórios
- Frontend integrado

---

# Autor

Maria Marta  
Estudante de Análise e Desenvolvimento de Sistemas  
Foco em Backend Java, Modelagem de Domínio e Arquitetura de Sistemas

```
