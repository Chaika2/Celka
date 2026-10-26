package celestial;

public class rBL extends rBA {
   private final rsy_3 id_catch;

   public rBL(rsy_3 var1) {
      super(var1, rhd_3.class, 8.0F);
      this.id_catch = var1;
   }

   @Override
   public boolean id_class() {
      if (this.id_catch.n()) {
         this.id_break = this.id_catch.id_class();
         return true;
      } else {
         return false;
      }
   }
}
