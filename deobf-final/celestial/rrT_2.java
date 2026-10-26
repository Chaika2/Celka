package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rrT_2 extends rPm_1<aA_2> {
   private final rRP class_;
   private final il_3<rfK_2> byte_;
   private final boolean protected_;
   private final Optional<Byte> throws_;
   private long case_;
   private final Long2ObjectMap<rrt_3> catch_ = new Long2ObjectOpenHashMap();

   public rrT_2(rRP var1, il_3<rfK_2> var2, il_3<rfK_2> var3, boolean var4, Optional<Byte> var5) {
      super(class_(var2, var3));
      this.class_ = var1;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public rrT_2(rRP var1, il_3<rfK_2> var2, boolean var3, Optional<Byte> var4) {
      this(var1, var2, var2, var3, var4);
   }

   private static ImmutableMap<il_3<?>, iC_2> class_(il_3<rfK_2> var0, il_3<rfK_2> var1) {
      Builder var2 = ImmutableMap.builder();
      var2.put(var0, iC_2.VALUE_ABSENT);
      if (var1 != var0) {
         var2.put(var1, iC_2.VALUE_ABSENT);
      }

      return var2.build();
   }

   protected boolean class_(rrEm_1 var1, aA_2 var2) {
      if (this.protected_ && var2.n_()) {
         return false;
      } else if (this.case_ == 0L) {
         this.case_ = ((rYB)var2.throws_[7]).r() + (long)var1.int_.nextInt(20);
         return false;
      } else {
         return var1.r() >= this.case_;
      }
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      this.case_ = var3 + 20L + (long)var1.long_().nextInt(20);
      rga_3 var5 = var1.d();
      this.catch_.long2ObjectEntrySet().removeIf(var2x -> !((rrt_3)var2x.getValue()).break_(var3));
      Predicate var6 = var3x -> {
         rrt_3 var4 = (rrt_3)this.catch_.get(var3x.package_());
         if (var4 == null) {
            return true;
         } else if (!var4.byte_(var3)) {
            return false;
         } else {
            var4.class_(var3);
            return true;
         }
      };
      Set var7 = var5.break_(this.class_.break_(), var6, var2.Bs(), 48, rRr_1.HAS_SPACE).limit(5L).collect(Collectors.toSet());
      rLC var8 = var2.public_().class_(var7, this.class_.byte_());
      if (var8 != null && var8.finally_()) {
         rfH_2 var11 = var8.volatile_();
         var5.byte_(var11).ifPresent(var5x -> {
            var5.class_(this.class_.break_(), var1xx -> var1xx.equals(var11), var11, 1);
            var2.SF().class_(this.byte_, rfK_2.class_(var1.E(), var11));
            this.throws_.ifPresent(var2xx -> var1.class_(var2, var2xx));
            this.catch_.clear();
            ruP_2.byte_(var1, var11);
         });
      } else {
         for (rfH_2 var10 : var7) {
            this.catch_.computeIfAbsent(var10.package_(), var3x -> new rrt_3(((rYB)var2.throws_[7]).int_, var3));
         }
      }
   }
}
