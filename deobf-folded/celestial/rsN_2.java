package celestial;

import java.util.Random;

public class rsN_2 extends rsJ_2 {
   private static final rut_3<Boolean> id_protected = rmE_2.id_class(rsN_2.class, ruw_3.id_implements);
   private int id_catch;
   public double id_class;
   public double id_break;
   private static final rkg_3 id_private = rkg_3.id_class(rdy_3.Oh, rdy_3.OX);

   @Override
   protected void id_byte(rfH_2 var1, xc_3 var2) {
      double var3 = 1.0E-4;
      double var5 = 0.001;
      super.id_byte(var1, var2);
      rjU_2 var7 = this.rv();
      double var8 = id_case(var7);
      double var10 = this.id_class * this.id_class + this.id_break * this.id_break;
      if (var10 > 1.0E-4 && var8 > 0.001) {
         double var12 = (double)rfU_2.id_class(var8);
         double var14 = (double)rfU_2.id_class(var10);
         this.id_class = var7.id_break / var12 * var14;
         this.id_break = var7.id_protected / var12 * var14;
      }
   }

   protected void id_byte(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1);
   }

   @Override
   public xc_3 id_int() {
      return xu_3.Ps.id_continue().id_class(C_do.id_volatile, rpr_3.NORTH).id_class(C_do.id_final, Boolean.valueOf(this.id_else()));
   }

   public rsN_2(aI_2<? extends rsN_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsN_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.B, var1, var2, var4, var6);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (!((rYB)this.id_throws[7]).id_import()) {
         if (this.id_catch > 0) {
            this.id_catch--;
         }

         if (this.id_catch <= 0) {
            this.id_class = 0.0;
            this.id_break = 0.0;
         }

         this.id_byte(this.id_catch > 0);
      }

      if (this.id_else() && ((Random)this.id_throws[40]).nextInt(4) == 0) {
         ((rYB)this.id_throws[7]).id_class(rLQ.id_short, this.rx(), this.re() + 0.8, this.BO(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (id_private.id_class(var3) && this.id_catch + 3600 <= 32000) {
         if (!((rhx_3)var1.id_implements[18]).id_protected) {
            var3.id_catch(1);
         }

         this.id_catch += 3600;
      }

      if (this.id_catch > 0) {
         this.id_class = this.rx() - var1.rx();
         this.id_break = this.BO() - var1.BO();
      }

      return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("PushX", this.id_class);
      var1.id_class("PushZ", this.id_break);
      var1.id_class("Fuel", (short)this.id_catch);
   }

   @Override
   protected void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class = var1.id_extends("PushX");
      this.id_break = var1.id_extends("PushZ");
      this.id_catch = var1.id_catch("Fuel");
   }

   @Override
   public void id_break(rye_3 var1) {
      super.id_break(var1);
      if (!var1.id_protected() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
         this.id_class(xu_3.Ps);
      }
   }

   @Override
   protected void id_case() {
      double var1 = this.id_class * this.id_class + this.id_break * this.id_break;
      if (var1 > 1.0E-7) {
         var1 = (double)rfU_2.id_class(var1);
         this.id_class /= var1;
         this.id_break /= var1;
         this.id_byte(this.rv().id_throws(0.8, 0.0, 0.8).id_break(this.id_class, 0.0, this.id_break));
      } else {
         this.id_byte(this.rv().id_throws(0.98, 0.0, 0.98));
      }

      super.id_case();
   }

   protected boolean id_else() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   @Override
   protected double id_protected() {
      return 0.2;
   }

   @Override
   public rsd_3 id_final() {
      return rsd_3.FURNACE;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
   }
}
