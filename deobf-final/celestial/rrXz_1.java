package celestial;

public class rrXz_1 {
   private String class_;
   private String break_;
   private rrXd_1 byte_;
   private rrXf_1 protected_;

   public rrXz_1(String var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(rrXh_1 var1) {
      this.byte_ = var1.break_(this.class_);
      if (this.byte_ == null) {
         rrbb_3.protected_("Model variable not found: " + this.class_);
         return false;
      } else {
         try {
            rrXA var2 = new rrXA(var1);
            this.protected_ = var2.class_(this.break_);
            return true;
         } catch (rrXo_1 var3) {
            rrbb_3.protected_("Error parsing expression: " + this.break_);
            rrbb_3.protected_(var3.getClass().getName() + ": " + var3.getMessage());
            return false;
         }
      }
   }

   public void class_() {
      float var1 = this.protected_.class_();
      this.byte_.class_(var1);
   }
}
