package celestial;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class reW_2 {
   static final Logger id_class = LogManager.getLogger();

   public static void id_class(
      rVm_1 var0, rrrI var1, reN_2 var2, rKd_1 var3, rrPt_1 var4, rfH_2 var5, List<? super rel_3> var6, Random var7, boolean var8, boolean var9
   ) {
      rrrZ.id_throws();
      rVF var10 = var0.id_break(rVL.A);
      rqd_3 var11 = rqd_3.id_class(var7);
      reu_3 var12 = var1.id_byte().get();
      rev_3 var13 = var12.id_class(var7);
      rel_3 var14 = var2.create(var4, var13, var5, var13.id_protected(), var11, var13.id_class(var4, var5, var11));
      rfi_3 var15 = var14.id_catch();
      int var16 = (var15.id_protected + var15.id_class) / 2;
      int var17 = (var15.id_case + var15.id_byte) / 2;
      int var18;
      if (var9) {
         var18 = var5.c_() + var3.id_break(var16, var17, rKv_1.WORLD_SURFACE_WG);
      } else {
         var18 = var5.c_();
      }

      int var19 = var15.id_break + var14.id_protected();
      var14.id_class(0, var18 - var19, 0);
      var6.add(var14);
      if (var1.id_break() > 0) {
         byte var20 = 80;
         rfl_3 var21 = new rfl_3(
            (double)(var16 - 80), (double)(var18 - 80), (double)(var17 - 80), (double)(var16 + 80 + 1), (double)(var18 + 80 + 1), (double)(var17 + 80 + 1)
         );
         rez_3 var22 = new rez_3(var10, var1.id_break(), var2, var3, var4, var6, var7);
         var22.id_private
            .addLast(
               new reQ_2(var14, new MutableObject(rjw_3.id_class(rjw_3.id_class(var21), rjw_3.id_class(rfl_3.id_class(var15)), rjN_2.id_throws)), var18 + 80, 0)
            );

         while (!var22.id_private.isEmpty()) {
            reQ_2 var23 = var22.id_private.removeFirst();
            var22.id_class(var23.id_class, var23.id_break, var23.id_byte, var23.id_protected, var8);
         }
      }
   }

   public static void id_class(rVm_1 var0, rel_3 var1, int var2, reN_2 var3, rKd_1 var4, rrPt_1 var5, List<? super rel_3> var6, Random var7) {
      rVF var8 = var0.id_break(rVL.A);
      rez_3 var9 = new rez_3(var8, var2, var3, var4, var5, var6, var7);
      var9.id_private.addLast(new reQ_2(var1, new MutableObject(rjw_3.id_class), 0, 0));

      while (!var9.id_private.isEmpty()) {
         reQ_2 var10 = var9.id_private.removeFirst();
         var9.id_class(var10.id_class, var10.id_break, var10.id_byte, var10.id_protected, false);
      }
   }
}
