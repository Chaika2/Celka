package celestial;

public class rQj_1 implements rQz_1 {
   final Boolean class_;
   final Boolean break_;

   rQj_1(Boolean var1, Boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public boolean class_(rzr_3 var1) {
      rrEm_1 var2 = var1.byte_();
      return this.class_ != null && this.class_ != var2.s() ? false : this.break_ == null || this.break_ == var2.S();
   }

   @Override
   public rWi_1 break_() {
      return rQF.final_;
   }
}
