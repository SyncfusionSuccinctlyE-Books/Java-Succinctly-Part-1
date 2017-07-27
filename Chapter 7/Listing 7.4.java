int i = 25;
if(i % 2 == 0) {
	System.out.println("i is even");
}
else if(i % 3 == 0) {
	System.out.println("i is odd, but divisible by 3");
}
else if(i % 5 == 0) {
	System.out.println("i is divisible by 5");
}
else {
	System.out.println("i is not divisible by 2, 3 or 5");
}