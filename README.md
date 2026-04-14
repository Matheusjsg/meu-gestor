# 📦 Meu Gestor

API REST de gerenciamento de produtos desenvolvida com **Java + Spring Boot**, aplicando os princípios da **Arquitetura Limpa (Clean Architecture)** com separação clara de responsabilidades entre as camadas Core, Use Cases e Infrastructure.

> Projeto desenvolvido com fins de estudo e prática de Clean Architecture em ambiente Java/Spring Boot.

---

## 🏗️ Arquitetura

O projeto segue a estrutura de camadas da Clean Architecture, garantindo que as regras de negócio sejam independentes de frameworks, banco de dados e detalhes de infraestrutura.

```
src/
└── main/java/com/meugestor/
    ├── core/               # Entidades e interfaces do domínio (regras de negócio)
    ├── usecases/           # Casos de uso da aplicação (orquestração do negócio)
    └── infrastructure/     # Detalhes técnicos: controllers, JPA, DTOs, configurações
```

### Princípio central

> As camadas internas **não conhecem** as camadas externas.  
> `core` ← `usecases` ← `infrastructure`

| Camada | Responsabilidade |
|---|---|
| **Core** | Entidades de domínio e contratos (interfaces de repositório) |
| **Use Cases** | Lógica de aplicação, orquestração dos casos de uso |
| **Infrastructure** | Controllers REST, persistência JPA, mapeamento DTOs, configurações Spring |

---

## 🚀 Tecnologias

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Maven**
- **H2 / banco relacional** (persistência)
- **DTO mapping** (separação entre camadas de transporte e domínio)

---

## ⚙️ Como executar

### Pré-requisitos

- Java 17 ou superior
- Maven 3.8+

### Rodando o projeto

```bash
# Clone o repositório
git clone https://github.com/Matheusjsg/meu-gestor.git

# Acesse a pasta
cd meu-gestor

# Execute com Maven Wrapper
./mvnw spring-boot:run
```

A API ficará disponível em: `http://localhost:8080`

---

## 📡 Endpoints

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/produtos` | Lista todos os produtos |
| `GET` | `/produtos/{id}` | Busca produto por ID |
| `POST` | `/produtos` | Cadastra novo produto |
| `PUT` | `/produtos/{id}` | Atualiza produto existente |
| `DELETE` | `/produtos/{id}` | Remove produto |

---

## 📚 O que foi estudado

Este projeto foi construído com foco no aprendizado prático de:

- **Clean Architecture** — separação de responsabilidades em camadas independentes
- **Dependency Inversion Principle** — camadas internas definem interfaces, camadas externas implementam
- **DTOs** — objetos de transferência para desacoplar a API da entidade de domínio
- **Persistência com JPA** — mapeamento objeto-relacional isolado na camada de infraestrutura
- **Spring Boot** — configuração e injeção de dependência sem poluir o domínio

---

## 👨‍💻 Autor

Feito por **Matheus JSG**  
[GitHub](https://github.com/Matheusjsg)
