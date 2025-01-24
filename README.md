![image](https://th.bing.com/th/id/OIP.lwDa90HV9bdav2987iyL6QHaHa?w=200&h=200&rs=1&pid=ImgDetMain)

# Lista de Games
#### Projeto baseado no intensivão java do professor Nelio Alves (DevSuperior)
----
  
- A API utiliza arquitetura DDD (Domain-driven design), sendo bem organizada e seguindo as boas práticas SOLID.
- O sistema é feito em arquitetura MVC (Model, view, controller)
- O banco de dados PostgreSQL segue os princípios ACID, contendo 3 tabelas, sendo uma associativa. São elas:

    - tb_games
        - Contendo os jogos e suas informações
    - tb_games_list
        - Contendo as listas de jogos
    - tb_belonging
        - Relacionamento entre as duas outras tabelas, com cardinalidade 0..*

---

O projeto original teve seu deploy no railway, porém, o plano gratuito do railway foi encerrado. Logo, usei o Render para fazer o deploy, tendo que fazer um Dockerfile para a API, seguindo as regras de deploy do render.
O banco de dados PostgreSQL também está no Render.

---

### Endpoints
![Static Badge](https://img.shields.io/badge/GET-green?style=for-the-badge)
~~~
    /games
        Retorna todos os jogos
        [
            {
                id,
                title,
                year,
                imgUrl,
                shortDescription
            }
        ]

    /games/id
        Retorna o jogo pelo id
        {
            id,
            title,
            year,
            genre,
            platforms,
            score,
            imgUrl,
            shortDescription,
            longDescription
        }

    /lists
        Retorna as listas de jogos
        [
            {
                id,
                name
            }
        ]

    /lists/id/games
        Retorna os jogos que estão na lista especificada pelo id
        [
            {
                id,
                title,
                year,
                imgUrl,
                shortDescription
            }
        ]
~~~
![Static Badge](https://img.shields.io/badge/POST-yellow?style=for-the-badge)
~~~
    /lists/{id}/replacement
        Altera a posição de um jogo na lista especificada

        @RequestBody:
            {
                "sourceIndex": int,
                "destinationIndex": int
            }

        Retorna uma string se der tudo certo
            {
                "Alteração feita com sucesso"
            }
~~~


#### Projeto baseado no desafio: https://github.com/devsuperior/dslist-backend

### No mais, é isso <3

Tecnologias usadas:
~~~
    - Java 17
    - Maven
    - Spring Boot
    - Spring Web
    - Spring JPA
    - H2
    - PostgreSQL
    - Docker
~~~
