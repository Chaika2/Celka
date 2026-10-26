package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcQ_2 implements rcv_3<rcz_3> {
   @Override
   public boolean byte_() {
      return true;
   }

   public rcz_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(128L);
      return rcz_3.class_(var1.readDouble());
   }

   @Override
   public String class_() {
      return "DOUBLE";
   }

   @Override
   public String break_() {
      return "TAG_Double";
   }
}
