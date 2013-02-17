WindaToAda
==========

WindaProject(Ada+Java(Swing))


Budowanie części w Adzie:
-------------------

* ada2java help.ads -o ada_bindings -L help_proj (kompiluje Adę, generuje interfejs javowy i w cholerę plików pomocniczych)
* gprbuild -p -P ada_bindings/help_proj.gpr (tworzy bibliotekę - po zakończeniu działania powinna się pojawić w folderze lib, bodajże libhello_proj.o) 
* kompilacja i uruchamianie klas javowych będzie zrobiona w Netbeansie
