package br.unifor.atm

/**
 * Created by diego on 29/08/2017.
 */
class BankDatabase(var account: Account) {

    fun authenticateUser():Boolean=true
    fun getAvailableBalance():Double = account.availableBalance
    fun getTotalBalance():Double = account.totalBalance
    fun credit() = account.credit()
    fun debit() = account.debit()
}