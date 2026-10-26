package celestial;

public class rGg_1 extends rEi_1 {
   protected static final rut_3<Byte> class_ = rmE_2.class_(rGg_1.class, ruw_3.class_);
   is_3 break_;
   private rfH_2 protected_;
   private boolean super_;
   private int this_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.de;
   }

   public rGg_1(aI_2<? extends rGg_1> var1, rYB var2) {
      super(var1, var2);
      this.native_ = new rGo_1(this, this);
      this.finally_ = 3;
   }

   public void this_(boolean var1) {
      this.class_(1, var1);
   }

   @Override
   public void this_() {
      Boolean var5 = true;
      this.throws_[38] = var5;
      super.this_();
      Boolean var6 = false;
      this.throws_[38] = var6;
      this.finally_(true);
      if (this.super_ && --this.this_ <= 0) {
         this.this_ = 20;
         this.break_(rye_3.implements_, 1.0F);
      }
   }

   public void class_(is_3 var1) {
      this.break_ = var1;
   }

   @Override
   protected void class_(rRh_1 var1) {
      this.class_(rXQ.MAINHAND, new rdn_3(rdy_3.Oy));
      this.class_(rXQ.MAINHAND, 0.0F);
   }

   private void class_(int var1, boolean var2) {
      int var3 = ((rmE_2)this.throws_[49]).class_(class_);
      if (var2) {
         var3 |= var1;
      } else {
         var3 &= ~var1;
      }

      ((rmE_2)this.throws_[49]).break_(class_, (byte)(var3 & 0xFF));
   }

   public void class_(int var1) {
      this.super_ = true;
      this.this_ = var1;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.class_(var2);
      this.break_(var2);
      return super.class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.protected_ != null) {
         var1.break_("BoundX", this.protected_.b_());
         var1.break_("BoundY", this.protected_.c_());
         var1.break_("BoundZ", this.protected_.d_());
      }

      if (this.super_) {
         var1.break_("LifeTicks", this.this_);
      }
   }

   @Override
   public void class_(iG_2 var1, rjU_2 var2) {
      super.class_(var1, var2);
      this.Px();
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.throws_("BoundX")) {
         this.protected_ = new rfH_2(var1.private_("BoundX"), var1.private_("BoundY"), var1.private_("BoundZ"));
      }

      if (var1.throws_("LifeTicks")) {
         this.class_(var1.private_("LifeTicks"));
      }
   }

   private boolean break_(int var1) {
      byte var2 = ((rmE_2)this.throws_[49]).class_(class_);
      return (var2 & var1) != 0;
   }

   public static iz_3 throws_() {
      return rEi_1.sm().class_(iQ_2.class_, 14.0).class_(iQ_2.case_, 4.0);
   }

   public is_3 L() {
      return this.break_;
   }

   public boolean sx() {
      return this.break_(1);
   }

   public void implements_(rfH_2 var1) {
      this.protected_ = var1;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.dK;
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(4, new rGR(this));
      this.package_.class_(8, new rGK(this));
      this.package_.class_(9, new rBA(this, rhd_3.class, 3.0F, 1.0F));
      this.package_.class_(10, new rBA(this, is_3.class, 8.0F));
      this.int_.class_(1, new rBc_1(this, rEB.class).class_());
      this.int_.class_(2, new rGY(this, this));
      this.int_.class_(3, new rBI<>(this, rhd_3.class, true));
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.dU;
   }

   public rfH_2 sJ() {
      return this.protected_;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, (byte)0);
   }
}
