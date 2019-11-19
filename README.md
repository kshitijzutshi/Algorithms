# Algorithms :books:
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ac9748feda1e42b4a6a00ab0e688fa88)](https://www.codacy.com/manual/kshitijzutshi/Algorithms?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=kshitijzutshi/Algorithms&amp;utm_campaign=Badge_Grade)

This repository is dedicated to practice the topics taught in Algorithms Part I and Part II by Princeton University(Coursera)

## Week #1

## Union-Find
‣ Dynamic connectivity <br />
‣ Quick find <br />
‣ Quick union <br />
‣ Improvements <br />
‣ Applications <br />

### Dynamic connectivity
The following image depicts a union find addressing dynamic connectivity: <br />(Image Courtesy : Algorithms Part I course by Robert Sedgewick)

![alt text](https://github.com/kshitijzutshi/Algorithms/blob/master/Unionfind.png)

### Quick find
The First implementation of an algorithm for solving the dynamic connectivity problem, called Quick-find. This is a so called eager algorithm, for solving connectivity problem.

### Quick Union
The second implementation of an algorithm for solving the dynamic connectivity problem, called Quick-union. This is a so called lazy algorithm, for solving connectivity problem.


## Week #5

**Understanding the difference between Binary search tree and balanced binary search tree.**

1. Balanced Binary Search Tree representation

           25             // Level 1
        20    36          // Level 2
      10 22  30 40        // Level 3
  .. .. .. .. .. .. .. 
.. .. .. .. .. .. .. ..   // Level n

2. Binary Search Tree representation

           10           // Level 1
          9  11         // Level 2
         7 . . 20       // Level 3
        8 . . . 15 24   
       6 . . . . . . .  // Level n
Say we need to find the smallest item in the tree.

This would be a search operation.

1) The time complexity in here is O(log n), even in worst case scenario, because the tree is balanced. The minimum value is 10.

2) The time complexity here in the worst case scenario is O(n). The minimum value is 6. You can picture from the representation that the root's left tree (branch) behaves like a linked list. This is because the tree is unbalanced. [1]

Say, we want to create a list of all elements in the tree that are smaller than some value v.

This would be an insertion operation.

1) This would be O(log n), because as the tree is traversed it is balanced so you don't get 2)'s scenario.

2) This would be O(n), because in the worst case scenario your insertion will resemble insertion of a linked list.

**In conclusion: A Balanced Binary Search Tree guarantees O(log n) in all cases of search, insertion and deletion of nodes, where as a typical BST does not.**

### Reference resources

For reference I found the following two links particualrly helpful, as to WHY we need disjoint data structures:

1. HackerEarth Blog Post [**Basics of Disjoint Data Structures**](https://www.hackerearth.com/practice/data-structures/disjoint-data-strutures/basics-of-disjoint-data-structures/tutorial/)
2. Question on Quora regarding application of Disjoint data structures Post [**What are the applications of disjoint set data structure?**](https://www.quora.com/What-are-the-applications-of-disjoint-set-data-structure)


### Quick Guide to master GitHub Markdown

I found this [**link**](https://guides.github.com/features/mastering-markdown/) particularly helpful. If you want to use Emojis in your markdown, check [**this**](https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md) out. :100:

# License

You are free to use this in any way you want, in case you find this useful or working for you but you must keep the copyright notice and license. (Coursera :registered:)
