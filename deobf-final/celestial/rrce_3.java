package celestial;

public interface rrce_3 {
   void class_(rruO var1);

   default void class_(cG_2 var1) {
      rruO var2 = this.throws_();
      if (var2 != null && !var2.break_()) {
         double var3 = (Double)var1.implements_[13] - var1.rx();
         double var5 = (Double)var1.implements_[15] - var1.BO();
         float var7 = (Float)var1.private_[24] + (Float)var1.private_[23] - (Float)var1.private_[24];
         double var8 = (double)rfU_2.class_(var7 * (float) (Math.PI / 180.0));
         double var10 = (double)(-rfU_2.break_(var7 * (float) (Math.PI / 180.0)));
         float var12 = (float)((Integer)((rruE)rruS.class_[0]).class_[5]).intValue();
         float var13 = (float)((Integer)((rruE)rruS.class_[0]).class_[6]).intValue();
         if (var1.W()) {
            var12 *= 2.0F;
         }

         double var14 = rfU_2.class_(((Double)var1.throws_[9] - var1.re()) * 10.0, 0.0, 1.0);
         if (var1.W()) {
            var2.class_((float)((Integer)((rruE)rruS.class_[0]).class_[4]).intValue() / 10.0F);
         } else {
            var2.class_((float)((Integer)((rruE)rruS.class_[0]).class_[4]).intValue());
         }

         rrub_1 var16 = new rrub_1(0.0F, -1.0F, 0.0F);
         rrux_1 var17 = new rrux_1((float)(var1.rx() - (Double)var1.throws_[8]), (float)(var1.BO() - (Double)var1.throws_[10]));
         var17.byte_(-(Float)var1.throws_[15]);
         double var18 = var3 * var8 + var5 * var10 + var14 + (double)(var1.x() && !var2.throws_() ? 3 : 0);
         double var20 = (var1.re() - (Double)var1.throws_[9]) * (double)var12 + (double)(var1.x() && !var2.throws_() ? 1 : 0);
         double var22 = (double)(-(Float)var17.class_[0] * var13);
         var2.class_(var1.x());
         rrub_1 var24 = new rrub_1((float)var18, (float)var20, (float)var22);
         if (var1.rP()) {
            float var25 = (Float)var1.throws_[16];
            var25 += 90.0F;
            var16.class_(var25);
            var24.class_(var25);
         }

         var2.break_(var16);
         var2.class_(var24);
         var2.byte_();
      }
   }

   default void class_(cG_2 var1, int var2) {
      rruO var3 = this.throws_();
      if (var3 == null || this.break_(var3)) {
         var3 = this.s_();
         this.class_(var3);
      }

      if (var3 != null) {
         boolean var4 = var3.class_(var2);
         if (var4) {
            var3.class_(new rrub_1(1.0F, 1.0F, 0.0F));

            for (int var5 = 0; var5 < 5; var5++) {
               this.class_(var1);
            }
         }
      }
   }

   default boolean break_(rruO var1) {
      rrca_3 var2 = (rrca_3)((rruE)rruS.class_[0]).class_[3];
      return var2 == (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[1] && var1.getClass() != rruh_1.class
         || var2 == (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[2] && var1.getClass() != rrud_1.class;
   }

   rruO throws_();

   default rruO s_() {
      rrca_3 var1 = (rrca_3)((rruE)rruS.class_[0]).class_[3];
      if (var1 == (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[1]) {
         return new rruh_1();
      } else {
         return var1 == (rrca_3)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[2] ? new rrud_1() : null;
      }
   }
}
