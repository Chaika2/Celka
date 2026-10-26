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
   private final Map<UUID, rgK_2> id_class = Maps.newHashMap();

   private int id_class(rgD_2 var1, int var2, int var3) {
      int var4 = var2 + var3;
      return var4 > var1.max ? Math.max(var1.max, var2) : var4;
   }

   private static int id_class(int var0, int var1) {
      return Math.max(var0, var1);
   }

   public void id_class(Dynamic<?> var1) {
      var1.asStream()
         .map(rgo_3::id_class)
         .flatMap(var0 -> rqR_2.id_class(var0.result()))
         .forEach(var1x -> this.id_class(var1x.id_class).id_class.put(var1x.id_break, var1x.id_byte));
   }

   public void id_class(rgY_2 var1, Random var2, int var3) {
      Collection var4 = var1.id_class(var2, var3);
      var4.forEach(var1x -> {
         int var2x = var1x.id_byte - var1x.id_break.decayPerTransfer;
         if (var2x >= 2) {
            this.id_class(var1x.id_class).id_class.mergeInt(var1x.id_break, var2x, rgY_2::id_class);
         }
      });
   }

   private rgK_2 id_class(UUID var1) {
      return this.id_class.computeIfAbsent(var1, var0 -> new rgK_2());
   }

   private Collection<rgo_3> id_class(Random var1, int var2) {
      List var3 = this.id_break().collect(Collectors.toList());
      if (var3.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] var4 = new int[var3.size()];
         int var5 = 0;

         for (int var6 = 0; var6 < var3.size(); var6++) {
            rgo_3 var7 = (rgo_3)var3.get(var6);
            var5 += Math.abs(var7.id_class());
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

   public void id_class() {
      Iterator var1 = this.id_class.values().iterator();

      while (var1.hasNext()) {
         rgK_2 var2 = (rgK_2)var1.next();
         var2.id_class();
         if (var2.id_break()) {
            var1.remove();
         }
      }
   }

   public <T> Dynamic<T> id_class(DynamicOps<T> var1) {
      return new Dynamic(var1, var1.createList(this.id_break().map(var1x -> var1x.id_class(var1)).map(Dynamic::getValue)));
   }

   public void id_class(UUID var1, rgD_2 var2, int var3) {
      rgK_2 var4 = this.id_class(var1);
      var4.id_class.mergeInt(var2, var3, (var2x, var3x) -> this.id_class(var2, var2x.intValue(), var3x.intValue()));
      var4.id_class(var2);
      if (var4.id_break()) {
         this.id_class.remove(var1);
      }
   }

   public int id_class(UUID var1, Predicate<rgD_2> var2) {
      rgK_2 var3 = this.id_class.get(var1);
      return var3 != null ? var3.id_class(var2) : 0;
   }

   private Stream<rgo_3> id_break() {
      return this.id_class.entrySet().stream().flatMap(var0 -> var0.getValue().id_class(var0.getKey()));
   }
}
