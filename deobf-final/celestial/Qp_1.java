package celestial;

import java.io.File;

public class Qp_1 {
   public final File class_;
   public final File break_;
   public final File byte_;
   public final String protected_;

   public Qp_1(File var1, File var2, File var3, String var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public jo_3 class_() {
      return (jo_3)(this.protected_ == null ? new jT_2(this.byte_) : new jo_3(this.byte_, this.protected_));
   }
}
