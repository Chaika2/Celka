package celestial;

public enum Az_1 {
   ENABLED("enabled"),
   DISABLED("disabled"),
   PROMPT("prompt");

   private final rgP_2 motd;

   private Az_1(String var3) {
      this.motd = new rgn_3("addServer.resourcePack." + var3);
   }

   public rgP_2 class_() {
      return this.motd;
   }
}
