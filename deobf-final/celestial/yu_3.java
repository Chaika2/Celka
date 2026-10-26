package celestial;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

class yu_3 extends yN_2 {
   private final yZ_2 throws_;

   public yu_3(yQ_2 var1, double var2, yZ_2 var4) {
      this(var1, null, var2, var4);
   }

   public yu_3(yQ_2 var1, rfj_3 var2, double var3, yZ_2 var5) {
      super(var1, var2, var3);
      this.protected_ = var1;
      this.throws_ = var5;
   }

   @Override
   public void class_() {
      this.break_.set(true);
   }

   @Override
   public CompletableFuture<ym_3> class_(Hv_1 var1) {
      if (this.break_.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (!this.protected_.class_()) {
         this.break_.set(true);
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else if (this.break_.get()) {
         return CompletableFuture.completedFuture(ym_3.CANCELLED);
      } else {
         rjU_2 var2 = this.protected_.throws_.break_();
         float var3 = (float)var2.break_;
         float var4 = (float)var2.byte_;
         float var5 = (float)var2.protected_;
         le_3 var6 = this.throws_.catch_;
         if (var6 != null && this.throws_.break_.break_(HU.implements_())) {
            lD_2 var7 = var1.class_(HU.implements_());
            var7.break_(HU.implements_());
            this.protected_.class_(var7);
            var7.class_(var6);
            var7.protected_(
               (float)this.protected_.super_ + var3 - (float)this.protected_.native_.b_(),
               (float)this.protected_.this_ + var4 - (float)this.protected_.native_.c_(),
               (float)this.protected_.else_ + var5 - (float)this.protected_.native_.d_()
            );
            this.throws_.catch_ = var7.implements_();
            var7.finally_();
            if (this.break_.get()) {
               return CompletableFuture.completedFuture(ym_3.CANCELLED);
            } else {
               CompletableFuture var8 = this.protected_
                  .throws_
                  .class_(var1.class_(HU.implements_()), this.protected_.class_(HU.implements_()))
                  .thenApply(var0 -> ym_3.CANCELLED);
               return var8.handle((var1x, var2x) -> {
                  if (var2x != null && !(var2x instanceof CancellationException) && !(var2x instanceof InterruptedException)) {
                     QY.instanceof_().break_(KY.class_(var2x, "Rendering chunk"));
                  }

                  return this.break_.get() ? ym_3.CANCELLED : ym_3.SUCCESSFUL;
               });
            }
         } else {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
         }
      }
   }
}
