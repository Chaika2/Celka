package celestial;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class rmu_3 implements ruS_2<rmk_3> {
   private GameProfile class_;

   public rmu_3() {
   }

   public rmu_3(GameProfile var1) {
      this.class_ = var1;
   }

   public void class_(rmk_3 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = new GameProfile((UUID)null, var1.throws_(16));
   }

   public GameProfile break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_.getName());
   }
}
