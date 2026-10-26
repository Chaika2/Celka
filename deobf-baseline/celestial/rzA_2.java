package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rzA_2 implements rWg_1<rzA_2> {
   private final List<rzN_2> id_class = Lists.newArrayList();
   private final List<rNL> id_break = Lists.newArrayList();
   private rzk_3 id_byte = rzL_2.id_break;

   public rzA_2 id_class() {
      return this;
   }

   public rzA_2 id_class(rzc_3 var1) {
      this.id_class.add(var1.id_break());
      return this;
   }

   public rzA_2 id_class(rzk_3 var1) {
      this.id_byte = var1;
      return this;
   }

   public rzA_2 id_break(rNA var1) {
      this.id_break.add(var1.id_case());
      return this;
   }

   public rzL_2 id_break() {
      return new rzL_2(this.id_byte, this.id_class.toArray(new rzN_2[0]), this.id_break.toArray(new rNL[0]));
   }
}
