package celestial;

public class rrXK {
   private rrXU id_class;
   private String id_break;

   public rrXK(rrXU var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_break;
   }

   public rrXU id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }
}
