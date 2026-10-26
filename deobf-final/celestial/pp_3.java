package celestial;

public class pp_3 extends pV_2<rhA_2> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/enderdragon/dragon_fireball.png");
   private static final HU throws_ = HU.protected_(class_);

   public pp_3(pg_3 var1) {
      super(var1);
   }

   public rqO_2 class_(rhA_2 var1) {
      return class_;
   }

   protected int class_(rhA_2 var1, rfH_2 var2) {
      return 15;
   }

   private static void class_(Ok_1 var0, rjV_2 var1, rjj_3 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.class_(var1, var4 - 0.5F, (float)var5 - 0.25F, 0.0F)
         .break_(255, 255, 255, 255)
         .class_((float)var6, (float)var7)
         .byte_(fZ_2.class_)
         .break_(var3)
         .class_(var2, 0.0F, 1.0F, 0.0F)
         .class_();
   }

   public void class_(rhA_2 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      var4.class_(2.0F, 2.0F, 2.0F);
      var4.class_(this.break_.byte_());
      var4.class_(rje_3.protected_.byte_(180.0F));
      MH var7 = var4.byte_();
      rjV_2 var8 = var7.class_();
      rjj_3 var9 = var7.break_();
      Ok_1 var10 = var5.getBuffer(throws_);
      class_(var10, var8, var9, var6, 0.0F, 0, 0, 1);
      class_(var10, var8, var9, var6, 1.0F, 0, 1, 1);
      class_(var10, var8, var9, var6, 1.0F, 1, 1, 0);
      class_(var10, var8, var9, var6, 0.0F, 1, 0, 0);
      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }
}
