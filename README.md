# Loja de Games

Este é um projeto de uma loja virtual de games desenvolvido com Spring Boot e JPA. Ele simula funcionalidades de gerenciamento de produtos, categorias e usuários, com foco no aprendizado de desenvolvimento backend e boas práticas de programação.

O projeto foi desenvolvido durante o Bootcamp da Genereation Brasil, uma imersão com mais de 400h de conteúdo.

## Funcionalidades

- Cadastro e autenticação de usuários.
- CRUD completo para produtos:
  - Criar, listar, atualizar e deletar games disponíveis na loja.
- CRUD completo para categorias:
  - Gerenciamento de gêneros ou tipos de games.
- Relacionamento entre usuários, produtos e categorias.
- Busca de produtos por nome ou categoria.

## Estrutura do Projeto

- **Produto**: Entidade que representa os games, com atributos como nome, preço, e descrição.
- **Categoria**: Entidade que organiza os games em gêneros ou tipos.
- **Usuario**: Entidade que representa os clientes cadastrados na loja.

O projeto utiliza JPA para mapeamento das entidades e Spring Data JPA para gerenciar os repositórios.

## Tecnologias Utilizadas

- **Backend**: Java, Spring Boot, Spring Data JPA, Spring Security.
- **Banco de Dados**: MySQL.
- **Ferramentas de Desenvolvimento**: IntelliJ IDEA / Eclipse, Postman.

## Como Executar o Projeto

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/machadofatima/loja_de_games.git
   ```

2. **Configure o Banco de Dados:**
   - Certifique-se de que o MySQL está instalado e em execução.
   - Atualize o arquivo `application.properties` com as credenciais do banco de dados.

3. **Compile e Execute o Projeto:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Teste a API:**
   Use o Postman ou outra ferramenta para interagir com os endpoints da API.

## Como Contribuir

1. Faça um fork deste repositório.
2. Crie um branch para sua feature ou correção:
   ```bash
   git checkout -b minha-feature
   ```
3. Commit suas alterações:
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. Envie para o branch principal:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request no GitHub.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

Feito com ❤️ por [machadofatima](https://github.com/machadofatima).
