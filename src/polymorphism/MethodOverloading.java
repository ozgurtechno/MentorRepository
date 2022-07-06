package polymorphism;

// This is STATIC polymorphism -> it happens in complie time and Java warn us....

public class MethodOverloading {

    void methodOverloaded() {
        //No argument method, return type is void
    }

    int methodOverloaded(int i) {
        //Returns int type
        return i;
    }

    int methodOverloaded(double d) {
        //Same return type as of above method
        return 0;
    }

//    void methodOverloaded(double d)
//    {
//        //Duplicate method because it has same method signature as of above method
//    }
}
