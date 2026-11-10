# Exercise 3 — Concatenation Predictions

Predict every answer before you run the code. Be exact. Include spaces.

Assume:
```java
int a = 5;
int b = 3;
String s = "Score";
char c = 'A';
```

| # | Expression | Predicted | Actual | Right? |
|---|---|---|---|---|
| 1 | `s + a` | `Score5` | `Score5` | Yes |
| 2 | `s + a + b` | `Score53` | `Score53` | Yes |
| 3 | `s + (a + b)` | `Score8` | `Score8` | Yes |
| 4 | `a + b + s` | `8Score` | `8Score` | Yes |
| 5 | `a + (b + s)` | `53Score` | `53Score` | Yes |
| 6 | `"" + a + b` | `53` | `53` | Yes |
| 7 | `c + 1` | `66` | `66` | Yes |
| 8 | `"" + c + 1` | `A1` | `A1` | Yes |
| 9 | `(char)(c + 1)` | `B` | `B` | Yes |
| 10 | `s + c` | `ScoreA` | `ScoreA` | Yes |

---

## Follow-up

**1. Compare #2 and #4. They use the same values, but in a different order. Why do they make different answers?**

Java reads the problem left to right.

- In `s + a + b`, the first thing is a `String`, so Java starts joining text together. That means it turns the numbers into text and makes `"Score53"`.
- In `a + b + s`, the numbers are first, so Java adds them first: `5 + 3 = 8`. Then it joins that answer with the text, making `"8Score"`.

So the order matters. Java does math before joining only when the numbers come first.

**2. Why does #7 give `66` instead of `A1`?**

A `char` is really a number behind the scenes. In Java, `'A'` is 65.

So this:
```java
c + 1
```
means:
```java
65 + 1
```
which is `66`.

There is no text here, so Java does math, not string joining.

**3. Why does #8 give `A1` when #7 gives `66`? What did the empty string change?**

The empty string `""` tells Java to start joining text.

So:
```java
"" + c + 1
```
becomes:
```java
"" + 'A' + 1
```
then:
```java
"A" + 1
```
which becomes:
```java
"A1"
```

The empty string changes the code from math to text joining.

**4. Write one line that prints exactly `The total of 5 and 3 is 8` using `a` and `b`.**

```java
System.out.println("The total of " + a + " and " + b + " is " + (a + b));
```

---

## Immutability check

Run this:
```java
String word = "hello";
word.toUpperCase();
System.out.println(word);

word = word.toUpperCase();
System.out.println(word);
```

**1. What did each line print?**

The first `println` printed:
```java
hello
```

The second `println` printed:
```java
HELLO
```

**2. In your own words, what does it mean that Strings are immutable?**

It means a `String` cannot be changed after it is made. If you want a different version, Java makes a new `String` instead of changing the old one.

**3. Why is it easy to write `word.toUpperCase();` and think you changed something? What kind of error is this?**

It is easy to think it changed because the method name looks like it should change the word. But `toUpperCase()` does NOT change the original string. It gives back a new string instead.

So this is a logic error. The program does not crash, but it still does the wrong thing.

