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
   public static final int class_ = rrEx_1.break_ + 2 + 32;
   private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> break_ = IntStream.range(0, class_)
      .mapToObj(var0 -> new Long2ObjectLinkedOpenHashMap())
      .collect(Collectors.toList());
   private volatile int byte_ = class_;
   private final String protected_;
   private final LongSet throws_ = new LongOpenHashSet();
   private final int case_;

   public rov_3(String var1, int var2) {
      this.protected_ = var1;
      this.case_ = var2;
   }

   @Override
   public String toString() {
      return this.protected_ + " " + this.byte_ + "...";
   }

   protected void class_(Optional<T> var1, long var2, int var4) {
      ((List)this.break_.get(var4).computeIfAbsent(var2, var0 -> Lists.newArrayList())).add(var1);
      this.byte_ = Math.min(this.byte_, var4);
   }

   protected void class_(int var1, rfj_3 var2, int var3) {
      if (var1 < class_) {
         Long2ObjectLinkedOpenHashMap var4 = this.break_.get(var1);
         List var5 = (List)var4.remove(var2.class_());
         if (var1 == this.byte_) {
            while (this.byte_ < class_ && this.break_.get(this.byte_).isEmpty()) {
               this.byte_++;
            }
         }

         if (var5 != null && !var5.isEmpty()) {
            ((List)this.break_.get(var3).computeIfAbsent(var2.class_(), var0 -> Lists.newArrayList())).addAll(var5);
            this.byte_ = Math.min(this.byte_, var3);
         }
      }
   }

   private Runnable class_(long var1) {
      return () -> this.throws_.add(var1);
   }

   public Stream<Object> class_() {
      if (this.throws_.size() >= this.case_) {
         return null;
      } else if (this.byte_ >= class_) {
         return null;
      } else {
         int var1 = this.byte_;
         Long2ObjectLinkedOpenHashMap var2 = this.break_.get(var1);
         long var3 = var2.firstLongKey();
         List var5 = (List)var2.removeFirst();

         while (this.byte_ < class_ && this.break_.get(this.byte_).isEmpty()) {
            this.byte_++;
         }

         return var5.stream().map(var3x -> var3x.<Either>map(Either::left).orElseGet(() -> Either.right(this.class_(var3))));
      }
   }

   protected void class_(long var1, boolean var3) {
      for (Long2ObjectLinkedOpenHashMap var5 : this.break_) {
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

      while (this.byte_ < class_ && this.break_.get(this.byte_).isEmpty()) {
         this.byte_++;
      }

      this.throws_.remove(var1);
   }

   LongSet break_() {
      return new LongOpenHashSet(this.throws_);
   }
}
