# Exercise 9 — The Scanner Newline Trap

## Part A — Break it on purpose

Run `src/ScannerTrap.java` exactly as written. Enter `16` for the age, then try to type a name.

**1. What actually happened?**

The program immediately printed the name prompt, but the name field was empty. It didn’t let me type a name; it just skipped right past it.

**2. What did you expect to happen?**

I expected it to ask for my age, then ask for my full name and let me type it in normally.

**3. Did the program crash, or did it just behave strangely?**

It behaved strangely, not crashed. It was a scanning/input bug.

---

## Part B — Explain it

`nextInt()` reads the number `16` and stops. But you also pressed Enter, and that newline character is still sitting in the input buffer.

**1. So what does the next `nextLine()` read?**

It reads the leftover newline character left behind by pressing Enter. Since that newline is basically an empty line, the name comes out blank.

**2. Why doesn't this happen if you use `nextInt()` twice in a row?**

Because `nextInt()` ignores whitespace before reading the integer, so the newline is skipped automatically. The problem is only when `nextInt()` is followed by `nextLine()`.

---

## Part C — Fix it

**1. Add the fix to `ScannerTrap.java`. Paste your corrected lines here:**

```java
int age = input.nextInt();
input.nextLine();
String name = input.nextLine();
```

**2. Why does a bare `input.nextLine();` with nothing assigned to it solve the problem?**

It consumes the leftover newline character that `nextInt()` left behind. Then the next `nextLine()` reads the actual name the user typed.

---

## Part D — Input is not safe

Run any program that uses `nextInt()` and type `hello` instead of a number.

**1. What error did you get?**

It threw an `InputMismatchException` error.

**2. Is that a syntax error, a runtime error, or a logic error?**

It is a runtime error.

**3. Real applications never trust input. Name two things a user could type into your project's input that would break it.**

- `hello` instead of a number
- a negative number or a giant number outside the expected range

**4. We can't fix this properly until we have conditionals in Unit 3. But what *would* you want the program to do when someone types the wrong thing?**

I would want it to say something like, `Invalid input. Please enter a whole number.` and then ask again instead of crashing.
