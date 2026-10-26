package celestial;

public class rrkf_1 implements rrkY {
   private int class_;
   private boolean break_;

   public rrkf_1(int var1, boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return "BlenderSplit: " + this.class_ + ", " + this.break_;
   }

   @Override
   public int class_(int var1, int var2, int var3, int var4) {
      if (var1 == var2 && var2 == var3 && var3 == var4) {
         return var1;
      } else {
         boolean var5 = var1 < this.class_;
         boolean var6 = var2 < this.class_;
         boolean var7 = var3 < this.class_;
         boolean var8 = var4 < this.class_;
         if (var5 == var6 && var6 == var7 && var7 == var8) {
            return !var5 && this.break_ ? var1 : (var1 + var2 + var3 + var4) / 4;
         } else {
            rrWH var9 = new rrWH(4);
            rrWH var10 = new rrWH(4);
            this.class_(var1, var9, var10);
            this.class_(var2, var9, var10);
            this.class_(var3, var9, var10);
            this.class_(var4, var9, var10);
            if (var10.protected_() > var9.protected_()) {
               return this.break_ ? var10.byte_(0) : this.class_(var10);
            } else {
               return this.class_(var9);
            }
         }
      }
   }

   private int class_(rrWH var1) {
      int var2 = var1.byte_();
      switch (var2) {
         case 2:
            return (var1.byte_(0) + var1.byte_(1)) / 2;
         case 3:
            return (var1.byte_(0) + var1.byte_(1) + var1.byte_(2)) / 3;
         default:
            int var3 = 0;

            for (int var4 = 0; var4 < var2; var4++) {
               var3 += var1.byte_(var4);
            }

            return var3 / var2;
      }
   }

   private void class_(int var1, rrWH var2, rrWH var3) {
      if (var1 < this.class_) {
         var2.class_(var1);
      } else {
         var3.class_(var1);
      }
   }
}
