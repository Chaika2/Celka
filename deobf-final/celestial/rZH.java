package celestial;

import java.io.IOException;

public class rZH implements ruS_2<rmH_2> {
   private rke_3 class_;
   private boolean break_;
   private boolean byte_;

   public boolean byte_() {
      return this.break_;
   }

   public rZH() {
   }

   public rZH(rke_3 var1, boolean var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rke_3.class);
      this.break_ = var1.readBoolean();
      this.byte_ = var1.readBoolean();
   }

   public rke_3 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeBoolean(this.break_);
      var1.writeBoolean(this.byte_);
   }

   public boolean protected_() {
      return this.byte_;
   }
}
