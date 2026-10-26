package celestial;

import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.Random;

public class rrPr_1 extends rrrH<rUt_1> {
   public rrPr_1(rrrZ<rUt_1> var1, int var2, int var3, rfi_3 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6) {
      super.class_(var1, var2, var3, var4, var5, var6);
      int var7 = this.byte_.break_;

      for (int var8 = var5.class_; var8 <= var5.protected_; var8++) {
         for (int var9 = var5.byte_; var9 <= var5.case_; var9++) {
            rfH_2 var10 = new rfH_2(var8, var7, var9);
            if (!var1.finally_(var10) && this.byte_.break_(var10)) {
               boolean var11 = false;

               for (rrrn_1 var13 : this.break_) {
                  if (var13.catch_().break_(var10)) {
                     var11 = true;
                     break;
                  }
               }

               if (var11) {
                  for (int var14 = var7 - 1; var14 > 1; var14--) {
                     rfH_2 var15 = new rfH_2(var8, var14, var9);
                     if (!var1.finally_(var15) && !var1.byte_(var15).byte_().class_()) {
                        break;
                     }

                     var1.class_(var15, xu_3.volatile_.continue_(), 2);
                  }
               }
            }
         }
      }
   }

   public void class_(rVm_1 var1, rKd_1 var2, rrPt_1 var3, int var4, int var5, rYG var6, rUt_1 var7) {
      rqd_3 var8 = rqd_3.class_(this.protected_);
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
      int var13 = var2.byte_(var11, var12, rKv_1.WORLD_SURFACE_WG);
      int var14 = var2.byte_(var11, var12 + var10, rKv_1.WORLD_SURFACE_WG);
      int var15 = var2.byte_(var11 + var9, var12, rKv_1.WORLD_SURFACE_WG);
      int var16 = var2.byte_(var11 + var9, var12 + var10, rKv_1.WORLD_SURFACE_WG);
      int var17 = Math.min(Math.min(var13, var14), Math.min(var15, var16));
      if (var17 >= 60) {
         rfH_2 var18 = new rfH_2(var4 * 16 + 8, var17 + 1, var5 * 16 + 8);
         LinkedList var19 = Lists.newLinkedList();
         rrrV.class_(var3, var18, var8, var19, this.protected_);
         this.break_.addAll(var19);
         this.break_();
      }
   }
}
