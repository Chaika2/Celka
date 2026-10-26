package celestial;

import com.mojang.datafixers.DSL.TypeReference;

public enum rTv_1 {
   LEVEL(rTC.class_),
   PLAYER(rTC.break_),
   CHUNK(rTC.byte_),
   HOTBAR(rTC.protected_),
   OPTIONS(rTC.throws_),
   STRUCTURE(rTC.case_),
   STATS(rTC.catch_),
   SAVED_DATA(rTC.private_),
   ADVANCEMENTS(rTC.implements_),
   POI_CHUNK(rTC.finally_),
   WORLD_GEN_SETTINGS(rTC.goto_);

   private final TypeReference reference;

   private rTv_1(TypeReference var3) {
      this.reference = var3;
   }

   public TypeReference class_() {
      return this.reference;
   }
}
