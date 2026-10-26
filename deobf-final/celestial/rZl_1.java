package celestial;

import java.io.IOException;

public class rZl_1 implements ruS_2<rmH_2> {
   private int class_;
   private String break_;
   private boolean byte_;

   public boolean byte_() {
      return this.byte_;
   }

   public rZl_1() {
   }

   public rZl_1(int var1, String var2, boolean var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public rHm_1 class_(rYB var1) {
      an_3 var2 = var1.break_(this.class_);
      return var2 instanceof rsW_2 ? ((rsW_2)var2).else_() : null;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.throws_(32767);
      this.byte_ = var1.readBoolean();
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   public String break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.writeBoolean(this.byte_);
   }
}
