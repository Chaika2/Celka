package celestial;

public enum NT {
   FILE("file"),
   SOUND_EVENT("event");

   private final String name;

   private NT(String var3) {
      this.name = var3;
   }

   public static NT id_class(String var0) {
      for (NT var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
