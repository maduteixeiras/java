// Gestão de Reservas de Hotel

// A rede de hotéis SunStay precisa de um sistema simples para que os atendentes possam gerenciar reservas de quartos.

// Você foi contratado para desenvolver um programa em Java no console que permita controlar os quartos disponíveis e registrar hóspedes.



// O sistema deve solicitar ao usuário a quantidade de quartos disponíveis no hotel.

// O hotel pode possuir no máximo 5 quartos.

// Para cada quarto cadastrado, o sistema deve solicitar:

// Quantidade de camas disponíveis em cada quarto.


// Limite de reservas
// O sistema deve permitir realizar no máximo 25 reservas no total.

// Menu do Sistema

// O sistema deve possuir um menu interativo com as seguintes opções:

// 1 – Registrar número dos quartos

// O atendente deve informar o número de cada quarto disponível no hotel.

// Exemplo:

// Quarto 101
// Quarto 102
// Quarto 103

// 2 – Registrar quantidade de camas

// O atendente deve informar a quantidade de camas disponíveis em cada quarto registrado na opção 1.

// Exemplo:

// Quarto 101 -> 2 camas
// Quarto 102 -> 3 camas
// Quarto 103 -> 1 cama

// 3 – Reservar quarto

// O sistema deve:

// Solicitar o número do quarto

// Verificar se o quarto existe

// Se não existir:

// Este quarto não existe!

// Verificar se há camas disponíveis

// Se não houver:

// Não há camas disponíveis neste quarto!

// Se houver disponibilidade:

// Solicitar o nome do hóspede

// Registrar a reserva

// Atualizar a quantidade de camas disponíveis

// Mensagem:

// Reserva realizada com sucesso!


// 4 – Consultar reservas por quarto

// O atendente informa o número do quarto.

// O sistema deve mostrar todos os hóspedes que reservaram esse quarto.

// Se o quarto não existir:

// Este quarto não existe!

// Se não houver reservas:

// Não há reservas para este quarto!


// 5 – Consultar reservas por hóspede

// O atendente informa o nome do hóspede.

// O sistema deve mostrar todas as reservas realizadas por esse hóspede.

// Se não houver reservas:

// Não há reservas para este hóspede!

// 6 – Encerrar sistema

// O programa deve finalizar a execução.