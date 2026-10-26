package celestial;

public class rld_3 {
   private final rlh_3 id_class;
   private final String id_break;

   rld_3(rlh_3 var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_class.toString() + " (from " + this.id_break + ")";
   }

   public rlh_3 id_class() {
      return this.id_class;
   }
}
