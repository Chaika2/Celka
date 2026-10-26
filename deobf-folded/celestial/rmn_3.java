package celestial;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class rmn_3 implements ruS_2<AH> {
   private GameProfile id_class;

   public rmn_3() {
   }

   public rmn_3(GameProfile var1) {
      this.id_class = var1;
   }

   public void id_class(AH var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      int[] var2 = new int[4];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var1.readInt();
      }

      UUID var5 = rqV_2.id_class(var2);
      String var4 = var1.id_throws(16);
      this.id_class = new GameProfile(var5, var4);
   }

   public GameProfile id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      for (int var5 : rqV_2.id_class(this.id_class.getId())) {
         var1.writeInt(var5);
      }

      var1.id_class(this.id_class.getName());
   }
}
