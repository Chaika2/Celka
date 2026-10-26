package celestial;

import com.mojang.serialization.Codec;

public class rrsW_2<P extends rrsk_3> {
   public static final rrsW_2<rrsz_3> class_ = class_("trunk_vine", rrsz_3.class_);
   public static final rrsW_2<rrsd_3> break_ = class_("leave_vine", rrsd_3.class_);
   public static final rrsW_2<rrsx_3> byte_ = class_("cocoa", rrsx_3.class_);
   public static final rrsW_2<rrsJ_2> protected_ = class_("beehive", rrsJ_2.class_);
   public static final rrsW_2<rrsX_2> throws_ = class_("alter_ground", rrsX_2.class_);
   private final Codec<P> case_;

   private rrsW_2(Codec<P> var1) {
      this.case_ = var1;
   }

   private static <P extends rrsk_3> rrsW_2<P> class_(String var0, Codec<P> var1) {
      return rVL.class_(rVL.rS, var0, new rrsW_2<>(var1));
   }

   public Codec<P> class_() {
      return this.case_;
   }
}
