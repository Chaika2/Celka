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
   public static final Codec<rdn_3> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rVL.for_.fieldOf("id").forGetter(var0x -> var0x.implements_),
               Codec.INT.fieldOf("Count").forGetter(var0x -> var0x.catch_),
               rcd_3.class_.optionalFieldOf("tag").forGetter(var0x -> Optional.ofNullable(var0x.finally_))
            )
            .apply(var0, rdn_3::new)
   );
   private static final Logger throws_ = LogManager.getLogger();
   public static final rdn_3 break_ = new rdn_3((rdb_3)null);
   public static final DecimalFormat byte_ = rqR_2.class_(
      new DecimalFormat("#.##"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private static final rgc_3 case_ = rgc_3.class_.class_(rgF_2.DARK_PURPLE).break_(true);
   private int catch_;
   private int private_;
   @Deprecated
   private final rdb_3 implements_;
   private rcd_3 finally_;
   private boolean extends_;
   private an_3 native_;
   private ryw_3 volatile_;
   private boolean final_;
   private ryw_3 package_;
   private boolean int_;
   private int new_;
   private String continue_;
   public int protected_;

   private int boolean_() {
      return this.final_() && this.finally_.byte_("HideFlags", 99) ? this.finally_.private_("HideFlags") : 0;
   }

   public int char_() {
      return this.extends_ ? 0 : this.catch_;
   }

   private boolean byte_(rdn_3 var1) {
      if (this.catch_ != var1.catch_) {
         return false;
      } else if (this.break_() != var1.break_()) {
         return false;
      } else {
         return this.finally_ == null && var1.finally_ != null ? false : this.finally_ == null || this.finally_.equals(var1.finally_);
      }
   }

   public void byte_(String var1) {
      if (this.finally_ != null && this.finally_.throws_(var1)) {
         this.finally_.continue_(var1);
         if (this.finally_.case_()) {
            this.finally_ = null;
         }
      }
   }

   public void byte_(int var1) {
      this.int_().break_("RepairCost", var1);
   }

   public void byte_(rcd_3 var1) {
      this.finally_ = var1;
      if (this.break_().extends_()) {
         this.break_(this.catch_());
      }
   }

   public int byte_() {
      return this.break_().implements_();
   }

   public static boolean byte_(rdn_3 var0, rdn_3 var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.class_() && !var1.class_() ? var0.class_(var1) : false;
      }
   }

   public rcd_3 int_() {
      if (this.finally_ == null) {
         this.byte_(new rcd_3());
      }

      return this.finally_;
   }

   public boolean long_() {
      return this.break_().super_();
   }

   public rqA_2 float_() {
      return this.break_().U_();
   }

   public rdn_3(rpL_2 var1) {
      this(var1, 1);
   }

   private rdn_3(rcd_3 var1) {
      this.implements_ = rVL.for_.class_(new rqO_2(var1.native_("id")));
      this.catch_ = var1.case_("Count");
      if (var1.byte_("tag", 10)) {
         this.finally_ = var1.int_("tag");
         this.break_().break_(var1);
      }

      if (this.break_().extends_()) {
         this.break_(this.catch_());
      }

      this.strictfp_();
      this.const_();
   }

   public rdn_3(rpL_2 var1, int var2) {
      this.implements_ = var1 == null ? null : var1.case_();
      this.catch_ = var2;
      if (this.implements_ != null && this.implements_.extends_()) {
         this.break_(this.catch_());
      }

      this.strictfp_();
      this.const_();
      this.continue_ = this.continue_().byte_();
   }

   private rdn_3(rpL_2 var1, int var2, Optional<rcd_3> var3) {
      this(var1, var2);
      var3.ifPresent(this::byte_);
      this.const_();
   }

   @Override
   public String toString() {
      return this.break_() + " x" + this.catch_;
   }

   public boolean this_() {
      rcd_3 var1 = this.break_("display");
      return var1 != null && var1.byte_("Name", 8);
   }

   public int interface_() {
      return this.private_;
   }

   public void class_(iJ_2 var1, ix_3 var2, rXQ var3) {
      this.int_();
      if (!this.finally_.byte_("AttributeModifiers", 9)) {
         this.finally_.class_("AttributeModifiers", new rcy_3());
      }

      rcy_3 var4 = this.finally_.protected_("AttributeModifiers", 10);
      rcd_3 var5 = var2.throws_();
      var5.class_("AttributeName", rVL.O.break_(var1).toString());
      if (var3 != null) {
         var5.class_("Slot", var3.protected_());
      }

      var4.add(var5);
   }

   private static boolean class_(ryw_3 var0, ryw_3 var1) {
      if (var1 == null || var0.class_() != var1.class_()) {
         return false;
      } else if (var0.break_() == null && var1.break_() == null) {
         return true;
      } else {
         return var0.break_() != null && var1.break_() != null ? Objects.equals(var0.break_().class_(new rcd_3()), var1.break_().class_(new rcd_3())) : false;
      }
   }

   public rcd_3 class_(String var1) {
      if (this.finally_ != null && this.finally_.byte_(var1, 10)) {
         return this.finally_.int_(var1);
      } else {
         rcd_3 var2 = new rcd_3();
         this.class_(var1, var2);
         return var2;
      }
   }

   public void class_(ev_3 var1, int var2) {
      this.int_();
      if (!this.finally_.byte_("Enchantments", 9)) {
         this.finally_.class_("Enchantments", new rcy_3());
      }

      rcy_3 var3 = this.finally_.protected_("Enchantments", 10);
      rcd_3 var4 = new rcd_3();
      var4.class_("id", String.valueOf(rVL.boolean_.break_(var1)));
      var4.class_("lvl", (short)((byte)var2));
      var3.add(var4);
   }

   public void class_(rYB var1, an_3 var2, int var3, boolean var4) {
      if (this.private_ > 0) {
         this.private_--;
      }

      if (this.break_() != null) {
         this.break_().class_(this, var1, var2, var3, var4);
      }
   }

   public void class_(rYB var1, rhd_3 var2, int var3) {
      var2.class_(rlB_2.break_.break_(this.break_()), var3);
      this.break_().break_(this, var1, var2);
   }

   public void class_(rYB var1, iB_2 var2, int var3) {
      this.break_().class_(this, var1, var2, var3);
   }

   public boolean class_(rlQ_2 var1, ryw_3 var2) {
      if (class_(var2, this.volatile_)) {
         return this.final_;
      } else {
         this.volatile_ = var2;
         if (this.final_() && this.finally_.byte_("CanDestroy", 9)) {
            rcy_3 var3 = this.finally_.protected_("CanDestroy", 8);

            for (int var4 = 0; var4 < var3.size(); var4++) {
               String var5 = var3.implements_(var4);

               try {
                  Predicate var6 = RO.class_().class_(new StringReader(var5)).create(var1);
                  if (var6.test(var2)) {
                     this.final_ = true;
                     return true;
                  }
               } catch (CommandSyntaxException var7) {
               }
            }
         }

         this.final_ = false;
         return false;
      }
   }

   public void class_(an_3 var1) {
      this.native_ = var1;
   }

   private static boolean class_(int var0, rdC_2 var1) {
      return (var0 & var1.class_()) == 0;
   }

   public void class_(String var1, rcZ_2 var2) {
      this.int_().class_(var1, var2);
   }

   public void class_(rdC_2 var1) {
      rcd_3 var2 = this.int_();
      var2.break_("HideFlags", var2.private_("HideFlags") | var1.class_());
   }

   public static void class_(List<rgP_2> var0, rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.class_(var2);
         rVL.boolean_.break_(rqO_2.break_(var3.native_("id"))).ifPresent(var2x -> var0.add(var2x.protected_(var3.private_("lvl"))));
      }
   }

   public Multimap<iJ_2, ix_3> class_(rXQ var1) {
      Object var2;
      if (this.final_() && this.finally_.byte_("AttributeModifiers", 9)) {
         var2 = HashMultimap.create();
         rcy_3 var3 = this.finally_.protected_("AttributeModifiers", 10);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            rcd_3 var5 = var3.class_(var4);
            if (!var5.byte_("Slot", 8) || var5.native_("Slot").equals(var1.protected_())) {
               Optional var6 = rVL.O.break_(rqO_2.break_(var5.native_("AttributeName")));
               if (var6.isPresent()) {
                  ix_3 var7 = ix_3.class_(var5);
                  if (var7 != null && var7.class_().getLeastSignificantBits() != 0L && var7.class_().getMostSignificantBits() != 0L) {
                     var2.put((iJ_2)var6.get(), var7);
                  }
               }
            }
         }
      } else {
         var2 = this.break_().class_(var1);
      }

      return (Multimap<iJ_2, ix_3>)var2;
   }

   public int class_(rhd_3 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < 45; var3++) {
         rdn_3 var4 = ((rhz_3)var1.implements_[1]).extends_(var3);
         if (var4.break_() == this.break_()) {
            var2 += var4.char_();
         }
      }

      return var2;
   }

   public Map<ev_3, Integer> class_(List<ev_3> var1) {
      return eA_2.class_(this, var1);
   }

   public rdn_3 class_(rgP_2 var1) {
      rcd_3 var2 = this.class_("display");
      if (var1 != null) {
         var2.class_("Name", rgB_2.class_(var1));
      } else {
         var2.continue_("Name");
      }

      return this;
   }

   public List<rgP_2> class_(rhd_3 var1, VD var2) {
      ArrayList var3 = Lists.newArrayList();
      rVi_1 var4 = new rgN_2("").class_(this.continue_()).class_(this.synchronized_().color);
      if (this.this_()) {
         var4.class_(rgF_2.ITALIC);
      }

      var3.add(var4);
      if (!var2.class_() && !this.this_() && this.break_() == rdy_3.JX) {
         var3.add(new rgN_2("#" + rxI_2.protected_(this)).class_(rgF_2.GRAY));
      }

      int var5 = this.boolean_();
      if (class_(var5, rdC_2.ADDITIONAL)) {
         this.break_().class_(this, var1 == null ? null : (rYB)var1.throws_[7], var3, var2);
      }

      if (this.final_()) {
         if (class_(var5, rdC_2.ENCHANTMENTS)) {
            class_(var3, this.new_());
         }

         if (this.finally_.byte_("display", 10)) {
            rcd_3 var6 = this.finally_.int_("display");
            if (class_(var5, rdC_2.DYE) && var6.byte_("color", 99)) {
               if (var2.class_()) {
                  var3.add(new rgn_3("item.color", String.format("#%06X", var6.private_("color"))).class_(rgF_2.GRAY));
               } else {
                  var3.add(new rgn_3("item.dyed").class_(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}));
               }
            }

            if (var6.protected_("Lore") == 9) {
               rcy_3 var7 = var6.protected_("Lore", 8);

               for (int var8 = 0; var8 < var7.size(); var8++) {
                  String var9 = var7.implements_(var8);

                  try {
                     rVi_1 var10 = rgB_2.class_(var9);
                     if (var10 != null) {
                        rVi_1 var11 = rgv_3.class_(var10, case_);
                        var3.add(var11);
                     }
                  } catch (JsonParseException var19) {
                     var6.continue_("Lore");
                  }
               }
            }
         }
      }

      if (class_(var5, rdC_2.MODIFIERS)) {
         for (rXQ var29 : rXQ.values()) {
            Multimap var30 = this.class_(var29);
            if (!var30.isEmpty()) {
               var3.add(rgN_2.byte_);
               var3.add(new rgn_3("item.modifiers." + var29.protected_()).class_(rgF_2.GRAY));

               for (Entry var12 : var30.entries()) {
                  ix_3 var13 = (ix_3)var12.getValue();
                  double var14 = var13.protected_();
                  boolean var16 = false;
                  if (var1 != null) {
                     if (var13.class_() == rdb_3.case_) {
                        var14 += var1.break_(iQ_2.case_);
                        var14 += (double)eA_2.class_(this, aL_2.class_);
                        var16 = true;
                     } else if (var13.class_() == rdb_3.catch_) {
                        var14 += var1.break_(iQ_2.private_);
                        var16 = true;
                     }
                  }

                  double var17;
                  if (var13.byte_() == id_3.MULTIPLY_BASE || var13.byte_() == id_3.MULTIPLY_TOTAL) {
                     var17 = var14 * 100.0;
                  } else if (((iJ_2)var12.getKey()).equals(iQ_2.byte_)) {
                     var17 = var14 * 10.0;
                  } else {
                     var17 = var14;
                  }

                  if (var16) {
                     var3.add(
                        new rgN_2(" ")
                           .class_(
                              new rgn_3("attribute.modifier.equals." + var13.byte_().class_(), byte_.format(var17), new rgn_3(((iJ_2)var12.getKey()).byte_()))
                           )
                           .class_(rgF_2.DARK_GREEN)
                     );
                  } else if (var14 > 0.0) {
                     var3.add(
                        new rgn_3("attribute.modifier.plus." + var13.byte_().class_(), byte_.format(var17), new rgn_3(((iJ_2)var12.getKey()).byte_()))
                           .class_(rgF_2.BLUE)
                     );
                  } else if (var14 < 0.0) {
                     var17 *= -1.0;
                     var3.add(
                        new rgn_3("attribute.modifier.take." + var13.byte_().class_(), byte_.format(var17), new rgn_3(((iJ_2)var12.getKey()).byte_()))
                           .class_(rgF_2.RED)
                     );
                  }
               }
            }
         }
      }

      if (this.final_()) {
         if (class_(var5, rdC_2.UNBREAKABLE) && this.finally_.new_("Unbreakable")) {
            var3.add(new rgn_3("item.unbreakable").class_(rgF_2.BLUE));
         }

         if (class_(var5, rdC_2.CAN_DESTROY) && this.finally_.byte_("CanDestroy", 9)) {
            rcy_3 var21 = this.finally_.protected_("CanDestroy", 8);
            if (!var21.isEmpty()) {
               var3.add(rgN_2.byte_);
               var3.add(new rgn_3("item.canBreak").class_(rgF_2.GRAY));

               for (int var25 = 0; var25 < var21.size(); var25++) {
                  var3.addAll(throws_(var21.implements_(var25)));
               }
            }
         }

         if (class_(var5, rdC_2.CAN_PLACE) && this.finally_.byte_("CanPlaceOn", 9)) {
            rcy_3 var22 = this.finally_.protected_("CanPlaceOn", 8);
            if (!var22.isEmpty()) {
               var3.add(rgN_2.byte_);
               var3.add(new rgn_3("item.canPlace").class_(rgF_2.GRAY));

               for (int var26 = 0; var26 < var22.size(); var26++) {
                  var3.addAll(throws_(var22.implements_(var26)));
               }
            }
         }
      }

      if (var2.class_()) {
         if (this.case_()) {
            var3.add(new rgn_3("item.durability", this.private_() - this.catch_(), this.private_()));
         }

         var3.add(new rgN_2(rVL.for_.break_(this.break_()).toString()).class_(rgF_2.DARK_GRAY));
         if (this.final_()) {
            var3.add(new rgn_3("item.nbt_tags", this.finally_.protected_().size()).class_(rgF_2.DARK_GRAY).break_(":"));

            for (String var27 : this.finally_.protected_()) {
               var3.add(new rgN_2(" - ").break_(var27).class_(rgF_2.DARK_GRAY));
            }
         }
      }

      return var3;
   }

   public void class_(rYB var1, xc_3 var2, rfH_2 var3, rhd_3 var4) {
      rdb_3 var5 = this.break_();
      if (var5.class_(this, var1, var2, var3, var4)) {
         var4.class_(rlB_2.byte_.break_(var5));
      }
   }

   public ryZ_2 class_(rhd_3 var1, iB_2 var2, rpm_3 var3) {
      return this.break_().class_(this, var1, var2, var3);
   }

   public rdn_3 class_(int var1) {
      int var2 = Math.min(var1, this.catch_);
      rdn_3 var3 = this.implements_();
      var3.throws_(var2);
      this.catch_(var2);
      return var3;
   }

   public static boolean class_(rdn_3 var0, rdn_3 var1) {
      if (var0.class_() && var1.class_()) {
         return true;
      } else if (var0.class_() || var1.class_()) {
         return false;
      } else {
         return var0.finally_ == null && var1.finally_ != null ? false : var0.finally_ == null || var0.finally_.equals(var1.finally_);
      }
   }

   public static boolean class_(rdn_3 var0, rdn_3 var1, Set<String> var2) {
      if (var0.class_() && var1.class_()) {
         return true;
      } else if (var0.class_() || var1.class_()) {
         return false;
      } else {
         return var0.finally_ == null && var1.finally_ != null ? false : var0.finally_ == null || var0.finally_.class_(var1.finally_, var2);
      }
   }

   public boolean class_() {
      if (this == break_) {
         return true;
      } else {
         return this.break_() != null && this.break_() != rdy_3.class_ ? this.catch_ <= 0 : true;
      }
   }

   public boolean class_(int var1, Random var2, rhN_2 var3) {
      if (!this.throws_()) {
         return false;
      } else {
         if (var1 > 0) {
            int var4 = eA_2.class_(eY_2.synchronized_, this);
            int var5 = 0;

            for (int var6 = 0; var4 > 0 && var6 < var1; var6++) {
               if (aQ_2.class_(this, var4, var2)) {
                  var5++;
               }
            }

            var1 -= var5;
            if (var1 <= 0) {
               return false;
            }
         }

         if (var3 != null && var1 != 0) {
            Oo_1.this_.class_(var3, this, this.catch_() + var1);
         }

         int var7 = this.catch_() + var1;
         this.break_(var7);
         return var7 >= this.private_();
      }
   }

   public <T extends iB_2> void class_(int var1, T var2, Consumer<T> var3) {
      if (!((rYB)var2.throws_[7]).continue_
         && (!(var2 instanceof rhd_3) || !((rhx_3)((rhd_3)var2).implements_[18]).protected_)
         && this.throws_()
         && this.class_(var1, var2.Sa(), var2 instanceof rhN_2 ? (rhN_2)var2 : null)) {
         var3.accept(var2);
         rdb_3 var4 = this.break_();
         this.catch_(1);
         if (var2 instanceof rhd_3) {
            ((rhd_3)var2).class_(rlB_2.protected_.break_(var4));
         }

         this.break_(0);
      }
   }

   public void class_(iB_2 var1, rhd_3 var2) {
      rdb_3 var3 = this.break_();
      if (var3.class_(this, var1, var2)) {
         var2.class_(rlB_2.byte_.break_(var3));
      }
   }

   public ryZ_2 class_(rdH_2 var1) {
      rhd_3 var2 = var1.final_();
      rfH_2 var3 = var1.class_();
      ryw_3 var4 = new ryw_3(var1.int_(), var3, false);
      if (var2 != null && !((rhx_3)var2.implements_[18]).throws_ && !this.break_(var1.int_().int_(), var4)) {
         return ryZ_2.PASS;
      } else {
         rdb_3 var5 = this.break_();
         ryZ_2 var6 = var5.class_(var1);
         if (var2 != null && var6.class_()) {
            var2.class_(rlB_2.byte_.break_(var5));
         }

         return var6;
      }
   }

   public boolean class_(rdn_3 var1) {
      return !var1.class_() && this.break_() == var1.break_();
   }

   public static rdn_3 class_(rcd_3 var0) {
      try {
         return new rdn_3(var0);
      } catch (RuntimeException var2) {
         throws_.debug("Tried to load invalid item: {}", var0, var2);
         return break_;
      }
   }

   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rym_3 var4 = this.break_().class_(var1, var2, var3);
      if (var2 == (cb_3)QY.instanceof_().class_[57]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAA.class_(var4, var3));
      }

      return var4;
   }

   public boolean class_(rdn_3 var1, Set<String> var2) {
      return this.break_() != var1.break_() ? false : class_(this, var1, var2);
   }

   public rdn_3 class_(rYB var1, iB_2 var2) {
      rdb_3 var3 = this.break_();
      return var3.class_(this, var1, var2);
   }

   public float class_(xc_3 var1) {
      return this.break_().class_(this, var1);
   }

   public String default_() {
      return this.continue_;
   }

   public int short_() {
      return this.new_;
   }

   public rqA_2 void_() {
      return this.break_().V_();
   }

   public rdb_3 break_() {
      return this.extends_ ? rdy_3.class_ : this.implements_;
   }

   public rcd_3 break_(rcd_3 var1) {
      rqO_2 var2 = rVL.for_.break_(this.break_());
      var1.class_("id", var2 == null ? "minecraft:air" : var2.toString());
      var1.class_("Count", (byte)this.catch_);
      if (this.finally_ != null) {
         var1.class_("tag", this.finally_.catch_());
      }

      return var1;
   }

   public void break_(rYB var1, iB_2 var2, int var3) {
      this.break_().class_(var1, var2, this, var3);
   }

   public void break_(int var1) {
      this.int_().break_("Damage", Math.max(0, var1));
      this.const_();
   }

   public static boolean break_(rdn_3 var0, rdn_3 var1, Set<String> var2) {
      return var0 == var1 ? true : !var0.class_() && !var1.class_() && var0.class_(var1, var2);
   }

   public rcd_3 break_(String var1) {
      return this.finally_ != null && this.finally_.byte_(var1, 10) ? this.finally_.int_(var1) : null;
   }

   public static boolean break_(rdn_3 var0, rdn_3 var1) {
      if (var0.class_() && var1.class_()) {
         return true;
      } else {
         return !var0.class_() && !var1.class_() ? var0.byte_(var1) : false;
      }
   }

   public boolean break_(xc_3 var1) {
      return this.break_().break_(var1);
   }

   public boolean break_(rdn_3 var1) {
      return !this.throws_() ? this.class_(var1) : !var1.class_() && this.break_() == var1.break_();
   }

   public boolean break_(rlQ_2 var1, ryw_3 var2) {
      if (class_(var2, this.package_)) {
         return this.int_;
      } else {
         this.package_ = var2;
         if (this.final_() && this.finally_.byte_("CanPlaceOn", 9)) {
            rcy_3 var3 = this.finally_.protected_("CanPlaceOn", 8);

            for (int var4 = 0; var4 < var3.size(); var4++) {
               String var5 = var3.implements_(var4);

               try {
                  Predicate var6 = RO.class_().class_(new StringReader(var5)).create(var1);
                  if (var6.test(var2)) {
                     this.int_ = true;
                     return true;
                  }
               } catch (CommandSyntaxException var7) {
               }
            }
         }

         this.int_ = false;
         return false;
      }
   }

   public void throws_(int var1) {
      this.catch_ = var1;
      this.strictfp_();
   }

   public boolean throws_() {
      if (!this.extends_ && this.break_().finally_() > 0) {
         rcd_3 var1 = this.package_();
         return var1 == null || !var1.new_("Unbreakable");
      } else {
         return false;
      }
   }

   private static Collection<rgP_2> throws_(String var0) {
      try {
         Rk_1 var1 = new Rk_1(new StringReader(var0), true).class_(true);
         xc_3 var2 = var1.break_();
         rqO_2 var3 = var1.protected_();
         boolean var4 = var2 != null;
         boolean var5 = var3 != null;
         if (var4 || var5) {
            if (var4) {
               return Lists.newArrayList(new rgP_2[]{var2.break_().native_().class_(rgF_2.DARK_GRAY)});
            }

            rlb_3 var6 = rls_3.class_().class_(var3);
            if (var6 != null) {
               List var7 = var6.class_();
               if (!var7.isEmpty()) {
                  return var7.stream().map(xd_3::native_).map(var0x -> var0x.class_(rgF_2.DARK_GRAY)).collect(Collectors.toList());
               }
            }
         }
      } catch (CommandSyntaxException var8) {
      }

      return Lists.newArrayList(new rgP_2[]{new rgN_2("missingno").class_(rgF_2.DARK_GRAY)});
   }

   public String finally_() {
      return this.break_().case_(this);
   }

   public void catch_(int var1) {
      this.case_(-var1);
   }

   public int catch_() {
      return this.finally_ == null ? 0 : this.finally_.private_("Damage");
   }

   public int extends_() {
      return this.break_().break_(this);
   }

   public boolean goto_() {
      return this.native_ instanceof rsG_2;
   }

   public boolean case_() {
      return this.throws_() && this.catch_() > 0;
   }

   public void case_(int var1) {
      this.throws_(this.catch_ + var1);
   }

   private void const_() {
      this.new_ = this.implements_ == null ? -1 : this.implements_.hashCode() + this.catch_();
   }

   public rgP_2 continue_() {
      rcd_3 var1 = this.break_("display");
      if (var1 != null && var1.byte_("Name", 8)) {
         try {
            rVi_1 var2 = rgB_2.class_(var1.native_("Name"));
            if (var2 != null) {
               return var2;
            }

            var1.continue_("Name");
         } catch (JsonParseException var3) {
            var1.continue_("Name");
         }
      }

      return this.break_().implements_(this);
   }

   public boolean else_() {
      return this.break_().throws_(this);
   }

   public rdn_3 implements_() {
      if (this.class_()) {
         return break_;
      } else {
         rdn_3 var1 = new rdn_3(this.break_(), this.catch_);
         var1.protected_(this.interface_());
         if (this.finally_ != null) {
            var1.finally_ = this.finally_.catch_();
         }

         return var1;
      }
   }

   public rdn_3 import_() {
      this.class_(eY_2.import_, 1);
      return this;
   }

   public int instanceof_() {
      return this.final_() && this.finally_.byte_("RepairCost", 3) ? this.finally_.private_("RepairCost") : 0;
   }

   public rcy_3 new_() {
      return this.finally_ != null ? this.finally_.protected_("Enchantments", 10) : new rcy_3();
   }

   public rcd_3 package_() {
      return this.finally_;
   }

   public boolean return_() {
      return !this.break_().class_(this) ? false : !this.public_();
   }

   public void super_() {
      rcd_3 var1 = this.break_("display");
      if (var1 != null) {
         var1.continue_("Name");
         if (var1.case_()) {
            this.byte_("display");
         }
      }

      if (this.finally_ != null && this.finally_.case_()) {
         this.finally_ = null;
      }
   }

   public rgP_2 throw_() {
      rVi_1 var1 = new rgN_2("").class_(this.continue_());
      if (this.this_()) {
         var1.class_(rgF_2.ITALIC);
      }

      rVi_1 var2 = rgv_3.class_((rgP_2)var1);
      if (!this.extends_) {
         var2.class_(this.synchronized_().color).class_(var1x -> var1x.class_(new rgy_3(rgp_3.break_, new rgT_2(this))));
      }

      return var2;
   }

   public an_3 try_() {
      return !this.extends_ ? this.native_ : null;
   }

   public rsG_2 while_() {
      return this.native_ instanceof rsG_2 ? (rsG_2)this.try_() : null;
   }

   public Map<ev_3, Integer> static_() {
      return eA_2.class_(this);
   }

   public boolean public_() {
      return this.finally_ != null && this.finally_.byte_("Enchantments", 9) ? !this.finally_.protected_("Enchantments", 10).isEmpty() : false;
   }

   public void protected_(int var1) {
      this.private_ = var1;
   }

   public static boolean protected_(rdn_3 var0, rdn_3 var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.class_() && !var1.class_() ? var0.break_(var1) : false;
      }
   }

   public boolean protected_() {
      return this.byte_() > 1 && (!this.throws_() || !this.case_());
   }

   public boolean protected_(String var1) {
      return this.final_() ? this.finally_.throws_(var1) : false;
   }

   public int private_() {
      return this.break_().finally_();
   }

   public int abstract_() {
      return this.catch_;
   }

   public boolean final_() {
      return !this.extends_ && this.finally_ != null && !this.finally_.case_();
   }

   public boolean volatile_() {
      return this.break_().extends_(this);
   }

   public rde_3 synchronized_() {
      return this.break_().finally_(this);
   }

   public rkc_3 native_() {
      return this.break_().byte_(this);
   }

   private void strictfp_() {
      this.extends_ = false;
      this.extends_ = this.class_();
   }
}
