package celestial;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class rcL_2 extends rcx_3<rcn_3> {
   public static final rcv_3<rcL_2> class_ = new rcA_2();
   private int[] break_;

   public rcL_2(int[] var1) {
      this.break_ = var1;
   }

   public rcL_2(List<Integer> var1) {
      this(class_(var1));
   }

   @Override
   public int size() {
      return this.break_.length;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcL_2 && Arrays.equals(this.break_, ((rcL_2)var1).break_);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder("[I;");

      for (int var2 = 0; var2 < this.break_.length; var2++) {
         if (var2 != 0) {
            var1.append(',');
         }

         var1.append(this.break_[var2]);
      }

      return var1.append(']').toString();
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.break_);
   }

   @Override
   public void clear() {
      this.break_ = new int[0];
   }

   @Override
   public byte class_() {
      return 11;
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeInt(this.break_.length);

      for (int var5 : this.break_) {
         var1.writeInt(var5);
      }
   }

   private static int[] class_(List<Integer> var0) {
      int[] var1 = new int[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Integer var3 = (Integer)var0.get(var2);
         var1[var2] = var3 == null ? 0 : var3;
      }

      return var1;
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("I").class_(catch_);
      rVi_1 var4 = new rgN_2("[").class_(var3).break_(";");

      for (int var5 = 0; var5 < this.break_.length; var5++) {
         var4.break_(" ").class_(new rgN_2(String.valueOf(this.break_[var5])).class_(case_));
         if (var5 != this.break_.length - 1) {
            var4.break_(",");
         }
      }

      var4.break_("]");
      return var4;
   }

   public rcn_3 class_(int var1) {
      return rcn_3.class_(this.break_[var1]);
   }

   public rcn_3 class_(int var1, rcn_3 var2) {
      int var3 = this.break_[var1];
      this.break_[var1] = var2.case_();
      return rcn_3.class_(var3);
   }

   @Override
   public boolean class_(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.break_[var1] = ((rcK_2)var2).case_();
         return true;
      } else {
         return false;
      }
   }

   public void break_(int var1, rcn_3 var2) {
      this.break_ = ArrayUtils.add(this.break_, var1, var2.case_());
   }

   @Override
   public rcv_3<rcL_2> break_() {
      return class_;
   }

   public rcn_3 break_(int var1) {
      int var2 = this.break_[var1];
      this.break_ = ArrayUtils.remove(this.break_, var1);
      return rcn_3.class_(var2);
   }

   @Override
   public boolean break_(int var1, rcZ_2 var2) {
      if (var2 instanceof rcK_2) {
         this.break_ = ArrayUtils.add(this.break_, var1, ((rcK_2)var2).case_());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public byte throws_() {
      return 3;
   }

   public int[] case_() {
      return this.break_;
   }

   public rcL_2 protected_() {
      int[] var1 = new int[this.break_.length];
      System.arraycopy(this.break_, 0, var1, 0, this.break_.length);
      return new rcL_2(var1);
   }
}
