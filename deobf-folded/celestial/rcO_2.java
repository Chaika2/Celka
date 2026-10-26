package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcO_2 implements rcv_3<rcM_2> {
   @Override
   public String id_class() {
      return "BYTE[]";
   }

   public rcM_2 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(192L);
      int var4 = var1.readInt();
      var3.id_class(8L * (long)var4);
      byte[] var5 = new byte[var4];
      var1.readFully(var5);
      return new rcM_2(var5);
   }

   @Override
   public String id_break() {
      return "TAG_Byte_Array";
   }
}
