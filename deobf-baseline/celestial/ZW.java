package celestial;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class ZW extends Lf_1<Zk_1> {
   public ZW(ZJ var1, rRu_1 var2) {
      super(var1.id_volatile, var1.id_package, var1.id_int, 43, var1.id_int - 32, 24);
      this.id_class = var1;
      HashMap var3 = Maps.newHashMap();
      rRu_1.id_class(new Zz_1(this, var1, var2, var3));
      var3.entrySet()
         .stream()
         .sorted(Entry.comparingByKey())
         .forEach(
            var1x -> {
               ZJ var10003 = this.id_class;
               Objects.requireNonNull(this.id_class);
               this.id_break(new Zc_1(var10003, new rgn_3(((rRZ)var1x.getKey()).id_class()).id_class(new rgF_2[]{rgF_2.BOLD, rgF_2.YELLOW})));
               ((Map)var1x.getValue())
                  .entrySet()
                  .stream()
                  .sorted(Entry.comparingByKey(Comparator.comparing(rRA::id_class)))
                  .forEach(var1xx -> this.id_break((Zk_1)var1xx.getValue()));
            }
         );
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      if (this.id_break((double)var2, (double)var3)) {
         Zk_1 var5 = this.id_protected((double)var2, (double)var3);
         if (var5 != null) {
            this.id_class.id_break(var5.id_class);
         }
      }
   }
}
