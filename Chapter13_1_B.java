/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                   Chapter 13: Problem 1, Part b                                          *****
 *****__________________________________________________________________________________________________________*****
 *****     1.  Implement the Edible interface on page 510 and then the code in listing 13.7 on pages 510-511.   *****
 *****                          Run the TestEdible program and examine the output.                              *****
 *****                                       Next, do the following.                                            *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****             b.  Remove both the @Override and method sound from Tiger and compile your code.             *****
 *****               After you get the answer(s) to the question(s), reinsert these lines of code.              *****
 *****                                                                                                          *****
 *****__________________________________________________________________________________________________________*****
 *****                                            Questions:                                                    *****
 *****                                      What happens and why?                                               *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                                            Answers:                                                      *****
 *****                                         What happens:                                                    *****
 *****                           It does not compile. We get the syntax error:                                  *****
 *****     Error:(92, 1) java: Tiger is not abstract and does not override abstract method sound() in Animal    *****
 *****                                                                                                          *****
 *****                                              Why?                                                        *****
 *****                   Tiger extends the Animal class. The Animal class is an abstract class                  *****
 *****                 that includes the abstract sound() method. Any class that extends Animal                 *****
 *****    must implement the abstract method, sound(). If we remove the "@Override", the program will still     *****
 *****   compile and run normally (Since the sound() method was implemented correctly), but if we remove the    *****
 *****        sound() method, the program will not compile or run. If we just left "@Override" in there,        *****
 *****      we would get an error and the program would not compile and/or run, because we would have the       *****
 *****       "@Override" annotation in there and then no "overridden" method following the annotation.          *****
 *****    Additionally, we would not have implemented the sound() method and not satisfied the condition        *****
 *****                     of implementing all abstract methods from the parent class.                          *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****                               Course Provided Solution (13_1_B):                                         *****
 *****   We get the syntax error: error: Tiger is not abstract and does not override abstract method sound()    *****
 ***** in Animal because Tiger, which extends Animal, must implement the abstract method of sound and does not. *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

public class Chapter13_1_B {

    public static void main(String[] args) {

        Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        for(int i = 0; i < objects.length; i++){
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());

            if(objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        }
    }
}
