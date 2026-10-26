package celestial;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcq_3 extends rcx_3<rct_3> {
   public static final rcv_3<rcq_3> class_ = new rcT_2();
   private long[] break_;

   public rcq_3(long[] var1) {
      this.break_ = var1;
   }

   public rcq_3(List<Long> var1) {
      this(class_(var1));
   }

   public rcq_3(LongSet var1) {
      this.break_ = var1.toLongArray();
   }

   @Override
   public int size() {
      return this.break_.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcq_3 && Arrays.equals(this.break_, ((rcq_3)var1).break_);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[L;");

      for (int var2 = 0; var2 < this.break_.length; var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.break_[var2]).append('L');
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.break_);
   }

   @Override
   public void clear() {
      this.break_ = new long[0];
   }

   @Override
   public byte class_() {
      return 12;
   }

   public rct_3 class_(int var1, rct_3 var2) {
      long var3 = this.break_[var1];
      this.break_[var1] = var2.throws_();
      return rct_3.class_(var3);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeInt(this.break_.length);

      for (long var5 : this.break_) {
         var1.writeLong(var5);
      }
   }

   private static long[] class_(List<Long> var0) {
      long[] var1 = new long[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Long var3 = (Long)var0.get(var2);
         var1[var2] = var3 == null ? 0L : var3;
      }

      return var1;
   }

   @Override
   public boolean class_(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.break_[var1] = ((rcK_2)var2).throws_();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("L").class_(catch_);
      rVi_1 var4 = new rgN_2("[").class_(var3).break_(";");

      for (int var5 = 0; var5 < this.break_.length; var5++) {
         rVi_1 var6 = new rgN_2(String.valueOf(this.break_[var5])).class_(case_);
         var4.break_(" ").class_(var6).class_(var3);
         if (var5 != this.break_.length - 1) {
            var4.break_(",");
         }
      }

      var4.break_("]");
      return var4;
   }

   public rct_3 class_(int var1) {
      return rct_3.class_(this.break_[var1]);
   }

   public rct_3 break_(int var1) {
      long var2 = this.break_[var1];
      this.break_ = ArrayUtils.remove(this.break_, var1);
      return rct_3.class_(var2);
   }

   @Override
   public boolean break_(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.break_ = ArrayUtils.add(this.break_, var1, ((rcK_2)var2).throws_());
         return true;
      } else {
         return false;
      }
   }

   public void break_(int var1, rct_3 var2) {
      this.break_ = ArrayUtils.add(this.break_, var1, var2.throws_());
   }

   @Override
   public rcv_3<rcq_3> break_() {
      return class_;
   }

   @Override
   public byte throws_() {
      return 4;
   }

   public long[] case_() {
      return this.break_;
   }

   public rcq_3 protected_() {
      long[] var1 = new long[this.break_.length];
      System.arraycopy(this.break_, 0, var1, 0, this.break_.length);
      return new rcq_3(var1);
   }
}
