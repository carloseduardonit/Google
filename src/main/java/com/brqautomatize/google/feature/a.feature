Funcionalidade:  Facilador  de Pesquisar do google
 A fim de Realizacao Pesquisar avançada de forma  simples
 Como um usario basico
 Eu quero que o  usuario de forma simples faz Pesquisar avançada
 De modo a Razao
 
Cenario:  <ID> Realizar a pesquisa
    Dado  que o usuario  acessar  o programa
    E realizar a pesquisa do  tipo <ID>
    Quando clicar  no icone  do aplicativo
    E preencher o campo [O que desejar pesquisar?]
    E selecionar a opção <opção> o campo [Tipo de Pesquisa]
       Mas se campo [Tipo de Pesquisa] tiver com valor "excluir uma palavra" 
       preencher o campo []
    E clicar no botão [pesquisar]
    Entao o sistema carregar  

    Exemplos: Tipo de Pesquisa https://resultadosdigitais.com.br/marketing/pesquisa-avancada-google/
     |ID| Tipo de Pesquisa     | comando|
     |00| Nenhuma selecionar   |        |
     |01| comum                |        |
     |02| uma frase específica | """    |
     |03| excluir uma palavra  | "-"    |
     |04| termos que não lembra| "*"    |
     |05| por tipo de documento| “filetype:” ou “ext:”|
     |05| 