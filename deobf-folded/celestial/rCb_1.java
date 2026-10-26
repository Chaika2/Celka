package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;

class rCb_1 implements ProfileLookupCallback {
   rCb_1(rnW_2 var1, rna_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.id_class.F().id_class(var1);
      this.id_break.id_class(new rne_3(var1, this.id_class.id_new(), false));
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.id_throws.warn("Could not lookup oplist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new rCX("Could not request user " + var1.getName() + " from backend systems", var2);
      }
   }
}
