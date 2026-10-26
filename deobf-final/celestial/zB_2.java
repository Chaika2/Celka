package celestial;

import com.google.common.collect.Lists;
import java.util.LinkedList;

public class zB_2 extends xd_3 {
   protected zB_2(Jq_1 var1) {
      super(var1);
   }

   protected void class_(rYB var1, rfH_2 var2) {
      if (this.break_(var1, var2)) {
         var1.class_(var2, xu_3.c.continue_(), 2);
         var1.byte_(2001, var2, xd_3.finally_(xu_3.try_.continue_()));
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      this.class_(var2, var3);
      super.class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_())) {
         this.class_(var2, var3);
      }
   }

   private boolean break_(rYB var1, rfH_2 var2) {
      LinkedList var3 = Lists.newLinkedList();
      var3.add(new rqj_3<>(var2, 0));
      int var4 = 0;

      while (!var3.isEmpty()) {
         rqj_3 var5 = (rqj_3)var3.poll();
         rfH_2 var6 = (rfH_2)var5.class_();
         int var7 = (Integer)var5.break_();

         for (rpr_3 var11 : rpr_3.values()) {
            rfH_2 var12 = var6.break_(var11);
            xc_3 var13 = var1.byte_(var12);
            rXE var14 = var1.break_(var12);
            QP var15 = var13.byte_();
            if (var14.class_(rlG_2.break_)) {
               if (var13.break_() instanceof kh_3 && ((kh_3)var13.break_()).break_(var1, var12, var13) != rXG.class_) {
                  var4++;
                  if (var7 < 6) {
                     var3.add(new rqj_3<>(var12, var7 + 1));
                  }
               } else if (var13.break_() instanceof dj_3) {
                  var1.class_(var12, xu_3.class_.continue_(), 3);
                  var4++;
                  if (var7 < 6) {
                     var3.add(new rqj_3<>(var12, var7 + 1));
                  }
               } else if (var15 == QP.case_ || var15 == QP.implements_) {
                  ryO_2 var16 = var13.break_().protected_() ? var1.class_(var12) : null;
                  class_(var13, var1, var12, var16);
                  var1.class_(var12, xu_3.class_.continue_(), 3);
                  var4++;
                  if (var7 < 6) {
                     var3.add(new rqj_3<>(var12, var7 + 1));
                  }
               }
            }
         }

         if (var4 > 64) {
            break;
         }
      }

      return var4 > 0;
   }
}
