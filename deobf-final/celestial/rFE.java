package celestial;

import java.io.IOException;

public class rFE implements ruS_2<At_1> {
   private rRO class_;
   private boolean break_;

   public rRO byte_() {
      return this.class_;
   }

   public rFE() {
   }

   public rFE(rRO var1, boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = rRO.class_(var1.readUnsignedByte());
      this.break_ = var1.readBoolean();
   }

   public boolean break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_.class_());
      var1.writeBoolean(this.break_);
   }
}
