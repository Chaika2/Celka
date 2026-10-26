package celestial;

import java.io.IOException;

public class rvx_3 extends rvJ_2 {
   public rvx_3() {
      this.private_ = true;
   }

   public rvx_3(int var1, byte var2, byte var3, boolean var4) {
      super(var1);
      this.throws_ = var2;
      this.case_ = var3;
      this.private_ = true;
      this.catch_ = var4;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      super.class_(var1);
      this.throws_ = var1.readByte();
      this.case_ = var1.readByte();
      this.catch_ = var1.readBoolean();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      super.break_(var1);
      var1.writeByte(this.throws_);
      var1.writeByte(this.case_);
      var1.writeBoolean(this.catch_);
   }
}
