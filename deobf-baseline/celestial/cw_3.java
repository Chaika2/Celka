package celestial;

class cw_3 implements AutoCloseable {
   final rrGb_1 id_class;
   private final fk_3 id_break;
   private final HU id_byte;

   cw_3(ct_3 var1, rrGb_1 var2) {
      this.id_class = var2;
      this.id_break = new fk_3(128, 128, true);
      rqO_2 var3 = var1.id_byte.id_class("map/" + var2.id_throws(), this.id_break);
      this.id_byte = HU.id_int(var3);
   }

   void id_class(Ml_1 var1, Hx_1 var2, boolean var3, int var4) {
      boolean var5 = false;
      boolean var6 = false;
      float var7 = 0.0F;
      rjV_2 var8 = var1.id_byte().id_class();
      Ok_1 var9 = var2.getBuffer(this.id_byte);
      var9.id_class(var8, 0.0F, 128.0F, -0.01F).id_break(255, 255, 255, 255).id_class(0.0F, 1.0F).id_break(var4).id_class();
      var9.id_class(var8, 128.0F, 128.0F, -0.01F).id_break(255, 255, 255, 255).id_class(1.0F, 1.0F).id_break(var4).id_class();
      var9.id_class(var8, 128.0F, 0.0F, -0.01F).id_break(255, 255, 255, 255).id_class(1.0F, 0.0F).id_break(var4).id_class();
      var9.id_class(var8, 0.0F, 0.0F, -0.01F).id_break(255, 255, 255, 255).id_class(0.0F, 0.0F).id_break(var4).id_class();
      int var10 = 0;

      for (rrGO var12 : this.id_class.id_finally.values()) {
         if (!var3 || var12.id_case()) {
            var1.id_class();
            var1.id_class((double)(0.0F + (float)var12.id_byte() / 2.0F + 64.0F), (double)(0.0F + (float)var12.id_protected() / 2.0F + 64.0F), -0.02F);
            var1.id_class(rje_3.id_case.id_byte((float)(var12.id_throws() * 360) / 16.0F));
            var1.id_class(4.0F, 4.0F, 3.0F);
            var1.id_class(-0.125, 0.125, 0.0);
            byte var13 = var12.id_class();
            float var14 = (float)(var13 % 16 + 0) / 16.0F;
            float var15 = (float)(var13 / 16 + 0) / 16.0F;
            float var16 = (float)(var13 % 16 + 1) / 16.0F;
            float var17 = (float)(var13 / 16 + 1) / 16.0F;
            rjV_2 var18 = var1.id_byte().id_class();
            float var19 = -0.001F;
            Ok_1 var20 = var2.getBuffer(ct_3.id_break);
            var20.id_class(var18, -1.0F, 1.0F, (float)var10 * -0.001F).id_break(255, 255, 255, 255).id_class(var14, var15).id_break(var4).id_class();
            var20.id_class(var18, 1.0F, 1.0F, (float)var10 * -0.001F).id_break(255, 255, 255, 255).id_class(var16, var15).id_break(var4).id_class();
            var20.id_class(var18, 1.0F, -1.0F, (float)var10 * -0.001F).id_break(255, 255, 255, 255).id_class(var16, var17).id_break(var4).id_class();
            var20.id_class(var18, -1.0F, -1.0F, (float)var10 * -0.001F).id_break(255, 255, 255, 255).id_class(var14, var17).id_break(var4).id_class();
            var1.id_break();
            if (var12.id_catch() != null) {
               cm_3 var21 = (cm_3)QY.id_instanceof().id_class[15];
               rgP_2 var22 = var12.id_catch();
               float var23 = (float)var21.id_class(var22);
               float var24 = rfU_2.id_class(25.0F / var23, 0.0F, 0.6666667F);
               var1.id_class();
               var1.id_class(
                  (double)(0.0F + (float)var12.id_byte() / 2.0F + 64.0F - var23 * var24 / 2.0F),
                  (double)(0.0F + (float)var12.id_protected() / 2.0F + 64.0F + 4.0F),
                  -0.025F
               );
               var1.id_class(var24, var24, 1.0F);
               var1.id_class(0.0, 0.0, -0.1F);
               var21.id_class(var22, 0.0F, 0.0F, -1, false, var1.id_byte().id_class(), var2, false, Integer.MIN_VALUE, var4);
               var1.id_break();
            }

            var10++;
         }
      }
   }

   void id_class() {
      for (int var1 = 0; var1 < 128; var1++) {
         for (int var2 = 0; var2 < 128; var2++) {
            int var3 = var2 + var1 * 128;
            int var4 = this.id_class.id_catch[var3] & 255;
            if (var4 / 4 == 0) {
               this.id_break.id_break().id_class(var2, var1, 0);
            } else {
               QS var5 = QS.id_class[var4 / 4];
               if (var5 != null) {
                  this.id_break.id_break().id_class(var2, var1, var5.id_class(var4 & 3));
               }
            }
         }
      }

      this.id_break.id_class();
   }

   @Override
   public void close() {
      this.id_break.close();
   }
}
