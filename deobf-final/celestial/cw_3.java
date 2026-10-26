package celestial;

class cw_3 implements AutoCloseable {
   final rrGb_1 class_;
   private final fk_3 break_;
   private final HU byte_;

   cw_3(ct_3 var1, rrGb_1 var2) {
      this.class_ = var2;
      this.break_ = new fk_3(128, 128, true);
      rqO_2 var3 = var1.byte_.class_("map/" + var2.throws_(), this.break_);
      this.byte_ = HU.int_(var3);
   }

   void class_(Ml_1 var1, Hx_1 var2, boolean var3, int var4) {
      boolean var5 = false;
      boolean var6 = false;
      float var7 = 0.0F;
      rjV_2 var8 = var1.byte_().class_();
      Ok_1 var9 = var2.getBuffer(this.byte_);
      var9.class_(var8, 0.0F, 128.0F, -0.01F).break_(255, 255, 255, 255).class_(0.0F, 1.0F).break_(var4).class_();
      var9.class_(var8, 128.0F, 128.0F, -0.01F).break_(255, 255, 255, 255).class_(1.0F, 1.0F).break_(var4).class_();
      var9.class_(var8, 128.0F, 0.0F, -0.01F).break_(255, 255, 255, 255).class_(1.0F, 0.0F).break_(var4).class_();
      var9.class_(var8, 0.0F, 0.0F, -0.01F).break_(255, 255, 255, 255).class_(0.0F, 0.0F).break_(var4).class_();
      int var10 = 0;

      for (rrGO var12 : this.class_.finally_.values()) {
         if (!var3 || var12.case_()) {
            var1.class_();
            var1.class_((double)(0.0F + (float)var12.byte_() / 2.0F + 64.0F), (double)(0.0F + (float)var12.protected_() / 2.0F + 64.0F), -0.02F);
            var1.class_(rje_3.case_.byte_((float)(var12.throws_() * 360) / 16.0F));
            var1.class_(4.0F, 4.0F, 3.0F);
            var1.class_(-0.125, 0.125, 0.0);
            byte var13 = var12.class_();
            float var14 = (float)(var13 % 16 + 0) / 16.0F;
            float var15 = (float)(var13 / 16 + 0) / 16.0F;
            float var16 = (float)(var13 % 16 + 1) / 16.0F;
            float var17 = (float)(var13 / 16 + 1) / 16.0F;
            rjV_2 var18 = var1.byte_().class_();
            float var19 = -0.001F;
            Ok_1 var20 = var2.getBuffer(ct_3.break_);
            var20.class_(var18, -1.0F, 1.0F, (float)var10 * -0.001F).break_(255, 255, 255, 255).class_(var14, var15).break_(var4).class_();
            var20.class_(var18, 1.0F, 1.0F, (float)var10 * -0.001F).break_(255, 255, 255, 255).class_(var16, var15).break_(var4).class_();
            var20.class_(var18, 1.0F, -1.0F, (float)var10 * -0.001F).break_(255, 255, 255, 255).class_(var16, var17).break_(var4).class_();
            var20.class_(var18, -1.0F, -1.0F, (float)var10 * -0.001F).break_(255, 255, 255, 255).class_(var14, var17).break_(var4).class_();
            var1.break_();
            if (var12.catch_() != null) {
               cm_3 var21 = (cm_3)QY.instanceof_().class_[15];
               rgP_2 var22 = var12.catch_();
               float var23 = (float)var21.class_(var22);
               float var24 = rfU_2.class_(25.0F / var23, 0.0F, 0.6666667F);
               var1.class_();
               var1.class_(
                  (double)(0.0F + (float)var12.byte_() / 2.0F + 64.0F - var23 * var24 / 2.0F),
                  (double)(0.0F + (float)var12.protected_() / 2.0F + 64.0F + 4.0F),
                  -0.025F
               );
               var1.class_(var24, var24, 1.0F);
               var1.class_(0.0, 0.0, -0.1F);
               var21.class_(var22, 0.0F, 0.0F, -1, false, var1.byte_().class_(), var2, false, Integer.MIN_VALUE, var4);
               var1.break_();
            }

            var10++;
         }
      }
   }

   void class_() {
      for (int var1 = 0; var1 < 128; var1++) {
         for (int var2 = 0; var2 < 128; var2++) {
            int var3 = var2 + var1 * 128;
            int var4 = this.class_.catch_[var3] & 255;
            if (var4 / 4 == 0) {
               this.break_.break_().class_(var2, var1, 0);
            } else {
               QS var5 = QS.class_[var4 / 4];
               if (var5 != null) {
                  this.break_.break_().class_(var2, var1, var5.class_(var4 & 3));
               }
            }
         }
      }

      this.break_.class_();
   }

   @Override
   public void close() {
      this.break_.close();
   }
}
