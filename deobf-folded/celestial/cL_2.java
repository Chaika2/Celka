package celestial;

import java.util.List;

class cL_2 implements cv_3 {
   @Override
   public int id_byte(Ml_1 var1, int var2, int var3, int var4, int var5) {
      int var6 = var3;

      for (cA_2 var8 : this.id_break) {
         this.id_byte.id_break(var1, var8.id_class, (float)var2, (float)var6, var5);
         var6 += var4;
      }

      return var6;
   }

   cL_2(List var1, cm_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public int id_class() {
      return this.id_break.size();
   }

   @Override
   public int id_class(Ml_1 var1, int var2, int var3, int var4, int var5) {
      int var6 = var3;

      for (cA_2 var8 : this.id_break) {
         this.id_byte.id_class(var1, var8.id_class, (float)(var2 - var8.id_break / 2), (float)var6, var5);
         var6 += var4;
      }

      return var6;
   }

   @Override
   public int id_class(Ml_1 var1, int var2, int var3) {
      return this.id_class(var1, var2, var3, 9, 16777215);
   }

   @Override
   public int id_break(Ml_1 var1, int var2, int var3, int var4, int var5) {
      int var6 = var3;

      for (cA_2 var8 : this.id_break) {
         this.id_byte.id_class(var1, var8.id_class, (float)var2, (float)var6, var5);
         var6 += var4;
      }

      return var6;
   }
}
