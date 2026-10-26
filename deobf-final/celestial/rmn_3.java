package celestial;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class rmn_3 implements ruS_2<AH> {
   private GameProfile class_;

   public rmn_3() {
   }

   public rmn_3(GameProfile var1) {
      this.class_ = var1;
   }

   public void class_(AH var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      int[] var2 = new int[4];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.readInt();
      }

      UUID var5 = rqV_2.class_(var2);
      String var4 = var1.throws_(16);
      this.class_ = new GameProfile(var5, var4);
   }

   public GameProfile break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      for (int var5 : rqV_2.class_(this.class_.getId())) {
         var1.writeInt(var5);
      }

      var1.class_(this.class_.getName());
   }
}
