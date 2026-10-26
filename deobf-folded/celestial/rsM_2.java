package celestial;

import java.util.List;

public class rsM_2 extends rsS_2 {
   public rsM_2(aI_2<? extends rsM_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsM_2(rYB var1, rfH_2 var2) {
      super(aI_2.id_strictfp, var1, var2);
      this.id_new((double)var2.b_() + 0.5, (double)var2.c_() + 0.5, (double)var2.d_() + 0.5);
      float var3 = 0.125F;
      float var4 = 0.1875F;
      float var5 = 0.25F;
      this.id_class(
         new rfl_3(this.rx() - 0.1875, this.re() - 0.25 + 0.125, this.BO() - 0.1875, this.rx() + 0.1875, this.re() + 0.25 + 0.125, this.BO() + 0.1875)
      );
      Boolean var10 = true;
      this.id_throws[6] = var10;
   }

   @Override
   public void id_class(an_3 var1) {
      this.id_class(rqn_3.GE, 1.0F, 1.0F);
   }

   @Override
   public void id_class(rcd_3 var1) {
   }

   @Override
   public boolean id_class(double var1) {
      return var1 < 1024.0;
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      if (((rYB)this.id_throws[7]).id_continue) {
         return ryZ_2.SUCCESS;
      } else {
         boolean var3 = false;
         double var4 = 7.0;
         List var6 = ((rYB)this.id_throws[7])
            .id_class(is_3.class, new rfl_3(this.rx() - 7.0, this.re() - 7.0, this.BO() - 7.0, this.rx() + 7.0, this.re() + 7.0, this.BO() + 7.0));

         for (is_3 var8 : var6) {
            if (var8.N() == var1) {
               var8.id_break(this, true);
               var3 = true;
            }
         }

         if (!var3) {
            this.PD();
            if (((rhx_3)var1.id_implements[18]).id_protected) {
               for (is_3 var10 : var6) {
                  if (var10.z() && var10.N() == this) {
                     var10.id_class(true, false);
                  }
               }
            }
         }

         return ryZ_2.CONSUME;
      }
   }

   public static rsM_2 id_class(rYB var0, rfH_2 var1) {
      int var2 = var1.b_();
      int var3 = var1.c_();
      int var4 = var1.d_();

      for (rsM_2 var6 : var0.id_class(
         rsM_2.class, new rfl_3((double)var2 - 1.0, (double)var3 - 1.0, (double)var4 - 1.0, (double)var2 + 1.0, (double)var3 + 1.0, (double)var4 + 1.0)
      )) {
         if (var6.id_implements().equals(var1)) {
            return var6;
         }
      }

      rsM_2 var7 = new rsM_2(var0, var1);
      var0.a_(var7);
      var7.id_private();
      return var7;
   }

   @Override
   public rjU_2 id_class(float var1) {
      return this.id_finally(var1).id_break(0.0, 0.2, 0.0);
   }

   @Override
   public void id_class(rpr_3 var1) {
   }

   @Override
   protected float id_class(iM_2 var1, ap_3 var2) {
      return -0.0625F;
   }

   @Override
   public void id_break(rcd_3 var1) {
   }

   @Override
   public boolean id_throws() {
      return ((rYB)this.id_throws[7]).id_byte(this.id_break).id_break().id_class(rls_3.id_default);
   }

   @Override
   public int id_catch() {
      return 9;
   }

   @Override
   public int id_case() {
      return 9;
   }

   @Override
   public void id_new(double var1, double var3, double var5) {
      super.id_new((double)rfU_2.id_byte(var1) + 0.5, (double)rfU_2.id_byte(var3) + 0.5, (double)rfU_2.id_byte(var5) + 0.5);
   }

   @Override
   protected void id_protected() {
      this.id_volatile((double)this.id_break.b_() + 0.5, (double)this.id_break.c_() + 0.5, (double)this.id_break.d_() + 0.5);
   }

   @Override
   public void id_private() {
      this.id_class(rqn_3.GG, 1.0F, 1.0F);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this, this.BC(), 0, this.id_implements());
   }
}
