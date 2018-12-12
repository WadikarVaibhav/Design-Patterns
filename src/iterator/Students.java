package iterator;

public class Students implements Container {
	public String names[] = {"Vaibhav", "Sangram", "Manisha", "Vishal"};

	private class StudentIterator implements Iterator {
		
		private int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}
	
	@Override
	public Iterator createIterator() {
		return new StudentIterator();
	}
	
}
