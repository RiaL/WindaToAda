pragma Ada_95;
with System;
package help_projmain is
   pragma Warnings (Off);

   procedure help_projinit;
   pragma Export (C, help_projinit, "help_projinit");

   procedure help_projfinal;
   pragma Export (C, help_projfinal, "help_projfinal");

   type Version_32 is mod 2 ** 32;
   u00001 : constant Version_32 := 16#7056b983#;
   pragma Export (C, u00001, "jni_binding__ada2java_jniB");
   u00002 : constant Version_32 := 16#f33ec121#;
   pragma Export (C, u00002, "jni_binding__ada2java_jniS");
   u00003 : constant Version_32 := 16#5dcae96e#;
   pragma Export (C, u00003, "jni_binding__ada_jniB");
   u00004 : constant Version_32 := 16#9e0bded6#;
   pragma Export (C, u00004, "jni_binding__ada_jniS");
   u00005 : constant Version_32 := 16#8ae1b54d#;
   pragma Export (C, u00005, "jni_binding__standard_jni__program_error_jniB");
   u00006 : constant Version_32 := 16#7aabd979#;
   pragma Export (C, u00006, "jni_binding__standard_jni__program_error_jniS");
   u00007 : constant Version_32 := 16#31663a8a#;
   pragma Export (C, u00007, "jni_binding__standard_jni__constraint_error_jniB");
   u00008 : constant Version_32 := 16#19d332a7#;
   pragma Export (C, u00008, "jni_binding__standard_jni__constraint_error_jniS");
   u00009 : constant Version_32 := 16#2412b7ba#;
   pragma Export (C, u00009, "jni_binding__help_jni__help_package_jniB");
   u00010 : constant Version_32 := 16#02289e7e#;
   pragma Export (C, u00010, "jni_binding__help_jni__help_package_jniS");
   u00011 : constant Version_32 := 16#526fc19c#;
   pragma Export (C, u00011, "jni_bindingB");
   u00012 : constant Version_32 := 16#f738ef9f#;
   pragma Export (C, u00012, "jni_bindingS");
   u00013 : constant Version_32 := 16#a6ba351b#;
   pragma Export (C, u00013, "jni_binding__ada2java_jni__library_jniB");
   u00014 : constant Version_32 := 16#d794545f#;
   pragma Export (C, u00014, "jni_binding__ada2java_jni__library_jniS");
   u00015 : constant Version_32 := 16#a4d05d81#;
   pragma Export (C, u00015, "jni_binding__standard_jni__storage_error_jniB");
   u00016 : constant Version_32 := 16#2f11f4d4#;
   pragma Export (C, u00016, "jni_binding__standard_jni__storage_error_jniS");
   u00017 : constant Version_32 := 16#38ed9fec#;
   pragma Export (C, u00017, "jni_binding__standard_jni__adastring_jniB");
   u00018 : constant Version_32 := 16#da2cc0b0#;
   pragma Export (C, u00018, "jni_binding__standard_jni__adastring_jniS");
   u00019 : constant Version_32 := 16#6196ca4b#;
   pragma Export (C, u00019, "jni_binding__help_jniB");
   u00020 : constant Version_32 := 16#3e62554f#;
   pragma Export (C, u00020, "jni_binding__help_jniS");
   u00021 : constant Version_32 := 16#c75a699b#;
   pragma Export (C, u00021, "jni_binding__ada_jni__exceptions_jni__exception_occurrence_jniB");
   u00022 : constant Version_32 := 16#b5b03fc0#;
   pragma Export (C, u00022, "jni_binding__ada_jni__exceptions_jni__exception_occurrence_jniS");
   u00023 : constant Version_32 := 16#b357ad49#;
   pragma Export (C, u00023, "jni_binding__ada_jni__exceptions_jniB");
   u00024 : constant Version_32 := 16#bd603d69#;
   pragma Export (C, u00024, "jni_binding__ada_jni__exceptions_jniS");
   u00025 : constant Version_32 := 16#2c6c5469#;
   pragma Export (C, u00025, "jni_binding__standard_jniB");
   u00026 : constant Version_32 := 16#944d4797#;
   pragma Export (C, u00026, "jni_binding__standard_jniS");
   u00027 : constant Version_32 := 16#8d2a65f1#;
   pragma Export (C, u00027, "helpB");
   u00028 : constant Version_32 := 16#fa0da843#;
   pragma Export (C, u00028, "helpS");
   --  BEGIN ELABORATION ORDER
   --  ada%s
   --  ada.characters%s
   --  ada.characters.conversions%s
   --  ada.environment_variables%s
   --  interfaces%s
   --  system%s
   --  system.address_operations%s
   --  system.address_operations%b
   --  system.arith_64%s
   --  system.case_util%s
   --  system.case_util%b
   --  system.htable%s
   --  system.img_bool%s
   --  system.img_bool%b
   --  system.img_enum_new%s
   --  system.img_enum_new%b
   --  system.img_int%s
   --  system.img_int%b
   --  system.io%s
   --  system.io%b
   --  system.linux%s
   --  system.multiprocessors%s
   --  system.os_primitives%s
   --  system.os_primitives%b
   --  system.parameters%s
   --  system.parameters%b
   --  system.crtl%s
   --  interfaces.c_streams%s
   --  interfaces.c_streams%b
   --  system.restrictions%s
   --  system.restrictions%b
   --  system.standard_library%s
   --  system.exceptions_debug%s
   --  system.exceptions_debug%b
   --  system.storage_elements%s
   --  system.storage_elements%b
   --  system.stack_checking%s
   --  system.stack_checking%b
   --  system.stack_checking.operations%s
   --  system.stack_usage%s
   --  system.stack_usage%b
   --  system.string_hash%s
   --  system.string_hash%b
   --  system.htable%b
   --  system.strings%s
   --  system.strings%b
   --  system.traceback_entries%s
   --  system.traceback_entries%b
   --  ada.exceptions%s
   --  system.arith_64%b
   --  ada.exceptions.is_null_occurrence%s
   --  ada.exceptions.is_null_occurrence%b
   --  system.soft_links%s
   --  system.stack_checking.operations%b
   --  system.traces%s
   --  system.traces%b
   --  system.unsigned_types%s
   --  system.img_uns%s
   --  system.img_uns%b
   --  system.val_uns%s
   --  system.val_util%s
   --  system.val_util%b
   --  system.val_uns%b
   --  system.wch_con%s
   --  system.wch_con%b
   --  system.wch_cnv%s
   --  system.wch_jis%s
   --  system.wch_jis%b
   --  system.wch_cnv%b
   --  system.wch_stw%s
   --  system.wch_stw%b
   --  ada.exceptions.last_chance_handler%s
   --  ada.exceptions.last_chance_handler%b
   --  interfaces.java%s
   --  system.address_image%s
   --  system.bit_ops%s
   --  system.bit_ops%b
   --  system.compare_array_unsigned_8%s
   --  system.compare_array_unsigned_8%b
   --  system.concat_2%s
   --  system.concat_2%b
   --  system.concat_3%s
   --  system.concat_3%b
   --  system.concat_4%s
   --  system.concat_4%b
   --  system.concat_5%s
   --  system.concat_5%b
   --  system.concat_6%s
   --  system.concat_6%b
   --  system.exception_table%s
   --  system.exception_table%b
   --  ada.containers%s
   --  ada.containers.red_black_trees%s
   --  ada.io_exceptions%s
   --  ada.tags%s
   --  ada.streams%s
   --  interfaces.c%s
   --  system.multiprocessors%b
   --  interfaces.c.strings%s
   --  system.crtl.runtime%s
   --  system.exceptions%s
   --  system.exceptions%b
   --  system.finalization_root%s
   --  system.finalization_root%b
   --  ada.finalization%s
   --  ada.finalization%b
   --  system.os_constants%s
   --  system.os_interface%s
   --  system.os_interface%b
   --  system.interrupt_management%s
   --  system.storage_pools%s
   --  system.storage_pools%b
   --  system.finalization_masters%s
   --  system.storage_pools.subpools%s
   --  system.stream_attributes%s
   --  system.stream_attributes%b
   --  system.task_info%s
   --  system.task_info%b
   --  system.task_primitives%s
   --  system.interrupt_management%b
   --  system.tasking%s
   --  ada.task_identification%s
   --  system.task_primitives.interrupt_operations%s
   --  system.task_primitives.interrupt_operations%b
   --  system.task_primitives.operations%s
   --  system.tasking%b
   --  system.tasking.debug%s
   --  system.tasking.debug%b
   --  system.task_primitives.operations%b
   --  system.traces.tasking%s
   --  system.traces.tasking%b
   --  system.communication%s
   --  system.communication%b
   --  system.memory%s
   --  system.memory%b
   --  system.standard_library%b
   --  system.pool_global%s
   --  system.pool_global%b
   --  system.file_control_block%s
   --  ada.streams.stream_io%s
   --  system.file_io%s
   --  ada.streams.stream_io%b
   --  system.secondary_stack%s
   --  system.storage_pools.subpools%b
   --  system.finalization_masters%b
   --  interfaces.c.strings%b
   --  interfaces.c%b
   --  ada.tags%b
   --  system.soft_links%b
   --  ada.environment_variables%b
   --  ada.characters.conversions%b
   --  system.secondary_stack%b
   --  system.address_image%b
   --  system.os_lib%s
   --  system.os_lib%b
   --  system.file_io%b
   --  system.soft_links.tasking%s
   --  system.soft_links.tasking%b
   --  system.strings.stream_ops%s
   --  system.strings.stream_ops%b
   --  system.tasking.entry_calls%s
   --  system.tasking.initialization%s
   --  system.tasking.initialization%b
   --  system.tasking.protected_objects%s
   --  system.tasking.protected_objects%b
   --  system.tasking.utilities%s
   --  ada.task_identification%b
   --  system.traceback%s
   --  ada.exceptions%b
   --  system.traceback%b
   --  ada.real_time%s
   --  ada.real_time%b
   --  ada.text_io%s
   --  ada.text_io%b
   --  system.tasking.protected_objects.entries%s
   --  system.tasking.protected_objects.entries%b
   --  system.tasking.queuing%s
   --  system.tasking.queuing%b
   --  system.tasking.utilities%b
   --  system.tasking.rendezvous%s
   --  system.tasking.protected_objects.operations%s
   --  system.tasking.protected_objects.operations%b
   --  system.tasking.rendezvous%b
   --  system.tasking.entry_calls%b
   --  system.tasking.stages%s
   --  system.tasking.stages%b
   --  system.interrupt_management.operations%s
   --  system.interrupt_management.operations%b
   --  system.interrupts%s
   --  system.interrupts%b
   --  ada.interrupts%s
   --  ada.interrupts%b
   --  ada.interrupts.names%s
   --  interfaces.java.jni%s
   --  interfaces.java.jni%b
   --  ajis%s
   --  ajis.internal%s
   --  ajis.java%s
   --  help%s
   --  help%b
   --  ajis.internal.java%s
   --  ajis.internal.java%b
   --  jni_binding%s
   --  jni_binding%b
   --  jni_binding.ada2java_jni%s
   --  jni_binding.ada2java_jni%b
   --  jni_binding.ada2java_jni.library_jni%s
   --  jni_binding.ada_jni%s
   --  jni_binding.ada_jni%b
   --  jni_binding.ada_jni.exceptions_jni%s
   --  jni_binding.ada_jni.exceptions_jni%b
   --  jni_binding.ada_jni.exceptions_jni.exception_occurrence_jni%s
   --  jni_binding.ada_jni.exceptions_jni.exception_occurrence_jni%b
   --  jni_binding.standard_jni%s
   --  jni_binding.standard_jni%b
   --  jni_binding.help_jni%s
   --  jni_binding.help_jni%b
   --  jni_binding.help_jni.help_package_jni%s
   --  jni_binding.help_jni.help_package_jni%b
   --  jni_binding.standard_jni.adastring_jni%s
   --  jni_binding.standard_jni.adastring_jni%b
   --  jni_binding.standard_jni.constraint_error_jni%s
   --  jni_binding.standard_jni.constraint_error_jni%b
   --  jni_binding.standard_jni.program_error_jni%s
   --  jni_binding.standard_jni.program_error_jni%b
   --  jni_binding.standard_jni.storage_error_jni%s
   --  jni_binding.standard_jni.storage_error_jni%b
   --  jni_binding.ada2java_jni.library_jni%b
   --  END ELABORATION ORDER


end help_projmain;
