package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rDv_1 implements rUv_1 {
   public static final Codec<rDv_1> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rKi_1.break_.fieldOf("trunk_provider").forGetter(var0x -> var0x.break_),
               rKi_1.break_.fieldOf("leaves_provider").forGetter(var0x -> var0x.byte_),
               rrPR.protected_.fieldOf("foliage_placer").forGetter(var0x -> var0x.case_),
               rrsN_2.class_.fieldOf("trunk_placer").forGetter(var0x -> var0x.catch_),
               rDQ.class_.fieldOf("minimum_size").forGetter(var0x -> var0x.private_),
               rrsk_3.byte_.listOf().fieldOf("decorators").forGetter(var0x -> var0x.protected_),
               Codec.INT.fieldOf("max_water_depth").orElse(0).forGetter(var0x -> var0x.implements_),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter(var0x -> var0x.finally_),
               rKv_1.field_236078_g_.fieldOf("heightmap").forGetter(var0x -> var0x.extends_)
            )
            .apply(var0, rDv_1::new)
   );
   public final rKi_1 break_;
   public final rKi_1 byte_;
   public final List<rrsk_3> protected_;
   public transient boolean throws_;
   public final rrPR case_;
   public final rrsN_2 catch_;
   public final rDQ private_;
   public final int implements_;
   public final boolean finally_;
   public final rKv_1 extends_;

   protected rDv_1(rKi_1 var1, rKi_1 var2, rrPR var3, rrsN_2 var4, rDQ var5, List<rrsk_3> var6, int var7, boolean var8, rKv_1 var9) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var6;
      this.case_ = var3;
      this.private_ = var5;
      this.catch_ = var4;
      this.implements_ = var7;
      this.finally_ = var8;
      this.extends_ = var9;
   }

   public void class_() {
      this.throws_ = true;
   }

   public rDv_1 class_(List<rrsk_3> var1) {
      return new rDv_1(this.break_, this.byte_, this.case_, this.catch_, this.private_, var1, this.implements_, this.finally_, this.extends_);
   }
}
