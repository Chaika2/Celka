package celestial;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.util.function.LongPredicate;

public abstract class rrsw_3 {
   private final int class_;
   private final LongLinkedOpenHashSet[] break_;
   private final Long2ByteMap byte_;
   private int protected_;
   private volatile boolean throws_;

   public int byte_() {
      return this.byte_.size();
   }

   protected abstract int byte_(long var1);

   protected rrsw_3(int var1, int var2, int var3) {
      if (var1 >= 254) {
         throw new IllegalArgumentException("Level count must be < 254.");
      } else {
         this.class_ = var1;
         this.break_ = new LongLinkedOpenHashSet[var1];
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
            this.break_[var6] = new rrsI_2(this, var4, 0.5F, var2);
         }

         this.byte_ = new rrsf_3(this, var5, 0.5F, var3);
         this.byte_.defaultReturnValue((byte)-1);
         this.protected_ = var1;
      }
   }

   private void class_(long var1, long var3, int var5, int var6, int var7, boolean var8) {
      if (!this.class_(var3)) {
         var5 = rfU_2.class_(var5, 0, this.class_ - 1);
         var6 = rfU_2.class_(var6, 0, this.class_ - 1);
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
            var10 = rfU_2.class_(this.class_(var3, var1, var5), 0, this.class_ - 1);
         }

         int var11 = this.class_(var6, var7);
         if (var6 != var10) {
            int var12 = this.class_(var6, var10);
            if (var11 != var12 && !var9) {
               this.class_(var3, var11, var12, false);
            }

            this.class_(var3, var10, var12);
         } else if (!var9) {
            this.class_(var3, var11, this.class_, true);
         }
      }
   }

   protected final int class_(int var1) {
      if (this.protected_ >= this.class_) {
         return var1;
      } else {
         while (this.protected_ < this.class_ && var1 > 0) {
            var1--;
            LongLinkedOpenHashSet var2 = this.break_[this.protected_];
            long var3 = var2.removeFirstLong();
            int var5 = rfU_2.class_(this.byte_(var3), 0, this.class_ - 1);
            if (var2.isEmpty()) {
               this.break_(this.class_);
            }

            int var6 = this.byte_.remove(var3) & 255;
            if (var6 < var5) {
               this.class_(var3, var6);
               this.class_(var3, var6, true);
            } else if (var6 > var5) {
               this.class_(var3, var6, this.class_(this.class_ - 1, var6));
               this.class_(var3, this.class_ - 1);
               this.class_(var3, var5, false);
            }
         }

         this.throws_ = this.protected_ < this.class_;
         return var1;
      }
   }

   protected abstract void class_(long var1, int var3);

   protected abstract void class_(long var1, int var3, boolean var4);

   protected abstract int class_(long var1, long var3, int var5);

   protected abstract boolean class_(long var1);

   private void class_(long var1, int var3, int var4, boolean var5) {
      if (var5) {
         this.byte_.remove(var1);
      }

      this.break_[var3].remove(var1);
      if (this.break_[var3].isEmpty() && this.protected_ == var3) {
         this.break_(var4);
      }
   }

   public void class_(LongPredicate var1) {
      LongArrayList var2 = new LongArrayList();
      this.byte_.keySet().forEach(var2x -> {
         if (var1.test(var2x)) {
            var2.add(var2x);
         }
      });
      var2.forEach(this::throws_);
   }

   private int class_(int var1, int var2) {
      int var3 = var1;
      if (var1 > var2) {
         var3 = var2;
      }

      if (var3 > this.class_ - 1) {
         var3 = this.class_ - 1;
      }

      return var3;
   }

   protected void class_(long var1, long var3, int var5, boolean var6) {
      this.class_(var1, var3, var5, this.byte_(var3), this.byte_.get(var3) & 255, var6);
      this.throws_ = this.protected_ < this.class_;
   }

   private void class_(long var1, int var3, int var4) {
      this.byte_.put(var1, (byte)var3);
      this.break_[var4].add(var1);
      if (this.protected_ > var4) {
         this.protected_ = var4;
      }
   }

   private void break_(int var1) {
      int var2 = this.protected_;
      this.protected_ = var1;

      for (int var3 = var2 + 1; var3 < var1; var3++) {
         if (!this.break_[var3].isEmpty()) {
            this.protected_ = var3;
            break;
         }
      }
   }

   protected abstract int break_(long var1, long var3, int var5);

   protected final void break_(long var1, long var3, int var5, boolean var6) {
      int var7 = this.byte_.get(var3) & 255;
      int var8 = rfU_2.class_(this.break_(var1, var3, var5), 0, this.class_ - 1);
      if (var6) {
         this.class_(var1, var3, var8, this.byte_(var3), var7, true);
      } else {
         int var9;
         boolean var10;
         if (var7 == 255) {
            var10 = true;
            var9 = rfU_2.class_(this.byte_(var3), 0, this.class_ - 1);
         } else {
            var9 = var7;
            var10 = false;
         }

         if (var8 == var9) {
            this.class_(var1, var3, this.class_ - 1, var10 ? var9 : this.byte_(var3), var7, false);
         }
      }
   }

   protected final boolean break_() {
      return this.throws_;
   }

   protected void throws_(long var1) {
      int var3 = this.byte_.get(var1) & 255;
      if (var3 != 255) {
         int var4 = this.byte_(var1);
         int var5 = this.class_(var4, var3);
         this.class_(var1, var5, this.class_, true);
         this.throws_ = this.protected_ < this.class_;
      }
   }

   protected void case_(long var1) {
      this.class_(var1, var1, this.class_ - 1, false);
   }

   protected int protected_() {
      return this.byte_.size();
   }
}
