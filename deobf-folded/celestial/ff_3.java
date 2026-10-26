package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class ff_3 implements AutoCloseable {
   protected int id_case = -1;
   protected boolean id_catch;
   protected boolean id_private;
   public rrdE id_implements;
   private boolean id_class;
   private boolean id_break;
   private boolean id_byte;

   public rrdE id_this() {
      return rrdA.id_class(this);
   }

   public void id_class(boolean var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!this.id_class || this.id_catch != var1 || this.id_private != var2) {
         this.id_class = true;
         this.id_catch = var1;
         this.id_private = var2;
         int var3;
         short var4;
         if (var1) {
            var3 = var2 ? 9987 : 9729;
            var4 = 9729;
         } else {
            int var5 = rrbb_3.id_new();
            var3 = var2 ? var5 : 9728;
            var4 = 9728;
         }

         MT.id_super(this.id_new());
         MT.id_break(3553, 10241, var3);
         MT.id_break(3553, 10240, var4);
      }
   }

   public void id_class(fY_2 var1, rAL var2, rqO_2 var3, Executor var4) {
      var1.id_class(var3, this);
   }

   @Override
   public void close() {
   }

   public void id_break(boolean var1, boolean var2) {
      this.id_break = this.id_catch;
      this.id_byte = this.id_private;
      this.id_class(var1, var2);
   }

   public void id_continue() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            rrdA.id_class(this, this.id_case);
            this.id_class = false;
            if (this.id_case != -1) {
               fo_3.id_class(this.id_case);
               this.id_case = -1;
            }
         });
      } else if (this.id_case != -1) {
         rrdA.id_class(this, this.id_case);
         this.id_class = false;
         fo_3.id_class(this.id_case);
         this.id_case = -1;
      }
   }

   public void id_else() {
      this.id_class(this.id_break, this.id_byte);
   }

   public int id_new() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (this.id_case == -1) {
         this.id_case = fo_3.id_class();
      }

      return this.id_case;
   }

   public void id_super() {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> MT.id_super(this.id_new()));
      } else {
         MT.id_super(this.id_new());
      }
   }

   public abstract void a_(rAL var1) throws IOException;
}
