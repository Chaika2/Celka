package celestial;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class yB_2 {
   private final Hv_1 id_class = new Hv_1();
   private final SortedMap<HU, lD_2> id_break = rqR_2.id_class(new Object2ObjectLinkedOpenHashMap(), var1 -> {
      var1.put(lp_3.id_catch(), this.id_class.id_class(HU.id_case()));
      var1.put(lp_3.id_private(), this.id_class.id_class(HU.id_private()));
      var1.put(lp_3.id_class(), this.id_class.id_class(HU.id_catch()));
      var1.put(lp_3.id_finally(), this.id_class.id_class(HU.id_implements()));
      id_class(var1, lp_3.id_break());
      id_class(var1, lp_3.id_byte());
      id_class(var1, lp_3.id_protected());
      id_class(var1, lp_3.id_throws());
      id_class(var1, lp_3.id_case());
      id_class(var1, HU.id_extends());
      id_class(var1, HU.id_final());
      id_class(var1, HU.id_package());
      id_class(var1, HU.id_new());
      id_class(var1, HU.id_continue());
      id_class(var1, HU.id_int());
      id_class(var1, HU.id_super());
      id_class(var1, HU.id_this());
      id_class(var1, HU.id_volatile());
      IC.id_extends.forEach(var1x -> id_class(var1, var1x));
   });
   private final Hd_1 id_byte = Hx_1.id_class(this.id_break, new lD_2(256));
   private final Hd_1 id_protected = Hx_1.id_class(new lD_2(256));
   private final Hc_1 id_throws = new Hc_1(this.id_byte);

   public Hd_1 id_byte() {
      return this.id_protected;
   }

   private static void id_class(Object2ObjectLinkedOpenHashMap<HU, lD_2> var0, HU var1) {
      var0.put(var1, new lD_2(var1.id_goto()));
   }

   public Hv_1 id_class() {
      return this.id_class;
   }

   public Hd_1 id_break() {
      return this.id_byte;
   }

   public Hc_1 id_protected() {
      return this.id_throws;
   }
}
