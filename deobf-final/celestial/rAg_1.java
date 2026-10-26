package celestial;

import java.util.concurrent.CompletableFuture;

class rAg_1 implements rAN {
   private final rAV class_;
   private final CompletableFuture<rqg_3> break_;

   @Override
   public boolean byte_() {
      return false;
   }

   public rAg_1(rAV var1) {
      this.class_ = var1;
      this.break_ = new CompletableFuture<>();
      this.break_.completeExceptionally(var1);
   }

   @Override
   public CompletableFuture<rqg_3> class_() {
      return this.break_;
   }

   @Override
   public float break_() {
      return 0.0F;
   }

   @Override
   public void throws_() {
      throw this.class_;
   }

   @Override
   public boolean protected_() {
      return true;
   }
}
