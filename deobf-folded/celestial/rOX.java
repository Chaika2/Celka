package celestial;

public class rOX extends rMu_1 implements aa_3, iP_2 {
   private static final rut_3<Byte> id_class = rmE_2.id_class(rOX.class, ruw_3.id_class);

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.xL;
   }

   public rOX(aI_2<? extends rOX> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_this(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      if (var1) {
         ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(var2 | 16));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(var2 & -17));
      }
   }

   @Override
   public void id_class(rqL_2 var1) {
      ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.xn, var1, 1.0F, 1.0F);
      if (!((rYB)this.id_throws[7]).id_import()) {
         this.id_this(false);
         this.id_class(new rdn_3(rdy_3.Bk), 1.7F);
      }
   }

   @Override
   public boolean id_class() {
      return this.BM() && this.L();
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Pumpkin", this.L());
   }

   @Override
   public void id_default() {
      super.id_default();
      if (!((rYB)this.id_throws[7]).id_continue) {
         int var1 = rfU_2.id_byte(this.rx());
         int var2 = rfU_2.id_byte(this.re());
         int var3 = rfU_2.id_byte(this.BO());
         if (((rYB)this.id_throws[7]).id_implements(new rfH_2(var1, 0, var3)).id_class(new rfH_2(var1, var2, var3)) > 1.0F) {
            this.id_break(rye_3.id_byte, 1.0F);
         }

         if (!((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
            return;
         }

         xc_3 var4 = xu_3.Pq.id_continue();

         for (int var5 = 0; var5 < 4; var5++) {
            var1 = rfU_2.id_byte(this.rx() + (double)((float)(var5 % 2 * 2 - 1) * 0.25F));
            var2 = rfU_2.id_byte(this.re());
            var3 = rfU_2.id_byte(this.BO() + (double)((float)(var5 / 2 % 2 * 2 - 1) * 0.25F));
            rfH_2 var6 = new rfH_2(var1, var2, var3);
            if (((rYB)this.id_throws[7]).id_byte(var6).id_catch()
               && ((rYB)this.id_throws[7]).id_implements(var6).id_class(var6) < 0.8F
               && var4.id_class((rRR)((rYB)this.id_throws[7]), var6)) {
               ((rYB)this.id_throws[7]).id_break(var6, var4);
            }
         }
      }
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      rhY_2 var3 = new rhY_2((rYB)this.id_throws[7], this);
      double var4 = var1.rH() - 1.1F;
      double var6 = var1.rx() - this.rx();
      double var8 = var4 - var3.re();
      double var10 = var1.BO() - this.BO();
      float var12 = rfU_2.id_class(var6 * var6 + var10 * var10) * 0.2F;
      var3.id_byte(var6, var8 + (double)var12, var10, 1.6F, 12.0F);
      this.id_class(rqn_3.xA, 1.0F, 0.4F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.id_throws[7]).a_(var3);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_throws("Pumpkin")) {
         this.id_this(var1.id_new("Pumpkin"));
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 1.7F;
   }

   @Override
   protected ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.JJ && this.id_class()) {
         this.id_class(rqL_2.PLAYERS);
         if (!((rYB)this.id_throws[7]).id_continue) {
            var3.id_class(1, var1, var1x -> var1x.id_byte(var2));
         }

         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }

   public static iz_3 id_throws() {
      return is_3.id_package().id_class(iQ_2.id_class, 4.0).id_class(iQ_2.id_protected, 0.2F);
   }

   public boolean L() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 16) != 0;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.xv;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rBe_1(this, 1.25, 20, 10.0F));
      this.id_package.id_class(2, new rSk_1(this, 1.0, 1.0000001E-5F));
      this.id_package.id_class(3, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(4, new rBC(this));
      this.id_int.id_class(1, new rBI<>(this, is_3.class, 10, true, false, var0 -> var0 instanceof rEK));
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.75F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.xF;
   }

   @Override
   public boolean BU() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)16);
   }
}
