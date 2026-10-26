package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrF_2 extends rPm_1<iB_2> {
   private final float class_;
   private final int byte_;
   private final int protected_;
   private Optional<rfH_2> throws_ = Optional.empty();

   public rrF_2(int var1, float var2, int var3) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT, il_3.break_, iC_2.REGISTERED, il_3.instanceof_, iC_2.REGISTERED));
      this.byte_ = var1;
      this.class_ = var2;
      this.protected_ = var3;
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      Optional var3 = var1.d().byte_(var0 -> var0 == rRP.continue_, var0 -> true, var2.Bs(), this.protected_ + 1, rRr_1.ANY);
      if (var3.isPresent() && ((rfH_2)var3.get()).class_(var2.Ps(), (double)this.protected_)) {
         this.throws_ = var3;
      } else {
         this.throws_ = Optional.empty();
      }

      return true;
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      Optional var6 = this.throws_;
      if (!var6.isPresent()) {
         var6 = var1.d().class_(var0 -> var0 == rRP.continue_, var0 -> true, rRr_1.ANY, var2.Bs(), this.byte_, var2.Sa());
         if (!var6.isPresent()) {
            Optional var7 = var5.byte_(il_3.break_);
            if (var7.isPresent()) {
               var6 = Optional.of(((rfK_2)var7.get()).break_());
            }
         }
      }

      if (var6.isPresent()) {
         var5.break_(il_3.this_);
         var5.break_(il_3.final_);
         var5.break_(il_3.continue_);
         var5.break_(il_3.new_);
         var5.class_(il_3.instanceof_, rfK_2.class_(var1.E(), (rfH_2)var6.get()));
         if (!((rfH_2)var6.get()).class_(var2.Ps(), (double)this.protected_)) {
            var5.class_(il_3.volatile_, new iH_2((rfH_2)var6.get(), this.class_, this.protected_));
         }
      }
   }
}
