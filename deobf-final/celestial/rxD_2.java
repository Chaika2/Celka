package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class rxD_2 {
   private int class_;
   private float break_;
   private boolean byte_;
   private boolean protected_;
   private boolean throws_;
   private boolean case_;
   private final List<Pair<rLY, Float>> catch_ = Lists.newArrayList();

   public rxD_2 byte_() {
      this.throws_ = true;
      return this;
   }

   public rxD_2 class_() {
      this.byte_ = true;
      return this;
   }

   public rxD_2 class_(rLY var1, float var2) {
      this.catch_.add(Pair.of(var1, var2));
      return this;
   }

   public rxD_2 class_(int var1) {
      this.class_ = var1;
      return this;
   }

   public rxD_2 class_(float var1) {
      this.break_ = var1;
      return this;
   }

   public rxD_2 break_() {
      this.protected_ = true;
      return this;
   }

   public rxK_2 throws_() {
      return new rxK_2(this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_);
   }

   public rxD_2 protected_() {
      this.case_ = true;
      return this;
   }
}
