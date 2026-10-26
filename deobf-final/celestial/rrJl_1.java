package celestial;

import java.util.Arrays;

public class rrJl_1 extends wK_2 {
   public rrJl_1(wK_2 var1, fj_3 var2) {
      super(class_(var1.class_(), var1.case_(), var2), var1.byte_(), Ih_1.class_(var1.class_()), var2, var1.throws_());
   }

   private static int[] class_(int[] var0, fj_3 var1, fj_3 var2) {
      int[] var3 = Arrays.copyOf(var0, var0.length);

      for (int var4 = 0; var4 < 4; var4++) {
         jZ_2 var5 = ju_3.private_;
         int var6 = var5.class_() * var4;
         int var7 = var5.class_(2) / 4;
         var3[var6 + var7] = Float.floatToRawIntBits(var2.class_((double)var1.throws_(Float.intBitsToFloat(var0[var6 + var7]))));
         var3[var6 + var7 + 1] = Float.floatToRawIntBits(var2.break_((double)var1.case_(Float.intBitsToFloat(var0[var6 + var7 + 1]))));
      }

      return var3;
   }
}
