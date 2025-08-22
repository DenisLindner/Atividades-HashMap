Atividade Para Aprofundar o Conhecimento Sobre o Uso de HashMap:

Enunciado das Atividades:
1. Registro de Notas Simples
   
Estrutura:

Map<String /*Aluno*/, Double /*Nota*/>

Tarefa:

● Criar um sistema para armazenar notas finais de alunos.

● Permitir:

○ Adicionar ou atualizar nota.

○ Exibir relatório ordenado por nota decrescente.

○ Calcular média geral da turma.


Desafio Extra:
● Exportar relatório para CSV ordenado.

2. Notas por Disciplina
   
Estrutura:

Map<String /*Aluno*/, Map<String /*Disciplina*/, Double /*Nota*/>>

Tarefa:

● Cada aluno pode ter várias disciplinas.

● Funções:

○ Calcular média geral do aluno.

○ Calcular média por disciplina (entre alunos).

○ Identificar aluno com maior desempenho geral.


Desafio Extra:

● Gerar ranking por disciplina.

3. Histórico de Entregas de Tarefas
   
Estrutura:

Map<String /*Aluno*/, List<Map<String,Object> /*Entrega*/>>

Cada entrega tem: {atividade, data, nota, status}.

Tarefa:

● Cadastrar entregas para cada aluno.

● Consultar:

○ Todas as entregas de um aluno.

○ Entregas atrasadas.

○ Atividades com maior taxa de atraso.

Desafio Extra:

● Calcular a nota final ponderando atraso (-10% por dia).


4. Sistema de Frequência e Notas Integrado
   
Estrutura:

Map<String /*Aluno*/, Map<String /*Disciplina*/, Map<String,
Object> /*{nota, frequencia}*/>>

Tarefa:

● Registrar nota e frequência de cada aluno em cada disciplina.

● Aprovação exige nota >= 6 e frequência >= 75%.

● Exibir lista de aprovados e reprovados por disciplina.

Desafio Extra:

● Relatório de alunos em risco (nota < 6 e frequência < 80%).


5. Catálogo de Entregas com Status e Feedback
   
Estrutura:

Map<String /*Atividade*/, Map<String /*Aluno*/, Map<String, Object>
/*{status, nota, feedback}*/>>>

Tarefa:

● Registrar status ("Entregue", "Pendente", "Corrigido") e feedback.

● Funções:

○ Listar alunos que ainda não entregaram.

○ Listar notas de uma atividade já corrigida.

○ Gerar relatório final por atividade.


Desafio Extra:

● Criar estatísticas: percentual de alunos que entregaram no prazo.

6. Controle de Projetos em Grupos
   
Estrutura:

Map<String /*Projeto*/, Map<String /*Grupo*/,
List<Map<String,Object> /*Membros*/>>>

Tarefa:

● Gerenciar projetos com grupos e membros.

● Permitir:

○ Cadastrar grupo.

○ Adicionar/remover membros.

○ Atribuir nota do grupo e notas individuais.


Desafio Extra:

● Calcular contribuição individual média (nota do grupo + bônus individual).

7. Sistema de Avaliação Contínua
   
Estrutura:

Map<String /*Aluno*/, Map<String /*Disciplina*/, List<Map<String,
Object> /*Avaliação*/>>>

Cada avaliação: {tipo, peso, nota}

Tarefa:

● Calcular nota final ponderada por disciplina.

● Identificar se aluno pode ser aprovado mesmo faltando avaliações.


Desafio Extra:

● Simular diferentes cenários de pesos para prever aprovação.

8. Rastreamento de Entregas de Estágios
   
Estrutura:

Map<String /*Empresa*/, Map<String /*Aluno*/, Map<String,Object>
/*{horasCumpridas, relatoriosEntregues, avaliacaoFinal}*/>>>

Tarefa:

● Registrar carga horária, relatórios e avaliação final.

● Relatório:

○ Alunos que não atingiram horas mínimas.

○ Empresas com mais aprovados.

○ Nota média por empresa.


Desafio Extra:

● Ranking de desempenho das empresas (baseado na média de avaliações finais).

9. Sistema de Penalidades para Atrasos
    
Estrutura:

Map<String /*Aluno*/, Map<String /*Atividade*/, Map<String, Object>
/*{dataEntrega, prazo, notaOriginal, notaFinal}*/>>>

Tarefa:

● Se entrega atrasada, reduzir nota:

○ 1 dia: -10%

○ 2 dias: -20%

○ 5 dias: zero.


Desafio Extra:

● Permitir recalcular todas as notas caso a política de penalidade mude.

10. Dashboard Acadêmico Completo
    
Estrutura:

Map<String /*Aluno*/, Map<String /*Disciplina*/, Map<String,
Object> /*{notas, frequência, atividades, médiaFinal, situação}*/>>>

Tarefa:

● Sistema completo de:

○ Registro de notas (com várias avaliações).

○ Frequência.


○ Situação do aluno ("Aprovado", "Reprovado", "Em Recuperação").

● Relatórios:

○ Ranking geral da turma.

○ Percentual de aprovação por disciplina.

○ Dashboard com estatísticas (média geral, melhor e pior aluno).
