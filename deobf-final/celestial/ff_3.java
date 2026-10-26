package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class ff_3 implements AutoCloseable {
   protected int case_ = -1;
   protected boolean catch_;
   protected boolean private_;
   public rrdE implements_;
   private boolean class_;
   private boolean break_;
   private boolean byte_;

   public rrdE this_() {
      return rrdA.class_(this);
   }

   public void class_(boolean var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!this.class_ || this.catch_ != var1 || this.private_ != var2) {
         this.class_ = true;
         this.catch_ = var1;
         this.private_ = var2;
         int var3;
         short var4;
         if (var1) {
            var3 = var2 ? 9987 : 9729;
            var4 = 9729;
         } else {
            int var5 = rrbb_3.new_();
            var3 = var2 ? var5 : 9728;
            var4 = 9728;
         }

         MT.super_(this.new_());
         MT.break_(3553, 10241, var3);
         MT.break_(3553, 10240, var4);
      }
   }

   public void class_(fY_2 var1, rAL var2, rqO_2 var3, Executor var4) {
      var1.class_(var3, this);
   }

   @Override
   public void close() {
   }

   public void break_(boolean var1, boolean var2) {
      this.break_ = this.catch_;
      this.byte_ = this.private_;
      this.class_(var1, var2);
   }

   public void continue_() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            rrdA.class_(this, this.case_);
            this.class_ = false;
            if (this.case_ != -1) {
               fo_3.class_(this.case_);
               this.case_ = -1;
            }
         });
      } else if (this.case_ != -1) {
         rrdA.class_(this, this.case_);
         this.class_ = false;
         fo_3.class_(this.case_);
         this.case_ = -1;
      }
   }

   public void else_() {
      this.class_(this.break_, this.byte_);
   }

   public int new_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (this.case_ == -1) {
         this.case_ = fo_3.class_();
      }

      return this.case_;
   }

   public void super_() {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> MT.super_(this.new_()));
      } else {
         MT.super_(this.new_());
      }
   }

   public abstract void a_(rAL var1) throws IOException;
}
