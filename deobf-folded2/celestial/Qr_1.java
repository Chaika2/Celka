package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;

public class Qr_1 {
   private static final Set<Qr_1> id_implements = new ObjectArraySet();
   public static final Qr_1 id_class = id_class(new Qr_1("oak"));
   public static final Qr_1 id_break = id_class(new Qr_1("spruce"));
   public static final Qr_1 id_byte = id_class(new Qr_1("birch"));
   public static final Qr_1 id_protected = id_class(new Qr_1("acacia"));
   public static final Qr_1 id_throws = id_class(new Qr_1("jungle"));
   public static final Qr_1 id_case = id_class(new Qr_1("dark_oak"));
   public static final Qr_1 id_catch = id_class(new Qr_1("crimson"));
   public static final Qr_1 id_private = id_class(new Qr_1("warped"));
   private final String id_finally;

   protected Qr_1(String var1) {
      this.id_finally = var1;
   }

   private static Qr_1 id_class(Qr_1 var0) {
      id_implements.add(var0);
      return var0;
   }

   public static Stream<Qr_1> id_class() {
      return id_implements.stream();
   }

   public String id_break() {
      return this.id_finally;
   }
}
