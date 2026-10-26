package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcU_2 implements rcv_3<rcD_2> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rcD_2 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(80L);
      return rcD_2.id_class(var1.readShort());
   }

   @Override
   public String id_class() {
      return "SHORT";
   }

   @Override
   public String id_break() {
      return "TAG_Short";
   }
}
