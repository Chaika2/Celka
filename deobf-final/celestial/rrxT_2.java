package celestial;

import java.util.ArrayList;
import java.util.HashSet;

public class rrxT_2 {
   private int class_;
   private int break_;
   private rrMn_1[] byte_;

   public rrMn_1[] byte_() {
      return this.byte_;
   }

   public rrxT_2(int var1, int var2, rrMn_1[] var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public rrxT_2(int var1, rrMn_1[] var2) {
      this.class_ = var1;
      this.byte_ = var2;
   }

   @Override
   public String toString() {
      return "block." + this.class_ + ":" + this.break_ + "=" + rrbb_3.class_(this.byte_);
   }

   public int class_() {
      return this.class_;
   }

   public rrMn_1[] class_(int var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < this.byte_.length; var3++) {
         rrMn_1 var4 = this.byte_[var3];
         if (var4.class_() == var1) {
            var2.add(var4);
         }
      }

      return var2.toArray(new rrMn_1[var2.size()]);
   }

   public boolean class_(int var1, int var2) {
      for (int var3 = 0; var3 < this.byte_.length; var3++) {
         rrMn_1 var4 = this.byte_[var3];
         if (var4.class_(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public int break_() {
      return this.break_;
   }

   public int[] protected_() {
      HashSet var1 = new HashSet();

      for (int var2 = 0; var2 < this.byte_.length; var2++) {
         rrMn_1 var3 = this.byte_[var2];
         int var4 = var3.class_();
         var1.add(var4);
      }

      Integer[] var5 = var1.toArray(new Integer[var1.size()]);
      return rrbb_3.class_(var5);
   }
}
