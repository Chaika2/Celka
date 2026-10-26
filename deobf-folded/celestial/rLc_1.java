package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class rLc_1 implements rLx_1 {
   public static final rLc_1 id_class = new rLc_1(1.0F, 0.0F, 0.0F, 1.0F);
   public static final Codec<rLc_1> id_break = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("r").forGetter(var0x -> var0x.id_protected),
               Codec.FLOAT.fieldOf("g").forGetter(var0x -> var0x.id_throws),
               Codec.FLOAT.fieldOf("b").forGetter(var0x -> var0x.id_case),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.id_catch)
            )
            .apply(var0, rLc_1::new)
   );
   public static final rLd_1<rLc_1> id_byte = new rLu_1();
   private final float id_protected;
   private final float id_throws;
   private final float id_case;
   private final float id_catch;

   @Override
   public String id_byte() {
      return String.format(
         Locale.ROOT, "%s %.2f %.2f %.2f %.2f", rVL.id_switch.id_break(this.id_protected()), this.id_protected, this.id_throws, this.id_case, this.id_catch
      );
   }

   public rLc_1(float var1, float var2, float var3, float var4) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
      this.id_catch = rfU_2.id_class(var4, 0.01F, 4.0F);
   }

   @Override
   public void id_class(ruu_3 var1) {
      var1.writeFloat(this.id_protected);
      var1.writeFloat(this.id_throws);
      var1.writeFloat(this.id_case);
      var1.writeFloat(this.id_catch);
   }

   public float id_class() {
      return this.id_protected;
   }

   public float id_break() {
      return this.id_throws;
   }

   public float id_throws() {
      return this.id_case;
   }

   public float id_case() {
      return this.id_catch;
   }

   @Override
   public rLz_1<rLc_1> id_protected() {
      return rLQ.id_package;
   }
}
