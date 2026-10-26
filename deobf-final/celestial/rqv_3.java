package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class rqv_3<T> extends AbstractSet<T> {
   private final Comparator<T> class_;
   T[] break_;
   int byte_;

   private void byte_(int var1) {
      if (var1 > this.break_.length) {
         if (this.break_ != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            var1 = (int)Math.max(Math.min((long)this.break_.length + (long)(this.break_.length >> 1), 2147483639L), (long)var1);
         } else if (var1 < 10) {
            var1 = 10;
         }

         Object[] var2 = new Object[var1];
         System.arraycopy(this.break_, 0, var2, 0, this.byte_);
         this.break_ = (T[])class_(var2);
      }
   }

   public rqv_3(int var1, Comparator<T> var2) {
      this.class_ = var2;
      if (var1 < 0) {
         throw new IllegalArgumentException("Initial capacity (" + var1 + ") is negative");
      } else {
         this.break_ = (T[])class_(new Object[var1]);
      }
   }

   @Override
   public boolean remove(Object var1) {
      int var2 = this.break_((T)var1);
      if (var2 >= 0) {
         this.protected_(var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int size() {
      return this.byte_;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof rqv_3 var2 && this.class_.equals(var2.class_)) {
            return this.byte_ == var2.byte_ && Arrays.equals(this.break_, var2.break_);
         }

         return super.equals(var1);
      }
   }

   @Override
   public void clear() {
      Arrays.fill(this.break_, 0, this.byte_, null);
      this.byte_ = 0;
   }

   @Override
   public boolean add(T var1) {
      int var2 = this.break_((T)var1);
      if (var2 >= 0) {
         return false;
      } else {
         int var3 = break_(var2);
         this.class_((T)var1, var3);
         return true;
      }
   }

   @Override
   public Object[] toArray() {
      return (Object[])this.break_.clone();
   }

   @Override
   public <U> U[] toArray(U[] var1) {
      if (var1.length < this.byte_) {
         return (U[])Arrays.copyOf(this.break_, this.byte_, (Class<? extends T[]>)var1.getClass());
      } else {
         System.arraycopy(this.break_, 0, var1, 0, this.byte_);
         if (var1.length > this.byte_) {
            var1[this.byte_] = null;
         }

         return (U[])var1;
      }
   }

   @Override
   public Iterator<T> iterator() {
      return new rqF_2(this);
   }

   @Override
   public boolean contains(Object var1) {
      int var2 = this.break_((T)var1);
      return var2 >= 0;
   }

   public static <T extends Comparable<T>> rqv_3<T> class_(int var0) {
      return new rqv_3<>(var0, Comparator.naturalOrder());
   }

   public T class_(T var1) {
      int var2 = this.break_((T)var1);
      if (var2 >= 0) {
         return this.throws_(var2);
      } else {
         this.class_((T)var1, break_(var2));
         return (T)var1;
      }
   }

   private void class_(T var1, int var2) {
      this.byte_(this.byte_ + 1);
      if (var2 != this.byte_) {
         System.arraycopy(this.break_, var2, this.break_, var2 + 1, this.byte_ - var2);
      }

      this.break_[var2] = (T)var1;
      this.byte_++;
   }

   private static <T> T[] class_(Object[] var0) {
      return (T[])var0;
   }

   public T class_() {
      return this.throws_(0);
   }

   private static int break_(int var0) {
      return -var0 - 1;
   }

   private int break_(T var1) {
      return Arrays.binarySearch(this.break_, 0, this.byte_, var1, this.class_);
   }

   private T throws_(int var1) {
      return this.break_[var1];
   }

   void protected_(int var1) {
      this.byte_--;
      if (var1 != this.byte_) {
         System.arraycopy(this.break_, var1 + 1, this.break_, var1, this.byte_ - var1);
      }

      this.break_[this.byte_] = null;
   }
}
