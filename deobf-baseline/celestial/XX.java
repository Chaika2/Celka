package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class XX {
   private final List<hT_2> id_class = Lists.newArrayList();
   private final List<hT_2> id_break = Lists.newArrayList();
   private rdb_3 id_byte;
   private rlb_3<rdb_3> id_protected;
   private XF id_throws;
   private XF id_case;
   private rLi_1 id_catch;
   private XC id_private;

   private XX() {
      this.id_throws = XF.id_throws;
      this.id_case = XF.id_throws;
      this.id_private = XC.id_class;
   }

   public XX id_class(rlb_3<rdb_3> var1) {
      this.id_protected = var1;
      return this;
   }

   public XX id_class(rcd_3 var1) {
      this.id_private = new XC(var1);
      return this;
   }

   public XX id_class(hT_2 var1) {
      this.id_class.add(var1);
      return this;
   }

   public XX id_class(rpL_2 var1) {
      this.id_byte = var1.id_case();
      return this;
   }

   public static XX id_class() {
      return new XX();
   }

   public Xh_1 id_break() {
      return new Xh_1(
         this.id_protected,
         this.id_byte,
         this.id_throws,
         this.id_case,
         this.id_class.toArray(hT_2.id_break),
         this.id_break.toArray(hT_2.id_break),
         this.id_catch,
         this.id_private
      );
   }
}
