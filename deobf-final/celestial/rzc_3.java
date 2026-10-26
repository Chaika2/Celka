package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rzc_3 implements rWg_1<rzc_3>, rWj_1<rzc_3> {
   private final List<rzE_2> class_ = Lists.newArrayList();
   private final List<rQz_1> break_ = Lists.newArrayList();
   private final List<rNL> byte_ = Lists.newArrayList();
   private rWK protected_ = new rzV_2(1.0F);
   private rzV_2 throws_ = new rzV_2(0.0F, 0.0F);

   public rzc_3 class_(rzG_2<?> var1) {
      this.class_.add(var1.break_());
      return this;
   }

   public rzc_3 class_(rWK var1) {
      this.protected_ = var1;
      return this;
   }

   public rzc_3 class_() {
      return this;
   }

   public rzc_3 break_(rNA var1) {
      this.byte_.add(var1.case_());
      return this;
   }

   public rzN_2 break_() {
      if (this.protected_ == null) {
         throw new IllegalArgumentException("Rolls not set");
      } else {
         return new rzN_2(this.class_.toArray(new rzE_2[0]), this.break_.toArray(new rQz_1[0]), this.byte_.toArray(new rNL[0]), this.protected_, this.throws_);
      }
   }

   public rzc_3 break_(rQQ var1) {
      this.break_.add(var1.build());
      return this;
   }
}
