package celestial;

public class tr_3<T extends iB_2> extends Tf_1<T, wh_3<T>> {
   public static final rqO_2 class_ = new rqO_2("textures/entity/trident_riptide.png");
   private final Iq_1 break_ = new Iq_1(64, 64, 0, 0);

   public tr_3(qE_2<T, wh_3<T>> var1) {
      super(var1);
      this.break_.class_(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.Sz()) {
         Ok_1 var11 = var2.getBuffer(HU.protected_(class_));

         for (int var12 = 0; var12 < 3; var12++) {
            var1.class_();
            float var13 = var8 * (float)(-(45 + var12 * 5));
            var1.class_(rje_3.protected_.byte_(var13));
            float var14 = 0.75F * (float)var12;
            var1.class_(var14, var14, var14);
            var1.class_(0.0, (double)(-0.2F + 0.6F * (float)var12), 0.0);
            this.break_.class_(var1, var11, var3, fZ_2.class_);
            var1.break_();
         }
      }
   }
}
