package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FT extends FG<rJo_1> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/smithing.png");

   public FT(rJo_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3, id_class);
      this.id_public = 60;
      this.id_goto = 18;
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.id_class(var1, var2, var3);
   }
}
