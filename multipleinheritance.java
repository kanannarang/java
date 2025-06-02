class A {
    void sum(){
        System.out.println("this is vs code");
    }
}
    class B {
        void sum(){
            System.out.println("this is also vs code");
        }
    }

class multipleinheritance extends A {
    public static void main(String[] args){
        multipleinheritance m = new multipleinheritance();
        m.sum();
    }
    
}

