package celestial;

class KK {
   private final String class_;
   private final String break_;

   public KK(String var1, Object var2) {
      this.class_ = var1;
      if (var2 == null) {
         this.break_ = "~~NULL~~";
      } else if (var2 instanceof Throwable var3) {
         this.break_ = "~~ERROR~~ " + var3.getClass().getSimpleName() + ": " + var3.getMessage();
      } else {
         this.break_ = var2.toString();
      }
   }

   public String class_() {
      return this.class_;
   }

   public String break_() {
      return this.break_;
   }
}
