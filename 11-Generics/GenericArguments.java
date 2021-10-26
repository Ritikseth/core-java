class MyArray<T>{
    T A[] =(T[])new Object[10]; //we cannot create an array of type generic, therefore create array of object then type cast it to generic 
    int length=0;
    
    void append(T v) {
        A[length++] = v;
    }
    void display(){
        for(int i=0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}

class GenericArguments {
    static void fun(MyArray<?> obj){ // <?> can be ignored
        obj.display();
    }
    static void fun1(MyArray<? extends Number> obj){
        obj.display();
    }
    static void fun2(MyArray<? super Number> obj){ // will only accept which is super to number
        obj.display();
    }

    public static void main(String[] args) {
        MyArray<String> ma1 = new MyArray<>();
        ma1.append("Hi");
        ma1.append("Bye");

        MyArray<Integer> ma2 = new MyArray<>();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);
        fun(ma2);
    }
}


// super is used for lower bound
// extend is used for upper bound
// ? is known as wildcard