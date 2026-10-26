package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.UUID;

class rmz_3 extends Thread {
   rmz_3(rmW_2 var1, String var2, String var3) {
      super(var2);
      this.id_break = var1;
      this.id_class = var3;
   }

   @Override
   public void run() {
      GameProfile var1 = this.id_break.id_implements;

      try {
         this.id_break.id_implements = this.id_break.id_case.Z().hasJoinedServer(new GameProfile((UUID)null, var1.getName()), this.id_class, this.id_class());
         if (this.id_break.id_implements != null) {
            rmW_2.id_byte.info("UUID of player {} is {}", this.id_break.id_implements.getName(), this.id_break.id_implements.getId());
            this.id_break.id_catch = rmQ_2.READY_TO_ACCEPT;
         } else if (this.id_break.id_case.id_const()) {
            rmW_2.id_byte.warn("Failed to verify username but will let them in anyway!");
            this.id_break.id_implements = this.id_break.id_class(var1);
            this.id_break.id_catch = rmQ_2.READY_TO_ACCEPT;
         } else {
            this.id_break.id_class(new rgn_3("multiplayer.disconnect.unverified_username"));
            rmW_2.id_byte.error("Username '{}' tried to join with an invalid session", var1.getName());
         }
      } catch (AuthenticationUnavailableException var3) {
         if (this.id_break.id_case.id_const()) {
            rmW_2.id_byte.warn("Authentication servers are down but will let them in anyway!");
            this.id_break.id_implements = this.id_break.id_class(var1);
            this.id_break.id_catch = rmQ_2.READY_TO_ACCEPT;
         } else {
            this.id_break.id_class(new rgn_3("multiplayer.disconnect.authservers_down"));
            rmW_2.id_byte.error("Couldn't verify username because servers are unavailable");
         }
      }
   }

   private InetAddress id_class() {
      SocketAddress var1 = this.id_break.id_class.id_byte();
      return this.id_break.id_case.S() && var1 instanceof InetSocketAddress ? ((InetSocketAddress)var1).getAddress() : null;
   }
}
