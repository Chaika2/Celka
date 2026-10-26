package celestial;

import java.io.IOException;

public class rvw_3 implements ruS_2<At_1> {
   private int class_;
   private rfH_2 break_;
   private int byte_;
   private boolean protected_;

   public int byte_() {
      return this.class_;
   }

   public rvw_3() {
   }

   public rvw_3(int var1, rfH_2 var2, int var3, boolean var4) {
      this.class_ = var1;
      this.break_ = var2.int_();
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readInt();
      this.break_ = var1.byte_();
      this.byte_ = var1.readInt();
      this.protected_ = var1.readBoolean();
   }

   public boolean break_() {
      return this.protected_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeInt(this.class_);
      var1.class_(this.break_);
      var1.writeInt(this.byte_);
      var1.writeBoolean(this.protected_);
   }

   public rfH_2 throws_() {
      return this.break_;
   }

   public int protected_() {
      return this.byte_;
   }
}
