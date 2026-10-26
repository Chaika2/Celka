package celestial;

public class rrWb_1 {
   private int class_ = 18;
   private int break_ = 128;
   private int byte_ = 18;
   private int protected_ = 0;
   private int throws_ = 0;
   private int case_ = 0;
   private byte[][][] catch_ = (byte[][][])null;
   private byte[] private_ = null;
   private int implements_ = 0;

   public rrWb_1(int var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.catch_ = new byte[var1][var2][var3];
      this.class_();
   }

   public void class_(byte var1) {
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
         byte[][] var2 = this.catch_[var1];

         for (int var3 = 0; var3 < this.break_; var3++) {
            byte[] var4 = var2[var3];

            for (int var5 = 0; var5 < this.byte_; var5++) {
               var4[var5] = -1;
            }
         }
      }
   }

   public byte break_(int var1, int var2, int var3) {
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
