package celestial;

public class TV extends Tf_1<rhP_2, te_3<rhP_2>> {
   private static final rqO_2[] id_class = new rqO_2[]{
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
   private static final rqO_2 id_break = new rqO_2("textures/entity/llama/decor/trader_llama.png");
   private final te_3<rhP_2> id_byte = new te_3<>(0.5F);

   public TV(qE_2<rhP_2, te_3<rhP_2>> var1) {
      super(var1);
   }

   public void id_class(Ml_1 var1, Hx_1 var2, int var3, rhP_2 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      rxL_2 var11 = var4.sa();
      rqO_2 var12;
      if (var11 != null) {
         var12 = id_class[var11.id_break()];
      } else {
         if (!var4.sK()) {
            return;
         }

         var12 = id_break;
      }

      this.id_byte().id_class(this.id_byte);
      this.id_byte.id_class((rhP_2)var4, var5, var6, var8, var9, var10);
      Ok_1 var13 = var2.getBuffer(HU.id_protected(var12));
      this.id_byte.id_class(var1, var13, var3, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
