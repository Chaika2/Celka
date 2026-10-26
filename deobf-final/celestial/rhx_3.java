package celestial;

public class rhx_3 {
   public boolean class_;
   public boolean break_;
   public boolean byte_;
   public boolean protected_;
   public boolean throws_ = true;
   private float case_ = 0.05F;
   private float catch_ = 0.1F;

   public void class_(float var1) {
      this.case_ = var1;
   }

   public float class_() {
      return this.case_;
   }

   public void class_(rcd_3 var1) {
      rcd_3 var2 = new rcd_3();
      var2.class_("invulnerable", this.class_);
      var2.class_("flying", this.break_);
      var2.class_("mayfly", this.byte_);
      var2.class_("instabuild", this.protected_);
      var2.class_("mayBuild", this.throws_);
      var2.class_("flySpeed", this.case_);
      var2.class_("walkSpeed", this.catch_);
      var1.class_("abilities", var2);
   }

   public void break_(float var1) {
      this.catch_ = var1;
   }

   public float break_() {
      return this.catch_;
   }

   public void break_(rcd_3 var1) {
      if (var1.byte_("abilities", 10)) {
         rcd_3 var2 = var1.int_("abilities");
         this.class_ = var2.new_("invulnerable");
         this.break_ = var2.new_("flying");
         this.byte_ = var2.new_("mayfly");
         this.protected_ = var2.new_("instabuild");
         if (var2.byte_("flySpeed", 99)) {
            this.case_ = var2.finally_("flySpeed");
            this.catch_ = var2.finally_("walkSpeed");
         }

         if (var2.byte_("mayBuild", 1)) {
            this.throws_ = var2.new_("mayBuild");
         }
      }
   }
}
