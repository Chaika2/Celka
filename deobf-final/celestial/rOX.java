package celestial;

public class rOX extends rMu_1 implements aa_3, iP_2 {
   private static final rut_3<Byte> class_ = rmE_2.class_(rOX.class, ruw_3.class_);

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.xL;
   }

   public rOX(aI_2<? extends rOX> var1, rYB var2) {
      super(var1, var2);
   }

   public void this_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      if (var1) {
         ((rmE_2)this.throws_[49]).break_(class_, (byte)(var2 | 16));
      } else {
         ((rmE_2)this.throws_[49]).break_(class_, (byte)(var2 & -17));
      }
   }

   @Override
   public void class_(rqL_2 var1) {
      ((rYB)this.throws_[7]).class_((rhd_3)null, this, rqn_3.xn, var1, 1.0F, 1.0F);
      if (!((rYB)this.throws_[7]).import_()) {
         this.this_(false);
         this.class_(new rdn_3(rdy_3.Bk), 1.7F);
      }
   }

   @Override
   public boolean class_() {
      return this.BM() && this.L();
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Pumpkin", this.L());
   }

   @Override
   public void default_() {
      super.default_();
      if (!((rYB)this.throws_[7]).continue_) {
         int var1 = rfU_2.byte_(this.rx());
         int var2 = rfU_2.byte_(this.re());
         int var3 = rfU_2.byte_(this.BO());
         if (((rYB)this.throws_[7]).implements_(new rfH_2(var1, 0, var3)).class_(new rfH_2(var1, var2, var3)) > 1.0F) {
            this.break_(rye_3.byte_, 1.0F);
         }

         if (!((rYB)this.throws_[7]).B().break_(rRu_1.break_)) {
            return;
         }

         xc_3 var4 = xu_3.Pq.continue_();

         for (int var5 = 0; var5 < 4; var5++) {
            var1 = rfU_2.byte_(this.rx() + (double)((float)(var5 % 2 * 2 - 1) * 0.25F));
            var2 = rfU_2.byte_(this.re());
            var3 = rfU_2.byte_(this.BO() + (double)((float)(var5 / 2 % 2 * 2 - 1) * 0.25F));
            rfH_2 var6 = new rfH_2(var1, var2, var3);
            if (((rYB)this.throws_[7]).byte_(var6).catch_()
               && ((rYB)this.throws_[7]).implements_(var6).class_(var6) < 0.8F
               && var4.class_((rRR)((rYB)this.throws_[7]), var6)) {
               ((rYB)this.throws_[7]).break_(var6, var4);
            }
         }
      }
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      rhY_2 var3 = new rhY_2((rYB)this.throws_[7], this);
      double var4 = var1.rH() - 1.1F;
      double var6 = var1.rx() - this.rx();
      double var8 = var4 - var3.re();
      double var10 = var1.BO() - this.BO();
      float var12 = rfU_2.class_(var6 * var6 + var10 * var10) * 0.2F;
      var3.byte_(var6, var8 + (double)var12, var10, 1.6F, 12.0F);
      this.class_(rqn_3.xA, 1.0F, 0.4F / (this.Sa().nextFloat() * 0.4F + 0.8F));
      ((rYB)this.throws_[7]).a_(var3);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.throws_("Pumpkin")) {
         this.this_(var1.new_("Pumpkin"));
      }
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 1.7F;
   }

   @Override
   protected ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.JJ && this.class_()) {
         this.class_(rqL_2.PLAYERS);
         if (!((rYB)this.throws_[7]).continue_) {
            var3.class_(1, var1, var1x -> var1x.byte_(var2));
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return ryZ_2.PASS;
      }
   }

   public static iz_3 throws_() {
      return is_3.package_().class_(iQ_2.class_, 4.0).class_(iQ_2.protected_, 0.2F);
   }

   public boolean L() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 16) != 0;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.xv;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rBe_1(this, 1.25, 20, 10.0F));
      this.package_.class_(2, new rSk_1(this, 1.0, 1.0000001E-5F));
      this.package_.class_(3, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(4, new rBC(this));
      this.int_.class_(1, new rBI<>(this, is_3.class, 10, true, false, var0 -> var0 instanceof rEK));
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
      ((rmE_2)this.throws_[49]).class_(class_, (byte)16);
   }
}
