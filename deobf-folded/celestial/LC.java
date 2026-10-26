package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class LC extends Lv_1 {
   private static final rqO_2 id_class = new rqO_2("textures/gui/checkbox.png");
   private boolean id_throws;
   private final boolean id_case;

   public LC(int var1, int var2, int var3, int var4, rgP_2 var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, true);
   }

   public LC(int var1, int var2, int var3, int var4, rgP_2 var5, boolean var6, boolean var7) {
      super(var1, var2, var3, var4, var5);
      this.id_throws = var6;
      this.id_case = var7;
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.id_instanceof();
      var5.A().id_class(id_class);
      RenderSystem.enableDepthTest();
      cm_3 var6 = (cm_3)var5.id_class[15];
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.id_continue);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      id_class(var1, this.id_volatile, this.id_final, this.aO_() ? 20.0F : 0.0F, this.id_throws ? 20.0F : 0.0F, 20, this.id_native, 64, 64);
      this.id_class(var1, var5, var2, var3);
      if (this.id_case) {
         id_break(
            var1, var6, this.C_(), this.id_volatile + 24, this.id_final + (this.id_native - 8) / 2, 14737632 | rfU_2.id_case(this.id_continue * 255.0F) << 24
         );
      }
   }

   @Override
   public void id_catch() {
      this.id_throws = !this.id_throws;
   }

   public boolean id_private() {
      return this.id_throws;
   }
}
