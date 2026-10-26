package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ryG_2 extends ryO_2 {
   private rqO_2 id_class;
   private String id_break = "";
   private String id_byte = "";
   private rfH_2 id_protected = new rfH_2(0, 1, 0);
   private rfH_2 id_throws = rfH_2.id_protected;
   private rpa_3 id_case = rpa_3.NONE;
   private rqd_3 id_catch = rqd_3.NONE;
   private rCD id_private = rCD.DATA;
   private boolean id_implements = true;
   private boolean id_finally;
   private boolean id_final;
   private boolean id_package = true;
   private float id_int = 1.0F;
   private long id_new;

   public void id_byte(boolean var1) {
      this.id_finally = var1;
   }

   public ryG_2() {
      super(ryW_2.id_this);
   }

   public long id_this() {
      return this.id_new;
   }

   public void id_class(rCD var1) {
      this.id_private = var1;
      xc_3 var2 = this.id_extends.id_byte(this.id_char());
      if (var2.id_class(xu_3.Js)) {
         this.id_extends.id_class(this.id_char(), var2.id_class(zx_3.id_volatile, var1), 2);
      }
   }

   public void id_class(float var1) {
      this.id_int = var1;
   }

   public void id_class(boolean var1) {
      this.id_implements = var1;
   }

   public void id_class(rpa_3 var1) {
      this.id_case = var1;
   }

   public void id_class(rqd_3 var1) {
      this.id_catch = var1;
   }

   private rfi_3 id_class(rfH_2 var1, List<ryG_2> var2) {
      rfi_3 var3;
      if (var2.size() > 1) {
         rfH_2 var4 = ((ryG_2)var2.get(0)).id_char();
         var3 = new rfi_3(var4, var4);
      } else {
         var3 = new rfi_3(var1, var1);
      }

      for (ryG_2 var5 : var2) {
         rfH_2 var6 = var5.id_char();
         if (var6.b_() < var3.id_class) {
            var3.id_class = var6.b_();
         } else if (var6.b_() > var3.id_protected) {
            var3.id_protected = var6.b_();
         }

         if (var6.c_() < var3.id_break) {
            var3.id_break = var6.c_();
         } else if (var6.c_() > var3.id_throws) {
            var3.id_throws = var6.c_();
         }

         if (var6.d_() < var3.id_byte) {
            var3.id_byte = var6.d_();
         } else if (var6.d_() > var3.id_case) {
            var3.id_case = var6.d_();
         }
      }

      return var3;
   }

   public boolean id_class(rrEm_1 var1) {
      return this.id_class(var1, true);
   }

   public boolean id_class(rrEm_1 var1, boolean var2) {
      if (this.id_private == rCD.LOAD && this.id_class != null) {
         rrPt_1 var3 = var1.O();

         rrPl_1 var4;
         try {
            var4 = var3.id_break(this.id_class);
         } catch (rqX_2 var6) {
            return false;
         }

         return var4 == null ? false : this.id_class(var1, var2, var4);
      } else {
         return false;
      }
   }

   public boolean id_class(rrEm_1 var1, boolean var2, rrPl_1 var3) {
      rfH_2 var4 = this.id_char();
      if (!rql_3.id_break(var3.id_break())) {
         this.id_break = var3.id_break();
      }

      rfH_2 var5 = var3.id_class();
      boolean var6 = this.id_throws.equals(var5);
      if (!var6) {
         this.id_throws = var5;
         this.id_break();
         xc_3 var7 = var1.id_byte(var4);
         var1.id_class(var4, var7, var7, 3);
      }

      if (var2 && !var6) {
         return false;
      } else {
         rrPN var9 = new rrPN().id_class(this.id_case).id_class(this.id_catch).id_class(this.id_implements).id_class((rfj_3)null);
         if (this.id_int < 1.0F) {
            var9.id_break().id_class(new rrPd_1(rfU_2.id_class(this.id_int, 0.0F, 1.0F))).id_class(id_break(this.id_new));
         }

         rfH_2 var8 = var4.id_break(this.id_protected);
         var3.id_class(var1, var8, var9, id_break(this.id_new));
         return true;
      }
   }

   private List<ryG_2> id_class(rfH_2 var1, rfH_2 var2) {
      ArrayList var3 = Lists.newArrayList();

      for (rfH_2 var5 : rfH_2.id_class(var1, var2)) {
         xc_3 var6 = this.id_extends.id_byte(var5);
         if (var6.id_class(xu_3.Js)) {
            ryO_2 var7 = this.id_extends.id_class(var5);
            if (var7 != null && var7 instanceof ryG_2) {
               var3.add((ryG_2)var7);
            }
         }
      }

      return var3;
   }

   private List<ryG_2> id_class(List<ryG_2> var1) {
      Predicate var2 = var1x -> var1x.id_private == rCD.CORNER && Objects.equals(this.id_class, var1x.id_class);
      return var1.stream().filter(var2).collect(Collectors.toList());
   }

   public void id_class(long var1) {
      this.id_new = var1;
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("name", this.id_throws());
      var1.id_class("author", this.id_break);
      var1.id_class("metadata", this.id_byte);
      var1.id_break("posX", this.id_protected.b_());
      var1.id_break("posY", this.id_protected.c_());
      var1.id_break("posZ", this.id_protected.d_());
      var1.id_break("sizeX", this.id_throws.b_());
      var1.id_break("sizeY", this.id_throws.c_());
      var1.id_break("sizeZ", this.id_throws.d_());
      var1.id_class("rotation", this.id_catch.toString());
      var1.id_class("mirror", this.id_case.toString());
      var1.id_class("mode", this.id_private.toString());
      var1.id_class("ignoreEntities", this.id_implements);
      var1.id_class("powered", this.id_finally);
      var1.id_class("showair", this.id_final);
      var1.id_class("showboundingbox", this.id_package);
      var1.id_class("integrity", this.id_int);
      var1.id_class("seed", this.id_new);
      return var1;
   }

   public void id_class(rqO_2 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class(var2.id_native("name"));
      this.id_break = var2.id_native("author");
      this.id_byte = var2.id_native("metadata");
      int var3 = rfU_2.id_class(var2.id_private("posX"), -48, 48);
      int var4 = rfU_2.id_class(var2.id_private("posY"), -48, 48);
      int var5 = rfU_2.id_class(var2.id_private("posZ"), -48, 48);
      this.id_protected = new rfH_2(var3, var4, var5);
      int var6 = rfU_2.id_class(var2.id_private("sizeX"), 0, 48);
      int var7 = rfU_2.id_class(var2.id_private("sizeY"), 0, 48);
      int var8 = rfU_2.id_class(var2.id_private("sizeZ"), 0, 48);
      this.id_throws = new rfH_2(var6, var7, var8);

      try {
         this.id_catch = rqd_3.valueOf(var2.id_native("rotation"));
      } catch (IllegalArgumentException var12) {
         this.id_catch = rqd_3.NONE;
      }

      try {
         this.id_case = rpa_3.valueOf(var2.id_native("mirror"));
      } catch (IllegalArgumentException var11) {
         this.id_case = rpa_3.NONE;
      }

      try {
         this.id_private = rCD.valueOf(var2.id_native("mode"));
      } catch (IllegalArgumentException var10) {
         this.id_private = rCD.DATA;
      }

      this.id_implements = var2.id_new("ignoreEntities");
      this.id_finally = var2.id_new("powered");
      this.id_final = var2.id_new("showair");
      this.id_package = var2.id_new("showboundingbox");
      if (var2.id_throws("integrity")) {
         this.id_int = var2.id_finally("integrity");
      } else {
         this.id_int = 1.0F;
      }

      this.id_new = var2.id_implements("seed");
      this.id_throw();
   }

   public void id_class(iB_2 var1) {
      this.id_break = var1.g().getString();
   }

   public boolean id_class(rhd_3 var1) {
      if (!var1.sU()) {
         return false;
      } else {
         if (var1.e().id_continue) {
            var1.id_class(this);
         }

         return true;
      }
   }

   public void id_class(String var1) {
      this.id_class(rql_3.id_break(var1) ? null : rqO_2.id_break(var1));
   }

   public void id_class(rfH_2 var1) {
      this.id_protected = var1;
   }

   public boolean id_break(boolean var1) {
      if (this.id_private == rCD.SAVE && !this.id_extends.id_continue && this.id_class != null) {
         rfH_2 var2 = this.id_char().id_break(this.id_protected);
         rrEm_1 var3 = (rrEm_1)this.id_extends;
         rrPt_1 var4 = var3.O();

         rrPl_1 var5;
         try {
            var5 = var4.id_class(this.id_class);
         } catch (rqX_2 var8) {
            return false;
         }

         var5.id_class(this.id_extends, var2, this.id_throws, !this.id_implements, xu_3.bo);
         var5.id_class(this.id_break);
         if (var1) {
            try {
               return var4.id_byte(this.id_class);
            } catch (rqX_2 var7) {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static Random id_break(long var0) {
      return var0 == 0L ? new Random(rqR_2.id_break()) : new Random(var0);
   }

   public void id_break(rfH_2 var1) {
      this.id_throws = var1;
   }

   public void id_break(String var1) {
      this.id_byte = var1;
   }

   public String id_throws() {
      return this.id_class == null ? "" : this.id_class.toString();
   }

   public void id_throws(boolean var1) {
      this.id_package = var1;
   }

   public rfH_2 id_finally() {
      return this.id_protected;
   }

   public String id_catch() {
      return this.id_class == null ? "" : this.id_class.id_break();
   }

   public rfH_2 id_extends() {
      return this.id_throws;
   }

   public boolean id_goto() {
      return this.id_finally;
   }

   public boolean id_continue() {
      return this.id_implements;
   }

   public boolean id_else() {
      if (this.id_private != rCD.SAVE) {
         return false;
      } else {
         rfH_2 var1 = this.id_char();
         byte var2 = 80;
         rfH_2 var3 = new rfH_2(var1.b_() - 80, 0, var1.d_() - 80);
         rfH_2 var4 = new rfH_2(var1.b_() + 80, 255, var1.d_() + 80);
         List var5 = this.id_class(var3, var4);
         List var6 = this.id_class(var5);
         if (var6.size() < 1) {
            return false;
         } else {
            rfi_3 var7 = this.id_class(var1, var6);
            if (var7.id_protected - var7.id_class > 1 && var7.id_throws - var7.id_break > 1 && var7.id_case - var7.id_byte > 1) {
               this.id_protected = new rfH_2(var7.id_class - var1.b_() + 1, var7.id_break - var1.c_() + 1, var7.id_byte - var1.d_() + 1);
               this.id_throws = new rfH_2(var7.id_protected - var7.id_class - 1, var7.id_throws - var7.id_break - 1, var7.id_case - var7.id_byte - 1);
               this.id_break();
               xc_3 var8 = this.id_extends.id_byte(var1);
               this.id_extends.id_class(var1, var8, var8, 3);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public double id_implements() {
      return 96.0;
   }

   public boolean id_instanceof() {
      return this.id_package;
   }

   public void id_new() {
      switch (this.id_package()) {
         case SAVE:
            this.id_class(rCD.LOAD);
            break;
         case LOAD:
            this.id_class(rCD.CORNER);
            break;
         case CORNER:
            this.id_class(rCD.DATA);
            break;
         case DATA:
            this.id_class(rCD.SAVE);
      }
   }

   public rCD id_package() {
      return this.id_private;
   }

   public void id_return() {
      if (this.id_class != null) {
         rrEm_1 var1 = (rrEm_1)this.id_extends;
         rrPt_1 var2 = var1.O();
         var2.id_protected(this.id_class);
      }
   }

   public float id_super() {
      return this.id_int;
   }

   private void id_throw() {
      if (this.id_extends != null) {
         rfH_2 var1 = this.id_char();
         xc_3 var2 = this.id_extends.id_byte(var1);
         if (var2.id_class(xu_3.Js)) {
            this.id_extends.id_class(var1, var2.id_class(zx_3.id_volatile, this.id_private), 2);
         }
      }
   }

   public boolean id_try() {
      return this.id_final;
   }

   public boolean id_public() {
      if (this.id_private == rCD.LOAD && !this.id_extends.id_continue && this.id_class != null) {
         rrEm_1 var1 = (rrEm_1)this.id_extends;
         rrPt_1 var2 = var1.O();

         try {
            return var2.id_break(this.id_class) != null;
         } catch (rqX_2 var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public void id_protected(boolean var1) {
      this.id_final = var1;
   }

   public boolean id_private() {
      return this.id_class != null;
   }

   public String id_final() {
      return this.id_byte;
   }

   public rqd_3 id_volatile() {
      return this.id_catch;
   }

   public boolean id_synchronized() {
      return this.id_break(true);
   }

   public rpa_3 id_native() {
      return this.id_case;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 7, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
