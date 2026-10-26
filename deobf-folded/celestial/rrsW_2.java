package celestial;

import com.mojang.serialization.Codec;

public class rrsW_2<P extends rrsk_3> {
   public static final rrsW_2<rrsz_3> id_class = id_class("trunk_vine", rrsz_3.id_class);
   public static final rrsW_2<rrsd_3> id_break = id_class("leave_vine", rrsd_3.id_class);
   public static final rrsW_2<rrsx_3> id_byte = id_class("cocoa", rrsx_3.id_class);
   public static final rrsW_2<rrsJ_2> id_protected = id_class("beehive", rrsJ_2.id_class);
   public static final rrsW_2<rrsX_2> id_throws = id_class("alter_ground", rrsX_2.id_class);
   private final Codec<P> id_case;

   private rrsW_2(Codec<P> var1) {
      this.id_case = var1;
   }

   private static <P extends rrsk_3> rrsW_2<P> id_class(String var0, Codec<P> var1) {
      return rVL.id_class(rVL.rS, var0, new rrsW_2<>(var1));
   }

   public Codec<P> id_class() {
      return this.id_case;
   }
}
