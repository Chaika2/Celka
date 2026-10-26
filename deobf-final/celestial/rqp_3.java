package celestial;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.function.Predicate;

public class rqp_3 {
   static Pair<rqq_3, Integer> class_(int[] var0) {
      int var1 = 0;
      int var2 = 0;
      int var3 = 0;
      IntArrayList var4 = new IntArrayList();
      var4.push(0);

      for (int var5 = 1; var5 <= var0.length; var5++) {
         int var6 = var5 == var0.length ? 0 : var0[var5];

         while (!var4.isEmpty()) {
            int var7 = var0[var4.topInt()];
            if (var6 >= var7) {
               var4.push(var5);
               break;
            }

            var4.popInt();
            int var8 = var4.isEmpty() ? 0 : var4.topInt() + 1;
            if (var7 * (var5 - var8) > var3 * (var2 - var1)) {
               var2 = var5;
               var1 = var8;
               var3 = var7;
            }
         }

         if (var4.isEmpty()) {
            var4.push(var5);
         }
      }

      return new Pair(new rqq_3(var1, var2 - 1), var3);
   }

   private static int class_(Predicate<rfH_2> var0, rfw_3 var1, rpr_3 var2, int var3) {
      int var4 = 0;

      while (var4 < var3 && var0.test(var1.class_(var2))) {
         var4++;
      }

      return var4;
   }

   public static rqT_2 class_(rfH_2 var0, rpB_2 var1, int var2, rpB_2 var3, int var4, Predicate<rfH_2> var5) {
      rfw_3 var6 = var0.new_();
      rpr_3 var7 = rpr_3.class_(rpG_2.NEGATIVE, var1);
      rpr_3 var8 = var7.case_();
      rpr_3 var9 = rpr_3.class_(rpG_2.NEGATIVE, var3);
      rpr_3 var10 = var9.case_();
      int var11 = class_(var5, var6.class_(var0), var7, var2);
      int var12 = class_(var5, var6.class_(var0), var8, var2);
      int var13 = var11;
      rqq_3[] var14 = new rqq_3[var11 + 1 + var12];
      var14[var11] = new rqq_3(class_(var5, var6.class_(var0), var9, var4), class_(var5, var6.class_(var0), var10, var4));
      int var15 = var14[var11].class_;

      for (int var16 = 1; var16 <= var11; var16++) {
         rqq_3 var17 = var14[var13 - (var16 - 1)];
         var14[var13 - var16] = new rqq_3(
            class_(var5, var6.class_(var0).byte_(var7, var16), var9, var17.class_), class_(var5, var6.class_(var0).byte_(var7, var16), var10, var17.break_)
         );
      }

      for (int var26 = 1; var26 <= var12; var26++) {
         rqq_3 var28 = var14[var13 + var26 - 1];
         var14[var13 + var26] = new rqq_3(
            class_(var5, var6.class_(var0).byte_(var8, var26), var9, var28.class_), class_(var5, var6.class_(var0).byte_(var8, var26), var10, var28.break_)
         );
      }

      int var27 = 0;
      int var29 = 0;
      int var18 = 0;
      int var19 = 0;
      int[] var20 = new int[var14.length];

      for (int var21 = var15; var21 >= 0; var21--) {
         for (int var22 = 0; var22 < var14.length; var22++) {
            rqq_3 var23 = var14[var22];
            int var24 = var15 - var23.class_;
            int var25 = var15 + var23.break_;
            var20[var22] = var21 >= var24 && var21 <= var25 ? var25 + 1 - var21 : 0;
         }

         Pair var30 = class_(var20);
         rqq_3 var31 = (rqq_3)var30.getFirst();
         int var32 = 1 + var31.break_ - var31.class_;
         int var33 = (Integer)var30.getSecond();
         if (var32 * var33 > var18 * var19) {
            var27 = var31.class_;
            var29 = var21;
            var18 = var32;
            var19 = var33;
         }
      }

      return new rqT_2(var0.class_(var1, var27 - var13).class_(var3, var29 - var15), var18, var19);
   }
}
