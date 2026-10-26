package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Zu_1 extends Zk_1 {
   private final List<rpl_3> id_class;
   protected final List<cC_2> id_break;

   public Zu_1(List<rpl_3> var1, rgP_2 var2, rgP_2 var3) {
      super(var1, var2);
      this.id_byte = var1;
      this.id_break = Lists.newArrayList();
      this.id_class = ((cm_3)var1.id_volatile.id_class[15]).id_break(var3, 175);
   }

   protected void id_class(Ml_1 var1, int var2, int var3) {
      if (this.id_class.size() == 1) {
         ((cm_3)this.id_byte.id_volatile.id_class[15]).id_break(var1, this.id_class.get(0), (float)var3, (float)(var2 + 5), 16777215);
      } else if (this.id_class.size() >= 2) {
         ((cm_3)this.id_byte.id_volatile.id_class[15]).id_break(var1, this.id_class.get(0), (float)var3, (float)var2, 16777215);
         ((cm_3)this.id_byte.id_volatile.id_class[15]).id_break(var1, this.id_class.get(1), (float)var3, (float)(var2 + 10), 16777215);
      }
   }

   @Override
   public List<? extends cC_2> x_() {
      return this.id_break;
   }
}
