# Gen Delivery :fork_and_knife:

### Gen Delivery: Plataforma de Delivery de Alimentos Saudáveis

---

## 📚 Tabela de Conteúdo
- [Descrição :black_nib:](#descrição-black_nib)
- [Entidades e Atributos :card_file_box:](#entidades-e-atributos-card_file_box)
- [Tecnologias :computer:](#tecnologias-utilizadas-computer)
- [Dependências :paperclips:](#dependências-paperclips)
- [Como Executar? :runner:](#como-executar-runner)
- [Colaboradores :technologist:](#colaboradores-technologist)

---

## Descrição :black_nib:
O projeto Gen Delivery traz em si a implementação de uma plataforma de delivery para alimentos saudáveis com métodos básicos de CRUD para o cadastro, atualização, remoção e busca de produtos e categorias e o método personalizado de recomendação de produtos saudáveis. Contém três entidades principais que formam um relacionamento entre si no banco de dados, sendo elas: Usuário, Produto e Categoria.

## [Escopo Projeto](docs/escopo-projeto.pdf)

## Entidades e Atributos :card_file_box:  
1. **Usuário**:
   - Id
   - Nome
   - Usuário (email)
   - Foto
   - Senha
   - Lista de Produtos (Relação de classes)

2. **Produto**:
   - Id
   - Nome
   - Descrição
   - Preço
   - Quantidade
   - Usuário (Relação de classes)
   - Categoria (Relação de classes)

3. **Categoria**:
   - Id
   - Categoria
   - Lista de Produtos (Relação de classes)


---

##  Tecnologias Utilizadas :computer:
- **Backend**: Java com o FrameWork Spring
- **Banco de Dados**: MySQL
- **Cliente Teste**: Insomnia

---

## Dependências :paperclips:
  - Spring Boot DevTools
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Validation

---

## Como Executar? :runner:
Ao abrir o repositório do projeto, clique no botão **<> Code** e copie o link disponível na opção https e execute o comando **git clone <link-do-repositório-remoto>** ou faça o download e extração da pasta zip. Importe o projeto em sua IDE de escolha e execute o projeto. Com o projeto executando, é possível realizar os testes das funcionalidades utilizando o seu ambiente de teste de APIs de escolha, recomendamos o Insomnia.

### Pré-requisitos :clipboard:
   - **Java 17** ou superior
   - **MySQL** para gerenciamento do banco de dados
   - **Maven** para gerenciamento de dependências

### Recomendações :thumbsup:
   - IDE **Spring Tools Suite**, para a execução do projeto.
   - **MySQL Workbench** para criação de entradas no banco de dados
   - Ferramenta **Insomnia** para realização dos testes
     
---

## Colaboradores :technologist:
Esse Projeto foi desenvolvido por Cacia Rodrigues, Anna Carolina Vighi, Bruno Alexandre Barros e Marcos Lopes

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/CaciaRodrigues">
        <img src="https://avatars.githubusercontent.com/u/98604798?v=4" width="125px;" alt="Colaboradora Cacia Rodrigues"/><br />
        <sub><b>Cacia Rodrigues</b></sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/annavighi">
        <img src="https://avatars.githubusercontent.com/u/180130500?v=4" width="125px;" alt="Colaboradora Anna Carolina Vighi"/><br />
        <sub><b>Anna Carolina Vighi</b></sub>
      </a>
    </td>
        <td align="center">
      <a href="https://github.com/brunoalexb">
        <img src="https://avatars.githubusercontent.com/u/88696076?v=4" width="125px;" alt="Colaborador Bruno Alexandre Barros"/><br />
        <sub><b>Bruno Alexandre Barros</b></sub>
      </a>
    </td>
          <td align="center">
      <a href="https://github.com/marcoslopesdev">
        <img src="https://avatars.githubusercontent.com/u/110929754?v=4" width="125px;" alt="Colaborador Marcos Lopes"/><br />
        <sub><b>Marcos Lopes</b></sub>
      </a>
    </td>
  </tr>
</table>

