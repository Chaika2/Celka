package celestial;

class KK {
   private final String id_class;
   private final String id_break;

   public KK(String var1, Object var2) {
      this.id_class = var1;
      if (var2 == null) {
         this.id_break = "~~NULL~~";
      } else if (var2 instanceof Throwable var3) {
         this.id_break = "~~ERROR~~ " + var3.getClass().getSimpleName() + ": " + var3.getMessage();
      } else {
         this.id_break = var2.toString();
      }
   }

   public String id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }
}
