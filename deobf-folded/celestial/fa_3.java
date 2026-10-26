package celestial;

public class fa_3 extends jW_2<rHW> {
   public static final Ig_1 id_class = new Ig_1(fJ_2.id_class, new rqO_2("entity/bell/bell_body"));
   private final Iq_1 id_break = new Iq_1(32, 32, 0, 0);

   public fa_3(jz_3 var1) {
      super(var1);
      this.id_break.id_class(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F);
      this.id_break.id_class(8.0F, 12.0F, 8.0F);
      Iq_1 var2 = new Iq_1(32, 32, 0, 13);
      var2.id_class(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F);
      var2.id_class(-8.0F, -12.0F, -8.0F);
      this.id_break.id_break(var2);
   }

   public void id_class(rHW var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      float var7 = (float)var1.id_class + var2;
      float var8 = 0.0F;
      float var9 = 0.0F;
      if (var1.id_break) {
         float var10 = rfU_2.id_class(var7 / (float) Math.PI) / (4.0F + var7 / 3.0F);
         if (var1.id_byte == rpr_3.NORTH) {
            var8 = -var10;
         } else if (var1.id_byte == rpr_3.SOUTH) {
            var8 = var10;
         } else if (var1.id_byte == rpr_3.EAST) {
            var9 = -var10;
         } else if (var1.id_byte == rpr_3.WEST) {
            var9 = var10;
         }
      }

      this.id_break.id_case = var8;
      this.id_break.id_private = var9;
      Ok_1 var11 = id_class.id_class(var4, HU::id_break);
      this.id_break.id_class(var3, var11, var5, var6);
   }
}
