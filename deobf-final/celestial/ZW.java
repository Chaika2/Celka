package celestial;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class ZW extends Lf_1<Zk_1> {
   public ZW(ZJ var1, rRu_1 var2) {
      super(var1.volatile_, var1.package_, var1.int_, 43, var1.int_ - 32, 24);
      this.class_ = var1;
      HashMap var3 = Maps.newHashMap();
      rRu_1.class_(new Zz_1(this, var1, var2, var3));
      var3.entrySet()
         .stream()
         .sorted(Entry.comparingByKey())
         .forEach(
            var1x -> {
               ZJ var10003 = this.class_;
               Objects.requireNonNull(this.class_);
               this.break_(new Zc_1(var10003, new rgn_3(((rRZ)var1x.getKey()).class_()).class_(new rgF_2[]{rgF_2.BOLD, rgF_2.YELLOW})));
               ((Map)var1x.getValue())
                  .entrySet()
                  .stream()
                  .sorted(Entry.comparingByKey(Comparator.comparing(rRA::class_)))
                  .forEach(var1xx -> this.break_((Zk_1)var1xx.getValue()));
            }
         );
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      super.class_(var1, var2, var3, var4);
      if (this.break_((double)var2, (double)var3)) {
         Zk_1 var5 = this.protected_((double)var2, (double)var3);
         if (var5 != null) {
            this.class_.break_(var5.class_);
         }
      }
   }
}
