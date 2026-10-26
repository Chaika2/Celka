package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;

class rCO implements ProfileLookupCallback {
   rCO(rnW_2 var1, List var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.class_.F().class_(var1);
      this.break_.add(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.throws_.warn("Could not lookup user whitelist entry for {}", var1.getName(), var2);
   }
}
