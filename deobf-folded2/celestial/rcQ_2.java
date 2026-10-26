package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcQ_2 implements rcv_3<rcz_3> {
   @Override
   public boolean id_byte() {
      return true;
   }

   public rcz_3 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(128L);
      return rcz_3.id_class(var1.readDouble());
   }

   @Override
   public String id_class() {
      return "DOUBLE";
   }

   @Override
   public String id_break() {
      return "TAG_Double";
   }
}
