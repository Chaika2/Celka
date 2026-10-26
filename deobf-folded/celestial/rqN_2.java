package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class rqN_2 {
   private final String id_class;
   private final String id_break;
   private final String id_byte;
   private final rqc_3 id_protected;

   public String id_byte() {
      return this.id_class;
   }

   public rqN_2(String var1, String var2, String var3, String var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = rqc_3.id_class(var4);
   }

   @Override
   public String toString() {
      return "Session{username='" + this.id_class + "', playerID='" + this.id_break + "', token='" + this.id_byte + "', sessionType=" + this.id_protected + "}";
   }

   public String id_class() {
      return "token:" + this.id_byte + ":" + this.id_break;
   }

   public String id_break() {
      return this.id_break;
   }

   public GameProfile id_throws() {
      try {
         UUID var1 = UUIDTypeAdapter.fromString(this.id_break());
         return new GameProfile(var1, this.id_byte());
      } catch (IllegalArgumentException var2) {
         return new GameProfile((UUID)null, this.id_byte());
      }
   }

   public String id_protected() {
      return this.id_byte;
   }
}
