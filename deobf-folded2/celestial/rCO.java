package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;

class rCO implements ProfileLookupCallback {
   rCO(rnW_2 var1, List var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.id_class.F().id_class(var1);
      this.id_break.add(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.id_throws.warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
   }
}
