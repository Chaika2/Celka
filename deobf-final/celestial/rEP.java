package celestial;

public class rEP extends rBV {
   public rEP(rsi_3 var1, rEB var2) {
      super(var2, false);
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      return super.class_() && this.class_.sd();
   }
}
