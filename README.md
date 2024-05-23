**Unit Tester**

---

**Introduction**

The Unit Tester is a Java utility class designed to facilitate unit testing by providing methods for comparing values and objects, checking execution time, and validating conditions with detailed logging.

---

**Features**

- `valEquals`: Compares two objects for value equality and logs the result.
- `memEquals`: Compares two objects for reference equality and logs the result.
- `tie`: Checks the execution time of a given method and logs whether it meets a specified maximum time limit.
- `exeCondition`: Executes a method based on a condition and logs the result.

---

**Usage**

1. **valEquals**:
   - `valEquals(Object o1, Object o2)`: Compares objects `o1` and `o2` for value equality.
   - `valEquals(Object o1, Object o2, String message)`: Compares objects `o1` and `o2` for value equality with a custom message.

2. **memEquals**:
   - `memEquals(Object o1, Object o2)`: Compares objects `o1` and `o2` for reference equality.
   - `memEquals(Object o1, Object o2, String message)`: Compares objects `o1` and `o2` for reference equality with a custom message.

3. **tie**:
   - `tie(long maxMili, exeMethod m)`: Checks the execution time of method `m` and logs whether it meets the specified maximum time limit.

4. **exeCondition**:
   - `exeCondition(boolean cond, exeMethod m)`: Executes method `m` based on the condition `cond` and logs the result.

---

**Installation**

No installation is required. Simply include the `Tester.java` file in your Java project.

---

**Contributing**

Feel free to contribute to this project by submitting bug reports, feature requests, or improvements via GitHub pull requests.

---

**License**

This project is licensed under the MIT License. See the LICENSE file for details.

---

**Note**

Make sure to include the necessary import statements and define the `exeMethod` interface for the `tie` and `exeCondition` methods to work properly.
