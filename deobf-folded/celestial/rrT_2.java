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
   private final rRP id_class;
   private final il_3<rfK_2> id_byte;
   private final boolean id_protected;
   private final Optional<Byte> id_throws;
   private long id_case;
   private final Long2ObjectMap<rrt_3> id_catch = new Long2ObjectOpenHashMap();

   public rrT_2(rRP var1, il_3<rfK_2> var2, il_3<rfK_2> var3, boolean var4, Optional<Byte> var5) {
      super(id_class(var2, var3));
      this.id_class = var1;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public rrT_2(rRP var1, il_3<rfK_2> var2, boolean var3, Optional<Byte> var4) {
      this(var1, var2, var2, var3, var4);
   }

   private static ImmutableMap<il_3<?>, iC_2> id_class(il_3<rfK_2> var0, il_3<rfK_2> var1) {
      Builder var2 = ImmutableMap.builder();
      var2.put(var0, iC_2.VALUE_ABSENT);
      if (var1 != var0) {
         var2.put(var1, iC_2.VALUE_ABSENT);
      }

      return var2.build();
   }

   protected boolean id_class(rrEm_1 var1, aA_2 var2) {
      if (this.id_protected && var2.n_()) {
         return false;
      } else if (this.id_case == 0L) {
         this.id_case = ((rYB)var2.id_throws[7]).r() + (long)var1.id_int.nextInt(20);
         return false;
      } else {
         return var1.r() >= this.id_case;
      }
   }

   protected void id_class(rrEm_1 var1, aA_2 var2, long var3) {
      this.id_case = var3 + 20L + (long)var1.id_long().nextInt(20);
      rga_3 var5 = var1.d();
      this.id_catch.long2ObjectEntrySet().removeIf(var2x -> !((rrt_3)var2x.getValue()).id_break(var3));
      Predicate var6 = var3x -> {
         rrt_3 var4 = (rrt_3)this.id_catch.get(var3x.id_package());
         if (var4 == null) {
            return true;
         } else if (!var4.id_byte(var3)) {
            return false;
         } else {
            var4.id_class(var3);
            return true;
         }
      };
      Set var7 = var5.id_break(this.id_class.id_break(), var6, var2.Bs(), 48, rRr_1.HAS_SPACE).limit(5L).collect(Collectors.toSet());
      rLC var8 = var2.id_public().id_class(var7, this.id_class.id_byte());
      if (var8 != null && var8.id_finally()) {
         rfH_2 var11 = var8.id_volatile();
         var5.id_byte(var11).ifPresent(var5x -> {
            var5.id_class(this.id_class.id_break(), var1xx -> var1xx.equals(var11), var11, 1);
            var2.SF().id_class(this.id_byte, rfK_2.id_class(var1.E(), var11));
            this.id_throws.ifPresent(var2xx -> var1.id_class(var2, var2xx));
            this.id_catch.clear();
            ruP_2.id_byte(var1, var11);
         });
      } else {
         for (rfH_2 var10 : var7) {
            this.id_catch.computeIfAbsent(var10.id_package(), var3x -> new rrt_3(((rYB)var2.id_throws[7]).id_int, var3));
         }
      }
   }
}
