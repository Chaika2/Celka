package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcm_3 implements rcv_3<rcu_3> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rcu_3 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(96L);
      return rcu_3.id_class(var1.readFloat());
   }

   @Override
   public String id_class() {
      return "FLOAT";
   }

   @Override
   public String id_break() {
      return "TAG_Float";
   }
}
