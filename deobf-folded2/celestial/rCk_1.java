package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class rCk_1 extends rCx_1<GameProfile, rCW> {
   public rCk_1(File var1) {
      super(var1);
   }

   @Override
   public String[] id_class() {
      String[] var1 = new String[this.id_protected().size()];
      int var2 = 0;

      for (rCd_1 var4 : this.id_protected()) {
         var1[var2++] = ((GameProfile)var4.id_case()).getName();
      }

      return var1;
   }

   public boolean id_class(GameProfile var1) {
      return this.id_protected(var1);
   }

   @Override
   protected rCd_1<GameProfile> id_class(JsonObject var1) {
      return new rCW(var1);
   }

   protected String id_break(GameProfile var1) {
      return var1.getId().toString();
   }
}
