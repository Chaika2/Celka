package celestial;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.IntBuffer;

public class VC {
   public int class_;
   public int break_;
   public int byte_;
   public int protected_;
   public final boolean throws_;
   public int case_;
   private int implements_;
   private int finally_;
   public final float[] catch_;
   public int private_;
   private boolean extends_ = false;

   private void byte_(boolean var1) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         MT.private_(Vl_1.class_, this.case_);
         if (var1) {
            MT.protected_(0, 0, this.byte_, this.protected_);
         }
      }
   }

   public void byte_(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      if (!RenderSystem.isInInitPhase()) {
         RenderSystem.recordRenderCall(() -> this.throws_(var1, var2, var3));
      } else {
         this.throws_(var1, var2, var3);
      }
   }

   public void byte_() {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         MT.super_(this.implements_);
      }
   }

   public VC(int var1, int var2, boolean var3, boolean var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.throws_ = var3;
      this.case_ = -1;
      this.implements_ = -1;
      this.finally_ = -1;
      this.catch_ = new float[4];
      this.catch_[0] = 1.0F;
      this.catch_[1] = 1.0F;
      this.catch_[2] = 1.0F;
      this.catch_[3] = 0.0F;
      this.class_(var1, var2, var4);
   }

   public void class_(int var1, int var2) {
      this.byte_(var1, var2, true);
   }

   public void class_(boolean var1) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.byte_(var1));
      } else {
         this.byte_(var1);
      }
   }

   public void class_(float var1, float var2, float var3, float var4) {
      this.catch_[0] = var1;
      this.catch_[1] = var2;
      this.catch_[2] = var3;
      this.catch_[3] = var4;
   }

   public void class_(VC var1) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         if (MT.r()) {
            MT.private_(36008, var1.case_);
            MT.private_(36009, this.case_);
            MT.class_(0, 0, var1.class_, var1.break_, 0, 0, this.class_, this.break_, 256, 9728);
         } else {
            MT.private_(Vl_1.class_, this.case_);
            int var2 = MT.continue_();
            if (var2 != 0) {
               int var3 = MT.this_();
               MT.super_(var2);
               MT.private_(Vl_1.class_, var1.case_);
               MT.class_(3553, 0, 0, 0, 0, 0, Math.min(this.class_, var1.class_), Math.min(this.break_, var1.break_));
               MT.super_(var3);
            }
         }

         MT.private_(Vl_1.class_, 0);
      }
   }

   public void class_(int var1, int var2, boolean var3) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.protected_(var1, var2, var3));
      } else {
         this.protected_(var1, var2, var3);
      }
   }

   public void class_() {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         this.protected_();
         this.throws_();
         if (this.finally_ > -1) {
            fo_3.class_(this.finally_);
            this.finally_ = -1;
         }

         if (this.implements_ > -1) {
            fo_3.class_(this.implements_);
            this.implements_ = -1;
         }

         if (this.case_ > -1) {
            MT.private_(Vl_1.class_, 0);
            MT.extends_(this.case_);
            this.case_ = -1;
         }
      }
   }

   public void class_(int var1) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         this.private_ = var1;
         MT.super_(this.implements_);
         MT.break_(3553, 10241, var1);
         MT.break_(3553, 10240, var1);
         MT.break_(3553, 10242, 10496);
         MT.break_(3553, 10243, 10496);
         MT.super_(0);
      }
   }

   public void break_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      int var1 = MT.native_(Vl_1.class_);
      if (var1 != Vl_1.throws_) {
         if (var1 == Vl_1.case_) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
         } else if (var1 == Vl_1.catch_) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
         } else if (var1 == Vl_1.private_) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
         } else if (var1 == Vl_1.implements_) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
         } else {
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + var1);
         }
      }
   }

   public void break_(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.class_(true);
      MT.break_(this.catch_[0], this.catch_[1], this.catch_[2], this.catch_[3]);
      short var2 = 16384;
      if (this.throws_) {
         MT.class_(1.0);
         var2 |= 256;
      }

      MT.class_(var2, var1);
      this.throws_();
   }

   public void break_(int var1) {
      this.finally_ = var1;
   }

   public void break_(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.byte_ = var1;
      this.protected_ = var2;
      this.class_ = var1;
      this.break_ = var2;
      if (!GLX.isUsingFBOs()) {
         this.break_(var3);
      } else {
         this.case_ = MT.super_();
         this.implements_ = fo_3.class_();
         if (this.throws_) {
            this.finally_ = fo_3.class_();
            MT.super_(this.finally_);
            MT.break_(3553, 10241, 9728);
            MT.break_(3553, 10240, 9728);
            MT.break_(3553, 10242, 10496);
            MT.break_(3553, 10243, 10496);
            MT.break_(3553, 34892, 0);
            if (this.extends_) {
               MT.class_(3553, 0, 36013, this.class_, this.break_, 0, 34041, 36269, (IntBuffer)null);
            } else {
               MT.class_(3553, 0, 6402, this.class_, this.break_, 0, 6402, 5126, (IntBuffer)null);
            }
         }

         this.class_(9728);
         MT.super_(this.implements_);
         MT.class_(3553, 0, 32856, this.class_, this.break_, 0, 6408, 5121, (IntBuffer)null);
         MT.private_(Vl_1.class_, this.case_);
         MT.class_(Vl_1.class_, Vl_1.byte_, 3553, this.implements_, 0);
         if (this.throws_) {
            if (this.extends_) {
               MT.class_(Vl_1.class_, 36096, 3553, this.finally_, 0);
               MT.class_(Vl_1.class_, 36128, 3553, this.finally_, 0);
            } else {
               MT.class_(Vl_1.class_, Vl_1.protected_, 3553, this.finally_, 0);
            }
         }

         this.break_();
         this.break_(var3);
         this.protected_();
      }
   }

   private void throws_(int var1, int var2, boolean var3) {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         MT.class_(true, true, true, false);
         MT.native_();
         MT.class_(false);
         MT.return_(5889);
         MT.boolean_();
         MT.class_(0.0, (double)var1, (double)var2, 0.0, 1000.0, 3000.0);
         MT.return_(5888);
         MT.boolean_();
         MT.byte_(0.0F, 0.0F, -2000.0F);
         MT.protected_(0, 0, var1, var2);
         MT.import_();
         MT.catch_();
         MT.protected_();
         if (var3) {
            MT.final_();
            MT.private_();
         }

         MT.protected_(1.0F, 1.0F, 1.0F, 1.0F);
         this.byte_();
         float var4 = (float)var1;
         float var5 = (float)var2;
         float var6 = (float)this.byte_ / (float)this.class_;
         float var7 = (float)this.protected_ / (float)this.break_;
         yb_3 var8 = RenderSystem.renderThreadTesselator();
         lD_2 var9 = var8.byte_();
         var9.class_(7, ju_3.public_);
         var9.class_(0.0, (double)var5, 0.0).class_(0.0F, 0.0F).break_(255, 255, 255, 255).class_();
         var9.class_((double)var4, (double)var5, 0.0).class_(var6, 0.0F).break_(255, 255, 255, 255).class_();
         var9.class_((double)var4, 0.0, 0.0).class_(var6, var7).break_(255, 255, 255, 255).class_();
         var9.class_(0.0, 0.0, 0.0).class_(0.0F, var7).break_(255, 255, 255, 255).class_();
         var8.break_();
         this.protected_();
         MT.class_(true);
         MT.class_(true, true, true, true);
      }
   }

   public void throws_() {
      if (GLX.isUsingFBOs()) {
         if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> MT.private_(Vl_1.class_, 0));
         } else {
            MT.private_(Vl_1.class_, 0);
         }
      }
   }

   public int finally_() {
      return this.finally_;
   }

   public int catch_() {
      return this.finally_;
   }

   public int extends_() {
      return this.implements_;
   }

   public int case_() {
      return this.implements_;
   }

   public boolean implements_() {
      return this.extends_;
   }

   private void protected_(int var1, int var2, boolean var3) {
      if (!GLX.isUsingFBOs()) {
         this.byte_ = var1;
         this.protected_ = var2;
      } else {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         MT.volatile_();
         if (this.case_ >= 0) {
            this.class_();
         }

         this.break_(var1, var2, var3);
         MT.private_(Vl_1.class_, 0);
      }
   }

   public void protected_() {
      if (GLX.isUsingFBOs()) {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         MT.super_(0);
      }
   }

   public void private_() {
      if (!this.extends_) {
         this.extends_ = true;
         this.class_(this.byte_, this.protected_, (Boolean)QY.break_[2]);
      }
   }
}
