package celestial;

public class wm_3 extends In_1 {
   private final Iq_1 id_class;
   private final Iq_1 id_break;

   public wm_3() {
      super(HU::id_break);
      this.id_return = 64;
      this.id_public = 64;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F, 0.0F);
      this.id_break = new Iq_1(this, 26, 0);
      this.id_break.id_class(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F, 0.0F);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.id_class.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
      this.id_break.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Iq_1 id_class() {
      return this.id_class;
   }

   public Iq_1 id_break() {
      return this.id_break;
   }
}
