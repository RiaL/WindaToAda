/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2012 (20120509))          *
 * Original Ada unit: Help                                                   *
 * Generation timestamp: 201302171701                                        *
 *****************************************************************************/

package Help;

/**
 * @origin help.ads:1:9
 */
@SuppressWarnings("all")
public final class Help_Package {

   /**
    * @origin help.ads:2:13
    */
   static public int Sum (int A, int B) {
      Ada2Java.Library.lock.lock ();
      try {
         int Id_JNI_46 = Sum_Id_JNI_39 (A, B);
         return Id_JNI_46;
      } finally {
         Ada2Java.Library.lock.unlock ();
      }
   } // Sum

   native static private int Sum_Id_JNI_39 (int A, int B);

   static {
      Ada2Java.Library.load ();
   }

} // Help_Package
