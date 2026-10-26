package celestial;

import java.util.ArrayList;
import java.util.HashSet;

public class rrxT_2 {
   private int id_class;
   private int id_break;
   private rrMn_1[] id_byte;

   public rrMn_1[] id_byte() {
      return this.id_byte;
   }

   public rrxT_2(int var1, int var2, rrMn_1[] var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rrxT_2(int var1, rrMn_1[] var2) {
      this.id_class = var1;
      this.id_byte = var2;
   }

   @Override
   public String toString() {
      return "block." + this.id_class + ":" + this.id_break + "=" + rrbb_3.id_class(this.id_byte);
   }

   public int id_class() {
      return this.id_class;
   }

   public rrMn_1[] id_class(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < this.id_byte.length; var3++) {
         rrMn_1 var4 = this.id_byte[var3];
         if (var4.id_class() == var1) {
            var2.add(var4);
         }
      }

      return var2.toArray(new rrMn_1[var2.size()]);
   }

   public boolean id_class(int var1, int var2) {
      for (int var3 = 0; var3 < this.id_byte.length; var3++) {
         rrMn_1 var4 = this.id_byte[var3];
         if (var4.id_class(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public int id_break() {
      return this.id_break;
   }

   public int[] id_protected() {
      HashSet var1 = new HashSet();

      for (int var2 = 0; var2 < this.id_byte.length; var2++) {
         rrMn_1 var3 = this.id_byte[var2];
         int var4 = var3.id_class();
         var1.add(var4);
      }

      Integer[] var5 = var1.toArray(new Integer[var1.size()]);
      return rrbb_3.id_class(var5);
   }
}
