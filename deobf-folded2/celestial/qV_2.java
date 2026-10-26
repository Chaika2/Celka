package celestial;

public class qV_2 extends qc_3<rGA, wA_2<rGA>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/slime/slime.png");

   public qV_2(pg_3 var1) {
      super(var1, new wA_2<>(16), 0.25F);
      this.id_class(new Te_1<>(this));
   }

   protected void id_class(rGA var1, Ml_1 var2, float var3) {
      float var4 = 0.999F;
      var2.id_class(0.999F, 0.999F, 0.999F);
      var2.id_class(0.0, 0.001F, 0.0);
      float var5 = (float)var1.sk();
      float var6 = rfU_2.id_catch(var3, var1.id_protected, var1.id_break) / (var5 * 0.5F + 1.0F);
      float var7 = 1.0F / (var6 + 1.0F);
      var2.id_class(var7 * var5, 1.0F / var7 * var5, var7 * var5);
   }

   public rqO_2 id_class(rGA var1) {
      return id_class;
   }

   public void id_class(rGA var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      this.id_byte = 0.25F * (float)var1.sk();
      super.id_class((rGA)var1, var2, var3, var4, var5, var6);
   }
}
