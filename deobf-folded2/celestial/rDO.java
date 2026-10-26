package celestial;

public class rDO {
   public static final rDM<rUV> id_class = id_class("cave", rDk_1.id_class.id_class(new rUV(0.14285715F)));
   public static final rDM<rUV> id_break = id_class("canyon", rDk_1.id_byte.id_class(new rUV(0.02F)));
   public static final rDM<rUV> id_byte = id_class("ocean_cave", rDk_1.id_class.id_class(new rUV(0.06666667F)));
   public static final rDM<rUV> id_protected = id_class("underwater_canyon", rDk_1.id_protected.id_class(new rUV(0.02F)));
   public static final rDM<rUV> id_throws = id_class("underwater_cave", rDk_1.id_throws.id_class(new rUV(0.06666667F)));
   public static final rDM<rUV> id_case = id_class("nether_cave", rDk_1.id_break.id_class(new rUV(0.2F)));

   private static <WC extends rDX> rDM<WC> id_class(String var0, rDM<WC> var1) {
      return rVy_1.id_class(rVy_1.id_protected, var0, var1);
   }
}
