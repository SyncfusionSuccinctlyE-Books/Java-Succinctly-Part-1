// The first example shows computing the result without simplifying
// the expression:
int result1 = (((((((4-2)*12)+1)*2)/7)*(((((4-2)*12)+1)*2)/7))*
((((((4-2)*12)+1)*2)/7)*(((((4-2)*12)+1)*2)/7))*
((((((4-2)*12)+1)*2)/7)*(((((4-2)*12)+1)*2)/7)))-1;
System.out.println("Final result is " + result1);
		
// The second example shows that all we're really doing is raising
// 7 to the power of 6 and subtracting 1:
int result2 = 7*7*7*7*7*7-1;
System.out.println("Final result is " + result2);