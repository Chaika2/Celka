package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class OR {
   private int id_class;
   private final List<rqO_2> id_break = Lists.newArrayList();
   private final List<rqO_2> id_byte = Lists.newArrayList();
   private rqO_2 id_protected;

   public Og_1 id_class() {
      return new Og_1(
         this.id_class,
         this.id_break.toArray(new rqO_2[0]),
         this.id_byte.toArray(new rqO_2[0]),
         this.id_protected == null ? gw_3.id_class : new gw_3(this.id_protected)
      );
   }

   public static OR id_class(rqO_2 var0) {
      return new OR().id_break(var0);
   }

   public static OR id_class(int var0) {
      return new OR().id_break(var0);
   }

   public OR id_break(rqO_2 var1) {
      this.id_byte.add(var1);
      return this;
   }

   public OR id_break(int var1) {
      this.id_class += var1;
      return this;
   }
}
