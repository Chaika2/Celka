package celestial;

public class pv_3 extends pV_2<rSK> {
   private static final rqO_2[] id_throws = new rqO_2[]{
      new rqO_2("textures/entity/boat/oak.png"),
      new rqO_2("textures/entity/boat/spruce.png"),
      new rqO_2("textures/entity/boat/birch.png"),
      new rqO_2("textures/entity/boat/jungle.png"),
      new rqO_2("textures/entity/boat/acacia.png"),
      new rqO_2("textures/entity/boat/dark_oak.png")
   };
   protected final tu_3 id_class = new tu_3();

   public pv_3(pg_3 var1) {
      super(var1);
      this.id_byte = 0.8F;
   }

   public void id_class(rSK var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      var4.id_class();
      var4.id_class(0.0, 0.375, 0.0);
      var4.id_class(rje_3.id_protected.id_byte(180.0F - var2));
      float var7 = (float)var1.id_implements() - var3;
      float var8 = var1.id_private() - var3;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var7 > 0.0F) {
         var4.id_class(rje_3.id_break.id_byte(rfU_2.id_class(var7) * var7 * var8 / 10.0F * (float)var1.id_final()));
      }

      float var9 = var1.id_protected(var3);
      if (!rfU_2.id_class(var9, 0.0F)) {
         var4.id_class(new rjY_2(new rje_3(1.0F, 0.0F, 1.0F), var1.id_protected(var3), true));
      }

      var4.id_class(-1.0F, -1.0F, 1.0F);
      var4.id_class(rje_3.id_protected.id_byte(90.0F));
      this.id_class.id_class(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      Ok_1 var10 = var5.getBuffer(this.id_class.id_class(this.id_class(var1)));
      this.id_class.id_class(var4, var10, var6, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!var1.W()) {
         Ok_1 var11 = var5.getBuffer(HU.id_volatile());
         this.id_class.id_byte().id_class(var4, var11, var6, fZ_2.id_class);
      }

      var4.id_break();
      super.id_class(var1, var2, var3, var4, var5, var6);
   }

   public rqO_2 id_class(rSK var1) {
      return id_throws[var1.id_package().ordinal()];
   }
}
