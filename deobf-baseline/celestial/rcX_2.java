package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcX_2 implements rcv_3<rch_3> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rch_3 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(72L);
      return rch_3.id_class(var1.readByte());
   }

   @Override
   public String id_class() {
      return "BYTE";
   }

   @Override
   public String id_break() {
      return "TAG_Byte";
   }
}
