package celestial;

import java.util.Arrays;

public class rrJl_1 extends wK_2 {
   public rrJl_1(wK_2 var1, fj_3 var2) {
      super(id_class(var1.id_class(), var1.id_case(), var2), var1.id_byte(), Ih_1.id_class(var1.id_class()), var2, var1.id_throws());
   }

   private static int[] id_class(int[] var0, fj_3 var1, fj_3 var2) {
      int[] var3 = Arrays.copyOf(var0, var0.length);

      for (int var4 = 0; var4 < 4; var4++) {
         jZ_2 var5 = ju_3.id_private;
         int var6 = var5.id_class() * var4;
         int var7 = var5.id_class(2) / 4;
         var3[var6 + var7] = Float.floatToRawIntBits(var2.id_class((double)var1.id_throws(Float.intBitsToFloat(var0[var6 + var7]))));
         var3[var6 + var7 + 1] = Float.floatToRawIntBits(var2.id_break((double)var1.id_case(Float.intBitsToFloat(var0[var6 + var7 + 1]))));
      }

      return var3;
   }
}
