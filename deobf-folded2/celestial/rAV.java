package celestial;

public class rAV extends RuntimeException {
   private final rAC id_class;

   public rAV(rAC var1, Throwable var2) {
      super(var1.id_class(), var2);
      this.id_class = var1;
   }

   public rAC id_class() {
      return this.id_class;
   }
}
