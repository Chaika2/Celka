package celestial;

public enum rrdn_1 {
   NORMAL("_n"),
   SPECULAR("_s");

   private String suffix;

   private rrdn_1(String var3) {
      this.suffix = var3;
   }

   public String class_() {
      return this.suffix;
   }
}
