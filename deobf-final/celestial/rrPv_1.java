package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Random;

public class rrPv_1 {
   public static final Codec<rrPv_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrPL.byte_.fieldOf("input_predicate").forGetter(var0x -> var0x.break_),
               rrPL.byte_.fieldOf("location_predicate").forGetter(var0x -> var0x.byte_),
               rrPc_1.byte_.optionalFieldOf("position_predicate", rrPS.break_).forGetter(var0x -> var0x.protected_),
               xc_3.break_.fieldOf("output_state").forGetter(var0x -> var0x.throws_),
               rcd_3.class_.optionalFieldOf("output_nbt").forGetter(var0x -> Optional.ofNullable(var0x.case_))
            )
            .apply(var0, rrPv_1::new)
   );
   private final rrPL break_;
   private final rrPL byte_;
   private final rrPc_1 protected_;
   private final xc_3 throws_;
   private final rcd_3 case_;

   public rrPv_1(rrPL var1, rrPL var2, rrPc_1 var3, xc_3 var4, Optional<rcd_3> var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = (rcd_3)var5.orElse((rcd_3)null);
   }

   public rrPv_1(rrPL var1, rrPL var2, rrPc_1 var3, xc_3 var4) {
      this(var1, var2, var3, var4, Optional.empty());
   }

   public rrPv_1(rrPL var1, rrPL var2, xc_3 var3) {
      this(var1, var2, rrPS.break_, var3, Optional.empty());
   }

   public xc_3 class_() {
      return this.throws_;
   }

   public boolean class_(xc_3 var1, xc_3 var2, rfH_2 var3, rfH_2 var4, rfH_2 var5, Random var6) {
      return this.break_.class_(var1, var6) && this.byte_.class_(var2, var6) && this.protected_.class_(var3, var4, var5, var6);
   }

   public rcd_3 break_() {
      return this.case_;
   }
}
