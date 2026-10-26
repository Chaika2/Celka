package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rru_3 extends rPm_1<iB_2> {
   private final il_3<rfK_2> class_;
   private final Predicate<rRP> byte_;

   public rru_3(rRP var1, il_3<rfK_2> var2) {
      super(ImmutableMap.of(var2, iC_2.VALUE_PRESENT));
      this.byte_ = var1.break_();
      this.class_ = var2;
   }

   private boolean class_(rrEm_1 var1, rfH_2 var2, iB_2 var3) {
      xc_3 var4 = var1.byte_(var2);
      return var4.break_().class_(rls_3.short_) && var4.byte_(xb_3.final_) && !var3.Sc();
   }

   private boolean class_(rrEm_1 var1, rfH_2 var2) {
      return !var1.d().class_(var2, this.byte_);
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      rfK_2 var3 = var2.SF().byte_(this.class_).get();
      return var1.E() == var3.class_() && var3.break_().class_(var2.Ps(), 16.0);
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      rfK_2 var6 = var5.byte_(this.class_).get();
      rfH_2 var7 = var6.break_();
      rrEm_1 var8 = var1.const_().class_(var6.class_());
      if (var8 == null || this.class_(var8, var7)) {
         var5.break_(this.class_);
      } else if (this.class_(var8, var7, var2)) {
         var5.break_(this.class_);
         var1.d().break_(var7);
         ruP_2.byte_(var1, var7);
      }
   }
}
