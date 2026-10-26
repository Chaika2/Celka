package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class rne_3 extends rCd_1<GameProfile> {
   private final int class_;
   private final boolean break_;

   public rne_3(GameProfile var1, int var2, boolean var3) {
      super(var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   public rne_3(JsonObject var1) {
      super(break_(var1));
      this.class_ = var1.has("level") ? var1.get("level").getAsInt() : 0;
      this.break_ = var1.has("bypassesPlayerLimit") && var1.get("bypassesPlayerLimit").getAsBoolean();
   }

   @Override
   protected void class_(JsonObject var1) {
      if (this.case_() != null) {
         var1.addProperty("uuid", this.case_().getId() == null ? "" : this.case_().getId().toString());
         var1.addProperty("name", this.case_().getName());
         var1.addProperty("level", this.class_);
         var1.addProperty("bypassesPlayerLimit", this.break_);
      }
   }

   public int class_() {
      return this.class_;
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

   public boolean break_() {
      return this.break_;
   }
}
