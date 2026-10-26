package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrA_2 extends rPm_1<rsq_3> {
   private final float class_;

   public rrA_2(float var1) {
      super(ImmutableMap.of(il_3.protected_, iC_2.VALUE_PRESENT, il_3.byte_, iC_2.VALUE_ABSENT, il_3.catch_, iC_2.VALUE_PRESENT));
      this.class_ = var1;
   }

   private void class_(rsq_3 var1) {
      var1.SF().break_(il_3.volatile_);
      var1.SF().break_(il_3.final_);
      var1.SF().break_(il_3.protected_);
   }

   private boolean class_(rsq_3 var1, rfH_2 var2, rRP var3) {
      rLC var4 = var1.public_().class_(var2, var3.byte_());
      return var4 != null && var4.finally_();
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      rfH_2 var5 = var2.SF().byte_(il_3.protected_).get().break_();
      Optional var6 = var1.d().byte_(var5);
      if (var6.isPresent()) {
         iA_2.class_(var2, var3x -> this.class_((rRP)var6.get(), var3x, var5))
            .findFirst()
            .ifPresent(var4 -> this.class_(var1, var2, var4, var5, var4.SF().byte_(il_3.byte_).isPresent()));
      }
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      return var2.n_() ? false : var2.su().break_() == rsT_2.class_;
   }

   private boolean class_(rRP var1, rsq_3 var2, rfH_2 var3) {
      boolean var4 = var2.SF().byte_(il_3.protected_).isPresent();
      if (var4) {
         return false;
      } else {
         Optional var5 = var2.SF().byte_(il_3.byte_);
         rsT_2 var6 = var2.su().break_();
         if (var2.su().break_() != rsT_2.class_ && var6.class_().break_().test(var1)) {
            return !var5.isPresent() ? this.class_(var2, var3, var1) : ((rfK_2)var5.get()).break_().equals(var3);
         } else {
            return false;
         }
      }
   }

   private void class_(rrEm_1 var1, rsq_3 var2, rsq_3 var3, rfH_2 var4, boolean var5) {
      this.class_(var2);
      if (!var5) {
         iA_2.class_(var3, var4, this.class_, 1);
         var3.SF().class_(il_3.protected_, rfK_2.class_(var1.E(), var4));
         ruP_2.byte_(var1, var4);
      }
   }
}
