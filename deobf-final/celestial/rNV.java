package celestial;

public class rNV extends rzO_2 {
   final rWK break_;

   rNV(rQz_1[] var1, rWK var2) {
      super(var1);
      this.break_ = var2;
   }

   public static rzh_3<?> class_(rWK var0) {
      return class_(var1 -> new rNV(var1, var0));
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.break_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      var1.throws_(this.break_.class_(var2.class_()));
      return var1;
   }
}
