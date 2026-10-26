package celestial;

public class rNe_1 extends rzO_2 {
   final rcd_3 break_;

   rNe_1(rQz_1[] var1, rcd_3 var2) {
      super(var1);
      this.break_ = var2;
   }

   public static rzh_3<?> class_(rcd_3 var0) {
      return class_(var1 -> new rNe_1(var1, var0));
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.throws_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      var1.int_().class_(this.break_);
      return var1;
   }
}
