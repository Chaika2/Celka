package celestial;

import java.io.IOException;

public class rvk_3 extends rvJ_2 {
   public rvk_3() {
      this.implements_ = true;
   }

   public rvk_3(int var1, short var2, short var3, short var4, boolean var5) {
      super(var1);
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.catch_ = var5;
      this.implements_ = true;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      super.class_(var1);
      this.break_ = var1.readShort();
      this.byte_ = var1.readShort();
      this.protected_ = var1.readShort();
      this.catch_ = var1.readBoolean();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      super.break_(var1);
      var1.writeShort(this.break_);
      var1.writeShort(this.byte_);
      var1.writeShort(this.protected_);
      var1.writeBoolean(this.catch_);
   }
}
