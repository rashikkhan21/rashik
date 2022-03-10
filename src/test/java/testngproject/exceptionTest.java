package testngproject;

import org.testng.annotations.Test;

public class exceptionTest {

@Test
private void addition() {
int a= 12;
int c =12;
System.out.println(a+c);

}
@Test(expectedExceptions  = Exception.class)
private void div() {
int s = 20220;
int d = 0;
System.out.println("Div : " +( s/d));

}

}
