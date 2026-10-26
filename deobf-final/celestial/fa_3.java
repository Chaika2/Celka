package celestial;

public class fa_3 extends jW_2<rHW> {
   public static final Ig_1 class_ = new Ig_1(fJ_2.class_, new rqO_2("entity/bell/bell_body"));
   private final Iq_1 break_ = new Iq_1(32, 32, 0, 0);

   public fa_3(jz_3 var1) {
      super(var1);
      this.break_.class_(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F);
      this.break_.class_(8.0F, 12.0F, 8.0F);
      Iq_1 var2 = new Iq_1(32, 32, 0, 13);
      var2.class_(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F);
      var2.class_(-8.0F, -12.0F, -8.0F);
      this.break_.break_(var2);
   }

   public void class_(rHW var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      float var7 = (float)var1.class_ + var2;
      float var8 = 0.0F;
      float var9 = 0.0F;
      if (var1.break_) {
         float var10 = rfU_2.class_(var7 / (float) Math.PI) / (4.0F + var7 / 3.0F);
         if (var1.byte_ == rpr_3.NORTH) {
            var8 = -var10;
         } else if (var1.byte_ == rpr_3.SOUTH) {
            var8 = var10;
         } else if (var1.byte_ == rpr_3.EAST) {
            var9 = -var10;
         } else if (var1.byte_ == rpr_3.WEST) {
            var9 = var10;
         }
      }

      this.break_.case_ = var8;
      this.break_.private_ = var9;
      Ok_1 var11 = class_.class_(var4, HU::break_);
      this.break_.class_(var3, var11, var5, var6);
   }
}
