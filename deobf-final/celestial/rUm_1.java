package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUm_1 implements rUv_1 {
   public static final Codec<rUm_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               xc_3.break_.fieldOf("valid_base_block").forGetter(var0x -> var0x.case_),
               xc_3.break_.fieldOf("stem_state").forGetter(var0x -> var0x.catch_),
               xc_3.break_.fieldOf("hat_state").forGetter(var0x -> var0x.private_),
               xc_3.break_.fieldOf("decor_state").forGetter(var0x -> var0x.implements_),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter(var0x -> var0x.finally_)
            )
            .apply(var0, rUm_1::new)
   );
   public static final rUm_1 break_ = new rUm_1(xu_3.XL.continue_(), xu_3.Xm.continue_(), xu_3.bg.continue_(), xu_3.Xn.continue_(), true);
   public static final rUm_1 byte_;
   public static final rUm_1 protected_ = new rUm_1(xu_3.Xz.continue_(), xu_3.Xx.continue_(), xu_3.XN.continue_(), xu_3.Xn.continue_(), true);
   public static final rUm_1 throws_;
   public final xc_3 case_;
   public final xc_3 catch_;
   public final xc_3 private_;
   public final xc_3 implements_;
   public final boolean finally_;

   public rUm_1(xc_3 var1, xc_3 var2, xc_3 var3, xc_3 var4, boolean var5) {
      this.case_ = var1;
      this.catch_ = var2;
      this.private_ = var3;
      this.implements_ = var4;
      this.finally_ = var5;
   }

   static {
      byte_ = new rUm_1(break_.case_, break_.catch_, break_.private_, break_.implements_, false);
      throws_ = new rUm_1(protected_.case_, protected_.catch_, protected_.private_, protected_.implements_, false);
   }
}
