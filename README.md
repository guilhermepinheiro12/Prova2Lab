Prova 2 Laboratório de programação

Feito por Guilherme da Silva Pinheiro e Christopher Marim


Estrutura do armazenamento de dados postgres

usuario(id,nome,login,senha,admin)
produto(id,nomer,preco) // nomer mesmo
venda(id,nome, preco, qtd)

![alt text](https://github.com/guilhermepinheiro12/Prova2Lab/blob/main/diagrama.png)

Em src/main/java/dao/Conexao.java
linha 20 
altere o getConenection de acordo com suas configurações postgres, ex: getConnection("jdbc:postgresql://(sua rota)", "(seu usario)", "(sua senha)");

