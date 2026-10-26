package celestial;

public class rQI implements rQz_1 {
   final Long class_;
   final rzV_2 break_;

   rQI(Long var1, rzV_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(rzr_3 var1) {
      rrEm_1 var2 = var1.byte_();
      long var3 = var2.P();
      if (this.class_ != null) {
         var3 %= this.class_;
      }

      return this.break_.class_((int)var3);
   }

   @Override
   public rWi_1 break_() {
      return rQF.int_;
   }
}
