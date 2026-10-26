package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Random;

public class rrPv_1 {
   public static final Codec<rrPv_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rrPL.id_byte.fieldOf("input_predicate").forGetter(var0x -> var0x.id_break),
               rrPL.id_byte.fieldOf("location_predicate").forGetter(var0x -> var0x.id_byte),
               rrPc_1.id_byte.optionalFieldOf("position_predicate", rrPS.id_break).forGetter(var0x -> var0x.id_protected),
               xc_3.id_break.fieldOf("output_state").forGetter(var0x -> var0x.id_throws),
               rcd_3.id_class.optionalFieldOf("output_nbt").forGetter(var0x -> Optional.ofNullable(var0x.id_case))
            )
            .apply(var0, rrPv_1::new)
   );
   private final rrPL id_break;
   private final rrPL id_byte;
   private final rrPc_1 id_protected;
   private final xc_3 id_throws;
   private final rcd_3 id_case;

   public rrPv_1(rrPL var1, rrPL var2, rrPc_1 var3, xc_3 var4, Optional<rcd_3> var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = (rcd_3)var5.orElse((rcd_3)null);
   }

   public rrPv_1(rrPL var1, rrPL var2, rrPc_1 var3, xc_3 var4) {
      this(var1, var2, var3, var4, Optional.empty());
   }

   public rrPv_1(rrPL var1, rrPL var2, xc_3 var3) {
      this(var1, var2, rrPS.id_break, var3, Optional.empty());
   }

   public xc_3 id_class() {
      return this.id_throws;
   }

   public boolean id_class(xc_3 var1, xc_3 var2, rfH_2 var3, rfH_2 var4, rfH_2 var5, Random var6) {
      return this.id_break.id_class(var1, var6) && this.id_byte.id_class(var2, var6) && this.id_protected.id_class(var3, var4, var5, var6);
   }

   public rcd_3 id_break() {
      return this.id_case;
   }
}
