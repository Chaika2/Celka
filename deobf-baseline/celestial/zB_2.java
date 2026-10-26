package celestial;

import com.google.common.collect.Lists;
import java.util.LinkedList;

public class zB_2 extends xd_3 {
   protected zB_2(Jq_1 var1) {
      super(var1);
   }

   protected void id_class(rYB var1, rfH_2 var2) {
      if (this.id_break(var1, var2)) {
         var1.id_class(var2, xu_3.c.id_continue(), 2);
         var1.id_byte(2001, var2, xd_3.id_finally(xu_3.id_try.id_continue()));
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      this.id_class(var2, var3);
      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break())) {
         this.id_class(var2, var3);
      }
   }

   private boolean id_break(rYB var1, rfH_2 var2) {
      LinkedList var3 = Lists.newLinkedList();
      var3.add(new rqj_3<>(var2, 0));
      int var4 = 0;

      while (!var3.isEmpty()) {
         rqj_3 var5 = (rqj_3)var3.poll();
         rfH_2 var6 = (rfH_2)var5.id_class();
         int var7 = (Integer)var5.id_break();

         for (rpr_3 var11 : rpr_3.values()) {
            rfH_2 var12 = var6.id_break(var11);
            xc_3 var13 = var1.id_byte(var12);
            rXE var14 = var1.id_break(var12);
            QP var15 = var13.id_byte();
            if (var14.id_class(rlG_2.id_break)) {
               if (var13.id_break() instanceof kh_3 && ((kh_3)var13.id_break()).id_break(var1, var12, var13) != rXG.id_class) {
                  var4++;
                  if (var7 < 6) {
                     var3.add(new rqj_3<>(var12, var7 + 1));
                  }
               } else if (var13.id_break() instanceof dj_3) {
                  var1.id_class(var12, xu_3.id_class.id_continue(), 3);
                  var4++;
                  if (var7 < 6) {
                     var3.add(new rqj_3<>(var12, var7 + 1));
                  }
               } else if (var15 == QP.id_case || var15 == QP.id_implements) {
                  ryO_2 var16 = var13.id_break().id_protected() ? var1.id_class(var12) : null;
                  id_class(var13, var1, var12, var16);
                  var1.id_class(var12, xu_3.id_class.id_continue(), 3);
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
