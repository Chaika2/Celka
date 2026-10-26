package celestial;

public class rrWG {
   private int class_ = 18;
   private int break_ = 128;
   private int byte_ = 18;
   private int protected_ = 0;
   private int throws_ = 0;
   private int case_ = 0;
   private int[][][] catch_ = (int[][][])null;
   private int[] private_ = null;
   private int implements_ = 0;

   public rrWG(int var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.catch_ = new int[var1][var2][var3];
      this.class_();
   }

   public void class_(int var1) {
      try {
         this.private_[this.implements_] = var1;
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public void class_(int var1, int var2, int var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.class_();
   }

   public void class_() {
      for (int var1 = 0; var1 < this.class_; var1++) {
         int[][] var2 = this.catch_[var1];

         for (int var3 = 0; var3 < this.break_; var3++) {
            int[] var4 = var2[var3];

            for (int var5 = 0; var5 < this.byte_; var5++) {
               var4[var5] = -1;
            }
         }
      }
   }

   public int break_(int var1, int var2, int var3) {
      try {
         this.private_ = this.catch_[var1 - this.protected_][var2 - this.throws_];
         this.implements_ = var3 - this.case_;
         return this.private_[this.implements_];
      } catch (ArrayIndexOutOfBoundsException var5) {
         var5.printStackTrace();
         return -1;
      }
   }
}
