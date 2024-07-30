package Java8;

public class MethodReferencing {
    public static void main(String[] args) {
        FI fiDemo = Test :: testImplementation;
        fiDemo.singleAbstractMethod();
        //If no testImplementation is available in existing code base then use following
        //code for lambda expressions:
        FI f = () -> System.out.println("IMPLEMENTATION of SAM");
        f.singleAbstractMethod();
    }
    static class Test
    {
        public static void testImplementation() {
            System.out.println("This is test implementation of your abstract method");
        }
    }
}
/*
•EG: MethodReferenceDemo and FunctionalInterfaceDemo
•Method reference is replacement of lambda expressions. It is used to refer method of Functional
interface to an existing method. Mainly it is used for code reusability.
•Functional Interface's Abstract method can be mapped to specific existing method using double
colon operator (::) .This is Method reference.
• Hence Method reference is an alternative to Lambda expressions.
•Whenever we have existing Implementation of Abstract method of our Functional interface then we can go for method reference.
If no such method like testImplementation is available then go for lambda expressions.
 */
