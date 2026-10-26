package celestial;

public class rBL extends rBA {
   private final rsy_3 catch_;

   public rBL(rsy_3 var1) {
      super(var1, rhd_3.class, 8.0F);
      this.catch_ = var1;
   }

   @Override
   public boolean class_() {
      if (this.catch_.n()) {
         this.break_ = this.catch_.class_();
         return true;
      } else {
         return false;
      }
   }
}
