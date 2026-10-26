package celestial;

public class wp_3 extends In_1 {
   public static final rqO_2 id_class = new rqO_2("textures/entity/trident.png");
   private final Iq_1 id_break = new Iq_1(32, 32, 0, 6);

   public wp_3() {
      super(HU::id_break);
      this.id_break.id_class(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F, 0.0F);
      Iq_1 var1 = new Iq_1(32, 32, 4, 0);
      var1.id_class(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F);
      this.id_break.id_break(var1);
      Iq_1 var2 = new Iq_1(32, 32, 4, 3);
      var2.id_class(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.id_break.id_break(var2);
      Iq_1 var3 = new Iq_1(32, 32, 0, 0);
      var3.id_class(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.id_break.id_break(var3);
      Iq_1 var4 = new Iq_1(32, 32, 4, 3);
      var4.id_implements = true;
      var4.id_class(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.id_break.id_break(var4);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.id_break.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
