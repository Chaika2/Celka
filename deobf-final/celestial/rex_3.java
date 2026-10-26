package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class rex_3 extends rev_3 {
   public static final Codec<rex_3> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rDg_1.break_.fieldOf("feature").forGetter(var0x -> var0x.break_), break_()).apply(var0, rex_3::new)
   );
   private final Supplier<rDg_1<?, ?>> break_;
   private final rcd_3 protected_;

   protected rex_3(Supplier<rDg_1<?, ?>> var1, rem_3 var2) {
      super(var2);
      this.break_ = var1;
      this.protected_ = this.case_();
   }

   @Override
   public String toString() {
      return "Feature[" + rVL.q.break_(this.break_.get().break_()) + "]";
   }

   @Override
   public red_3<?> class_() {
      return red_3.byte_;
   }

   @Override
   public boolean class_(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10) {
      return this.break_.get().class_(var2, var4, var9, var5);
   }

   public rfH_2 class_(rrPt_1 var1, rqd_3 var2) {
      return rfH_2.protected_;
   }

   @Override
   public rfi_3 class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3) {
      rfH_2 var4 = this.class_(var1, var3);
      return new rfi_3(var2.b_(), var2.c_(), var2.d_(), var2.b_() + var4.b_(), var2.c_() + var4.c_(), var2.d_() + var4.d_());
   }

   @Override
   public List<rrPp_1> class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4) {
      ArrayList var5 = Lists.newArrayList();
      var5.add(new rrPp_1(var2, xu_3.JE.continue_().class_(kW_2.volatile_, rec_3.class_(rpr_3.DOWN, rpr_3.SOUTH)), this.protected_));
      return var5;
   }

   private rcd_3 case_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("name", "minecraft:bottom");
      var1.class_("final_state", "minecraft:air");
      var1.class_("pool", "minecraft:empty");
      var1.class_("target", "minecraft:empty");
      var1.class_("joint", rHV.ROLLABLE.class_());
      return var1;
   }
}
