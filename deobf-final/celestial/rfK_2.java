package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class rfK_2 {
   public static final Codec<rfK_2> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rYB.break_.fieldOf("dimension").forGetter(rfK_2::class_), rfH_2.byte_.fieldOf("pos").forGetter(rfK_2::break_))
            .apply(var0, rfK_2::class_)
   );
   private final rqM_2<rYB> break_;
   private final rfH_2 byte_;

   private rfK_2(rqM_2<rYB> var1, rfH_2 var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rfK_2 var2 = (rfK_2)var1;
         return Objects.equals(this.break_, var2.break_) && Objects.equals(this.byte_, var2.byte_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.break_.toString() + " " + this.byte_;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.break_, this.byte_);
   }

   public rqM_2<rYB> class_() {
      return this.break_;
   }

   public static rfK_2 class_(rqM_2<rYB> var0, rfH_2 var1) {
      return new rfK_2(var0, var1);
   }

   public rfH_2 break_() {
      return this.byte_;
   }
}
