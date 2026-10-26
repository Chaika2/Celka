package celestial;

public class rNV extends rzO_2 {
   final rWK id_break;

   rNV(rQz_1[] var1, rWK var2) {
      super(var1);
      this.id_break = var2;
   }

   public static rzh_3<?> id_class(rWK var0) {
      return id_class(var1 -> new rNV(var1, var0));
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_break;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      var1.id_throws(this.id_break.id_class(var2.id_class()));
      return var1;
   }
}
