package celestial;

public enum rRM {
   PROGRESS("progress"),
   NOTCHED_6("notched_6"),
   NOTCHED_10("notched_10"),
   NOTCHED_12("notched_12"),
   NOTCHED_20("notched_20");

   private final String name;

   private rRM(String var3) {
      this.name = var3;
   }

   public String id_class() {
      return this.name;
   }

   public static rRM id_class(String var0) {
      for (rRM var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      return PROGRESS;
   }
}
