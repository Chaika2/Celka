package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fk_3 extends ff_3 {
   private static final Logger class_ = LogManager.getLogger();
   private fN_2 break_;

   public fk_3(fN_2 var1) {
      this.break_ = var1;
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            fo_3.class_(this.new_(), this.break_.class_(), this.break_.break_());
            this.class_();
            if (rrbb_3.rs()) {
               rrdA.class_(this);
            }
         });
      } else {
         fo_3.class_(this.new_(), this.break_.class_(), this.break_.break_());
         this.class_();
         if (rrbb_3.rs()) {
            rrdA.class_(this);
         }
      }
   }

   public fk_3(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      this.break_ = new fN_2(var1, var2, var3);
      fo_3.class_(this.new_(), this.break_.class_(), this.break_.break_());
      if (rrbb_3.rs()) {
         rrdA.class_(this);
      }
   }

   @Override
   public void class_() {
      if (this.break_ != null) {
         this.super_();
         this.break_.class_(0, 0, 0, false);
      } else {
         class_.warn("Trying to upload disposed texture {}", this.new_());
      }
   }

   public void class_(fN_2 var1) {
      if (this.break_ != null) {
         this.break_.close();
      }

      this.break_ = var1;
   }

   @Override
   public void close() {
      if (this.break_ != null) {
         this.break_.close();
         this.continue_();
         this.break_ = null;
      }
   }

   public fN_2 break_() {
      return this.break_;
   }

   @Override
   public void a_(rAL var1) {
   }
}
