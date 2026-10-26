package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rii_3 {
   private static final rrrM[] class_ = new rrrM[]{
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
   private static List<rrrM> break_;
   static Class<? extends rrrQ> byte_;
   private static int protected_;
   static final rrrW throws_ = new rrrW();

   private static rrrQ class_(Class<? extends rrrQ> var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      Object var8 = null;
      if (var0 == rrrz_1.class) {
         var8 = rrrz_1.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrh_1.class) {
         var8 = rrrh_1.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrG.class) {
         var8 = rrrG.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrX.class) {
         var8 = rrrX.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrJ.class) {
         var8 = rrrJ.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrk_1.class) {
         var8 = rrrk_1.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrx_1.class) {
         var8 = rrrx_1.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrE.class) {
         var8 = rrrE.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrS.class) {
         var8 = rrrS.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrb_1.class) {
         var8 = rrrb_1.class_(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == rrrO.class) {
         var8 = rrrO.class_(var1, var3, var4, var5, var6, var7);
      }

      return (rrrQ)var8;
   }

   public static void class_() {
      break_ = Lists.newArrayList();

      for (rrrM var3 : class_) {
         var3.byte_ = 0;
         break_.add(var3);
      }

      byte_ = null;
   }

   private static rrrQ class_(rrrd_1 var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      if (!break_()) {
         return null;
      } else {
         if (byte_ != null) {
            rrrQ var8 = class_(byte_, var1, var2, var3, var4, var5, var6, var7);
            byte_ = null;
            if (var8 != null) {
               return var8;
            }
         }

         int var13 = 0;

         while (var13 < 5) {
            var13++;
            int var9 = var2.nextInt(protected_);

            for (rrrM var11 : break_) {
               var9 -= var11.break_;
               if (var9 < 0) {
                  if (!var11.class_(var7) || var11 == var0.class_) {
                     break;
                  }

                  rrrQ var12 = class_(var11.class_, var1, var2, var3, var4, var5, var6, var7);
                  if (var12 != null) {
                     var11.byte_++;
                     var0.class_ = var11;
                     if (!var11.class_()) {
                        break_.remove(var11);
                     }

                     return var12;
                  }
               }
            }
         }

         rfi_3 var14 = rrrs_1.class_(var1, var2, var3, var4, var5, var6);
         return var14 != null && var14.break_ > 1 ? new rrrs_1(var7, var14, var6) : null;
      }
   }

   static rrrn_1 break_(rrrd_1 var0, List<rrrn_1> var1, Random var2, int var3, int var4, int var5, rpr_3 var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.catch_().class_) <= 112 && Math.abs(var5 - var0.catch_().byte_) <= 112) {
         rrrQ var8 = class_(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (var8 != null) {
            var1.add(var8);
            var0.byte_.add(var8);
         }

         return var8;
      } else {
         return null;
      }
   }

   private static boolean break_() {
      boolean var0 = false;
      protected_ = 0;

      for (rrrM var2 : break_) {
         if (var2.protected_ > 0 && var2.byte_ < var2.protected_) {
            var0 = true;
         }

         protected_ = protected_ + var2.break_;
      }

      return var0;
   }
}
