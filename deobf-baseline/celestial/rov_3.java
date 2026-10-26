package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class rov_3<T> {
   public static final int id_class = rrEx_1.id_break + 2 + 32;
   private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> id_break = IntStream.range(0, id_class)
      .mapToObj(var0 -> new Long2ObjectLinkedOpenHashMap())
      .collect(Collectors.toList());
   private volatile int id_byte = id_class;
   private final String id_protected;
   private final LongSet id_throws = new LongOpenHashSet();
   private final int id_case;

   public rov_3(String var1, int var2) {
      this.id_protected = var1;
      this.id_case = var2;
   }

   @Override
   public String toString() {
      return this.id_protected + " " + this.id_byte + "...";
   }

   protected void id_class(Optional<T> var1, long var2, int var4) {
      ((List)this.id_break.get(var4).computeIfAbsent(var2, var0 -> Lists.newArrayList())).add(var1);
      this.id_byte = Math.min(this.id_byte, var4);
   }

   protected void id_class(int var1, rfj_3 var2, int var3) {
      if (var1 < id_class) {
         Long2ObjectLinkedOpenHashMap var4 = this.id_break.get(var1);
         List var5 = (List)var4.remove(var2.id_class());
         if (var1 == this.id_byte) {
            while (this.id_byte < id_class && this.id_break.get(this.id_byte).isEmpty()) {
               this.id_byte++;
            }
         }

         if (var5 != null && !var5.isEmpty()) {
            ((List)this.id_break.get(var3).computeIfAbsent(var2.id_class(), var0 -> Lists.newArrayList())).addAll(var5);
            this.id_byte = Math.min(this.id_byte, var3);
         }
      }
   }

   private Runnable id_class(long var1) {
      return () -> this.id_throws.add(var1);
   }

   public Stream<Object> id_class() {
      if (this.id_throws.size() >= this.id_case) {
         return null;
      } else if (this.id_byte >= id_class) {
         return null;
      } else {
         int var1 = this.id_byte;
         Long2ObjectLinkedOpenHashMap var2 = this.id_break.get(var1);
         long var3 = var2.firstLongKey();
         List var5 = (List)var2.removeFirst();

         while (this.id_byte < id_class && this.id_break.get(this.id_byte).isEmpty()) {
            this.id_byte++;
         }

         return var5.stream().map(var3x -> var3x.<Either>map(Either::left).orElseGet(() -> Either.right(this.id_class(var3))));
      }
   }

   protected void id_class(long var1, boolean var3) {
      for (Long2ObjectLinkedOpenHashMap var5 : this.id_break) {
         List var6 = (List)var5.get(var1);
         if (var6 != null) {
            if (var3) {
               var6.clear();
            } else {
               var6.removeIf(var0 -> !var0.isPresent());
            }

            if (var6.isEmpty()) {
               var5.remove(var1);
            }
         }
      }

      while (this.id_byte < id_class && this.id_break.get(this.id_byte).isEmpty()) {
         this.id_byte++;
      }

      this.id_throws.remove(var1);
   }

   LongSet id_break() {
      return new LongOpenHashSet(this.id_throws);
   }
}
