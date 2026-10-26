package celestial;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

class yu_3 extends yN_2 {
   private final yZ_2 id_throws;

   public yu_3(yQ_2 var1, double var2, yZ_2 var4) {
      this(var1, null, var2, var4);
   }

   public yu_3(yQ_2 var1, rfj_3 var2, double var3, yZ_2 var5) {
      super(var1, var2, var3);
      this.id_protected = var1;
      this.id_throws = var5;
   }

   @Override
   public void id_class() {
      this.id_break.set(true);
   }

   @Override
   public CompletableFuture<ym_3> id_class(Hv_1 var1) {
      if (this.id_break.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (!this.id_protected.id_class()) {
         this.id_break.set(true);
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (this.id_break.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else {
         rjU_2 var2 = this.id_protected.id_throws.id_break();
         float var3 = (float)var2.id_break;
         float var4 = (float)var2.id_byte;
         float var5 = (float)var2.id_protected;
         le_3 var6 = this.id_throws.id_catch;
         if (var6 != null && this.id_throws.id_break.id_break(HU.id_implements())) {
            lD_2 var7 = var1.id_class(HU.id_implements());
            var7.id_break(HU.id_implements());
            this.id_protected.id_class(var7);
            var7.id_class(var6);
            var7.id_protected(
               (float)this.id_protected.id_super + var3 - (float)this.id_protected.id_native.b_(),
               (float)this.id_protected.id_this + var4 - (float)this.id_protected.id_native.c_(),
               (float)this.id_protected.id_else + var5 - (float)this.id_protected.id_native.d_()
            );
            this.id_throws.id_catch = var7.id_implements();
            var7.id_finally();
            if (this.id_break.get()) {
               return CompletableFuture.completedFuture(ym_3.CANCELLED);
            } else {
               CompletableFuture var8 = this.id_protected
                  .id_throws
                  .id_class(var1.id_class(HU.id_implements()), this.id_protected.id_class(HU.id_implements()))
                  .thenApply(var0 -> ym_3.CANCELLED);
               return var8.handle((var1x, var2x) -> {
                  if (var2x != null && !(var2x instanceof CancellationException) && !(var2x instanceof InterruptedException)) {
                     QY.id_instanceof().id_break(KY.id_class(var2x, "Rendering chunk"));
                  }

                  return this.id_break.get() ? ym_3.CANCELLED : ym_3.SUCCESSFUL;
               });
            }
         } else {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
         }
      }
   }
}
