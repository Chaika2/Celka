package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.concurrent.atomic.AtomicReference;

class rCS implements ProfileLookupCallback {
   rCS(AtomicReference var1) {
      this.class_ = var1;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.class_.set(var1);
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      this.class_.set((GameProfile)null);
   }
}
