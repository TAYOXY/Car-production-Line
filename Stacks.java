import jeliot.io.*;
public class Stacks {
    public static void main(String[] args) {
        Car car1 = new Car("Honda_Pilot", 78256);
        Car car2 = new Car("Honda_Civic", 11223);
        Car car3 = new Car("Toyota_Camry", 22358);
        Car car4 = new Car("Toyota_Corolla", 66256);
        Car car5 = new Car("Acura_MDX", 35368);
        Car car6 = new Car("BMW_i8", 22564);
        Car car7 = new Car("Ford_Probe", 35795);
        Car car8 = new Car("Chevrolet_Camaro", 44751);
        Car car9 = new Car("Mitsubishi_Pajero", 27965);
        Car car10 = new Car("Audi_R8", 57971);

        Stack stack = new Stack();
        stack.push(car1);
        stack.push(car2);
        stack.push(car3);
        stack.push(car4);
        stack.push(car5);
        stack.push(car6);
        stack.push(car7);
        stack.push(car8);
        stack.push(car9);
        stack.push(car10);
        Car a = stack.pop();
        System.out.println(a + "is popped out from the stack.");
        Car b = stack.pop();
        System.out.println(b + "is popped out from the stack.");
        Car c = stack.pop();
        System.out.println(c + "is popped out from the stack.");
        Car d = stack.pop();
        System.out.println(d + "is popped out from the stack.");
        Car e = stack.pop();
        System.out.println(e + "is popped out from the stack.");
        Car f = stack.pop();
        System.out.println(f + "is popped out from the stack.");
        Car g = stack.pop();
        System.out.println(g + "is popped out from the stack.");
        Car h = stack.pop();
        System.out.println(h + "is popped out from the stack.");
        Car i = stack.pop();
        System.out.println(i + "is popped out from the stack.");
        Car j = stack.pop();
        System.out.println(j + "is popped out from the stack.");
        System.out.println("Stack is empty: "+stack.isEmpty());
        System.out.println("First popped car: " + a);
        System.out.println("Last popped car: " + j);
    }

}
class Car{
    String name;
    int miles;
    Car(String name, int miles){
        this.miles = miles;
        this.name = name;
    };
    public String toString(){
        return this.name + " - " + this.miles;
    }
}
class StackNode {
    Car data;
    StackNode next;
    StackNode(Car data) { this.data = data; }
}
class Stack {
    StackNode root;
    boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else
            return false;
    }
    void push(Car data)
    {
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }
    Car pop()
    {
        Car popped = null;
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }
    Car peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return null;
        }
        else {
            return root.data;
        }
    }
}
