package celestial;

public class pv_3 extends pV_2<rSK> {
   private static final rqO_2[] throws_ = new rqO_2[]{
      new rqO_2("textures/entity/boat/oak.png"),
      new rqO_2("textures/entity/boat/spruce.png"),
      new rqO_2("textures/entity/boat/birch.png"),
      new rqO_2("textures/entity/boat/jungle.png"),
      new rqO_2("textures/entity/boat/acacia.png"),
      new rqO_2("textures/entity/boat/dark_oak.png")
   };
   protected final tu_3 class_ = new tu_3();

   public pv_3(pg_3 var1) {
      super(var1);
      this.byte_ = 0.8F;
   }

   public void class_(rSK var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.class_();
      var4.class_(0.0, 0.375, 0.0);
      var4.class_(rje_3.protected_.byte_(180.0F - var2));
      float var7 = (float)var1.implements_() - var3;
      float var8 = var1.private_() - var3;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var7 > 0.0F) {
         var4.class_(rje_3.break_.byte_(rfU_2.class_(var7) * var7 * var8 / 10.0F * (float)var1.final_()));
      }

      float var9 = var1.protected_(var3);
      if (!rfU_2.class_(var9, 0.0F)) {
         var4.class_(new rjY_2(new rje_3(1.0F, 0.0F, 1.0F), var1.protected_(var3), true));
      }

      var4.class_(-1.0F, -1.0F, 1.0F);
      var4.class_(rje_3.protected_.byte_(90.0F));
      this.class_.class_(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      Ok_1 var10 = var5.getBuffer(this.class_.class_(this.class_(var1)));
      this.class_.class_(var4, var10, var6, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!var1.W()) {
         Ok_1 var11 = var5.getBuffer(HU.volatile_());
         this.class_.byte_().class_(var4, var11, var6, fZ_2.class_);
      }

      var4.break_();
      super.class_(var1, var2, var3, var4, var5, var6);
   }

   public rqO_2 class_(rSK var1) {
      return throws_[var1.package_().ordinal()];
   }
}
