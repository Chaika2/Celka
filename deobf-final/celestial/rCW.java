package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class rCW extends rCd_1<GameProfile> {
   public rCW(GameProfile var1) {
      super(var1);
   }

   public rCW(JsonObject var1) {
      super(break_(var1));
   }

   @Override
   protected void class_(JsonObject var1) {
      if (this.case_() != null) {
         var1.addProperty("uuid", this.case_().getId() == null ? "" : this.case_().getId().toString());
         var1.addProperty("name", this.case_().getName());
      }
   }

   private static GameProfile break_(JsonObject var0) {
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
}
