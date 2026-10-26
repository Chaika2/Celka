package celestial;

import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class rvo_3 {
   private final int id_class;
   private final rRl_1 id_break;
   private final GameProfile id_byte;
   private final rgP_2 id_protected;

   public rRl_1 id_byte() {
      return this.id_break;
   }

   public rvo_3(rvg_3 var1, GameProfile var2, @Nullable int var3, @Nullable rRl_1 var4, rgP_2 var5) {
      this.id_byte = var2;
      this.id_class = var3;
      this.id_break = var4;
      this.id_protected = var5;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("latency", this.id_class)
         .add("gameMode", this.id_break)
         .add("profile", this.id_byte)
         .add("displayName", this.id_protected == null ? null : rgB_2.id_class(this.id_protected))
         .toString();
   }

   public GameProfile id_class() {
      return this.id_byte;
   }

   public int id_break() {
      return this.id_class;
   }

   @Nullable
   public rgP_2 id_protected() {
      return this.id_protected;
   }
}
