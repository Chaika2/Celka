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

   public boolean byte_() {
      return this == PREPARE || this == DEFERRED || this == COMPOSITE;
   }

   private rrdM(String var3) {
      this.name = var3;
   }

   public String class_() {
      return this.name;
   }

   public boolean break_() {
      return this == SHADOWCOMP || this == PREPARE || this == DEFERRED || this == COMPOSITE;
   }

   public boolean protected_() {
      return this == SHADOW || this == SHADOWCOMP;
   }
}
