package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrEL {
   private static final Logger id_class = LogManager.getLogger();
   static final int id_break = 33 + roN_2.id_class(roN_2.id_volatile) - 2;
   final Long2ObjectMap<ObjectSet<rhN_2>> id_byte = new Long2ObjectOpenHashMap();
   final Long2ObjectOpenHashMap<rqv_3<rrEF<?>>> id_protected = new Long2ObjectOpenHashMap();
   private final rrEA id_throws = new rrEA(this);
   private final rrEn_1 id_case = new rrEn_1(this, 8);
   private final rrEC id_catch = new rrEC(this, 65);
   final Set<rrEG> id_private = Sets.newHashSet();
   final roF_2 id_implements;
   final rTX<roL_2<Runnable>> id_finally;
   final rTX<roA_2> id_extends;
   final LongSet id_native = new LongOpenHashSet();
   final Executor id_volatile;
   private long id_final;
   private final Long2ObjectOpenHashMap<rqv_3<rrEF<?>>> id_package = new Long2ObjectOpenHashMap();

   public <T> void id_byte(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.id_class(var2.id_class(), new rrEF<>(var1, 33 - var3, var4));
   }

   public String id_byte() {
      return this.id_implements.id_class();
   }

   protected String id_byte(long var1) {
      rqv_3 var3 = (rqv_3)this.id_protected.get(var1);
      String var4;
      if (var3 != null && !var3.isEmpty()) {
         var4 = ((rrEF)var3.id_class()).toString();
      } else {
         var4 = "no_ticket";
      }

      return var4;
   }

   protected rrEL(Executor var1, Executor var2) {
      rTX var3 = rTX.id_class("player ticket throttler", var2::execute);
      roF_2 var4 = new roF_2(ImmutableList.of(var3), var1, 4);
      this.id_implements = var4;
      this.id_finally = var4.id_class(var3, true);
      this.id_extends = var4.id_class(var3);
      this.id_volatile = var2;
   }

   public void id_class(rjh_3 var1, rhN_2 var2) {
      long var3 = var1.id_new().id_class();
      ((ObjectSet)this.id_byte.computeIfAbsent(var3, var0 -> new ObjectOpenHashSet())).add(var2);
      this.id_case.id_break(var3, 0, true);
      this.id_catch.id_break(var3, 0, true);
   }

   protected void id_class(rfj_3 var1, boolean var2) {
      rrEF var3 = new rrEF<>(rrEl_1.id_protected, 31, var1);
      if (var2) {
         this.id_class(var1.id_class(), var3);
      } else {
         this.id_break(var1.id_class(), var3);
      }
   }

   protected void id_class() {
      this.id_final++;
      ObjectIterator var1 = this.id_protected.long2ObjectEntrySet().fastIterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         if (((rqv_3)var2.getValue()).removeIf(var1x -> var1x.id_break(this.id_final))) {
            this.id_throws.id_break(var2.getLongKey(), id_class((rqv_3<rrEF<?>>)var2.getValue()), false);
         }

         if (((rqv_3)var2.getValue()).isEmpty()) {
            var1.remove();
         }
      }
   }

   protected void id_class(int var1) {
      this.id_catch.id_break(var1);
   }

   private static int id_class(rqv_3<rrEF<?>> var0) {
      return !var0.isEmpty() ? ((rrEF)var0.id_class()).id_break() : rrEx_1.id_break + 1;
   }

   public boolean id_class(rrEx_1 var1) {
      this.id_case.id_class();
      this.id_catch.id_class();
      int var2 = Integer.MAX_VALUE - this.id_throws.id_break(Integer.MAX_VALUE);
      boolean var3 = var2 != 0;
      if (var3) {
      }

      if (!this.id_private.isEmpty()) {
         this.id_private.forEach(var1x -> var1x.id_class(var1));
         this.id_private.clear();
         return true;
      } else {
         if (!this.id_native.isEmpty()) {
            LongIterator var4 = this.id_native.iterator();

            while (var4.hasNext()) {
               long var5 = var4.nextLong();
               if (this.id_case(var5).stream().anyMatch(var0 -> var0.id_class() == rrEl_1.id_byte)) {
                  rrEG var7 = var1.id_class(var5);
                  if (var7 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture var8 = var7.id_break();
                  var8.thenAccept(var3x -> this.id_volatile.execute(() -> this.id_extends.id_class(roF_2.id_class(() -> {
                        }, var5, false))));
               }
            }

            this.id_native.clear();
         }

         return var3;
      }
   }

   void id_class(long var1, rrEF<?> var3) {
      rqv_3 var4 = this.id_case(var1);
      int var5 = id_class(var4);
      rrEF var6 = var4.id_class(var3);
      var6.id_class(this.id_final);
      if (var3.id_break() < var5) {
         this.id_throws.id_break(var1, var3.id_break(), true);
      }

      if (rrxr_3.id_break(var3, rrxr_3.Pj)) {
         rqv_3 var7 = (rqv_3)this.id_package.computeIfAbsent(var1, var0 -> rqv_3.id_class(4));
         var7.id_class(var6);
      }
   }

   protected abstract rrEG id_class(long var1, int var3, rrEG var4, int var5);

   protected abstract boolean id_class(long var1);

   public <T> void id_class(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.id_class(var2.id_class(), new rrEF<>(var1, var3, var4));
   }

   protected abstract rrEG id_break(long var1);

   public <T> void id_break(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = new rrEF<>(var1, var3, var4);
      this.id_break(var2.id_class(), var5);
   }

   public void id_break(rjh_3 var1, rhN_2 var2) {
      long var3 = var1.id_new().id_class();
      ObjectSet var5 = (ObjectSet)this.id_byte.get(var3);
      var5.remove(var2);
      if (var5.isEmpty()) {
         this.id_byte.remove(var3);
         this.id_case.id_break(var3, Integer.MAX_VALUE, false);
         this.id_catch.id_break(var3, Integer.MAX_VALUE, false);
      }
   }

   void id_break(long var1, rrEF<?> var3) {
      rqv_3 var4 = this.id_case(var1);
      if (var4.remove(var3)) {
      }

      if (var4.isEmpty()) {
         this.id_protected.remove(var1);
      }

      this.id_throws.id_break(var1, id_class(var4), false);
      if (rrxr_3.id_break(var3, rrxr_3.Pj)) {
         rqv_3 var5 = (rqv_3)this.id_package.get(var1);
         if (var5 != null) {
            var5.remove(var3);
         }
      }
   }

   public int id_break() {
      this.id_case.id_class();
      return this.id_case.id_class.size();
   }

   public <T> void id_throws(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = (rrEF)rrxr_3.Pf.id_class(var1, 33 - var3, var4, true);
      this.id_class(var2.id_class(), var5);
   }

   public boolean id_throws(long var1) {
      rqv_3 var3 = (rqv_3)this.id_package.get(var1);
      return var3 != null && !var3.isEmpty();
   }

   private rqv_3<rrEF<?>> id_case(long var1) {
      return (rqv_3<rrEF<?>>)this.id_protected.computeIfAbsent(var1, var0 -> rqv_3.id_class(4));
   }

   public <T> void id_case(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = (rrEF)rrxr_3.Pf.id_class(var1, 33 - var3, var4, true);
      this.id_break(var2.id_class(), var5);
   }

   public boolean id_protected(long var1) {
      this.id_case.id_class();
      return this.id_case.id_class.containsKey(var1);
   }

   public <T> void id_protected(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = new rrEF<>(var1, 33 - var3, var4);
      this.id_break(var2.id_class(), var5);
   }
}
