package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

class rCb_1 implements ProfileLookupCallback {
   rCb_1(rnW_2 var1, rna_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.class_.F().class_(var1);
      this.break_.class_(new rne_3(var1, this.class_.new_(), false));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.throws_.warn("Could not lookup oplist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new rCX("Could not request user " + var1.getName() + " from backend systems", var2);
      }
   }
}
