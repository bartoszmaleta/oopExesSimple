# Exercise 005: Sum numbers from array of data objects conditionally

The purpose of this exercise is to verify that you can execute blocks of code conditionally, meaning depending of whether some condition is met or not.

## Description

1. Start with all the steps from exercise 4 with an exception:
   - The exercise class with the `main()` method in should be called `Exercise5` instead of `Excercise4`.
1. In the `DataObject` class insert a `public` member variable named `code` of type `String`
1. Expand the number of `DataObject` instances created in the beginning of the `main()` method in `Exercise5` to 5 instances.
1. Two of the `DataObject` instances should have their `code` member variable set to `friday` and the other three instances should have their code member variable set to `saturday`.
1. Inside the `for` loop, insert an `if` statement so that it only adds the `count` member variable of `DataObjects` where the `code` variable is `friday` to the `sum` variable.

## Related resources

- [http://tutorials.jenkov.com/java/if.html](http://tutorials.jenkov.com/java/if.html)