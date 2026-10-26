package celestial;

public class rXl_1 implements rXu_1 {
   private final rsA_2 class_;
   private final rqs_3<rdn_3> break_ = rqs_3.class_(3, rdn_3.break_);
   private rdI_2 byte_;
   private int protected_;
   private int throws_;

   @Override
   public boolean byte_(rhd_3 var1) {
      return this.class_.class_() == var1;
   }

   public void byte_() {
      this.byte_ = null;
      rdn_3 var1;
      rdn_3 var2;
      if (this.break_.get(0).class_()) {
         var1 = this.break_.get(1);
         var2 = rdn_3.break_;
      } else {
         var1 = this.break_.get(0);
         var2 = this.break_.get(1);
      }

      if (var1.class_()) {
         this.break_(2, rdn_3.break_);
         this.throws_ = 0;
      } else {
         rdf_3 var3 = this.class_.break_();
         if (!var3.isEmpty()) {
            rdI_2 var4 = var3.class_(var1, var2, this.protected_);
            if (var4 == null || var4.int_()) {
               this.byte_ = var4;
               var4 = var3.class_(var2, var1, this.protected_);
            }

            if (var4 != null && !var4.int_()) {
               this.byte_ = var4;
               this.break_(2, var4.case_());
               this.throws_ = var4.package_();
            } else {
               this.break_(2, rdn_3.break_);
               this.throws_ = 0;
            }
         }

         this.class_.class_(this.extends_(2));
      }
   }

   public rXl_1(rsA_2 var1) {
      this.class_ = var1;
   }

   public void class_(int var1) {
      this.protected_ = var1;
      this.byte_();
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      rdn_3 var3 = this.break_.get(var1);
      if (var1 == 2 && !var3.class_()) {
         return rXC.class_(this.break_, var1, var3.char_());
      } else {
         rdn_3 var4 = rXC.class_(this.break_, var1, var2);
         if (!var4.class_() && this.break_(var1)) {
            this.byte_();
         }

         return var4;
      }
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      this.break_.set(var1, var2);
      if (!var2.class_() && var2.char_() > this.ab_()) {
         var2.throws_(this.ab_());
      }

      if (this.break_(var1)) {
         this.byte_();
      }
   }

   @Override
   public void break_() {
      this.byte_();
   }

   private boolean break_(int var1) {
      return var1 == 0 || var1 == 1;
   }

   public int throws_() {
      return this.throws_;
   }

   @Override
   public rdn_3 extends_(int var1) {
      return this.break_.get(var1);
   }

   @Override
   public int else_() {
      return this.break_.size();
   }

   @Override
   public boolean return_() {
      for (rdn_3 var2 : this.break_) {
         if (!var2.class_()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void public_() {
      this.break_.clear();
   }

   public rdI_2 protected_() {
      return this.byte_;
   }

   @Override
   public rdn_3 native_(int var1) {
      return rXC.class_(this.break_, var1);
   }
}
