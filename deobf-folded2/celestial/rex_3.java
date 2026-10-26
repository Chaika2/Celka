package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class rex_3 extends rev_3 {
   public static final Codec<rex_3> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(rDg_1.id_break.fieldOf("feature").forGetter(var0x -> var0x.id_break), id_break()).apply(var0, rex_3::new)
   );
   private final Supplier<rDg_1<?, ?>> id_break;
   private final rcd_3 id_protected;

   protected rex_3(Supplier<rDg_1<?, ?>> var1, rem_3 var2) {
      super(var2);
      this.id_break = var1;
      this.id_protected = this.id_case();
   }

   @Override
   public String toString() {
      return "Feature[" + rVL.q.id_break(this.id_break.get().id_break()) + "]";
   }

   @Override
   public red_3<?> id_class() {
      return red_3.id_byte;
   }

   @Override
   public boolean id_class(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10) {
      return this.id_break.get().id_class(var2, var4, var9, var5);
   }

   public rfH_2 id_class(rrPt_1 var1, rqd_3 var2) {
      return rfH_2.id_protected;
   }

   @Override
   public rfi_3 id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3) {
      rfH_2 var4 = this.id_class(var1, var3);
      return new rfi_3(var2.b_(), var2.c_(), var2.d_(), var2.b_() + var4.b_(), var2.c_() + var4.c_(), var2.d_() + var4.d_());
   }

   @Override
   public List<rrPp_1> id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4) {
      ArrayList var5 = Lists.newArrayList();
      var5.add(new rrPp_1(var2, xu_3.JE.id_continue().id_class(kW_2.id_volatile, rec_3.id_class(rpr_3.DOWN, rpr_3.SOUTH)), this.id_protected));
      return var5;
   }

   private rcd_3 id_case() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("name", "minecraft:bottom");
      var1.id_class("final_state", "minecraft:air");
      var1.id_class("pool", "minecraft:empty");
      var1.id_class("target", "minecraft:empty");
      var1.id_class("joint", rHV.ROLLABLE.id_class());
      return var1;
   }
}
