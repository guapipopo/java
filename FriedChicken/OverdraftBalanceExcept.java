package FriedChicken;

 class OverdraftBalanceException extends RuntimeException{
	 public OverdraftBalanceException(String msg) {
			super(msg);
}
}