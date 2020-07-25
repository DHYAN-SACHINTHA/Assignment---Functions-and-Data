//Question=>03//
object Bank extends App{
    var A1 = new Account("961473152V",0001,100000)
    var A2 = new Account("971486324V",0002,5000)
    println("Account 1="+A1)
    println("Account 2="+A2)
    A1.transfer(A2,500)
    println("Account 1 after transfer="+A1)
    println("Account 2 after transfer="+A2)
}

//var bank:List[Account] = List()
class Account(id:String,n: Int, b:Double){
    val nic:String = id
    val acnumber: Int = n
    var balance: Double = b
    override def toString = "["+nic+":"+acnumber+":"+balance+"]"

    def withdraw(a:Double) = this.balance =this.balance-a
    def deposit(a:Double) = this.balance = this.balance+a
    def transfer(a:Account, b:Double){this.withdraw(b);a.deposit(b)}
}