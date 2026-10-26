package celestial;

public class TV extends Tf_1<rhP_2, te_3<rhP_2>> {
   private static final rqO_2[] class_ = new rqO_2[]{
      new rqO_2("textures/entity/llama/decor/white.png"),
      new rqO_2("textures/entity/llama/decor/orange.png"),
      new rqO_2("textures/entity/llama/decor/magenta.png"),
      new rqO_2("textures/entity/llama/decor/light_blue.png"),
      new rqO_2("textures/entity/llama/decor/yellow.png"),
      new rqO_2("textures/entity/llama/decor/lime.png"),
      new rqO_2("textures/entity/llama/decor/pink.png"),
      new rqO_2("textures/entity/llama/decor/gray.png"),
      new rqO_2("textures/entity/llama/decor/light_gray.png"),
      new rqO_2("textures/entity/llama/decor/cyan.png"),
      new rqO_2("textures/entity/llama/decor/purple.png"),
      new rqO_2("textures/entity/llama/decor/blue.png"),
      new rqO_2("textures/entity/llama/decor/brown.png"),
      new rqO_2("textures/entity/llama/decor/green.png"),
      new rqO_2("textures/entity/llama/decor/red.png"),
      new rqO_2("textures/entity/llama/decor/black.png")
   };
   private static final rqO_2 break_ = new rqO_2("textures/entity/llama/decor/trader_llama.png");
   private final te_3<rhP_2> byte_ = new te_3<>(0.5F);

   public TV(qE_2<rhP_2, te_3<rhP_2>> var1) {
      super(var1);
   }

   public void class_(Ml_1 var1, Hx_1 var2, int var3, rhP_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rxL_2 var11 = var4.sa();
      rqO_2 var12;
      if (var11 != null) {
         var12 = class_[var11.break_()];
      } else {
         if (!var4.sK()) {
            return;
         }

         var12 = break_;
      }

      this.byte_().class_(this.byte_);
      this.byte_.class_((rhP_2)var4, var5, var6, var8, var9, var10);
      Ok_1 var13 = var2.getBuffer(HU.protected_(var12));
      this.byte_.class_(var1, var13, var3, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
