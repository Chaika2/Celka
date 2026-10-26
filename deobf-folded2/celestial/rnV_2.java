package celestial;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class rnV_2 extends rCr_1 {
   private rcd_3 id_case;

   public rnV_2(rng_3 var1, rVv_1 var2, rrGx_1 var3) {
      super(var1, var2, var3, 8);
      this.id_class(10);
   }

   @Override
   public rgP_2 id_class(SocketAddress var1, GameProfile var2) {
      return (rgP_2)(var2.getName().equalsIgnoreCase(this.id_break().id_default()) && this.id_class(var2.getName()) != null
         ? new rgn_3("multiplayer.disconnect.name_taken")
         : super.id_class(var1, var2));
   }

   @Override
   protected void id_class(rhN_2 var1) {
      if (var1.g().getString().equals(this.id_break().id_default())) {
         this.id_case = var1.id_case(new rcd_3());
      }

      super.id_class(var1);
   }

   public rng_3 id_break() {
      return (rng_3)super.id_byte();
   }

   @Override
   public rcd_3 id_protected() {
      return this.id_case;
   }
}
