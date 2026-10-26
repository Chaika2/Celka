package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class fl_3 extends fH_2 {
   private CompletableFuture<fy_3> class_;

   public fl_3(rAL var1, rqO_2 var2, Executor var3) {
      super(var2);
      this.class_ = CompletableFuture.supplyAsync(() -> fy_3.class_(var1, var2), var3);
   }

   public CompletableFuture<Void> class_() {
      return this.class_ == null ? CompletableFuture.completedFuture((Void)null) : this.class_.thenApply(var0 -> null);
   }

   @Override
   protected fy_3 class_(rAL var1) {
      if (this.class_ != null) {
         fy_3 var2 = this.class_.join();
         this.class_ = null;
         return var2;
      } else {
         return fy_3.class_(var1, this.byte_);
      }
   }

   @Override
   public void class_(fY_2 var1, rAL var2, rqO_2 var3, Executor var4) {
      this.class_ = CompletableFuture.supplyAsync(() -> fy_3.class_(var2, this.byte_), rqR_2.case_());
      this.class_.thenRunAsync(() -> var1.class_(this.byte_, this), class_(var4));
   }

   private static Executor class_(Executor var0) {
      return var1 -> var0.execute(() -> RenderSystem.recordRenderCall(var1::run));
   }
}
