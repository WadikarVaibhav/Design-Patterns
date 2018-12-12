package builder;

public class LunchOrder {
	
	private final String bread;
	private final String curry;
	private final String meat;
	private final String salt;
	
	public static class Builder {
		
		private String bread;
		private String curry;
		private String meat;
		private String salt;
		
		public Builder() {
			
		}
		
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public Builder curry(String curry) {
			this.curry = curry;
			return this;
		}
		
		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
		public Builder salt(String salt) {
			this.salt = salt;
			return this;
		}
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
	}
	
	public LunchOrder(Builder builder) {
		 this.bread = builder.bread;
		 this.salt = builder.salt;
		 this.meat = builder.meat;
		 this.curry = builder.curry;
	}

	public String getBread() {
		return bread;
	}

	public String getCurry() {
		return curry;
	}

	public String getMeat() {
		return meat;
	}

	public String getSalt() {
		return salt;
	}

}
