package celestial;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rVM<T> implements rVG<T> {
   private final rVE<T> id_break;
   private final rVG<T> id_byte = (var0, var1x) -> 0;
   private final rqE_2<T> id_protected;
   private final Function<rcd_3, T> id_throws;
   private final Function<T, rcd_3> id_case;
   private final T id_catch;
   protected ryl_3 id_class;
   private rVE<T> id_private;
   private int id_implements;
   private final ReentrantLock id_finally = new ReentrantLock();

   public int id_byte() {
      return 1 + this.id_private.id_class() + ruu_3.id_class(this.id_class.id_break()) + this.id_class.id_class().length * 8;
   }

   public rVM(rVE<T> var1, rqE_2<T> var2, Function<rcd_3, T> var3, Function<T, rcd_3> var4, T var5) {
      this.id_break = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = (T)var5;
      this.id_break(4);
   }

   public boolean id_class(Predicate<T> var1) {
      return this.id_private.id_class(var1);
   }

   public void id_class(rcd_3 var1, String var2, String var3) {
      this.id_class();
      rVs_1 var4 = new rVs_1<>(this.id_protected, this.id_implements, this.id_byte, this.id_throws, this.id_case);
      Object var5 = this.id_catch;
      int var6 = var4.id_class(this.id_catch);
      int[] var7 = new int[4096];

      for (int var8 = 0; var8 < 4096; var8++) {
         Object var9 = this.id_class(var8);
         if (var9 != var5) {
            var5 = var9;
            var6 = var4.id_class(var9);
         }

         var7[var8] = var6;
      }

      rcy_3 var12 = new rcy_3();
      var4.id_break(var12);
      var1.id_class(var2, var12);
      int var13 = Math.max(4, rfU_2.id_throws(var12.size()));
      ryl_3 var10 = new ryl_3(var13, 4096);

      for (int var11 = 0; var11 < var7.length; var11++) {
         var10.id_break(var11, var7[var11]);
      }

      var1.id_class(var3, var10.id_class());
      this.id_break();
   }

   public void id_class(rcy_3 var1, long[] var2) {
      this.id_class();
      int var3 = Math.max(4, rfU_2.id_throws(var1.size()));
      if (var3 != this.id_implements) {
         this.id_break(var3);
      }

      this.id_private.id_class(var1);
      int var4 = var2.length * 64 / 4096;
      if (this.id_private == this.id_break) {
         rVs_1 var5 = new rVs_1<>(this.id_protected, var3, this.id_byte, this.id_throws, this.id_case);
         var5.id_class(var1);
         ryl_3 var6 = new ryl_3(var3, 4096, var2);

         for (int var7 = 0; var7 < 4096; var7++) {
            this.id_class.id_break(var7, this.id_break.id_class((T)var5.id_class(var6.id_class(var7))));
         }
      } else if (var4 == this.id_implements) {
         System.arraycopy(var2, 0, this.id_class.id_class(), 0, var2.length);
      } else {
         ryl_3 var8 = new ryl_3(var4, 4096, var2);

         for (int var9 = 0; var9 < 4096; var9++) {
            this.id_class.id_break(var9, var8.id_class(var9));
         }
      }

      this.id_break();
   }

   public void id_class(ruu_3 var1) {
      this.id_class();
      byte var2 = var1.readByte();
      if (this.id_implements != var2) {
         this.id_break(var2);
      }

      this.id_private.id_class(var1);
      var1.id_break(this.id_class.id_class());
      this.id_break();
   }

   public void id_class() {
      if (this.id_finally.isLocked() && !this.id_finally.isHeldByCurrentThread()) {
         String var1 = Thread.getAllStackTraces()
            .keySet()
            .stream()
            .filter(Objects::nonNull)
            .map(var0 -> var0.getName() + ": \n\tat " + Arrays.stream(var0.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat ")))
            .collect(Collectors.joining("\n"));
         KY var2 = new KY("Writing into PalettedContainer from multiple threads", new IllegalStateException());
         Ko_1 var3 = var2.id_class("Thread dumps");
         var3.id_class("Thread dumps", var1);
         throw new KU(var2);
      } else {
         this.id_finally.lock();
      }
   }

   public void id_class(rVO<T> var1) {
      Int2IntOpenHashMap var2 = new Int2IntOpenHashMap();
      this.id_class.id_class(var1x -> var2.put(var1x, var2.get(var1x) + 1));
      var2.int2IntEntrySet().forEach(var2x -> var1.accept(this.id_private.id_class(var2x.getIntKey()), var2x.getIntValue()));
   }

   protected T id_class(int var1, T var2) {
      int var3 = this.id_private.id_class((T)var2);
      int var4 = this.id_class.id_class(var1, var3);
      Object var5 = this.id_private.id_class(var4);
      return (T)(var5 == null ? this.id_catch : var5);
   }

   public T id_class(int var1, int var2, int var3, T var4) {
      this.id_class();
      Object var5 = this.id_class(id_break(var1, var2, var3), (T)var4);
      this.id_break();
      return (T)var5;
   }

   public T id_class(int var1, int var2, int var3) {
      return this.id_class(id_break(var1, var2, var3));
   }

   public T id_class(int var1) {
      Object var2 = this.id_private.id_class(this.id_class.id_class(var1));
      return (T)(var2 == null ? this.id_catch : var2);
   }

   private static int id_break(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   private void id_break(int var1) {
      if (var1 != this.id_implements) {
         this.id_implements = var1;
         if (this.id_implements <= 4) {
            this.id_implements = 4;
            this.id_private = new rVS<>(this.id_protected, this.id_implements, this, this.id_throws);
         } else if (this.id_implements < 9) {
            this.id_private = new rVs_1<>(this.id_protected, this.id_implements, this, this.id_throws, this.id_case);
         } else {
            this.id_private = this.id_break;
            this.id_implements = rfU_2.id_throws(this.id_protected.id_class());
         }

         this.id_private.id_class(this.id_catch);
         this.id_class = new ryl_3(this.id_implements, 4096);
      }
   }

   public void id_break() {
      this.id_finally.unlock();
   }

   public void id_break(ruu_3 var1) {
      this.id_class();
      var1.writeByte(this.id_implements);
      this.id_private.id_break(var1);
      var1.id_class(this.id_class.id_class());
      this.id_break();
   }

   public T id_break(int var1, int var2, int var3, T var4) {
      return this.id_class(id_break(var1, var2, var3), (T)var4);
   }

   protected void id_break(int var1, T var2) {
      int var3 = this.id_private.id_class((T)var2);
      this.id_class.id_break(var1, var3);
   }

   @Override
   public int onResize(int var1, T var2) {
      this.id_class();
      ryl_3 var3 = this.id_class;
      rVE var4 = this.id_private;
      this.id_break(var1);

      for (int var5 = 0; var5 < var3.id_break(); var5++) {
         Object var6 = var4.id_class(var3.id_class(var5));
         if (var6 != null) {
            this.id_break(var5, (T)var6);
         }
      }

      int var7 = this.id_private.id_class((T)var2);
      this.id_break();
      return var7;
   }
}
