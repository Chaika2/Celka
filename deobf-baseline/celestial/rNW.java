package celestial;

import java.util.Random;

public class rNW extends rzO_2 {
   final rWK id_break;
   final boolean id_byte;

   rNW(rQz_1[] var1, rWK var2, boolean var3) {
      super(var1);
      this.id_break = var2;
      this.id_byte = var3;
   }

   public static rNz_1 id_class(rWK var0) {
      return new rNz_1(var0);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_byte;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      Random var3 = var2.id_class();
      return eA_2.id_class(var3, var1, this.id_break.id_class(var3), this.id_byte);
   }
}
