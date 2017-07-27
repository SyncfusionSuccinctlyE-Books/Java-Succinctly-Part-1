int var1 = 100, var2 = 30;
boolean ans1 = var1 == var2; // ans1 becomes false, 100 does not equal 30
boolean ans2 = var1 > var2; // ans2 becomes true, 100 is greater than 30
boolean ans3 = var2 <= var1; // ans3 becomes true, 30 is less than or equal to 100
boolean ans4 = var2 != var1; // ans4 becomes true, 30 is not equal 100

int v1 = 100, v2 = 30, v3 = 200;
boolean ans1 = (v1 < v2) || (v3 > v1);	// Using logical OR