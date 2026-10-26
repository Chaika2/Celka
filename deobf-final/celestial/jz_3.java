package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class jz_3 {
   public final Map<ryW_2<?>, jW_2<?>> class_ = Maps.newHashMap();
   public static final jz_3 break_ = new jz_3();
   private final lD_2 private_ = new lD_2(256);
   private cm_3 implements_;
   public fY_2 byte_;
   public rYB protected_;
   public ly_3 throws_;
   public rjG_2 case_;
   public static ryO_2 catch_;

   private jz_3() {
      this.break_(ryW_2.private_, new jX_2(this));
      this.break_(ryW_2.implements_, new jM_2(this));
      this.break_(ryW_2.finally_, new jO_2(this));
      this.break_(ryW_2.break_, new jr_3<>(this));
      this.break_(ryW_2.protected_, new jr_3<>(this));
      this.break_(ryW_2.byte_, new jr_3<>(this));
      this.break_(ryW_2.native_, new jS_2(this));
      this.break_(ryW_2.throw_, new jb_3(this));
      this.break_(ryW_2.volatile_, new jE_2<>(this));
      this.break_(ryW_2.else_, new js_3(this));
      this.break_(ryW_2.final_, new fU_2(this));
      this.break_(ryW_2.package_, new jx_3(this));
      this.break_(ryW_2.super_, new fD_2(this));
      this.break_(ryW_2.this_, new jd_3(this));
      this.break_(ryW_2.return_, new jh_3(new wv_3(), this));
      this.break_(ryW_2.public_, new fe_3(this));
      this.break_(ryW_2.goto_, new jP_2(this));
      this.break_(ryW_2.interface_, new fa_3(this));
      this.break_(ryW_2.abstract_, new fi_3(this));
   }

   public void class_(rYB var1) {
      this.protected_ = var1;
      if (var1 == null) {
         this.throws_ = null;
      }
   }

   public cm_3 class_() {
      return this.implements_;
   }

   public jW_2 class_(ryW_2 var1) {
      return this.class_.get(var1);
   }

   public synchronized <T extends ryO_2> void class_(ryW_2<T> var1, jW_2<? super T> var2) {
      this.class_.put(var1, var2);
   }

   private static void class_(ryO_2 var0, Runnable var1) {
      try {
         var1.run();
      } catch (Throwable var5) {
         KY var3 = KY.class_(var5, "Rendering Block Entity");
         Ko_1 var4 = var3.class_("Block Entity Details");
         var0.class_(var4);
         throw new KU(var3);
      }
   }

   public void class_(rYB var1, fY_2 var2, cm_3 var3, ly_3 var4, rjG_2 var5) {
      if (this.protected_ != var1) {
         this.class_(var1);
      }

      this.byte_ = var2;
      this.throws_ = var4;
      this.implements_ = var3;
      this.case_ = var5;
   }

   public <E extends ryO_2> jW_2<E> class_(E var1) {
      return (jW_2<E>)this.class_.get(var1.void_());
   }

   private static <T extends ryO_2> void class_(jW_2<T> var0, T var1, float var2, Ml_1 var3, Hx_1 var4) {
      rYB var5 = var1.while_();
      int var6;
      if (var5 != null) {
         var6 = yX_2.class_(var5, var1.char_());
      } else {
         var6 = 15728880;
      }

      catch_ = var1;
      if (rrbY_2.class_()) {
         rrbY_2.byte_();
      }

      var0.class_(var1, var2, var3, var4, var6, fZ_2.class_);
      if (rrbY_2.class_()) {
         if (rrbY_2.protected_()) {
            rrbY_2.throws_();
            var0.class_(var1, var2, var3, var4, HQ.class_, fZ_2.class_);
            rrbY_2.catch_();
         }

         rrbY_2.private_();
      }

      catch_ = null;
   }

   public <E extends ryO_2> boolean class_(E var1, Ml_1 var2, Hx_1 var3, int var4, int var5) {
      jW_2 var6 = this.class_(var1);
      if (var6 == null) {
         return true;
      } else {
         class_(var1, () -> {
            catch_ = var1;
            var6.class_(var1, 0.0F, var2, var3, var4, var5);
            catch_ = null;
         });
         return false;
      }
   }

   public <E extends ryO_2> void class_(E var1, float var2, Ml_1 var3, Hx_1 var4) {
      if (rjU_2.class_((rja_3)var1.char_()).class_(this.throws_.break_(), var1.implements_())) {
         jW_2 var5 = this.class_(var1);
         if (var5 != null && var1.interface_() && var1.void_().class_(var1.abstract_().break_())) {
            class_(var1, () -> class_(var5, var1, var2, var3, var4));
         }
      }
   }

   private <E extends ryO_2> void break_(ryW_2<E> var1, jW_2<E> var2) {
      this.class_.put(var1, var2);
   }
}
