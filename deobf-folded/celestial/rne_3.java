package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class rne_3 extends rCd_1<GameProfile> {
   private final int id_class;
   private final boolean id_break;

   public rne_3(GameProfile var1, int var2, boolean var3) {
      super(var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   public rne_3(JsonObject var1) {
      super(id_break(var1));
      this.id_class = var1.has("level") ? var1.get("level").getAsInt() : 0;
      this.id_break = var1.has("bypassesPlayerLimit") && var1.get("bypassesPlayerLimit").getAsBoolean();
   }

   @Override
   protected void id_class(JsonObject var1) {
      if (this.id_case() != null) {
         var1.addProperty("uuid", this.id_case().getId() == null ? "" : this.id_case().getId().toString());
         var1.addProperty("name", this.id_case().getName());
         var1.addProperty("level", this.id_class);
         var1.addProperty("bypassesPlayerLimit", this.id_break);
      }
   }

   public int id_class() {
      return this.id_class;
   }

   private static GameProfile id_break(JsonObject var0) {
      if (var0.has("uuid") && var0.has("name")) {
         String var1 = var0.get("uuid").getAsString();

         UUID var2;
         try {
            var2 = UUID.fromString(var1);
         } catch (Throwable var4) {
            return null;
         }

         return new GameProfile(var2, var0.get("name").getAsString());
      } else {
         return null;
      }
   }

   public boolean id_break() {
      return this.id_break;
   }
}
