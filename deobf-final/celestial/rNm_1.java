package celestial;

import java.util.Random;

public class rNm_1 extends rzO_2 {
   public static rzh_3<?> byte_() {
      return class_(rNm_1::new);
   }

   rNm_1(rQz_1[] var1) {
      super(var1);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.continue_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      Float var3 = var2.break_(rzQ_2.finally_);
      if (var3 != null) {
         Random var4 = var2.class_();
         float var5 = 1.0F / var3;
         int var6 = var1.char_();
         int var7 = 0;

         for (int var8 = 0; var8 < var6; var8++) {
            if (var4.nextFloat() <= var5) {
               var7++;
            }
         }

         var1.throws_(var7);
      }

      return var1;
   }
}
