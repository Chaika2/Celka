package celestial;

public class rhb_3 extends rhP_2 {
   private int try_ = 47999;

   public rhb_3(aI_2<? extends rhb_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 == iO_2.EVENT) {
         this.e_(0);
      }

      if (var4 == null) {
         var4 = new am_3(false);
      }

      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("DespawnDelay", this.try_);
   }

   @Override
   protected rhP_2 si() {
      return aI_2.R.class_((rYB)this.throws_[7]);
   }

   @Override
   public void default_() {
      super.default_();
      if (!((rYB)this.throws_[7]).continue_) {
         this.Es();
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("DespawnDelay", 99)) {
         this.try_ = var1.private_("DespawnDelay");
      }
   }

   @Override
   protected void catch_(rhd_3 var1) {
      an_3 var2 = this.N();
      if (!(var2 instanceof rsU_2)) {
         super.catch_(var1);
      }
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(1, new rBY(this, 2.0));
      this.int_.class_(1, new rhM_2(this, this));
   }

   private boolean EG() {
      return this.N() instanceof rsU_2;
   }

   private boolean Eb() {
      return this.z() && !this.EG();
   }

   private void Es() {
      if (this.EE()) {
         this.try_ = this.EG() ? ((rsU_2)this.N()).sW() - 1 : this.try_ - 1;
         if (this.try_ <= 0) {
            this.class_(true, false);
            this.PD();
         }
      }
   }

   @Override
   public boolean sK() {
      return true;
   }

   private boolean EE() {
      return !this.sm() && !this.Eb() && !this.Pq();
   }
}
