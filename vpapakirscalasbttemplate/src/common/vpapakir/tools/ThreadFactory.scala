package common.vpapakir.tools

class ThreadFactory extends Thread  
{ 
    override def run() 
    { 
        // Displaying the thread that is running  
        println("Thread " + Thread.currentThread().getName() +  
                                        " is running.") 
    } 
}  