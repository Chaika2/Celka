package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.util.function.LongPredicate;

public abstract class rrsw_3 {
   private final int id_class;
   private final LongLinkedOpenHashSet[] id_break;
   private final Long2ByteMap id_byte;
   private int id_protected;
   private volatile boolean id_throws;

   public int id_byte() {
      return this.id_byte.size();
   }

   protected abstract int id_byte(long var1);

   protected rrsw_3(int var1, int var2, int var3) {
      if (var1 >= 254) {
         throw new IllegalArgumentException("Level count must be < 254.");
      } else {
         this.id_class = var1;
         this.id_break = new LongLinkedOpenHashSet[var1];
         int var4 = var2;
         int var5 = var3;
         if (this.getClass() == rrsH_2.class || this.getClass() == rrso_3.class) {
            var4 = Math.max(var2, 8192);
            var5 = Math.max(var3, 8192);
         } else if (this.getClass() == rrsy_3.class || this.getClass() == rrsK_2.class) {
            var4 = Math.max(var2, 2048);
            var5 = Math.max(var3, 2048);
         }

         for (int var6 = 0; var6 < var1; var6++) {
            this.id_break[var6] = new rrsI_2(this, var4, 0.5F, var2);
         }

         this.id_byte = new rrsf_3(this, var5, 0.5F, var3);
         this.id_byte.defaultReturnValue((byte)-1);
         this.id_protected = var1;
      }
   }

   private void id_class(long var1, long var3, int var5, int var6, int var7, boolean var8) {
      if (!this.id_class(var3)) {
         var5 = rfU_2.id_class(var5, 0, this.id_class - 1);
         var6 = rfU_2.id_class(var6, 0, this.id_class - 1);
         boolean var9;
         if (var7 == 255) {
            var9 = true;
            var7 = var6;
         } else {
            var9 = false;
         }

         int var10;
         if (var8) {
            var10 = Math.min(var7, var5);
         } else {
            var10 = rfU_2.id_class(this.id_class(var3, var1, var5), 0, this.id_class - 1);
         }

         int var11 = this.id_class(var6, var7);
         if (var6 != var10) {
            int var12 = this.id_class(var6, var10);
            if (var11 != var12 && !var9) {
               this.id_class(var3, var11, var12, false);
            }

            this.id_class(var3, var10, var12);
         } else if (!var9) {
            this.id_class(var3, var11, this.id_class, true);
         }
      }
   }

   protected final int id_class(int var1) {
      if (this.id_protected >= this.id_class) {
         return var1;
      } else {
         while (this.id_protected < this.id_class && var1 > 0) {
            var1--;
            LongLinkedOpenHashSet var2 = this.id_break[this.id_protected];
            long var3 = var2.removeFirstLong();
            int var5 = rfU_2.id_class(this.id_byte(var3), 0, this.id_class - 1);
            if (var2.isEmpty()) {
               this.id_break(this.id_class);
            }

            int var6 = this.id_byte.remove(var3) & 255;
            if (var6 < var5) {
               this.id_class(var3, var6);
               this.id_class(var3, var6, true);
            } else if (var6 > var5) {
               this.id_class(var3, var6, this.id_class(this.id_class - 1, var6));
               this.id_class(var3, this.id_class - 1);
               this.id_class(var3, var5, false);
            }
         }

         this.id_throws = this.id_protected < this.id_class;
         return var1;
      }
   }

   protected abstract void id_class(long var1, int var3);

   protected abstract void id_class(long var1, int var3, boolean var4);

   protected abstract int id_class(long var1, long var3, int var5);

   protected abstract boolean id_class(long var1);

   private void id_class(long var1, int var3, int var4, boolean var5) {
      if (var5) {
         this.id_byte.remove(var1);
      }

      this.id_break[var3].remove(var1);
      if (this.id_break[var3].isEmpty() && this.id_protected == var3) {
         this.id_break(var4);
      }
   }

   public void id_class(LongPredicate var1) {
      LongArrayList var2 = new LongArrayList();
      this.id_byte.keySet().forEach(var2x -> {
         if (var1.test(var2x)) {
            var2.add(var2x);
         }
      });
      var2.forEach(this::id_throws);
   }

   private int id_class(int var1, int var2) {
      int var3 = var1;
      if (var1 > var2) {
         var3 = var2;
      }

      if (var3 > this.id_class - 1) {
         var3 = this.id_class - 1;
      }

      return var3;
   }

   protected void id_class(long var1, long var3, int var5, boolean var6) {
      this.id_class(var1, var3, var5, this.id_byte(var3), this.id_byte.get(var3) & 255, var6);
      this.id_throws = this.id_protected < this.id_class;
   }

   private void id_class(long var1, int var3, int var4) {
      this.id_byte.put(var1, (byte)var3);
      this.id_break[var4].add(var1);
      if (this.id_protected > var4) {
         this.id_protected = var4;
      }
   }

   private void id_break(int var1) {
      int var2 = this.id_protected;
      this.id_protected = var1;

      for (int var3 = var2 + 1; var3 < var1; var3++) {
         if (!this.id_break[var3].isEmpty()) {
            this.id_protected = var3;
            break;
         }
      }
   }

   protected abstract int id_break(long var1, long var3, int var5);

   protected final void id_break(long var1, long var3, int var5, boolean var6) {
      int var7 = this.id_byte.get(var3) & 255;
      int var8 = rfU_2.id_class(this.id_break(var1, var3, var5), 0, this.id_class - 1);
      if (var6) {
         this.id_class(var1, var3, var8, this.id_byte(var3), var7, true);
      } else {
         int var9;
         boolean var10;
         if (var7 == 255) {
            var10 = true;
            var9 = rfU_2.id_class(this.id_byte(var3), 0, this.id_class - 1);
         } else {
            var9 = var7;
            var10 = false;
         }

         if (var8 == var9) {
            this.id_class(var1, var3, this.id_class - 1, var10 ? var9 : this.id_byte(var3), var7, false);
         }
      }
   }

   protected final boolean id_break() {
      return this.id_throws;
   }

   protected void id_throws(long var1) {
      int var3 = this.id_byte.get(var1) & 255;
      if (var3 != 255) {
         int var4 = this.id_byte(var1);
         int var5 = this.id_class(var4, var3);
         this.id_class(var1, var5, this.id_class, true);
         this.id_throws = this.id_protected < this.id_class;
      }
   }

   protected void id_case(long var1) {
      this.id_class(var1, var1, this.id_class - 1, false);
   }

   protected int id_protected() {
      return this.id_byte.size();
   }
}
