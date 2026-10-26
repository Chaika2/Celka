package celestial;

public class rrMn_1 {
   private int class_ = -1;
   private int[] break_ = null;

   public rrMn_1(int var1, int[] var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rrMn_1(int var1, int var2) {
      this.class_ = var1;
      if (var2 >= 0) {
         this.break_ = new int[]{var2};
      }
   }

   public rrMn_1(int var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return this.class_ + ":" + rrbb_3.class_(this.break_);
   }

   public void class_(int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         int var3 = var1[var2];
         this.class_(var3);
      }
   }

   public boolean class_(xc_3 var1) {
      return var1.continue_() != this.class_ ? false : rrMl_1.class_(var1.super_(), this.break_);
   }

   public boolean class_(int var1, int var2) {
      return var1 != this.class_ ? false : rrMl_1.class_(var2, this.break_);
   }

   public int class_() {
      return this.class_;
   }

   public void class_(int var1) {
      if (this.break_ != null && var1 >= 0) {
         for (int var2 = 0; var2 < this.break_.length; var2++) {
            if (this.break_[var2] == var1) {
               return;
            }
         }

         this.break_ = rrbb_3.class_(this.break_, var1);
      }
   }

   public int[] break_() {
      return this.break_;
   }
}
