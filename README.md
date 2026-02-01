# algo

## Simple Multi-threaded Java Application

This repository contains a simple Java application that demonstrates multi-threading concepts.

### Description

The application creates three worker threads that run concurrently, each counting from 1 to 5 with a 500ms delay between counts. This demonstrates basic thread creation, execution, and synchronization in Java.

### Features

- Multiple worker threads running concurrently
- Thread synchronization using `join()`
- Console output showing interleaved thread execution
- Exception handling for interrupted threads

### How to Run

1. Compile the Java source file:
   ```bash
   javac src/Main.java
   ```

2. Run the application:
   ```bash
   java -cp src Main
   ```

### Expected Output

The program will display output from three threads running concurrently. The order may vary due to thread scheduling, but you should see all three threads counting to 5 and completing their work.

Example:
```
Simple Multi-threaded Java Application
======================================
Thread-1 - Count: 1
Thread-2 - Count: 1
Thread-3 - Count: 1
Thread-1 - Count: 2
Thread-2 - Count: 2
Thread-3 - Count: 2
...
Thread-1 finished!
Thread-2 finished!
Thread-3 finished!

All threads completed!
```