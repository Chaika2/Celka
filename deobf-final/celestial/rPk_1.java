package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPk_1 extends rPm_1<iB_2> {
   private long class_;

   public rPk_1() {
      super(ImmutableMap.of(il_3.break_, iC_2.VALUE_PRESENT, il_3.long_, iC_2.REGISTERED));
   }

   @Override
   protected boolean class_(long var1) {
      return false;
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2, long var3) {
      Optional var5 = var2.SF().byte_(il_3.break_);
      if (!var5.isPresent()) {
         return false;
      } else {
         rfH_2 var6 = ((rfK_2)var5.get()).break_();
         return var2.SF().byte_(iq_3.throws_) && var2.re() > (double)var6.c_() + 0.4 && var6.class_(var2.Ps(), 1.14);
      }
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      if (var2.Pm()) {
         return false;
      } else {
         iZ_2 var3 = var2.SF();
         rfK_2 var4 = var3.byte_(il_3.break_).get();
         if (var1.E() != var4.class_()) {
            return false;
         } else {
            Optional var5 = var3.byte_(il_3.long_);
            if (var5.isPresent()) {
               long var6 = var1.r() - (Long)var5.get();
               if (var6 > 0L && var6 < 100L) {
                  return false;
               }
            }

            xc_3 var8 = var1.byte_(var4.break_());
            return var4.break_().class_(var2.Ps(), 2.0) && var8.break_().class_(rls_3.short_) && !var8.byte_(xb_3.final_);
         }
      }
   }

   @Override
   protected void break_(rrEm_1 var1, iB_2 var2, long var3) {
      if (var2.Sc()) {
         var2.SQ();
         this.class_ = var3 + 40L;
      }
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      if (var3 > this.class_) {
         rrg_3.class_(var1, var2, (rLq_1)null, (rLq_1)null);
         var2.case_(var2.SF().byte_(il_3.break_).get().break_());
      }
   }
}
