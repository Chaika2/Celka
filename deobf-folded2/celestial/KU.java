package celestial;

public class KU extends RuntimeException {
   private final KY id_class;

   public KU(KY var1) {
      this.id_class = var1;
   }

   @Override
   public Throwable getCause() {
      return this.id_class.id_break();
   }

   public KY id_class() {
      return this.id_class;
   }

   @Override
   public String getMessage() {
      return this.id_class.id_class();
   }
}
