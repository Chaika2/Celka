package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rii_3 {
   private static final rrrM[] id_class = new rrrM[]{
      new rrrM(rrrz_1.class, 40, 0),
      new rrrM(rrrh_1.class, 5, 5),
      new rrrM(rrrG.class, 20, 0),
      new rrrM(rrrX.class, 20, 0),
      new rrrM(rrrJ.class, 10, 6),
      new rrrM(rrrk_1.class, 5, 5),
      new rrrM(rrrx_1.class, 5, 5),
      new rrrM(rrrE.class, 5, 4),
      new rrrM(rrrS.class, 5, 4),
      new rrrr_1(rrrb_1.class, 10, 2),
      new rrrP(rrrO.class, 20, 1)
   };
   private static List<rrrM> id_break;
   static Class<? extends rrrQ> id_byte;
   private static int id_protected;
   static final rrrW id_throws = new rrrW();

   private static rrrQ id_class(Class<? extends rrrQ> var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      Object var8 = null;
      if (var0 == rrrz_1.class) {
         var8 = rrrz_1.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrh_1.class) {
         var8 = rrrh_1.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrG.class) {
         var8 = rrrG.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrX.class) {
         var8 = rrrX.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrJ.class) {
         var8 = rrrJ.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrk_1.class) {
         var8 = rrrk_1.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrx_1.class) {
         var8 = rrrx_1.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrE.class) {
         var8 = rrrE.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrS.class) {
         var8 = rrrS.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrb_1.class) {
         var8 = rrrb_1.id_class(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrO.class) {
         var8 = rrrO.id_class(var1, var3, var4, var5, var6, var7);
      }

      return (rrrQ)var8;
   }

   public static void id_class() {
      id_break = Lists.newArrayList();

      for (rrrM var3 : id_class) {
         var3.id_byte = 0;
         id_break.add(var3);
      }

      id_byte = null;
   }

   private static rrrQ id_class(rrrd_1 var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      if (!id_break()) {
         return null;
      } else {
         if (id_byte != null) {
            rrrQ var8 = id_class(id_byte, var1, var2, var3, var4, var5, var6, var7);
            id_byte = null;
            if (var8 != null) {
               return var8;
            }
         }

         int var13 = 0;

         while (var13 < 5) {
            var13++;
            int var9 = var2.nextInt(id_protected);

            for (rrrM var11 : id_break) {
               var9 -= var11.id_break;
               if (var9 < 0) {
                  if (!var11.id_class(var7) || var11 == var0.id_class) {
                     break;
                  }

                  rrrQ var12 = id_class(var11.id_class, var1, var2, var3, var4, var5, var6, var7);
                  if (var12 != null) {
                     var11.id_byte++;
                     var0.id_class = var11;
                     if (!var11.id_class()) {
                        id_break.remove(var11);
                     }

                     return var12;
                  }
               }
            }
         }

         rfi_3 var14 = rrrs_1.id_class(var1, var2, var3, var4, var5, var6);
         return var14 != null && var14.id_break > 1 ? new rrrs_1(var7, var14, var6) : null;
      }
   }

   static rrrn_1 id_break(rrrd_1 var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.id_catch().id_class) <= 112 && Math.abs(var5 - var0.id_catch().id_byte) <= 112) {
         rrrQ var8 = id_class(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            var1.add(var8);
            var0.id_byte.add(var8);
         }

         return var8;
      } else {
         return null;
      }
   }

   private static boolean id_break() {
      boolean var0 = false;
      id_protected = 0;

      for (rrrM var2 : id_break) {
         if (var2.id_protected > 0 && var2.id_byte < var2.id_protected) {
            var0 = true;
         }

         id_protected = id_protected + var2.id_break;
      }

      return var0;
   }
}
