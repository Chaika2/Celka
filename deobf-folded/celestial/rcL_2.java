package celestial;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcL_2 extends rcx_3<rcn_3> {
   public static final rcv_3<rcL_2> id_class = new rcA_2();
   private int[] id_break;

   public rcL_2(int[] var1) {
      this.id_break = var1;
   }

   public rcL_2(List<Integer> var1) {
      this(id_class(var1));
   }

   @Override
   public int size() {
      return this.id_break.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcL_2 && Arrays.equals(this.id_break, ((rcL_2)var1).id_break);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[I;");

      for (int var2 = 0; var2 < this.id_break.length; var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.id_break[var2]);
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.id_break);
   }

   @Override
   public void clear() {
      this.id_break = new int[0];
   }

   @Override
   public byte id_class() {
      return 11;
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeInt(this.id_break.length);

      for (int var5 : this.id_break) {
         var1.writeInt(var5);
      }
   }

   private static int[] id_class(List<Integer> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Integer var3 = (Integer)var0.get(var2);
         var1[var2] = var3 == null ? 0 : var3;
      }

      return var1;
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("I").id_class(id_catch);
      rVi_1 var4 = new rgN_2("[").id_class(var3).id_break(";");

      for (int var5 = 0; var5 < this.id_break.length; var5++) {
         var4.id_break(" ").id_class(new rgN_2(String.valueOf(this.id_break[var5])).id_class(id_case));
         if (var5 != this.id_break.length - 1) {
            var4.id_break(",");
         }
      }

      var4.id_break("]");
      return var4;
   }

   public rcn_3 id_class(int var1) {
      return rcn_3.id_class(this.id_break[var1]);
   }

   public rcn_3 id_class(int var1, rcn_3 var2) {
      int var3 = this.id_break[var1];
      this.id_break[var1] = var2.id_case();
      return rcn_3.id_class(var3);
   }

   @Override
   public boolean id_class(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.id_break[var1] = ((rcK_2)var2).id_case();
         return true;
      } else {
         return false;
      }
   }

   public void id_break(int var1, rcn_3 var2) {
      this.id_break = ArrayUtils.add(this.id_break, var1, var2.id_case());
   }

   @Override
   public rcv_3<rcL_2> id_break() {
      return id_class;
   }

   public rcn_3 id_break(int var1) {
      int var2 = this.id_break[var1];
      this.id_break = ArrayUtils.remove(this.id_break, var1);
      return rcn_3.id_class(var2);
   }

   @Override
   public boolean id_break(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.id_break = ArrayUtils.add(this.id_break, var1, ((rcK_2)var2).id_case());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public byte id_throws() {
      return 3;
   }

   public int[] id_case() {
      return this.id_break;
   }

   public rcL_2 id_protected() {
      int[] var1 = new int[this.id_break.length];
      System.arraycopy(this.id_break, 0, var1, 0, this.id_break.length);
      return new rcL_2(var1);
   }
}
