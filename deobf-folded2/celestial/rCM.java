package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

class rCM implements ProfileLookupCallback {
   rCM(rnW_2 var1, rCk_1 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.id_class.F().id_class(var1);
      this.id_break.id_class(new rCW(var1));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.id_throws.warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new rCX("Could not request user " + var1.getName() + " from backend systems", var2);
      }
   }
}
