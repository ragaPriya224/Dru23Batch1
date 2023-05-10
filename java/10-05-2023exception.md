
-------------------------------EXCEPTION --------------

Throwable class -> root for java exception hierarchy

exception: in most cases, exception are caused by our program and these are recoverable

Eg: read data from a remote file @ london file @runtime ,if file not there, file not found exception suppose file not found exception, then we can provide a local file and we can continue the program normally

ERROR:
caused due to lack of resources -- Eg: out of memory error mostly not caused by our programs, these are non recoverable

exceptions that are checked by compiler for smooth execution of program @ runtime Eg: filenotfound exception, interrupted exception

exceptions that are not checked by compiler @runttime Eg: arithmetic exception

FULLY CHECKED EXCEPTION: if and only if all it's child classes are chcked. eg: io exception 

PARTIALLY CHECKED EXCEPTION : if all it's child classes are unchecked . eg: exception , throwable 
