package celestial;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;

public class rDG extends rDk_1<rUV> {
   private final float[] id_volatile = new float[1024];

   public rDG(Codec<rUV> var1) {
      super(var1, 256);
   }

   @Override
   protected boolean id_class(double var1, double var3, double var5, int var7) {
      return (var1 * var1 + var5 * var5) * (double)this.id_volatile[var7 - 1] + var3 * var3 / 6.0 >= 1.0;
   }

   private void id_class(
      roC_2 var1,
      Function<rfH_2, rYG> var2,
      long var3,
      int var5,
      int var6,
      int var7,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      int var17,
      int var18,
      double var19,
      BitSet var21
   ) {
      Random var22 = new Random(var3);
      float var23 = 1.0F;

      for (int var24 = 0; var24 < 256; var24++) {
         if (var24 == 0 || var22.nextInt(3) == 0) {
            var23 = 1.0F + var22.nextFloat() * var22.nextFloat();
         }

         this.id_volatile[var24] = var23 * var23;
      }

      float var34 = 0.0F;
      float var25 = 0.0F;

      for (int var26 = var17; var26 < var18; var26++) {
         double var27 = 1.5 + (double)(rfU_2.id_class((float)var26 * (float) Math.PI / (float)var18) * var14);
         double var29 = var27 * var19;
         var27 *= (double)var22.nextFloat() * 0.25 + 0.75;
         var29 *= (double)var22.nextFloat() * 0.25 + 0.75;
         float var31 = rfU_2.id_break(var16);
         float var32 = rfU_2.id_class(var16);
         var8 += (double)(rfU_2.id_break(var15) * var31);
         var10 += (double)var32;
         var12 += (double)(rfU_2.id_class(var15) * var31);
         var16 *= 0.7F;
         var16 += var25 * 0.05F;
         var15 += var34 * 0.05F;
         var25 *= 0.8F;
         var34 *= 0.5F;
         var25 += (var22.nextFloat() - var22.nextFloat()) * var22.nextFloat() * 2.0F;
         var34 += (var22.nextFloat() - var22.nextFloat()) * var22.nextFloat() * 4.0F;
         if (var22.nextInt(4) != 0) {
            if (!this.id_class(var6, var7, var8, var12, var26, var18, var14)) {
               return;
            }

            this.id_class(var1, var2, var3, var5, var6, var7, var8, var10, var12, var27, var29, var21);
         }
      }
   }

   public boolean id_class(roC_2 var1, Function<rfH_2, rYG> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9, rUV var10) {
      int var11 = (this.id_protected() * 2 - 1) * 16;
      double var12 = (double)(var5 * 16 + var3.nextInt(16));
      double var14 = (double)(var3.nextInt(var3.nextInt(40) + 8) + 20);
      double var16 = (double)(var6 * 16 + var3.nextInt(16));
      float var18 = var3.nextFloat() * (float) (Math.PI * 2);
      float var19 = (var3.nextFloat() - 0.5F) * 2.0F / 8.0F;
      double var20 = 3.0;
      float var22 = (var3.nextFloat() * 2.0F + var3.nextFloat()) * 2.0F;
      int var23 = var11 - var3.nextInt(var11 / 4);
      boolean var24 = false;
      this.id_class(var1, var2, var3.nextLong(), var4, var7, var8, var12, var14, var16, var22, var18, var19, 0, var23, 3.0, var9);
      return true;
   }

   public boolean id_class(Random var1, int var2, int var3, rUV var4) {
      return var1.nextFloat() <= var4.id_break;
   }
}
