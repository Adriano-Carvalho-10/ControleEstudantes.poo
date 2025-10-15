ControleEstudantes 

Atividade Individual: ADRIANO BATISTA DE CARVALHO 

Breve descrição do projeto 

O programa ControleEstudantes é uma aplicação Java que gerencia informações de estudantes, disciplinas e matrículas. Ele permite cadastrar estudantes e disciplinas, associar matrículas com notas, calcular médias por estudante e disciplina, identificar os melhores alunos, e filtrar estudantes e disciplinas com base em critérios de desempenho. O programa gera um arquivo output.txt com os resultados detalhados, incluindo listas ordenadas e estatísticas. 

Justificativa das escolhas de coleções 

List (implementada como ArrayList): Utilizei ArrayList na classe ListaEstudantes para armazenar a lista de estudantes, pois ela oferece flexibilidade para adição e remoção dinâmica de elementos, além de suportar iteração e acesso por índice, sendo ideal para ordenação por nome e busca por substring. 

Set (implementada como LinkedHashSet): Escolhi LinkedHashSet na classe CadastroDisciplinas para garantir que não haja disciplinas duplicadas (com base no código) e manter a ordem de inserção, proporcionando eficiência em verificações de unicidade e iteração. 

Map (implementada como HashMap): Usei HashMap na classe HistoricoNotas para associar IDs de estudantes a listas de matrículas, permitindo acesso rápido e eficiente a dados de notas por estudante, além de facilitar cálculos de médias e rankings.    

Como executar o programa 

Certifique-se de ter o Java Development Kit (JDK) instalado. 

Clone o repositório para sua máquina local: 

git clone https://github.com/Adriano-Carvalho-10/ControleEstudantes.poo.git  

Navegue até o diretório do projeto: 

cd ControleEstudantes 

Compile os arquivos Java: 

javac src/*.java 

Execute o programa: 

java src.Main 

O programa gerará o arquivo output.txt na raiz do projeto com os resultados. 

Comentário sobre qualquer desafio encontrado 

Um desafio enfrentado foi garantir que a pasta src fosse corretamente sincronizada entre o IntelliJ e o sistema de arquivos local para ser rastreada pelo Git. Isso exigiu exportar manualmente os arquivos do IDE para a pasta do projeto. Além disso, ajustar a estrutura de coleções para suportar ordenação e cálculos de média exigiu atenção aos métodos de iteração e filtragem no HistoricoNotas.  
