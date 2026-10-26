package celestial;

public abstract class rhV_2 extends rhK_2 implements ai_3 {
   private static final rut_3<rdn_3> class_ = rmE_2.class_(rhV_2.class, ruw_3.catch_);

   public rhV_2(aI_2<? extends rhV_2> var1, iB_2 var2, rYB var3) {
      super(var1, var2, var3);
   }

   public rhV_2(aI_2<? extends rhV_2> var1, double var2, double var4, double var6, rYB var8) {
      super(var1, var2, var4, var6, var8);
   }

   public rhV_2(aI_2<? extends rhV_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public rdn_3 class_() {
      rdn_3 var1 = this.case_();
      return var1.class_() ? new rdn_3(this.protected_()) : var1;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      rdn_3 var2 = this.case_();
      if (!var2.class_()) {
         var1.class_("Item", var2.break_(new rcd_3()));
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      rdn_3 var2 = rdn_3.class_(var1.int_("Item"));
      this.break_(var2);
   }

   public void break_(rdn_3 var1) {
      if (var1.break_() != this.protected_() || var1.final_()) {
         this.BQ().break_(class_, rqR_2.class_(var1.implements_(), var0 -> var0.throws_(1)));
      }
   }

   protected rdn_3 case_() {
      return this.BQ().class_(class_);
   }

   protected abstract rdb_3 protected_();

   @Override
   protected void m_() {
      this.BQ().class_(class_, rdn_3.break_);
   }
}
