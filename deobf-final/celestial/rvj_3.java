package celestial;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rvj_3 implements ruS_2<At_1> {
   private static final Logger break_ = LogManager.getLogger();
   private rfH_2 byte_;
   private xc_3 protected_;
   rZM class_;
   private boolean throws_;

   public rfH_2 byte_() {
      return this.byte_;
   }

   public rvj_3() {
   }

   public rvj_3(rfH_2 var1, xc_3 var2, rZM var3, boolean var4, String var5) {
      this.byte_ = var1.int_();
      this.protected_ = var2;
      this.class_ = var3;
      this.throws_ = var4;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.byte_ = var1.byte_();
      this.protected_ = xd_3.char_.class_(var1.case_());
      this.class_ = var1.class_(rZM.class);
      this.throws_ = var1.readBoolean();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public xc_3 break_() {
      return this.protected_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.byte_);
      var1.protected_(xd_3.finally_(this.protected_));
      var1.class_(this.class_);
      var1.writeBoolean(this.throws_);
   }

   public rZM throws_() {
      return this.class_;
   }

   public boolean protected_() {
      return this.throws_;
   }
}
