package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcT_2 implements rcv_3<rcq_3> {
   @Override
   public String id_class() {
      return "LONG[]";
   }

   public rcq_3 id_class(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.id_class(192L);
      int var4 = var1.readInt();
      var3.id_class(64L * (long)var4);
      long[] var5 = new long[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = var1.readLong();
      }

      return new rcq_3(var5);
   }

   @Override
   public String id_break() {
      return "TAG_Long_Array";
   }
}
