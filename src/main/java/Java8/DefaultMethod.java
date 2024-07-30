package Java8;

public class DefaultMethod {
    /*
    What are defaults methods?
• Default method is a way for adding new methods to the interface without affecting the implementing classes.
hence with this new feature Java people defended many compile time errors that may arise due to unimplemented methods of interface.
• Eg: interface Animal
{
public void legs;
default void eyes
{
sout ("two eyes")
}
}
• The use of these default methods is "Backward Compatibility" which means if JDK modifies any
Interface (without default method) then the classes which implement this Interface will break.
On the other hand, if you add the default method in an Interface then you will be able to provide the default implementation.
This won't affect the implementing classes.
     */
}
