package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class rHb_1 extends ryO_2 implements rpA_2 {
   private rgP_2 id_class;
   private rxL_2 id_break = rxL_2.WHITE;
   private rcy_3 id_byte;
   private boolean id_protected;
   private List<Pair<rHE, rxL_2>> id_throws;

   public static void id_byte(rdn_3 var0) {
      rcd_3 var1 = var0.id_break("BlockEntityTag");
      if (var1 != null && var1.id_byte("Patterns", 9)) {
         rcy_3 var2 = var1.id_protected("Patterns", 10);
         if (!var2.isEmpty()) {
            var2.id_byte(var2.size() - 1);
            if (var2.isEmpty()) {
               var0.id_byte("BlockEntityTag");
            }
         }
      }
   }

   public rHb_1() {
      super(ryW_2.id_super);
   }

   public rHb_1(rxL_2 var1) {
      this();
      this.id_break = var1;
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_byte != null) {
         var1.id_class("Patterns", this.id_byte);
      }

      if (this.id_class != null) {
         var1.id_class("CustomName", rgB_2.id_class(this.id_class));
      }

      return var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      if (var2.id_byte("CustomName", 8)) {
         this.id_class = rgB_2.id_class(var2.id_native("CustomName"));
      }

      if (this.id_interface()) {
         this.id_break = ((JL)this.id_abstract().id_break()).id_break();
      } else {
         this.id_break = null;
      }

      this.id_byte = var2.id_protected("Patterns", 10);
      this.id_throws = null;
      this.id_protected = true;
   }

   public rdn_3 id_class(xc_3 var1) {
      rdn_3 var2 = new rdn_3(xS_2.id_class(this.id_class(() -> var1)));
      if (this.id_byte != null && !this.id_byte.isEmpty()) {
         var2.id_class("BlockEntityTag").id_class("Patterns", this.id_byte.id_protected());
      }

      if (this.id_class != null) {
         var2.id_class(this.id_class);
      }

      return var2;
   }

   public static List<Pair<rHE, rxL_2>> id_class(rxL_2 var0, rcy_3 var1) {
      ArrayList var2 = Lists.newArrayList();
      var2.add(Pair.of(rHE.BASE, var0));
      if (var1 != null) {
         for (int var3 = 0; var3 < var1.size(); var3++) {
            rcd_3 var4 = var1.id_class(var3);
            rHE var5 = rHE.id_class(var4.id_native("Pattern"));
            if (var5 != null) {
               int var6 = var4.id_private("Color");
               var2.add(Pair.of(var5, rxL_2.id_class(var6)));
            }
         }
      }

      return var2;
   }

   public void id_class(rdn_3 var1, rxL_2 var2) {
      this.id_byte = id_class(var1);
      this.id_break = var2;
      this.id_throws = null;
      this.id_protected = true;
      this.id_class = var1.id_this() ? var1.id_continue() : null;
   }

   public static rcy_3 id_class(rdn_3 var0) {
      rcy_3 var1 = null;
      rcd_3 var2 = var0.id_break("BlockEntityTag");
      if (var2 != null && var2.id_byte("Patterns", 9)) {
         var1 = var2.id_protected("Patterns", 10).id_protected();
      }

      return var1;
   }

   public rxL_2 id_class(Supplier<xc_3> var1) {
      if (this.id_break == null) {
         this.id_break = ((JL)((xc_3)var1.get()).id_break()).id_break();
      }

      return this.id_break;
   }

   public void id_class(rgP_2 var1) {
      this.id_class = var1;
   }

   @Override
   public rgP_2 g() {
      return (rgP_2)(this.id_class != null ? this.id_class : new rgn_3("block.minecraft.banner"));
   }

   public static int id_break(rdn_3 var0) {
      rcd_3 var1 = var0.id_break("BlockEntityTag");
      return var1 != null && var1.id_throws("Patterns") ? var1.id_protected("Patterns", 10).size() : 0;
   }

   public List<Pair<rHE, rxL_2>> id_throws() {
      if (this.id_throws == null && this.id_protected) {
         this.id_throws = id_class(this.id_class(this::id_abstract), this.id_byte);
      }

      return this.id_throws;
   }

   @Override
   public rgP_2 rD() {
      return this.id_class;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 6, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
