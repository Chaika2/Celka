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
   private static final Logger class_ = LogManager.getLogger();
   static final int break_ = 33 + roN_2.class_(roN_2.volatile_) - 2;
   final Long2ObjectMap<ObjectSet<rhN_2>> byte_ = new Long2ObjectOpenHashMap();
   final Long2ObjectOpenHashMap<rqv_3<rrEF<?>>> protected_ = new Long2ObjectOpenHashMap();
   private final rrEA throws_ = new rrEA(this);
   private final rrEn_1 case_ = new rrEn_1(this, 8);
   private final rrEC catch_ = new rrEC(this, 65);
   final Set<rrEG> private_ = Sets.newHashSet();
   final roF_2 implements_;
   final rTX<roL_2<Runnable>> finally_;
   final rTX<roA_2> extends_;
   final LongSet native_ = new LongOpenHashSet();
   final Executor volatile_;
   private long final_;
   private final Long2ObjectOpenHashMap<rqv_3<rrEF<?>>> package_ = new Long2ObjectOpenHashMap();

   public <T> void byte_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.class_(var2.class_(), new rrEF<>(var1, 33 - var3, var4));
   }

   public String byte_() {
      return this.implements_.class_();
   }

   protected String byte_(long var1) {
      rqv_3 var3 = (rqv_3)this.protected_.get(var1);
      String var4;
      if (var3 != null && !var3.isEmpty()) {
         var4 = ((rrEF)var3.class_()).toString();
      } else {
         var4 = "no_ticket";
      }

      return var4;
   }

   protected rrEL(Executor var1, Executor var2) {
      rTX var3 = rTX.class_("player ticket throttler", var2::execute);
      roF_2 var4 = new roF_2(ImmutableList.of(var3), var1, 4);
      this.implements_ = var4;
      this.finally_ = var4.class_(var3, true);
      this.extends_ = var4.class_(var3);
      this.volatile_ = var2;
   }

   public void class_(rjh_3 var1, rhN_2 var2) {
      long var3 = var1.new_().class_();
      ((ObjectSet)this.byte_.computeIfAbsent(var3, var0 -> new ObjectOpenHashSet())).add(var2);
      this.case_.break_(var3, 0, true);
      this.catch_.break_(var3, 0, true);
   }

   protected void class_(rfj_3 var1, boolean var2) {
      rrEF var3 = new rrEF<>(rrEl_1.protected_, 31, var1);
      if (var2) {
         this.class_(var1.class_(), var3);
      } else {
         this.break_(var1.class_(), var3);
      }
   }

   protected void class_() {
      this.final_++;
      ObjectIterator var1 = this.protected_.long2ObjectEntrySet().fastIterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         if (((rqv_3)var2.getValue()).removeIf(var1x -> var1x.break_(this.final_))) {
            this.throws_.break_(var2.getLongKey(), class_((rqv_3<rrEF<?>>)var2.getValue()), false);
         }

         if (((rqv_3)var2.getValue()).isEmpty()) {
            var1.remove();
         }
      }
   }

   protected void class_(int var1) {
      this.catch_.break_(var1);
   }

   private static int class_(rqv_3<rrEF<?>> var0) {
      return !var0.isEmpty() ? ((rrEF)var0.class_()).break_() : rrEx_1.break_ + 1;
   }

   public boolean class_(rrEx_1 var1) {
      this.case_.class_();
      this.catch_.class_();
      int var2 = Integer.MAX_VALUE - this.throws_.break_(Integer.MAX_VALUE);
      boolean var3 = var2 != 0;
      if (var3) {
      }

      if (!this.private_.isEmpty()) {
         this.private_.forEach(var1x -> var1x.class_(var1));
         this.private_.clear();
         return true;
      } else {
         if (!this.native_.isEmpty()) {
            LongIterator var4 = this.native_.iterator();

            while (var4.hasNext()) {
               long var5 = var4.nextLong();
               if (this.case_(var5).stream().anyMatch(var0 -> var0.class_() == rrEl_1.byte_)) {
                  rrEG var7 = var1.class_(var5);
                  if (var7 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture var8 = var7.break_();
                  var8.thenAccept(var3x -> this.volatile_.execute(() -> this.extends_.class_(roF_2.class_(() -> {
                        }, var5, false))));
               }
            }

            this.native_.clear();
         }

         return var3;
      }
   }

   void class_(long var1, rrEF<?> var3) {
      rqv_3 var4 = this.case_(var1);
      int var5 = class_(var4);
      rrEF var6 = var4.class_(var3);
      var6.class_(this.final_);
      if (var3.break_() < var5) {
         this.throws_.break_(var1, var3.break_(), true);
      }

      if (rrxr_3.break_(var3, rrxr_3.Pj)) {
         rqv_3 var7 = (rqv_3)this.package_.computeIfAbsent(var1, var0 -> rqv_3.class_(4));
         var7.class_(var6);
      }
   }

   protected abstract rrEG class_(long var1, int var3, rrEG var4, int var5);

   protected abstract boolean class_(long var1);

   public <T> void class_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      this.class_(var2.class_(), new rrEF<>(var1, var3, var4));
   }

   protected abstract rrEG break_(long var1);

   public <T> void break_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = new rrEF<>(var1, var3, var4);
      this.break_(var2.class_(), var5);
   }

   public void break_(rjh_3 var1, rhN_2 var2) {
      long var3 = var1.new_().class_();
      ObjectSet var5 = (ObjectSet)this.byte_.get(var3);
      var5.remove(var2);
      if (var5.isEmpty()) {
         this.byte_.remove(var3);
         this.case_.break_(var3, Integer.MAX_VALUE, false);
         this.catch_.break_(var3, Integer.MAX_VALUE, false);
      }
   }

   void break_(long var1, rrEF<?> var3) {
      rqv_3 var4 = this.case_(var1);
      if (var4.remove(var3)) {
      }

      if (var4.isEmpty()) {
         this.protected_.remove(var1);
      }

      this.throws_.break_(var1, class_(var4), false);
      if (rrxr_3.break_(var3, rrxr_3.Pj)) {
         rqv_3 var5 = (rqv_3)this.package_.get(var1);
         if (var5 != null) {
            var5.remove(var3);
         }
      }
   }

   public int break_() {
      this.case_.class_();
      return this.case_.class_.size();
   }

   public <T> void throws_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = (rrEF)rrxr_3.Pf.class_(var1, 33 - var3, var4, true);
      this.class_(var2.class_(), var5);
   }

   public boolean throws_(long var1) {
      rqv_3 var3 = (rqv_3)this.package_.get(var1);
      return var3 != null && !var3.isEmpty();
   }

   private rqv_3<rrEF<?>> case_(long var1) {
      return (rqv_3<rrEF<?>>)this.protected_.computeIfAbsent(var1, var0 -> rqv_3.class_(4));
   }

   public <T> void case_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = (rrEF)rrxr_3.Pf.class_(var1, 33 - var3, var4, true);
      this.break_(var2.class_(), var5);
   }

   public boolean protected_(long var1) {
      this.case_.class_();
      return this.case_.class_.containsKey(var1);
   }

   public <T> void protected_(rrEl_1<T> var1, rfj_3 var2, int var3, T var4) {
      rrEF var5 = new rrEF<>(var1, 33 - var3, var4);
      this.break_(var2.class_(), var5);
   }
}
