package celestial;

public enum rRZ {
   PLAYER("gamerule.category.player"),
   MOBS("gamerule.category.mobs"),
   SPAWNING("gamerule.category.spawning"),
   DROPS("gamerule.category.drops"),
   UPDATES("gamerule.category.updates"),
   CHAT("gamerule.category.chat"),
   MISC("gamerule.category.misc");

   private final String localeString;

   private rRZ(String var3) {
      this.localeString = var3;
   }

   public String id_class() {
      return this.localeString;
   }
}
