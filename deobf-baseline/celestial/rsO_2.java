package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class rsO_2 extends rsS_2 {
   public rsh_3 id_catch;

   public rsO_2(rYB var1, rfH_2 var2, rpr_3 var3, rsh_3 var4) {
      this(var1, var2, var3);
      this.id_catch = var4;
      this.id_class(var3);
   }

   public rsO_2(rYB var1, rfH_2 var2, rpr_3 var3) {
      super(aI_2.O, var1, var2);
      ArrayList var4 = Lists.newArrayList();
      int var5 = 0;

      for (rsh_3 var7 : rVL.P) {
         this.id_catch = var7;
         this.id_class(var3);
         if (this.id_throws()) {
            var4.add(var7);
            int var8 = var7.id_class() * var7.id_break();
            if (var8 > var5) {
               var5 = var8;
            }
         }
      }

      if (!var4.isEmpty()) {
         Iterator var9 = var4.iterator();

         while (var9.hasNext()) {
            rsh_3 var10 = (rsh_3)var9.next();
            if (var10.id_class() * var10.id_break() < var5) {
               var9.remove();
            }
         }

         this.id_catch = (rsh_3)var4.get(((Random)this.id_throws[40]).nextInt(var4.size()));
      }

      this.id_class(var3);
   }

   public rsO_2(aI_2<? extends rsO_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8) {
      this.id_new(var1, var3, var5);
   }

   @Override
   public void id_class(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      rfH_2 var11 = this.id_break.id_byte(var1 - this.rx(), var3 - this.re(), var5 - this.BO());
      this.id_new((double)var11.b_(), (double)var11.c_(), (double)var11.d_());
   }

   @Override
   public void id_class(an_3 var1) {
      if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
         this.id_class(rqn_3.Mj, 1.0F, 1.0F);
         if (var1 instanceof rhd_3 var2 && ((rhx_3)var2.id_implements[18]).id_protected) {
            return;
         }

         this.id_class(rdy_3.hH);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      var1.id_class("Motive", rVL.P.id_break(this.id_catch).toString());
      var1.id_class("Facing", (byte)this.id_protected.id_protected());
      super.id_class(var1);
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_catch = rVL.P.id_class(rqO_2.id_break(var1.id_native("Motive")));
      this.id_protected = rpr_3.id_break(var1.id_case("Facing"));
      super.id_break(var1);
      this.id_class(this.id_protected);
   }

   @Override
   public int id_catch() {
      return this.id_catch == null ? 1 : this.id_catch.id_break();
   }

   @Override
   public int id_case() {
      return this.id_catch == null ? 1 : this.id_catch.id_class();
   }

   @Override
   public void id_private() {
      this.id_class(rqn_3.MV, 1.0F, 1.0F);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFx_1(this);
   }
}
