package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class fZ_2 implements AutoCloseable {
   public static final int id_class = id_class(0, 10);
   private final fk_3 id_break = new fk_3(16, 16, false);

   public fZ_2() {
      fN_2 var1 = this.id_break.id_break();

      for (int var2 = 0; var2 < 16; var2++) {
         for (int var3 = 0; var3 < 16; var3++) {
            if (var2 < 8) {
               var1.id_class(var3, var2, -1308622593);
            } else {
               int var4 = (int)((1.0F - (float)var3 / 15.0F * 0.75F) * 255.0F);
               var1.id_class(var3, var2, var4 << 24 | 16777215);
            }
         }
      }

      RenderSystem.activeTexture(33985);
      this.id_break.id_super();
      RenderSystem.matrixMode(5890);
      RenderSystem.loadIdentity();
      float var5 = 0.06666667F;
      RenderSystem.scalef(0.06666667F, 0.06666667F, 0.06666667F);
      RenderSystem.matrixMode(5888);
      this.id_break.id_super();
      var1.id_class(0, 0, 0, 0, 0, var1.id_class(), var1.id_break(), false, true, false, false);
      RenderSystem.activeTexture(33984);
   }

   public static int id_class(boolean var0) {
      return var0 ? 3 : 10;
   }

   public static int id_class(float var0, boolean var1) {
      return id_class(id_class(var0), id_class(var1));
   }

   public static int id_class(int var0, int var1) {
      return var0 | var1 << 16;
   }

   public void id_class() {
      if (!rrdZ.a()) {
         RenderSystem.setupOverlayColor(this.id_break::id_new, 16);
      }
   }

   public static int id_class(float var0) {
      return (int)(var0 * 15.0F);
   }

   @Override
   public void close() {
      this.id_break.close();
   }

   public void id_break() {
      if (!rrdZ.a()) {
         RenderSystem.teardownOverlayColor();
      }
   }
}
