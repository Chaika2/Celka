package celestial;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class iK_2 extends rrr_3<is_3> {
   private final Long2LongMap class_ = new Long2LongOpenHashMap();
   private int break_;
   private long byte_;

   public iK_2() {
      super(20);
   }

   protected void class_(rrEm_1 var1, is_3 var2) {
      if (var2.n_()) {
         this.break_ = 0;
         this.byte_ = var1.r() + (long)var1.long_().nextInt(20);
         rga_3 var3 = var1.d();
         Predicate var4 = var1x -> {
            long var2x = var1x.package_();
            if (this.class_.containsKey(var2x)) {
               return false;
            } else if (++this.break_ >= 5) {
               return false;
            } else {
               this.class_.put(var2x, this.byte_ + 40L);
               return true;
            }
         };
         Stream var5 = var3.class_(rRP.continue_.break_(), var4, var2.Bs(), 48, rRr_1.ANY);
         rLC var6 = var2.public_().class_(var5, rRP.continue_.byte_());
         if (var6 != null && var6.finally_()) {
            rfH_2 var7 = var6.volatile_();
            Optional var8 = var3.byte_(var7);
            if (var8.isPresent()) {
               var2.SF().class_(il_3.return_, var7);
            }
         } else if (this.break_ < 5) {
            this.class_.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.byte_);
         }
      }
   }

   @Override
   public Set<il_3<?>> class_() {
      return ImmutableSet.of(il_3.return_);
   }
}
