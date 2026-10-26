package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rgY_2 {
   private final Map<UUID, rgK_2> class_ = Maps.newHashMap();

   private int class_(rgD_2 var1, int var2, int var3) {
      int var4 = var2 + var3;
      return var4 > var1.max ? Math.max(var1.max, var2) : var4;
   }

   private static int class_(int var0, int var1) {
      return Math.max(var0, var1);
   }

   public void class_(Dynamic<?> var1) {
      var1.asStream()
         .map(rgo_3::class_)
         .flatMap(var0 -> rqR_2.class_(var0.result()))
         .forEach(var1x -> this.class_(var1x.class_).class_.put(var1x.break_, var1x.byte_));
   }

   public void class_(rgY_2 var1, Random var2, int var3) {
      Collection var4 = var1.class_(var2, var3);
      var4.forEach(var1x -> {
         int var2x = var1x.byte_ - var1x.break_.decayPerTransfer;
         if (var2x >= 2) {
            this.class_(var1x.class_).class_.mergeInt(var1x.break_, var2x, rgY_2::class_);
         }
      });
   }

   private rgK_2 class_(UUID var1) {
      return this.class_.computeIfAbsent(var1, var0 -> new rgK_2());
   }

   private Collection<rgo_3> class_(Random var1, int var2) {
      List var3 = this.break_().collect(Collectors.toList());
      if (var3.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] var4 = new int[var3.size()];
         int var5 = 0;

         for (int var6 = 0; var6 < var3.size(); var6++) {
            rgo_3 var7 = (rgo_3)var3.get(var6);
            var5 += Math.abs(var7.class_());
            var4[var6] = var5 - 1;
         }

         Set var10 = Sets.newIdentityHashSet();

         for (int var11 = 0; var11 < var2; var11++) {
            int var8 = var1.nextInt(var5);
            int var9 = Arrays.binarySearch(var4, var8);
            var10.add((rgo_3)var3.get(var9 < 0 ? -var9 - 1 : var9));
         }

         return var10;
      }
   }

   public void class_() {
      Iterator var1 = this.class_.values().iterator();

      while (var1.hasNext()) {
         rgK_2 var2 = (rgK_2)var1.next();
         var2.class_();
         if (var2.break_()) {
            var1.remove();
         }
      }
   }

   public <T> Dynamic<T> class_(DynamicOps<T> var1) {
      return new Dynamic(var1, var1.createList(this.break_().map(var1x -> var1x.class_(var1)).map(Dynamic::getValue)));
   }

   public void class_(UUID var1, rgD_2 var2, int var3) {
      rgK_2 var4 = this.class_(var1);
      var4.class_.mergeInt(var2, var3, (var2x, var3x) -> this.class_(var2, var2x.intValue(), var3x.intValue()));
      var4.class_(var2);
      if (var4.break_()) {
         this.class_.remove(var1);
      }
   }

   public int class_(UUID var1, Predicate<rgD_2> var2) {
      rgK_2 var3 = this.class_.get(var1);
      return var3 != null ? var3.class_(var2) : 0;
   }

   private Stream<rgo_3> break_() {
      return this.class_.entrySet().stream().flatMap(var0 -> var0.getValue().class_(var0.getKey()));
   }
}
