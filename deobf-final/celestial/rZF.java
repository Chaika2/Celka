package celestial;

import java.io.IOException;

public class rZF implements ruS_2<rmH_2> {
   private boolean class_;
   private boolean break_;

   public boolean byte_() {
      return this.break_;
   }

   public rZF() {
   }

   public rZF(boolean var1, boolean var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readBoolean();
      this.break_ = var1.readBoolean();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.class_);
      var1.writeBoolean(this.break_);
   }

   public boolean break_() {
      return this.class_;
   }
}
