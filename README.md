# Technical task - project "DI"

## Description

DI idea.

1. There is a repository of objects. In it, we will register the classes whose objects we want to have in the project.

In our example, we will register Tracker, StartUI, ConsoleInput there.

2. The storage within DI is called Context, that is, objects related to the subject area of ​​our project.

3. After registering the classes, the Context starts initializing the objects. It costs a dependency tree. It first creates objects with no dependencies.

And then we create objects with dependencies.

4. After initialization, the programmer can get the desired object from the Context.

Let's make our DI implementation.

Two approaches are used to implement DI: metaprogramming, reflection.

In this example, we will use reflection. Reflection allows you to find out what elements a class has during program execution.

