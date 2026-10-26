package celestial;

import com.mojang.bridge.game.GameSession;
import java.util.UUID;

public class QC implements GameSession {
   private final int id_class;
   private final boolean id_break;
   private final String id_byte;
   private final String id_protected;
   private final UUID id_throws;

   public QC(gm_3 var1, cb_3 var2, Aq_1 var3) {
      this.id_class = var3.id_throws().size();
      this.id_break = !var3.id_class().id_protected();
      this.id_byte = var1.id_abstract().id_byte();
      Aw_1 var4 = var3.id_class(var2.ro());
      if (var4 != null) {
         this.id_protected = var4.id_break().id_break();
      } else {
         this.id_protected = "unknown";
      }

      this.id_throws = var3.id_volatile();
   }

   public UUID getSessionId() {
      return this.id_throws;
   }

   public String getDifficulty() {
      return this.id_byte;
   }

   public int getPlayerCount() {
      return this.id_class;
   }

   public String getGameMode() {
      return this.id_protected;
   }

   public boolean isRemoteServer() {
      return this.id_break;
   }
}
