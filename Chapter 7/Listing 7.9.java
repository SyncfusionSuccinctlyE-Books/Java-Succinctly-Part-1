int counter = 0;

while(counter < 10) {
	System.out.println("Counter in while: " + counter);
	counter++;
}

do {
	System.out.println("Counter in do ... while: " + counter);
	counter++;
} while(counter < 10);