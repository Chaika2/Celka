package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class rgU_2 {
   private final rfH_2 id_class;
   private final rRP id_break;
   private int id_byte;
   private final Runnable id_protected;

   public boolean id_byte() {
      return this.id_byte > 0;
   }

   public rgU_2(rfH_2 var1, rRP var2, Runnable var3) {
      this(var1, var2, var2.id_class(), var3);
   }

   private rgU_2(rfH_2 var1, rRP var2, int var3, Runnable var4) {
      this.id_class = var1.id_int();
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? Objects.equals(this.id_class, ((rgU_2)var1).id_class) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   protected boolean id_class() {
      if (this.id_byte <= 0) {
         return false;
      } else {
         this.id_byte--;
         this.id_protected.run();
         return true;
      }
   }

   public static Codec<rgU_2> id_class(Runnable var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
                  rfH_2.id_byte.fieldOf("pos").forGetter(var0xx -> var0xx.id_class),
                  rVL.x.fieldOf("type").forGetter(var0xx -> var0xx.id_break),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(var0xx -> var0xx.id_byte),
                  RecordCodecBuilder.point(var0)
               )
               .apply(var1, rgU_2::new)
      );
   }

   protected boolean id_break() {
      if (this.id_byte >= this.id_break.id_class()) {
         return false;
      } else {
         this.id_byte++;
         this.id_protected.run();
         return true;
      }
   }

   public rfH_2 id_throws() {
      return this.id_class;
   }

   public rRP id_case() {
      return this.id_break;
   }

   public boolean id_protected() {
      return this.id_byte != this.id_break.id_class();
   }
}
