package celestial;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class rPl_1 extends rPm_1<iB_2> {
   private final float class_;
   private final Long2LongMap byte_ = new Long2LongOpenHashMap();
   private int protected_;
   private long throws_;

   public rPl_1(float var1) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.VALUE_ABSENT, il_3.break_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
   }

   @Override
   protected boolean class_(rrEm_1 var1, iB_2 var2) {
      if (var1.r() - this.throws_ < 20L) {
         return false;
      } else {
         aA_2 var3 = (aA_2)var2;
         rga_3 var4 = var1.d();
         Optional var5 = var4.protected_(rRP.continue_.break_(), var2.Bs(), 48, rRr_1.ANY);
         return var5.isPresent() && !(((rfH_2)var5.get()).private_(var3.Bs()) <= 4.0);
      }
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      this.protected_ = 0;
      this.throws_ = var1.r() + (long)var1.long_().nextInt(20);
      aA_2 var5 = (aA_2)var2;
      rga_3 var6 = var1.d();
      Predicate var7 = var1x -> {
         long var2x = var1x.package_();
         if (this.byte_.containsKey(var2x)) {
            return false;
         } else if (++this.protected_ >= 5) {
            return false;
         } else {
            this.byte_.put(var2x, this.throws_ + 40L);
            return true;
         }
      };
      Stream var8 = var6.class_(rRP.continue_.break_(), var7, var2.Bs(), 48, rRr_1.ANY);
      rLC var9 = var5.public_().class_(var8, rRP.continue_.byte_());
      if (var9 != null && var9.finally_()) {
         rfH_2 var10 = var9.volatile_();
         Optional var11 = var6.byte_(var10);
         if (var11.isPresent()) {
            var2.SF().class_(il_3.volatile_, new iH_2(var10, this.class_, 1));
            ruP_2.byte_(var1, var10);
         }
      } else if (this.protected_ < 5) {
         this.byte_.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.throws_);
      }
   }
}
