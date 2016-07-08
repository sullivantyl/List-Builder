// list experimenter, main program

class Main {
	
	public static void main(String[] args) {
		
		List lh = new List();
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int counter = 0;
		while (true) {
			System.out.print("cmd: ");
			String cmd = scn.next();
			if ("put".startsWith(cmd)) {
				// create a new element, with data, and add to list
				ListElt newElt = new ListElt(counter++);
				lh.add(newElt);			
				System.out.println("Added: " + newElt.data);
			} else if ("extend".startsWith(cmd)) {
				ListElt newElt = new ListElt(counter++);
				lh.extend(newElt);
				System.out.println("Added:" + newElt.data + " to tail.");
			} else if ("get".startsWith(cmd)) {
				// retrieve the first element on the list, remove it from list
				if (! lh.isEmpty()) {
					ListElt temp = lh.remove();
					System.out.println("Retrieved: " + temp.data);
				} else {
					System.out.println(" oops, list is empty");
				}	
			} else if ("count".startsWith(cmd)) {
				// report how many elements are in the list
				int num = lh.count();
				System.out.println("Number of elements: " + num);
			} else if ("find".startsWith(cmd)) {
				// look for an element with specified value.
				System.out.print("Find what (int) ? ");
				int what = scn.nextInt();
				ListElt found = lh.find(what);
				if (found == null) {
					System.out.println("no element contains " + what);
				} else {
					System.out.println("found " + what + " at " + found );
				}
			} else if ("show".startsWith(cmd)) {
				// print out the entire list
				lh.show();
			} else if ("quit".startsWith(cmd)) {
				break;
			} else {
				System.out.println("unrec cmd " + cmd
						   + ", try: put get count find show  quit");
			}	
		}
	}
}