package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rVM<T> implements rVG<T> {
   private final rVE<T> break_;
   private final rVG<T> byte_ = (var0, var1x) -> 0;
   private final rqE_2<T> protected_;
   private final Function<rcd_3, T> throws_;
   private final Function<T, rcd_3> case_;
   private final T catch_;
   protected ryl_3 class_;
   private rVE<T> private_;
   private int implements_;
   private final ReentrantLock finally_ = new ReentrantLock();

   public int byte_() {
      return 1 + this.private_.class_() + ruu_3.class_(this.class_.break_()) + this.class_.class_().length * 8;
   }

   public rVM(rVE<T> var1, rqE_2<T> var2, Function<rcd_3, T> var3, Function<T, rcd_3> var4, T var5) {
      this.break_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = (T)var5;
      this.break_(4);
   }

   public boolean class_(Predicate<T> var1) {
      return this.private_.class_(var1);
   }

   public void class_(rcd_3 var1, String var2, String var3) {
      this.class_();
      rVs_1 var4 = new rVs_1<>(this.protected_, this.implements_, this.byte_, this.throws_, this.case_);
      Object var5 = this.catch_;
      int var6 = var4.class_(this.catch_);
      int[] var7 = new int[4096];

      for (int var8 = 0; var8 < 4096; var8++) {
         Object var9 = this.class_(var8);
         if (var9 != var5) {
            var5 = var9;
            var6 = var4.class_(var9);
         }

         var7[var8] = var6;
      }

      rcy_3 var12 = new rcy_3();
      var4.break_(var12);
      var1.class_(var2, var12);
      int var13 = Math.max(4, rfU_2.throws_(var12.size()));
      ryl_3 var10 = new ryl_3(var13, 4096);

      for (int var11 = 0; var11 < var7.length; var11++) {
         var10.break_(var11, var7[var11]);
      }

      var1.class_(var3, var10.class_());
      this.break_();
   }

   public void class_(rcy_3 var1, long[] var2) {
      this.class_();
      int var3 = Math.max(4, rfU_2.throws_(var1.size()));
      if (var3 != this.implements_) {
         this.break_(var3);
      }

      this.private_.class_(var1);
      int var4 = var2.length * 64 / 4096;
      if (this.private_ == this.break_) {
         rVs_1 var5 = new rVs_1<>(this.protected_, var3, this.byte_, this.throws_, this.case_);
         var5.class_(var1);
         ryl_3 var6 = new ryl_3(var3, 4096, var2);

         for (int var7 = 0; var7 < 4096; var7++) {
            this.class_.break_(var7, this.break_.class_((T)var5.class_(var6.class_(var7))));
         }
      } else if (var4 == this.implements_) {
         System.arraycopy(var2, 0, this.class_.class_(), 0, var2.length);
      } else {
         ryl_3 var8 = new ryl_3(var4, 4096, var2);

         for (int var9 = 0; var9 < 4096; var9++) {
            this.class_.break_(var9, var8.class_(var9));
         }
      }

      this.break_();
   }

   public void class_(ruu_3 var1) {
      this.class_();
      byte var2 = var1.readByte();
      if (this.implements_ != var2) {
         this.break_(var2);
      }

      this.private_.class_(var1);
      var1.break_(this.class_.class_());
      this.break_();
   }

   public void class_() {
      if (this.finally_.isLocked() && !this.finally_.isHeldByCurrentThread()) {
         String var1 = Thread.getAllStackTraces()
            .keySet()
            .stream()
            .filter(Objects::nonNull)
            .map(var0 -> var0.getName() + ": \n\tat " + Arrays.stream(var0.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat ")))
            .collect(Collectors.joining("\n"));
         KY var2 = new KY("Writing into PalettedContainer from multiple threads", new IllegalStateException());
         Ko_1 var3 = var2.class_("Thread dumps");
         var3.class_("Thread dumps", var1);
         throw new KU(var2);
      } else {
         this.finally_.lock();
      }
   }

   public void class_(rVO<T> var1) {
      Int2IntOpenHashMap var2 = new Int2IntOpenHashMap();
      this.class_.class_(var1x -> var2.put(var1x, var2.get(var1x) + 1));
      var2.int2IntEntrySet().forEach(var2x -> var1.accept(this.private_.class_(var2x.getIntKey()), var2x.getIntValue()));
   }

   protected T class_(int var1, T var2) {
      int var3 = this.private_.class_((T)var2);
      int var4 = this.class_.class_(var1, var3);
      Object var5 = this.private_.class_(var4);
      return (T)(var5 == null ? this.catch_ : var5);
   }

   public T class_(int var1, int var2, int var3, T var4) {
      this.class_();
      Object var5 = this.class_(break_(var1, var2, var3), (T)var4);
      this.break_();
      return (T)var5;
   }

   public T class_(int var1, int var2, int var3) {
      return this.class_(break_(var1, var2, var3));
   }

   public T class_(int var1) {
      Object var2 = this.private_.class_(this.class_.class_(var1));
      return (T)(var2 == null ? this.catch_ : var2);
   }

   private static int break_(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   private void break_(int var1) {
      if (var1 != this.implements_) {
         this.implements_ = var1;
         if (this.implements_ <= 4) {
            this.implements_ = 4;
            this.private_ = new rVS<>(this.protected_, this.implements_, this, this.throws_);
         } else if (this.implements_ < 9) {
            this.private_ = new rVs_1<>(this.protected_, this.implements_, this, this.throws_, this.case_);
         } else {
            this.private_ = this.break_;
            this.implements_ = rfU_2.throws_(this.protected_.class_());
         }

         this.private_.class_(this.catch_);
         this.class_ = new ryl_3(this.implements_, 4096);
      }
   }

   public void break_() {
      this.finally_.unlock();
   }

   public void break_(ruu_3 var1) {
      this.class_();
      var1.writeByte(this.implements_);
      this.private_.break_(var1);
      var1.class_(this.class_.class_());
      this.break_();
   }

   public T break_(int var1, int var2, int var3, T var4) {
      return this.class_(break_(var1, var2, var3), (T)var4);
   }

   protected void break_(int var1, T var2) {
      int var3 = this.private_.class_((T)var2);
      this.class_.break_(var1, var3);
   }

   @Override
   public int onResize(int var1, T var2) {
      this.class_();
      ryl_3 var3 = this.class_;
      rVE var4 = this.private_;
      this.break_(var1);

      for (int var5 = 0; var5 < var3.break_(); var5++) {
         Object var6 = var4.class_(var3.class_(var5));
         if (var6 != null) {
            this.break_(var5, (T)var6);
         }
      }

      int var7 = this.private_.class_((T)var2);
      this.break_();
      return var7;
   }
}
