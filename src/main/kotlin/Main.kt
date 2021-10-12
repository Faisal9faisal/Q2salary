fun main (){
    print(" enter the salary of employee : ")
    var salary = readLine()!!.toDouble()

    print("Performance rating by 1,2 or 3:")
    var perfo = readLine()!!.toInt()


    if (perfo == 1) {
        println("The new salary of employee is " + ((salary+(salary*6)/100)))
    }
    else if (perfo == 2) {
        println("The new salary of employee is " + ((salary+(salary*4)/100)))
    }
    else if (perfo == 3) {
        println("The new salary of employee is " + ((salary+(salary*1.5)/100)))
    }


}