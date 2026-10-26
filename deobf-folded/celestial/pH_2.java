package celestial;

public class pH_2 extends qc_3<rEJ, tA_2<rEJ>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/creeper/creeper.png");

   public pH_2(pg_3 var1) {
      super(var1, new tA_2<>(), 0.5F);
      this.id_class(new Tv_1(this));
   }

   protected void id_class(rEJ var1, Ml_1 var2, float var3) {
      float var4 = var1.id_throw(var3);
      float var5 = 1.0F + rfU_2.id_class(var4 * 100.0F) * var4 * 0.01F;
      var4 = rfU_2.id_class(var4, 0.0F, 1.0F);
      var4 *= var4;
      var4 *= var4;
      float var6 = (1.0F + var4 * 0.4F) * var5;
      float var7 = (1.0F + var4 * 0.1F) / var5;
      var2.id_class(var6, var7, var6);
   }

   public rqO_2 id_class(rEJ var1) {
      return id_class;
   }

   protected float id_class(rEJ var1, float var2) {
      float var3 = var1.id_throw(var2);
      return (int)(var3 * 10.0F) % 2 == 0 ? 0.0F : rfU_2.id_class(var3, 0.5F, 1.0F);
   }
}
