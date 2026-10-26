package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class rrEr_1 {
   private static final rgP_2 id_class = new rgn_3("event.minecraft.raid");
   private static final rgP_2 id_break = new rgn_3("event.minecraft.raid.victory");
   private static final rgP_2 id_byte = new rgn_3("event.minecraft.raid.defeat");
   private static final rgP_2 id_protected = id_class.id_case().id_break(" - ").id_class(id_break);
   private static final rgP_2 id_throws = id_class.id_case().id_break(" - ").id_class(id_byte);
   private final Map<Integer, rEB> id_case = Maps.newHashMap();
   private final Map<Integer, Set<rEB>> id_catch = Maps.newHashMap();
   private final Set<UUID> id_private = Sets.newHashSet();
   private long id_implements;
   private rfH_2 id_finally;
   private final rrEm_1 id_extends;
   private boolean id_native;
   private final int id_volatile;
   private float id_final;
   private int id_package;
   private boolean id_int;
   private int id_new;
   private final rrEQ id_continue = new rrEQ(id_class, rRb_1.RED, rRM.NOTCHED_10);
   private int id_super;
   private int id_this;
   private final Random id_else = new Random();
   private final int id_synchronized;
   private rrEB id_return;
   private int id_public;
   private Optional<rfH_2> id_goto = Optional.empty();

   private boolean id_char() {
      return this.id_this == 0 && (this.id_new < this.id_synchronized || this.id_throw()) && this.id_int() == 0;
   }

   private Optional<rfH_2> id_byte(int var1) {
      for (int var2 = 0; var2 < 3; var2++) {
         rfH_2 var3 = this.id_class(var1, 1);
         if (var3 != null) {
            return Optional.of(var3);
         }
      }

      return Optional.empty();
   }

   private void id_byte(rfH_2 var1) {
      this.id_finally = var1;
   }

   public boolean id_byte() {
      return this.id_new > 0;
   }

   public int id_int() {
      return this.id_catch.values().stream().mapToInt(Set::size).sum();
   }

   public rrEr_1(rrEm_1 var1, rcd_3 var2) {
      this.id_extends = var1;
      this.id_volatile = var2.id_private("Id");
      this.id_native = var2.id_new("Started");
      this.id_int = var2.id_new("Active");
      this.id_implements = var2.id_implements("TicksActive");
      this.id_package = var2.id_private("BadOmenLevel");
      this.id_new = var2.id_private("GroupsSpawned");
      this.id_this = var2.id_private("PreRaidTicks");
      this.id_super = var2.id_private("PostRaidTicks");
      this.id_final = var2.id_finally("TotalHealth");
      this.id_finally = new rfH_2(var2.id_private("CX"), var2.id_private("CY"), var2.id_private("CZ"));
      this.id_synchronized = var2.id_private("NumGroups");
      this.id_return = rrEB.id_class(var2.id_native("Status"));
      this.id_private.clear();
      if (var2.id_byte("HeroesOfTheVillage", 9)) {
         rcy_3 var3 = var2.id_protected("HeroesOfTheVillage", 11);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            this.id_private.add(rco_3.id_class(var3.id_finally(var4)));
         }
      }
   }

   public rrEr_1(int var1, rrEm_1 var2, rfH_2 var3) {
      this.id_volatile = var1;
      this.id_extends = var2;
      this.id_int = true;
      this.id_this = 300;
      this.id_continue.id_class(0.0F);
      this.id_finally = var3;
      this.id_synchronized = this.id_class(var2.id_abstract());
      this.id_return = rrEB.ONGOING;
   }

   public boolean id_this() {
      return this.id_int;
   }

   private void id_interface() {
      Iterator var1 = this.id_catch.values().iterator();
      HashSet var2 = Sets.newHashSet();

      while (var1.hasNext()) {
         Set var3 = (Set)var1.next();

         for (rEB var5 : var3) {
            rfH_2 var6 = var5.Bs();
            if ((Boolean)var5.id_throws[27] || ((rYB)var5.id_throws[7]).E() != this.id_extends.E() || this.id_finally.id_private(var6) >= 12544.0) {
               var2.add(var5);
            } else if ((Integer)var5.id_throws[41] > 600) {
               if (this.id_extends.id_break(var5.ro()) == null) {
                  var2.add(var5);
               }

               if (!this.id_extends.id_throw(var6) && var5.BI() > 2400) {
                  var5.id_break(var5.sz() + 1);
               }

               if (var5.sz() >= 30) {
                  var2.add(var5);
               }
            }
         }
      }

      for (rEB var8 : var2) {
         this.id_class(var8, true);
      }
   }

   public void id_class(int var1, rEB var2) {
      this.id_case.put(var1, var2);
      var2.id_class(rXQ.HEAD, id_new());
      var2.id_class(rXQ.HEAD, 2.0F);
   }

   public boolean id_class(int var1, rEB var2, boolean var3) {
      this.id_catch.computeIfAbsent(var1, var0 -> Sets.newHashSet());
      Set var4 = this.id_catch.get(var1);
      rEB var5 = null;

      for (rEB var7 : var4) {
         if (var7.ro().equals(var2.ro())) {
            var5 = var7;
            break;
         }
      }

      if (var5 != null) {
         var4.remove(var5);
         var4.add(var2);
      }

      var4.add(var2);
      if (var3) {
         this.id_final = this.id_final + var2.Ss();
      }

      this.id_final();
      this.id_abstract();
      return true;
   }

   public boolean id_class() {
      return this.id_throws() || this.id_case();
   }

   private int id_class(rrES var1, int var2, boolean var3) {
      return var3 ? var1.waveCounts[this.id_synchronized] : var1.waveCounts[var2];
   }

   public void id_class(rEB var1, boolean var2) {
      Set var3 = this.id_catch.get(var1.sk());
      if (var3 != null) {
         boolean var4 = var3.remove(var1);
         if (var4) {
            if (var2) {
               this.id_final = this.id_final - var1.Ss();
            }

            var1.id_class((rrEr_1)null);
            this.id_final();
            this.id_abstract();
         }
      }
   }

   private void id_class(rfH_2 var1) {
      float var2 = 13.0F;
      byte var3 = 64;
      Collection var4 = this.id_continue.id_int();

      for (rhN_2 var6 : this.id_extends.id_continue()) {
         rjU_2 var7 = var6.Ps();
         rjU_2 var8 = rjU_2.id_class((rja_3)var1);
         float var9 = rfU_2.id_class(
            (var8.id_break - var7.id_break) * (var8.id_break - var7.id_break)
               + (var8.id_protected - var7.id_protected) * (var8.id_protected - var7.id_protected)
         );
         double var10 = var7.id_break + (double)(13.0F / var9) * (var8.id_break - var7.id_break);
         double var12 = var7.id_protected + (double)(13.0F / var9) * (var8.id_protected - var7.id_protected);
         if (var9 <= 64.0F || var4.contains(var6)) {
            var6.id_class.id_class(new rvt_3(rqn_3.XO, rqL_2.NEUTRAL, var10, var6.re(), var12, 64.0F, 1.0F));
         }
      }
   }

   public rEB id_class(int var1) {
      return this.id_case.get(var1);
   }

   private rfH_2 id_class(int var1, int var2) {
      int var3 = var1 == 0 ? 2 : 2 - var1;
      rfw_3 var4 = new rfw_3();

      for (int var5 = 0; var5 < var2; var5++) {
         float var6 = this.id_extends.id_int.nextFloat() * (float) (Math.PI * 2);
         int var7 = this.id_finally.b_() + rfU_2.id_protected(rfU_2.id_break(var6) * 32.0F * (float)var3) + this.id_extends.id_int.nextInt(5);
         int var8 = this.id_finally.d_() + rfU_2.id_protected(rfU_2.id_class(var6) * 32.0F * (float)var3) + this.id_extends.id_int.nextInt(5);
         int var9 = this.id_extends.id_class(rKv_1.WORLD_SURFACE, var7, var8);
         var4.id_class(var7, var9, var8);
         if ((!this.id_extends.id_throw(var4) || var1 >= 2)
            && this.id_extends.id_class(var4.b_() - 10, var4.c_() - 10, var4.d_() - 10, var4.b_() + 10, var4.c_() + 10, var4.d_() + 10)
            && this.id_extends.id_else().id_class(new rfj_3(var4))
            && (
               rrEj_1.id_class(aw_3.ON_GROUND, this.id_extends, var4, aI_2.u)
                  || this.id_extends.id_byte(var4.id_break()).id_class(xu_3.Pq) && this.id_extends.id_byte(var4).id_catch()
            )) {
            return var4;
         }
      }

      return null;
   }

   public int id_class(rRO var1) {
      switch (var1) {
         case EASY:
            return 3;
         case NORMAL:
            return 5;
         case HARD:
            return 7;
         default:
            return 0;
      }
   }

   public void id_class(an_3 var1) {
      this.id_private.add(var1.ro());
   }

   public void id_class(int var1, rEB var2, rfH_2 var3, boolean var4) {
      boolean var5 = this.id_break(var1, var2);
      if (var5) {
         var2.id_class(this);
         var2.id_class(var1);
         var2.id_this(true);
         var2.id_break(0);
         if (!var4 && var3 != null) {
            var2.id_new((double)var3.b_() + 0.5, (double)var3.c_() + 1.0, (double)var3.d_() + 0.5);
            var2.id_class(this.id_extends, this.id_extends.id_throws(var3), iO_2.EVENT, (aU_2)null, (rcd_3)null);
            var2.id_class(var1, false);
            var2.id_int(true);
            this.id_extends.id_class(var2);
         }
      }
   }

   private int id_class(rrES var1, Random var2, int var3, rRh_1 var4, boolean var5) {
      rRO var6 = var4.id_class();
      boolean var7 = var6 == rRO.EASY;
      boolean var8 = var6 == rRO.NORMAL;
      int var9;
      switch (var1) {
         case WITCH:
            if (var7 || var3 <= 2 || var3 == 4) {
               return 0;
            }

            var9 = 1;
            break;
         case PILLAGER:
         case VINDICATOR:
            if (var7) {
               var9 = var2.nextInt(2);
            } else if (var8) {
               var9 = 1;
            } else {
               var9 = 2;
            }
            break;
         case RAVAGER:
            var9 = !var7 && var5 ? 1 : 0;
            break;
         default:
            return 0;
      }

      return var9 > 0 ? var2.nextInt(var9 + 1) : 0;
   }

   public rcd_3 id_class(rcd_3 var1) {
      var1.id_break("Id", this.id_volatile);
      var1.id_class("Started", this.id_native);
      var1.id_class("Active", this.id_int);
      var1.id_class("TicksActive", this.id_implements);
      var1.id_break("BadOmenLevel", this.id_package);
      var1.id_break("GroupsSpawned", this.id_new);
      var1.id_break("PreRaidTicks", this.id_this);
      var1.id_break("PostRaidTicks", this.id_super);
      var1.id_class("TotalHealth", this.id_final);
      var1.id_break("NumGroups", this.id_synchronized);
      var1.id_class("Status", this.id_return.id_class());
      var1.id_break("CX", this.id_finally.b_());
      var1.id_break("CY", this.id_finally.c_());
      var1.id_break("CZ", this.id_finally.d_());
      rcy_3 var2 = new rcy_3();

      for (UUID var4 : this.id_private) {
         var2.add(rco_3.id_class(var4));
      }

      var1.id_class("HeroesOfTheVillage", var2);
      return var1;
   }

   public void id_class(rhd_3 var1) {
      if (var1.id_break(rLD.id_char)) {
         this.id_package = this.id_package + var1.id_byte(rLD.id_char).id_byte() + 1;
         this.id_package = rfU_2.id_class(this.id_package, 0, this.id_finally());
      }

      var1.id_protected(rLD.id_char);
   }

   public boolean id_break() {
      return this.id_byte() && this.id_int() == 0 && this.id_this > 0;
   }

   public void id_break(int var1) {
      this.id_case.remove(var1);
   }

   private boolean id_break(int var1, rEB var2) {
      return this.id_class(var1, var2, true);
   }

   private void id_break(rfH_2 var1) {
      boolean var2 = false;
      int var3 = this.id_new + 1;
      this.id_final = 0.0F;
      rRh_1 var4 = this.id_extends.id_throws(var1);
      boolean var5 = this.id_throw();

      for (rrES var9 : rrES.VALUES) {
         int var10 = this.id_class(var9, var3, var5) + this.id_class(var9, this.id_else, var3, var4, var5);
         int var11 = 0;

         for (int var12 = 0; var12 < var10; var12++) {
            rEB var13 = var9.type.id_class(this.id_extends);
            if (!var2 && var13.su()) {
               var13.id_synchronized(true);
               this.id_class(var3, var13);
               var2 = true;
            }

            this.id_class(var3, var13, var1, false);
            if (var9.type == aI_2.u) {
               rEB var14 = null;
               if (var3 == this.id_class(rRO.NORMAL)) {
                  var14 = aI_2.W.id_class(this.id_extends);
               } else if (var3 >= this.id_class(rRO.HARD)) {
                  if (var11 == 0) {
                     var14 = aI_2.id_return.id_class(this.id_extends);
                  } else {
                     var14 = aI_2.U.id_class(this.id_extends);
                  }
               }

               var11++;
               if (var14 != null) {
                  this.id_class(var3, var14, var1, false);
                  var14.id_class(var1, 0.0F, 0.0F);
                  var14.id_this(var13);
               }
            }
         }
      }

      this.id_goto = Optional.empty();
      this.id_new++;
      this.id_final();
      this.id_abstract();
   }

   public boolean id_throws() {
      return this.id_return == rrEB.VICTORY;
   }

   public int id_finally() {
      return 5;
   }

   public rYB id_catch() {
      return this.id_extends;
   }

   public int id_extends() {
      return this.id_package;
   }

   private boolean id_goto() {
      return this.id_try() ? !this.id_instanceof() : !this.id_while();
   }

   public boolean id_case() {
      return this.id_return == rrEB.LOSS;
   }

   public rfH_2 id_continue() {
      return this.id_finally;
   }

   public float id_else() {
      int var1 = this.id_extends();
      if (var1 == 2) {
         return 0.1F;
      } else if (var1 == 3) {
         return 0.25F;
      } else if (var1 == 4) {
         return 0.5F;
      } else {
         return var1 == 5 ? 0.75F : 0.0F;
      }
   }

   public int id_implements() {
      return this.id_new;
   }

   private boolean id_instanceof() {
      return this.id_implements() > this.id_synchronized;
   }

   public static rdn_3 id_new() {
      rdn_3 var0 = new rdn_3(rdy_3.dY);
      rcd_3 var1 = var0.id_class("BlockEntityTag");
      rcy_3 var2 = new rHG()
         .id_class(rHE.RHOMBUS_MIDDLE, rxL_2.CYAN)
         .id_class(rHE.STRIPE_BOTTOM, rxL_2.LIGHT_GRAY)
         .id_class(rHE.STRIPE_CENTER, rxL_2.GRAY)
         .id_class(rHE.BORDER, rxL_2.LIGHT_GRAY)
         .id_class(rHE.STRIPE_MIDDLE, rxL_2.BLACK)
         .id_class(rHE.HALF_HORIZONTAL, rxL_2.LIGHT_GRAY)
         .id_class(rHE.CIRCLE_MIDDLE, rxL_2.LIGHT_GRAY)
         .id_class(rHE.BORDER, rxL_2.BLACK)
         .id_class();
      var1.id_class("Patterns", var2);
      var0.id_class(rdC_2.ADDITIONAL);
      var0.id_class(new rgn_3("block.minecraft.ominous_banner").id_class(rgF_2.GOLD));
      return var0;
   }

   public float id_package() {
      float var1 = 0.0F;

      for (Set var3 : this.id_catch.values()) {
         for (rEB var5 : var3) {
            var1 += var5.Ss();
         }
      }

      return var1;
   }

   private void id_return() {
      HashSet var1 = Sets.newHashSet(this.id_continue.id_int());
      List var2 = this.id_extends.id_class(this.id_synchronized());

      for (rhN_2 var4 : var2) {
         if (!var1.contains(var4)) {
            this.id_continue.id_class(var4);
         }
      }

      for (rhN_2 var6 : var1) {
         if (!var2.contains(var6)) {
            this.id_continue.id_break(var6);
         }
      }
   }

   public int id_super() {
      return this.id_volatile;
   }

   private boolean id_throw() {
      return this.id_while() && this.id_int() == 0 && this.id_try();
   }

   private boolean id_try() {
      return this.id_package > 1;
   }

   private boolean id_while() {
      return this.id_implements() == this.id_synchronized;
   }

   private void id_public() {
      Stream var1 = rjh_3.id_class(rjh_3.id_class(this.id_finally), 2);
      var1.filter(this.id_extends::id_class)
         .map(rjh_3::id_int)
         .min(Comparator.comparingDouble(var1x -> var1x.id_private(this.id_finally)))
         .ifPresent(this::id_byte);
   }

   public boolean id_protected() {
      return this.id_return == rrEB.STOPPED;
   }

   public boolean id_private() {
      return this.id_native;
   }

   private void id_abstract() {
      this.id_extends.k().id_byte();
   }

   public void id_final() {
      this.id_continue.id_class(rfU_2.id_class(this.id_package() / this.id_final, 0.0F, 1.0F));
   }

   public void id_volatile() {
      if (!this.id_protected()) {
         if (this.id_return == rrEB.ONGOING) {
            boolean var1 = this.id_int;
            this.id_int = this.id_extends.id_int(this.id_finally);
            if (this.id_extends.id_abstract() == rRO.PEACEFUL) {
               this.id_native();
               return;
            }

            if (var1 != this.id_int) {
               this.id_continue.id_protected(this.id_int);
            }

            if (!this.id_int) {
               return;
            }

            if (!this.id_extends.id_throw(this.id_finally)) {
               this.id_public();
            }

            if (!this.id_extends.id_throw(this.id_finally)) {
               if (this.id_new > 0) {
                  this.id_return = rrEB.LOSS;
               } else {
                  this.id_native();
               }
            }

            this.id_implements++;
            if (this.id_implements >= 48000L) {
               this.id_native();
               return;
            }

            int var2 = this.id_int();
            if (var2 == 0 && this.id_goto()) {
               if (this.id_this <= 0) {
                  if (this.id_this == 0 && this.id_new > 0) {
                     this.id_this = 300;
                     this.id_continue.id_class(id_class);
                     return;
                  }
               } else {
                  boolean var3 = this.id_goto.isPresent();
                  boolean var4 = !var3 && this.id_this % 5 == 0;
                  if (var3 && !this.id_extends.id_else().id_class(new rfj_3(this.id_goto.get()))) {
                     var4 = true;
                  }

                  if (var4) {
                     byte var5 = 0;
                     if (this.id_this < 100) {
                        var5 = 1;
                     } else if (this.id_this < 40) {
                        var5 = 2;
                     }

                     this.id_goto = this.id_byte(var5);
                  }

                  if (this.id_this == 300 || this.id_this % 20 == 0) {
                     this.id_return();
                  }

                  this.id_this--;
                  this.id_continue.id_class(rfU_2.id_class((float)(300 - this.id_this) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.id_implements % 20L == 0L) {
               this.id_return();
               this.id_interface();
               if (var2 > 0) {
                  if (var2 <= 2) {
                     this.id_continue.id_class(id_class.id_case().id_break(" - ").id_class(new rgn_3("event.minecraft.raid.raiders_remaining", var2)));
                  } else {
                     this.id_continue.id_class(id_class);
                  }
               } else {
                  this.id_continue.id_class(id_class);
               }
            }

            boolean var10 = false;
            int var11 = 0;

            while (this.id_char()) {
               rfH_2 var12 = this.id_goto.isPresent() ? this.id_goto.get() : this.id_class(var11, 20);
               if (var12 != null) {
                  this.id_native = true;
                  this.id_break(var12);
                  if (!var10) {
                     this.id_class(var12);
                     var10 = true;
                  }
               } else {
                  var11++;
               }

               if (var11 > 3) {
                  this.id_native();
                  break;
               }
            }

            if (this.id_private() && !this.id_goto() && var2 == 0) {
               if (this.id_super < 40) {
                  this.id_super++;
               } else {
                  this.id_return = rrEB.VICTORY;

                  for (UUID var6 : this.id_private) {
                     an_3 var7 = this.id_extends.id_break(var6);
                     if (var7 instanceof iB_2 && !var7.id_native()) {
                        iB_2 var8 = (iB_2)var7;
                        var8.id_break(new rLY(rLD.id_abstract, 48000, this.id_package - 1, false, false, true));
                        if (var8 instanceof rhN_2 var9) {
                           var9.id_break(rlB_2.y);
                           Oo_1.id_float.id_class(var9);
                        }
                     }
                  }
               }
            }

            this.id_abstract();
         } else if (this.id_class()) {
            this.id_public++;
            if (this.id_public >= 600) {
               this.id_native();
               return;
            }

            if (this.id_public % 20 == 0) {
               this.id_return();
               this.id_continue.id_protected(true);
               if (this.id_throws()) {
                  this.id_continue.id_class(0.0F);
                  this.id_continue.id_class(id_protected);
               } else {
                  this.id_continue.id_class(id_throws);
               }
            }
         }
      }
   }

   private Predicate<rhN_2> id_synchronized() {
      return var1 -> {
         rfH_2 var2 = var1.Bs();
         return var1.BM() && this.id_extends.id_interface(var2) == this;
      };
   }

   public void id_native() {
      this.id_int = false;
      this.id_continue.id_byte();
      this.id_return = rrEB.STOPPED;
   }
}
