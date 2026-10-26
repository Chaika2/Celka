package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ryG_2 extends ryO_2 {
   private rqO_2 class_;
   private String break_ = "";
   private String byte_ = "";
   private rfH_2 protected_ = new rfH_2(0, 1, 0);
   private rfH_2 throws_ = rfH_2.protected_;
   private rpa_3 case_ = rpa_3.NONE;
   private rqd_3 catch_ = rqd_3.NONE;
   private rCD private_ = rCD.DATA;
   private boolean implements_ = true;
   private boolean finally_;
   private boolean final_;
   private boolean package_ = true;
   private float int_ = 1.0F;
   private long new_;

   public void byte_(boolean var1) {
      this.finally_ = var1;
   }

   public ryG_2() {
      super(ryW_2.this_);
   }

   public long this_() {
      return this.new_;
   }

   public void class_(rCD var1) {
      this.private_ = var1;
      xc_3 var2 = this.extends_.byte_(this.char_());
      if (var2.class_(xu_3.Js)) {
         this.extends_.class_(this.char_(), var2.class_(zx_3.volatile_, var1), 2);
      }
   }

   public void class_(float var1) {
      this.int_ = var1;
   }

   public void class_(boolean var1) {
      this.implements_ = var1;
   }

   public void class_(rpa_3 var1) {
      this.case_ = var1;
   }

   public void class_(rqd_3 var1) {
      this.catch_ = var1;
   }

   private rfi_3 class_(rfH_2 var1, List<ryG_2> var2) {
      rfi_3 var3;
      if (var2.size() > 1) {
         rfH_2 var4 = ((ryG_2)var2.get(0)).char_();
         var3 = new rfi_3(var4, var4);
      } else {
         var3 = new rfi_3(var1, var1);
      }

      for (ryG_2 var5 : var2) {
         rfH_2 var6 = var5.char_();
         if (var6.b_() < var3.class_) {
            var3.class_ = var6.b_();
         } else if (var6.b_() > var3.protected_) {
            var3.protected_ = var6.b_();
         }

         if (var6.c_() < var3.break_) {
            var3.break_ = var6.c_();
         } else if (var6.c_() > var3.throws_) {
            var3.throws_ = var6.c_();
         }

         if (var6.d_() < var3.byte_) {
            var3.byte_ = var6.d_();
         } else if (var6.d_() > var3.case_) {
            var3.case_ = var6.d_();
         }
      }

      return var3;
   }

   public boolean class_(rrEm_1 var1) {
      return this.class_(var1, true);
   }

   public boolean class_(rrEm_1 var1, boolean var2) {
      if (this.private_ == rCD.LOAD && this.class_ != null) {
         rrPt_1 var3 = var1.O();

         rrPl_1 var4;
         try {
            var4 = var3.break_(this.class_);
         } catch (rqX_2 var6) {
            return false;
         }

         return var4 == null ? false : this.class_(var1, var2, var4);
      } else {
         return false;
      }
   }

   public boolean class_(rrEm_1 var1, boolean var2, rrPl_1 var3) {
      rfH_2 var4 = this.char_();
      if (!rql_3.break_(var3.break_())) {
         this.break_ = var3.break_();
      }

      rfH_2 var5 = var3.class_();
      boolean var6 = this.throws_.equals(var5);
      if (!var6) {
         this.throws_ = var5;
         this.break_();
         xc_3 var7 = var1.byte_(var4);
         var1.class_(var4, var7, var7, 3);
      }

      if (var2 && !var6) {
         return false;
      } else {
         rrPN var9 = new rrPN().class_(this.case_).class_(this.catch_).class_(this.implements_).class_((rfj_3)null);
         if (this.int_ < 1.0F) {
            var9.break_().class_(new rrPd_1(rfU_2.class_(this.int_, 0.0F, 1.0F))).class_(break_(this.new_));
         }

         rfH_2 var8 = var4.break_(this.protected_);
         var3.class_(var1, var8, var9, break_(this.new_));
         return true;
      }
   }

   private List<ryG_2> class_(rfH_2 var1, rfH_2 var2) {
      ArrayList var3 = Lists.newArrayList();

      for (rfH_2 var5 : rfH_2.class_(var1, var2)) {
         xc_3 var6 = this.extends_.byte_(var5);
         if (var6.class_(xu_3.Js)) {
            ryO_2 var7 = this.extends_.class_(var5);
            if (var7 != null && var7 instanceof ryG_2) {
               var3.add((ryG_2)var7);
            }
         }
      }

      return var3;
   }

   private List<ryG_2> class_(List<ryG_2> var1) {
      Predicate var2 = var1x -> var1x.private_ == rCD.CORNER && Objects.equals(this.class_, var1x.class_);
      return var1.stream().filter(var2).collect(Collectors.toList());
   }

   public void class_(long var1) {
      this.new_ = var1;
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("name", this.throws_());
      var1.class_("author", this.break_);
      var1.class_("metadata", this.byte_);
      var1.break_("posX", this.protected_.b_());
      var1.break_("posY", this.protected_.c_());
      var1.break_("posZ", this.protected_.d_());
      var1.break_("sizeX", this.throws_.b_());
      var1.break_("sizeY", this.throws_.c_());
      var1.break_("sizeZ", this.throws_.d_());
      var1.class_("rotation", this.catch_.toString());
      var1.class_("mirror", this.case_.toString());
      var1.class_("mode", this.private_.toString());
      var1.class_("ignoreEntities", this.implements_);
      var1.class_("powered", this.finally_);
      var1.class_("showair", this.final_);
      var1.class_("showboundingbox", this.package_);
      var1.class_("integrity", this.int_);
      var1.class_("seed", this.new_);
      return var1;
   }

   public void class_(rqO_2 var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.class_(var2.native_("name"));
      this.break_ = var2.native_("author");
      this.byte_ = var2.native_("metadata");
      int var3 = rfU_2.class_(var2.private_("posX"), -48, 48);
      int var4 = rfU_2.class_(var2.private_("posY"), -48, 48);
      int var5 = rfU_2.class_(var2.private_("posZ"), -48, 48);
      this.protected_ = new rfH_2(var3, var4, var5);
      int var6 = rfU_2.class_(var2.private_("sizeX"), 0, 48);
      int var7 = rfU_2.class_(var2.private_("sizeY"), 0, 48);
      int var8 = rfU_2.class_(var2.private_("sizeZ"), 0, 48);
      this.throws_ = new rfH_2(var6, var7, var8);

      try {
         this.catch_ = rqd_3.valueOf(var2.native_("rotation"));
      } catch (IllegalArgumentException var12) {
         this.catch_ = rqd_3.NONE;
      }

      try {
         this.case_ = rpa_3.valueOf(var2.native_("mirror"));
      } catch (IllegalArgumentException var11) {
         this.case_ = rpa_3.NONE;
      }

      try {
         this.private_ = rCD.valueOf(var2.native_("mode"));
      } catch (IllegalArgumentException var10) {
         this.private_ = rCD.DATA;
      }

      this.implements_ = var2.new_("ignoreEntities");
      this.finally_ = var2.new_("powered");
      this.final_ = var2.new_("showair");
      this.package_ = var2.new_("showboundingbox");
      if (var2.throws_("integrity")) {
         this.int_ = var2.finally_("integrity");
      } else {
         this.int_ = 1.0F;
      }

      this.new_ = var2.implements_("seed");
      this.throw_();
   }

   public void class_(iB_2 var1) {
      this.break_ = var1.g().getString();
   }

   public boolean class_(rhd_3 var1) {
      if (!var1.sU()) {
         return false;
      } else {
         if (var1.e().continue_) {
            var1.class_(this);
         }

         return true;
      }
   }

   public void class_(String var1) {
      this.class_(rql_3.break_(var1) ? null : rqO_2.break_(var1));
   }

   public void class_(rfH_2 var1) {
      this.protected_ = var1;
   }

   public boolean break_(boolean var1) {
      if (this.private_ == rCD.SAVE && !this.extends_.continue_ && this.class_ != null) {
         rfH_2 var2 = this.char_().break_(this.protected_);
         rrEm_1 var3 = (rrEm_1)this.extends_;
         rrPt_1 var4 = var3.O();

         rrPl_1 var5;
         try {
            var5 = var4.class_(this.class_);
         } catch (rqX_2 var8) {
            return false;
         }

         var5.class_(this.extends_, var2, this.throws_, !this.implements_, xu_3.bo);
         var5.class_(this.break_);
         if (var1) {
            try {
               return var4.byte_(this.class_);
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

   private static Random break_(long var0) {
      return var0 == 0L ? new Random(rqR_2.break_()) : new Random(var0);
   }

   public void break_(rfH_2 var1) {
      this.throws_ = var1;
   }

   public void break_(String var1) {
      this.byte_ = var1;
   }

   public String throws_() {
      return this.class_ == null ? "" : this.class_.toString();
   }

   public void throws_(boolean var1) {
      this.package_ = var1;
   }

   public rfH_2 finally_() {
      return this.protected_;
   }

   public String catch_() {
      return this.class_ == null ? "" : this.class_.break_();
   }

   public rfH_2 extends_() {
      return this.throws_;
   }

   public boolean goto_() {
      return this.finally_;
   }

   public boolean continue_() {
      return this.implements_;
   }

   public boolean else_() {
      if (this.private_ != rCD.SAVE) {
         return false;
      } else {
         rfH_2 var1 = this.char_();
         byte var2 = 80;
         rfH_2 var3 = new rfH_2(var1.b_() - 80, 0, var1.d_() - 80);
         rfH_2 var4 = new rfH_2(var1.b_() + 80, 255, var1.d_() + 80);
         List var5 = this.class_(var3, var4);
         List var6 = this.class_(var5);
         if (var6.size() < 1) {
            return false;
         } else {
            rfi_3 var7 = this.class_(var1, var6);
            if (var7.protected_ - var7.class_ > 1 && var7.throws_ - var7.break_ > 1 && var7.case_ - var7.byte_ > 1) {
               this.protected_ = new rfH_2(var7.class_ - var1.b_() + 1, var7.break_ - var1.c_() + 1, var7.byte_ - var1.d_() + 1);
               this.throws_ = new rfH_2(var7.protected_ - var7.class_ - 1, var7.throws_ - var7.break_ - 1, var7.case_ - var7.byte_ - 1);
               this.break_();
               xc_3 var8 = this.extends_.byte_(var1);
               this.extends_.class_(var1, var8, var8, 3);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public double implements_() {
      return 96.0;
   }

   public boolean instanceof_() {
      return this.package_;
   }

   public void new_() {
      switch (this.package_()) {
         case SAVE:
            this.class_(rCD.LOAD);
            break;
         case LOAD:
            this.class_(rCD.CORNER);
            break;
         case CORNER:
            this.class_(rCD.DATA);
            break;
         case DATA:
            this.class_(rCD.SAVE);
      }
   }

   public rCD package_() {
      return this.private_;
   }

   public void return_() {
      if (this.class_ != null) {
         rrEm_1 var1 = (rrEm_1)this.extends_;
         rrPt_1 var2 = var1.O();
         var2.protected_(this.class_);
      }
   }

   public float super_() {
      return this.int_;
   }

   private void throw_() {
      if (this.extends_ != null) {
         rfH_2 var1 = this.char_();
         xc_3 var2 = this.extends_.byte_(var1);
         if (var2.class_(xu_3.Js)) {
            this.extends_.class_(var1, var2.class_(zx_3.volatile_, this.private_), 2);
         }
      }
   }

   public boolean try_() {
      return this.final_;
   }

   public boolean public_() {
      if (this.private_ == rCD.LOAD && !this.extends_.continue_ && this.class_ != null) {
         rrEm_1 var1 = (rrEm_1)this.extends_;
         rrPt_1 var2 = var1.O();

         try {
            return var2.break_(this.class_) != null;
         } catch (rqX_2 var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public void protected_(boolean var1) {
      this.final_ = var1;
   }

   public boolean private_() {
      return this.class_ != null;
   }

   public String final_() {
      return this.byte_;
   }

   public rqd_3 volatile_() {
      return this.catch_;
   }

   public boolean synchronized_() {
      return this.break_(true);
   }

   public rpa_3 native_() {
      return this.case_;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 7, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
