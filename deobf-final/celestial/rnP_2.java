package celestial;

public class rnP_2 {
   private final rns_3 class_;
   private final String break_;
   private final rAi_1 byte_;
   private rgP_2 protected_;
   private rgP_2 throws_;
   private rnr_3 case_;

   public rAi_1 byte_() {
      return this.byte_;
   }

   public rnP_2(rns_3 var1, String var2, rAi_1 var3, rgP_2 var4, rnr_3 var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = this.catch_();
      this.case_ = var5;
   }

   public void class_(rgP_2 var1) {
      this.protected_ = var1;
      this.throws_ = this.catch_();
      this.class_.throws_(this);
   }

   public void class_(rnr_3 var1) {
      this.case_ = var1;
      this.class_.throws_(this);
   }

   public rns_3 class_() {
      return this.class_;
   }

   public String break_() {
      return this.break_;
   }

   public rgP_2 throws_() {
      return this.throws_;
   }

   private rgP_2 catch_() {
      return rgv_3.class_((rgP_2)this.protected_.case_().class_(var1 -> var1.class_(new rgy_3(rgp_3.class_, new rgN_2(this.break_)))));
   }

   public rnr_3 case_() {
      return this.case_;
   }

   public rgP_2 protected_() {
      return this.protected_;
   }
}
