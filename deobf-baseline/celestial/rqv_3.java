package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class rqv_3<T> extends AbstractSet<T> {
   private final Comparator<T> id_class;
   T[] id_break;
   int id_byte;

   private void id_byte(int var1) {
      if (var1 > this.id_break.length) {
         if (this.id_break != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            var1 = (int)Math.max(Math.min((long)this.id_break.length + (long)(this.id_break.length >> 1), 2147483639L), (long)var1);
         } else if (var1 < 10) {
            var1 = 10;
         }

         Object[] var2 = new Object[var1];
         System.arraycopy(this.id_break, 0, var2, 0, this.id_byte);
         this.id_break = (T[])id_class(var2);
      }
   }

   public rqv_3(int var1, Comparator<T> var2) {
      this.id_class = var2;
      if (var1 < 0) {
         throw new IllegalArgumentException("Initial capacity (" + var1 + ") is negative");
      } else {
         this.id_break = (T[])id_class(new Object[var1]);
      }
   }

   @Override
   public boolean remove(Object var1) {
      int var2 = this.id_break((T)var1);
      if (var2 >= 0) {
         this.id_protected(var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int size() {
      return this.id_byte;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof rqv_3 var2 && this.id_class.equals(var2.id_class)) {
            return this.id_byte == var2.id_byte && Arrays.equals(this.id_break, var2.id_break);
         }

         return super.equals(var1);
      }
   }

   @Override
   public void clear() {
      Arrays.fill(this.id_break, 0, this.id_byte, null);
      this.id_byte = 0;
   }

   @Override
   public boolean add(T var1) {
      int var2 = this.id_break((T)var1);
      if (var2 >= 0) {
         return false;
      } else {
         int var3 = id_break(var2);
         this.id_class((T)var1, var3);
         return true;
      }
   }

   @Override
   public Object[] toArray() {
      return (Object[])this.id_break.clone();
   }

   @Override
   public <U> U[] toArray(U[] var1) {
      if (var1.length < this.id_byte) {
         return (U[])Arrays.copyOf(this.id_break, this.id_byte, (Class<? extends T[]>)var1.getClass());
      } else {
         System.arraycopy(this.id_break, 0, var1, 0, this.id_byte);
         if (var1.length > this.id_byte) {
            var1[this.id_byte] = null;
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
      int var2 = this.id_break((T)var1);
      return var2 >= 0;
   }

   public static <T extends Comparable<T>> rqv_3<T> id_class(int var0) {
      return new rqv_3<>(var0, Comparator.naturalOrder());
   }

   public T id_class(T var1) {
      int var2 = this.id_break((T)var1);
      if (var2 >= 0) {
         return this.id_throws(var2);
      } else {
         this.id_class((T)var1, id_break(var2));
         return (T)var1;
      }
   }

   private void id_class(T var1, int var2) {
      this.id_byte(this.id_byte + 1);
      if (var2 != this.id_byte) {
         System.arraycopy(this.id_break, var2, this.id_break, var2 + 1, this.id_byte - var2);
      }

      this.id_break[var2] = (T)var1;
      this.id_byte++;
   }

   private static <T> T[] id_class(Object[] var0) {
      return (T[])var0;
   }

   public T id_class() {
      return this.id_throws(0);
   }

   private static int id_break(int var0) {
      return -var0 - 1;
   }

   private int id_break(T var1) {
      return Arrays.binarySearch(this.id_break, 0, this.id_byte, var1, this.id_class);
   }

   private T id_throws(int var1) {
      return this.id_break[var1];
   }

   void id_protected(int var1) {
      this.id_byte--;
      if (var1 != this.id_byte) {
         System.arraycopy(this.id_break, var1 + 1, this.id_break, var1, this.id_byte - var1);
      }

      this.id_break[this.id_byte] = null;
   }
}
