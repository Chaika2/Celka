package celestial;

import java.io.IOException;

public class rmg_3 implements ruS_2<rmH_2> {
   private int class_;
   private short break_;
   private boolean byte_;

   public short byte_() {
      return this.break_;
   }

   public rmg_3() {
   }

   public rmg_3(int var1, short var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
      this.break_ = var1.readShort();
      this.byte_ = var1.readByte() != 0;
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.writeShort(this.break_);
      var1.writeByte(this.byte_ ? 1 : 0);
   }
}
