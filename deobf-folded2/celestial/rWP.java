package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.BitSet;
import java.util.List;

class rWP {
   private final rkw_3<?> id_break;
   private final List<rkg_3> id_byte;
   private final int id_protected;
   private final int[] id_throws;
   private final int id_case;
   private final BitSet id_catch;
   private final IntList id_private;

   private int id_byte(boolean var1, int var2) {
      return (var1 ? 0 : this.id_protected) + var2;
   }

   private void id_byte(boolean var1, int var2, int var3) {
      this.id_catch.flip(1 + this.id_protected(var1, var2, var3));
   }

   private void id_byte(int var1) {
      this.id_catch.set(this.id_protected(var1));
   }

   public rWP(rkw_3<?> var1, rkw_3 var2) {
      this.id_class = var1;
      this.id_byte = Lists.newArrayList();
      this.id_private = new IntArrayList();
      this.id_break = var2;
      this.id_byte.addAll(var2.id_class());
      this.id_byte.removeIf(rkg_3::id_protected);
      this.id_protected = this.id_byte.size();
      this.id_throws = this.id_class();
      this.id_case = this.id_throws.length;
      this.id_catch = new BitSet(this.id_protected + this.id_case + this.id_protected + this.id_protected * this.id_case);

      for (int var3 = 0; var3 < this.id_byte.size(); var3++) {
         IntList var4 = this.id_byte.get(var3).id_break();

         for (int var5 = 0; var5 < this.id_case; var5++) {
            if (var4.contains(this.id_throws[var5])) {
               this.id_catch.set(this.id_protected(true, var5, var3));
            }
         }
      }
   }

   private void id_class(boolean var1, int var2) {
      this.id_catch.set(this.id_byte(var1, var2));
      this.id_private.add(var2);
   }

   private boolean id_class(boolean var1, int var2, int var3) {
      return this.id_catch.get(this.id_protected(var1, var2, var3));
   }

   private int[] id_class() {
      IntAVLTreeSet var1 = new IntAVLTreeSet();

      for (rkg_3 var3 : this.id_byte) {
         var1.addAll(var3.id_break());
      }

      IntIterator var4 = var1.iterator();

      while (var4.hasNext()) {
         if (!this.id_class.id_break(var4.nextInt())) {
            var4.remove();
         }
      }

      return var1.toIntArray();
   }

   private boolean id_class(int var1) {
      int var2 = this.id_case;

      for (int var3 = 0; var3 < var2; var3++) {
         if (this.id_class.id_class.get(this.id_throws[var3]) >= var1) {
            this.id_class(false, var3);

            while (!this.id_private.isEmpty()) {
               int var4 = this.id_private.size();
               boolean var5 = (var4 & 1) == 1;
               int var6 = this.id_private.getInt(var4 - 1);
               if (!var5 && !this.id_break(var6)) {
                  break;
               }

               int var7 = var5 ? this.id_protected : var2;
               int var8 = 0;

               while (true) {
                  if (var8 < var7) {
                     if (this.id_break(var5, var8) || !this.id_class(var5, var6, var8) || !this.id_break(var5, var6, var8)) {
                        var8++;
                        continue;
                     }

                     this.id_class(var5, var8);
                  }

                  var8 = this.id_private.size();
                  if (var8 == var4) {
                     this.id_private.removeInt(var8 - 1);
                  }
                  break;
               }
            }

            if (!this.id_private.isEmpty()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean id_class(int var1, IntList var2) {
      if (var1 <= 0) {
         return true;
      } else {
         int var3;
         for (var3 = 0; this.id_class(var1); var3++) {
            this.id_class.id_class(this.id_throws[this.id_private.getInt(0)], var1);
            int var4 = this.id_private.size() - 1;
            this.id_byte(this.id_private.getInt(var4));

            for (int var5 = 0; var5 < var4; var5++) {
               this.id_byte((var5 & 1) == 0, this.id_private.get(var5), this.id_private.get(var5 + 1));
            }

            this.id_private.clear();
            this.id_catch.clear(0, this.id_protected + this.id_case);
         }

         boolean var10 = var3 == this.id_protected;
         boolean var11 = var10 && var2 != null;
         if (var11) {
            var2.clear();
         }

         this.id_catch.clear(0, this.id_protected + this.id_case + this.id_protected);
         int var6 = 0;
         rqs_3 var7 = this.id_break.id_class();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            if (var11 && ((rkg_3)var7.get(var8)).id_protected()) {
               var2.add(0);
            } else {
               for (int var9 = 0; var9 < this.id_case; var9++) {
                  if (this.id_break(false, var6, var9)) {
                     this.id_byte(true, var9, var6);
                     this.id_class.id_break(this.id_throws[var9], var1);
                     if (var11) {
                        var2.add(this.id_throws[var9]);
                     }
                  }
               }

               var6++;
            }
         }

         return var10;
      }
   }

   public int id_break(int var1, IntList var2) {
      int var3 = 0;
      int var4 = Math.min(var1, this.id_break()) + 1;

      while (true) {
         int var5 = (var3 + var4) / 2;
         if (this.id_class(var5, (IntList)null)) {
            if (var4 - var3 <= 1) {
               if (var5 > 0) {
                  this.id_class(var5, var2);
               }

               return var5;
            }

            var3 = var5;
         } else {
            var4 = var5;
         }
      }
   }

   private boolean id_break(boolean var1, int var2) {
      return this.id_catch.get(this.id_byte(var1, var2));
   }

   private int id_break() {
      int var1 = Integer.MAX_VALUE;

      for (rkg_3 var3 : this.id_byte) {
         int var4 = 0;
         IntListIterator var5 = var3.id_break().iterator();

         while (var5.hasNext()) {
            int var6 = (Integer)var5.next();
            var4 = Math.max(var4, this.id_class.id_class.get(var6));
         }

         if (var1 > 0) {
            var1 = Math.min(var1, var4);
         }
      }

      return var1;
   }

   private boolean id_break(int var1) {
      return this.id_catch.get(this.id_protected(var1));
   }

   private boolean id_break(boolean var1, int var2, int var3) {
      return var1 != this.id_catch.get(1 + this.id_protected(var1, var2, var3));
   }

   private int id_protected(boolean var1, int var2, int var3) {
      int var4 = var1 ? var2 * this.id_protected + var3 : var3 * this.id_protected + var2;
      return this.id_protected + this.id_case + this.id_protected + 2 * var4;
   }

   private int id_protected(int var1) {
      return this.id_protected + this.id_case + var1;
   }
}
