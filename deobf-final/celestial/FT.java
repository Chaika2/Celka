package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FT extends FG<rJo_1> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/smithing.png");

   public FT(rJo_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3, class_);
      this.public_ = 60;
      this.goto_ = 18;
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.class_(var1, var2, var3);
   }
}
