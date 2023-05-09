SET:

child interface of collectio 

dup no

ins order not maintained

no specific methods

underlying: hashtable

(not necessary to understand indepth as of now, just see overview : https://www.youtube.com/watch?v=shs0KM3wKv8  )

freq operation: search

null ok

hetero data

constructors: https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html

Load Factor -> After loading how much factor, a new hashset object will be created. That is called as load factor

---------------------------------------------------
**LINKED HASH SET**

1.When to go -> ????    When insertion order is preserved

Underlying DS: hashtable +linkedlist

version ->1.4version 

----------------------

	          Hashset		      ||           LinkedHashSet
            
  dup                  no 		    	||             no 
 
  insorder            no            ||             yes preserved 
  
  DS                hashtable       ||         hashtable +linkedList

---------------------------------------------------------


**sortedSET**


sorted set

child interface of set

represent group of individual according to some sorting order 

duplicate -> no

method specific:

first()

last()

headSet()
tailSet()

subset()
------------


Treeset

ds: balanced tree

dup no

ins order no

sorting order ok

heterogenous no 

null is possible, only once 

4 constructor


TASKS:


HASHMAP:
--------
    Write a program to initialize a HashMap in java ?
    
    Write a program to add elements to the HashMap given the key and value data type is String?Hint: create a map with superhero id and superheronames
    
    Write a program to get size of HashMap?(USE READYMADE METHODS)
    
    How to check if HashMap is empty?

    
    ------------------------------------------------
    https://www.youtube.com/watch?v=CojCE-ojdGY
    
    https://www.interviewbit.com/java-string-interview-questions/#in-what-way-should-two-strings-be-compared-to-determine-whether-they-are-anagrams
