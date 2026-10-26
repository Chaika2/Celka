package celestial;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;

public class rpf_3<K> implements rpn_3<K> {
   private static final Object class_ = null;
   private K[] break_;
   private int[] byte_;
   private K[] protected_;
   private int throws_;
   private int case_;

   private int byte_() {
      while (this.throws_ < this.protected_.length && this.protected_[this.throws_] != null) {
         this.throws_++;
      }

      return this.throws_;
   }

   private int byte_(K var1) {
      return (rfU_2.catch_(System.identityHashCode(var1)) & 2147483647) % this.break_.length;
   }

   private void byte_(int var1) {
      Object[] var2 = this.break_;
      int[] var3 = this.byte_;
      this.break_ = (K[])(new Object[var1]);
      this.byte_ = new int[var1];
      this.protected_ = (K[])(new Object[var1]);
      this.throws_ = 0;
      this.case_ = 0;

      for (int var4 = 0; var4 < var2.length; var4++) {
         if (var2[var4] != null) {
            this.class_((K)var2[var4], var3[var4]);
         }
      }
   }

   public rpf_3(int var1) {
      var1 = (int)((float)var1 / 0.8F);
      this.break_ = (K[])(new Object[var1]);
      this.byte_ = new int[var1];
      this.protected_ = (K[])(new Object[var1]);
   }

   @Override
   public Iterator<K> iterator() {
      return Iterators.filter(Iterators.forArray(this.protected_), Predicates.notNull());
   }

   @Override
   public int class_(K var1) {
      return this.break_(this.break_((K)var1, this.byte_((K)var1)));
   }

   public void class_() {
      Arrays.fill(this.break_, null);
      Arrays.fill(this.protected_, null);
      this.throws_ = 0;
      this.case_ = 0;
   }

   public void class_(K var1, int var2) {
      int var3 = Math.max(var2, this.case_ + 1);
      if ((float)var3 >= (float)this.break_.length * 0.8F) {
         int var4 = this.break_.length << 1;

         while (var4 < var2) {
            var4 <<= 1;
         }

         this.byte_(var4);
      }

      int var5 = this.protected_(this.byte_((K)var1));
      this.break_[var5] = (K)var1;
      this.byte_[var5] = var2;
      this.protected_[var2] = (K)var1;
      this.case_++;
      if (var2 == this.throws_) {
         this.throws_++;
      }
   }

   @Override
   public K class_(int var1) {
      return var1 >= 0 && var1 < this.protected_.length ? this.protected_[var1] : null;
   }

   public int break_() {
      return this.case_;
   }

   private int break_(int var1) {
      return var1 == -1 ? -1 : this.byte_[var1];
   }

   private int break_(K var1, int var2) {
      for (int var3 = var2; var3 < this.break_.length; var3++) {
         if (this.break_[var3] == var1) {
            return var3;
         }

         if (this.break_[var3] == class_) {
            return -1;
         }
      }

      for (int var4 = 0; var4 < var2; var4++) {
         if (this.break_[var4] == var1) {
            return var4;
         }

         if (this.break_[var4] == class_) {
            return -1;
         }
      }

      return -1;
   }

   public int break_(K var1) {
      int var2 = this.byte_();
      this.class_((K)var1, var2);
      return var2;
   }

   private int protected_(int var1) {
      for (int var2 = var1; var2 < this.break_.length; var2++) {
         if (this.break_[var2] == class_) {
            return var2;
         }
      }

      for (int var3 = 0; var3 < var1; var3++) {
         if (this.break_[var3] == class_) {
            return var3;
         }
      }

      throw new RuntimeException("Overflowed :(");
   }
}
