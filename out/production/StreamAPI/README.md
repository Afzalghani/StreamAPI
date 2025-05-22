# Java Stream API Examples

This repository contains various examples and use-cases demonstrating the power and versatility of Java's **Stream API** introduced in Java 8. Stream API allows for functional-style operations on collections, making code more readable, concise, and efficient.

---

## 🚀 Overview

Java Stream API provides a declarative way to manipulate and process collections. It supports operations like filtering, mapping, sorting, and aggregation. This repository includes practical examples to help you understand and apply Stream operations.

---

## 🧠 Stream API Method Categories

### 🔹 Source Methods (to create streams)

These methods are used to **initiate a stream**.

* `Collection.stream()`
* `Collection.parallelStream()`
* `Stream.of(...)`
* `Arrays.stream(...)`
* `Stream.builder()`
* `Stream.generate(...)`
* `Stream.iterate(...)`

---

### 🔸 Intermediate Methods (return a new stream)

These methods are **lazy operations** that transform a stream and return another stream.

* `filter(Predicate)`
* `map(Function)`
* `mapToInt()`, `mapToDouble()`, etc.
* `flatMap(Function)`
* `sorted()`
* `distinct()`
* `limit(long n)`
* `skip(long n)`
* `peek(Consumer)`

---

### 🔻 Terminal Methods (produce a result or side-effect)

These methods **consume the stream** and produce a result or side-effect. The stream cannot be reused after a terminal operation.

* `forEach(Consumer)`
* `collect(Collector)`
* `toArray()`
* `reduce(BinaryOperator)`
* `count()`
* `min(Comparator)`
* `max(Comparator)`
* `anyMatch(Predicate)`
* `allMatch(Predicate)`
* `noneMatch(Predicate)`
* `findFirst()`
* `findAny()`

---

### 📦 Common Collectors (`Collectors` used with `.collect()`)

These are utility methods from `java.util.stream.Collectors` used to gather or transform the final stream result:

| Collector Method                           | Description                                                           |
| ------------------------------------------ | --------------------------------------------------------------------- |
| `Collectors.toList()`                      | Collects elements into a `List`                                       |
| `Collectors.toSet()`                       | Collects elements into a `Set`                                        |
| `Collectors.toMap(keyMapper, valueMapper)` | Collects elements into a `Map`                                        |
| `Collectors.joining(delimiter)`            | Concatenates string elements with a delimiter                         |
| `Collectors.counting()`                    | Counts the number of elements                                         |
| `Collectors.groupingBy(Function)`          | Groups elements by a classifier function, returns a `Map<K, List<T>>` |
| `Collectors.partitioningBy(Predicate)`     | Splits elements into `true/false` groups based on predicate           |
| `Collectors.averagingInt(ToIntFunction)`   | Calculates average from integer values                                |
| `Collectors.summingInt(ToIntFunction)`     | Calculates sum from integer values                                    |
| `Collectors.mapping()`                     | Allows additional mapping inside a downstream collector               |
| `Collectors.collectingAndThen()`           | Allows wrapping the result with a finishing transformation            |

---

## 📘 Stream Use Cases Covered

1. Create a stream from a list and print all its elements
2. Filter all even numbers from a list of integers
3. Find the first element in a list that matches a condition
4. Convert a list of strings to uppercase
5. Count the number of elements matching a condition
6. Create a list of square roots of integers
7. Find the **maximum** and **minimum** elements in a list
8. Sort a list of strings alphabetically
9. Sort a list of integers in **descending** order
10. Create a list of **distinct** elements from a list with duplicates
11. Convert a list of strings to a single **comma-separated string**
12. Calculate the **sum** and **average** of a list of integers
13. **Group** strings by their length
14. **Partition** integers into even and odd numbers
15. Create a map from strings to their lengths
16. Find the **longest** and **shortest** strings
17. Remove all **null** elements from a list
18. **Merge** two lists into one
19. Find the **frequency** of each character in a string
20. Remove duplicates from a list of **objects** based on a field
21. **Flatten** a list of lists into a single list
22. Find the **second highest** number in a list

---
