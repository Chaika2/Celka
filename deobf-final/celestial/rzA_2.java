package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rzA_2 implements rWg_1<rzA_2> {
   private final List<rzN_2> class_ = Lists.newArrayList();
   private final List<rNL> break_ = Lists.newArrayList();
   private rzk_3 byte_ = rzL_2.break_;

   public rzA_2 class_() {
      return this;
   }

   public rzA_2 class_(rzc_3 var1) {
      this.class_.add(var1.break_());
      return this;
   }

   public rzA_2 class_(rzk_3 var1) {
      this.byte_ = var1;
      return this;
   }

   public rzA_2 break_(rNA var1) {
      this.break_.add(var1.case_());
      return this;
   }

   public rzL_2 break_() {
      return new rzL_2(this.byte_, this.class_.toArray(new rzN_2[0]), this.break_.toArray(new rNL[0]));
   }
}
