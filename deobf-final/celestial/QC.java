package celestial;

import com.mojang.bridge.game.GameSession;
import java.util.UUID;

public class QC implements GameSession {
   private final int class_;
   private final boolean break_;
   private final String byte_;
   private final String protected_;
   private final UUID throws_;

   public QC(gm_3 var1, cb_3 var2, Aq_1 var3) {
      this.class_ = var3.throws_().size();
      this.break_ = !var3.class_().protected_();
      this.byte_ = var1.abstract_().byte_();
      Aw_1 var4 = var3.class_(var2.ro());
      if (var4 != null) {
         this.protected_ = var4.break_().break_();
      } else {
         this.protected_ = "unknown";
      }

      this.throws_ = var3.volatile_();
   }

   public UUID getSessionId() {
      return this.throws_;
   }

   public String getDifficulty() {
      return this.byte_;
   }

   public int getPlayerCount() {
      return this.class_;
   }

   public String getGameMode() {
      return this.protected_;
   }

   public boolean isRemoteServer() {
      return this.break_;
   }
}
