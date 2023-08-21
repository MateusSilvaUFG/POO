
# Rede Social

| Matrícula    | Nome                      |
|--------------|---------------------------|
| 202008055    | Giordanna Santos e Souza |
| 201700109    | Karollynne Santos Maciel |
| 201802778    | Mateus Silva de Sousa    |
| 202003602    | Matheus Diogo da Silva   |


para implementar o codigo, basta clonar o repositorio e importar o projeto no eclipse que ira rodar normalmente.

Este documento descreve algumas informações sobre o sistema de usuários implementado em Java. O sistema permite o registro de informações de usuários, incluindo nome de usuário, senha, nome completo, data de nascimento e relacionamento. Além disso, oferece a criação de posts venda de produtos e adição de eventos, seguir usuarios.

Cadastro de Usuários: O sistema necessita de pelo menos  dois registro de informações para que todas as ferramentas sejam testadas. 

Exemplo de Uso
A seguir, apresentamos um exemplo de uso do sistema:


    
    USER NAME:~$ 1
    PASSWORD:~$ 1
    FULL NAME:~$ João Silva
    BIRTHDATE (dd/MM/yyyy):~$ 10/05/1990
    RELATIONSHIP:~$ Solteiro

    USER NAME:~$ 2
    PASSWORD:~$ 2
    FULL NAME:~$ Maria Souza
    BIRTHDATE (dd/MM/yyyy):~$ 25/08/1985
    RELATIONSHIP:~$ Casada


Após o registro dos usuários, é possível fazer login com um deles para testar as funcionalidades do sistema. No entanto, é importante usar os valores apresentados na tela de menu e as informações de ID corretas para evitar erros. O sistema apresenta um tratamento de exceção "InputMismatchException" em caso de entrada incorreta em alguns cassos, pois não conseguimos tratar todas as entradas, para validar apenas as que queriamos, mas foi implementado o tratamento de erro.

observação final: teste todas as funcionalidades antes de tentar forçar um erro. 
