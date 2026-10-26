package celestial;

public class rGw_1 extends rEi_1 {
   private static final rut_3<Byte> class_ = rmE_2.class_(rGw_1.class, ruw_3.class_);

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.xq;
   }

   public rGw_1(aI_2<? extends rGw_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      if (!((rYB)this.throws_[7]).continue_) {
         this.this_((Boolean)this.throws_[23]);
      }
   }

   public void this_(boolean var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 = (byte)(var2 & -2);
      }

      ((rmE_2)this.throws_[49]).break_(class_, var2);
   }

   @Override
   public void class_(xc_3 var1, rjU_2 var2) {
      if (!var1.class_(xu_3.U)) {
         super.class_(var1, var2);
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.class_(var1, var2, var3, var4, var5);
      if (var1.long_().nextInt(100) == 0) {
         rGL var6 = aI_2.A.class_((rYB)this.throws_[7]);
         var6.class_(this.rx(), this.re(), this.BO(), (Float)this.throws_[15], 0.0F);
         var6.class_(var1, var2, var3, (aU_2)null, (rcd_3)null);
         var6.this_(this);
      }

      if (var4 == null) {
         var4 = new rGf_1();
         if (var1.abstract_() == rRO.HARD && var1.long_().nextFloat() < 0.1F * var2.byte_()) {
            ((rGf_1)var4).class_(var1.long_());
         }
      }

      if (var4 instanceof rGf_1) {
         rLR var8 = ((rGf_1)var4).class_;
         if (var8 != null) {
            this.break_(new rLY(var8, Integer.MAX_VALUE));
         }
      }

      return var4;
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.xT, 0.15F, 1.0F);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return 0.65F;
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      return new rLZ(this, var1);
   }

   @Override
   public boolean throws_(rLY var1) {
      return var1.class_() == rLD.super_ ? false : super.throws_(var1);
   }

   public static iz_3 L() {
      return rEi_1.sm().class_(iQ_2.class_, 16.0).class_(iQ_2.protected_, 0.3F);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.xy;
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(3, new rBv_1(this, 0.4F));
      this.package_.class_(4, new rGI(this));
      this.package_.class_(5, new rSk_1(this, 0.8));
      this.package_.class_(6, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(6, new rBC(this));
      this.int_.class_(1, new rBc_1(this));
      this.int_.class_(2, new rGj_1<>(this, rhd_3.class));
      this.int_.class_(3, new rGj_1<>(this, rMZ.class));
   }

   @Override
   public double PS() {
      return (double)(this.Bm() * 0.5F);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.xp;
   }

   public boolean sJ() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 1) != 0;
   }

   @Override
   public aL_2 sG() {
      return aL_2.byte_;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, (byte)0);
   }

   @Override
   public boolean o_() {
      return this.sJ();
   }
}
