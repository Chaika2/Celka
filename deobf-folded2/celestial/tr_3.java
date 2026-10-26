package celestial;

public class tr_3<T extends iB_2> extends Tf_1<T, wh_3<T>> {
   public static final rqO_2 id_class = new rqO_2("textures/entity/trident_riptide.png");
   private final Iq_1 id_break = new Iq_1(64, 64, 0, 0);

   public tr_3(qE_2<T, wh_3<T>> var1) {
      super(var1);
      this.id_break.id_class(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.Sz()) {
         Ok_1 var11 = var2.getBuffer(HU.id_protected(id_class));

         for (int var12 = 0; var12 < 3; var12++) {
            var1.id_class();
            float var13 = var8 * (float)(-(45 + var12 * 5));
            var1.id_class(rje_3.id_protected.id_byte(var13));
            float var14 = 0.75F * (float)var12;
            var1.id_class(var14, var14, var14);
            var1.id_class(0.0, (double)(-0.2F + 0.6F * (float)var12), 0.0);
            this.id_break.id_class(var1, var11, var3, fZ_2.id_class);
            var1.id_break();
         }
      }
   }
}
