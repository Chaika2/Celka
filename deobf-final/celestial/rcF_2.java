package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcF_2 implements rcv_3<rcN_2> {
   rcF_2(int var1) {
      this.class_ = var1;
   }

   @Override
   public String class_() {
      return "INVALID[" + this.class_ + "]";
   }

   public rcN_2 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      throw new IllegalArgumentException("Invalid tag id: " + this.class_);
   }

   @Override
   public String break_() {
      return "UNKNOWN_" + this.class_;
   }
}
