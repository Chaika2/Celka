package celestial;

public class rAV extends RuntimeException {
   private final rAC class_;

   public rAV(rAC var1, Throwable var2) {
      super(var1.class_(), var2);
      this.class_ = var1;
   }

   public rAC class_() {
      return this.class_;
   }
}
