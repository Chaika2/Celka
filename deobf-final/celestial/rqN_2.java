package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class rqN_2 {
   private final String class_;
   private final String break_;
   private final String byte_;
   private final rqc_3 protected_;

   public String byte_() {
      return this.class_;
   }

   public rqN_2(String var1, String var2, String var3, String var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = rqc_3.class_(var4);
   }

   @Override
   public String toString() {
      return "Session{username='" + this.class_ + "', playerID='" + this.break_ + "', token='" + this.byte_ + "', sessionType=" + this.protected_ + "}";
   }

   public String class_() {
      return "token:" + this.byte_ + ":" + this.break_;
   }

   public String break_() {
      return this.break_;
   }

   public GameProfile throws_() {
      try {
         UUID var1 = UUIDTypeAdapter.fromString(this.break_());
         return new GameProfile(var1, this.byte_());
      } catch (IllegalArgumentException var2) {
         return new GameProfile((UUID)null, this.byte_());
      }
   }

   public String protected_() {
      return this.byte_;
   }
}
