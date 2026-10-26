package celestial;

public class pt_3 extends pV_2<rSa_1> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/end_crystal/end_crystal.png");
   private static final HU id_throws = HU.id_protected(id_class);
   private static final float id_case = (float)Math.sin(Math.PI / 4);
   private final Iq_1 id_catch;
   private final Iq_1 id_private;
   private final Iq_1 id_implements;

   public pt_3(pg_3 var1) {
      super(var1);
      this.id_byte = 0.5F;
      this.id_private = new Iq_1(64, 32, 0, 0);
      this.id_private.id_class(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.id_catch = new Iq_1(64, 32, 32, 0);
      this.id_catch.id_class(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.id_implements = new Iq_1(64, 32, 0, 16);
      this.id_implements.id_class(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F);
   }

   public boolean id_class(rSa_1 var1, yt_3 var2, double var3, double var5, double var7) {
      return super.id_class(var1, var2, var3, var5, var7) || var1.id_protected() != null;
   }

   public void id_class(rSa_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      float var7 = id_class(var1, var3);
      float var8 = ((float)var1.id_class + var3) * 3.0F;
      Ok_1 var9 = var5.getBuffer(id_throws);
      var4.id_class();
      var4.id_class(2.0F, 2.0F, 2.0F);
      var4.id_class(0.0, -0.5, 0.0);
      int var10 = fZ_2.id_class;
      if (var1.id_throws()) {
         this.id_implements.id_class(var4, var9, var6, var10);
      }

      var4.id_class(rje_3.id_protected.id_byte(var8));
      var4.id_class(0.0, (double)(1.5F + var7 / 2.0F), 0.0);
      var4.id_class(new rjY_2(new rje_3(id_case, 0.0F, id_case), 60.0F, true));
      this.id_private.id_class(var4, var9, var6, var10);
      float var11 = 0.875F;
      var4.id_class(0.875F, 0.875F, 0.875F);
      var4.id_class(new rjY_2(new rje_3(id_case, 0.0F, id_case), 60.0F, true));
      var4.id_class(rje_3.id_protected.id_byte(var8));
      this.id_private.id_class(var4, var9, var6, var10);
      var4.id_class(0.875F, 0.875F, 0.875F);
      var4.id_class(new rjY_2(new rje_3(id_case, 0.0F, id_case), 60.0F, true));
      var4.id_class(rje_3.id_protected.id_byte(var8));
      this.id_catch.id_class(var4, var9, var6, var10);
      var4.id_break();
      var4.id_break();
      rfH_2 var12 = var1.id_protected();
      if (var12 != null) {
         float var13 = (float)var12.b_() + 0.5F;
         float var14 = (float)var12.c_() + 0.5F;
         float var15 = (float)var12.d_() + 0.5F;
         float var16 = (float)((double)var13 - var1.rx());
         float var17 = (float)((double)var14 - var1.re());
         float var18 = (float)((double)var15 - var1.BO());
         var4.id_class((double)var16, (double)var17, (double)var18);
         pw_3.id_class(-var16, -var17 + var7, -var18, var3, var1.id_class, var4, var5, var6);
      }

      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public rqO_2 id_class(rSa_1 var1) {
      return id_class;
   }

   public static float id_class(rSa_1 var0, float var1) {
      float var2 = (float)var0.id_class + var1;
      float var3 = rfU_2.id_class(var2 * 0.2F) / 2.0F + 0.5F;
      var3 = (var3 * var3 + var3) * 0.4F;
      return var3 - 1.4F;
   }
}
