package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;

class rCh_1 implements ProfileLookupCallback {
   rCh_1(rnv_3 var1, File var2, File var3, File var4, String[] var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   private void class_(File var1, String var2, String var3) {
      File var4 = new File(this.protected_, var2 + ".dat");
      File var5 = new File(var1, var3 + ".dat");
      rCE.class_(var1);
      if (!var4.renameTo(var5)) {
         throw new rCX("Could not convert file for " + var2);
      }
   }

   private String class_(GameProfile var1) {
      String var2 = null;

      for (String var6 : this.throws_) {
         if (var6 != null && var6.equalsIgnoreCase(var1.getName())) {
            var2 = var6;
            break;
         }
      }

      if (var2 == null) {
         throw new rCX("Could not find the filename for " + var1.getName() + " anymore");
      } else {
         return var2;
      }
   }

   public void onProfileLookupSucceeded(GameProfile var1) {
      this.class_.F().class_(var1);
      UUID var2 = var1.getId();
      if (var2 == null) {
         throw new rCX("Missing UUID for user profile " + var1.getName());
      } else {
         this.class_(this.break_, this.class_(var1), var2.toString());
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.throws_.warn("Could not lookup user uuid for {}", var1.getName(), var2);
      if (var2 instanceof ProfileNotFoundException) {
         String var3 = this.class_(var1);
         this.class_(this.byte_, var3, var3);
      } else {
         throw new rCX("Could not request user " + var1.getName() + " from backend systems", var2);
      }
   }
}
