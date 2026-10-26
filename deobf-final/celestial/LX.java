package celestial;

import com.google.common.base.MoreObjects;
import java.util.List;

public class LX {
   private final LE class_;
   private final List<LS> break_;
   private final int byte_;

   public LX(LE var1, List<LS> var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public LS class_(int var1) {
      return var1 >= 0 && var1 < this.break_.size() ? (LS)MoreObjects.firstNonNull(this.break_.get(var1), Lb_1.class_) : Lb_1.class_;
   }

   public int class_() {
      return this.byte_;
   }
}
