package celestial;

import com.mojang.datafixers.DSL.TypeReference;

public enum rTv_1 {
   LEVEL(rTC.id_class),
   PLAYER(rTC.id_break),
   CHUNK(rTC.id_byte),
   HOTBAR(rTC.id_protected),
   OPTIONS(rTC.id_throws),
   STRUCTURE(rTC.id_case),
   STATS(rTC.id_catch),
   SAVED_DATA(rTC.id_private),
   ADVANCEMENTS(rTC.id_implements),
   POI_CHUNK(rTC.id_finally),
   WORLD_GEN_SETTINGS(rTC.id_goto);

   private final TypeReference reference;

   private rTv_1(TypeReference var3) {
      this.reference = var3;
   }

   public TypeReference id_class() {
      return this.reference;
   }
}
