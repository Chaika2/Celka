package celestial;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class reW_2 {
   static final Logger class_ = LogManager.getLogger();

   public static void class_(
      rVm_1 var0, rrrI var1, reN_2 var2, rKd_1 var3, rrPt_1 var4, rfH_2 var5, List<? super rel_3> var6, Random var7, boolean var8, boolean var9
   ) {
      rrrZ.throws_();
      rVF var10 = var0.break_(rVL.A);
      rqd_3 var11 = rqd_3.class_(var7);
      reu_3 var12 = var1.byte_().get();
      rev_3 var13 = var12.class_(var7);
      rel_3 var14 = var2.create(var4, var13, var5, var13.protected_(), var11, var13.class_(var4, var5, var11));
      rfi_3 var15 = var14.catch_();
      int var16 = (var15.protected_ + var15.class_) / 2;
      int var17 = (var15.case_ + var15.byte_) / 2;
      int var18;
      if (var9) {
         var18 = var5.c_() + var3.break_(var16, var17, rKv_1.WORLD_SURFACE_WG);
      } else {
         var18 = var5.c_();
      }

      int var19 = var15.break_ + var14.protected_();
      var14.class_(0, var18 - var19, 0);
      var6.add(var14);
      if (var1.break_() > 0) {
         byte var20 = 80;
         rfl_3 var21 = new rfl_3(
            (double)(var16 - 80), (double)(var18 - 80), (double)(var17 - 80), (double)(var16 + 80 + 1), (double)(var18 + 80 + 1), (double)(var17 + 80 + 1)
         );
         rez_3 var22 = new rez_3(var10, var1.break_(), var2, var3, var4, var6, var7);
         var22.private_
            .addLast(new reQ_2(var14, new MutableObject(rjw_3.class_(rjw_3.class_(var21), rjw_3.class_(rfl_3.class_(var15)), rjN_2.throws_)), var18 + 80, 0));

         while (!var22.private_.isEmpty()) {
            reQ_2 var23 = var22.private_.removeFirst();
            var22.class_(var23.class_, var23.break_, var23.byte_, var23.protected_, var8);
         }
      }
   }

   public static void class_(rVm_1 var0, rel_3 var1, int var2, reN_2 var3, rKd_1 var4, rrPt_1 var5, List<? super rel_3> var6, Random var7) {
      rVF var8 = var0.break_(rVL.A);
      rez_3 var9 = new rez_3(var8, var2, var3, var4, var5, var6, var7);
      var9.private_.addLast(new reQ_2(var1, new MutableObject(rjw_3.class_), 0, 0));

      while (!var9.private_.isEmpty()) {
         reQ_2 var10 = var9.private_.removeFirst();
         var9.class_(var10.class_, var10.break_, var10.byte_, var10.protected_, false);
      }
   }
}
