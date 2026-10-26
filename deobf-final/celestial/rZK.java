package celestial;

import java.io.IOException;
import java.util.UUID;

public class rZK implements ruS_2<At_1> {
   private rgP_2 class_;
   private rVU break_;
   private UUID byte_;

   public boolean byte_() {
      return this.break_ == rVU.SYSTEM || this.break_ == rVU.GAME_INFO;
   }

   public rZK() {
   }

   public rZK(rgP_2 var1, rVU var2, UUID var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean class_() {
      return true;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_();
      this.break_ = rVU.class_(var1.readByte());
      this.byte_ = var1.private_();
   }

   public rgP_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeByte(this.break_.class_());
      var1.class_(this.byte_);
   }

   public UUID throws_() {
      return this.byte_;
   }

   public rVU protected_() {
      return this.break_;
   }
}
