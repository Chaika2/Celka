package celestial;

public class rrWJ {
   private int[] class_;
   private int break_ = 0;

   public rrWJ(int var1, int var2, int var3, int var4) {
      this(new int[]{var1, var2, var3, var4});
   }

   public rrWJ(int var1, int var2, int var3) {
      this(new int[]{var1, var2, var3});
   }

   public rrWJ(int var1, int var2) {
      this(new int[]{var1, var2});
   }

   public rrWJ(int[] var1) {
      this.class_ = (int[])var1.clone();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rrWJ var2)) {
         return false;
      } else {
         int[] var3 = var2.break_();
         if (var3.length != this.class_.length) {
            return false;
         } else {
            for (int var4 = 0; var4 < this.class_.length; var4++) {
               if (this.class_[var4] != var3[var4]) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   @Override
   public String toString() {
      return "[" + rrbb_3.class_(this.class_) + "]";
   }

   @Override
   public int hashCode() {
      if (this.break_ == 0) {
         this.break_ = 7;

         for (int var1 = 0; var1 < this.class_.length; var1++) {
            int var2 = this.class_[var1];
            this.break_ = 31 * this.break_ + var2;
         }
      }

      return this.break_;
   }

   public int[] class_() {
      return (int[])this.class_.clone();
   }

   private int[] break_() {
      return this.class_;
   }
}
