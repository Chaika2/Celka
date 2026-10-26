package celestial;

public enum Oe_1 {
   TASK("task", 0, rgF_2.GREEN),
   CHALLENGE("challenge", 26, rgF_2.DARK_PURPLE),
   GOAL("goal", 52, rgF_2.GREEN);

   private final String name;
   private final int icon;
   private final rgF_2 format;
   private final rgP_2 translatedToast;

   public rgF_2 id_byte() {
      return this.format;
   }

   private Oe_1(String var3, int var4, rgF_2 var5) {
      this.name = var3;
      this.icon = var4;
      this.format = var5;
      this.translatedToast = new rgn_3("advancements.toast." + var3);
   }

   public static Oe_1 id_class(String var0) {
      for (Oe_1 var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Unknown frame type '" + var0 + "'");
   }

   public String id_class() {
      return this.name;
   }

   public int id_break() {
      return this.icon;
   }

   public rgP_2 id_protected() {
      return this.translatedToast;
   }
}
