package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUZ extends rUO<rUm_1> {
   public rUZ(Codec<rUm_1> var1) {
      super(var1);
   }

   private static void class_(rfH_2 var0, rRg_1 var1, Random var2) {
      rfw_3 var3 = var0.new_().class_(rpr_3.DOWN);
      if (var1.finally_(var3)) {
         int var4 = rfU_2.class_(var2, 1, 5);
         if (var2.nextInt(7) == 0) {
            var4 *= 2;
         }

         byte var5 = 23;
         byte var6 = 25;
         reh_3.class_(var1, var2, var3, var4, 23, 25);
      }
   }

   private void class_(rRg_1 var1, Random var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (var1.byte_(var3.break_()).class_(var4.break_())) {
         this.class_(var1, var3, var4);
      } else if ((double)var2.nextFloat() < 0.15) {
         this.class_(var1, var3, var4);
         if (var5 && var2.nextInt(11) == 0) {
            class_(var3, var1, var2);
         }
      }
   }

   private void class_(rRg_1 var1, Random var2, rUm_1 var3, rfw_3 var4, float var5, float var6, float var7) {
      if (var2.nextFloat() < var5) {
         this.class_(var1, var4, var3.implements_);
      } else if (var2.nextFloat() < var6) {
         this.class_(var1, var4, var3.private_);
         if (var2.nextFloat() < var7) {
            class_(var4, var1, var2);
         }
      }
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUm_1 var5) {
      xd_3 var6 = var5.case_.break_();
      rfH_2 var7 = null;
      xd_3 var8 = var1.byte_(var4.break_()).break_();
      if (var8 == var6) {
         var7 = var4;
      }

      if (var7 == null) {
         return false;
      } else {
         int var9 = rfU_2.class_(var3, 4, 13);
         if (var3.nextInt(12) == 0) {
            var9 *= 2;
         }

         if (!var5.finally_) {
            int var10 = var2.throws_();
            if (var7.c_() + var9 + 1 >= var10) {
               return false;
            }
         }

         boolean var11 = !var5.finally_ && var3.nextFloat() < 0.06F;
         var1.class_(var4, xu_3.class_.continue_(), 4);
         this.class_(var1, var3, var5, var7, var9, var11);
         this.break_(var1, var3, var5, var7, var9, var11);
         return true;
      }
   }

   private void class_(rRg_1 var1, Random var2, rUm_1 var3, rfH_2 var4, int var5, boolean var6) {
      rfw_3 var7 = new rfw_3();
      xc_3 var8 = var3.catch_;
      int var9 = var6 ? 1 : 0;

      for (int var10 = -var9; var10 <= var9; var10++) {
         for (int var11 = -var9; var11 <= var9; var11++) {
            boolean var12 = var6 && rfU_2.class_(var10) == var9 && rfU_2.class_(var11) == var9;

            for (int var13 = 0; var13 < var5; var13++) {
               var7.class_(var4, var10, var13, var11);
               if (class_(var1, var7, true)) {
                  if (var3.finally_) {
                     if (!var1.byte_(var7.break_()).catch_()) {
                        var1.break_(var7, true);
                     }

                     var1.class_(var7, var8, 3);
                  } else if (var12) {
                     if (var2.nextFloat() < 0.1F) {
                        this.class_(var1, var7, var8);
                     }
                  } else {
                     this.class_(var1, var7, var8);
                  }
               }
            }
         }
      }
   }

   private static boolean class_(rRg_1 var0, rfH_2 var1, boolean var2) {
      return var0.class_(var1, var1x -> {
         QP var2x = var1x.byte_();
         return var1x.byte_().throws_() || var2 && var2x == QP.throws_;
      });
   }

   private void break_(rRg_1 var1, Random var2, rUm_1 var3, rfH_2 var4, int var5, boolean var6) {
      rfw_3 var7 = new rfw_3();
      boolean var8 = var3.private_.class_(xu_3.bg);
      int var9 = Math.min(var2.nextInt(1 + var5 / 3) + 5, var5);
      int var10 = var5 - var9;

      for (int var11 = var10; var11 <= var5; var11++) {
         int var12 = var11 < var5 - var2.nextInt(3) ? 2 : 1;
         if (var9 > 8 && var11 < var10 + 4) {
            var12 = 3;
         }

         if (var6) {
            var12++;
         }

         for (int var13 = -var12; var13 <= var12; var13++) {
            for (int var14 = -var12; var14 <= var12; var14++) {
               boolean var15 = var13 == -var12 || var13 == var12;
               boolean var16 = var14 == -var12 || var14 == var12;
               boolean var17 = !var15 && !var16 && var11 != var5;
               boolean var18 = var15 && var16;
               boolean var19 = var11 < var10 + 3;
               var7.class_(var4, var13, var11, var14);
               if (class_(var1, var7, false)) {
                  if (var3.finally_ && !var1.byte_(var7.break_()).catch_()) {
                     var1.break_(var7, true);
                  }

                  if (var19) {
                     if (!var17) {
                        this.class_(var1, var2, var7, var3.private_, var8);
                     }
                  } else if (var17) {
                     this.class_(var1, var2, var3, var7, 0.1F, 0.2F, var8 ? 0.1F : 0.0F);
                  } else if (var18) {
                     this.class_(var1, var2, var3, var7, 0.01F, 0.7F, var8 ? 0.083F : 0.0F);
                  } else {
                     this.class_(var1, var2, var3, var7, 5.0E-4F, 0.98F, var8 ? 0.07F : 0.0F);
                  }
               }
            }
         }
      }
   }
}
