# Criação de Objetos

## Ciclo de vida dos objetos
- Objetos são persistentes, existem em memória até serem destruídos.
1. Criação e inicialização
    - O objeto é criado com base na classe especificada
    - Os atributos do objeto são inicializados com valores
1. Em Uso
    - Objeto em memória, prove acesso as funcionalidades, executa seu papel dentro de um processo maior
1. Morte
    - Objeto é removido da memória
    - Em Java, não é necessário detruir objetos
    - Garbage Collector (GC) cuida de destruir todos os objetos que não estão mais em uso

## Construtores

- Cria um novo objeto
- Prepara o objeto para uso
- Inicializa atributos
- Não tem tipo de retorno
- Em Java possuem o mesmo nome da classe
- Invariantes

## Destrutores
- Nao existe em Java (GC cuida disso quando achar conveniente)

## Static Factory Methods
- Nomes significativos
- Não é obrigatória a criação de um novo objeto a cada chamada
- Construtor privado

## Invariantes

- Exemplo:
    - Um dado pode ter 4, 6, 8, 10 ou 20 faces 

