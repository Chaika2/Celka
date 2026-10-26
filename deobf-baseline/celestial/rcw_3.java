package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcw_3 implements rcv_3<rct_3> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rct_3 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(128L);
      return rct_3.id_class(var1.readLong());
   }

   @Override
   public String id_class() {
      return "LONG";
   }

   @Override
   public String id_break() {
      return "TAG_Long";
   }
}
