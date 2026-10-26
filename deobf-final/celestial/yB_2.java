package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class yB_2 {
   private final Hv_1 class_ = new Hv_1();
   private final SortedMap<HU, lD_2> break_ = rqR_2.class_(new Object2ObjectLinkedOpenHashMap(), var1 -> {
      var1.put(lp_3.catch_(), this.class_.class_(HU.case_()));
      var1.put(lp_3.private_(), this.class_.class_(HU.private_()));
      var1.put(lp_3.class_(), this.class_.class_(HU.catch_()));
      var1.put(lp_3.finally_(), this.class_.class_(HU.implements_()));
      class_(var1, lp_3.break_());
      class_(var1, lp_3.byte_());
      class_(var1, lp_3.protected_());
      class_(var1, lp_3.throws_());
      class_(var1, lp_3.case_());
      class_(var1, HU.extends_());
      class_(var1, HU.final_());
      class_(var1, HU.package_());
      class_(var1, HU.new_());
      class_(var1, HU.continue_());
      class_(var1, HU.int_());
      class_(var1, HU.super_());
      class_(var1, HU.this_());
      class_(var1, HU.volatile_());
      IC.extends_.forEach(var1x -> class_(var1, var1x));
   });
   private final Hd_1 byte_ = Hx_1.class_(this.break_, new lD_2(256));
   private final Hd_1 protected_ = Hx_1.class_(new lD_2(256));
   private final Hc_1 throws_ = new Hc_1(this.byte_);

   public Hd_1 byte_() {
      return this.protected_;
   }

   private static void class_(Object2ObjectLinkedOpenHashMap<HU, lD_2> var0, HU var1) {
      var0.put(var1, new lD_2(var1.goto_()));
   }

   public Hv_1 class_() {
      return this.class_;
   }

   public Hd_1 break_() {
      return this.byte_;
   }

   public Hc_1 protected_() {
      return this.throws_;
   }
}
