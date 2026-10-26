package celestial;

import java.io.DataInput;
import java.io.IOException;

class rcA_2 implements rcv_3<rcL_2> {
   @Override
   public String class_() {
      return "INT[]";
   }

   public rcL_2 class_(DataInput var1, int var2, rcg_3 var3) throws IOException {
      var3.class_(192L);
      int var4 = var1.readInt();
      var3.class_(32L * (long)var4);
      int[] var5 = new int[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = var1.readInt();
      }

      return new rcL_2(var5);
   }

   @Override
   public String break_() {
      return "TAG_Int_Array";
   }
}
