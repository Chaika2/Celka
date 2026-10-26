package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcm_3 implements rcv_3<rcu_3> {
   @Override
   public boolean byte_() {
      return true;
   }

   public rcu_3 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(96L);
      return rcu_3.class_(var1.readFloat());
   }

   @Override
   public String class_() {
      return "FLOAT";
   }

   @Override
   public String break_() {
      return "TAG_Float";
   }
}
