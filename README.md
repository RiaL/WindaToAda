WindaToAda
==========

WindaProject(Ada+Java(Swing))


Budowanie projektu:
-------------------

* ada2java hello.ads -L hello_proj (kompiluje Adę, generuje interfejs javowy i w cholerę plików pomocniczych)
* javac Hello/Hello_Package.java (kompiluje wygenerowany interfejs javowy)
* gprbuild -p -P hello_proj.gpr (tworzy bibliotekę - po zakończeniu działania powinna się pojawić w folderze lib, bodajże libhello_proj.o) 
* export LD_LIBRARY_PATH=./lib:$LD_LIBRARY_PATH (mówi systemowi, że ma szukać bibliotek również w folderze lib)
* javac Test.java (kompilacja Swinga)
* java Test (uruchomienie Swinga)
