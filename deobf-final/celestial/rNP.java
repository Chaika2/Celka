package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rNP extends rzO_2 {
   final rNS break_;

   rNP(rQz_1[] var1, rNS var2) {
      super(var1);
      this.break_ = var2;
   }

   public static rzh_3<?> class_(rNS var0) {
      return class_(var1 -> new rNP(var1, var0));
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(this.break_.parameter);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.volatile_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var2.break_(this.break_.parameter) instanceof rpA_2 var4 && var4.Bk()) {
         var1.class_(var4.L_());
      }

      return var1;
   }
}
