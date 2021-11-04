# DESAFIO-IBM-GAMA #01

### Modelagem e implementação do backend de um sistema bancário simples utilizando tecnologias como JPA, H2DB e MAVEN , Spring Boot 2.5.6

![Image](http://s2.glbimg.com/ISAMH15-7x5uueooUfpwrNr_S5I=/s.glbimg.com/jo/g1/f/original/2011/08/22/22-java-300.jpg "Imagem JAVA")

## Configuração

Antes de rodar a aplicação verifique se o arquivo application.properties está configurado corretamente com os atributos de conexão com banco de dados desejado ( url ( Driver | Provedor do Banco | Schema) , username , password , console enable , console path). Esse projeto utiliza um banco de dados H2Db pré-criado pelo usuário para funcionar corretamente.

## Construção do Projeto

### Modelagem
- **Conta:** classe concreta que define o modelo de entidade Conta e seus atributos (usuario) e métodos (debitar, creditar, transferir) e a implementação dos atributos que definem uma Conta bancária (numeroAgencia, numeroConta, banco, saldo,cheque especial).
  - **Cliente:** implementação da classe Cliente com os atributos que definem um cliente do banco (cpf , rg , nomeCompleto,email,telefone,endereco)
  - **Contatipo:** enum (CORRENTE, POUPANCA) utilizado por classes da aplicação
  - **Endereço:** Classe concreta que ira compor o cliente será também um entidade de banco de dados.
  - **?:**  (A definir)
  - **?:** (A definir) utilizado por classes da aplicação
  - **?:** (A definir)
  - **Usuario:** define o modelo da entidade Usuario e seus atributos (login, senha, nome, cpf)

### Repository
  - **ClienteRepository:** implementação dos métodos específicos de acesso e manipulação de entidades do tipo Cliente.
  - **ContaRepository:** implementação dos métodos específicos de acesso e manipulação de entidades do tipo Lancamento
  - **?Repository:** implementação dos métodos específicos de acesso e manipulação de entidades do tipo PlanoConta
  - **RepositoryI:** declara a interface a ser implementada pelas classes do tipo Repository da aplicação (save, update, findAll, findById )
  - **RepositoryImpl:** implementação básica das funcionalidades das classes de repository da aplicação (save, update, findAll, findById )
  - **UsuarioRepository:** implementação dos métodos específicos de acesso e manipulação de entidades do tipo Usuario (exists, findByLogin)

### Service
  - **ContaService:** Serviços relativos ao ContaRepository utilizados pela aplicação (findById)
  - **LancamentoService:** Serviços relativos ao LancamentoRepository utilizados pela aplicação (salvaLancamento, extractByIdConta, extractByPeriodAndIdConta)
  - **PlanoContaService:** Serviços relativos ao PlanoContaRepository utilizados pela aplicação (salvaPlanoConta, findById)
  - **ServiceI:** Interface implementada pelas classes Service da aplicação
  - **ServiceImpl:** Implementação base dos serviços utilizados na aplicação (save, update, findById, findAll)
  - **UsuarioService:** Serviços relativos ao UsuarioRepository utilizados pela aplicação

### Utils
  - **ConexaoFactory:** Factory de criação do EntityManager utilizado na aplicação
  - **TextoUtils:** métodos auxiliares utilizado na validação de String


  ## Dependências Maven

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.5.6</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>br.com.bloodblue</groupId>
	<artifactId>bluebank</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>bluebank</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>11</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

  ```

  ### Conexao com banco de dados (application-dev.properties)
  ```java
  spring.datasource.url=jdbc:h2:mem:testdb
  spring.datasource.username=sa
  spring.datasource.password=
  spring.h2.console.enable=true
  spring.h2.console.path=/h2-console
  ```

## Testes
  Testes para validar o funcionamento corretos dos métodos nas classes de repository e service foram criados e podem ser encontrados em `src/test/java/br.com.bloodblue.bluebank`
    
    
  ## Membros

  - Isaque Silva.
  - Bruno Carvalho.
  - Luiz Bazante.

    

  

