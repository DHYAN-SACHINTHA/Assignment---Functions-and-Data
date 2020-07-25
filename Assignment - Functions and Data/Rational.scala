//Question=>01//
object MyApp extends App{
    val r1 = new Rational(2,5)
    val r2 = new Rational(6,8)
    val x=r1+r2
    println(r1)
    println(r2)
    println(x.neg)

}
 
class Rational(n:Int,d:Int){
    require(d>0, "d must be grater than 0")
    def numer = n/gcd(n,d)  //This can be advantageous if it is expected that the functionsnumer and denom are called infrequently
    def denom = d/gcd(n,d)
    def this(n:Int) = this(n,1)

    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b) //
    def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom) //This can be advantageous if the functions numer anddenom are called often
    def neg = new Rational(-this.numer,this.denom)
    override def toString = numer+"/"+denom
}