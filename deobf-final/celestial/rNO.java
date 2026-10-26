package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rNO extends rzh_3<rNO> {
   private final rNJ class_;
   private final List<rNh_1> break_ = Lists.newArrayList();

   rNO(rNJ var1) {
      this.class_ = var1;
   }

   public rNO class_(String var1, String var2) {
      return this.class_(var1, var2, rNE.REPLACE);
   }

   public rNO class_(String var1, String var2, rNE var3) {
      this.break_.add(new rNh_1(var1, var2, var3));
      return this;
   }

   protected rNO throws_() {
      return this;
   }

   @Override
   public rNL case_() {
      return new rNs_1(this.byte_(), this.class_, this.break_);
   }
}
