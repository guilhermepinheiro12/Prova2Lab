Prova 2 Laboratório de programação

Feito por Guilherme da Silva Pinheiro e Christopher Marim


Estrutura do armazenamento de dados postgres

usuario(id,nome,login,senha,admin)
produto(id,nomer,preco) // nomer mesmo
venda(id,nome, preco, qtd)

![alt text](![image](https://user-images.githubusercontent.com/61766440/132801274-9ca460ee-ff1c-4b2c-b971-4c33e06bb687.png))

Em src/main/java/dao/Conexao.java
linha 20 
altere o getConenection de acordo com suas configurações postgres, ex: getConnection("jdbc:postgresql://(sua rota)", "(seu usario)", "(sua senha)");

