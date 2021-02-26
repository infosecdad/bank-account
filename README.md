# bank-account

For the Chapter 3 lab, we are going to create and modify code related to a Bank account.

There will be two source files, app/Account.java and test/AccountTest.java

You need to write the initial code from Fig 3.8 and Fig 3.9 respectively into those files.

Some minor modifications will be needed as they are slightly different than the book (hint: package)

Then you will need to modify both files for the following:

- Modify the Account class to provide a method called `withdraw`, that accepts a double parameter for amount. Ensure that the withdrawal amount can not exceed the current balance before allowing the withdrawal.  If the amount requested is more than the remaining balance, the balance should remain unchanged and a message should be printed indicating that "The withdrawal amount requested exceeded the account balance."  

- Modify the AccountTest class to test the `withdraw` method, for two test scenarios;

     - The withdrawal is less the the balance and will complete, changing the balance.

     - The withdrawal is more than the balance and should generate an error message.

 

The assignment is completed when you have finished and tested the above changes and pushed your code to GitHub for grading.

Remember to push your code you need to "Stage All Changes" -> "Commit Staged Changes" -> "Push"