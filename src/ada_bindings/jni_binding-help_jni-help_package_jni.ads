-------------------------------------------------------------------------------
-- This file has been automatically generated by                             --
--    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2012 (20120509))          --
-- Original Ada unit: Help                                                   --
-- Generation timestamp: 201302171701                                        --
-------------------------------------------------------------------------------

pragma Warnings (Off);
pragma Style_Checks ("NM32766");

with Interfaces.Java.JNI;
with AJIS;
with AJIS.Internal;
with AJIS.Java;
with AJIS.Internal.Java;
with Ada.Characters.Conversions;
with Ada.Finalization;
with Help; use Help;

package JNI_Binding.Help_JNI.Help_Package_JNI is 

   procedure JNI_For_Body_Elaboration;

   procedure Initialize_Unit_JNI (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access);

   function Id_JNI_40 (A : Standard.Integer; B : Standard.Integer) return Standard.Integer;

   function Sum_Id_JNI_39 (Id_JNI_1 : Interfaces.Java.JNI.JNI_Env_Access; Id_JNI_3 : Interfaces.Java.JNI.J_Class; A : Interfaces.Java.JNI.J_Int; B : Interfaces.Java.JNI.J_Int) return Interfaces.Java.JNI.J_Int;
   pragma Export (C, Sum_Id_JNI_39, "Java_Help_Help_1Package_Sum_1Id_1JNI_139__II");

end JNI_Binding.Help_JNI.Help_Package_JNI;
