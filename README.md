WindaToAda
==========

WindaProject(Ada+Java(Swing))


Budowanie projektu:
-------------------

* ada2java help.ads -o ada_bindings -L help_proj (kompiluje Adę, generuje interfejs javowy i w cholerę plików pomocniczych)
* javac Help/Help_Package.java (kompiluje wygenerowany interfejs javowy)
* gprbuild -p -P ada_bindings/help_proj.gpr (tworzy bibliotekę - po zakończeniu działania powinna się pojawić w folderze lib, bodajże libhello_proj.o) 
* export LD_LIBRARY_PATH=./ada_bindings/lib:$LD_LIBRARY_PATH (mówi systemowi, że ma szukać bibliotek również w folderze lib)
* javac Test.java (kompilacja Swinga)
* java Test (uruchomienie Swinga)
