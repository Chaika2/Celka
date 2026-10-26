package celestial;

import java.util.List;
import java.util.Random;

public class ras_3 {
   static final raQ_2[] id_class = new raQ_2[]{
      new raQ_2(rau_3.class, 30, 0, true),
      new raQ_2(rax_3.class, 10, 4),
      new raQ_2(raX_2.class, 10, 4),
      new raQ_2(raN_2.class, 10, 3),
      new raQ_2(ram_3.class, 5, 2),
      new raQ_2(rak_3.class, 5, 1)
   };
   static final raQ_2[] id_break = new raQ_2[]{
      new raQ_2(rah_3.class, 25, 0, true),
      new raQ_2(raJ_2.class, 15, 5),
      new raQ_2(rab_3.class, 5, 10),
      new raQ_2(raG_2.class, 5, 10),
      new raQ_2(raM_2.class, 10, 3, true),
      new raQ_2(raO_2.class, 7, 2),
      new raQ_2(raW_2.class, 5, 2)
   };

   static raz_3 id_class(raQ_2 var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      Class var8 = var0.id_class;
      Object var9 = null;
      if (var8 == rau_3.class) {
         var9 = rau_3.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == rax_3.class) {
         var9 = rax_3.id_class(var1, var3, var4, var5, var6, var7);
      } else if (var8 == raX_2.class) {
         var9 = raX_2.id_class(var1, var3, var4, var5, var6, var7);
      } else if (var8 == raN_2.class) {
         var9 = raN_2.id_class(var1, var3, var4, var5, var7, var6);
      } else if (var8 == ram_3.class) {
         var9 = ram_3.id_class(var1, var3, var4, var5, var7, var6);
      } else if (var8 == rak_3.class) {
         var9 = rak_3.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == rah_3.class) {
         var9 = rah_3.id_class(var1, var3, var4, var5, var6, var7);
      } else if (var8 == rab_3.class) {
         var9 = rab_3.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == raG_2.class) {
         var9 = raG_2.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var8 == raM_2.class) {
         var9 = raM_2.id_class(var1, var3, var4, var5, var6, var7);
      } else if (var8 == raO_2.class) {
         var9 = raO_2.id_class(var1, var3, var4, var5, var6, var7);
      } else if (var8 == raJ_2.class) {
         var9 = raJ_2.id_class(var1, var3, var4, var5, var6, var7);
      } else if (var8 == raW_2.class) {
         var9 = raW_2.id_class(var1, var3, var4, var5, var6, var7);
      }

      return (raz_3)var9;
   }
}
