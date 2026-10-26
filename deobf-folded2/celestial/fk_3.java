package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fk_3 extends ff_3 {
   private static final Logger id_class = LogManager.getLogger();
   private fN_2 id_break;

   public fk_3(fN_2 var1) {
      this.id_break = var1;
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            fo_3.id_class(this.id_new(), this.id_break.id_class(), this.id_break.id_break());
            this.id_class();
            if (rrbb_3.rs()) {
               rrdA.id_class(this);
            }
         });
      } else {
         fo_3.id_class(this.id_new(), this.id_break.id_class(), this.id_break.id_break());
         this.id_class();
         if (rrbb_3.rs()) {
            rrdA.id_class(this);
         }
      }
   }

   public fk_3(int var1, int var2, boolean var3) {
      RenderSystem.assertThread(RenderSystem::isOnGameThreadOrInit);
      this.id_break = new fN_2(var1, var2, var3);
      fo_3.id_class(this.id_new(), this.id_break.id_class(), this.id_break.id_break());
      if (rrbb_3.rs()) {
         rrdA.id_class(this);
      }
   }

   @Override
   public void id_class() {
      if (this.id_break != null) {
         this.id_super();
         this.id_break.id_class(0, 0, 0, false);
      } else {
         id_class.warn("Trying to upload disposed texture {}", this.id_new());
      }
   }

   public void id_class(fN_2 var1) {
      if (this.id_break != null) {
         this.id_break.close();
      }

      this.id_break = var1;
   }

   @Override
   public void close() {
      if (this.id_break != null) {
         this.id_break.close();
         this.id_continue();
         this.id_break = null;
      }
   }

   public fN_2 id_break() {
      return this.id_break;
   }

   @Override
   public void a_(rAL var1) {
   }
}
