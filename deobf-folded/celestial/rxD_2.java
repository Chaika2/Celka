package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class rxD_2 {
   private int id_class;
   private float id_break;
   private boolean id_byte;
   private boolean id_protected;
   private boolean id_throws;
   private boolean id_case;
   private final List<Pair<rLY, Float>> id_catch = Lists.newArrayList();

   public rxD_2 id_byte() {
      this.id_throws = true;
      return this;
   }

   public rxD_2 id_class() {
      this.id_byte = true;
      return this;
   }

   public rxD_2 id_class(rLY var1, float var2) {
      this.id_catch.add(Pair.of(var1, var2));
      return this;
   }

   public rxD_2 id_class(int var1) {
      this.id_class = var1;
      return this;
   }

   public rxD_2 id_class(float var1) {
      this.id_break = var1;
      return this;
   }

   public rxD_2 id_break() {
      this.id_protected = true;
      return this;
   }

   public rxK_2 id_throws() {
      return new rxK_2(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
   }

   public rxD_2 id_protected() {
      this.id_case = true;
      return this;
   }
}
