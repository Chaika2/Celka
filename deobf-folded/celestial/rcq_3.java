package celestial;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcq_3 extends rcx_3<rct_3> {
   public static final rcv_3<rcq_3> id_class = new rcT_2();
   private long[] id_break;

   public rcq_3(long[] var1) {
      this.id_break = var1;
   }

   public rcq_3(List<Long> var1) {
      this(id_class(var1));
   }

   public rcq_3(LongSet var1) {
      this.id_break = var1.toLongArray();
   }

   @Override
   public int size() {
      return this.id_break.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcq_3 && Arrays.equals(this.id_break, ((rcq_3)var1).id_break);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[L;");

      for (int var2 = 0; var2 < this.id_break.length; var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.id_break[var2]).append('L');
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.id_break);
   }

   @Override
   public void clear() {
      this.id_break = new long[0];
   }

   @Override
   public byte id_class() {
      return 12;
   }

   public rct_3 id_class(int var1, rct_3 var2) {
      long var3 = this.id_break[var1];
      this.id_break[var1] = var2.id_throws();
      return rct_3.id_class(var3);
   }

   @Override
   public void id_class(DataOutput var1) throws IOException {
      var1.writeInt(this.id_break.length);

      for (long var5 : this.id_break) {
         var1.writeLong(var5);
      }
   }

   private static long[] id_class(List<Long> var0) {
      long[] var1 = new long[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Long var3 = (Long)var0.get(var2);
         var1[var2] = var3 == null ? 0L : var3;
      }

      return var1;
   }

   @Override
   public boolean id_class(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.id_break[var1] = ((rcK_2)var2).id_throws();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rgP_2 id_class(String var1, int var2) {
      rVi_1 var3 = new rgN_2("L").id_class(id_catch);
      rVi_1 var4 = new rgN_2("[").id_class(var3).id_break(";");

      for (int var5 = 0; var5 < this.id_break.length; var5++) {
         rVi_1 var6 = new rgN_2(String.valueOf(this.id_break[var5])).id_class(id_case);
         var4.id_break(" ").id_class(var6).id_class(var3);
         if (var5 != this.id_break.length - 1) {
            var4.id_break(",");
         }
      }

      var4.id_break("]");
      return var4;
   }

   public rct_3 id_class(int var1) {
      return rct_3.id_class(this.id_break[var1]);
   }

   public rct_3 id_break(int var1) {
      long var2 = this.id_break[var1];
      this.id_break = ArrayUtils.remove(this.id_break, var1);
      return rct_3.id_class(var2);
   }

   @Override
   public boolean id_break(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.id_break = ArrayUtils.add(this.id_break, var1, ((rcK_2)var2).id_throws());
         return true;
      } else {
         return false;
      }
   }

   public void id_break(int var1, rct_3 var2) {
      this.id_break = ArrayUtils.add(this.id_break, var1, var2.id_throws());
   }

   @Override
   public rcv_3<rcq_3> id_break() {
      return id_class;
   }

   @Override
   public byte id_throws() {
      return 4;
   }

   public long[] id_case() {
      return this.id_break;
   }

   public rcq_3 id_protected() {
      long[] var1 = new long[this.id_break.length];
      System.arraycopy(this.id_break, 0, var1, 0, this.id_break.length);
      return new rcq_3(var1);
   }
}
