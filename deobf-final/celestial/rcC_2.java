package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcC_2 implements rcv_3<rcn_3> {
   @Override
   public boolean byte_() {
      return true;
   }

   public rcn_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(96L);
      return rcn_3.class_(var1.readInt());
   }

   @Override
   public String class_() {
      return "INT";
   }

   @Override
   public String break_() {
      return "TAG_Int";
   }
}
