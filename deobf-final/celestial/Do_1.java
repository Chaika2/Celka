package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Do_1 {
   private final Map<UX, rqO_2> class_ = Maps.newHashMap();
   private final Set<UX> break_ = Sets.newHashSet();

   public static Do_1 byte_(xd_3 var0, xd_3 var1) {
      return new Do_1()
         .class_(UX.byte_, class_(var0, "_front"))
         .class_(UX.package_, throw_(var1))
         .class_(UX.final_, class_(var0, "_top"))
         .class_(UX.finally_, class_(var0, "_front"))
         .class_(UX.native_, class_(var0, "_side"))
         .class_(UX.extends_, class_(var0, "_side"))
         .class_(UX.volatile_, class_(var0, "_front"));
   }

   public static Do_1 byte_(UX var0, rqO_2 var1) {
      return new Do_1().class_(var0, var1);
   }

   public static rqO_2 byte_(rdb_3 var0) {
      rqO_2 var1 = rVL.for_.break_(var0);
      return new rqO_2(var1.byte_(), "item/" + var1.break_());
   }

   public static Do_1 byte_(rqO_2 var0) {
      return byte_(UX.int_, var0);
   }

   public static Do_1 byte_(xd_3 var0) {
      return byte_(UX.int_, throw_(var0));
   }

   public static Do_1 int_(xd_3 var0) {
      return new Do_1().class_(UX.case_, class_(var0, "_top")).class_(UX.throws_, class_(var0, "_bottom"));
   }

   public static Do_1 this_(xd_3 var0) {
      return new Do_1().class_(UX.interface_, throw_(var0));
   }

   public static rqO_2 class_(xd_3 var0, String var1) {
      rqO_2 var2 = rVL.strictfp_.break_(var0);
      return new rqO_2(var2.byte_(), "block/" + var2.break_() + var1);
   }

   public static rqO_2 class_(rdb_3 var0, String var1) {
      rqO_2 var2 = rVL.for_.break_(var0);
      return new rqO_2(var2.byte_(), "item/" + var2.break_() + var1);
   }

   public static Do_1 class_(xd_3 var0, xd_3 var1) {
      return new Do_1().class_(UX.goto_, throw_(var0)).class_(UX.while_, throw_(var1));
   }

   public static Do_1 class_(rdb_3 var0) {
      return new Do_1().class_(UX.byte_, byte_(var0));
   }

   public static Do_1 class_(rqO_2 var0, rqO_2 var1) {
      return new Do_1().class_(UX.implements_, var0).class_(UX.protected_, var1);
   }

   public static Do_1 class_(rqO_2 var0) {
      return new Do_1().class_(UX.break_, var0);
   }

   public Stream<UX> class_() {
      return this.break_.stream();
   }

   public Do_1 class_(UX var1, UX var2) {
      this.class_.put(var2, this.class_.get(var1));
      this.break_.add(var2);
      return this;
   }

   public rqO_2 class_(UX var1) {
      for (UX var2 = var1; var2 != null; var2 = var2.break_()) {
         rqO_2 var3 = this.class_.get(var2);
         if (var3 != null) {
            return var3;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + var1);
   }

   public Do_1 class_(UX var1, rqO_2 var2) {
      this.class_.put(var1, var2);
      return this;
   }

   public static Do_1 class_(xd_3 var0) {
      rqO_2 var1 = throw_(var0);
      return break_(var1);
   }

   public static Do_1 break_(rqO_2 var0) {
      return new Do_1().class_(UX.class_, var0);
   }

   public static Do_1 break_(xd_3 var0, xd_3 var1) {
      return new Do_1().class_(UX.synchronized_, throw_(var0)).class_(UX.return_, class_(var1, "_top"));
   }

   public Do_1 break_(UX var1, rqO_2 var2) {
      Do_1 var3 = new Do_1();
      var3.class_.putAll(this.class_);
      var3.break_.addAll(this.break_);
      var3.class_(var1, var2);
      return var3;
   }

   public static Do_1 break_(xd_3 var0) {
      rqO_2 var1 = throw_(var0);
      return class_(var1);
   }

   public static Do_1 break_(rdb_3 var0) {
      return new Do_1().class_(UX.float_, byte_(var0));
   }

   public static Do_1 throws_(xd_3 var0) {
      return byte_(UX.super_, throw_(var0));
   }

   public static Do_1 throws_(rqO_2 var0) {
      return byte_(UX.super_, var0);
   }

   public static Do_1 finally_(xd_3 var0) {
      return new Do_1().class_(UX.implements_, class_(var0, "_side")).class_(UX.protected_, class_(var0, "_top"));
   }

   public static Do_1 catch_(rqO_2 var0) {
      return new Do_1().class_(UX.byte_, var0);
   }

   public static Do_1 catch_(xd_3 var0) {
      return byte_(UX.goto_, throw_(var0));
   }

   public static Do_1 extends_(xd_3 var0) {
      return new Do_1().class_(UX.implements_, class_(var0, "_side")).class_(UX.case_, class_(var0, "_top"));
   }

   public static Do_1 goto_(xd_3 var0) {
      return new Do_1().class_(UX.implements_, class_(var0, "_side")).class_(UX.catch_, class_(var0, "_front")).class_(UX.protected_, class_(var0, "_end"));
   }

   public static Do_1 case_(rqO_2 var0) {
      return byte_(UX.try_, var0);
   }

   public static Do_1 case_(xd_3 var0) {
      return byte_(UX.this_, throw_(var0));
   }

   public static Do_1 continue_(xd_3 var0) {
      return new Do_1().class_(UX.throw_, class_(var0, "_0"));
   }

   public static Do_1 else_(xd_3 var0) {
      return new Do_1().class_(UX.long_, throw_(var0));
   }

   public static Do_1 implements_(xd_3 var0) {
      return byte_(UX.public_, throw_(var0));
   }

   public static Do_1 implements_(rqO_2 var0) {
      return new Do_1().class_(UX.float_, var0);
   }

   public static Do_1 instanceof_(xd_3 var0) {
      return new Do_1().class_(UX.float_, throw_(var0));
   }

   public static Do_1 new_(xd_3 var0) {
      return new Do_1().class_(UX.byte_, throw_(var0));
   }

   public static Do_1 package_(xd_3 var0) {
      rqO_2 var1 = throw_(var0);
      return new Do_1().class_(UX.continue_, var1).class_(UX.implements_, var1).class_(UX.protected_, class_(var0, "_top"));
   }

   public static Do_1 return_(xd_3 var0) {
      return new Do_1()
         .class_(UX.implements_, class_(var0, "_side"))
         .class_(UX.catch_, class_(var0, "_front"))
         .class_(UX.case_, class_(var0, "_top"))
         .class_(UX.throws_, class_(var0, "_bottom"));
   }

   public static Do_1 super_(xd_3 var0) {
      return new Do_1().class_(UX.throw_, class_(var0, "_1"));
   }

   public static rqO_2 throw_(xd_3 var0) {
      rqO_2 var1 = rVL.strictfp_.break_(var0);
      return new rqO_2(var1.byte_(), "block/" + var1.break_());
   }

   public static Do_1 try_(xd_3 var0) {
      return new Do_1().class_(UX.void_, class_(var0, "_log_lit")).class_(UX.throw_, class_(var0, "_fire"));
   }

   public static Do_1 while_(xd_3 var0) {
      return new Do_1().class_(UX.case_, class_(var0, "_top"));
   }

   public static Do_1 public_(xd_3 var0) {
      return new Do_1().class_(UX.implements_, class_(var0, "_side")).class_(UX.catch_, class_(var0, "_front")).class_(UX.case_, class_(var0, "_top"));
   }

   public static Do_1 protected_(rqO_2 var0) {
      return byte_(UX.new_, var0);
   }

   public static Do_1 protected_(xd_3 var0) {
      return byte_(UX.new_, throw_(var0));
   }

   public static Do_1 protected_(xd_3 var0, xd_3 var1) {
      return new Do_1()
         .class_(UX.byte_, class_(var0, "_front"))
         .class_(UX.package_, throw_(var1))
         .class_(UX.final_, class_(var0, "_top"))
         .class_(UX.finally_, class_(var0, "_front"))
         .class_(UX.extends_, class_(var0, "_front"))
         .class_(UX.native_, class_(var0, "_side"))
         .class_(UX.volatile_, class_(var0, "_side"));
   }

   public static Do_1 private_(xd_3 var0) {
      return byte_(UX.else_, throw_(var0));
   }

   public static Do_1 private_(rqO_2 var0) {
      return new Do_1().class_(UX.long_, var0);
   }

   public static Do_1 final_(xd_3 var0) {
      rqO_2 var1 = throw_(var0);
      return new Do_1()
         .class_(UX.continue_, var1)
         .class_(UX.implements_, var1)
         .class_(UX.case_, class_(var0, "_top"))
         .class_(UX.throws_, class_(var0, "_bottom"));
   }

   public static Do_1 volatile_(xd_3 var0) {
      return new Do_1().class_(UX.implements_, class_(var0, "_side")).class_(UX.case_, class_(var0, "_top")).class_(UX.throws_, class_(var0, "_bottom"));
   }

   public static Do_1 synchronized_(xd_3 var0) {
      return new Do_1().class_(UX.implements_, class_(var0, "_side")).class_(UX.catch_, class_(var0, "_front")).class_(UX.private_, class_(var0, "_back"));
   }

   public static Do_1 native_(xd_3 var0) {
      return new Do_1().class_(UX.implements_, throw_(var0)).class_(UX.protected_, class_(var0, "_top"));
   }
}
