package celestial;

public class rhU_2 extends rhL_2 {
   private static final rut_3<Boolean> id_catch = rmE_2.id_class(rhU_2.class, ruw_3.id_implements);

   public rhU_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.rP, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhU_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.rP, var2, var3, var5, var7, var1);
   }

   public rhU_2(aI_2<? extends rhU_2> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_class(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_catch, var1);
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         an_3 var2 = var1.id_class();
         boolean var4;
         if (this.id_else() instanceof iB_2 var5) {
            var4 = var2.id_break(rye_3.id_class(this, var5), 8.0F);
            if (var4) {
               if (var2.BM()) {
                  this.id_class(var5, var2);
               } else {
                  var5.id_protected(5.0F);
               }
            }
         } else {
            var4 = var2.id_break(rye_3.id_package, 5.0F);
         }

         if (var4 && var2 instanceof iB_2) {
            byte var6 = 0;
            if (((rYB)this.id_throws[7]).id_abstract() == rRO.NORMAL) {
               var6 = 10;
            } else if (((rYB)this.id_throws[7]).id_abstract() == rRO.HARD) {
               var6 = 40;
            }

            if (var6 > 0) {
               ((iB_2)var2).id_break(new rLY(rLD.id_this, 20 * var6, 1));
            }
         }
      }
   }

   @Override
   public float id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5, float var6) {
      return this.id_protected() && rSN.id_byte(var4) ? Math.min(0.8F, var6) : var6;
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         rRz_1 var2 = ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break) ? rRz_1.DESTROY : rRz_1.NONE;
         ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.re(), this.BO(), 1.0F, false, var2);
         this.PD();
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return false;
   }

   @Override
   protected boolean id_throws() {
      return false;
   }

   @Override
   protected float id_catch() {
      return this.id_protected() ? 0.73F : super.id_catch();
   }

   @Override
   public boolean id_protected() {
      return ((rmE_2)this.id_throws[49]).id_class(id_catch);
   }

   @Override
   public boolean Pz() {
      return false;
   }

   @Override
   public boolean rY() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.id_throws[49]).id_class(id_catch, false);
   }
}
