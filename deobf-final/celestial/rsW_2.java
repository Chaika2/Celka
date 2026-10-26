package celestial;

public class rsW_2 extends rsJ_2 {
   static final rut_3<String> class_ = rmE_2.class_(rsW_2.class, ruw_3.protected_);
   static final rut_3<rgP_2> break_ = rmE_2.class_(rsW_2.class, ruw_3.throws_);
   private final rHm_1 protected_ = new rsz_3(this);
   private int catch_;

   @Override
   public xc_3 int_() {
      return xu_3.SZ.continue_();
   }

   public rsW_2(aI_2<? extends rsW_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsW_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.P, var1, var2, var4, var6);
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      return this.protected_.class_(var1);
   }

   @Override
   public void class_(int var1, int var2, int var3, boolean var4) {
      if (var4 && (Integer)this.throws_[41] - this.catch_ >= 4) {
         this.else_().class_((rYB)this.throws_[7]);
         this.catch_ = (Integer)this.throws_[41];
      }
   }

   @Override
   public void class_(rut_3<?> var1) {
      super.class_(var1);
      if (break_.equals(var1)) {
         try {
            this.protected_.break_(this.BQ().class_(break_));
         } catch (Throwable var3) {
         }
      } else if (class_.equals(var1)) {
         this.protected_.class_(this.BQ().class_(class_));
      }
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      this.protected_.class_(var1);
   }

   @Override
   public boolean o() {
      return true;
   }

   @Override
   protected void break_(rcd_3 var1) {
      super.break_(var1);
      this.protected_.break_(var1);
      this.BQ().break_(class_, this.else_().private_());
      this.BQ().break_(break_, this.else_().catch_());
   }

   public rHm_1 else_() {
      return this.protected_;
   }

   @Override
   public rsd_3 final_() {
      return rsd_3.COMMAND_BLOCK;
   }

   @Override
   protected void m_() {
      super.m_();
      this.BQ().class_(class_, "");
      this.BQ().class_(break_, rgN_2.byte_);
   }
}
