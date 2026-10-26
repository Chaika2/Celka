package celestial;

import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Uk_1 {
   public static final UW id_class = id_class(Do_1::id_class, Uh_1.id_byte);
   public static final UW id_break = id_class(Do_1::id_class, Uh_1.id_protected);
   public static final UW id_byte = id_class(Do_1::id_finally, Uh_1.id_throws);
   public static final UW id_protected = id_class(Do_1::id_finally, Uh_1.id_case);
   public static final UW id_throws = id_class(Do_1::id_volatile, Uh_1.id_private);
   public static final UW id_case = id_class(Do_1::id_extends, Uh_1.id_catch);
   public static final UW id_catch = id_class(Do_1::id_public, Uh_1.id_implements);
   public static final UW id_private = id_class(Do_1::id_return, Uh_1.id_finally);
   public static final UW id_implements = id_class(Do_1::id_case, Uh_1.G);
   public static final UW id_finally = id_class(Do_1::id_private, Uh_1.O);
   public static final UW id_extends = id_class(Do_1::id_implements, Uh_1.b);
   public static final UW id_native = id_class(Do_1::id_new, Uh_1.id_abstract);
   public static final UW id_volatile = id_class(Do_1::id_while, Uh_1.Q);
   public static final UW id_final = id_class(Do_1::id_class, Uh_1.id_void);
   public static final UW id_package = id_class(Do_1::id_this, Uh_1.C);
   public static final UW id_int = id_class(Do_1::id_this, Uh_1.l);
   public static final UW id_new = id_class(Do_1::id_break, Uh_1.t);
   public static final UW id_continue = id_class(Do_1::id_native, Uh_1.id_throws);
   public static final UW id_super = id_class(Do_1::id_native, Uh_1.id_case);
   public static final UW id_this = id_class(Do_1::id_final, Uh_1.id_private);
   public static final UW id_else = id_class(Do_1::id_package, Uh_1.id_throws);
   private final Do_1 id_synchronized;
   private final DD id_return;

   private Uk_1(Do_1 var1, DD var2) {
      this.id_synchronized = var1;
      this.id_return = var2;
   }

   public DD id_class() {
      return this.id_return;
   }

   public rqO_2 id_class(xd_3 var1, String var2, BiConsumer<rqO_2, Supplier<JsonElement>> var3) {
      return this.id_return.id_class(var1, var2, this.id_synchronized, var3);
   }

   public static Uk_1 id_class(rqO_2 var0) {
      return new Uk_1(Do_1.id_break(var0), Uh_1.id_byte);
   }

   private static UW id_class(Function<xd_3, Do_1> var0, DD var1) {
      return var2 -> new Uk_1((Do_1)var0.apply(var2), var1);
   }

   public Uk_1 id_class(Consumer<Do_1> var1) {
      var1.accept(this.id_synchronized);
      return this;
   }

   public rqO_2 id_class(xd_3 var1, BiConsumer<rqO_2, Supplier<JsonElement>> var2) {
      return this.id_return.id_class(var1, this.id_synchronized, var2);
   }

   public Do_1 id_break() {
      return this.id_synchronized;
   }
}
