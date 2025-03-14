# pratica-junit-vanilla

Um financiamento possui três dados:

    • totalAmont: valor total de dinheiro financiado
    • income: renda mensal do cliente que está financiando
    • months: número de meses do financiamento

E dois métodos:

    • entry: entrada do financiamento, igual a 20% do valor total
    • quota: prestação mensal do financiamento (sem juros)
    
    
Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente. A seguir alguns exemplos de financiamentos para ajudar a entender a regra:

Exemplo 1: { totalAmount: 100000, income: 2000, months: 20 }
Este exemplo é INVÁLIDO porque com esses dados a entrada seria 20000 e a prestação seria 4000. Porém a prestação não pode passar de 1000, que é a metade da renda do cliente.

Exemplo 2: { totalAmount: 100000, income: 2000, months: 80 }
Já este exemplo é VÁLIDO porque a entrada seria 20000 e a prestação seria 1000. Neste caso, a prestação é menor ou igual a metade da renda do cliente, satisfazendo a regra.
