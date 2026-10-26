package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class rCJ extends rnY_2<GameProfile> {
   public rCJ(JsonObject var1) {
      super(id_break(var1), var1);
   }

   public rCJ(GameProfile var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public rCJ(GameProfile var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   @Override
   protected void id_class(JsonObject var1) {
      if (this.id_case() != null) {
         var1.addProperty("uuid", this.id_case().getId() == null ? "" : this.id_case().getId().toString());
         var1.addProperty("name", this.id_case().getName());
         super.id_class(var1);
      }
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

   @Override
   public rgP_2 id_protected() {
      GameProfile var1 = this.id_case();
      return new rgN_2(var1.getName() != null ? var1.getName() : Objects.toString(var1.getId(), "(Unknown)"));
   }
}
