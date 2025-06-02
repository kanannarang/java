interface client1 {
    void show();
}

interface client2{
    void show();
}

class Interface1  implements client1,client2{

     public void show(){
        System.out.println("this is common for both client1 and client2");
     }
     public static void main(String[] args) {
        Interface1 obj = new Interface1();
        obj.show();
        
     }
    
}
