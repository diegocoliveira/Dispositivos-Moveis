package br.unifor.atm

/**
 * Created by diego on 29/08/2017.
 */
class Account(val accountNumber:Int, val pin:Int, availableBalance:Double, totalBalance:Double ) {

    fun validatePin():Boolean = true
    var availableBalance:Double = availableBalance
        private set
    var totalBalance:Double = totalBalance
        private  set

    fun credit(){
        //implentar ...
    }

    fun debit(){
        //implentar ...
    }


}