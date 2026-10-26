package celestial;

public enum rrdM {
   NONE(""),
   SHADOW("shadow"),
   SHADOWCOMP("shadowcomp"),
   PREPARE("prepare"),
   GBUFFERS("gbuffers"),
   DEFERRED("deferred"),
   COMPOSITE("composite");

   private String name;

   public boolean id_byte() {
      return this == PREPARE || this == DEFERRED || this == COMPOSITE;
   }

   private rrdM(String var3) {
      this.name = var3;
   }

   public String id_class() {
      return this.name;
   }

   public boolean id_break() {
      return this == SHADOWCOMP || this == PREPARE || this == DEFERRED || this == COMPOSITE;
   }

   public boolean id_protected() {
      return this == SHADOW || this == SHADOWCOMP;
   }
}
