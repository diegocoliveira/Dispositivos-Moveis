package br.unifor.atm

/**
 * Created by diego on 29/08/2017.
 */
class Withdrawal(val accountNumber: Int, amount:Double) : Transaction {

    var keypad:Keypad?=null
    var cashDispenser:CashDispenser?=null

    override fun execute() {
        //implentar ...
    }
}