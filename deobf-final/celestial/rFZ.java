package celestial;

import java.io.IOException;

public class rFZ implements ruS_2<At_1> {
   private int class_;
   private int break_;

   public int byte_() {
      return this.break_;
   }

   public rFZ() {
   }

   public rFZ(int var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readInt();
      this.break_ = var1.readInt();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeInt(this.class_);
      var1.writeInt(this.break_);
   }

   public int break_() {
      return this.class_;
   }
}
