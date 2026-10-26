package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcC_2 implements rcv_3<rcn_3> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rcn_3 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(96L);
      return rcn_3.id_class(var1.readInt());
   }

   @Override
   public String id_class() {
      return "INT";
   }

   @Override
   public String id_break() {
      return "TAG_Int";
   }
}
