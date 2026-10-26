package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rNO extends rzh_3<rNO> {
   private final rNJ id_class;
   private final List<rNh_1> id_break = Lists.newArrayList();

   rNO(rNJ var1) {
      this.id_class = var1;
   }

   public rNO id_class(String var1, String var2) {
      return this.id_class(var1, var2, rNE.REPLACE);
   }

   public rNO id_class(String var1, String var2, rNE var3) {
      this.id_break.add(new rNh_1(var1, var2, var3));
      return this;
   }

   protected rNO id_throws() {
      return this;
   }

   @Override
   public rNL id_case() {
      return new rNs_1(this.id_byte(), this.id_class, this.id_break);
   }
}
