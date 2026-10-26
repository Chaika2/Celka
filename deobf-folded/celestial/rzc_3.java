package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rzc_3 implements rWg_1<rzc_3>, rWj_1<rzc_3> {
   private final List<rzE_2> id_class = Lists.newArrayList();
   private final List<rQz_1> id_break = Lists.newArrayList();
   private final List<rNL> id_byte = Lists.newArrayList();
   private rWK id_protected = new rzV_2(1.0F);
   private rzV_2 id_throws = new rzV_2(0.0F, 0.0F);

   public rzc_3 id_class(rzG_2<?> var1) {
      this.id_class.add(var1.id_break());
      return this;
   }

   public rzc_3 id_class(rWK var1) {
      this.id_protected = var1;
      return this;
   }

   public rzc_3 id_class() {
      return this;
   }

   public rzc_3 id_break(rNA var1) {
      this.id_byte.add(var1.id_case());
      return this;
   }

   public rzN_2 id_break() {
      if (this.id_protected == null) {
         throw new IllegalArgumentException("Rolls not set");
      } else {
         return new rzN_2(
            this.id_class.toArray(new rzE_2[0]), this.id_break.toArray(new rQz_1[0]), this.id_byte.toArray(new rNL[0]), this.id_protected, this.id_throws
         );
      }
   }

   public rzc_3 id_break(rQQ var1) {
      this.id_break.add(var1.build());
      return this;
   }
}
