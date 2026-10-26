package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public enum fc_3 {
   RGBA(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true),
   RGB(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true),
   LUMINANCE_ALPHA(2, 6410, false, false, false, true, true, 255, 255, 255, 0, 8, true),
   LUMINANCE(1, 6409, false, false, false, true, false, 0, 0, 0, 0, 255, true);

   final int pixelSize;
   private final int glFormat;
   private final boolean red;
   private final boolean green;
   private final boolean blue;
   private final boolean hasLuminance;
   private final boolean hasAlpha;
   private final int offsetRed;
   private final int offsetGreen;
   private final int offsetBlue;
   private final int offsetLuminance;
   private final int offsetAlpha;
   private final boolean serializable;

   public void byte_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      MT.final_(3317, this.class_());
   }

   private fc_3(
      int var3,
      int var4,
      boolean var5,
      boolean var6,
      boolean var7,
      boolean var8,
      boolean var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      boolean var15
   ) {
      this.pixelSize = var3;
      this.glFormat = var4;
      this.red = var5;
      this.green = var6;
      this.blue = var7;
      this.hasLuminance = var8;
      this.hasAlpha = var9;
      this.offsetRed = var10;
      this.offsetGreen = var11;
      this.offsetBlue = var12;
      this.offsetLuminance = var13;
      this.offsetAlpha = var14;
      this.serializable = var15;
   }

   public int class_() {
      return this.pixelSize;
   }

   static fc_3 class_(int var0) {
      switch (var0) {
         case 1:
            return LUMINANCE;
         case 2:
            return LUMINANCE_ALPHA;
         case 3:
            return RGB;
         case 4:
         default:
            return RGBA;
      }
   }

   public void break_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      MT.final_(3333, this.class_());
   }

   public boolean throws_() {
      return this.hasAlpha;
   }

   public boolean catch_() {
      return this.hasLuminance || this.hasAlpha;
   }

   public int case_() {
      return this.offsetAlpha;
   }

   public boolean implements_() {
      return this.serializable;
   }

   public int protected_() {
      return this.glFormat;
   }

   public int private_() {
      return this.hasLuminance ? this.offsetLuminance : this.offsetAlpha;
   }
}
