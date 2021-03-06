package mylib
package contracts

/**
 *  Classe abstrata que define o contrato
 * de uma Estrutura de Dados linear.
 *
 * @author Rafael G. de Paulo
 */
abstract class EstLin[T] {
  def head: Option[T]               // retorna o valor do elemento "inicial", "primeiro" ou "cabeça" da estrutura linear, se existir
  def tail: Option[T]               // retorna o valor do elemento "final", "último" ou "cauda" da estrutura linear. se existir
  def size: Int                     // retorna a quantidade de elementos atualmente na estrutura linear
  def push(value: T): Boolean       // insere um valor na estrutura linear. retorna true se conseguiu inserir, false se não deu, por não ter mais espaço (só acontece em EstLin não-encadeadas)
  def pop(): Option[T]              // remove um valor da estrutura linear
  def foreach(foo: (T) => _): Unit  // executa a função inserida em cada elemento da estrutura linear 
}