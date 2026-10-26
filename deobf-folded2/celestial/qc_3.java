package celestial;

public abstract class qc_3<T extends is_3, M extends tp_3<T>> extends qd_3<T, M> {
   public qc_3(pg_3 var1, M var2, float var3) {
      super(var1, (M)var2, var3);
   }

   public static void id_class(
      Ok_1 var0, rjV_2 var1, int var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, boolean var10, float var11, float var12
   ) {
      float var13 = 0.5F;
      float var14 = 0.4F;
      float var15 = 0.3F;
      if (var9 % 2 == 0) {
         var13 *= 0.7F;
         var14 *= 0.7F;
         var15 *= 0.7F;
      }

      float var16 = (float)var9 / (float)var8;
      float var17 = var3 * var16;
      float var18 = var4 > 0.0F ? var4 * var16 * var16 : var4 - var4 * (1.0F - var16) * (1.0F - var16);
      float var19 = var5 * var16;
      if (!var10) {
         var0.id_class(var1, var17 + var11, var18 + var6 - var7, var19 - var12).id_class(var13, var14, var15, 1.0F).id_break(var2).id_class();
      }

      var0.id_class(var1, var17 - var11, var18 + var7, var19 + var12).id_class(var13, var14, var15, 1.0F).id_break(var2).id_class();
      if (var10) {
         var0.id_class(var1, var17 + var11, var18 + var6 - var7, var19 - var12).id_class(var13, var14, var15, 1.0F).id_break(var2).id_class();
      }
   }

   public static void id_class(
      Ok_1 var0, rjV_2 var1, float var2, float var3, float var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12
   ) {
      byte var13 = 24;

      for (int var14 = 0; var14 < 24; var14++) {
         float var15 = (float)var14 / 23.0F;
         int var16 = (int)rfU_2.id_catch(var15, (float)var5, (float)var6);
         int var17 = (int)rfU_2.id_catch(var15, (float)var7, (float)var8);
         int var18 = HQ.id_class(var16, var17);
         id_class(var0, var1, var18, var2, var3, var4, var9, var10, 24, var14, false, var11, var12);
         id_class(var0, var1, var18, var2, var3, var4, var9, var10, 24, var14 + 1, true, var11, var12);
      }
   }

   public boolean id_class(T var1, yt_3 var2, double var3, double var5, double var7) {
      if (super.id_class((T)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         an_3 var9 = var1.N();
         return var9 != null ? var2.id_class(var9.PE()) : false;
      }
   }

   public void id_class(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      an_3 var7 = var1.N();
      if (var7 != null) {
         this.id_class((T)var1, var3, var4, var5, var7);
      }
   }

   private <E extends an_3> void id_class(T var1, float var2, Ml_1 var3, Hx_1 var4, E var5) {
      if (!rrbb_3.rs() || !rrdZ.id_new) {
         var3.id_class();
         rjU_2 var6 = var5.id_class(var2);
         double var7 = (double)(rfU_2.id_catch(var2, (Float)var1.id_private[23], (Float)var1.id_private[24]) * (float) (Math.PI / 180.0)) + (Math.PI / 2);
         rjU_2 var9 = var1.BA();
         double var10 = Math.cos(var7) * var9.id_protected + Math.sin(var7) * var9.id_break;
         double var12 = Math.sin(var7) * var9.id_protected - Math.cos(var7) * var9.id_break;
         double var14 = rfU_2.id_protected((double)var2, (Double)var1.id_throws[8], var1.rx()) + var10;
         double var16 = rfU_2.id_protected((double)var2, (Double)var1.id_throws[9], var1.re()) + var9.id_byte;
         double var18 = rfU_2.id_protected((double)var2, (Double)var1.id_throws[10], var1.BO()) + var12;
         var3.id_class(var10, var9.id_byte, var12);
         float var20 = (float)(var6.id_break - var14);
         float var21 = (float)(var6.id_byte - var16);
         float var22 = (float)(var6.id_protected - var18);
         float var23 = 0.025F;
         Ok_1 var24 = var4.getBuffer(HU.id_native());
         rjV_2 var25 = var3.id_byte().id_class();
         float var26 = rfU_2.id_implements(var20 * var20 + var22 * var22) * 0.025F / 2.0F;
         float var27 = var22 * var26;
         float var28 = var20 * var26;
         rfH_2 var29 = new rfH_2(var1.id_new(var2));
         rfH_2 var30 = new rfH_2(var5.id_new(var2));
         int var31 = this.id_class((T)var1, var29);
         int var32 = this.id_break.id_class(var5).id_class(var5, var30);
         int var33 = ((rYB)var1.id_throws[7]).id_class(rRo_1.SKY, var29);
         int var34 = ((rYB)var1.id_throws[7]).id_class(rRo_1.SKY, var30);
         if (rrbb_3.rs()) {
            rrdZ.Z();
         }

         id_class(var24, var25, var20, var21, var22, var31, var32, var33, var34, 0.025F, 0.025F, var27, var28);
         id_class(var24, var25, var20, var21, var22, var31, var32, var33, var34, 0.025F, 0.0F, var27, var28);
         if (rrbb_3.rs()) {
            rrdZ.v();
         }

         var3.id_break();
      }
   }

   protected boolean id_break(T var1) {
      return super.id_break((T)var1) && (var1.rJ() || var1.Bk() && var1 == this.id_break.id_byte);
   }
}
