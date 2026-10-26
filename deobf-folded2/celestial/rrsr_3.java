package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrsr_3 extends rrsE_2<rrsG_2> {
   private static final xc_3 id_break = xu_3.hb.id_continue();
   protected long id_class;
   private rKt_1 id_byte;

   public rrsr_3(Codec<rrsG_2> var1) {
      super(var1);
   }

   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      int var15 = var11;
      int var16 = var4 & 15;
      int var17 = var5 & 15;
      double var18 = this.id_byte.id_class((double)var4 * 0.1, (double)var11, (double)var5 * 0.1);
      boolean var20 = var18 > 0.15 + var1.nextDouble() * 0.35;
      double var21 = this.id_byte.id_class((double)var4 * 0.1, 109.0, (double)var5 * 0.1);
      boolean var23 = var21 > 0.25 + var1.nextDouble() * 0.9;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      rfw_3 var25 = new rfw_3();
      int var26 = -1;
      xc_3 var27 = var14.id_break();

      for (int var28 = 127; var28 >= 0; var28--) {
         var25.id_class(var16, var28, var17);
         xc_3 var29 = var14.id_class();
         xc_3 var30 = var2.id_byte(var25);
         if (var30.id_catch()) {
            var26 = -1;
         } else if (var30.id_class(var9.id_break())) {
            if (var26 == -1) {
               boolean var31 = false;
               if (var24 <= 0) {
                  var31 = true;
                  var27 = var14.id_break();
               }

               if (var20) {
                  var29 = var14.id_break();
               } else if (var23) {
                  var29 = var14.id_byte();
               }

               if (var28 < var15 && var31) {
                  var29 = var10;
               }

               var26 = var24;
               if (var28 >= var15 - 1) {
                  var2.id_class(var25, var29, false);
               } else {
                  var2.id_class(var25, var27, false);
               }
            } else if (var26 > 0) {
               var26--;
               var2.id_class(var25, var27, false);
            }
         }
      }
   }

   @Override
   public void id_class(long var1) {
      if (this.id_class != var1 || this.id_byte == null) {
         this.id_byte = new rKt_1(new rqm_3(var1), ImmutableList.of(0));
      }

      this.id_class = var1;
   }
}
