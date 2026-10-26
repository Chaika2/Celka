package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class rCJ extends rnY_2<GameProfile> {
   public rCJ(JsonObject var1) {
      super(break_(var1), var1);
   }

   public rCJ(GameProfile var1, Date var2, String var3, Date var4, String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public rCJ(GameProfile var1) {
      this(var1, (Date)null, (String)null, (Date)null, (String)null);
   }

   @Override
   protected void class_(JsonObject var1) {
      if (this.case_() != null) {
         var1.addProperty("uuid", this.case_().getId() == null ? "" : this.case_().getId().toString());
         var1.addProperty("name", this.case_().getName());
         super.class_(var1);
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

   @Override
   public rgP_2 protected_() {
      GameProfile var1 = this.case_();
      return new rgN_2(var1.getName() != null ? var1.getName() : Objects.toString(var1.getId(), "(Unknown)"));
   }
}
