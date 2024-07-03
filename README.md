API Cliente

## Sobre
Esta API permite a criação, visualização, atualização e exclusão de registros de clientes. Ela é construída utilizando Java com Spring Boot, com integração ao banco de dados PostgreSQL para armazenamento persistente dos dados dos clientes.

## Executar
Este projeto utiliza o Docker para gerenciar o banco de dados. Para iniciar, siga estas instruções:

- docker compose up -d # Inicializa o container do PostgreSQL

- Após este passo, você pode rodar o projeto normalmente e realizar as requisições.

 
## 🗃️ **Dependências:**
- Spring Data JPA
- Spring Web
- PostgreSQL Driver
- SpringBoot DevTools
- Docker Compose Support
- Bin Validation
- Mapstruct
- Lombok

## Endpoints

- Endpoint POST: /cliente/create
- Descrição: Permite a criação de um novo cliente no banco de dados.

- Endpoint GET: /cliente
- Descrição: Permite a visualização de todos os clientes registrados.

- Endpoint GET: /cliente/id
- Descrição: Permite a visualização do cliente responsável pelo identificador mencionado.

- Endpoint PUT: /cliente/update/id
- Descrição: Permite a atualização das informações do cliente.

- Endpoint DELETE: /cliente/delete/id
- Descrição: Permite a exclusão do cliente no banco de dados.