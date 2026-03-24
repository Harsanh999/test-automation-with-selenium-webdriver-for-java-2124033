from selenium import webdriver
from selenium.webdriver.common.by import By

# Create a new Chrome browser instance
driver = webdriver.Chrome()

# Open a webpage
driver.get("https://www.example.com")

# Example: Find an element and print its text
element = driver.find_element(By.TAG_NAME, "h1")
print(element.text)

# Close the browser
driver.quit()
