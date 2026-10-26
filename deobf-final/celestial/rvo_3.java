package celestial;

import com.google.common.base.MoreObjects;
import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public class rvo_3 {
   private final int class_;
   private final rRl_1 break_;
   private final GameProfile byte_;
   private final rgP_2 protected_;

   public rRl_1 byte_() {
      return this.break_;
   }

   public rvo_3(rvg_3 var1, GameProfile var2, @Nullable int var3, @Nullable rRl_1 var4, rgP_2 var5) {
      this.byte_ = var2;
      this.class_ = var3;
      this.break_ = var4;
      this.protected_ = var5;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("latency", this.class_)
         .add("gameMode", this.break_)
         .add("profile", this.byte_)
         .add("displayName", this.protected_ == null ? null : rgB_2.class_(this.protected_))
         .toString();
   }

   public GameProfile class_() {
      return this.byte_;
   }

   public int break_() {
      return this.class_;
   }

   @Nullable
   public rgP_2 protected_() {
      return this.protected_;
   }
}
