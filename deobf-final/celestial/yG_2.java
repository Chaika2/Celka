package celestial;

import java.util.Collection;

public class yG_2 extends RuntimeException {
   private final Collection<fV_2> class_;

   public yG_2(fV_2 var1, Collection<fV_2> var2) {
      super(String.format("Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", var1.class_(), var1.break_(), var1.byte_()));
      this.class_ = var2;
   }

   public yG_2(fV_2 var1, Collection<fV_2> var2, int var3, int var4, int var5, int var6) {
      super(
         String.format(
            "Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?",
            var1.class_() + "",
            var1.break_(),
            var1.byte_(),
            var3,
            var4,
            var5,
            var6
         )
      );
      this.class_ = var2;
   }

   public Collection<fV_2> class_() {
      return this.class_;
   }
}
