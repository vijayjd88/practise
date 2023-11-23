package day8;

public class OverloadAdd {
    // all the overloaded method should perform same logic but for different data type
    // po
    int add(int a, int b){
        return a + b;
    }
    float add(float a, float b){
        return a+ b;
    }

    float add(int a, float  b){
        return a+ b;
    }

    float add(float a, int b){
        return a+ b;
    }
    int add(int a, int b,int c){
        return a+ b+c;
    }
    String add(String a, String b){
        return a+ b;
    }
}
