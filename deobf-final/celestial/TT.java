package celestial;

public class TT<T extends iB_2, M extends tp_3<T> & tR_2> extends Tf_1<T, M> {
   public TT(qE_2<T, M> var1) {
      super(var1);
   }

   private void class_(iB_2 var1, rdn_3 var2, IQ var3, rpZ_2 var4, Ml_1 var5, Hx_1 var6, int var7) {
      if (!var2.class_()) {
         var5.class_();
         this.byte_().class_(var4, var5);
         var5.class_(rje_3.break_.byte_(-90.0F));
         var5.class_(rje_3.protected_.byte_(180.0F));
         boolean var8 = var4 == rpZ_2.LEFT;
         var5.class_((double)((float)(var8 ? -1 : 1) / 16.0F), 0.125, -0.625);
         QY.instanceof_().import_().class_(var1, var2, var3, var8, var5, var6, var7);
         var5.break_();
      }
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var11 = var4.Su() == rpZ_2.RIGHT;
      rdn_3 var12 = var11 ? var4.Sn() : var4.ss();
      rdn_3 var13 = var11 ? var4.ss() : var4.Sn();
      if (!var12.class_() || !var13.class_()) {
         var1.class_();
         if (this.byte_().int_) {
            float var14 = 0.5F;
            var1.class_(0.0, 0.75, 0.0);
            var1.class_(0.5F, 0.5F, 0.5F);
         }

         this.class_(var4, var13, IQ.THIRD_PERSON_RIGHT_HAND, rpZ_2.RIGHT, var1, var2, var3);
         this.class_(var4, var12, IQ.THIRD_PERSON_LEFT_HAND, rpZ_2.LEFT, var1, var2, var3);
         var1.break_();
      }
   }
}
