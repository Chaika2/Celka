package celestial;

public class fe_3 extends jW_2<rHJ> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1[] id_byte = new Iq_1[4];

   public fe_3(jz_3 var1) {
      super(var1);
      this.id_class = new Iq_1(64, 64, 0, 0);
      this.id_class.id_class(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.id_break = new Iq_1(64, 64, 0, 22);
      this.id_break.id_class(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.id_byte[0] = new Iq_1(64, 64, 50, 0);
      this.id_byte[1] = new Iq_1(64, 64, 50, 6);
      this.id_byte[2] = new Iq_1(64, 64, 50, 12);
      this.id_byte[3] = new Iq_1(64, 64, 50, 18);
      this.id_byte[0].id_class(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.id_byte[1].id_class(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.id_byte[2].id_class(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.id_byte[3].id_class(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.id_byte[0].id_case = (float) (Math.PI / 2);
      this.id_byte[1].id_case = (float) (Math.PI / 2);
      this.id_byte[2].id_case = (float) (Math.PI / 2);
      this.id_byte[3].id_case = (float) (Math.PI / 2);
      this.id_byte[0].id_private = 0.0F;
      this.id_byte[1].id_private = (float) (Math.PI / 2);
      this.id_byte[2].id_private = (float) (Math.PI * 3.0 / 2.0);
      this.id_byte[3].id_private = (float) Math.PI;
   }

   private void id_class(Ml_1 var1, Hx_1 var2, boolean var3, rpr_3 var4, Ig_1 var5, int var6, int var7, boolean var8) {
      this.id_class.id_finally = var3;
      this.id_break.id_finally = !var3;
      this.id_byte[0].id_finally = !var3;
      this.id_byte[1].id_finally = var3;
      this.id_byte[2].id_finally = !var3;
      this.id_byte[3].id_finally = var3;
      var1.id_class();
      var1.id_class(0.0, 0.5625, var8 ? -1.0 : 0.0);
      var1.id_class(rje_3.id_break.id_byte(90.0F));
      var1.id_class(0.5, 0.5, 0.5);
      var1.id_class(rje_3.id_case.id_byte(180.0F + var4.id_package()));
      var1.id_class(-0.5, -0.5, -0.5);
      Ok_1 var9 = var5.id_class(var2, HU::id_break);
      this.id_class.id_class(var1, var9, var6, var7);
      this.id_break.id_class(var1, var9, var6, var7);
      this.id_byte[0].id_class(var1, var9, var6, var7);
      this.id_byte[1].id_class(var1, var9, var6, var7);
      this.id_byte[2].id_class(var1, var9, var6, var7);
      this.id_byte[3].id_class(var1, var9, var6, var7);
      var1.id_break();
   }

   public void id_class(rHJ var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      Ig_1 var7 = lp_3.id_finally[var1.id_class().id_break()];
      rYB var8 = var1.id_while();
      if (var8 != null) {
         xc_3 var9 = var1.id_abstract();
         ryJ_2 var10 = ryh_3.id_class(ryW_2.id_public, xb_3::id_implements, xb_3::id_private, xt_3.id_final, var9, var8, var1.id_char(), (var0, var1x) -> false);
         int var11 = var10.apply(new jB_2()).get(var5);
         this.id_class(var3, var4, var9.id_byte(xb_3.id_volatile) == rCp_1.HEAD, var9.id_byte(xb_3.p), var7, var11, var6, false);
      } else {
         this.id_class(var3, var4, true, rpr_3.SOUTH, var7, var5, var6, false);
         this.id_class(var3, var4, false, rpr_3.SOUTH, var7, var5, var6, true);
      }
   }
}
