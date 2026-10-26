package celestial;

public abstract class rhv_3 extends rhL_2 implements ai_3 {
   private static final rut_3<rdn_3> catch_ = rmE_2.class_(rhv_3.class, ruw_3.catch_);

   public rhv_3(aI_2<? extends rhv_3> var1, iB_2 var2, double var3, double var5, double var7, rYB var9) {
      super(var1, var2, var3, var5, var7, var9);
   }

   public rhv_3(aI_2<? extends rhv_3> var1, double var2, double var4, double var6, double var8, double var10, double var12, rYB var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
   }

   public rhv_3(aI_2<? extends rhv_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      rdn_3 var2 = this.protected_();
      if (!var2.class_()) {
         var1.class_("Item", var2.break_(new rcd_3()));
      }
   }

   @Override
   public rdn_3 class_() {
      rdn_3 var1 = this.protected_();
      return var1.class_() ? new rdn_3(rdy_3.xa) : var1;
   }

   public void break_(rdn_3 var1) {
      if (var1.break_() != rdy_3.xa || var1.final_()) {
         this.BQ().break_(catch_, rqR_2.class_(var1.implements_(), var0 -> var0.throws_(1)));
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      rdn_3 var2 = rdn_3.class_(var1.int_("Item"));
      this.break_(var2);
   }

   protected rdn_3 protected_() {
      return this.BQ().class_(catch_);
   }

   @Override
   protected void m_() {
      this.BQ().class_(catch_, rdn_3.break_);
   }
}
