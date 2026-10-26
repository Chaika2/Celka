package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class fl_3 extends fH_2 {
   private CompletableFuture<fy_3> id_class;

   public fl_3(rAL var1, rqO_2 var2, Executor var3) {
      super(var2);
      this.id_class = CompletableFuture.supplyAsync(() -> fy_3.id_class(var1, var2), var3);
   }

   public CompletableFuture<Void> id_class() {
      return this.id_class == null ? CompletableFuture.completedFuture((Void)null) : this.id_class.thenApply(var0 -> null);
   }

   @Override
   protected fy_3 id_class(rAL var1) {
      if (this.id_class != null) {
         fy_3 var2 = this.id_class.join();
         this.id_class = null;
         return var2;
      } else {
         return fy_3.id_class(var1, this.id_byte);
      }
   }

   @Override
   public void id_class(fY_2 var1, rAL var2, rqO_2 var3, Executor var4) {
      this.id_class = CompletableFuture.supplyAsync(() -> fy_3.id_class(var2, this.id_byte), rqR_2.id_case());
      this.id_class.thenRunAsync(() -> var1.id_class(this.id_byte, this), id_class(var4));
   }

   private static Executor id_class(Executor var0) {
      return var1 -> var0.execute(() -> RenderSystem.recordRenderCall(var1::run));
   }
}
