//https://leetcode.com/problems/fizz-buzz/
class FizBuzz {
    fun findIt(n: Int): List<String>{
        val listString: MutableList<String> = mutableListOf()
        for(i in 1..15){
            if(i % 3 == 0 && i % 5 == 0){
                listString.add("FizzBuzz")
            }
            else if(i % 5 == 0){
                listString.add("Buzz")
            }
            else if(i % 3 == 0){
                listString.add("Fizz")
            }
            else{
                listString.add(i.toString())
            }
        }
        return listString
    }
}

fun main() {
    print(FizBuzz().findIt(15))
}
