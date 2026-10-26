package celestial;

import java.util.Iterator;

public interface rkI_2<T> {
   default void id_class(int var1, int var2, int var3, rkw_3<?> var4, Iterator<T> var5, int var6) {
      int var7 = var1;
      int var8 = var2;
      if (var4 instanceof rWb_1 var9) {
         var7 = var9.id_throws();
         var8 = var9.id_finally();
      }

      int var16 = 0;

      for (int var10 = 0; var10 < var2; var10++) {
         if (var16 == var3) {
            var16++;
         }

         boolean var11 = (float)var8 < (float)var2 / 2.0F;
         int var12 = rfU_2.id_protected((float)var2 / 2.0F - (float)var8 / 2.0F);
         if (var11 && var12 > var10) {
            var16 += var1;
            var10++;
         }

         for (int var13 = 0; var13 < var1; var13++) {
            if (!var5.hasNext()) {
               return;
            }

            var11 = (float)var7 < (float)var1 / 2.0F;
            var12 = rfU_2.id_protected((float)var1 / 2.0F - (float)var7 / 2.0F);
            int var14 = var7;
            boolean var15 = var13 < var7;
            if (var11) {
               var14 = var12 + var7;
               var15 = var12 <= var13 && var13 < var12 + var7;
            }

            if (var15) {
               this.id_class(var5, var16, var6, var10, var13);
            } else if (var14 == var13) {
               var16 += var1 - var13;
               break;
            }

            var16++;
         }
      }
   }

   void id_class(Iterator<T> var1, int var2, int var3, int var4, int var5);
}
