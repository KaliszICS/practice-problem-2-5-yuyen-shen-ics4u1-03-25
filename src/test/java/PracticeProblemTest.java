import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void insertionSortTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {char[].class};
        Method method = testClass.getDeclaredMethod("insertionSort", cArg);
  // Enter code here
  char[] arr = {'b', 'B'};
  char[] arr2 = {'B', 'b'};
    (char[])method.invoke(null, arr);
  assertArrayEquals(arr2, arr);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void insertionSortTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {char[].class};
        Method method = testClass.getDeclaredMethod("insertionSort", cArg);
  // Enter code here
  char[] arr = {'a'};
  char[] arr2 = {'a'};
    (char[])method.invoke(null, arr);
  assertArrayEquals(arr2, arr);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void insertionSortTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {char[].class};
        Method method = testClass.getDeclaredMethod("insertionSort", cArg);
  // Enter code here
  char[] arr = {};
  char[] arr2 = {};
    (char[])method.invoke(null, arr);
  assertArrayEquals(arr2, arr);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void insertionSortTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {char[].class};
        Method method = testClass.getDeclaredMethod("insertionSort", cArg);
  // Enter code here
  char[] arr = {'b', 'f', 'a', 'c', 'g', 'd', 'e', '0', ' '};
  char[] arr2 = {' ', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    (char[])method.invoke(null, arr);
  assertArrayEquals(arr2, arr);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void insertionSortTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {char[].class};
        Method method = testClass.getDeclaredMethod("insertionSort", cArg);
  // Enter code here
  char[] arr = {'b', 'f', 'a', 'c', 'g', 'd', 'e'};
  char[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    (char[])method.invoke(null, arr);
  assertArrayEquals(arr2, arr);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
