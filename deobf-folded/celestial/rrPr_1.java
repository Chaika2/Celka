package celestial;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.Random;

public class rrPr_1 extends rrrH<rUt_1> {
   public rrPr_1(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6) {
      super.id_class(var1, var2, var3, var4, var5, var6);
      int var7 = this.id_byte.id_break;

      for (int var8 = var5.id_class; var8 <= var5.id_protected; var8++) {
         for (int var9 = var5.id_byte; var9 <= var5.id_case; var9++) {
            rfH_2 var10 = new rfH_2(var8, var7, var9);
            if (!var1.id_finally(var10) && this.id_byte.id_break(var10)) {
               boolean var11 = false;

               for (rrrn_1 var13 : this.id_break) {
                  if (var13.id_catch().id_break(var10)) {
                     var11 = true;
                     break;
                  }
               }

               if (var11) {
                  for (int var14 = var7 - 1; var14 > 1; var14--) {
                     rfH_2 var15 = new rfH_2(var8, var14, var9);
                     if (!var1.id_finally(var15) && !var1.id_byte(var15).id_byte().id_class()) {
                        break;
                     }

                     var1.id_class(var15, xu_3.id_volatile.id_continue(), 2);
                  }
               }
            }
         }
      }
   }

   public void id_class(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      rqd_3 var8 = rqd_3.id_class(this.id_protected);
      byte var9 = 5;
      byte var10 = 5;
      if (var8 == rqd_3.CLOCKWISE_90) {
         var9 = -5;
      } else if (var8 == rqd_3.CLOCKWISE_180) {
         var9 = -5;
         var10 = -5;
      } else if (var8 == rqd_3.COUNTERCLOCKWISE_90) {
         var10 = -5;
      }

      int var11 = (var4 << 4) + 7;
      int var12 = (var5 << 4) + 7;
      int var13 = var2.id_byte(var11, var12, rKv_1.WORLD_SURFACE_WG);
      int var14 = var2.id_byte(var11, var12 + var10, rKv_1.WORLD_SURFACE_WG);
      int var15 = var2.id_byte(var11 + var9, var12, rKv_1.WORLD_SURFACE_WG);
      int var16 = var2.id_byte(var11 + var9, var12 + var10, rKv_1.WORLD_SURFACE_WG);
      int var17 = Math.min(Math.min(var13, var14), Math.min(var15, var16));
      if (var17 >= 60) {
         rfH_2 var18 = new rfH_2(var4 * 16 + 8, var17 + 1, var5 * 16 + 8);
         LinkedList var19 = Lists.newLinkedList();
         rrrV.id_class(var3, var18, var8, var19, this.id_protected);
         this.id_break.addAll(var19);
         this.id_break();
      }
   }
}
