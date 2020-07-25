//Question=>04/04.1/04.2/04.3//
object Bank extends App{
    var A1 = new Account("961473152v",0001,100000)
    var A2 = new Account("961478532v",0002,5000)
    var A3 = new Account("905236485v",0003,25000)
    var A4 = new Account("895632145v",0004,520000)
    var A5 = new Account("914586254v",0005,60000)
    var A6 = new Account("905236485v",0006,-5)
    var A7 = new Account("905236485v",0006,-10)

    var bank:List[Account] = List(A1,A2,A3,A4,A5,A6,A7)


    val  find = (n:String,b:List[Account]) => b.filter(x=>x.nic.equals(n))
    println("Accounts that have 905236485v => "+find("905236485v",bank))
    val overdraft = (b:List[Account]) => b.filter(x=>x.balance<0)
    println("Accounts with negative balances => "+overdraft(bank))
    val totalbalance = (b:List[Account]) => b.reduce((x,y)=>new Account("",0,x.balance+y.balance))
    println("Sum of all account balances=>"+totalbalance(bank))
    val interest = (b:List[Account])=>b.map((x)=>if(x.balance<0) x.balance=x.balance+(x.balance*0.1)
                                    else x.balance=x.balance+(x.balance*0.05))
    var i = interest(bank)
    println("Sum of all account balances with intersets=>"+totalbalance(bank))
}

//var bank:List[Account] = List()
class Account(id:String,n: Int, b:Double){
    val nic:String = id
    val acnumber: Int = n
    var balance: Double = b
    override def toString = "["+nic+":"+acnumber+":"+balance+"]"
}