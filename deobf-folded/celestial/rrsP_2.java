package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;

public class rrsP_2 extends rrsE_2<rrsG_2> {
   private static final xc_3 id_byte = xu_3.hb.id_continue();
   private static final xc_3 id_protected = xu_3.id_char.id_continue();
   private static final xc_3 id_throws = xu_3.PY.id_continue();
   protected long id_class;
   protected rKt_1 id_break;

   public rrsP_2(Codec<rrsG_2> var1) {
      super(var1);
   }

   public void id_class(
      Random var1, roC_2 var2, rYG var3, int var4, int var5, int var6, double var7, xc_3 var9, xc_3 var10, int var11, long var12, rrsG_2 var14
   ) {
      int var15 = var11;
      int var16 = var4 & 15;
      int var17 = var5 & 15;
      double var18 = 0.03125;
      boolean var20 = this.id_break.id_class((double)var4 * 0.03125, (double)var5 * 0.03125, 0.0) * 75.0 + var1.nextDouble() > 0.0;
      boolean var21 = this.id_break.id_class((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      int var22 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      rfw_3 var23 = new rfw_3();
      int var24 = -1;
      xc_3 var25 = var14.id_class();
      xc_3 var26 = var14.id_break();

      for (int var27 = 127; var27 >= 0; var27--) {
         var23.id_class(var16, var27, var17);
         xc_3 var28 = var2.id_byte(var23);
         if (var28.id_catch()) {
            var24 = -1;
         } else if (var28.id_class(var9.id_break())) {
            if (var24 == -1) {
               boolean var29 = false;
               if (var22 <= 0) {
                  var29 = true;
                  var26 = var14.id_break();
               } else if (var27 >= var15 - 4 && var27 <= var15 + 1) {
                  var25 = var14.id_class();
                  var26 = var14.id_break();
                  if (var21) {
                     var25 = id_protected;
                     var26 = var14.id_break();
                  }

                  if (var20) {
                     var25 = id_throws;
                     var26 = id_throws;
                  }
               }

               if (var27 < var15 && var29) {
                  var25 = var10;
               }

               var24 = var22;
               if (var27 >= var15 - 1) {
                  var2.id_class(var23, var25, false);
               } else {
                  var2.id_class(var23, var26, false);
               }
            } else if (var24 > 0) {
               var24--;
               var2.id_class(var23, var26, false);
            }
         }
      }
   }

   @Override
   public void id_class(long var1) {
      if (this.id_class != var1 || this.id_break == null) {
         this.id_break = new rKt_1(new rqm_3(var1), IntStream.rangeClosed(-3, 0));
      }

      this.id_class = var1;
   }
}
