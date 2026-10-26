package celestial;

public class rBV extends rBu_1 {
   private final boolean class_;
   private int break_;

   @Override
   public void byte_() {
      this.break_ = 20;
      this.class_(true);
   }

   public rBV(is_3 var1, boolean var2) {
      super(var1);
      this.protected_ = var1;
      this.class_ = var2;
   }

   @Override
   public boolean break_() {
      return this.class_ && this.break_ > 0 && super.break_();
   }

   @Override
   public void throws_() {
      this.break_--;
      super.throws_();
   }

   @Override
   public void protected_() {
      this.class_(false);
   }
}
