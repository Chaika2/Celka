package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcF_2 implements rcv_3<rcN_2> {
   rcF_2(int var1) {
      this.id_class = var1;
   }

   @Override
   public String id_class() {
      return "INVALID[" + this.id_class + "]";
   }

   public rcN_2 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      throw new IllegalArgumentException("Invalid tag id: " + this.id_class);
   }

   @Override
   public String id_break() {
      return "UNKNOWN_" + this.id_class;
   }
}
