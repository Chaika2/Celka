package celestial;

public class jQ_2 extends tt_3 {
   private final Iq_1 id_break;
   private final Iq_1 id_byte;

   public jQ_2(float var1) {
      this.id_return = 256;
      this.id_public = 256;
      float var2 = -16.0F;
      this.id_break = new Iq_1(this);
      this.id_break.id_class("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, var1, 176, 44);
      this.id_break.id_class("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, var1, 112, 30);
      this.id_break.id_implements = true;
      this.id_break.id_class("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.id_break.id_class("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.id_break.id_implements = false;
      this.id_break.id_class("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.id_break.id_class("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.id_byte = new Iq_1(this);
      this.id_byte.id_class(0.0F, 4.0F, -8.0F);
      this.id_byte.id_class("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, var1, 176, 65);
      this.id_break.id_break(this.id_byte);
   }

   @Override
   public void id_class(float var1, float var2, float var3) {
      this.id_byte.id_case = (float)(Math.sin((double)(var1 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
      this.id_break.id_catch = var2 * (float) (Math.PI / 180.0);
      this.id_break.id_case = var3 * (float) (Math.PI / 180.0);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      var1.id_class();
      var1.id_class(0.0, -0.374375F, 0.0);
      var1.id_class(0.75F, 0.75F, 0.75F);
      this.id_break.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
      var1.id_break();
   }
}
