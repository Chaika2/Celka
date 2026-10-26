package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Do_1 {
   private final Map<UX, rqO_2> id_class = Maps.newHashMap();
   private final Set<UX> id_break = Sets.newHashSet();

   public static Do_1 id_byte(xd_3 var0, xd_3 var1) {
      return new Do_1()
         .id_class(UX.id_byte, id_class(var0, "_front"))
         .id_class(UX.id_package, id_throw(var1))
         .id_class(UX.id_final, id_class(var0, "_top"))
         .id_class(UX.id_finally, id_class(var0, "_front"))
         .id_class(UX.id_native, id_class(var0, "_side"))
         .id_class(UX.id_extends, id_class(var0, "_side"))
         .id_class(UX.id_volatile, id_class(var0, "_front"));
   }

   public static Do_1 id_byte(UX var0, rqO_2 var1) {
      return new Do_1().id_class(var0, var1);
   }

   public static rqO_2 id_byte(rdb_3 var0) {
      rqO_2 var1 = rVL.id_for.id_break(var0);
      return new rqO_2(var1.id_byte(), "item/" + var1.id_break());
   }

   public static Do_1 id_byte(rqO_2 var0) {
      return id_byte(UX.id_int, var0);
   }

   public static Do_1 id_byte(xd_3 var0) {
      return id_byte(UX.id_int, id_throw(var0));
   }

   public static Do_1 id_int(xd_3 var0) {
      return new Do_1().id_class(UX.id_case, id_class(var0, "_top")).id_class(UX.id_throws, id_class(var0, "_bottom"));
   }

   public static Do_1 id_this(xd_3 var0) {
      return new Do_1().id_class(UX.id_interface, id_throw(var0));
   }

   public static rqO_2 id_class(xd_3 var0, String var1) {
      rqO_2 var2 = rVL.id_strictfp.id_break(var0);
      return new rqO_2(var2.id_byte(), "block/" + var2.id_break() + var1);
   }

   public static rqO_2 id_class(rdb_3 var0, String var1) {
      rqO_2 var2 = rVL.id_for.id_break(var0);
      return new rqO_2(var2.id_byte(), "item/" + var2.id_break() + var1);
   }

   public static Do_1 id_class(xd_3 var0, xd_3 var1) {
      return new Do_1().id_class(UX.id_goto, id_throw(var0)).id_class(UX.id_while, id_throw(var1));
   }

   public static Do_1 id_class(rdb_3 var0) {
      return new Do_1().id_class(UX.id_byte, id_byte(var0));
   }

   public static Do_1 id_class(rqO_2 var0, rqO_2 var1) {
      return new Do_1().id_class(UX.id_implements, var0).id_class(UX.id_protected, var1);
   }

   public static Do_1 id_class(rqO_2 var0) {
      return new Do_1().id_class(UX.id_break, var0);
   }

   public Stream<UX> id_class() {
      return this.id_break.stream();
   }

   public Do_1 id_class(UX var1, UX var2) {
      this.id_class.put(var2, this.id_class.get(var1));
      this.id_break.add(var2);
      return this;
   }

   public rqO_2 id_class(UX var1) {
      for (UX var2 = var1; var2 != null; var2 = var2.id_break()) {
         rqO_2 var3 = this.id_class.get(var2);
         if (var3 != null) {
            return var3;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + var1);
   }

   public Do_1 id_class(UX var1, rqO_2 var2) {
      this.id_class.put(var1, var2);
      return this;
   }

   public static Do_1 id_class(xd_3 var0) {
      rqO_2 var1 = id_throw(var0);
      return id_break(var1);
   }

   public static Do_1 id_break(rqO_2 var0) {
      return new Do_1().id_class(UX.id_class, var0);
   }

   public static Do_1 id_break(xd_3 var0, xd_3 var1) {
      return new Do_1().id_class(UX.id_synchronized, id_throw(var0)).id_class(UX.id_return, id_class(var1, "_top"));
   }

   public Do_1 id_break(UX var1, rqO_2 var2) {
      Do_1 var3 = new Do_1();
      var3.id_class.putAll(this.id_class);
      var3.id_break.addAll(this.id_break);
      var3.id_class(var1, var2);
      return var3;
   }

   public static Do_1 id_break(xd_3 var0) {
      rqO_2 var1 = id_throw(var0);
      return id_class(var1);
   }

   public static Do_1 id_break(rdb_3 var0) {
      return new Do_1().id_class(UX.id_float, id_byte(var0));
   }

   public static Do_1 id_throws(xd_3 var0) {
      return id_byte(UX.id_super, id_throw(var0));
   }

   public static Do_1 id_throws(rqO_2 var0) {
      return id_byte(UX.id_super, var0);
   }

   public static Do_1 id_finally(xd_3 var0) {
      return new Do_1().id_class(UX.id_implements, id_class(var0, "_side")).id_class(UX.id_protected, id_class(var0, "_top"));
   }

   public static Do_1 id_catch(rqO_2 var0) {
      return new Do_1().id_class(UX.id_byte, var0);
   }

   public static Do_1 id_catch(xd_3 var0) {
      return id_byte(UX.id_goto, id_throw(var0));
   }

   public static Do_1 id_extends(xd_3 var0) {
      return new Do_1().id_class(UX.id_implements, id_class(var0, "_side")).id_class(UX.id_case, id_class(var0, "_top"));
   }

   public static Do_1 id_goto(xd_3 var0) {
      return new Do_1()
         .id_class(UX.id_implements, id_class(var0, "_side"))
         .id_class(UX.id_catch, id_class(var0, "_front"))
         .id_class(UX.id_protected, id_class(var0, "_end"));
   }

   public static Do_1 id_case(rqO_2 var0) {
      return id_byte(UX.id_try, var0);
   }

   public static Do_1 id_case(xd_3 var0) {
      return id_byte(UX.id_this, id_throw(var0));
   }

   public static Do_1 id_continue(xd_3 var0) {
      return new Do_1().id_class(UX.id_throw, id_class(var0, "_0"));
   }

   public static Do_1 id_else(xd_3 var0) {
      return new Do_1().id_class(UX.id_long, id_throw(var0));
   }

   public static Do_1 id_implements(xd_3 var0) {
      return id_byte(UX.id_public, id_throw(var0));
   }

   public static Do_1 id_implements(rqO_2 var0) {
      return new Do_1().id_class(UX.id_float, var0);
   }

   public static Do_1 id_instanceof(xd_3 var0) {
      return new Do_1().id_class(UX.id_float, id_throw(var0));
   }

   public static Do_1 id_new(xd_3 var0) {
      return new Do_1().id_class(UX.id_byte, id_throw(var0));
   }

   public static Do_1 id_package(xd_3 var0) {
      rqO_2 var1 = id_throw(var0);
      return new Do_1().id_class(UX.id_continue, var1).id_class(UX.id_implements, var1).id_class(UX.id_protected, id_class(var0, "_top"));
   }

   public static Do_1 id_return(xd_3 var0) {
      return new Do_1()
         .id_class(UX.id_implements, id_class(var0, "_side"))
         .id_class(UX.id_catch, id_class(var0, "_front"))
         .id_class(UX.id_case, id_class(var0, "_top"))
         .id_class(UX.id_throws, id_class(var0, "_bottom"));
   }

   public static Do_1 id_super(xd_3 var0) {
      return new Do_1().id_class(UX.id_throw, id_class(var0, "_1"));
   }

   public static rqO_2 id_throw(xd_3 var0) {
      rqO_2 var1 = rVL.id_strictfp.id_break(var0);
      return new rqO_2(var1.id_byte(), "block/" + var1.id_break());
   }

   public static Do_1 id_try(xd_3 var0) {
      return new Do_1().id_class(UX.id_void, id_class(var0, "_log_lit")).id_class(UX.id_throw, id_class(var0, "_fire"));
   }

   public static Do_1 id_while(xd_3 var0) {
      return new Do_1().id_class(UX.id_case, id_class(var0, "_top"));
   }

   public static Do_1 id_public(xd_3 var0) {
      return new Do_1()
         .id_class(UX.id_implements, id_class(var0, "_side"))
         .id_class(UX.id_catch, id_class(var0, "_front"))
         .id_class(UX.id_case, id_class(var0, "_top"));
   }

   public static Do_1 id_protected(rqO_2 var0) {
      return id_byte(UX.id_new, var0);
   }

   public static Do_1 id_protected(xd_3 var0) {
      return id_byte(UX.id_new, id_throw(var0));
   }

   public static Do_1 id_protected(xd_3 var0, xd_3 var1) {
      return new Do_1()
         .id_class(UX.id_byte, id_class(var0, "_front"))
         .id_class(UX.id_package, id_throw(var1))
         .id_class(UX.id_final, id_class(var0, "_top"))
         .id_class(UX.id_finally, id_class(var0, "_front"))
         .id_class(UX.id_extends, id_class(var0, "_front"))
         .id_class(UX.id_native, id_class(var0, "_side"))
         .id_class(UX.id_volatile, id_class(var0, "_side"));
   }

   public static Do_1 id_private(xd_3 var0) {
      return id_byte(UX.id_else, id_throw(var0));
   }

   public static Do_1 id_private(rqO_2 var0) {
      return new Do_1().id_class(UX.id_long, var0);
   }

   public static Do_1 id_final(xd_3 var0) {
      rqO_2 var1 = id_throw(var0);
      return new Do_1()
         .id_class(UX.id_continue, var1)
         .id_class(UX.id_implements, var1)
         .id_class(UX.id_case, id_class(var0, "_top"))
         .id_class(UX.id_throws, id_class(var0, "_bottom"));
   }

   public static Do_1 id_volatile(xd_3 var0) {
      return new Do_1()
         .id_class(UX.id_implements, id_class(var0, "_side"))
         .id_class(UX.id_case, id_class(var0, "_top"))
         .id_class(UX.id_throws, id_class(var0, "_bottom"));
   }

   public static Do_1 id_synchronized(xd_3 var0) {
      return new Do_1()
         .id_class(UX.id_implements, id_class(var0, "_side"))
         .id_class(UX.id_catch, id_class(var0, "_front"))
         .id_class(UX.id_private, id_class(var0, "_back"));
   }

   public static Do_1 id_native(xd_3 var0) {
      return new Do_1().id_class(UX.id_implements, id_throw(var0)).id_class(UX.id_protected, id_class(var0, "_top"));
   }
}
