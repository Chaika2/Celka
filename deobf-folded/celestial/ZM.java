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
   private static final rgP_2 id_class = new rgn_3("book.editTitle");
   private static final rgP_2 id_throws = new rgn_3("book.finalizeWarning");
   private static final rpl_3 id_case = rpl_3.id_class("_", rgc_3.id_class.id_class(rgF_2.BLACK));
   private static final rpl_3 id_catch = rpl_3.id_class("_", rgc_3.id_class.id_class(rgF_2.GRAY));
   private final rhd_3 id_private;
   private final rdn_3 id_implements;
   private boolean id_finally;
   private boolean id_else;
   private int id_synchronized;
   private int id_return;
   private final List<String> id_public = Lists.newArrayList();
   private String id_goto = "";
   private final ux_3 id_while = new ux_3(
      this::id_import, this::id_byte, this::id_native, this::id_class, var1x -> var1x.length() < 1024 && this.id_super.id_break(var1x, 114) <= 128
   );
   private final ux_3 id_try = new ux_3(() -> this.id_goto, var1x -> this.id_goto = var1x, this::id_native, this::id_class, var0 -> var0.length() < 16);
   private long id_instanceof;
   private int id_throw = -1;
   private Ln_1 id_interface;
   private Ln_1 id_char;
   private LF id_abstract;
   private LF id_long;
   private LF id_float;
   private LF id_boolean;
   private final rpm_3 id_transient;
   private Zh_1 id_for = Zh_1.id_class;
   private rgP_2 id_double = rgN_2.id_byte;
   private final rgP_2 id_switch;

   private void id_char() {
      ListIterator var1 = this.id_public.listIterator(this.id_public.size());

      while (var1.hasPrevious() && ((String)var1.previous()).isEmpty()) {
         var1.remove();
      }
   }

   private void id_byte(String var1) {
      if (this.id_return >= 0 && this.id_return < this.id_public.size()) {
         this.id_public.set(this.id_return, var1);
         this.id_finally = true;
         this.id_default();
      }
   }

   private void id_byte(boolean var1) {
      if (this.id_finally) {
         this.id_char();
         rcy_3 var2 = new rcy_3();
         this.id_public.stream().map(rca_3::id_class).forEach(var2::add);
         if (!this.id_public.isEmpty()) {
            this.id_implements.id_class("pages", var2);
         }

         if (var1) {
            this.id_implements.id_class("author", rca_3.id_class(this.id_private.sv().getName()));
            this.id_implements.id_class("title", rca_3.id_class(this.id_goto.trim()));
         }

         int var3 = this.id_transient == rpm_3.MAIN_HAND ? ((rhz_3)this.id_private.id_implements[1]).id_protected : 40;
         this.id_volatile.id_void().id_class(new rmo_3(this.id_implements, var1, var3));
      }
   }

   private boolean id_byte(int var1, int var2, int var3) {
      if (vm_3.id_private(var1)) {
         this.id_while.id_protected();
         return true;
      } else if (vm_3.id_catch(var1)) {
         this.id_while.id_byte();
         return true;
      } else if (vm_3.id_case(var1)) {
         this.id_while.id_break();
         return true;
      } else if (vm_3.id_throws(var1)) {
         this.id_while.id_class();
         return true;
      } else {
         switch (var1) {
            case 257:
            case 335:
               this.id_while.id_class("\n");
               return true;
            case 259:
               this.id_while.id_break(-1);
               return true;
            case 261:
               this.id_while.id_break(1);
               return true;
            case 262:
               this.id_while.id_class(1, vm_3.id_synchronized());
               return true;
            case 263:
               this.id_while.id_class(-1, vm_3.id_synchronized());
               return true;
            case 264:
               this.id_float();
               return true;
            case 265:
               this.id_long();
               return true;
            case 266:
               this.id_char.id_catch();
               return true;
            case 267:
               this.id_interface.id_catch();
               return true;
            case 268:
               this.id_void();
               return true;
            case 269:
               this.id_static();
               return true;
            default:
               return false;
         }
      }
   }

   private void id_byte(int var1) {
      String var2 = this.id_import();
      this.id_while.id_class(rVj_1.id_class(var2, -1, var1, false), rVj_1.id_class(var2, 1, var1, false));
   }

   private void id_int() {
      if (this.id_return < this.id_final() - 1) {
         this.id_return++;
      } else {
         this.id_abstract();
         if (this.id_return < this.id_final() - 1) {
            this.id_return++;
         }
      }

      this.id_interface();
      this.id_const();
   }

   private void id_long() {
      this.id_break(-1);
   }

   private void id_float() {
      this.id_break(1);
   }

   public ZM(rhd_3 var1, rdn_3 var2, rpm_3 var3) {
      super(rgN_2.id_byte);
      this.id_private = var1;
      this.id_implements = var2;
      this.id_transient = var3;
      rcd_3 var4 = var2.id_package();
      if (var4 != null) {
         rcy_3 var5 = var4.id_protected("pages", 8).id_protected();

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.id_public.add(var5.id_implements(var6));
         }
      }

      if (this.id_public.isEmpty()) {
         this.id_public.add("");
      }

      this.id_switch = new rgn_3("book.byAuthor", var1.g()).id_class(rgF_2.DARK_GRAY);
      vs_3.INSTANCE.id_class(this);
   }

   private void id_interface() {
      this.id_char.id_new = !this.id_else && this.id_return > 0;
      this.id_interface.id_new = !this.id_else;
      this.id_abstract.id_new = !this.id_else;
      this.id_long.id_new = !this.id_else;
      this.id_boolean.id_new = this.id_else;
      this.id_float.id_new = this.id_else;
      this.id_float.id_int = !this.id_goto.trim().isEmpty();
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_class((cC_2)null);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(vz_3.id_throws);
      int var5 = (this.id_package - 192) / 2;
      byte var6 = 2;
      this.id_break(var1, var5, 2, 0, 0, 192, 192);
      if (this.id_else) {
         boolean var7 = this.id_synchronized / 6 % 2 == 0;
         rpl_3 var8 = rpl_3.id_class(rpl_3.id_class(this.id_goto, rgc_3.id_class), var7 ? id_case : id_catch);
         int var9 = this.id_super.id_class(id_class);
         this.id_super.id_byte(var1, id_class, (float)(var5 + 36 + (114 - var9) / 2), 34.0F, 0);
         int var10 = this.id_super.id_class(var8);
         this.id_super.id_break(var1, var8, (float)(var5 + 36 + (114 - var10) / 2), 50.0F, 0);
         int var11 = this.id_super.id_class(this.id_switch);
         this.id_super.id_byte(var1, this.id_switch, (float)(var5 + 36 + (114 - var11) / 2), 60.0F, 0);
         this.id_super.id_class(id_throws, var5 + 36, 82, 114, 0);
      } else {
         int var13 = this.id_super.id_class(this.id_double);
         this.id_super.id_byte(var1, this.id_double, (float)(var5 - var13 + 192 - 44), 18.0F, 0);
         Zh_1 var14 = this.id_short();

         for (ZO var12 : var14.id_case) {
            this.id_super.id_byte(var1, var12.id_byte, (float)var12.id_protected, (float)var12.id_throws, -16777216);
         }

         this.id_class(var14.id_catch);
         this.id_class(var1, var14.id_byte, var14.id_protected);
      }

      super.id_class(var1, var2, var3, var4);
   }

   static int id_class(int[] var0, int var1) {
      int var2 = Arrays.binarySearch(var0, var1);
      return var2 < 0 ? -(var2 + 2) : var2;
   }

   private HZ id_class(String var1, rVj_1 var2, int var3, int var4, int var5, int var6) {
      String var7 = var1.substring(var6, var3);
      String var8 = var1.substring(var6, var4);
      ZX var9 = new ZX((int)var2.id_class(var7), var5);
      ZX var10 = new ZX((int)var2.id_class(var8), var5 + 9);
      return this.id_class(var9, var10);
   }

   private HZ id_class(ZX var1, ZX var2) {
      ZX var3 = this.id_break(var1);
      ZX var4 = this.id_break(var2);
      int var5 = Math.min(var3.id_class, var4.id_class);
      int var6 = Math.max(var3.id_class, var4.id_class);
      int var7 = Math.min(var3.id_break, var4.id_break);
      int var8 = Math.max(var3.id_break, var4.id_break);
      return new HZ(var5, var7, var6 - var5, var8 - var7);
   }

   private void id_class(Ml_1 var1, ZX var2, boolean var3) {
      if (this.id_synchronized / 6 % 2 == 0) {
         var2 = this.id_break(var2);
         if (!var3) {
            ch_3.id_class(var1, var2.id_class, var2.id_break - 1, var2.id_class + 1, var2.id_break + 9, -16777216);
         } else {
            this.id_super.id_break(var1, "_", (float)var2.id_class, (float)var2.id_break, 0);
         }
      }
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (super.id_class(var1, var3, var5, var6, var8)) {
         return true;
      } else {
         if (var5 == 0) {
            Zh_1 var10 = this.id_short();
            int var11 = var10.id_class(this.id_super, this.id_class(new ZX((int)var1, (int)var3)));
            this.id_while.id_byte(var11, true);
            this.id_default();
         }

         return true;
      }
   }

   private ZX id_class(ZX var1) {
      return new ZX(var1.id_class - (this.id_package - 192) / 2 - 36, var1.id_break - 32);
   }

   private void id_class(String var1) {
      if (this.id_volatile != null) {
         ux_3.id_class(this.id_volatile, var1);
      }
   }

   @Override
   public boolean id_class(char var1, int var2) {
      if (super.id_class(var1, var2)) {
         return true;
      } else if (this.id_else) {
         boolean var3 = this.id_try.id_class(var1);
         if (var3) {
            this.id_interface();
            this.id_finally = true;
            return true;
         } else {
            return false;
         }
      } else if (rqu_3.id_class(var1)) {
         this.id_while.id_class(Character.toString(var1));
         this.id_default();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (this.id_else) {
         return this.id_protected(var1, var2, var3);
      } else {
         boolean var4 = this.id_byte(var1, var2, var3);
         if (var4) {
            this.id_default();
            return true;
         } else {
            return false;
         }
      }
   }

   private void id_class(HZ[] var1) {
      yb_3 var2 = yb_3.id_class();
      lD_2 var3 = var2.id_byte();
      RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
      RenderSystem.disableTexture();
      RenderSystem.enableColorLogicOp();
      RenderSystem.logicOp(Ma_1.OR_REVERSE);
      var3.id_class(7, ju_3.id_super);

      for (HZ var7 : var1) {
         int var8 = var7.id_class();
         int var9 = var7.id_break();
         int var10 = var8 + var7.id_byte();
         int var11 = var9 + var7.id_protected();
         var3.id_class((double)var8, (double)var11, 0.0).id_class();
         var3.id_class((double)var10, (double)var11, 0.0).id_class();
         var3.id_class((double)var10, (double)var9, 0.0).id_class();
         var3.id_class((double)var8, (double)var9, 0.0).id_class();
      }

      var2.id_break();
      RenderSystem.disableColorLogicOp();
      RenderSystem.enableTexture();
   }

   private void id_default() {
      this.id_for = null;
   }

   private Zh_1 id_short() {
      if (this.id_for == null) {
         this.id_for = this.id_strictfp();
         this.id_double = new rgn_3("book.pageIndicator", this.id_return + 1, this.id_final());
      }

      return this.id_for;
   }

   private void id_void() {
      int var1 = this.id_while.id_case();
      int var2 = this.id_short().id_class(var1);
      this.id_while.id_byte(var2, vm_3.id_synchronized());
   }

   private void id_break(int var1) {
      int var2 = this.id_while.id_case();
      int var3 = this.id_short().id_class(var2, var1);
      this.id_while.id_byte(var3, vm_3.id_synchronized());
   }

   private ZX id_break(ZX var1) {
      return new ZX(var1.id_class + (this.id_package - 192) / 2 + 36, var1.id_break + 32);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (super.id_break(var1, var3, var5)) {
         return true;
      } else {
         if (var5 == 0) {
            long var6 = rqR_2.id_break();
            Zh_1 var8 = this.id_short();
            int var9 = var8.id_class(this.id_super, this.id_class(new ZX((int)var1, (int)var3)));
            if (var9 >= 0) {
               if (var9 != this.id_throw || var6 - this.id_instanceof >= 250L) {
                  this.id_while.id_byte(var9, vm_3.id_synchronized());
               } else if (!this.id_while.id_private()) {
                  this.id_byte(var9);
               } else {
                  this.id_while.id_protected();
               }

               this.id_default();
            }

            this.id_throw = var9;
            this.id_instanceof = var6;
         }

         return true;
      }
   }

   private void id_const() {
      this.id_while.id_throws();
      this.id_default();
   }

   private String id_import() {
      return this.id_return >= 0 && this.id_return < this.id_public.size() ? this.id_public.get(this.id_return) : "";
   }

   private void id_package() {
      if (this.id_return > 0) {
         this.id_return--;
      }

      this.id_interface();
      this.id_const();
   }

   private void id_static() {
      Zh_1 var1 = this.id_short();
      int var2 = this.id_while.id_case();
      int var3 = var1.id_break(var2);
      this.id_while.id_byte(var3, vm_3.id_synchronized());
   }

   private boolean id_protected(int var1, int var2, int var3) {
      switch (var1) {
         case 257:
         case 335:
            if (!this.id_goto.isEmpty()) {
               this.id_byte(true);
               this.id_volatile.id_break((vm_3)null);
            }

            return true;
         case 259:
            this.id_try.id_break(-1);
            this.id_interface();
            this.id_finally = true;
            return true;
         default:
            return false;
      }
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_synchronized++;
   }

   private void id_abstract() {
      if (this.id_final() < 100) {
         this.id_public.add("");
         this.id_finally = true;
      }
   }

   private int id_final() {
      return this.id_public.size();
   }

   private String id_native() {
      return this.id_volatile != null ? ux_3.id_break(this.id_volatile) : "";
   }

   private Zh_1 id_strictfp() {
      String var1 = this.id_import();
      if (var1.isEmpty()) {
         return Zh_1.id_class;
      } else {
         int var2 = this.id_while.id_case();
         int var3 = this.id_while.id_catch();
         IntArrayList var4 = new IntArrayList();
         ArrayList var5 = Lists.newArrayList();
         MutableInt var6 = new MutableInt();
         MutableBoolean var7 = new MutableBoolean();
         rVj_1 var8 = this.id_super.id_break();
         var8.id_class(var1, 114, rgc_3.id_class, true, (var6x, var7x, var8x) -> {
            int var9x = var6.getAndIncrement();
            String var10x = var1.substring(var7x, var8x);
            var7.setValue(var10x.endsWith("\n"));
            String var11x = StringUtils.stripEnd(var10x, " \n");
            int var12x = var9x * 9;
            ZX var13x = this.id_break(new ZX(0, var12x));
            var4.add(var7x);
            var5.add(new ZO(var6x, var11x, var13x.id_class, var13x.id_break));
         });
         int[] var9 = var4.toIntArray();
         boolean var10 = var2 == var1.length();
         ZX var11;
         if (var10 && var7.isTrue()) {
            var11 = new ZX(0, var5.size() * 9);
         } else {
            int var12 = id_class(var9, var2);
            int var13 = this.id_super.id_break(var1.substring(var9[var12], var2));
            var11 = new ZX(var13, var12 * 9);
         }

         ArrayList var22 = Lists.newArrayList();
         if (var2 != var3) {
            int var23 = Math.min(var2, var3);
            int var14 = Math.max(var2, var3);
            int var15 = id_class(var9, var23);
            int var16 = id_class(var9, var14);
            if (var15 == var16) {
               int var17 = var15 * 9;
               int var18 = var9[var15];
               var22.add(this.id_class(var1, var8, var23, var14, var17, var18));
            } else {
               int var24 = var15 + 1 > var9.length ? var1.length() : var9[var15 + 1];
               var22.add(this.id_class(var1, var8, var23, var24, var15 * 9, var9[var15]));

               for (int var25 = var15 + 1; var25 < var16; var25++) {
                  int var19 = var25 * 9;
                  String var20 = var1.substring(var9[var25], var9[var25 + 1]);
                  int var21 = (int)var8.id_class(var20);
                  var22.add(this.id_class(new ZX(0, var19), new ZX(var21, var19 + 9)));
               }

               var22.add(this.id_class(var1, var8, var9[var16], var14, var16 * 9, var9[var16]));
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
      this.id_default();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_long = this.id_class((LF)(new LF(this.id_package / 2 - 100, 196, 98, 20, new rgn_3("book.signButton"), var1x -> {
         this.id_else = true;
         this.id_interface();
      })));
      this.id_abstract = this.id_class((LF)(new LF(this.id_package / 2 + 2, 196, 98, 20, cN_2.id_byte, var1x -> {
         this.id_volatile.id_break((vm_3)null);
         this.id_byte(false);
      })));
      this.id_float = this.id_class((LF)(new LF(this.id_package / 2 - 100, 196, 98, 20, new rgn_3("book.finalizeButton"), var1x -> {
         if (this.id_else) {
            this.id_byte(true);
            this.id_volatile.id_break((vm_3)null);
         }
      })));
      this.id_boolean = this.id_class((LF)(new LF(this.id_package / 2 + 2, 196, 98, 20, cN_2.id_protected, var1x -> {
         if (this.id_else) {
            this.id_else = false;
         }

         this.id_interface();
      })));
      int var1 = (this.id_package - 192) / 2;
      byte var2 = 2;
      this.id_interface = this.id_class(new Ln_1(var1 + 116, 159, true, var1x -> this.id_int(), true));
      this.id_char = this.id_class(new Ln_1(var1 + 43, 159, false, var1x -> this.id_package(), true));
      this.id_interface();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
