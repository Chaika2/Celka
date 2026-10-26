package celestial;

public class rNn_1 extends rzO_2 {
   final rWD id_break;

   rNn_1(rQz_1[] var1, rWD var2) {
      super(var1);
      this.id_break = var2;
   }

   public static rzh_3<?> id_class(rWD var0) {
      return id_class(var1 -> new rNn_1(var1, var0));
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_package;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      int var3 = this.id_break.applyAsInt(var1.id_char());
      var1.id_throws(var3);
      return var1;
   }
}
