package celestial;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.gson.JsonParseException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rdn_3 {
   public static final Codec<rdn_3> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rVL.id_for.fieldOf("id").forGetter(var0x -> var0x.id_implements),
               Codec.INT.fieldOf("Count").forGetter(var0x -> var0x.id_catch),
               rcd_3.id_class.optionalFieldOf("tag").forGetter(var0x -> Optional.ofNullable(var0x.id_finally))
            )
            .apply(var0, rdn_3::new)
   );
   private static final Logger id_throws = LogManager.getLogger();
   public static final rdn_3 id_break = new rdn_3((rdb_3)null);
   public static final DecimalFormat id_byte = (DecimalFormat)rqR_2.id_class(
      new DecimalFormat("#.##"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private static final rgc_3 id_case = rgc_3.id_class.id_class(rgF_2.DARK_PURPLE).id_break(true);
   private int id_catch;
   private int id_private;
   @Deprecated
   private final rdb_3 id_implements;
   private rcd_3 id_finally;
   private boolean id_extends;
   private an_3 id_native;
   private ryw_3 id_volatile;
   private boolean id_final;
   private ryw_3 id_package;
   private boolean id_int;
   private int id_new;
   private String id_continue;
   public int id_protected;

   private int id_boolean() {
      return this.id_final() && this.id_finally.id_byte("HideFlags", 99) ? this.id_finally.id_private("HideFlags") : 0;
   }

   public int id_char() {
      return this.id_extends ? 0 : this.id_catch;
   }

   private boolean id_byte(rdn_3 var1) {
      if (this.id_catch != var1.id_catch) {
         return false;
      } else if (this.id_break() != var1.id_break()) {
         return false;
      } else {
         return this.id_finally == null && var1.id_finally != null ? false : this.id_finally == null || this.id_finally.equals(var1.id_finally);
      }
   }

   public void id_byte(String var1) {
      if (this.id_finally != null && this.id_finally.id_throws(var1)) {
         this.id_finally.id_continue(var1);
         if (this.id_finally.id_case()) {
            this.id_finally = null;
         }
      }
   }

   public void id_byte(int var1) {
      this.id_int().id_break("RepairCost", var1);
   }

   public void id_byte(rcd_3 var1) {
      this.id_finally = var1;
      if (this.id_break().id_extends()) {
         this.id_break(this.id_catch());
      }
   }

   public int id_byte() {
      return this.id_break().id_implements();
   }

   public static boolean id_byte(rdn_3 var0, rdn_3 var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.id_class() && !var1.id_class() ? var0.id_class(var1) : false;
      }
   }

   public rcd_3 id_int() {
      if (this.id_finally == null) {
         this.id_byte(new rcd_3());
      }

      return this.id_finally;
   }

   public boolean id_long() {
      return this.id_break().id_super();
   }

   public rqA_2 id_float() {
      return this.id_break().U_();
   }

   public rdn_3(rpL_2 var1) {
      this(var1, 1);
   }

   private rdn_3(rcd_3 var1) {
      this.id_implements = (rdb_3)rVL.id_for.id_class(new rqO_2(var1.id_native("id")));
      this.id_catch = var1.id_case("Count");
      if (var1.id_byte("tag", 10)) {
         this.id_finally = var1.id_int("tag");
         this.id_break().id_break(var1);
      }

      if (this.id_break().id_extends()) {
         this.id_break(this.id_catch());
      }

      this.id_strictfp();
      this.id_const();
   }

   public rdn_3(rpL_2 var1, int var2) {
      this.id_implements = var1 == null ? null : var1.id_case();
      this.id_catch = var2;
      if (this.id_implements != null && this.id_implements.id_extends()) {
         this.id_break(this.id_catch());
      }

      this.id_strictfp();
      this.id_const();
      this.id_continue = this.id_continue().id_byte();
   }

   private rdn_3(rpL_2 var1, int var2, Optional<rcd_3> var3) {
      this(var1, var2);
      var3.ifPresent(this::id_byte);
      this.id_const();
   }

   @Override
   public String toString() {
      return this.id_break() + " x" + this.id_catch;
   }

   public boolean id_this() {
      rcd_3 var1 = this.id_break("display");
      return var1 != null && var1.id_byte("Name", 8);
   }

   public int id_interface() {
      return this.id_private;
   }

   public void id_class(iJ_2 var1, ix_3 var2, rXQ var3) {
      this.id_int();
      if (!this.id_finally.id_byte("AttributeModifiers", 9)) {
         this.id_finally.id_class("AttributeModifiers", new rcy_3());
      }

      rcy_3 var4 = this.id_finally.id_protected("AttributeModifiers", 10);
      rcd_3 var5 = var2.id_throws();
      var5.id_class("AttributeName", rVL.O.id_break(var1).toString());
      if (var3 != null) {
         var5.id_class("Slot", var3.id_protected());
      }

      var4.add(var5);
   }

   private static boolean id_class(ryw_3 var0, ryw_3 var1) {
      if (var1 == null || var0.id_class() != var1.id_class()) {
         return false;
      } else if (var0.id_break() == null && var1.id_break() == null) {
         return true;
      } else {
         return var0.id_break() != null && var1.id_break() != null
            ? Objects.equals(var0.id_break().id_class(new rcd_3()), var1.id_break().id_class(new rcd_3()))
            : false;
      }
   }

   public rcd_3 id_class(String var1) {
      if (this.id_finally != null && this.id_finally.id_byte(var1, 10)) {
         return this.id_finally.id_int(var1);
      } else {
         rcd_3 var2 = new rcd_3();
         this.id_class(var1, var2);
         return var2;
      }
   }

   public void id_class(ev_3 var1, int var2) {
      this.id_int();
      if (!this.id_finally.id_byte("Enchantments", 9)) {
         this.id_finally.id_class("Enchantments", new rcy_3());
      }

      rcy_3 var3 = this.id_finally.id_protected("Enchantments", 10);
      rcd_3 var4 = new rcd_3();
      var4.id_class("id", String.valueOf(rVL.id_boolean.id_break(var1)));
      var4.id_class("lvl", (short)((byte)var2));
      var3.add(var4);
   }

   public void id_class(rYB var1, an_3 var2, int var3, boolean var4) {
      if (this.id_private > 0) {
         this.id_private--;
      }

      if (this.id_break() != null) {
         this.id_break().id_class(this, var1, var2, var3, var4);
      }
   }

   public void id_class(rYB var1, rhd_3 var2, int var3) {
      var2.id_class(rlB_2.id_break.id_break(this.id_break()), var3);
      this.id_break().id_break(this, var1, var2);
   }

   public void id_class(rYB var1, iB_2 var2, int var3) {
      this.id_break().id_class(this, var1, var2, var3);
   }

   public boolean id_class(rlQ_2 var1, ryw_3 var2) {
      if (id_class(var2, this.id_volatile)) {
         return this.id_final;
      } else {
         this.id_volatile = var2;
         if (this.id_final() && this.id_finally.id_byte("CanDestroy", 9)) {
            rcy_3 var3 = this.id_finally.id_protected("CanDestroy", 8);

            for (int var4 = 0; var4 < var3.size(); var4++) {
               String var5 = var3.id_implements(var4);

               try {
                  Predicate var6 = RO.id_class().id_class(new StringReader(var5)).create(var1);
                  if (var6.test(var2)) {
                     this.id_final = true;
                     return true;
                  }
               } catch (CommandSyntaxException var7) {
               }
            }
         }

         this.id_final = false;
         return false;
      }
   }

   public void id_class(an_3 var1) {
      this.id_native = var1;
   }

   private static boolean id_class(int var0, rdC_2 var1) {
      return (var0 & var1.id_class()) == 0;
   }

   public void id_class(String var1, rcZ_2 var2) {
      this.id_int().id_class(var1, var2);
   }

   public void id_class(rdC_2 var1) {
      rcd_3 var2 = this.id_int();
      var2.id_break("HideFlags", var2.id_private("HideFlags") | var1.id_class());
   }

   public static void id_class(List<rgP_2> var0, rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.id_class(var2);
         rVL.id_boolean.id_break(rqO_2.id_break(var3.id_native("id"))).ifPresent(var2x -> var0.add(var2x.id_protected(var3.id_private("lvl"))));
      }
   }

   public Multimap<iJ_2, ix_3> id_class(rXQ var1) {
      Object var2;
      if (this.id_final() && this.id_finally.id_byte("AttributeModifiers", 9)) {
         var2 = HashMultimap.create();
         rcy_3 var3 = this.id_finally.id_protected("AttributeModifiers", 10);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            rcd_3 var5 = var3.id_class(var4);
            if (!var5.id_byte("Slot", 8) || var5.id_native("Slot").equals(var1.id_protected())) {
               Optional var6 = rVL.O.id_break(rqO_2.id_break(var5.id_native("AttributeName")));
               if (var6.isPresent()) {
                  ix_3 var7 = ix_3.id_class(var5);
                  if (var7 != null && var7.id_class().getLeastSignificantBits() != 0L && var7.id_class().getMostSignificantBits() != 0L) {
                     var2.put((iJ_2)var6.get(), var7);
                  }
               }
            }
         }
      } else {
         var2 = this.id_break().id_class(var1);
      }

      return (Multimap<iJ_2, ix_3>)var2;
   }

   public int id_class(rhd_3 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 45; var3++) {
         rdn_3 var4 = ((rhz_3)var1.id_implements[1]).id_extends(var3);
         if (var4.id_break() == this.id_break()) {
            var2 += var4.id_char();
         }
      }

      return var2;
   }

   public Map<ev_3, Integer> id_class(List<ev_3> var1) {
      return eA_2.id_class(this, var1);
   }

   public rdn_3 id_class(rgP_2 var1) {
      rcd_3 var2 = this.id_class("display");
      if (var1 != null) {
         var2.id_class("Name", rgB_2.id_class(var1));
      } else {
         var2.id_continue("Name");
      }

      return this;
   }

   public List<rgP_2> id_class(rhd_3 var1, VD var2) {
      ArrayList var3 = Lists.newArrayList();
      rVi_1 var4 = new rgN_2("").id_class(this.id_continue()).id_class(this.id_synchronized().color);
      if (this.id_this()) {
         var4.id_class(rgF_2.ITALIC);
      }

      var3.add(var4);
      if (!var2.id_class() && !this.id_this() && this.id_break() == rdy_3.JX) {
         var3.add(new rgN_2("#" + rxI_2.id_protected(this)).id_class(rgF_2.GRAY));
      }

      int var5 = this.id_boolean();
      if (id_class(var5, rdC_2.ADDITIONAL)) {
         this.id_break().id_class(this, var1 == null ? null : (rYB)var1.id_throws[7], var3, var2);
      }

      if (this.id_final()) {
         if (id_class(var5, rdC_2.ENCHANTMENTS)) {
            id_class(var3, this.id_new());
         }

         if (this.id_finally.id_byte("display", 10)) {
            rcd_3 var6 = this.id_finally.id_int("display");
            if (id_class(var5, rdC_2.DYE) && var6.id_byte("color", 99)) {
               if (var2.id_class()) {
                  var3.add(new rgn_3("item.color", new Object[]{String.format("#%06X", var6.id_private("color"))}).id_class(rgF_2.GRAY));
               } else {
                  var3.add(new rgn_3("item.dyed").id_class(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}));
               }
            }

            if (var6.id_protected("Lore") == 9) {
               rcy_3 var7 = var6.id_protected("Lore", 8);

               for (int var8 = 0; var8 < var7.size(); var8++) {
                  String var9 = var7.id_implements(var8);

                  try {
                     rVi_1 var10 = rgB_2.id_class(var9);
                     if (var10 != null) {
                        rVi_1 var11 = rgv_3.id_class(var10, id_case);
                        var3.add(var11);
                     }
                  } catch (JsonParseException var19) {
                     var6.id_continue("Lore");
                  }
               }
            }
         }
      }

      if (id_class(var5, rdC_2.MODIFIERS)) {
         for (rXQ var29 : rXQ.values()) {
            Multimap var30 = this.id_class(var29);
            if (!var30.isEmpty()) {
               var3.add(rgN_2.id_byte);
               var3.add(new rgn_3("item.modifiers." + var29.id_protected()).id_class(rgF_2.GRAY));

               for (Entry var12 : var30.entries()) {
                  ix_3 var13 = (ix_3)var12.getValue();
                  double var14 = var13.id_protected();
                  boolean var16 = false;
                  if (var1 != null) {
                     if (var13.id_class() == rdb_3.id_case) {
                        var14 += var1.id_break(iQ_2.id_case);
                        var14 += (double)eA_2.id_class(this, aL_2.id_class);
                        var16 = true;
                     } else if (var13.id_class() == rdb_3.id_catch) {
                        var14 += var1.id_break(iQ_2.id_private);
                        var16 = true;
                     }
                  }

                  double var17;
                  if (var13.id_byte() == id_3.MULTIPLY_BASE || var13.id_byte() == id_3.MULTIPLY_TOTAL) {
                     var17 = var14 * 100.0;
                  } else if (((iJ_2)var12.getKey()).equals(iQ_2.id_byte)) {
                     var17 = var14 * 10.0;
                  } else {
                     var17 = var14;
                  }

                  if (var16) {
                     var3.add(
                        new rgN_2(" ")
                           .id_class(
                              new rgn_3(
                                 "attribute.modifier.equals." + var13.id_byte().id_class(),
                                 new Object[]{id_byte.format(var17), new rgn_3(((iJ_2)var12.getKey()).id_byte())}
                              )
                           )
                           .id_class(rgF_2.DARK_GREEN)
                     );
                  } else if (var14 > 0.0) {
                     var3.add(
                        new rgn_3(
                              "attribute.modifier.plus." + var13.id_byte().id_class(),
                              new Object[]{id_byte.format(var17), new rgn_3(((iJ_2)var12.getKey()).id_byte())}
                           )
                           .id_class(rgF_2.BLUE)
                     );
                  } else if (var14 < 0.0) {
                     var17 *= -1.0;
                     var3.add(
                        new rgn_3(
                              "attribute.modifier.take." + var13.id_byte().id_class(),
                              new Object[]{id_byte.format(var17), new rgn_3(((iJ_2)var12.getKey()).id_byte())}
                           )
                           .id_class(rgF_2.RED)
                     );
                  }
               }
            }
         }
      }

      if (this.id_final()) {
         if (id_class(var5, rdC_2.UNBREAKABLE) && this.id_finally.id_new("Unbreakable")) {
            var3.add(new rgn_3("item.unbreakable").id_class(rgF_2.BLUE));
         }

         if (id_class(var5, rdC_2.CAN_DESTROY) && this.id_finally.id_byte("CanDestroy", 9)) {
            rcy_3 var21 = this.id_finally.id_protected("CanDestroy", 8);
            if (!var21.isEmpty()) {
               var3.add(rgN_2.id_byte);
               var3.add(new rgn_3("item.canBreak").id_class(rgF_2.GRAY));

               for (int var25 = 0; var25 < var21.size(); var25++) {
                  var3.addAll(id_throws(var21.id_implements(var25)));
               }
            }
         }

         if (id_class(var5, rdC_2.CAN_PLACE) && this.id_finally.id_byte("CanPlaceOn", 9)) {
            rcy_3 var22 = this.id_finally.id_protected("CanPlaceOn", 8);
            if (!var22.isEmpty()) {
               var3.add(rgN_2.id_byte);
               var3.add(new rgn_3("item.canPlace").id_class(rgF_2.GRAY));

               for (int var26 = 0; var26 < var22.size(); var26++) {
                  var3.addAll(id_throws(var22.id_implements(var26)));
               }
            }
         }
      }

      if (var2.id_class()) {
         if (this.id_case()) {
            var3.add(new rgn_3("item.durability", new Object[]{this.id_private() - this.id_catch(), this.id_private()}));
         }

         var3.add(new rgN_2(rVL.id_for.id_break(this.id_break()).toString()).id_class(rgF_2.DARK_GRAY));
         if (this.id_final()) {
            var3.add(new rgn_3("item.nbt_tags", new Object[]{this.id_finally.id_protected().size()}).id_class(rgF_2.DARK_GRAY).id_break(":"));

            for (String var27 : this.id_finally.id_protected()) {
               var3.add(new rgN_2(" - ").id_break(var27).id_class(rgF_2.DARK_GRAY));
            }
         }
      }

      return var3;
   }

   public void id_class(rYB var1, xc_3 var2, rfH_2 var3, rhd_3 var4) {
      rdb_3 var5 = this.id_break();
      if (var5.id_class(this, var1, var2, var3, var4)) {
         var4.id_class(rlB_2.id_byte.id_break(var5));
      }
   }

   public ryZ_2 id_class(rhd_3 var1, iB_2 var2, rpm_3 var3) {
      return this.id_break().id_class(this, var1, var2, var3);
   }

   public rdn_3 id_class(int var1) {
      int var2 = Math.min(var1, this.id_catch);
      rdn_3 var3 = this.id_implements();
      var3.id_throws(var2);
      this.id_catch(var2);
      return var3;
   }

   public static boolean id_class(rdn_3 var0, rdn_3 var1) {
      if (var0.id_class() && var1.id_class()) {
         return true;
      } else if (var0.id_class() || var1.id_class()) {
         return false;
      } else {
         return var0.id_finally == null && var1.id_finally != null ? false : var0.id_finally == null || var0.id_finally.equals(var1.id_finally);
      }
   }

   public static boolean id_class(rdn_3 var0, rdn_3 var1, Set<String> var2) {
      if (var0.id_class() && var1.id_class()) {
         return true;
      } else if (var0.id_class() || var1.id_class()) {
         return false;
      } else {
         return var0.id_finally == null && var1.id_finally != null ? false : var0.id_finally == null || var0.id_finally.id_class(var1.id_finally, var2);
      }
   }

   public boolean id_class() {
      if (this == id_break) {
         return true;
      } else {
         return this.id_break() != null && this.id_break() != rdy_3.id_class ? this.id_catch <= 0 : true;
      }
   }

   public boolean id_class(int var1, Random var2, rhN_2 var3) {
      if (!this.id_throws()) {
         return false;
      } else {
         if (var1 > 0) {
            int var4 = eA_2.id_class(eY_2.id_synchronized, this);
            int var5 = 0;

            for (int var6 = 0; var4 > 0 && var6 < var1; var6++) {
               if (aQ_2.id_class(this, var4, var2)) {
                  var5++;
               }
            }

            var1 -= var5;
            if (var1 <= 0) {
               return false;
            }
         }

         if (var3 != null && var1 != 0) {
            Oo_1.id_this.id_class(var3, this, this.id_catch() + var1);
         }

         int var7 = this.id_catch() + var1;
         this.id_break(var7);
         return var7 >= this.id_private();
      }
   }

   public <T extends iB_2> void id_class(int var1, T var2, Consumer<T> var3) {
      if (!((rYB)var2.id_throws[7]).id_continue
         && (!(var2 instanceof rhd_3) || !((rhx_3)((rhd_3)var2).id_implements[18]).id_protected)
         && this.id_throws()
         && this.id_class(var1, var2.Sa(), var2 instanceof rhN_2 ? (rhN_2)var2 : null)) {
         var3.accept(var2);
         rdb_3 var4 = this.id_break();
         this.id_catch(1);
         if (var2 instanceof rhd_3) {
            ((rhd_3)var2).id_class(rlB_2.id_protected.id_break(var4));
         }

         this.id_break(0);
      }
   }

   public void id_class(iB_2 var1, rhd_3 var2) {
      rdb_3 var3 = this.id_break();
      if (var3.id_class(this, var1, var2)) {
         var2.id_class(rlB_2.id_byte.id_break(var3));
      }
   }

   public ryZ_2 id_class(rdH_2 var1) {
      rhd_3 var2 = var1.id_final();
      rfH_2 var3 = var1.id_class();
      ryw_3 var4 = new ryw_3(var1.id_int(), var3, false);
      if (var2 != null && !((rhx_3)var2.id_implements[18]).id_throws && !this.id_break(var1.id_int().id_int(), var4)) {
         return ryZ_2.PASS;
      } else {
         rdb_3 var5 = this.id_break();
         ryZ_2 var6 = var5.id_class(var1);
         if (var2 != null && var6.id_class()) {
            var2.id_class(rlB_2.id_byte.id_break(var5));
         }

         return var6;
      }
   }

   public boolean id_class(rdn_3 var1) {
      return !var1.id_class() && this.id_break() == var1.id_break();
   }

   public static rdn_3 id_class(rcd_3 var0) {
      try {
         return new rdn_3(var0);
      } catch (RuntimeException var2) {
         id_throws.debug("Tried to load invalid item: {}", var0, var2);
         return id_break;
      }
   }

   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rym_3 var4 = this.id_break().id_class(var1, var2, var3);
      if (var2 == (cb_3)QY.id_instanceof().id_class[57]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAA.id_class(var4, var3));
      }

      return var4;
   }

   public boolean id_class(rdn_3 var1, Set<String> var2) {
      return this.id_break() != var1.id_break() ? false : id_class(this, var1, var2);
   }

   public rdn_3 id_class(rYB var1, iB_2 var2) {
      rdb_3 var3 = this.id_break();
      return var3.id_class(this, var1, var2);
   }

   public float id_class(xc_3 var1) {
      return this.id_break().id_class(this, var1);
   }

   public String id_default() {
      return this.id_continue;
   }

   public int id_short() {
      return this.id_new;
   }

   public rqA_2 id_void() {
      return this.id_break().V_();
   }

   public rdb_3 id_break() {
      return this.id_extends ? rdy_3.id_class : this.id_implements;
   }

   public rcd_3 id_break(rcd_3 var1) {
      rqO_2 var2 = rVL.id_for.id_break(this.id_break());
      var1.id_class("id", var2 == null ? "minecraft:air" : var2.toString());
      var1.id_class("Count", (byte)this.id_catch);
      if (this.id_finally != null) {
         var1.id_class("tag", this.id_finally.id_catch());
      }

      return var1;
   }

   public void id_break(rYB var1, iB_2 var2, int var3) {
      this.id_break().id_class(var1, var2, this, var3);
   }

   public void id_break(int var1) {
      this.id_int().id_break("Damage", Math.max(0, var1));
      this.id_const();
   }

   public static boolean id_break(rdn_3 var0, rdn_3 var1, Set<String> var2) {
      return var0 == var1 ? true : !var0.id_class() && !var1.id_class() && var0.id_class(var1, var2);
   }

   public rcd_3 id_break(String var1) {
      return this.id_finally != null && this.id_finally.id_byte(var1, 10) ? this.id_finally.id_int(var1) : null;
   }

   public static boolean id_break(rdn_3 var0, rdn_3 var1) {
      if (var0.id_class() && var1.id_class()) {
         return true;
      } else {
         return !var0.id_class() && !var1.id_class() ? var0.id_byte(var1) : false;
      }
   }

   public boolean id_break(xc_3 var1) {
      return this.id_break().id_break(var1);
   }

   public boolean id_break(rdn_3 var1) {
      return !this.id_throws() ? this.id_class(var1) : !var1.id_class() && this.id_break() == var1.id_break();
   }

   public boolean id_break(rlQ_2 var1, ryw_3 var2) {
      if (id_class(var2, this.id_package)) {
         return this.id_int;
      } else {
         this.id_package = var2;
         if (this.id_final() && this.id_finally.id_byte("CanPlaceOn", 9)) {
            rcy_3 var3 = this.id_finally.id_protected("CanPlaceOn", 8);

            for (int var4 = 0; var4 < var3.size(); var4++) {
               String var5 = var3.id_implements(var4);

               try {
                  Predicate var6 = RO.id_class().id_class(new StringReader(var5)).create(var1);
                  if (var6.test(var2)) {
                     this.id_int = true;
                     return true;
                  }
               } catch (CommandSyntaxException var7) {
               }
            }
         }

         this.id_int = false;
         return false;
      }
   }

   public void id_throws(int var1) {
      this.id_catch = var1;
      this.id_strictfp();
   }

   public boolean id_throws() {
      if (!this.id_extends && this.id_break().id_finally() > 0) {
         rcd_3 var1 = this.id_package();
         return var1 == null || !var1.id_new("Unbreakable");
      } else {
         return false;
      }
   }

   private static Collection<rgP_2> id_throws(String var0) {
      try {
         Rk_1 var1 = new Rk_1(new StringReader(var0), true).id_class(true);
         xc_3 var2 = var1.id_break();
         rqO_2 var3 = var1.id_protected();
         boolean var4 = var2 != null;
         boolean var5 = var3 != null;
         if (var4 || var5) {
            if (var4) {
               return Lists.newArrayList(new rgP_2[]{var2.id_break().id_native().id_class(rgF_2.DARK_GRAY)});
            }

            rlb_3 var6 = rls_3.id_class().id_class(var3);
            if (var6 != null) {
               List var7 = var6.id_class();
               if (!var7.isEmpty()) {
                  return var7.stream().<rVi_1>map(xd_3::id_native).map(var0x -> var0x.id_class(rgF_2.DARK_GRAY)).collect(Collectors.toList());
               }
            }
         }
      } catch (CommandSyntaxException var8) {
      }

      return Lists.newArrayList(new rgP_2[]{new rgN_2("missingno").id_class(rgF_2.DARK_GRAY)});
   }

   public String id_finally() {
      return this.id_break().id_case(this);
   }

   public void id_catch(int var1) {
      this.id_case(-var1);
   }

   public int id_catch() {
      return this.id_finally == null ? 0 : this.id_finally.id_private("Damage");
   }

   public int id_extends() {
      return this.id_break().id_break(this);
   }

   public boolean id_goto() {
      return this.id_native instanceof rsG_2;
   }

   public boolean id_case() {
      return this.id_throws() && this.id_catch() > 0;
   }

   public void id_case(int var1) {
      this.id_throws(this.id_catch + var1);
   }

   private void id_const() {
      this.id_new = this.id_implements == null ? -1 : this.id_implements.hashCode() + this.id_catch();
   }

   public rgP_2 id_continue() {
      rcd_3 var1 = this.id_break("display");
      if (var1 != null && var1.id_byte("Name", 8)) {
         try {
            rVi_1 var2 = rgB_2.id_class(var1.id_native("Name"));
            if (var2 != null) {
               return var2;
            }

            var1.id_continue("Name");
         } catch (JsonParseException var3) {
            var1.id_continue("Name");
         }
      }

      return this.id_break().id_implements(this);
   }

   public boolean id_else() {
      return this.id_break().id_throws(this);
   }

   public rdn_3 id_implements() {
      if (this.id_class()) {
         return id_break;
      } else {
         rdn_3 var1 = new rdn_3(this.id_break(), this.id_catch);
         var1.id_protected(this.id_interface());
         if (this.id_finally != null) {
            var1.id_finally = this.id_finally.id_catch();
         }

         return var1;
      }
   }

   public rdn_3 id_import() {
      this.id_class(eY_2.id_import, 1);
      return this;
   }

   public int id_instanceof() {
      return this.id_final() && this.id_finally.id_byte("RepairCost", 3) ? this.id_finally.id_private("RepairCost") : 0;
   }

   public rcy_3 id_new() {
      return this.id_finally != null ? this.id_finally.id_protected("Enchantments", 10) : new rcy_3();
   }

   public rcd_3 id_package() {
      return this.id_finally;
   }

   public boolean id_return() {
      return !this.id_break().id_class(this) ? false : !this.id_public();
   }

   public void id_super() {
      rcd_3 var1 = this.id_break("display");
      if (var1 != null) {
         var1.id_continue("Name");
         if (var1.id_case()) {
            this.id_byte("display");
         }
      }

      if (this.id_finally != null && this.id_finally.id_case()) {
         this.id_finally = null;
      }
   }

   public rgP_2 id_throw() {
      rVi_1 var1 = new rgN_2("").id_class(this.id_continue());
      if (this.id_this()) {
         var1.id_class(rgF_2.ITALIC);
      }

      rVi_1 var2 = rgv_3.id_class(var1);
      if (!this.id_extends) {
         var2.id_class(this.id_synchronized().color).id_class(var1x -> var1x.id_class(new rgy_3(rgp_3.id_break, new rgT_2(this))));
      }

      return var2;
   }

   public an_3 id_try() {
      return !this.id_extends ? this.id_native : null;
   }

   public rsG_2 id_while() {
      return this.id_native instanceof rsG_2 ? (rsG_2)this.id_try() : null;
   }

   public Map<ev_3, Integer> id_static() {
      return eA_2.id_class(this);
   }

   public boolean id_public() {
      return this.id_finally != null && this.id_finally.id_byte("Enchantments", 9) ? !this.id_finally.id_protected("Enchantments", 10).isEmpty() : false;
   }

   public void id_protected(int var1) {
      this.id_private = var1;
   }

   public static boolean id_protected(rdn_3 var0, rdn_3 var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.id_class() && !var1.id_class() ? var0.id_break(var1) : false;
      }
   }

   public boolean id_protected() {
      return this.id_byte() > 1 && (!this.id_throws() || !this.id_case());
   }

   public boolean id_protected(String var1) {
      return this.id_final() ? this.id_finally.id_throws(var1) : false;
   }

   public int id_private() {
      return this.id_break().id_finally();
   }

   public int id_abstract() {
      return this.id_catch;
   }

   public boolean id_final() {
      return !this.id_extends && this.id_finally != null && !this.id_finally.id_case();
   }

   public boolean id_volatile() {
      return this.id_break().id_extends(this);
   }

   public rde_3 id_synchronized() {
      return this.id_break().id_finally(this);
   }

   public rkc_3 id_native() {
      return this.id_break().id_byte(this);
   }

   private void id_strictfp() {
      this.id_extends = false;
      this.id_extends = this.id_class();
   }
}
