package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class rgU_2 {
   private final rfH_2 class_;
   private final rRP break_;
   private int byte_;
   private final Runnable protected_;

   public boolean byte_() {
      return this.byte_ > 0;
   }

   public rgU_2(rfH_2 var1, rRP var2, Runnable var3) {
      this(var1, var2, var2.class_(), var3);
   }

   private rgU_2(rfH_2 var1, rRP var2, int var3, Runnable var4) {
      this.class_ = var1.int_();
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? Objects.equals(this.class_, ((rgU_2)var1).class_) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   protected boolean class_() {
      if (this.byte_ <= 0) {
         return false;
      } else {
         this.byte_--;
         this.protected_.run();
         return true;
      }
   }

   public static Codec<rgU_2> class_(Runnable var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  rfH_2.byte_.fieldOf("pos").forGetter(var0xx -> var0xx.class_),
                  rVL.x.fieldOf("type").forGetter(var0xx -> var0xx.break_),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(var0xx -> var0xx.byte_),
                  RecordCodecBuilder.point(var0)
               )
               .apply(var1, rgU_2::new)
      );
   }

   protected boolean break_() {
      if (this.byte_ >= this.break_.class_()) {
         return false;
      } else {
         this.byte_++;
         this.protected_.run();
         return true;
      }
   }

   public rfH_2 throws_() {
      return this.class_;
   }

   public rRP case_() {
      return this.break_;
   }

   public boolean protected_() {
      return this.byte_ != this.break_.class_();
   }
}
