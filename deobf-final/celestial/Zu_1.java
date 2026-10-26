package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Zu_1 extends Zk_1 {
   private final List<rpl_3> class_;
   protected final List<cC_2> break_;

   public Zu_1(List<rpl_3> var1, rgP_2 var2, rgP_2 var3) {
      super(var1, var2);
      this.byte_ = var1;
      this.break_ = Lists.newArrayList();
      this.class_ = ((cm_3)var1.volatile_.class_[15]).break_(var3, 175);
   }

   protected void class_(Ml_1 var1, int var2, int var3) {
      if (this.class_.size() == 1) {
         ((cm_3)this.byte_.volatile_.class_[15]).break_(var1, this.class_.get(0), (float)var3, (float)(var2 + 5), 16777215);
      } else if (this.class_.size() >= 2) {
         ((cm_3)this.byte_.volatile_.class_[15]).break_(var1, this.class_.get(0), (float)var3, (float)var2, 16777215);
         ((cm_3)this.byte_.volatile_.class_[15]).break_(var1, this.class_.get(1), (float)var3, (float)(var2 + 10), 16777215);
      }
   }

   @Override
   public List<? extends cC_2> x_() {
      return this.break_;
   }
}
