# intivechallenge

SOLUTION PREVIEW:

![Screenshot 2021-09-28 000316](https://user-images.githubusercontent.com/62064327/135017229-8ddc7619-9225-4309-a866-e17b36d45376.png)

About my solution:

1-Im creating my input.txt with the exact same list as its shown in the challenge example

user1;time1;page_1
user1;time2;page_2
user1;time3;page_3
user1;time4;page_4
user2;time5;page_1
user2;time6;page_2
user2;time7;page_3
user3;time8;page_1
user3;time9;page_5
user3;time10;page_6

2-FileIO Class transform each log from the text file to a list
3-Finder Class take te log list to find triplets
4-Top 10 Class orders and counts triplets



Challenge: 
Coding question - Triplets

Given a log file of user_id, timestamp & page visited find the 10 most common triplets, where a triplet is an occurrence of 3 pages visited sequentially by the same user.
If 2 different users visits the same sequence (eg: "page1,page2,page3") then the triplpet "page1,page2,page3" will gave 2 occurrences



Tips

We are looking to see how the candidate writes code, so they should choose the language they are most familiar with and write code that is readable and maintainable.
If the candidate thinks this is some massively parallel log parsing/analysis problem, tell them it's just for one log file and that they can assume that the data fits in memory. If they try to do the math to figure out how many unique combinations there might be, it's ok (and counts as a bonus for the candidate), but don't let them dwell on this for too long.
We are not looking for them to write a sort algorithm, so if they want to use any off-the-shelf sorting to get the top 10, it is acceptable. They can also create some data structure to keep track of the top 10, and that's also acceptable
Units tests are welcome!

Example

user1;time1;page_1
user1;time2;page_2
user1;time3;page_3
user1;time4;page_4
user2;time5;page_1
user2;time6;page_2
user2;time7;page_3
user3;time8;page_1
user3;time9;page_5
user3;time10;page_6
...

in this case, for "user1", the full activity would be

user1 time1 page_1
user1 time2 page_2
user1 time3 page_3
user1 time4 page_4

then the triplets for user1 would be

page_1,page_2,page_3
page_2,page_3,page_4

Then we continue finding the triplets for the other users.

Now you have to count the occurrences of each triplet for this user

page_1,page_2,page_3 -> 2 (one from user1 and one from user2)
page_1,page_5,page_6 -> 1 




