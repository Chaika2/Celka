package celestial;

public class rrkz_1 {
   private String class_;
   private rrkt_1 break_;
   private rrXt_1 byte_;
   private rrky_1 protected_;

   public String byte_() {
      return this.class_;
   }

   public rrkz_1(String var1, rrkt_1 var2, rrXt_1 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var2.class_(var1);
   }

   @Override
   public String toString() {
      return this.break_.name().toLowerCase() + " " + this.class_;
   }

   public void class_() {
      if (this.protected_.case_()) {
         try {
            this.break_.class_(this.byte_, this.protected_);
         } catch (RuntimeException var2) {
            rrdJ.class_("Error updating custom uniform: " + this.protected_.byte_());
            rrdJ.class_(var2.getClass().getName() + ": " + var2.getMessage());
            this.protected_.catch_();
            rrdJ.class_("Custom uniform disabled: " + this.protected_.byte_());
         }
      }
   }

   public void class_(int var1) {
      this.protected_.byte_(var1);
   }

   public void break_() {
      this.protected_.private_();
   }

   public rrXt_1 throws_() {
      return this.byte_;
   }

   public rrky_1 case_() {
      return this.protected_;
   }

   public rrkt_1 protected_() {
      return this.break_;
   }
}
