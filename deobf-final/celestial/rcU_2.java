package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcU_2 implements rcv_3<rcD_2> {
   @Override
   public boolean byte_() {
      return true;
   }

   public rcD_2 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(80L);
      return rcD_2.class_(var1.readShort());
   }

   @Override
   public String class_() {
      return "SHORT";
   }

   @Override
   public String break_() {
      return "TAG_Short";
   }
}
