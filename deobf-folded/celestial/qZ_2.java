package celestial;

public class qZ_2 extends pV_2<rsO_2> {
   public qZ_2(pg_3 var1) {
      super(var1);
   }

   private void id_class(
      rjV_2 var1, rjj_3 var2, Ok_1 var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      var3.id_class(var1, var4, var5, var8)
         .id_break(255, 255, 255, 255)
         .id_class(var6, var7)
         .id_byte(fZ_2.id_class)
         .id_break(var12)
         .id_class(var2, (float)var9, (float)var10, (float)var11)
         .id_class();
   }

   private void id_class(Ml_1 var1, Ok_1 var2, rsO_2 var3, int var4, int var5, fj_3 var6, fj_3 var7) {
      MH var8 = var1.id_byte();
      rjV_2 var9 = var8.id_class();
      rjj_3 var10 = var8.id_break();
      float var11 = (float)(-var4) / 2.0F;
      float var12 = (float)(-var5) / 2.0F;
      float var13 = 0.5F;
      float var14 = var7.id_case();
      float var15 = var7.id_catch();
      float var16 = var7.id_private();
      float var17 = var7.id_implements();
      float var18 = var7.id_case();
      float var19 = var7.id_catch();
      float var20 = var7.id_private();
      float var21 = var7.id_break(1.0);
      float var22 = var7.id_case();
      float var23 = var7.id_class(1.0);
      float var24 = var7.id_private();
      float var25 = var7.id_implements();
      int var26 = var4 / 16;
      int var27 = var5 / 16;
      double var28 = 16.0 / (double)var26;
      double var30 = 16.0 / (double)var27;

      for (int var32 = 0; var32 < var26; var32++) {
         for (int var33 = 0; var33 < var27; var33++) {
            float var34 = var11 + (float)((var32 + 1) * 16);
            float var35 = var11 + (float)(var32 * 16);
            float var36 = var12 + (float)((var33 + 1) * 16);
            float var37 = var12 + (float)(var33 * 16);
            int var38 = rfU_2.id_byte(var3.rx());
            int var39 = rfU_2.id_byte(var3.re() + (double)((var36 + var37) / 2.0F / 16.0F));
            int var40 = rfU_2.id_byte(var3.BO());
            rpr_3 var41 = var3.Pg();
            if (var41 == rpr_3.NORTH) {
               var38 = rfU_2.id_byte(var3.rx() + (double)((var34 + var35) / 2.0F / 16.0F));
            }

            if (var41 == rpr_3.WEST) {
               var40 = rfU_2.id_byte(var3.BO() - (double)((var34 + var35) / 2.0F / 16.0F));
            }

            if (var41 == rpr_3.SOUTH) {
               var38 = rfU_2.id_byte(var3.rx() - (double)((var34 + var35) / 2.0F / 16.0F));
            }

            if (var41 == rpr_3.EAST) {
               var40 = rfU_2.id_byte(var3.BO() + (double)((var34 + var35) / 2.0F / 16.0F));
            }

            int var42 = yX_2.id_class((rYB)var3.id_throws[7], new rfH_2(var38, var39, var40));
            float var43 = var6.id_class(var28 * (double)(var26 - var32));
            float var44 = var6.id_class(var28 * (double)(var26 - (var32 + 1)));
            float var45 = var6.id_break(var30 * (double)(var27 - var33));
            float var46 = var6.id_break(var30 * (double)(var27 - (var33 + 1)));
            this.id_class(var9, var10, var2, var34, var37, var44, var45, -0.5F, 0, 0, -1, var42);
            this.id_class(var9, var10, var2, var35, var37, var43, var45, -0.5F, 0, 0, -1, var42);
            this.id_class(var9, var10, var2, var35, var36, var43, var46, -0.5F, 0, 0, -1, var42);
            this.id_class(var9, var10, var2, var34, var36, var44, var46, -0.5F, 0, 0, -1, var42);
            this.id_class(var9, var10, var2, var34, var36, var14, var16, 0.5F, 0, 0, 1, var42);
            this.id_class(var9, var10, var2, var35, var36, var15, var16, 0.5F, 0, 0, 1, var42);
            this.id_class(var9, var10, var2, var35, var37, var15, var17, 0.5F, 0, 0, 1, var42);
            this.id_class(var9, var10, var2, var34, var37, var14, var17, 0.5F, 0, 0, 1, var42);
            this.id_class(var9, var10, var2, var34, var36, var18, var20, -0.5F, 0, 1, 0, var42);
            this.id_class(var9, var10, var2, var35, var36, var19, var20, -0.5F, 0, 1, 0, var42);
            this.id_class(var9, var10, var2, var35, var36, var19, var21, 0.5F, 0, 1, 0, var42);
            this.id_class(var9, var10, var2, var34, var36, var18, var21, 0.5F, 0, 1, 0, var42);
            this.id_class(var9, var10, var2, var34, var37, var18, var20, 0.5F, 0, -1, 0, var42);
            this.id_class(var9, var10, var2, var35, var37, var19, var20, 0.5F, 0, -1, 0, var42);
            this.id_class(var9, var10, var2, var35, var37, var19, var21, -0.5F, 0, -1, 0, var42);
            this.id_class(var9, var10, var2, var34, var37, var18, var21, -0.5F, 0, -1, 0, var42);
            this.id_class(var9, var10, var2, var34, var36, var23, var24, 0.5F, -1, 0, 0, var42);
            this.id_class(var9, var10, var2, var34, var37, var23, var25, 0.5F, -1, 0, 0, var42);
            this.id_class(var9, var10, var2, var34, var37, var22, var25, -0.5F, -1, 0, 0, var42);
            this.id_class(var9, var10, var2, var34, var36, var22, var24, -0.5F, -1, 0, 0, var42);
            this.id_class(var9, var10, var2, var35, var36, var23, var24, -0.5F, 1, 0, 0, var42);
            this.id_class(var9, var10, var2, var35, var37, var23, var25, -0.5F, 1, 0, 0, var42);
            this.id_class(var9, var10, var2, var35, var37, var22, var25, 0.5F, 1, 0, 0, var42);
            this.id_class(var9, var10, var2, var35, var36, var22, var24, 0.5F, 1, 0, 0, var42);
         }
      }
   }

   public rqO_2 id_class(rsO_2 var1) {
      return QY.id_instanceof().id_boolean().id_byte().id_extends().id_protected();
   }

   public void id_class(rsO_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(rje_3.id_protected.id_byte(180.0F - var2));
      rsh_3 var7 = var1.id_catch;
      float var8 = 0.0625F;
      var4.id_class(0.0625F, 0.0625F, 0.0625F);
      Ok_1 var9 = var5.getBuffer(HU.id_break(this.id_class(var1)));
      fv_3 var10 = QY.id_instanceof().id_boolean();
      this.id_class(var4, var9, var1, var7.id_class(), var7.id_break(), var10.id_class(var7), var10.id_byte());
      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
