package celestial;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class rmu_3 implements ruS_2<rmk_3> {
   private GameProfile id_class;

   public rmu_3() {
   }

   public rmu_3(GameProfile var1) {
      this.id_class = var1;
   }

   public void id_class(rmk_3 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = new GameProfile((UUID)null, var1.id_throws(16));
   }

   public GameProfile id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class.getName());
   }
}
