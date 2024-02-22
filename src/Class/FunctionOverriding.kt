package Class

open class Manager(val name:String) {

    open fun jobDesk(){
        println("Manager")
    }
}

class Developer(name:String) : Manager(name) {
    override fun jobDesk() {
        println("Developer")
    }
}

class Super(name: String):Manager(name){
    override fun jobDesk() {
        super.jobDesk()
    }
}