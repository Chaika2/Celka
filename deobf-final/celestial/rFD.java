package celestial;

import java.util.UUID;

public class rFD implements gV_2 {
   private static final rgN_2 class_ = new rgN_2("Rcon");
   private final StringBuffer break_ = new StringBuffer();
   private final rnW_2 protected_;

   public gy_3 byte_() {
      rrEm_1 var1 = this.protected_.abstract_();
      return new gy_3(this, rjU_2.byte_(var1.X()), rjK_2.class_, var1, 4, "Rcon", class_, this.protected_, (an_3)null);
   }

   public rFD(rnW_2 var1) {
      this.protected_ = var1;
   }

   @Override
   public boolean C() {
      return true;
   }

   @Override
   public boolean l() {
      return true;
   }

   @Override
   public void class_(rgP_2 var1, UUID var2) {
      this.break_.append(var1.getString());
   }

   public void class_() {
      this.break_.setLength(0);
   }

   public String break_() {
      return this.break_.toString();
   }

   @Override
   public boolean H() {
      return this.protected_.super_();
   }
}
