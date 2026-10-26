package celestial;

public class pp_3 extends pV_2<rhA_2> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/enderdragon/dragon_fireball.png");
   private static final HU id_throws = HU.id_protected(id_class);

   public pp_3(pg_3 var1) {
      super(var1);
   }

   public rqO_2 id_class(rhA_2 var1) {
      return id_class;
   }

   protected int id_class(rhA_2 var1, rfH_2 var2) {
      return 15;
   }

   private static void id_class(Ok_1 var0, rjV_2 var1, rjj_3 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.id_class(var1, var4 - 0.5F, (float)var5 - 0.25F, 0.0F)
         .id_break(255, 255, 255, 255)
         .id_class((float)var6, (float)var7)
         .id_byte(fZ_2.id_class)
         .id_break(var3)
         .id_class(var2, 0.0F, 1.0F, 0.0F)
         .id_class();
   }

   public void id_class(rhA_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(2.0F, 2.0F, 2.0F);
      var4.id_class(this.id_break.id_byte());
      var4.id_class(rje_3.id_protected.id_byte(180.0F));
      MH var7 = var4.id_byte();
      rjV_2 var8 = var7.id_class();
      rjj_3 var9 = var7.id_break();
      Ok_1 var10 = var5.getBuffer(id_throws);
      id_class(var10, var8, var9, var6, 0.0F, 0, 0, 1);
      id_class(var10, var8, var9, var6, 1.0F, 0, 1, 1);
      id_class(var10, var8, var9, var6, 1.0F, 1, 1, 0);
      id_class(var10, var8, var9, var6, 0.0F, 1, 0, 0);
      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
