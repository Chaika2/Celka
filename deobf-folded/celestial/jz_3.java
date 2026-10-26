package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class jz_3 {
   public final Map<ryW_2<?>, jW_2<?>> id_class = Maps.newHashMap();
   public static final jz_3 id_break = new jz_3();
   private final lD_2 id_private = new lD_2(256);
   private cm_3 id_implements;
   public fY_2 id_byte;
   public rYB id_protected;
   public ly_3 id_throws;
   public rjG_2 id_case;
   public static ryO_2 id_catch;

   private jz_3() {
      this.id_break(ryW_2.id_private, new jX_2(this));
      this.id_break(ryW_2.id_implements, new jM_2(this));
      this.id_break(ryW_2.id_finally, new jO_2(this));
      this.id_break(ryW_2.id_break, new jr_3<>(this));
      this.id_break(ryW_2.id_protected, new jr_3<>(this));
      this.id_break(ryW_2.id_byte, new jr_3<>(this));
      this.id_break(ryW_2.id_native, new jS_2(this));
      this.id_break(ryW_2.id_throw, new jb_3(this));
      this.id_break(ryW_2.id_volatile, new jE_2<>(this));
      this.id_break(ryW_2.id_else, new js_3(this));
      this.id_break(ryW_2.id_final, new fU_2(this));
      this.id_break(ryW_2.id_package, new jx_3(this));
      this.id_break(ryW_2.id_super, new fD_2(this));
      this.id_break(ryW_2.id_this, new jd_3(this));
      this.id_break(ryW_2.id_return, new jh_3(new wv_3(), this));
      this.id_break(ryW_2.id_public, new fe_3(this));
      this.id_break(ryW_2.id_goto, new jP_2(this));
      this.id_break(ryW_2.id_interface, new fa_3(this));
      this.id_break(ryW_2.id_abstract, new fi_3(this));
   }

   public void id_class(rYB var1) {
      this.id_protected = var1;
      if (var1 == null) {
         this.id_throws = null;
      }
   }

   public cm_3 id_class() {
      return this.id_implements;
   }

   public jW_2 id_class(ryW_2 var1) {
      return this.id_class.get(var1);
   }

   public synchronized <T extends ryO_2> void id_class(ryW_2<T> var1, jW_2<? super T> var2) {
      this.id_class.put(var1, var2);
   }

   private static void id_class(ryO_2 var0, Runnable var1) {
      try {
         var1.run();
      } catch (Throwable var5) {
         KY var3 = KY.id_class(var5, "Rendering Block Entity");
         Ko_1 var4 = var3.id_class("Block Entity Details");
         var0.id_class(var4);
         throw new KU(var3);
      }
   }

   public void id_class(rYB var1, fY_2 var2, cm_3 var3, ly_3 var4, rjG_2 var5) {
      if (this.id_protected != var1) {
         this.id_class(var1);
      }

      this.id_byte = var2;
      this.id_throws = var4;
      this.id_implements = var3;
      this.id_case = var5;
   }

   public <E extends ryO_2> jW_2<E> id_class(E var1) {
      return (jW_2<E>)this.id_class.get(var1.id_void());
   }

   private static <T extends ryO_2> void id_class(jW_2<T> var0, T var1, float var2, Ml_1 var3, Hx_1 var4) {
      rYB var5 = var1.id_while();
      int var6;
      if (var5 != null) {
         var6 = yX_2.id_class(var5, var1.id_char());
      } else {
         var6 = 15728880;
      }

      id_catch = var1;
      if (rrbY_2.id_class()) {
         rrbY_2.id_byte();
      }

      var0.id_class(var1, var2, var3, var4, var6, fZ_2.id_class);
      if (rrbY_2.id_class()) {
         if (rrbY_2.id_protected()) {
            rrbY_2.id_throws();
            var0.id_class(var1, var2, var3, var4, HQ.id_class, fZ_2.id_class);
            rrbY_2.id_catch();
         }

         rrbY_2.id_private();
      }

      id_catch = null;
   }

   public <E extends ryO_2> boolean id_class(E var1, Ml_1 var2, Hx_1 var3, int var4, int var5) {
      jW_2 var6 = this.id_class(var1);
      if (var6 == null) {
         return true;
      } else {
         id_class(var1, () -> {
            id_catch = var1;
            var6.id_class(var1, 0.0F, var2, var3, var4, var5);
            id_catch = null;
         });
         return false;
      }
   }

   public <E extends ryO_2> void id_class(E var1, float var2, Ml_1 var3, Hx_1 var4) {
      if (rjU_2.id_class((rja_3)var1.id_char()).id_class(this.id_throws.id_break(), var1.id_implements())) {
         jW_2 var5 = this.id_class(var1);
         if (var5 != null && var1.id_interface() && var1.id_void().id_class(var1.id_abstract().id_break())) {
            id_class(var1, () -> id_class(var5, var1, var2, var3, var4));
         }
      }
   }

   private <E extends ryO_2> void id_break(ryW_2<E> var1, jW_2<E> var2) {
      this.id_class.put(var1, var2);
   }
}
