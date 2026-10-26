package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class iw_3 {
   private final it_3 id_class;
   private final List<iI_2> id_break = Lists.newArrayList();

   public iw_3(it_3 var1) {
      this.id_class = var1;
   }

   public it_3 id_class() {
      this.id_break.stream().map(iI_2::id_break).collect(Collectors.toSet()).forEach(this.id_class::id_class);
      this.id_break.forEach(var1 -> {
         iq_3 var2 = var1.id_break();
         this.id_class.id_byte(var2).forEach(var1x -> var1x.id_class(var1.id_class(), 0.0F));
         this.id_class.id_break(var2).id_class(var1.id_class(), 1.0F);
      });
      return this.id_class;
   }

   public iw_3 id_class(int var1, iq_3 var2) {
      this.id_break.add(new iI_2(var1, var2));
      return this;
   }
}
