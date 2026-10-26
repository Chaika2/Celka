package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class iw_3 {
   private final it_3 class_;
   private final List<iI_2> break_ = Lists.newArrayList();

   public iw_3(it_3 var1) {
      this.class_ = var1;
   }

   public it_3 class_() {
      this.break_.stream().map(iI_2::break_).collect(Collectors.toSet()).forEach(this.class_::class_);
      this.break_.forEach(var1 -> {
         iq_3 var2 = var1.break_();
         this.class_.byte_(var2).forEach(var1x -> var1x.class_(var1.class_(), 0.0F));
         this.class_.break_(var2).class_(var1.class_(), 1.0F);
      });
      return this.class_;
   }

   public iw_3 class_(int var1, iq_3 var2) {
      this.break_.add(new iI_2(var1, var2));
      return this;
   }
}
