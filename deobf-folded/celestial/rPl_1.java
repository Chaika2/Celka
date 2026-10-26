package celestial;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class rPl_1 extends rPm_1<iB_2> {
   private final float id_class;
   private final Long2LongMap id_byte = new Long2LongOpenHashMap();
   private int id_protected;
   private long id_throws;

   public rPl_1(float var1) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.VALUE_ABSENT, il_3.id_break, iC_2.VALUE_ABSENT));
      this.id_class = var1;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, iB_2 var2) {
      if (var1.r() - this.id_throws < 20L) {
         return false;
      } else {
         aA_2 var3 = (aA_2)var2;
         rga_3 var4 = var1.d();
         Optional var5 = var4.id_protected(rRP.id_continue.id_break(), var2.Bs(), 48, rRr_1.ANY);
         return var5.isPresent() && !(((rfH_2)var5.get()).id_private(var3.Bs()) <= 4.0);
      }
   }

   @Override
   protected void id_protected(rrEm_1 var1, iB_2 var2, long var3) {
      this.id_protected = 0;
      this.id_throws = var1.r() + (long)var1.id_long().nextInt(20);
      aA_2 var5 = (aA_2)var2;
      rga_3 var6 = var1.d();
      Predicate var7 = var1x -> {
         long var2x = var1x.id_package();
         if (this.id_byte.containsKey(var2x)) {
            return false;
         } else if (++this.id_protected >= 5) {
            return false;
         } else {
            this.id_byte.put(var2x, this.id_throws + 40L);
            return true;
         }
      };
      Stream var8 = var6.id_class(rRP.id_continue.id_break(), var7, var2.Bs(), 48, rRr_1.ANY);
      rLC var9 = var5.id_public().id_class(var8, rRP.id_continue.id_byte());
      if (var9 != null && var9.id_finally()) {
         rfH_2 var10 = var9.id_volatile();
         Optional var11 = var6.id_byte(var10);
         if (var11.isPresent()) {
            var2.SF().id_class(il_3.id_volatile, new iH_2(var10, this.id_class, 1));
            ruP_2.id_byte(var1, var10);
         }
      } else if (this.id_protected < 5) {
         this.id_byte.long2LongEntrySet().removeIf(var1x -> var1x.getLongValue() < this.id_throws);
      }
   }
}
