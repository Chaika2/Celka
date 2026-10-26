package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rKN {
   public static final Codec<rKN> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(rKN::id_class),
               rVL.id_strictfp.fieldOf("block").orElse(xu_3.id_class).forGetter(var0x -> var0x.id_break().id_break())
            )
            .apply(var0, rKN::new)
   );
   private final xc_3 id_break;
   private final int id_byte;
   private int id_protected;

   public int id_byte() {
      return this.id_protected;
   }

   public rKN(int var1, xd_3 var2) {
      this.id_byte = var1;
      this.id_break = var2.id_continue();
   }

   @Override
   public String toString() {
      return (this.id_byte != 1 ? this.id_byte + "*" : "") + rVL.id_strictfp.id_break(this.id_break.id_break());
   }

   public void id_class(int var1) {
      this.id_protected = var1;
   }

   public int id_class() {
      return this.id_byte;
   }

   public xc_3 id_break() {
      return this.id_break;
   }
}
