	public static WebDriver driver;

	public static void main(String[] args) {

	}

	public static void ram() {
		WebElement email = driver.findElement(By.xpath("//p[@class='signup-titel']"));
		email.isDisplayed();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10);
		email.sendKeys("username" + randomInt + "@gmail.com");

		WebElement mobile = driver.findElement(By.xpath("//p[@class='signup-titel']"));
		email.isDisplayed();
		Random numberGenerator = new Random();
		int mobilenumberInt = numberGenerator.nextInt(10);
		email.sendKeys( "Mobile user Name"+ mobilenumberInt);

		WebElement password = driver.findElement(By.xpath("//p[@class='signup-titel']"));
		password.isDisplayed();
		Random passwordGenerator = new Random();
		int passInt = passwordGenerator.nextInt(10);
		email.sendKeys("Enter password" + passInt );

	}
		