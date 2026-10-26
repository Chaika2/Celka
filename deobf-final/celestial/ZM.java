package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class ZM extends vm_3 implements rrvs_1 {
   private static final rgP_2 class_ = new rgn_3("book.editTitle");
   private static final rgP_2 throws_ = new rgn_3("book.finalizeWarning");
   private static final rpl_3 case_ = rpl_3.class_("_", rgc_3.class_.class_(rgF_2.BLACK));
   private static final rpl_3 catch_ = rpl_3.class_("_", rgc_3.class_.class_(rgF_2.GRAY));
   private final rhd_3 private_;
   private final rdn_3 implements_;
   private boolean finally_;
   private boolean else_;
   private int synchronized_;
   private int return_;
   private final List<String> public_ = Lists.newArrayList();
   private String goto_ = "";
   private final ux_3 while_ = new ux_3(
      this::import_, this::byte_, this::native_, this::class_, var1x -> var1x.length() < 1024 && this.super_.break_(var1x, 114) <= 128
   );
   private final ux_3 try_ = new ux_3(() -> this.goto_, var1x -> this.goto_ = var1x, this::native_, this::class_, var0 -> var0.length() < 16);
   private long instanceof_;
   private int throw_ = -1;
   private Ln_1 interface_;
   private Ln_1 char_;
   private LF abstract_;
   private LF long_;
   private LF float_;
   private LF boolean_;
   private final rpm_3 transient_;
   private Zh_1 for_ = Zh_1.class_;
   private rgP_2 double_ = rgN_2.byte_;
   private final rgP_2 switch_;

   private void char_() {
      ListIterator var1 = this.public_.listIterator(this.public_.size());

      while (var1.hasPrevious() && ((String)var1.previous()).isEmpty()) {
         var1.remove();
      }
   }

   private void byte_(String var1) {
      if (this.return_ >= 0 && this.return_ < this.public_.size()) {
         this.public_.set(this.return_, var1);
         this.finally_ = true;
         this.default_();
      }
   }

   private void byte_(boolean var1) {
      if (this.finally_) {
         this.char_();
         rcy_3 var2 = new rcy_3();
         this.public_.stream().map(rca_3::class_).forEach(var2::add);
         if (!this.public_.isEmpty()) {
            this.implements_.class_("pages", var2);
         }

         if (var1) {
            this.implements_.class_("author", rca_3.class_(this.private_.sv().getName()));
            this.implements_.class_("title", rca_3.class_(this.goto_.trim()));
         }

         int var3 = this.transient_ == rpm_3.MAIN_HAND ? ((rhz_3)this.private_.implements_[1]).protected_ : 40;
         this.volatile_.void_().class_(new rmo_3(this.implements_, var1, var3));
      }
   }

   private boolean byte_(int var1, int var2, int var3) {
      if (vm_3.private_(var1)) {
         this.while_.protected_();
         return true;
      } else if (vm_3.catch_(var1)) {
         this.while_.byte_();
         return true;
      } else if (vm_3.case_(var1)) {
         this.while_.break_();
         return true;
      } else if (vm_3.throws_(var1)) {
         this.while_.class_();
         return true;
      } else {
         switch (var1) {
            case 257:
            case 335:
               this.while_.class_("\n");
               return true;
            case 259:
               this.while_.break_(-1);
               return true;
            case 261:
               this.while_.break_(1);
               return true;
            case 262:
               this.while_.class_(1, vm_3.synchronized_());
               return true;
            case 263:
               this.while_.class_(-1, vm_3.synchronized_());
               return true;
            case 264:
               this.float_();
               return true;
            case 265:
               this.long_();
               return true;
            case 266:
               this.char_.catch_();
               return true;
            case 267:
               this.interface_.catch_();
               return true;
            case 268:
               this.void_();
               return true;
            case 269:
               this.static_();
               return true;
            default:
               return false;
         }
      }
   }

   private void byte_(int var1) {
      String var2 = this.import_();
      this.while_.class_(rVj_1.class_(var2, -1, var1, false), rVj_1.class_(var2, 1, var1, false));
   }

   private void int_() {
      if (this.return_ < this.final_() - 1) {
         this.return_++;
      } else {
         this.abstract_();
         if (this.return_ < this.final_() - 1) {
            this.return_++;
         }
      }

      this.interface_();
      this.const_();
   }

   private void long_() {
      this.break_(-1);
   }

   private void float_() {
      this.break_(1);
   }

   public ZM(rhd_3 var1, rdn_3 var2, rpm_3 var3) {
      super(rgN_2.byte_);
      this.private_ = var1;
      this.implements_ = var2;
      this.transient_ = var3;
      rcd_3 var4 = var2.package_();
      if (var4 != null) {
         rcy_3 var5 = var4.protected_("pages", 8).protected_();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.public_.add(var5.implements_(var6));
         }
      }

      if (this.public_.isEmpty()) {
         this.public_.add("");
      }

      this.switch_ = new rgn_3("book.byAuthor", var1.g()).class_(rgF_2.DARK_GRAY);
      vs_3.INSTANCE.class_(this);
   }

   private void interface_() {
      this.char_.new_ = !this.else_ && this.return_ > 0;
      this.interface_.new_ = !this.else_;
      this.abstract_.new_ = !this.else_;
      this.long_.new_ = !this.else_;
      this.boolean_.new_ = this.else_;
      this.float_.new_ = this.else_;
      this.float_.int_ = !this.goto_.trim().isEmpty();
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      this.class_((cC_2)null);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(vz_3.throws_);
      int var5 = (this.package_ - 192) / 2;
      byte var6 = 2;
      this.break_(var1, var5, 2, 0, 0, 192, 192);
      if (this.else_) {
         boolean var7 = this.synchronized_ / 6 % 2 == 0;
         rpl_3 var8 = rpl_3.class_(rpl_3.class_(this.goto_, rgc_3.class_), var7 ? case_ : catch_);
         int var9 = this.super_.class_(class_);
         this.super_.byte_(var1, class_, (float)(var5 + 36 + (114 - var9) / 2), 34.0F, 0);
         int var10 = this.super_.class_(var8);
         this.super_.break_(var1, var8, (float)(var5 + 36 + (114 - var10) / 2), 50.0F, 0);
         int var11 = this.super_.class_(this.switch_);
         this.super_.byte_(var1, this.switch_, (float)(var5 + 36 + (114 - var11) / 2), 60.0F, 0);
         this.super_.class_(throws_, var5 + 36, 82, 114, 0);
      } else {
         int var13 = this.super_.class_(this.double_);
         this.super_.byte_(var1, this.double_, (float)(var5 - var13 + 192 - 44), 18.0F, 0);
         Zh_1 var14 = this.short_();

         for (ZO var12 : var14.case_) {
            this.super_.byte_(var1, var12.byte_, (float)var12.protected_, (float)var12.throws_, -16777216);
         }

         this.class_(var14.catch_);
         this.class_(var1, var14.byte_, var14.protected_);
      }

      super.class_(var1, var2, var3, var4);
   }

   static int class_(int[] var0, int var1) {
      int var2 = Arrays.binarySearch(var0, var1);
      return var2 < 0 ? -(var2 + 2) : var2;
   }

   private HZ class_(String var1, rVj_1 var2, int var3, int var4, int var5, int var6) {
      String var7 = var1.substring(var6, var3);
      String var8 = var1.substring(var6, var4);
      ZX var9 = new ZX((int)var2.class_(var7), var5);
      ZX var10 = new ZX((int)var2.class_(var8), var5 + 9);
      return this.class_(var9, var10);
   }

   private HZ class_(ZX var1, ZX var2) {
      ZX var3 = this.break_(var1);
      ZX var4 = this.break_(var2);
      int var5 = Math.min(var3.class_, var4.class_);
      int var6 = Math.max(var3.class_, var4.class_);
      int var7 = Math.min(var3.break_, var4.break_);
      int var8 = Math.max(var3.break_, var4.break_);
      return new HZ(var5, var7, var6 - var5, var8 - var7);
   }

   private void class_(Ml_1 var1, ZX var2, boolean var3) {
      if (this.synchronized_ / 6 % 2 == 0) {
         var2 = this.break_(var2);
         if (!var3) {
            ch_3.class_(var1, var2.class_, var2.break_ - 1, var2.class_ + 1, var2.break_ + 9, -16777216);
         } else {
            this.super_.break_(var1, "_", (float)var2.class_, (float)var2.break_, 0);
         }
      }
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (super.class_(var1, var3, var5, var6, var8)) {
         return true;
      } else {
         if (var5 == 0) {
            Zh_1 var10 = this.short_();
            int var11 = var10.class_(this.super_, this.class_(new ZX((int)var1, (int)var3)));
            this.while_.byte_(var11, true);
            this.default_();
         }

         return true;
      }
   }

   private ZX class_(ZX var1) {
      return new ZX(var1.class_ - (this.package_ - 192) / 2 - 36, var1.break_ - 32);
   }

   private void class_(String var1) {
      if (this.volatile_ != null) {
         ux_3.class_(this.volatile_, var1);
      }
   }

   @Override
   public boolean class_(char var1, int var2) {
      if (super.class_(var1, var2)) {
         return true;
      } else if (this.else_) {
         boolean var3 = this.try_.class_(var1);
         if (var3) {
            this.interface_();
            this.finally_ = true;
            return true;
         } else {
            return false;
         }
      } else if (rqu_3.class_(var1)) {
         this.while_.class_(Character.toString(var1));
         this.default_();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else if (this.else_) {
         return this.protected_(var1, var2, var3);
      } else {
         boolean var4 = this.byte_(var1, var2, var3);
         if (var4) {
            this.default_();
            return true;
         } else {
            return false;
         }
      }
   }

   private void class_(HZ[] var1) {
      yb_3 var2 = yb_3.class_();
      lD_2 var3 = var2.byte_();
      RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
      RenderSystem.disableTexture();
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(Ma_1.OR_REVERSE);
      var3.class_(7, ju_3.super_);

      for (HZ var7 : var1) {
         int var8 = var7.class_();
         int var9 = var7.break_();
         int var10 = var8 + var7.byte_();
         int var11 = var9 + var7.protected_();
         var3.class_((double)var8, (double)var11, 0.0).class_();
         var3.class_((double)var10, (double)var11, 0.0).class_();
         var3.class_((double)var10, (double)var9, 0.0).class_();
         var3.class_((double)var8, (double)var9, 0.0).class_();
      }

      var2.break_();
      RenderSystem.disableColorLogicOp();
      RenderSystem.enableTexture();
   }

   private void default_() {
      this.for_ = null;
   }

   private Zh_1 short_() {
      if (this.for_ == null) {
         this.for_ = this.strictfp_();
         this.double_ = new rgn_3("book.pageIndicator", this.return_ + 1, this.final_());
      }

      return this.for_;
   }

   private void void_() {
      int var1 = this.while_.case_();
      int var2 = this.short_().class_(var1);
      this.while_.byte_(var2, vm_3.synchronized_());
   }

   private void break_(int var1) {
      int var2 = this.while_.case_();
      int var3 = this.short_().class_(var2, var1);
      this.while_.byte_(var3, vm_3.synchronized_());
   }

   private ZX break_(ZX var1) {
      return new ZX(var1.class_ + (this.package_ - 192) / 2 + 36, var1.break_ + 32);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (super.break_(var1, var3, var5)) {
         return true;
      } else {
         if (var5 == 0) {
            long var6 = rqR_2.break_();
            Zh_1 var8 = this.short_();
            int var9 = var8.class_(this.super_, this.class_(new ZX((int)var1, (int)var3)));
            if (var9 >= 0) {
               if (var9 != this.throw_ || var6 - this.instanceof_ >= 250L) {
                  this.while_.byte_(var9, vm_3.synchronized_());
               } else if (!this.while_.private_()) {
                  this.byte_(var9);
               } else {
                  this.while_.protected_();
               }

               this.default_();
            }

            this.throw_ = var9;
            this.instanceof_ = var6;
         }

         return true;
      }
   }

   private void const_() {
      this.while_.throws_();
      this.default_();
   }

   private String import_() {
      return this.return_ >= 0 && this.return_ < this.public_.size() ? this.public_.get(this.return_) : "";
   }

   private void package_() {
      if (this.return_ > 0) {
         this.return_--;
      }

      this.interface_();
      this.const_();
   }

   private void static_() {
      Zh_1 var1 = this.short_();
      int var2 = this.while_.case_();
      int var3 = var1.break_(var2);
      this.while_.byte_(var3, vm_3.synchronized_());
   }

   private boolean protected_(int var1, int var2, int var3) {
      switch (var1) {
         case 257:
         case 335:
            if (!this.goto_.isEmpty()) {
               this.byte_(true);
               this.volatile_.break_((vm_3)null);
            }

            return true;
         case 259:
            this.try_.break_(-1);
            this.interface_();
            this.finally_ = true;
            return true;
         default:
            return false;
      }
   }

   @Override
   public void private_() {
      super.private_();
      this.synchronized_++;
   }

   private void abstract_() {
      if (this.final_() < 100) {
         this.public_.add("");
         this.finally_ = true;
      }
   }

   private int final_() {
      return this.public_.size();
   }

   private String native_() {
      return this.volatile_ != null ? ux_3.break_(this.volatile_) : "";
   }

   private Zh_1 strictfp_() {
      String var1 = this.import_();
      if (var1.isEmpty()) {
         return Zh_1.class_;
      } else {
         int var2 = this.while_.case_();
         int var3 = this.while_.catch_();
         IntArrayList var4 = new IntArrayList();
         ArrayList var5 = Lists.newArrayList();
         MutableInt var6 = new MutableInt();
         MutableBoolean var7 = new MutableBoolean();
         rVj_1 var8 = this.super_.break_();
         var8.class_(var1, 114, rgc_3.class_, true, (var6x, var7x, var8x) -> {
            int var9x = var6.getAndIncrement();
            String var10x = var1.substring(var7x, var8x);
            var7.setValue(var10x.endsWith("\n"));
            String var11x = StringUtils.stripEnd(var10x, " \n");
            int var12x = var9x * 9;
            ZX var13x = this.break_(new ZX(0, var12x));
            var4.add(var7x);
            var5.add(new ZO(var6x, var11x, var13x.class_, var13x.break_));
         });
         int[] var9 = var4.toIntArray();
         boolean var10 = var2 == var1.length();
         ZX var11;
         if (var10 && var7.isTrue()) {
            var11 = new ZX(0, var5.size() * 9);
         } else {
            int var12 = class_(var9, var2);
            int var13 = this.super_.break_(var1.substring(var9[var12], var2));
            var11 = new ZX(var13, var12 * 9);
         }

         ArrayList var22 = Lists.newArrayList();
         if (var2 != var3) {
            int var23 = Math.min(var2, var3);
            int var14 = Math.max(var2, var3);
            int var15 = class_(var9, var23);
            int var16 = class_(var9, var14);
            if (var15 == var16) {
               int var17 = var15 * 9;
               int var18 = var9[var15];
               var22.add(this.class_(var1, var8, var23, var14, var17, var18));
            } else {
               int var24 = var15 + 1 > var9.length ? var1.length() : var9[var15 + 1];
               var22.add(this.class_(var1, var8, var23, var24, var15 * 9, var9[var15]));

               for (int var25 = var15 + 1; var25 < var16; var25++) {
                  int var19 = var25 * 9;
                  String var20 = var1.substring(var9[var25], var9[var25 + 1]);
                  int var21 = (int)var8.class_(var20);
                  var22.add(this.class_(new ZX(0, var19), new ZX(var21, var19 + 9)));
               }

               var22.add(this.class_(var1, var8, var9[var16], var14, var16 * 9, var9[var16]));
            }
         }

         return new Zh_1(var1, var11, var10, var9, var5.toArray(new ZO[0]), var22.toArray(new HZ[0]));
      }
   }

   @Override
   public boolean aO_() {
      return true;
   }

   @Override
   protected void v_() {
      this.default_();
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.long_ = this.class_((LF)(new LF(this.package_ / 2 - 100, 196, 98, 20, new rgn_3("book.signButton"), var1x -> {
         this.else_ = true;
         this.interface_();
      })));
      this.abstract_ = this.class_((LF)(new LF(this.package_ / 2 + 2, 196, 98, 20, cN_2.byte_, var1x -> {
         this.volatile_.break_((vm_3)null);
         this.byte_(false);
      })));
      this.float_ = this.class_((LF)(new LF(this.package_ / 2 - 100, 196, 98, 20, new rgn_3("book.finalizeButton"), var1x -> {
         if (this.else_) {
            this.byte_(true);
            this.volatile_.break_((vm_3)null);
         }
      })));
      this.boolean_ = this.class_((LF)(new LF(this.package_ / 2 + 2, 196, 98, 20, cN_2.protected_, var1x -> {
         if (this.else_) {
            this.else_ = false;
         }

         this.interface_();
      })));
      int var1 = (this.package_ - 192) / 2;
      byte var2 = 2;
      this.interface_ = this.class_(new Ln_1(var1 + 116, 159, true, var1x -> this.int_(), true));
      this.char_ = this.class_(new Ln_1(var1 + 43, 159, false, var1x -> this.package_(), true));
      this.interface_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
