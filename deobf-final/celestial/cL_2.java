package celestial;

import java.util.List;

class cL_2 implements cv_3 {
   @Override
   public int byte_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      int var6 = var3;

      for (cA_2 var8 : this.break_) {
         this.byte_.break_(var1, var8.class_, (float)var2, (float)var6, var5);
         var6 += var4;
      }

      return var6;
   }

   cL_2(List var1, cm_3 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public int class_() {
      return this.break_.size();
   }

   @Override
   public int class_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      int var6 = var3;

      for (cA_2 var8 : this.break_) {
         this.byte_.class_(var1, var8.class_, (float)(var2 - var8.break_ / 2), (float)var6, var5);
         var6 += var4;
      }

      return var6;
   }

   @Override
   public int class_(Ml_1 var1, int var2, int var3) {
      return this.class_(var1, var2, var3, 9, 16777215);
   }

   @Override
   public int break_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      int var6 = var3;

      for (cA_2 var8 : this.break_) {
         this.byte_.class_(var1, var8.class_, (float)var2, (float)var6, var5);
         var6 += var4;
      }

      return var6;
   }
}
