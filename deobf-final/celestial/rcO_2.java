package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcO_2 implements rcv_3<rcM_2> {
   @Override
   public String class_() {
      return "BYTE[]";
   }

   public rcM_2 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(192L);
      int var4 = var1.readInt();
      var3.class_(8L * (long)var4);
      byte[] var5 = new byte[var4];
      var1.readFully(var5);
      return new rcM_2(var5);
   }

   @Override
   public String break_() {
      return "TAG_Byte_Array";
   }
}
