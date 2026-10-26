package celestial;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class it_3 {
   public static final it_3 class_ = class_("empty").class_(0, iq_3.break_).class_();
   public static final it_3 break_ = class_("simple").class_(5000, iq_3.byte_).class_(11000, iq_3.throws_).class_();
   public static final it_3 byte_ = class_("villager_baby")
      .class_(10, iq_3.break_)
      .class_(3000, iq_3.protected_)
      .class_(6000, iq_3.break_)
      .class_(10000, iq_3.protected_)
      .class_(12000, iq_3.throws_)
      .class_();
   public static final it_3 protected_ = class_("villager_default")
      .class_(10, iq_3.break_)
      .class_(2000, iq_3.byte_)
      .class_(9000, iq_3.case_)
      .class_(11000, iq_3.break_)
      .class_(12000, iq_3.throws_)
      .class_();
   private final Map<iq_3, C_if> throws_ = Maps.newHashMap();

   protected List<C_if> byte_(iq_3 var1) {
      return this.throws_.entrySet().stream().filter(var1x -> var1x.getKey() != var1).map(Entry::getValue).collect(Collectors.toList());
   }

   protected void class_(iq_3 var1) {
      if (!this.throws_.containsKey(var1)) {
         this.throws_.put(var1, new C_if());
      }
   }

   public iq_3 class_(int var1) {
      return this.throws_
         .entrySet()
         .stream()
         .max(Comparator.comparingDouble(var1x -> (double)var1x.getValue().class_(var1)))
         .map(Entry::getKey)
         .orElse(iq_3.break_);
   }

   protected static iw_3 class_(String var0) {
      it_3 var1 = rVL.class_(rVL.W, var0, new it_3());
      return new iw_3(var1);
   }

   protected C_if break_(iq_3 var1) {
      return this.throws_.get(var1);
   }
}
