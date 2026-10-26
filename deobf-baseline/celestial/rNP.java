package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rNP extends rzO_2 {
   final rNS id_break;

   rNP(rQz_1[] var1, rNS var2) {
      super(var1);
      this.id_break = var2;
   }

   public static rzh_3<?> id_class(rNS var0) {
      return id_class(var1 -> new rNP(var1, var0));
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(this.id_break.parameter);
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_volatile;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var2.id_break(this.id_break.parameter) instanceof rpA_2 var4 && var4.Bk()) {
         var1.id_class(var4.L_());
      }

      return var1;
   }
}
