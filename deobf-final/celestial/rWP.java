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
   private final rkw_3<?> break_;
   private final List<rkg_3> byte_;
   private final int protected_;
   private final int[] throws_;
   private final int case_;
   private final BitSet catch_;
   private final IntList private_;

   private int byte_(boolean var1, int var2) {
      return (var1 ? 0 : this.protected_) + var2;
   }

   private void byte_(boolean var1, int var2, int var3) {
      this.catch_.flip(1 + this.protected_(var1, var2, var3));
   }

   private void byte_(int var1) {
      this.catch_.set(this.protected_(var1));
   }

   public rWP(rkw_3<?> var1, rkw_3 var2) {
      this.class_ = var1;
      this.byte_ = Lists.newArrayList();
      this.private_ = new IntArrayList();
      this.break_ = var2;
      this.byte_.addAll(var2.class_());
      this.byte_.removeIf(rkg_3::protected_);
      this.protected_ = this.byte_.size();
      this.throws_ = this.class_();
      this.case_ = this.throws_.length;
      this.catch_ = new BitSet(this.protected_ + this.case_ + this.protected_ + this.protected_ * this.case_);

      for (int var3 = 0; var3 < this.byte_.size(); var3++) {
         IntList var4 = this.byte_.get(var3).break_();

         for (int var5 = 0; var5 < this.case_; var5++) {
            if (var4.contains(this.throws_[var5])) {
               this.catch_.set(this.protected_(true, var5, var3));
            }
         }
      }
   }

   private void class_(boolean var1, int var2) {
      this.catch_.set(this.byte_(var1, var2));
      this.private_.add(var2);
   }

   private boolean class_(boolean var1, int var2, int var3) {
      return this.catch_.get(this.protected_(var1, var2, var3));
   }

   private int[] class_() {
      IntAVLTreeSet var1 = new IntAVLTreeSet();

      for (rkg_3 var3 : this.byte_) {
         var1.addAll(var3.break_());
      }

      IntIterator var4 = var1.iterator();

      while (var4.hasNext()) {
         if (!this.class_.break_(var4.nextInt())) {
            var4.remove();
         }
      }

      return var1.toIntArray();
   }

   private boolean class_(int var1) {
      int var2 = this.case_;

      for (int var3 = 0; var3 < var2; var3++) {
         if (this.class_.class_.get(this.throws_[var3]) >= var1) {
            this.class_(false, var3);

            while (!this.private_.isEmpty()) {
               int var4 = this.private_.size();
               boolean var5 = (var4 & 1) == 1;
               int var6 = this.private_.getInt(var4 - 1);
               if (!var5 && !this.break_(var6)) {
                  break;
               }

               int var7 = var5 ? this.protected_ : var2;
               int var8 = 0;

               while (true) {
                  if (var8 < var7) {
                     if (this.break_(var5, var8) || !this.class_(var5, var6, var8) || !this.break_(var5, var6, var8)) {
                        var8++;
                        continue;
                     }

                     this.class_(var5, var8);
                  }

                  var8 = this.private_.size();
                  if (var8 == var4) {
                     this.private_.removeInt(var8 - 1);
                  }
                  break;
               }
            }

            if (!this.private_.isEmpty()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean class_(int var1, IntList var2) {
      if (var1 <= 0) {
         return true;
      } else {
         int var3;
         for (var3 = 0; this.class_(var1); var3++) {
            this.class_.class_(this.throws_[this.private_.getInt(0)], var1);
            int var4 = this.private_.size() - 1;
            this.byte_(this.private_.getInt(var4));

            for (int var5 = 0; var5 < var4; var5++) {
               this.byte_((var5 & 1) == 0, this.private_.get(var5), this.private_.get(var5 + 1));
            }

            this.private_.clear();
            this.catch_.clear(0, this.protected_ + this.case_);
         }

         boolean var10 = var3 == this.protected_;
         boolean var11 = var10 && var2 != null;
         if (var11) {
            var2.clear();
         }

         this.catch_.clear(0, this.protected_ + this.case_ + this.protected_);
         int var6 = 0;
         rqs_3 var7 = this.break_.class_();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            if (var11 && ((rkg_3)var7.get(var8)).protected_()) {
               var2.add(0);
            } else {
               for (int var9 = 0; var9 < this.case_; var9++) {
                  if (this.break_(false, var6, var9)) {
                     this.byte_(true, var9, var6);
                     this.class_.break_(this.throws_[var9], var1);
                     if (var11) {
                        var2.add(this.throws_[var9]);
                     }
                  }
               }

               var6++;
            }
         }

         return var10;
      }
   }

   public int break_(int var1, IntList var2) {
      int var3 = 0;
      int var4 = Math.min(var1, this.break_()) + 1;

      while (true) {
         int var5 = (var3 + var4) / 2;
         if (this.class_(var5, (IntList)null)) {
            if (var4 - var3 <= 1) {
               if (var5 > 0) {
                  this.class_(var5, var2);
               }

               return var5;
            }

            var3 = var5;
         } else {
            var4 = var5;
         }
      }
   }

   private boolean break_(boolean var1, int var2) {
      return this.catch_.get(this.byte_(var1, var2));
   }

   private int break_() {
      int var1 = Integer.MAX_VALUE;

      for (rkg_3 var3 : this.byte_) {
         int var4 = 0;
         IntListIterator var5 = var3.break_().iterator();

         while (var5.hasNext()) {
            int var6 = (Integer)var5.next();
            var4 = Math.max(var4, this.class_.class_.get(var6));
         }

         if (var1 > 0) {
            var1 = Math.min(var1, var4);
         }
      }

      return var1;
   }

   private boolean break_(int var1) {
      return this.catch_.get(this.protected_(var1));
   }

   private boolean break_(boolean var1, int var2, int var3) {
      return var1 != this.catch_.get(1 + this.protected_(var1, var2, var3));
   }

   private int protected_(boolean var1, int var2, int var3) {
      int var4 = var1 ? var2 * this.protected_ + var3 : var3 * this.protected_ + var2;
      return this.protected_ + this.case_ + this.protected_ + 2 * var4;
   }

   private int protected_(int var1) {
      return this.protected_ + this.case_ + var1;
   }
}
