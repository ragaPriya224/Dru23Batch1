how to approach the collections concept in java

1. LIST, SET STRUCTURE MUGUP (ignore version, just remember the parent, child, which is class, interface )

2. imp point: duplicate allowable? insertion order maintainable?

3.try using common methods in arraylist, linkedlist, hashset, linkedhashset, treeset

add, addAll, clear, contains, isEmpty, remove, size

4.**arraylist**  -> dup ok

order ok

heterogenous data allowed

null insertion possible

and then explore specific methods: bcoz arraylist ds is growable array

so explore:

add, addAll,  remove,  get,indexOf, lastIndexof, set-> replace 

5. **linkedlist**

dup ok

order ok 

heterogenous data allowed

null insertion possible


 specific METHoDS bcoz underlying ds is doubled linked list 
 
	addFirst(E e)
  
  addLast(E e)
  
getFirst

getLast

removeFirst

removeLast

6. **difference between arraylist and linkedlist**, as we have completed both the topics completely

     ArrayList                	linkedList
     
best    retrieval	    	       insertion,deletion

worst   insesrtion/deletion      retrieval 



**7. normal overview of SET:**

child interface of collection

dup no

ins order not maintained

no specific methods

explore hashset with common methods such as add, addAll, clear, contains, isEmpty, remove, size

and also note, how the datas are stored(their insertion order) and whether duplicates are allowed 

explore linked hashset with common methods such as add, addAll, clear, contains, isEmpty, remove, size

and also note, how the datas are stored(their insertion order) and whether duplicates are allowed 




8. then we have to explore treeset, which is implementation class of sortedset and navigable set

in **treeset** object, try checking whether dup allowed, insertion order, null allowed, hetero datas allowed. 

explore special methods such as: 

first()

last()

headSet()

tailSet()

subset()

-----------------------------------------------------------------------------------------------------------------------------------------



