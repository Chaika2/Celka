package celestial;

import java.util.Random;

public class qX_2 extends pV_2<rsE_2> {
   private final Hz_1 id_class;
   private final Random id_throws = new Random();

   public qX_2(pg_3 var1, Hz_1 var2) {
      super(var1);
      this.id_class = var2;
      this.id_byte = 0.15F;
      this.id_protected = 0.75F;
   }

   public rqO_2 id_class(rsE_2 var1) {
      return fJ_2.id_class;
   }

   private int id_class(rdn_3 var1) {
      if (var1.id_char() > 48) {
         return 5;
      } else if (var1.id_char() > 32) {
         return 4;
      } else if (var1.id_char() > 16) {
         return 3;
      } else {
         return var1.id_char() > 1 ? 2 : 1;
      }
   }

   public void id_class(rsE_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      ItemPhysics var7 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().Z();
      boolean var8 = var7.aJ_();
      float var9 = var7.id_new();
      var4.id_class();
      rdn_3 var10 = var1.id_protected();
      int var11 = var10.id_class() ? 187 : rdb_3.id_class(var10.id_break()) + var10.id_catch();
      this.id_throws.setSeed((long)var11);
      IJ var12 = this.id_class.id_class(var10, (rYB)var1.id_throws[7], null);
      boolean var13 = var12.id_break();
      int var14 = this.id_class(var10);
      if (!var8) {
         float var15 = rfU_2.id_class(((float)var1.id_catch() + var3) / 10.0F + var1.id_class) * 0.1F + 0.1F;
         if (!this.id_case()) {
            var15 = 0.0F;
         }

         float var16 = var12.id_case().id_class(IQ.GROUND).id_protected.id_break();
         var4.id_class(0.0, (double)(var15 + 0.25F * var16), 0.0);
         float var17 = var1.id_byte(var3);
         var4.id_class(rje_3.id_protected.id_break(var17));
      } else {
         boolean var22 = var1.PZ();
         if (var22) {
            var4.id_class(0.0, 0.15F, 0.0);
         }

         if (!var1.BL() && !var22) {
            float var24 = (((float)var1.id_catch() + var3) / 20.0F + var1.id_class) * (180.0F / (float)Math.PI);
            var4.id_class(rje_3.id_break.id_byte(var24 * var9));
         } else {
            var4.id_class(rje_3.id_protected.id_byte((Float)var1.id_throws[15]));
            var4.id_class(rje_3.id_break.id_byte((Float)var1.id_throws[16] + (var1.id_protected().id_break() instanceof rxJ_2 ? 0.0F : 90.0F)));
         }
      }

      float var23 = var12.id_case().id_private.id_protected.id_class();
      float var25 = var12.id_case().id_private.id_protected.id_break();
      float var26 = var12.id_case().id_private.id_protected.id_byte();
      if (!var13) {
         float var18 = -0.0F * (float)(var14 - 1) * 0.5F * var23;
         float var19 = -0.0F * (float)(var14 - 1) * 0.5F * var25;
         float var20 = -0.09375F * (float)(var14 - 1) * 0.5F * var26;
         var4.id_class((double)var18, (double)var19, (double)var20);
      }

      for (int var27 = 0; var27 < var14; var27++) {
         var4.id_class();
         if (var27 > 0) {
            if (var13) {
               float var28 = (this.id_throws.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var30 = (this.id_throws.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var21 = (this.id_throws.nextFloat() * 2.0F - 1.0F) * 0.15F;
               if (!this.id_throws()) {
                  var28 = 0.0F;
                  var30 = 0.0F;
               }

               var4.id_class((double)var28, (double)var30, (double)var21);
            } else {
               float var29 = (this.id_throws.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float var31 = (this.id_throws.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               var4.id_class((double)var29, (double)var31, 0.0);
            }
         }

         this.id_class.id_class(var10, IQ.GROUND, false, var4, var5, var6, fZ_2.id_class, var12);
         var4.id_break();
         if (!var13) {
            var4.id_class((double)(0.0F * var23), (double)(0.0F * var25), (double)(0.09375F * var26));
         }
      }

      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public boolean id_throws() {
      return true;
   }

   public boolean id_case() {
      return true;
   }
}
