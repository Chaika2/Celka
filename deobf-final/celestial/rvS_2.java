package celestial;

import java.io.IOException;

public class rvS_2 implements ruS_2<At_1> {
   private int class_;
   private short break_;
   private boolean byte_;

   public short byte_() {
      return this.break_;
   }

   public rvS_2() {
   }

   public rvS_2(int var1, short var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readUnsignedByte();
      this.break_ = var1.readShort();
      this.byte_ = var1.readBoolean();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.writeShort(this.break_);
      var1.writeBoolean(this.byte_);
   }

   public int break_() {
      return this.class_;
   }

   public boolean protected_() {
      return this.byte_;
   }
}
