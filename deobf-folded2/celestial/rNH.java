package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rNH extends rzO_2 {
   final rzV_2 id_break;
   final int id_byte;

   boolean id_byte() {
      return this.id_byte > 0;
   }

   rNH(rQz_1[] var1, rzV_2 var2, int var3) {
      super(var1);
      this.id_break = var2;
      this.id_byte = var3;
   }

   public static rNy_1 id_class(rzV_2 var0) {
      return new rNy_1(var0);
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(rzQ_2.id_protected);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_catch;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      an_3 var3 = var2.id_break(rzQ_2.id_protected);
      if (var3 instanceof iB_2) {
         int var4 = eA_2.id_catch((iB_2)var3);
         if (var4 == 0) {
            return var1;
         }

         float var5 = (float)var4 * this.id_break.id_break(var2.id_class());
         var1.id_case(Math.round(var5));
         if (this.id_byte() && var1.id_char() > this.id_byte) {
            var1.id_throws(this.id_byte);
         }
      }

      return var1;
   }
}
