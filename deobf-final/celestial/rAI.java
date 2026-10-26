package celestial;

public enum rAI {
   CLIENT_RESOURCES("assets"),
   SERVER_DATA("data");

   private final String directoryName;

   private rAI(String var3) {
      this.directoryName = var3;
   }

   public String class_() {
      return this.directoryName;
   }
}
