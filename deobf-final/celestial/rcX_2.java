package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcX_2 implements rcv_3<rch_3> {
   @Override
   public boolean byte_() {
      return true;
   }

   public rch_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(72L);
      return rch_3.class_(var1.readByte());
   }

   @Override
   public String class_() {
      return "BYTE";
   }

   @Override
   public String break_() {
      return "TAG_Byte";
   }
}
