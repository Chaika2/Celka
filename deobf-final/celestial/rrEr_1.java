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
   private static final rgP_2 class_ = new rgn_3("event.minecraft.raid");
   private static final rgP_2 break_ = new rgn_3("event.minecraft.raid.victory");
   private static final rgP_2 byte_ = new rgn_3("event.minecraft.raid.defeat");
   private static final rgP_2 protected_ = class_.case_().break_(" - ").class_(break_);
   private static final rgP_2 throws_ = class_.case_().break_(" - ").class_(byte_);
   private final Map<Integer, rEB> case_ = Maps.newHashMap();
   private final Map<Integer, Set<rEB>> catch_ = Maps.newHashMap();
   private final Set<UUID> private_ = Sets.newHashSet();
   private long implements_;
   private rfH_2 finally_;
   private final rrEm_1 extends_;
   private boolean native_;
   private final int volatile_;
   private float final_;
   private int package_;
   private boolean int_;
   private int new_;
   private final rrEQ continue_ = new rrEQ(class_, rRb_1.RED, rRM.NOTCHED_10);
   private int super_;
   private int this_;
   private final Random else_ = new Random();
   private final int synchronized_;
   private rrEB return_;
   private int public_;
   private Optional<rfH_2> goto_ = Optional.empty();

   private boolean char_() {
      return this.this_ == 0 && (this.new_ < this.synchronized_ || this.throw_()) && this.int_() == 0;
   }

   private Optional<rfH_2> byte_(int var1) {
      for (int var2 = 0; var2 < 3; var2++) {
         rfH_2 var3 = this.class_(var1, 1);
         if (var3 != null) {
            return Optional.of(var3);
         }
      }

      return Optional.empty();
   }

   private void byte_(rfH_2 var1) {
      this.finally_ = var1;
   }

   public boolean byte_() {
      return this.new_ > 0;
   }

   public int int_() {
      return this.catch_.values().stream().mapToInt(Set::size).sum();
   }

   public rrEr_1(rrEm_1 var1, rcd_3 var2) {
      this.extends_ = var1;
      this.volatile_ = var2.private_("Id");
      this.native_ = var2.new_("Started");
      this.int_ = var2.new_("Active");
      this.implements_ = var2.implements_("TicksActive");
      this.package_ = var2.private_("BadOmenLevel");
      this.new_ = var2.private_("GroupsSpawned");
      this.this_ = var2.private_("PreRaidTicks");
      this.super_ = var2.private_("PostRaidTicks");
      this.final_ = var2.finally_("TotalHealth");
      this.finally_ = new rfH_2(var2.private_("CX"), var2.private_("CY"), var2.private_("CZ"));
      this.synchronized_ = var2.private_("NumGroups");
      this.return_ = rrEB.class_(var2.native_("Status"));
      this.private_.clear();
      if (var2.byte_("HeroesOfTheVillage", 9)) {
         rcy_3 var3 = var2.protected_("HeroesOfTheVillage", 11);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            this.private_.add(rco_3.class_(var3.finally_(var4)));
         }
      }
   }

   public rrEr_1(int var1, rrEm_1 var2, rfH_2 var3) {
      this.volatile_ = var1;
      this.extends_ = var2;
      this.int_ = true;
      this.this_ = 300;
      this.continue_.class_(0.0F);
      this.finally_ = var3;
      this.synchronized_ = this.class_(var2.abstract_());
      this.return_ = rrEB.ONGOING;
   }

   public boolean this_() {
      return this.int_;
   }

   private void interface_() {
      Iterator var1 = this.catch_.values().iterator();
      HashSet var2 = Sets.newHashSet();

      while (var1.hasNext()) {
         Set var3 = (Set)var1.next();

         for (rEB var5 : var3) {
            rfH_2 var6 = var5.Bs();
            if ((Boolean)var5.throws_[27] || ((rYB)var5.throws_[7]).E() != this.extends_.E() || this.finally_.private_(var6) >= 12544.0) {
               var2.add(var5);
            } else if ((Integer)var5.throws_[41] > 600) {
               if (this.extends_.break_(var5.ro()) == null) {
                  var2.add(var5);
               }

               if (!this.extends_.throw_(var6) && var5.BI() > 2400) {
                  var5.break_(var5.sz() + 1);
               }

               if (var5.sz() >= 30) {
                  var2.add(var5);
               }
            }
         }
      }

      for (rEB var8 : var2) {
         this.class_(var8, true);
      }
   }

   public void class_(int var1, rEB var2) {
      this.case_.put(var1, var2);
      var2.class_(rXQ.HEAD, new_());
      var2.class_(rXQ.HEAD, 2.0F);
   }

   public boolean class_(int var1, rEB var2, boolean var3) {
      this.catch_.computeIfAbsent(var1, var0 -> Sets.newHashSet());
      Set var4 = this.catch_.get(var1);
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
         this.final_ = this.final_ + var2.Ss();
      }

      this.final_();
      this.abstract_();
      return true;
   }

   public boolean class_() {
      return this.throws_() || this.case_();
   }

   private int class_(rrES var1, int var2, boolean var3) {
      return var3 ? var1.waveCounts[this.synchronized_] : var1.waveCounts[var2];
   }

   public void class_(rEB var1, boolean var2) {
      Set var3 = this.catch_.get(var1.sk());
      if (var3 != null) {
         boolean var4 = var3.remove(var1);
         if (var4) {
            if (var2) {
               this.final_ = this.final_ - var1.Ss();
            }

            var1.class_((rrEr_1)null);
            this.final_();
            this.abstract_();
         }
      }
   }

   private void class_(rfH_2 var1) {
      float var2 = 13.0F;
      byte var3 = 64;
      Collection var4 = this.continue_.int_();

      for (rhN_2 var6 : this.extends_.continue_()) {
         rjU_2 var7 = var6.Ps();
         rjU_2 var8 = rjU_2.class_((rja_3)var1);
         float var9 = rfU_2.class_(
            (var8.break_ - var7.break_) * (var8.break_ - var7.break_) + (var8.protected_ - var7.protected_) * (var8.protected_ - var7.protected_)
         );
         double var10 = var7.break_ + (double)(13.0F / var9) * (var8.break_ - var7.break_);
         double var12 = var7.protected_ + (double)(13.0F / var9) * (var8.protected_ - var7.protected_);
         if (var9 <= 64.0F || var4.contains(var6)) {
            var6.class_.class_(new rvt_3(rqn_3.XO, rqL_2.NEUTRAL, var10, var6.re(), var12, 64.0F, 1.0F));
         }
      }
   }

   public rEB class_(int var1) {
      return this.case_.get(var1);
   }

   private rfH_2 class_(int var1, int var2) {
      int var3 = var1 == 0 ? 2 : 2 - var1;
      rfw_3 var4 = new rfw_3();

      for (int var5 = 0; var5 < var2; var5++) {
         float var6 = this.extends_.int_.nextFloat() * (float) (Math.PI * 2);
         int var7 = this.finally_.b_() + rfU_2.protected_(rfU_2.break_(var6) * 32.0F * (float)var3) + this.extends_.int_.nextInt(5);
         int var8 = this.finally_.d_() + rfU_2.protected_(rfU_2.class_(var6) * 32.0F * (float)var3) + this.extends_.int_.nextInt(5);
         int var9 = this.extends_.class_(rKv_1.WORLD_SURFACE, var7, var8);
         var4.class_(var7, var9, var8);
         if ((!this.extends_.throw_(var4) || var1 >= 2)
            && this.extends_.class_(var4.b_() - 10, var4.c_() - 10, var4.d_() - 10, var4.b_() + 10, var4.c_() + 10, var4.d_() + 10)
            && this.extends_.else_().class_(new rfj_3(var4))
            && (
               rrEj_1.class_(aw_3.ON_GROUND, this.extends_, var4, aI_2.u)
                  || this.extends_.byte_(var4.break_()).class_(xu_3.Pq) && this.extends_.byte_(var4).catch_()
            )) {
            return var4;
         }
      }

      return null;
   }

   public int class_(rRO var1) {
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

   public void class_(an_3 var1) {
      this.private_.add(var1.ro());
   }

   public void class_(int var1, rEB var2, rfH_2 var3, boolean var4) {
      boolean var5 = this.break_(var1, var2);
      if (var5) {
         var2.class_(this);
         var2.class_(var1);
         var2.this_(true);
         var2.break_(0);
         if (!var4 && var3 != null) {
            var2.new_((double)var3.b_() + 0.5, (double)var3.c_() + 1.0, (double)var3.d_() + 0.5);
            var2.class_(this.extends_, this.extends_.throws_(var3), iO_2.EVENT, (aU_2)null, (rcd_3)null);
            var2.class_(var1, false);
            var2.int_(true);
            this.extends_.class_(var2);
         }
      }
   }

   private int class_(rrES var1, Random var2, int var3, rRh_1 var4, boolean var5) {
      rRO var6 = var4.class_();
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

   public rcd_3 class_(rcd_3 var1) {
      var1.break_("Id", this.volatile_);
      var1.class_("Started", this.native_);
      var1.class_("Active", this.int_);
      var1.class_("TicksActive", this.implements_);
      var1.break_("BadOmenLevel", this.package_);
      var1.break_("GroupsSpawned", this.new_);
      var1.break_("PreRaidTicks", this.this_);
      var1.break_("PostRaidTicks", this.super_);
      var1.class_("TotalHealth", this.final_);
      var1.break_("NumGroups", this.synchronized_);
      var1.class_("Status", this.return_.class_());
      var1.break_("CX", this.finally_.b_());
      var1.break_("CY", this.finally_.c_());
      var1.break_("CZ", this.finally_.d_());
      rcy_3 var2 = new rcy_3();

      for (UUID var4 : this.private_) {
         var2.add(rco_3.class_(var4));
      }

      var1.class_("HeroesOfTheVillage", var2);
      return var1;
   }

   public void class_(rhd_3 var1) {
      if (var1.break_(rLD.char_)) {
         this.package_ = this.package_ + var1.byte_(rLD.char_).byte_() + 1;
         this.package_ = rfU_2.class_(this.package_, 0, this.finally_());
      }

      var1.protected_(rLD.char_);
   }

   public boolean break_() {
      return this.byte_() && this.int_() == 0 && this.this_ > 0;
   }

   public void break_(int var1) {
      this.case_.remove(var1);
   }

   private boolean break_(int var1, rEB var2) {
      return this.class_(var1, var2, true);
   }

   private void break_(rfH_2 var1) {
      boolean var2 = false;
      int var3 = this.new_ + 1;
      this.final_ = 0.0F;
      rRh_1 var4 = this.extends_.throws_(var1);
      boolean var5 = this.throw_();

      for (rrES var9 : rrES.VALUES) {
         int var10 = this.class_(var9, var3, var5) + this.class_(var9, this.else_, var3, var4, var5);
         int var11 = 0;

         for (int var12 = 0; var12 < var10; var12++) {
            rEB var13 = var9.type.class_(this.extends_);
            if (!var2 && var13.su()) {
               var13.synchronized_(true);
               this.class_(var3, var13);
               var2 = true;
            }

            this.class_(var3, var13, var1, false);
            if (var9.type == aI_2.u) {
               rEB var14 = null;
               if (var3 == this.class_(rRO.NORMAL)) {
                  var14 = aI_2.W.class_(this.extends_);
               } else if (var3 >= this.class_(rRO.HARD)) {
                  if (var11 == 0) {
                     var14 = aI_2.return_.class_(this.extends_);
                  } else {
                     var14 = aI_2.U.class_(this.extends_);
                  }
               }

               var11++;
               if (var14 != null) {
                  this.class_(var3, var14, var1, false);
                  var14.class_(var1, 0.0F, 0.0F);
                  var14.this_(var13);
               }
            }
         }
      }

      this.goto_ = Optional.empty();
      this.new_++;
      this.final_();
      this.abstract_();
   }

   public boolean throws_() {
      return this.return_ == rrEB.VICTORY;
   }

   public int finally_() {
      return 5;
   }

   public rYB catch_() {
      return this.extends_;
   }

   public int extends_() {
      return this.package_;
   }

   private boolean goto_() {
      return this.try_() ? !this.instanceof_() : !this.while_();
   }

   public boolean case_() {
      return this.return_ == rrEB.LOSS;
   }

   public rfH_2 continue_() {
      return this.finally_;
   }

   public float else_() {
      int var1 = this.extends_();
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

   public int implements_() {
      return this.new_;
   }

   private boolean instanceof_() {
      return this.implements_() > this.synchronized_;
   }

   public static rdn_3 new_() {
      rdn_3 var0 = new rdn_3(rdy_3.dY);
      rcd_3 var1 = var0.class_("BlockEntityTag");
      rcy_3 var2 = new rHG()
         .class_(rHE.RHOMBUS_MIDDLE, rxL_2.CYAN)
         .class_(rHE.STRIPE_BOTTOM, rxL_2.LIGHT_GRAY)
         .class_(rHE.STRIPE_CENTER, rxL_2.GRAY)
         .class_(rHE.BORDER, rxL_2.LIGHT_GRAY)
         .class_(rHE.STRIPE_MIDDLE, rxL_2.BLACK)
         .class_(rHE.HALF_HORIZONTAL, rxL_2.LIGHT_GRAY)
         .class_(rHE.CIRCLE_MIDDLE, rxL_2.LIGHT_GRAY)
         .class_(rHE.BORDER, rxL_2.BLACK)
         .class_();
      var1.class_("Patterns", var2);
      var0.class_(rdC_2.ADDITIONAL);
      var0.class_(new rgn_3("block.minecraft.ominous_banner").class_(rgF_2.GOLD));
      return var0;
   }

   public float package_() {
      float var1 = 0.0F;

      for (Set var3 : this.catch_.values()) {
         for (rEB var5 : var3) {
            var1 += var5.Ss();
         }
      }

      return var1;
   }

   private void return_() {
      HashSet var1 = Sets.newHashSet(this.continue_.int_());
      List var2 = this.extends_.class_(this.synchronized_());

      for (rhN_2 var4 : var2) {
         if (!var1.contains(var4)) {
            this.continue_.class_(var4);
         }
      }

      for (rhN_2 var6 : var1) {
         if (!var2.contains(var6)) {
            this.continue_.break_(var6);
         }
      }
   }

   public int super_() {
      return this.volatile_;
   }

   private boolean throw_() {
      return this.while_() && this.int_() == 0 && this.try_();
   }

   private boolean try_() {
      return this.package_ > 1;
   }

   private boolean while_() {
      return this.implements_() == this.synchronized_;
   }

   private void public_() {
      Stream var1 = rjh_3.class_(rjh_3.class_(this.finally_), 2);
      var1.filter(this.extends_::class_).map(rjh_3::int_).min(Comparator.comparingDouble(var1x -> var1x.private_(this.finally_))).ifPresent(this::byte_);
   }

   public boolean protected_() {
      return this.return_ == rrEB.STOPPED;
   }

   public boolean private_() {
      return this.native_;
   }

   private void abstract_() {
      this.extends_.k().byte_();
   }

   public void final_() {
      this.continue_.class_(rfU_2.class_(this.package_() / this.final_, 0.0F, 1.0F));
   }

   public void volatile_() {
      if (!this.protected_()) {
         if (this.return_ == rrEB.ONGOING) {
            boolean var1 = this.int_;
            this.int_ = this.extends_.int_(this.finally_);
            if (this.extends_.abstract_() == rRO.PEACEFUL) {
               this.native_();
               return;
            }

            if (var1 != this.int_) {
               this.continue_.protected_(this.int_);
            }

            if (!this.int_) {
               return;
            }

            if (!this.extends_.throw_(this.finally_)) {
               this.public_();
            }

            if (!this.extends_.throw_(this.finally_)) {
               if (this.new_ > 0) {
                  this.return_ = rrEB.LOSS;
               } else {
                  this.native_();
               }
            }

            this.implements_++;
            if (this.implements_ >= 48000L) {
               this.native_();
               return;
            }

            int var2 = this.int_();
            if (var2 == 0 && this.goto_()) {
               if (this.this_ <= 0) {
                  if (this.this_ == 0 && this.new_ > 0) {
                     this.this_ = 300;
                     this.continue_.class_(class_);
                     return;
                  }
               } else {
                  boolean var3 = this.goto_.isPresent();
                  boolean var4 = !var3 && this.this_ % 5 == 0;
                  if (var3 && !this.extends_.else_().class_(new rfj_3(this.goto_.get()))) {
                     var4 = true;
                  }

                  if (var4) {
                     byte var5 = 0;
                     if (this.this_ < 100) {
                        var5 = 1;
                     } else if (this.this_ < 40) {
                        var5 = 2;
                     }

                     this.goto_ = this.byte_(var5);
                  }

                  if (this.this_ == 300 || this.this_ % 20 == 0) {
                     this.return_();
                  }

                  this.this_--;
                  this.continue_.class_(rfU_2.class_((float)(300 - this.this_) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.implements_ % 20L == 0L) {
               this.return_();
               this.interface_();
               if (var2 > 0) {
                  if (var2 <= 2) {
                     this.continue_.class_(class_.case_().break_(" - ").class_(new rgn_3("event.minecraft.raid.raiders_remaining", var2)));
                  } else {
                     this.continue_.class_(class_);
                  }
               } else {
                  this.continue_.class_(class_);
               }
            }

            boolean var10 = false;
            int var11 = 0;

            while (this.char_()) {
               rfH_2 var12 = this.goto_.isPresent() ? this.goto_.get() : this.class_(var11, 20);
               if (var12 != null) {
                  this.native_ = true;
                  this.break_(var12);
                  if (!var10) {
                     this.class_(var12);
                     var10 = true;
                  }
               } else {
                  var11++;
               }

               if (var11 > 3) {
                  this.native_();
                  break;
               }
            }

            if (this.private_() && !this.goto_() && var2 == 0) {
               if (this.super_ < 40) {
                  this.super_++;
               } else {
                  this.return_ = rrEB.VICTORY;

                  for (UUID var6 : this.private_) {
                     an_3 var7 = this.extends_.break_(var6);
                     if (var7 instanceof iB_2 && !var7.native_()) {
                        iB_2 var8 = (iB_2)var7;
                        var8.break_(new rLY(rLD.abstract_, 48000, this.package_ - 1, false, false, true));
                        if (var8 instanceof rhN_2 var9) {
                           var9.break_(rlB_2.y);
                           Oo_1.float_.class_(var9);
                        }
                     }
                  }
               }
            }

            this.abstract_();
         } else if (this.class_()) {
            this.public_++;
            if (this.public_ >= 600) {
               this.native_();
               return;
            }

            if (this.public_ % 20 == 0) {
               this.return_();
               this.continue_.protected_(true);
               if (this.throws_()) {
                  this.continue_.class_(0.0F);
                  this.continue_.class_(protected_);
               } else {
                  this.continue_.class_(throws_);
               }
            }
         }
      }
   }

   private Predicate<rhN_2> synchronized_() {
      return var1 -> {
         rfH_2 var2 = var1.Bs();
         return var1.BM() && this.extends_.interface_(var2) == this;
      };
   }

   public void native_() {
      this.int_ = false;
      this.continue_.byte_();
      this.return_ = rrEB.STOPPED;
   }
}
