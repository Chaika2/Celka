package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class rfK_2 {
   public static final Codec<rfK_2> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(rYB.id_break.fieldOf("dimension").forGetter(rfK_2::id_class), rfH_2.id_byte.fieldOf("pos").forGetter(rfK_2::id_break))
            .apply(var0, rfK_2::id_class)
   );
   private final rqM_2<rYB> id_break;
   private final rfH_2 id_byte;

   private rfK_2(rqM_2<rYB> var1, rfH_2 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rfK_2 var2 = (rfK_2)var1;
         return Objects.equals(this.id_break, var2.id_break) && Objects.equals(this.id_byte, var2.id_byte);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.id_break.toString() + " " + this.id_byte;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_break, this.id_byte);
   }

   public rqM_2<rYB> id_class() {
      return this.id_break;
   }

   public static rfK_2 id_class(rqM_2<rYB> var0, rfH_2 var1) {
      return new rfK_2(var0, var1);
   }

   public rfH_2 id_break() {
      return this.id_byte;
   }
}
