package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import java.io.File;
import java.util.UUID;

class rCh_1 implements ProfileLookupCallback {
   rCh_1(rnv_3 var1, File var2, File var3, File var4, String[] var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   private void id_class(File var1, String var2, String var3) {
      File var4 = new File(this.id_protected, var2 + ".dat");
      File var5 = new File(var1, var3 + ".dat");
      rCE.id_class(var1);
      if (!var4.renameTo(var5)) {
         throw new rCX("Could not convert file for " + var2);
      }
   }

   private String id_class(GameProfile var1) {
      String var2 = null;

      for (String var6 : this.id_throws) {
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
      this.id_class.F().id_class(var1);
      UUID var2 = var1.getId();
      if (var2 == null) {
         throw new rCX("Missing UUID for user profile " + var1.getName());
      } else {
         this.id_class(this.id_break, this.id_class(var1), var2.toString());
      }
   }

   public void onProfileLookupFailed(GameProfile var1, Exception var2) {
      rCE.id_throws.warn("Could not lookup user uuid for {}", var1.getName(), var2);
      if (var2 instanceof ProfileNotFoundException) {
         String var3 = this.id_class(var1);
         this.id_class(this.id_byte, var3, var3);
      } else {
         throw new rCX("Could not request user " + var1.getName() + " from backend systems", var2);
      }
   }
}
