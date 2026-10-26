package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public class Qr_1 {
   private static final Set<Qr_1> implements_ = new ObjectArraySet();
   public static final Qr_1 class_ = class_(new Qr_1("oak"));
   public static final Qr_1 break_ = class_(new Qr_1("spruce"));
   public static final Qr_1 byte_ = class_(new Qr_1("birch"));
   public static final Qr_1 protected_ = class_(new Qr_1("acacia"));
   public static final Qr_1 throws_ = class_(new Qr_1("jungle"));
   public static final Qr_1 case_ = class_(new Qr_1("dark_oak"));
   public static final Qr_1 catch_ = class_(new Qr_1("crimson"));
   public static final Qr_1 private_ = class_(new Qr_1("warped"));
   private final String finally_;

   protected Qr_1(String var1) {
      this.finally_ = var1;
   }

   private static Qr_1 class_(Qr_1 var0) {
      implements_.add(var0);
      return var0;
   }

   public static Stream<Qr_1> class_() {
      return implements_.stream();
   }

   public String break_() {
      return this.finally_;
   }
}
