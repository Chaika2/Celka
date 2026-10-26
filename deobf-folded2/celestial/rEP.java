package celestial;

public class rEP extends rBV {
   public rEP(rsi_3 var1, rEB var2) {
      super(var2, false);
      this.id_class = var1;
   }

   @Override
   public boolean id_class() {
      return super.id_class() && this.id_class.sd();
   }
}
