package celestial;

public class KU extends RuntimeException {
   private final KY class_;

   public KU(KY var1) {
      this.class_ = var1;
   }

   @Override
   public Throwable getCause() {
      return this.class_.break_();
   }

   public KY class_() {
      return this.class_;
   }

   @Override
   public String getMessage() {
      return this.class_.class_();
   }
}
