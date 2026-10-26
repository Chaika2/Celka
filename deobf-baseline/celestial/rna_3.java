package celestial;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;

public class rna_3 extends rCx_1<GameProfile, rne_3> {
   public rna_3(File var1) {
      super(var1);
   }

   public boolean id_class(GameProfile var1) {
      rne_3 var2 = this.id_break(var1);
      return var2 != null ? var2.id_break() : false;
   }

   @Override
   public String[] id_class() {
      String[] var1 = new String[this.id_protected().size()];
      int var2 = 0;

      for (rCd_1 var4 : this.id_protected()) {
         var1[var2++] = ((GameProfile)var4.id_case()).getName();
      }

      return var1;
   }

   @Override
   protected rCd_1<GameProfile> id_class(JsonObject var1) {
      return new rne_3(var1);
   }

   protected String id_break(GameProfile var1) {
      return var1.getId().toString();
   }
}
