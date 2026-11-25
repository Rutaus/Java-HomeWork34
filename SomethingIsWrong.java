public class SomethingIsWrong {

     // 1: The problem is that we are declaring the Rectangle var but didn't create Rectangle Object.
     // Rectangle myRect;  ->   Rectangle myRect = new Rectangle;

     // "cannot resolve method 'area' in 'Rectangle'" - we don't have area() method in class Rectangle (built in class)
     // we have to create a class Rectangle first and make area() method or ->
     // -> import the 'Rectangle' class from intelliJ and change the area() method.


    // 2: Fix the program in 1 (using the same class 'Rectangle' from question 5)
    public static void main(){
        Rectangle myRect = new Rectangle(40, 50);

        System.out.println("Rectangle area is " + myRect.getArea());
    }
}

    // without using this new 'Rectangle' class from question 5:

//     import java.awt.*;

//     public class SomethingIsWrong {
//         public static void main() {
//             Rectangle myRect = new Rectangle();
//             myRect.width = 40;
//             myRect.height = 50;
//
//             int rectArea = myRect.width * myRect.height;

//             System.out.println("Rectangle area is: " + rectArea);
//         }
//     }

    // without using the new class, we would call the new class in question 5: 'MyRectangle' ->
    // -> so we don't have it twice in the project.