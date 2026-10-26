package celestial;

public class rsX_2 extends an_3 {
   private static final rut_3<Integer> class_ = rmE_2.class_(rsX_2.class, ruw_3.break_);
   private iB_2 break_;
   private int protected_ = 80;

   public rsX_2(aI_2<? extends rsX_2> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[2] = var7;
   }

   public rsX_2(rYB var1, double var2, double var4, double var6, iB_2 var8) {
      this(aI_2.Q, var1);
      this.new_(var2, var4, var6);
      double var9 = var1.int_.nextDouble() * (float) (Math.PI * 2);
      this.catch_(-Math.sin(var9) * 0.02, 0.2F, -Math.cos(var9) * 0.02);
      this.class_(80);
      Double var15 = var2;
      this.throws_[8] = var15;
      Double var16 = var4;
      this.throws_[9] = var16;
      Double var17 = var6;
      this.throws_[10] = var17;
      this.break_ = var8;
   }

   @Override
   public void this_() {
      if (!this.rw()) {
         this.byte_(this.rv().break_(0.0, -0.04, 0.0));
      }

      this.class_(iG_2.SELF, this.rv());
      this.byte_(this.rv().class_(0.98));
      if ((Boolean)this.throws_[20]) {
         this.byte_(this.rv().throws_(0.7, -0.5, 0.7));
      }

      this.protected_--;
      if (this.protected_ <= 0) {
         this.PD();
         if (!((rYB)this.throws_[7]).continue_) {
            this.private_();
         }
      } else {
         this.PM();
         if (((rYB)this.throws_[7]).continue_) {
            ((rYB)this.throws_[7]).class_(rLQ.double_, this.rx(), this.re() + 0.5, this.BO(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.class_("Fuse", (short)this.case_());
   }

   public void class_(int var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
      this.protected_ = var1;
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (class_.equals(var1)) {
         this.protected_ = this.throws_();
      }
   }

   @Override
   protected float class_(iM_2 var1, ap_3 var2) {
      return 0.15F;
   }

   @Override
   protected void break_(rcd_3 var1) {
      this.class_(var1.catch_("Fuse"));
   }

   public int throws_() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   public float catch_() {
      float var1 = (float)this.throws_();
      float var2 = var1 - (float)this.case_();
      return rfU_2.class_(var2 / var1, 0.0F, 1.0F);
   }

   public int case_() {
      return this.protected_;
   }

   public iB_2 protected_() {
      return this.break_;
   }

   private void private_() {
      ((rYB)this.throws_[7]).class_(this, this.rx(), this.byte_(0.0625), this.BO(), 4.0F, rRz_1.BREAK);
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.throws_[27];
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.throws_[49]).class_(class_, 80);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
