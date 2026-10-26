package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcw_3 implements rcv_3<rct_3> {
   @Override
   public boolean byte_() {
      return true;
   }

   public rct_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(128L);
      return rct_3.class_(var1.readLong());
   }

   @Override
   public String class_() {
      return "LONG";
   }

   @Override
   public String break_() {
      return "TAG_Long";
   }
}
