package celestial;

import java.util.List;
import java.util.Random;

public class raf_3 {
   private static raR_2 id_class(List<rrrn_1> var0, Random var1, int var2, int var3, int var4, rpr_3 var5, int var6, raU_2 var7) {
      int var8 = var1.nextInt(100);
      if (var8 >= 80) {
         rfi_3 var9 = rag_3.id_class(var0, var1, var2, var3, var4, var5);
         if (var9 != null) {
            return new rag_3(var6, var9, var5, var7);
         }
      } else if (var8 >= 70) {
         rfi_3 var10 = rao_3.id_class(var0, var1, var2, var3, var4, var5);
         if (var10 != null) {
            return new rao_3(var6, var10, var5, var7);
         }
      } else {
         rfi_3 var11 = raV_2.id_class(var0, var1, var2, var3, var4, var5);
         if (var11 != null) {
            return new raV_2(var6, var1, var11, var5, var7);
         }
      }

      return null;
   }

   static raR_2 id_class(rrrn_1 var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      if (var7 > 8) {
         return null;
      } else if (Math.abs(var3 - var0.id_catch().id_class) <= 80 && Math.abs(var5 - var0.id_catch().id_byte) <= 80) {
         raU_2 var8 = ((raR_2)var0).id_class;
         raR_2 var9 = id_class(var1, var2, var3, var4, var5, var6, var7 + 1, var8);
         if (var9 != null) {
            var1.add(var9);
            var9.id_class(var0, var1, var2);
         }

         return var9;
      } else {
         return null;
      }
   }
}
