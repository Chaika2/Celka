package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

class rCG implements ProfileLookupCallback {
   rCG(rnW_2 var1, Map var2, rno_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.class_.F().class_(var1);
      String[] var2 = (String[])this.break_.get(var1.getName().toLowerCase(Locale.ROOT));
      if (var2 == null) {
         rCE.throws_.warn("Could not convert user banlist entry for {}", var1.getName());
         throw new rCX("Profile not in the conversionlist");
      } else {
         Date var3 = var2.length > 1 ? rCE.class_(var2[1], (Date)null) : null;
         String var4 = var2.length > 2 ? var2[2] : null;
         Date var5 = var2.length > 3 ? rCE.class_(var2[3], (Date)null) : null;
         String var6 = var2.length > 4 ? var2[4] : null;
         this.byte_.class_(new rCJ(var1, var3, var4, var5, var6));
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.throws_.warn("Could not lookup user banlist entry for {}", var1.getName(), var2);
      if (!(var2 instanceof ProfileNotFoundException)) {
         throw new rCX("Could not request user " + var1.getName() + " from backend systems", var2);
      }
   }
}
