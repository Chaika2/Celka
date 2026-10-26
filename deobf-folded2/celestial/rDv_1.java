package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rDv_1 implements rUv_1 {
   public static final Codec<rDv_1> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKi_1.id_break.fieldOf("trunk_provider").forGetter(var0x -> var0x.id_break),
               rKi_1.id_break.fieldOf("leaves_provider").forGetter(var0x -> var0x.id_byte),
               rrPR.id_protected.fieldOf("foliage_placer").forGetter(var0x -> var0x.id_case),
               rrsN_2.id_class.fieldOf("trunk_placer").forGetter(var0x -> var0x.id_catch),
               rDQ.id_class.fieldOf("minimum_size").forGetter(var0x -> var0x.id_private),
               rrsk_3.id_byte.listOf().fieldOf("decorators").forGetter(var0x -> var0x.id_protected),
               Codec.INT.fieldOf("max_water_depth").orElse(0).forGetter(var0x -> var0x.id_implements),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter(var0x -> var0x.id_finally),
               rKv_1.field_236078_g_.fieldOf("heightmap").forGetter(var0x -> var0x.id_extends)
            )
            .apply(var0, rDv_1::new)
   );
   public final rKi_1 id_break;
   public final rKi_1 id_byte;
   public final List<rrsk_3> id_protected;
   public transient boolean id_throws;
   public final rrPR id_case;
   public final rrsN_2 id_catch;
   public final rDQ id_private;
   public final int id_implements;
   public final boolean id_finally;
   public final rKv_1 id_extends;

   protected rDv_1(rKi_1 var1, rKi_1 var2, rrPR var3, rrsN_2 var4, rDQ var5, List<rrsk_3> var6, int var7, boolean var8, rKv_1 var9) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var6;
      this.id_case = var3;
      this.id_private = var5;
      this.id_catch = var4;
      this.id_implements = var7;
      this.id_finally = var8;
      this.id_extends = var9;
   }

   public void id_class() {
      this.id_throws = true;
   }

   public rDv_1 id_class(List<rrsk_3> var1) {
      return new rDv_1(this.id_break, this.id_byte, this.id_case, this.id_catch, this.id_private, var1, this.id_implements, this.id_finally, this.id_extends);
   }
}
