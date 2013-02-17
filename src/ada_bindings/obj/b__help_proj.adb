pragma Ada_95;
pragma Source_File_Name (help_projmain, Spec_File_Name => "b__help_proj.ads");
pragma Source_File_Name (help_projmain, Body_File_Name => "b__help_proj.adb");

with System.Restrictions;
with Ada.Exceptions;

package body help_projmain is
   pragma Warnings (Off);

   E038 : Short_Integer; pragma Import (Ada, E038, "system__soft_links_E");
   E048 : Short_Integer; pragma Import (Ada, E048, "system__exception_table_E");
   E136 : Short_Integer; pragma Import (Ada, E136, "ada__containers_E");
   E106 : Short_Integer; pragma Import (Ada, E106, "ada__io_exceptions_E");
   E073 : Short_Integer; pragma Import (Ada, E073, "ada__tags_E");
   E090 : Short_Integer; pragma Import (Ada, E090, "ada__streams_E");
   E082 : Short_Integer; pragma Import (Ada, E082, "interfaces__c_E");
   E084 : Short_Integer; pragma Import (Ada, E084, "interfaces__c__strings_E");
   E054 : Short_Integer; pragma Import (Ada, E054, "system__exceptions_E");
   E092 : Short_Integer; pragma Import (Ada, E092, "system__finalization_root_E");
   E089 : Short_Integer; pragma Import (Ada, E089, "ada__finalization_E");
   E122 : Short_Integer; pragma Import (Ada, E122, "system__storage_pools_E");
   E114 : Short_Integer; pragma Import (Ada, E114, "system__finalization_masters_E");
   E128 : Short_Integer; pragma Import (Ada, E128, "system__storage_pools__subpools_E");
   E169 : Short_Integer; pragma Import (Ada, E169, "system__task_info_E");
   E211 : Short_Integer; pragma Import (Ada, E211, "system__task_primitives__interrupt_operations_E");
   E124 : Short_Integer; pragma Import (Ada, E124, "system__pool_global_E");
   E112 : Short_Integer; pragma Import (Ada, E112, "system__file_control_block_E");
   E226 : Short_Integer; pragma Import (Ada, E226, "ada__streams__stream_io_E");
   E105 : Short_Integer; pragma Import (Ada, E105, "system__file_io_E");
   E042 : Short_Integer; pragma Import (Ada, E042, "system__secondary_stack_E");
   E109 : Short_Integer; pragma Import (Ada, E109, "system__os_lib_E");
   E224 : Short_Integer; pragma Import (Ada, E224, "system__strings__stream_ops_E");
   E191 : Short_Integer; pragma Import (Ada, E191, "system__tasking__initialization_E");
   E199 : Short_Integer; pragma Import (Ada, E199, "system__tasking__protected_objects_E");
   E146 : Short_Integer; pragma Import (Ada, E146, "ada__real_time_E");
   E100 : Short_Integer; pragma Import (Ada, E100, "ada__text_io_E");
   E203 : Short_Integer; pragma Import (Ada, E203, "system__tasking__protected_objects__entries_E");
   E197 : Short_Integer; pragma Import (Ada, E197, "system__tasking__queuing_E");
   E219 : Short_Integer; pragma Import (Ada, E219, "system__tasking__stages_E");
   E209 : Short_Integer; pragma Import (Ada, E209, "system__interrupt_management__operations_E");
   E144 : Short_Integer; pragma Import (Ada, E144, "system__interrupts_E");
   E140 : Short_Integer; pragma Import (Ada, E140, "interfaces__java__jni_E");
   E094 : Short_Integer; pragma Import (Ada, E094, "ajis__internal_E");
   E129 : Short_Integer; pragma Import (Ada, E129, "ajis__java_E");
   E028 : Short_Integer; pragma Import (Ada, E028, "help_E");
   E096 : Short_Integer; pragma Import (Ada, E096, "ajis__internal__java_E");
   E012 : Short_Integer; pragma Import (Ada, E012, "jni_binding_E");
   E002 : Short_Integer; pragma Import (Ada, E002, "jni_binding__ada2java_jni_E");
   E014 : Short_Integer; pragma Import (Ada, E014, "jni_binding__ada2java_jni__library_jni_E");
   E004 : Short_Integer; pragma Import (Ada, E004, "jni_binding__ada_jni_E");
   E024 : Short_Integer; pragma Import (Ada, E024, "jni_binding__ada_jni__exceptions_jni_E");
   E022 : Short_Integer; pragma Import (Ada, E022, "jni_binding__ada_jni__exceptions_jni__exception_occurrence_jni_E");
   E026 : Short_Integer; pragma Import (Ada, E026, "jni_binding__standard_jni_E");
   E020 : Short_Integer; pragma Import (Ada, E020, "jni_binding__help_jni_E");
   E010 : Short_Integer; pragma Import (Ada, E010, "jni_binding__help_jni__help_package_jni_E");
   E018 : Short_Integer; pragma Import (Ada, E018, "jni_binding__standard_jni__adastring_jni_E");
   E008 : Short_Integer; pragma Import (Ada, E008, "jni_binding__standard_jni__constraint_error_jni_E");
   E006 : Short_Integer; pragma Import (Ada, E006, "jni_binding__standard_jni__program_error_jni_E");
   E016 : Short_Integer; pragma Import (Ada, E016, "jni_binding__standard_jni__storage_error_jni_E");

   Local_Priority_Specific_Dispatching : constant String := "";
   Local_Interrupt_States : constant String := "nnnnsnsssnns";

   Is_Elaborated : Boolean := False;

   procedure finalize_library is
   begin
      E096 := E096 - 1;
      declare
         procedure F1;
         pragma Import (Ada, F1, "ajis__internal__java__finalize_spec");
      begin
         if E096 = 0 then
            F1;
         end if;
      end;
      E144 := E144 - 1;
      declare
         procedure F2;
         pragma Import (Ada, F2, "system__interrupts__finalize_spec");
      begin
         if E144 = 0 then
            F2;
         end if;
      end;
      E203 := E203 - 1;
      declare
         procedure F3;
         pragma Import (Ada, F3, "system__tasking__protected_objects__entries__finalize_spec");
      begin
         if E203 = 0 then
            F3;
         end if;
      end;
      E100 := E100 - 1;
      declare
         procedure F4;
         pragma Import (Ada, F4, "ada__text_io__finalize_spec");
      begin
         if E100 = 0 then
            F4;
         end if;
      end;
      declare
         procedure F5;
         pragma Import (Ada, F5, "system__file_io__finalize_body");
      begin
         E105 := E105 - 1;
         if E105 = 0 then
            F5;
         end if;
      end;
      E114 := E114 - 1;
      E128 := E128 - 1;
      E226 := E226 - 1;
      declare
         procedure F6;
         pragma Import (Ada, F6, "ada__streams__stream_io__finalize_spec");
      begin
         if E226 = 0 then
            F6;
         end if;
      end;
      declare
         procedure F7;
         pragma Import (Ada, F7, "system__file_control_block__finalize_spec");
      begin
         E112 := E112 - 1;
         if E112 = 0 then
            F7;
         end if;
      end;
      E124 := E124 - 1;
      declare
         procedure F8;
         pragma Import (Ada, F8, "system__pool_global__finalize_spec");
      begin
         if E124 = 0 then
            F8;
         end if;
      end;
      declare
         procedure F9;
         pragma Import (Ada, F9, "system__storage_pools__subpools__finalize_spec");
      begin
         if E128 = 0 then
            F9;
         end if;
      end;
      declare
         procedure F10;
         pragma Import (Ada, F10, "system__finalization_masters__finalize_spec");
      begin
         if E114 = 0 then
            F10;
         end if;
      end;
      declare
         procedure Reraise_Library_Exception_If_Any;
            pragma Import (Ada, Reraise_Library_Exception_If_Any, "__gnat_reraise_library_exception_if_any");
      begin
         Reraise_Library_Exception_If_Any;
      end;
   end finalize_library;

   procedure help_projfinal is
   begin
      if not Is_Elaborated then
         return;
      end if;
      Is_Elaborated := False;
      finalize_library;
   end help_projfinal;

   type No_Param_Proc is access procedure;

   procedure help_projinit is
      Main_Priority : Integer;
      pragma Import (C, Main_Priority, "__gl_main_priority");
      Time_Slice_Value : Integer;
      pragma Import (C, Time_Slice_Value, "__gl_time_slice_val");
      WC_Encoding : Character;
      pragma Import (C, WC_Encoding, "__gl_wc_encoding");
      Locking_Policy : Character;
      pragma Import (C, Locking_Policy, "__gl_locking_policy");
      Queuing_Policy : Character;
      pragma Import (C, Queuing_Policy, "__gl_queuing_policy");
      Task_Dispatching_Policy : Character;
      pragma Import (C, Task_Dispatching_Policy, "__gl_task_dispatching_policy");
      Priority_Specific_Dispatching : System.Address;
      pragma Import (C, Priority_Specific_Dispatching, "__gl_priority_specific_dispatching");
      Num_Specific_Dispatching : Integer;
      pragma Import (C, Num_Specific_Dispatching, "__gl_num_specific_dispatching");
      Main_CPU : Integer;
      pragma Import (C, Main_CPU, "__gl_main_cpu");
      Interrupt_States : System.Address;
      pragma Import (C, Interrupt_States, "__gl_interrupt_states");
      Num_Interrupt_States : Integer;
      pragma Import (C, Num_Interrupt_States, "__gl_num_interrupt_states");
      Unreserve_All_Interrupts : Integer;
      pragma Import (C, Unreserve_All_Interrupts, "__gl_unreserve_all_interrupts");
      Zero_Cost_Exceptions : Integer;
      pragma Import (C, Zero_Cost_Exceptions, "__gl_zero_cost_exceptions");
      Detect_Blocking : Integer;
      pragma Import (C, Detect_Blocking, "__gl_detect_blocking");
      Default_Stack_Size : Integer;
      pragma Import (C, Default_Stack_Size, "__gl_default_stack_size");
      Leap_Seconds_Support : Integer;
      pragma Import (C, Leap_Seconds_Support, "__gl_leap_seconds_support");

      procedure Install_Handler;
      pragma Import (C, Install_Handler, "__gnat_install_handler");

      Handler_Installed : Integer;
      pragma Import (C, Handler_Installed, "__gnat_handler_installed");

      Finalize_Library_Objects : No_Param_Proc;
      pragma Import (C, Finalize_Library_Objects, "__gnat_finalize_library_objects");
   begin
      if Is_Elaborated then
         return;
      end if;
      Is_Elaborated := True;
      Main_Priority := -1;
      Time_Slice_Value := -1;
      WC_Encoding := 'b';
      Locking_Policy := ' ';
      Queuing_Policy := ' ';
      Task_Dispatching_Policy := ' ';
      System.Restrictions.Run_Time_Restrictions :=
        (Set =>
          (False, False, False, False, False, False, False, False, 
           False, False, False, False, False, False, False, False, 
           False, False, False, False, False, False, False, False, 
           False, False, False, False, False, False, False, False, 
           False, False, False, False, False, False, False, False, 
           False, False, False, False, False, False, False, False, 
           False, False, False, False, False, False, False, False, 
           False, False, False, False, False, False, False, False, 
           False, False, False, True, False, False, False, False, 
           False, False, False, False, False, False),
         Value => (0, 0, 0, 0, 0, 0, 0),
         Violated =>
          (False, False, True, True, True, False, False, False, 
           False, False, True, True, True, False, False, True, 
           True, False, True, True, False, True, True, True, 
           True, True, True, False, True, True, False, True, 
           False, False, True, False, False, True, False, False, 
           False, True, True, False, True, False, True, True, 
           False, False, False, True, False, True, True, True, 
           False, False, True, False, False, True, False, True, 
           True, False, True, True, True, False, True, False, 
           True, True, True, False, False, False),
         Count => (0, 9, 10, 1, 0, 0, 0),
         Unknown => (False, False, False, True, False, False, False));
      Priority_Specific_Dispatching :=
        Local_Priority_Specific_Dispatching'Address;
      Num_Specific_Dispatching := 0;
      Main_CPU := -1;
      Interrupt_States := Local_Interrupt_States'Address;
      Num_Interrupt_States := 12;
      Unreserve_All_Interrupts := 0;
      Zero_Cost_Exceptions := 1;
      Detect_Blocking := 0;
      Default_Stack_Size := -1;
      Leap_Seconds_Support := 0;

      if Handler_Installed = 0 then
         Install_Handler;
      end if;

      if E038 = 0 then
         System.Soft_Links'Elab_Spec;
      end if;
      if E048 = 0 then
         System.Exception_Table'Elab_Body;
      end if;
      E048 := E048 + 1;
      if E136 = 0 then
         Ada.Containers'Elab_Spec;
      end if;
      E136 := E136 + 1;
      if E106 = 0 then
         Ada.Io_Exceptions'Elab_Spec;
      end if;
      E106 := E106 + 1;
      if E073 = 0 then
         Ada.Tags'Elab_Spec;
      end if;
      if E090 = 0 then
         Ada.Streams'Elab_Spec;
      end if;
      E090 := E090 + 1;
      if E082 = 0 then
         Interfaces.C'Elab_Spec;
      end if;
      if E084 = 0 then
         Interfaces.C.Strings'Elab_Spec;
      end if;
      if E054 = 0 then
         System.Exceptions'Elab_Spec;
      end if;
      E054 := E054 + 1;
      if E092 = 0 then
         System.Finalization_Root'Elab_Spec;
      end if;
      E092 := E092 + 1;
      if E089 = 0 then
         Ada.Finalization'Elab_Spec;
      end if;
      E089 := E089 + 1;
      if E122 = 0 then
         System.Storage_Pools'Elab_Spec;
      end if;
      E122 := E122 + 1;
      if E114 = 0 then
         System.Finalization_Masters'Elab_Spec;
      end if;
      if E128 = 0 then
         System.Storage_Pools.Subpools'Elab_Spec;
      end if;
      if E169 = 0 then
         System.Task_Info'Elab_Spec;
      end if;
      E169 := E169 + 1;
      if E211 = 0 then
         System.Task_Primitives.Interrupt_Operations'Elab_Body;
      end if;
      E211 := E211 + 1;
      if E124 = 0 then
         System.Pool_Global'Elab_Spec;
      end if;
      E124 := E124 + 1;
      if E112 = 0 then
         System.File_Control_Block'Elab_Spec;
      end if;
      E112 := E112 + 1;
      if E226 = 0 then
         Ada.Streams.Stream_Io'Elab_Spec;
      end if;
      E226 := E226 + 1;
      E128 := E128 + 1;
      if E114 = 0 then
         System.Finalization_Masters'Elab_Body;
      end if;
      E114 := E114 + 1;
      E084 := E084 + 1;
      E082 := E082 + 1;
      if E073 = 0 then
         Ada.Tags'Elab_Body;
      end if;
      E073 := E073 + 1;
      if E038 = 0 then
         System.Soft_Links'Elab_Body;
      end if;
      E038 := E038 + 1;
      if E042 = 0 then
         System.Secondary_Stack'Elab_Body;
      end if;
      E042 := E042 + 1;
      if E109 = 0 then
         System.Os_Lib'Elab_Body;
      end if;
      E109 := E109 + 1;
      if E105 = 0 then
         System.File_Io'Elab_Body;
      end if;
      E105 := E105 + 1;
      if E224 = 0 then
         System.Strings.Stream_Ops'Elab_Body;
      end if;
      E224 := E224 + 1;
      if E191 = 0 then
         System.Tasking.Initialization'Elab_Body;
      end if;
      E191 := E191 + 1;
      if E199 = 0 then
         System.Tasking.Protected_Objects'Elab_Body;
      end if;
      E199 := E199 + 1;
      if E146 = 0 then
         Ada.Real_Time'Elab_Spec;
      end if;
      if E146 = 0 then
         Ada.Real_Time'Elab_Body;
      end if;
      E146 := E146 + 1;
      if E100 = 0 then
         Ada.Text_Io'Elab_Spec;
      end if;
      if E100 = 0 then
         Ada.Text_Io'Elab_Body;
      end if;
      E100 := E100 + 1;
      if E203 = 0 then
         System.Tasking.Protected_Objects.Entries'Elab_Spec;
      end if;
      E203 := E203 + 1;
      if E197 = 0 then
         System.Tasking.Queuing'Elab_Body;
      end if;
      E197 := E197 + 1;
      if E219 = 0 then
         System.Tasking.Stages'Elab_Body;
      end if;
      E219 := E219 + 1;
      if E209 = 0 then
         System.Interrupt_Management.Operations'Elab_Body;
      end if;
      E209 := E209 + 1;
      if E144 = 0 then
         System.Interrupts'Elab_Spec;
      end if;
      if E144 = 0 then
         System.Interrupts'Elab_Body;
      end if;
      E144 := E144 + 1;
      if E140 = 0 then
         Interfaces.Java.Jni'Elab_Spec;
      end if;
      E140 := E140 + 1;
      if E094 = 0 then
         AJIS.INTERNAL'ELAB_SPEC;
      end if;
      E094 := E094 + 1;
      if E129 = 0 then
         AJIS.JAVA'ELAB_SPEC;
      end if;
      E129 := E129 + 1;
      E028 := E028 + 1;
      if E096 = 0 then
         AJIS.INTERNAL.JAVA'ELAB_SPEC;
      end if;
      if E096 = 0 then
         AJIS.INTERNAL.JAVA'ELAB_BODY;
      end if;
      E096 := E096 + 1;
      E012 := E012 + 1;
      E002 := E002 + 1;
      E004 := E004 + 1;
      if E024 = 0 then
         Jni_Binding.Ada_Jni.Exceptions_Jni'Elab_Spec;
      end if;
      E024 := E024 + 1;
      if E022 = 0 then
         Jni_Binding.Ada_Jni.Exceptions_Jni.Exception_Occurrence_Jni'Elab_Spec;
      end if;
      E022 := E022 + 1;
      if E026 = 0 then
         Jni_Binding.Standard_Jni'Elab_Body;
      end if;
      E026 := E026 + 1;
      E020 := E020 + 1;
      E010 := E010 + 1;
      if E018 = 0 then
         Jni_Binding.Standard_Jni.Adastring_Jni'Elab_Spec;
      end if;
      E018 := E018 + 1;
      if E008 = 0 then
         Jni_Binding.Standard_Jni.Constraint_Error_Jni'Elab_Body;
      end if;
      E008 := E008 + 1;
      if E006 = 0 then
         Jni_Binding.Standard_Jni.Program_Error_Jni'Elab_Body;
      end if;
      E006 := E006 + 1;
      if E016 = 0 then
         Jni_Binding.Standard_Jni.Storage_Error_Jni'Elab_Body;
      end if;
      E016 := E016 + 1;
      E014 := E014 + 1;
   end help_projinit;

--  BEGIN Object file/option list
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/help.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-ada2java_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-ada_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-ada_jni-exceptions_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-ada_jni-exceptions_jni-exception_occurrence_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-standard_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-help_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-help_jni-help_package_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-standard_jni-adastring_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-standard_jni-constraint_error_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-standard_jni-program_error_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-standard_jni-storage_error_jni.o
   --   /home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/jni_binding-ada2java_jni-library_jni.o
   --   -L/home/krzysiek/ada_projekty/WindaToAda/src/ada_bindings/obj/
   --   -L/home/krzysiek/gnat/lib/ajis/relocatable/
   --   -L/home/krzysiek/gnat/lib/gnatjni/relocatable/
   --   -L/home/krzysiek/gnat/lib/gcc/i686-pc-linux-gnu/4.5.4/adalib/
   --   -static
   --   -lgnarl
   --   -lgnat
   --   -lpthread
--  END Object file/option list   

end help_projmain;
