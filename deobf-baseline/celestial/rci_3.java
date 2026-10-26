package celestial;

import java.io.DataInput;
import java.io.IOException;

class rci_3 implements rcv_3<rca_3> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rca_3 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(288L);
      String var4 = var1.readUTF();
      var3.id_class((long)(16 * var4.length()));
      return rca_3.id_class(var4);
   }

   @Override
   public String id_class() {
      return "STRING";
   }

   @Override
   public String id_break() {
      return "TAG_String";
   }
}
