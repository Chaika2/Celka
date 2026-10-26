package celestial;

public class rhw_3 extends rhf_3 {
   public rhw_3(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(aI_2.id_for, var1);
      this.id_new(var2, var4, var6);

      for (int var14 = 0; var14 < 7; var14++) {
         double var15 = 0.4 + 0.1 * (double)var14;
         var1.id_class(rLQ.r, var2, var4, var6, var8 * var15, var10, var12 * var15);
      }

      this.id_catch(var8, var10, var12);
   }

   public rhw_3(rYB var1, rhP_2 var2) {
      this(aI_2.id_for, var1);
      super.id_break(var2);
      this.id_new(
         var2.rx() - (double)(var2.PN() + 1.0F) * 0.5 * (double)rfU_2.id_class((Float)var2.id_private[23] * (float) (Math.PI / 180.0)),
         var2.rH() - 0.1F,
         var2.BO() + (double)(var2.PN() + 1.0F) * 0.5 * (double)rfU_2.id_break((Float)var2.id_private[23] * (float) (Math.PI / 180.0))
      );
   }

   public rhw_3(aI_2<? extends rhw_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      rjU_2 var1 = this.rv();
      rjG_2 var2 = rhj_3.id_class(this, this::id_class);
      if (var2 != null) {
         this.id_class(var2);
      }

      double var3 = this.rx() + var1.id_break;
      double var5 = this.re() + var1.id_byte;
      double var7 = this.BO() + var1.id_protected;
      this.id_return();
      float var9 = 0.99F;
      float var10 = 0.06F;
      if (((rYB)this.id_throws[7]).id_class(this.rN()).noneMatch(JC::id_catch)) {
         this.PD();
      } else if (this.Pa()) {
         this.PD();
      } else {
         this.id_byte(var1.id_class(0.99F));
         if (!this.rw()) {
            this.id_byte(this.rv().id_break(0.0, -0.06F, 0.0));
         }

         this.id_new(var3, var5, var7);
      }
   }

   @Override
   protected void id_class(rff_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.PD();
      }
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      an_3 var2 = this.id_else();
      if (var2 instanceof iB_2) {
         var1.id_class().id_break(rye_3.id_class(this, (iB_2)var2).id_byte(), 1.0F);
      }
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
