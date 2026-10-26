package celestial;

public class rNn_1 extends rzO_2 {
   final rWD break_;

   rNn_1(rQz_1[] var1, rWD var2) {
      super(var1);
      this.break_ = var2;
   }

   public static rzh_3<?> class_(rWD var0) {
      return class_(var1 -> new rNn_1(var1, var0));
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.package_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      int var3 = this.break_.applyAsInt(var1.char_());
      var1.throws_(var3);
      return var1;
   }
}
