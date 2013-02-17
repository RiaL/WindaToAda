with Ada.Text_IO; use Ada.Text_IO;
package body Help is
   function Sum(A, B : in Integer) return Integer is
      Total : Integer := A;
   begin
      Total := Total + B;
      Put_Line("Hello Ada!");
      return Total;
   end Sum;
end Help;


