package celestial;

public class rMO extends rPR {
   public rMO(rba_3 var1) {
      super(var1);
      this.private_ = var1;
   }

   @Override
   public void class_() {
      if (!this.private_.Sc()) {
         super.class_();
      }
   }

   @Override
   protected boolean break_() {
      return !this.private_.sd() && !this.private_.x() && !this.private_.su() & !this.private_.sx();
   }
}
