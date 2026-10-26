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
      this.break_ = var1;
      this.class_ = var3;
   }

   @Override
   public void run() {
      GameProfile var1 = this.break_.implements_;

      try {
         this.break_.implements_ = this.break_.case_.Z().hasJoinedServer(new GameProfile((UUID)null, var1.getName()), this.class_, this.class_());
         if (this.break_.implements_ != null) {
            rmW_2.byte_.info("UUID of player {} is {}", this.break_.implements_.getName(), this.break_.implements_.getId());
            this.break_.catch_ = rmQ_2.READY_TO_ACCEPT;
         } else if (this.break_.case_.const_()) {
            rmW_2.byte_.warn("Failed to verify username but will let them in anyway!");
            this.break_.implements_ = this.break_.class_(var1);
            this.break_.catch_ = rmQ_2.READY_TO_ACCEPT;
         } else {
            this.break_.class_(new rgn_3("multiplayer.disconnect.unverified_username"));
            rmW_2.byte_.error("Username '{}' tried to join with an invalid session", var1.getName());
         }
      } catch (AuthenticationUnavailableException var3) {
         if (this.break_.case_.const_()) {
            rmW_2.byte_.warn("Authentication servers are down but will let them in anyway!");
            this.break_.implements_ = this.break_.class_(var1);
            this.break_.catch_ = rmQ_2.READY_TO_ACCEPT;
         } else {
            this.break_.class_(new rgn_3("multiplayer.disconnect.authservers_down"));
            rmW_2.byte_.error("Couldn't verify username because servers are unavailable");
         }
      }
   }

   private InetAddress class_() {
      SocketAddress var1 = this.break_.class_.byte_();
      return this.break_.case_.S() && var1 instanceof InetSocketAddress ? ((InetSocketAddress)var1).getAddress() : null;
   }
}
