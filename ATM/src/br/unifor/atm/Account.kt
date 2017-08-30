package br.unifor.atm

/**
 * Created by diego on 29/08/2017.
 */
class Account(val accountNumber:Int, val pin:Int, var availableBalance:Double, var totalBalance:Double) {

    fun validatePin():Boolean = true;
    


}