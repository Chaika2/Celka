package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;

public class rrJ_2 extends rPm_1<rsq_3> {
   private rrEr_1 id_class;

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      Random var5 = var2.Sa();
      if (var5.nextInt(100) == 0) {
         var2.sJ();
      }

      if (var5.nextInt(200) == 0 && rrD_2.id_class(var1, var2, var2.Bs())) {
         rxL_2 var6 = rqR_2.id_class(rxL_2.values(), var5);
         int var7 = var5.nextInt(3);
         rdn_3 var8 = this.id_class(var6, var7);
         rhy_3 var9 = new rhy_3((rYB)var2.id_throws[7], var2, var2.rx(), var2.rH(), var2.BO(), var8);
         ((rYB)var2.id_throws[7]).a_(var9);
      }
   }

   public rrJ_2(int var1, int var2) {
      super(ImmutableMap.of(), var1, var2);
   }

   private rdn_3 id_class(rxL_2 var1, int var2) {
      rdn_3 var3 = new rdn_3(rdy_3.dc, 1);
      rdn_3 var4 = new rdn_3(rdy_3.du);
      rcd_3 var5 = var4.id_class("Explosion");
      ArrayList var6 = Lists.newArrayList();
      var6.add(var1.id_case());
      var5.id_class("Colors", var6);
      var5.id_class("Type", (byte)rxV_2.BURST.id_class());
      rcd_3 var7 = var3.id_class("Fireworks");
      rcy_3 var8 = new rcy_3();
      rcd_3 var9 = var4.id_break("Explosion");
      if (var9 != null) {
         var8.add(var9);
      }

      var7.id_class("Flight", (byte)var2);
      if (!var8.isEmpty()) {
         var7.id_class("Explosions", var8);
      }

      return var3;
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      rfH_2 var3 = var2.Bs();
      this.id_class = var1.id_interface(var3);
      return this.id_class != null && this.id_class.id_throws() && rrD_2.id_class(var1, var2, var3);
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return this.id_class != null && !this.id_class.id_protected();
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      this.id_class = null;
      var2.SF().id_class(var1.P(), var1.r());
   }
}
