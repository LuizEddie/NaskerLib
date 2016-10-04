# NaskerLib

NaskerLib foi criado para servi como base para aplicações que usam a Data e Hora como eventos.

### Estrutura

 * **Alarms** - É a representação do tempo, pode ser uma data fixa, todo mês, toda semana e etc.  
 * **Scheduler** - É um DTO contendo o Alarm, Runnable, dono da scheduler e a prioridade.  
 * **Task** - É estendido ao scheduler e contém dados sobre ele, por exemplo, a última vez que ele foi executado.  
 * **Manager** - Gerenciador de Tasks, nele você adiciona e remove suas Tasks.  
 * **Executor** - Ele que faz a Task ser executada no tempo certo.  