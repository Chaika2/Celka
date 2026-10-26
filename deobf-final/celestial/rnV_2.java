package celestial;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class rnV_2 extends rCr_1 {
   private rcd_3 case_;

   public rnV_2(rng_3 var1, rVv_1 var2, rrGx_1 var3) {
      super(var1, var2, var3, 8);
      this.class_(10);
   }

   @Override
   public rgP_2 class_(SocketAddress var1, GameProfile var2) {
      return (rgP_2)(var2.getName().equalsIgnoreCase(this.break_().default_()) && this.class_(var2.getName()) != null
         ? new rgn_3("multiplayer.disconnect.name_taken")
         : super.class_(var1, var2));
   }

   @Override
   protected void class_(rhN_2 var1) {
      if (var1.g().getString().equals(this.break_().default_())) {
         this.case_ = var1.case_(new rcd_3());
      }

      super.class_(var1);
   }

   public rng_3 break_() {
      return (rng_3)super.byte_();
   }

   @Override
   public rcd_3 protected_() {
      return this.case_;
   }
}
