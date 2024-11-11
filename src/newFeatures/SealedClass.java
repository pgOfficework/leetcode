package newFeatures;

/*
The release of Java SE 17 introduced sealed classes (JEP 409).
This feature enables more fine-grained inheritance control in Java.

Sealing allows classes and interfaces to define their permitted subtypes.
In other words, a class or interface can define which classes can implement or extend it.
It’s a useful feature for domain modeling, and increasing the security of libraries.
 */
public sealed class SealedClass permits A, B, C {
}

final class A extends SealedClass {

}

sealed class B extends SealedClass permits D {

}

non-sealed class C extends SealedClass {

}

final class D extends B {

}
