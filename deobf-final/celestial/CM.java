package celestial;

public class CM extends CL {
   private int class_;
   private final int break_ = 8;

   CM(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
   }

   @Override
   public void case_() {
      for (int var1 = 0; var1 < 6; var1++) {
         double var2 = this.catch_ + (this.continue_.nextDouble() - this.continue_.nextDouble()) * 4.0;
         double var4 = this.private_ + (this.continue_.nextDouble() - this.continue_.nextDouble()) * 4.0;
         double var6 = this.implements_ + (this.continue_.nextDouble() - this.continue_.nextDouble()) * 4.0;
         this.byte_.class_(rLQ.return_, var2, var4, var6, (double)((float)this.class_ / 8.0F), 0.0, 0.0);
      }

      this.class_++;
      if (this.class_ == 8) {
         this.finally_();
      }
   }
}
