package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class fZ_2 implements AutoCloseable {
   public static final int class_ = class_(0, 10);
   private final fk_3 break_ = new fk_3(16, 16, false);

   public fZ_2() {
      fN_2 var1 = this.break_.break_();

      for (int var2 = 0; var2 < 16; var2++) {
         for (int var3 = 0; var3 < 16; var3++) {
            if (var2 < 8) {
               var1.class_(var3, var2, -1308622593);
            } else {
               int var4 = (int)((1.0F - (float)var3 / 15.0F * 0.75F) * 255.0F);
               var1.class_(var3, var2, var4 << 24 | 16777215);
            }
         }
      }

      RenderSystem.activeTexture(33985);
      this.break_.super_();
      RenderSystem.matrixMode(5890);
      RenderSystem.loadIdentity();
      float var5 = 0.06666667F;
      RenderSystem.scalef(0.06666667F, 0.06666667F, 0.06666667F);
      RenderSystem.matrixMode(5888);
      this.break_.super_();
      var1.class_(0, 0, 0, 0, 0, var1.class_(), var1.break_(), false, true, false, false);
      RenderSystem.activeTexture(33984);
   }

   public static int class_(boolean var0) {
      return var0 ? 3 : 10;
   }

   public static int class_(float var0, boolean var1) {
      return class_(class_(var0), class_(var1));
   }

   public static int class_(int var0, int var1) {
      return var0 | var1 << 16;
   }

   public void class_() {
      if (!rrdZ.a()) {
         RenderSystem.setupOverlayColor(this.break_::new_, 16);
      }
   }

   public static int class_(float var0) {
      return (int)(var0 * 15.0F);
   }

   @Override
   public void close() {
      this.break_.close();
   }

   public void break_() {
      if (!rrdZ.a()) {
         RenderSystem.teardownOverlayColor();
      }
   }
}
