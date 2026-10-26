package celestial;

import java.io.DataInput;
import java.io.IOException;

class rci_3 implements rcv_3<rca_3> {
   @Override
   public boolean byte_() {
      return true;
   }

   public rca_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(288L);
      String var4 = var1.readUTF();
      var3.class_((long)(16 * var4.length()));
      return rca_3.class_(var4);
   }

   @Override
   public String class_() {
      return "STRING";
   }

   @Override
   public String break_() {
      return "TAG_String";
   }
}
