package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUm_1 implements rUv_1 {
   public static final Codec<rUm_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.id_break.fieldOf("valid_base_block").forGetter(var0x -> var0x.id_case),
               xc_3.id_break.fieldOf("stem_state").forGetter(var0x -> var0x.id_catch),
               xc_3.id_break.fieldOf("hat_state").forGetter(var0x -> var0x.id_private),
               xc_3.id_break.fieldOf("decor_state").forGetter(var0x -> var0x.id_implements),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter(var0x -> var0x.id_finally)
            )
            .apply(var0, rUm_1::new)
   );
   public static final rUm_1 id_break = new rUm_1(xu_3.XL.id_continue(), xu_3.Xm.id_continue(), xu_3.bg.id_continue(), xu_3.Xn.id_continue(), true);
   public static final rUm_1 id_byte;
   public static final rUm_1 id_protected = new rUm_1(xu_3.Xz.id_continue(), xu_3.Xx.id_continue(), xu_3.XN.id_continue(), xu_3.Xn.id_continue(), true);
   public static final rUm_1 id_throws;
   public final xc_3 id_case;
   public final xc_3 id_catch;
   public final xc_3 id_private;
   public final xc_3 id_implements;
   public final boolean id_finally;

   public rUm_1(xc_3 var1, xc_3 var2, xc_3 var3, xc_3 var4, boolean var5) {
      this.id_case = var1;
      this.id_catch = var2;
      this.id_private = var3;
      this.id_implements = var4;
      this.id_finally = var5;
   }

   static {
      id_byte = new rUm_1(id_break.id_case, id_break.id_catch, id_break.id_private, id_break.id_implements, false);
      id_throws = new rUm_1(id_protected.id_case, id_protected.id_catch, id_protected.id_private, id_protected.id_implements, false);
   }
}
