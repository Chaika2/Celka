package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class rCk_1 extends rCx_1<GameProfile, rCW> {
   public rCk_1(File var1) {
      super(var1);
   }

   @Override
   public String[] class_() {
      String[] var1 = new String[this.protected_().size()];
      int var2 = 0;

      for (rCd_1 var4 : this.protected_()) {
         var1[var2++] = ((GameProfile)var4.case_()).getName();
      }

      return var1;
   }

   public boolean class_(GameProfile var1) {
      return this.protected_(var1);
   }

   @Override
   protected rCd_1<GameProfile> class_(JsonObject var1) {
      return new rCW(var1);
   }

   protected String break_(GameProfile var1) {
      return var1.getId().toString();
   }
}
