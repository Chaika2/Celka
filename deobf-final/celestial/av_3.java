package celestial;

import java.util.Random;

public class av_3 {
   private final rmE_2 protected_;
   private final rut_3<Integer> throws_;
   private final rut_3<Boolean> case_;
   public boolean class_;
   public int break_;
   public int byte_;

   public av_3(rmE_2 var1, rut_3<Integer> var2, rut_3<Boolean> var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
   }

   public void class_(boolean var1) {
      this.protected_.break_(this.case_, var1);
   }

   public void class_(rcd_3 var1) {
      var1.class_("Saddle", this.break_());
   }

   public void class_() {
      this.class_ = true;
      this.break_ = 0;
      this.byte_ = this.protected_.class_(this.throws_);
   }

   public boolean class_(Random var1) {
      if (this.class_) {
         return false;
      } else {
         this.class_ = true;
         this.break_ = 0;
         this.byte_ = var1.nextInt(841) + 140;
         this.protected_.break_(this.throws_, this.byte_);
         return true;
      }
   }

   public void break_(rcd_3 var1) {
      this.class_(var1.new_("Saddle"));
   }

   public boolean break_() {
      return this.protected_.class_(this.case_);
   }
}
