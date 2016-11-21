Feature: Checkout
In order to produce operation of two numbers
As a RPN Functionality
I should be able to get the sum of two numbers using check out

Scenario: Perform add on two numbers

Given Numbers are 3 and 6 and operation is add+
When I hit calculate
Then the total sum should be 9

Scenario: Perform difference on two numbers

Given Numbers are 30 and 6 and operation is sub-
When I hit calculate
Then the total sum should be 21

Scenario: Perform multiplication on two numbers

Given Numbers are 3 and 6 and operation is mul*
When I hit calculate
Then the total sum should be 18
