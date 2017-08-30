package br.unifor.atm

/**
 * Created by diego on 29/08/2017.
 */
class Deposit(val accountNumber: Int, amount:Double) : Transaction{

    var keypad:Keypad?=null
    var depositSlot:DepositSlot?=null

    override fun execute() {
        //implentar ...
    }
}