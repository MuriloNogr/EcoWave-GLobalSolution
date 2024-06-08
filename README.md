![LogoEcoWave](https://github.com/MuriloNogr/EcoWave-GLobalSolution/blob/main/EcoWaveLogo.jpeg)

EcoWave
O EcoWave é um projeto Java Maven Spring Boot que tem como objetivo principal treinar um drone submerso para detectar lixo nos mares e oceanos. O projeto utiliza diversas tecnologias e funcionalidades para alcançar esse objetivo.

Link do Pitch: https://youtu.be/5DxI-h6ar00?si=uqMlWPmKE_GGRfuo

Link do video da Aplicação: https://youtu.be/jQFCIna_u5M?si=MTea7TRhZ_btsSeh

Link da API: https://rocky-depths-88705-d697bab49e8f.herokuapp.com

Link do FrontEnd: https://github.com/MuriloNogr/EcoWave-GS-MAD

RM550531 - Luis Fernando Menezes Zampar - 2TDSR
RM551694 - Diogo Fagioli Bombonatti - 2TDSR
RM89162 - Murilo Nogueira - 2TDSR
RM550711 - Gabriel Galdino da Silva – 2TDSR
RM550893 – Munir Ayoub – 2TDSPF

Tecnologias Utilizadas
Java
Maven
Spring Boot
Spring Data JPA
Spring HATEOAS
Oracle Database
Lombok
Swagger
Heroku
Funcionalidades Principais
Gerenciamento de Espécies: O projeto permite o cadastro, atualização, exclusão e consulta de espécies marinhas. Cada espécie possui informações como nome comum, nome científico e habitat.
Gerenciamento de Lixo: É possível cadastrar, atualizar, excluir e consultar os tipos de lixo encontrados nos mares e oceanos. Cada tipo de lixo possui informações como tipo e quantidade.
Gerenciamento de Usuários: O sistema permite o cadastro, atualização, exclusão e consulta de usuários. Cada usuário possui informações como e-mail, nome e senha.
Arquitetura e Organização do Código
O projeto segue uma arquitetura em camadas, separando as responsabilidades em diferentes pacotes:

controller: Contém as classes controladoras responsáveis por receber as requisições HTTP e retornar as respostas adequadas.
dto: Contém as classes DTO (Data Transfer Object) utilizadas para transferência de dados entre as camadas.
model: Contém as classes de modelo que representam as entidades do domínio, mapeadas para o banco de dados.
repository: Contém as interfaces de repositório que estendem a interface JpaRepository do Spring Data JPA, responsáveis pela persistência dos dados.
service: Contém as classes de serviço que encapsulam a lógica de negócio e fazem a comunicação entre os controladores e os repositórios.
exception: Contém as classes de tratamento de exceções globais.
Endpoints da API
A API RESTful do EcoWave possui os seguintes endpoints principais:

Espécies
GET /api/especies: Retorna todas as espécies cadastradas.
GET /api/especies/{id}: Retorna uma espécie específica pelo ID.
POST /api/especies: Cria uma nova espécie.
PUT /api/especies/{id}: Atualiza uma espécie existente pelo ID.
DELETE /api/especies/{id}: Remove uma espécie pelo ID.
Lixo
GET /api/lixo: Retorna todos os tipos de lixo cadastrados.
GET /api/lixo/{id}: Retorna um tipo de lixo específico pelo ID.
POST /api/lixo: Cria um novo tipo de lixo.
PUT /api/lixo/{id}: Atualiza um tipo de lixo existente pelo ID.
DELETE /api/lixo/{id}: Remove um tipo de lixo pelo ID.
Usuários
GET /api/usuarios: Retorna todos os usuários cadastrados.
POST /api/usuarios: Cria um novo usuário.
GET /api/usuarios/{id}: Retorna um usuário específico pelo ID.
PUT /api/usuarios/{id}: Atualiza um usuário existente pelo ID.
DELETE /api/usuarios/{id}: Remove um usuário pelo ID.
Documentação da API com Swagger
O projeto utiliza o Swagger para documentação e teste da API RESTful. A documentação pode ser acessada através da URL /swagger-ui.html quando a aplicação estiver em execução.

Persistência de Dados
O EcoWave utiliza o Oracle Database como banco de dados para persistência dos dados. As configurações de conexão com o banco de dados estão definidas no arquivo application.properties.

Deploy no Heroku
O deploy da aplicação foi realizado na plataforma Heroku. O Heroku é uma plataforma em nuvem que permite a implantação e execução de aplicações web de forma fácil e escalável.

Consumo da API por um Front-end em React Native
A API do EcoWave é consumida por um front-end desenvolvido em React Native. O front-end se comunica com a API através de requisições HTTP para os endpoints disponibilizados.

Diagrama de Classes:
![DiagramaUML](https://github.com/MuriloNogr/EcoWave-GLobalSolution/blob/main/DiagramaUMLEcoWave.png)

Considerações Finais
O projeto EcoWave é uma solução inovadora para o problema de detecção de lixo nos mares e oceanos. Através do uso de tecnologias modernas e uma arquitetura bem estruturada, o projeto oferece funcionalidades robustas para o gerenciamento de espécies, lixo e usuários.

A utilização do Spring Boot e suas bibliotecas relacionadas, como o Spring Data JPA e o Spring HATEOAS, facilita o desenvolvimento e a manutenção do projeto, além de fornecer recursos poderosos para a construção de APIs RESTful.

O deploy no Heroku permite que a aplicação seja facilmente acessível e escalável, enquanto o consumo da API por um front-end em React Native possibilita uma experiência de usuário interativa e intuitiva.

Com essa documentação detalhada, esperamos fornecer uma visão abrangente do projeto EcoWave, suas funcionalidades, tecnologias utilizadas e arquitetura. Estamos comprometidos em contribuir para a preservação dos mares e oceanos através da tecnologia e inovação.
