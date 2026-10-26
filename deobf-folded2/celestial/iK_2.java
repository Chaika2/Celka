package celestial;

import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class iK_2 extends rrr_3<is_3> {
   private final Long2LongMap id_class = new Long2LongOpenHashMap();
   private int id_break;
   private long id_byte;

   public iK_2() {
      super(20);
   }

   protected void id_class(rrEm_1 var1, is_3 var2) {
      if (var2.n_()) {
         this.id_break = 0;
         this.id_byte = var1.r() + (long)var1.id_long().nextInt(20);
         rga_3 var3 = var1.d();
         Predicate var4 = var1x -> {
            long var2x = var1x.id_package();
            if (this.id_class.containsKey(var2x)) {
               return false;
            } else if (++this.id_break >= 5) {
               return false;
            } else {
               this.id_class.put(var2x, this.id_byte + 40L);
               return true;
            }
         };
         Stream var5 = var3.id_class(rRP.id_continue.id_break(), var4, var2.Bs(), 48, rRr_1.ANY);
         rLC var6 = var2.id_public().id_class(var5, rRP.id_continue.id_byte());
         if (var6 != null && var6.id_finally()) {
            rfH_2 var7 = var6.id_volatile();
            Optional var8 = var3.id_byte(var7);
            if (var8.isPresent()) {
               var2.SF().id_class(il_3.id_return, var7);
            }
         } else if (this.id_break < 5) {
            this.id_class.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.id_byte);
         }
      }
   }

   @Override
   public Set<il_3<?>> id_class() {
      return ImmutableSet.of(il_3.id_return);
   }
}
