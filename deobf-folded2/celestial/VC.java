package celestial;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.IntBuffer;

public class VC {
   public int id_class;
   public int id_break;
   public int id_byte;
   public int id_protected;
   public final boolean id_throws;
   public int id_case;
   private int id_implements;
   private int id_finally;
   public final float[] id_catch;
   public int id_private;
   private boolean id_extends = false;

   private void id_byte(boolean var1) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         MT.id_private(Vl_1.id_class, this.id_case);
         if (var1) {
            MT.id_protected(0, 0, this.id_byte, this.id_protected);
         }
      }
   }

   public void id_byte(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      if (!RenderSystem.isInInitPhase()) {
         RenderSystem.recordRenderCall(() -> this.id_throws(var1, var2, var3));
      } else {
         this.id_throws(var1, var2, var3);
      }
   }

   public void id_byte() {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         MT.id_super(this.id_implements);
      }
   }

   public VC(int var1, int var2, boolean var3, boolean var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.id_throws = var3;
      this.id_case = -1;
      this.id_implements = -1;
      this.id_finally = -1;
      this.id_catch = new float[4];
      this.id_catch[0] = 1.0F;
      this.id_catch[1] = 1.0F;
      this.id_catch[2] = 1.0F;
      this.id_catch[3] = 0.0F;
      this.id_class(var1, var2, var4);
   }

   public void id_class(int var1, int var2) {
      this.id_byte(var1, var2, true);
   }

   public void id_class(boolean var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.id_byte(var1));
      } else {
         this.id_byte(var1);
      }
   }

   public void id_class(float var1, float var2, float var3, float var4) {
      this.id_catch[0] = var1;
      this.id_catch[1] = var2;
      this.id_catch[2] = var3;
      this.id_catch[3] = var4;
   }

   public void id_class(VC var1) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         if (MT.r()) {
            MT.id_private(36008, var1.id_case);
            MT.id_private(36009, this.id_case);
            MT.id_class(0, 0, var1.id_class, var1.id_break, 0, 0, this.id_class, this.id_break, 256, 9728);
         } else {
            MT.id_private(Vl_1.id_class, this.id_case);
            int var2 = MT.id_continue();
            if (var2 != 0) {
               int var3 = MT.id_this();
               MT.id_super(var2);
               MT.id_private(Vl_1.id_class, var1.id_case);
               MT.id_class(3553, 0, 0, 0, 0, 0, Math.min(this.id_class, var1.id_class), Math.min(this.id_break, var1.id_break));
               MT.id_super(var3);
            }
         }

         MT.id_private(Vl_1.id_class, 0);
      }
   }

   public void id_class(int var1, int var2, boolean var3) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.id_protected(var1, var2, var3));
      } else {
         this.id_protected(var1, var2, var3);
      }
   }

   public void id_class() {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         this.id_protected();
         this.id_throws();
         if (this.id_finally > -1) {
            fo_3.id_class(this.id_finally);
            this.id_finally = -1;
         }

         if (this.id_implements > -1) {
            fo_3.id_class(this.id_implements);
            this.id_implements = -1;
         }

         if (this.id_case > -1) {
            MT.id_private(Vl_1.id_class, 0);
            MT.id_extends(this.id_case);
            this.id_case = -1;
         }
      }
   }

   public void id_class(int var1) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         this.id_private = var1;
         MT.id_super(this.id_implements);
         MT.id_break(3553, 10241, var1);
         MT.id_break(3553, 10240, var1);
         MT.id_break(3553, 10242, 10496);
         MT.id_break(3553, 10243, 10496);
         MT.id_super(0);
      }
   }

   public void id_break() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      int var1 = MT.id_native(Vl_1.id_class);
      if (var1 != Vl_1.id_throws) {
         if (var1 == Vl_1.id_case) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
         } else if (var1 == Vl_1.id_catch) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
         } else if (var1 == Vl_1.id_private) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
         } else if (var1 == Vl_1.id_implements) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
         } else {
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + var1);
         }
      }
   }

   public void id_break(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.id_class(true);
      MT.id_break(this.id_catch[0], this.id_catch[1], this.id_catch[2], this.id_catch[3]);
      short var2 = 16384;
      if (this.id_throws) {
         MT.id_class(1.0);
         var2 |= 256;
      }

      MT.id_class(var2, var1);
      this.id_throws();
   }

   public void id_break(int var1) {
      this.id_finally = var1;
   }

   public void id_break(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_class = var1;
      this.id_break = var2;
      if (!GLX.isUsingFBOs()) {
         this.id_break(var3);
      } else {
         this.id_case = MT.id_super();
         this.id_implements = fo_3.id_class();
         if (this.id_throws) {
            this.id_finally = fo_3.id_class();
            MT.id_super(this.id_finally);
            MT.id_break(3553, 10241, 9728);
            MT.id_break(3553, 10240, 9728);
            MT.id_break(3553, 10242, 10496);
            MT.id_break(3553, 10243, 10496);
            MT.id_break(3553, 34892, 0);
            if (this.id_extends) {
               MT.id_class(3553, 0, 36013, this.id_class, this.id_break, 0, 34041, 36269, (IntBuffer)null);
            } else {
               MT.id_class(3553, 0, 6402, this.id_class, this.id_break, 0, 6402, 5126, (IntBuffer)null);
            }
         }

         this.id_class(9728);
         MT.id_super(this.id_implements);
         MT.id_class(3553, 0, 32856, this.id_class, this.id_break, 0, 6408, 5121, (IntBuffer)null);
         MT.id_private(Vl_1.id_class, this.id_case);
         MT.id_class(Vl_1.id_class, Vl_1.id_byte, 3553, this.id_implements, 0);
         if (this.id_throws) {
            if (this.id_extends) {
               MT.id_class(Vl_1.id_class, 36096, 3553, this.id_finally, 0);
               MT.id_class(Vl_1.id_class, 36128, 3553, this.id_finally, 0);
            } else {
               MT.id_class(Vl_1.id_class, Vl_1.id_protected, 3553, this.id_finally, 0);
            }
         }

         this.id_break();
         this.id_break(var3);
         this.id_protected();
      }
   }

   private void id_throws(int var1, int var2, boolean var3) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         MT.id_class(true, true, true, false);
         MT.id_native();
         MT.id_class(false);
         MT.id_return(5889);
         MT.id_boolean();
         MT.id_class(0.0, (double)var1, (double)var2, 0.0, 1000.0, 3000.0);
         MT.id_return(5888);
         MT.id_boolean();
         MT.id_byte(0.0F, 0.0F, -2000.0F);
         MT.id_protected(0, 0, var1, var2);
         MT.id_import();
         MT.id_catch();
         MT.id_protected();
         if (var3) {
            MT.id_final();
            MT.id_private();
         }

         MT.id_protected(1.0F, 1.0F, 1.0F, 1.0F);
         this.id_byte();
         float var4 = (float)var1;
         float var5 = (float)var2;
         float var6 = (float)this.id_byte / (float)this.id_class;
         float var7 = (float)this.id_protected / (float)this.id_break;
         yb_3 var8 = RenderSystem.renderThreadTesselator();
         lD_2 var9 = var8.id_byte();
         var9.id_class(7, ju_3.id_public);
         var9.id_class(0.0, (double)var5, 0.0).id_class(0.0F, 0.0F).id_break(255, 255, 255, 255).id_class();
         var9.id_class((double)var4, (double)var5, 0.0).id_class(var6, 0.0F).id_break(255, 255, 255, 255).id_class();
         var9.id_class((double)var4, 0.0, 0.0).id_class(var6, var7).id_break(255, 255, 255, 255).id_class();
         var9.id_class(0.0, 0.0, 0.0).id_class(0.0F, var7).id_break(255, 255, 255, 255).id_class();
         var8.id_break();
         this.id_protected();
         MT.id_class(true);
         MT.id_class(true, true, true, true);
      }
   }

   public void id_throws() {
      if (GLX.isUsingFBOs()) {
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> MT.id_private(Vl_1.id_class, 0));
         } else {
            MT.id_private(Vl_1.id_class, 0);
         }
      }
   }

   public int id_finally() {
      return this.id_finally;
   }

   public int id_catch() {
      return this.id_finally;
   }

   public int id_extends() {
      return this.id_implements;
   }

   public int id_case() {
      return this.id_implements;
   }

   public boolean id_implements() {
      return this.id_extends;
   }

   private void id_protected(int var1, int var2, boolean var3) {
      if (!GLX.isUsingFBOs()) {
         this.id_byte = var1;
         this.id_protected = var2;
      } else {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         MT.id_volatile();
         if (this.id_case >= 0) {
            this.id_class();
         }

         this.id_break(var1, var2, var3);
         MT.id_private(Vl_1.id_class, 0);
      }
   }

   public void id_protected() {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         MT.id_super(0);
      }
   }

   public void id_private() {
      if (!this.id_extends) {
         this.id_extends = true;
         this.id_class(this.id_byte, this.id_protected, (Boolean)QY.id_break[2]);
      }
   }
}
