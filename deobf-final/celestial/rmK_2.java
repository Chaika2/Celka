package celestial;

import java.io.IOException;

public class rmK_2 implements ruS_2<rmH_2> {
   private int class_;
   private int break_;

   public int byte_() {
      return this.break_;
   }

   public rmK_2() {
   }

   public rmK_2(int var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
      this.break_ = var1.readByte();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.writeByte(this.break_);
   }
}
