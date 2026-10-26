package celestial;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;

public class rpf_3<K> implements rpn_3<K> {
   private static final Object id_class = null;
   private K[] id_break;
   private int[] id_byte;
   private K[] id_protected;
   private int id_throws;
   private int id_case;

   private int id_byte() {
      while (this.id_throws < this.id_protected.length && this.id_protected[this.id_throws] != null) {
         this.id_throws++;
      }

      return this.id_throws;
   }

   private int id_byte(K var1) {
      return (rfU_2.id_catch(System.identityHashCode(var1)) & 2147483647) % this.id_break.length;
   }

   private void id_byte(int var1) {
      Object[] var2 = this.id_break;
      int[] var3 = this.id_byte;
      this.id_break = (K[])(new Object[var1]);
      this.id_byte = new int[var1];
      this.id_protected = (K[])(new Object[var1]);
      this.id_throws = 0;
      this.id_case = 0;

      for (int var4 = 0; var4 < var2.length; var4++) {
         if (var2[var4] != null) {
            this.id_class((K)var2[var4], var3[var4]);
         }
      }
   }

   public rpf_3(int var1) {
      var1 = (int)((float)var1 / 0.8F);
      this.id_break = (K[])(new Object[var1]);
      this.id_byte = new int[var1];
      this.id_protected = (K[])(new Object[var1]);
   }

   @Override
   public Iterator<K> iterator() {
      return Iterators.filter(Iterators.forArray(this.id_protected), Predicates.notNull());
   }

   @Override
   public int id_class(K var1) {
      return this.id_break(this.id_break((K)var1, this.id_byte((K)var1)));
   }

   public void id_class() {
      Arrays.fill(this.id_break, null);
      Arrays.fill(this.id_protected, null);
      this.id_throws = 0;
      this.id_case = 0;
   }

   public void id_class(K var1, int var2) {
      int var3 = Math.max(var2, this.id_case + 1);
      if ((float)var3 >= (float)this.id_break.length * 0.8F) {
         int var4 = this.id_break.length << 1;

         while (var4 < var2) {
            var4 <<= 1;
         }

         this.id_byte(var4);
      }

      int var5 = this.id_protected(this.id_byte((K)var1));
      this.id_break[var5] = (K)var1;
      this.id_byte[var5] = var2;
      this.id_protected[var2] = (K)var1;
      this.id_case++;
      if (var2 == this.id_throws) {
         this.id_throws++;
      }
   }

   @Override
   public K id_class(int var1) {
      return var1 >= 0 && var1 < this.id_protected.length ? this.id_protected[var1] : null;
   }

   public int id_break() {
      return this.id_case;
   }

   private int id_break(int var1) {
      return var1 == -1 ? -1 : this.id_byte[var1];
   }

   private int id_break(K var1, int var2) {
      for (int var3 = var2; var3 < this.id_break.length; var3++) {
         if (this.id_break[var3] == var1) {
            return var3;
         }

         if (this.id_break[var3] == id_class) {
            return -1;
         }
      }

      for (int var4 = 0; var4 < var2; var4++) {
         if (this.id_break[var4] == var1) {
            return var4;
         }

         if (this.id_break[var4] == id_class) {
            return -1;
         }
      }

      return -1;
   }

   public int id_break(K var1) {
      int var2 = this.id_byte();
      this.id_class((K)var1, var2);
      return var2;
   }

   private int id_protected(int var1) {
      for (int var2 = var1; var2 < this.id_break.length; var2++) {
         if (this.id_break[var2] == id_class) {
            return var2;
         }
      }

      for (int var3 = 0; var3 < var1; var3++) {
         if (this.id_break[var3] == id_class) {
            return var3;
         }
      }

      throw new RuntimeException("Overflowed :(");
   }
}
