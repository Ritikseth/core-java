import java.lang.*;
import java.util.*;

class Store {
    Member members[] = new Member[10];
    int count = 0;

    void register(Member m) {
        members[count++] = m;
    }

    void inviteSale() {
        // for (Member x : members)
        //     x.callback();
        
        for(int i=0; i<count; i++){
            members[i].callback();
        }
    }
}

interface Member {
    public void callback();
}

class Customer implements Member {
    String name;
    Customer(String name){
        this.name = name;
    }
    public void callback() {
        System.out.println("Ok, I will visit "+name);
    }
}

class InterfaceChallenge{
    public static void main(String[] args){
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Ram");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}