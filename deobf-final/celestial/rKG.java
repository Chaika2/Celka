package celestial;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKG {
   private static final Logger class_ = LogManager.getLogger();
   private static final Predicate<an_3> break_ = rpJ_2.class_.and(rpJ_2.class_(0.0, 128.0, 0.0, 192.0));
   private final rrEQ byte_ = (rrEQ)new rrEQ(new rgn_3("entity.minecraft.ender_dragon"), rRb_1.PINK, rRM.PROGRESS).break_(true).byte_(true);
   private final rrEm_1 protected_;
   private final List<Integer> throws_ = Lists.newArrayList();
   private final Qh_1 case_;
   private int catch_;
   private int private_;
   private int implements_;
   private int finally_;
   private boolean extends_;
   private boolean native_;
   private UUID volatile_;
   private boolean final_ = true;
   private rfH_2 package_;
   private rKb_1 int_;
   private int new_;
   private List<rSa_1> continue_;

   public int byte_() {
      return this.private_;
   }

   public rKG(rrEm_1 var1, long var2, rcd_3 var4) {
      this.protected_ = var1;
      if (var4.byte_("DragonKilled", 99)) {
         if (var4.break_("Dragon")) {
            this.volatile_ = var4.class_("Dragon");
         }

         this.extends_ = var4.new_("DragonKilled");
         this.native_ = var4.new_("PreviouslyKilled");
         if (var4.new_("IsRespawning")) {
            this.int_ = rKb_1.START;
         }

         if (var4.byte_("ExitPortalLocation", 10)) {
            this.package_ = rco_3.break_(var4.int_("ExitPortalLocation"));
         }
      } else {
         this.extends_ = true;
         this.native_ = true;
      }

      if (var4.byte_("Gateways", 9)) {
         rcy_3 var5 = var4.protected_("Gateways", 3);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.throws_.add(var5.throws_(var6));
         }
      } else {
         this.throws_.addAll(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         Collections.shuffle(this.throws_, new Random(var2));
      }

      this.case_ = Qx_1.class_()
         .class_("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .class_("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .class_("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .class_("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .class_("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .class_('#', ryw_3.class_(Qb_1.class_(xu_3.while_)))
         .break_();
   }

   public void class_(rSa_1 var1, rye_3 var2) {
      if (this.int_ != null && this.continue_.contains(var1)) {
         class_.debug("Aborting respawn sequence");
         this.int_ = null;
         this.new_ = 0;
         this.case_();
         this.class_(true);
      } else {
         this.volatile_();
         an_3 var3 = this.protected_.break_(this.volatile_);
         if (var3 instanceof rSu_1) {
            ((rSu_1)var3).class_(var1, var1.Bs(), var2);
         }
      }
   }

   public rcd_3 class_() {
      rcd_3 var1 = new rcd_3();
      if (this.volatile_ != null) {
         var1.class_("Dragon", this.volatile_);
      }

      var1.class_("DragonKilled", this.extends_);
      var1.class_("PreviouslyKilled", this.native_);
      if (this.package_ != null) {
         var1.class_("ExitPortalLocation", rco_3.class_(this.package_));
      }

      rcy_3 var2 = new rcy_3();

      for (int var4 : this.throws_) {
         var2.add(rcn_3.class_(var4));
      }

      var1.class_("Gateways", var2);
      return var1;
   }

   public void class_(rSu_1 var1) {
      if (var1.ro().equals(this.volatile_)) {
         this.byte_.class_(0.0F);
         this.byte_.protected_(false);
         this.class_(true);
         this.final_();
         if (!this.native_) {
            this.protected_.break_(this.protected_.class_(rKv_1.MOTION_BLOCKING, rUs_1.class_), xu_3.SX.continue_());
         }

         this.native_ = true;
         this.extends_ = true;
      }
   }

   private void class_(boolean var1) {
      rUs_1 var2 = new rUs_1(var1);
      if (this.package_ == null) {
         this.package_ = this.protected_.class_(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.class_).break_();

         while (this.protected_.byte_(this.package_).class_(xu_3.while_) && this.package_.c_() > this.protected_.short_()) {
            this.package_ = this.package_.break_();
         }
      }

      var2.break_(rUv_1.volatile_).class_(this.protected_, this.protected_.else_().implements_(), new Random(), this.package_);
   }

   private void class_(List<rSa_1> var1) {
      if (this.extends_ && this.int_ == null) {
         for (QJ var2 = this.finally_(); var2 != null; var2 = this.finally_()) {
            for (int var3 = 0; var3 < this.case_.byte_(); var3++) {
               for (int var4 = 0; var4 < this.case_.break_(); var4++) {
                  for (int var5 = 0; var5 < this.case_.class_(); var5++) {
                     ryw_3 var6 = var2.class_(var3, var4, var5);
                     if (var6.class_().class_(xu_3.while_) || var6.class_().class_(xu_3.SM)) {
                        this.protected_.break_(var6.protected_(), xu_3.Sh.continue_());
                     }
                  }
               }
            }
         }

         this.int_ = rKb_1.START;
         this.new_ = 0;
         this.class_(false);
         this.continue_ = var1;
      }
   }

   protected void class_(rKb_1 var1) {
      if (this.int_ == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.new_ = 0;
         if (var1 == rKb_1.END) {
            this.int_ = null;
            this.extends_ = false;
            rSu_1 var2 = this.package_();

            for (rhN_2 var4 : this.byte_.int_()) {
               Oo_1.final_.class_(var4, var2);
            }
         } else {
            this.int_ = var1;
         }
      }
   }

   private void class_(rfH_2 var1) {
      this.protected_.byte_(3000, var1, 0);
      rUx_1.byte_.class_(this.protected_, this.protected_.else_().implements_(), new Random(), var1);
   }

   public void break_() {
      this.byte_.protected_(!this.extends_);
      if (++this.finally_ >= 20) {
         this.native_();
         this.finally_ = 0;
      }

      if (!this.byte_.int_().isEmpty()) {
         this.protected_.else_().class_(rrEl_1.break_, new rfj_3(0, 0), 9, rqg_3.INSTANCE);
         boolean var1 = this.extends_();
         if (this.final_ && var1) {
            this.catch_();
            this.final_ = false;
         }

         if (this.int_ != null) {
            if (this.continue_ == null && var1) {
               this.int_ = null;
               this.throws_();
            }

            this.int_.class_(this.protected_, this, this.continue_, this.new_++, this.package_);
         }

         if (!this.extends_) {
            if ((this.volatile_ == null || ++this.catch_ >= 1200) && var1) {
               this.private_();
               this.catch_ = 0;
            }

            if (++this.implements_ >= 100 && var1) {
               this.volatile_();
               this.implements_ = 0;
            }
         }
      } else {
         this.protected_.else_().break_(rrEl_1.break_, new rfj_3(0, 0), 9, rqg_3.INSTANCE);
      }
   }

   public void break_(rSu_1 var1) {
      if (var1.ro().equals(this.volatile_)) {
         this.byte_.class_(var1.Ss() / var1.SK());
         this.catch_ = 0;
         if (var1.Bk()) {
            this.byte_.class_(var1.L_());
         }
      }
   }

   public void throws_() {
      if (this.extends_ && this.int_ == null) {
         rfH_2 var1 = this.package_;
         if (var1 == null) {
            class_.debug("Tried to respawn, but need to find the portal first.");
            QJ var2 = this.finally_();
            if (var2 == null) {
               class_.debug("Couldn't find a portal, so we made one.");
               this.class_(true);
            } else {
               class_.debug("Found the exit portal & temporarily using it.");
            }

            var1 = this.package_;
         }

         ArrayList var7 = Lists.newArrayList();
         rfH_2 var3 = var1.break_(1);

         for (rpr_3 var5 : rpb_3.HORIZONTAL) {
            List var6 = this.protected_.class_(rSa_1.class, new rfl_3(var3.class_(var5, 2)));
            if (var6.isEmpty()) {
               return;
            }

            var7.addAll(var6);
         }

         class_.debug("Found all crystals, respawning dragon.");
         this.class_(var7);
      }
   }

   private QJ finally_() {
      for (int var1 = -8; var1 <= 8; var1++) {
         for (int var2 = -8; var2 <= 8; var2++) {
            roJ_2 var3 = this.protected_.throws_(var1, var2);

            for (ryO_2 var5 : var3.volatile_().values()) {
               if (var5 instanceof rHp_1) {
                  QJ var6 = this.case_.class_(this.protected_, var5.char_());
                  if (var6 != null) {
                     rfH_2 var7 = var6.class_(3, 3, 3).protected_();
                     if (this.package_ == null && var7.b_() == 0 && var7.d_() == 0) {
                        this.package_ = var7;
                     }

                     return var6;
                  }
               }
            }
         }
      }

      int var8 = this.protected_.class_(rKv_1.MOTION_BLOCKING, rUs_1.class_).c_();

      for (int var9 = var8; var9 >= 0; var9--) {
         QJ var10 = this.case_.class_(this.protected_, new rfH_2(rUs_1.class_.b_(), var9, rUs_1.class_.d_()));
         if (var10 != null) {
            if (this.package_ == null) {
               this.package_ = var10.class_(3, 3, 3).protected_();
            }

            return var10;
         }
      }

      return null;
   }

   private void catch_() {
      class_.info("Scanning for legacy world dragon fight...");
      boolean var1 = this.implements_();
      if (var1) {
         class_.info("Found that the dragon has been killed in this world already.");
         this.native_ = true;
      } else {
         class_.info("Found that the dragon has not yet been killed in this world.");
         this.native_ = false;
         if (this.finally_() == null) {
            this.class_(false);
         }
      }

      List var2 = this.protected_.super_();
      if (var2.isEmpty()) {
         this.extends_ = true;
      } else {
         rSu_1 var3 = (rSu_1)var2.get(0);
         this.volatile_ = var3.ro();
         class_.info("Found that there's a dragon still alive ({})", var3);
         this.extends_ = false;
         if (!var1) {
            class_.info("But we didn't have a portal, let's remove it.");
            var3.PD();
            this.volatile_ = null;
         }
      }

      if (!this.native_ && this.extends_) {
         this.extends_ = false;
      }
   }

   private boolean extends_() {
      for (int var1 = -8; var1 <= 8; var1++) {
         for (int var2 = 8; var2 <= 8; var2++) {
            roC_2 var3 = this.protected_.class_(var1, var2, roN_2.volatile_, false);
            if (!(var3 instanceof roJ_2)) {
               return false;
            }

            rrEJ var4 = ((roJ_2)var3).instanceof_();
            if (!var4.class_(rrEJ.TICKING)) {
               return false;
            }
         }
      }

      return true;
   }

   public void case_() {
      for (rUG var2 : rUE.class_(this.protected_)) {
         for (rSa_1 var4 : this.protected_.class_(rSa_1.class, var2.case_())) {
            var4.catch_(false);
            var4.class_((rfH_2)null);
         }
      }
   }

   private boolean implements_() {
      for (int var1 = -8; var1 <= 8; var1++) {
         for (int var2 = -8; var2 <= 8; var2++) {
            roJ_2 var3 = this.protected_.throws_(var1, var2);

            for (ryO_2 var5 : var3.volatile_().values()) {
               if (var5 instanceof rHp_1) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private rSu_1 package_() {
      this.protected_.this_(new rfH_2(0, 128, 0));
      rSu_1 var1 = aI_2.this_.class_(this.protected_);
      var1.L().class_(rST.class_);
      var1.class_(0.0, 128.0, 0.0, this.protected_.int_.nextFloat() * 360.0F, 0.0F);
      this.protected_.a_(var1);
      this.volatile_ = var1.ro();
      return var1;
   }

   public boolean protected_() {
      return this.native_;
   }

   private void private_() {
      List var1 = this.protected_.super_();
      if (var1.isEmpty()) {
         class_.debug("Haven't seen the dragon, respawning it");
         this.package_();
      } else {
         class_.debug("Haven't seen our dragon, but found another one to use.");
         this.volatile_ = ((rSu_1)var1.get(0)).ro();
      }
   }

   private void final_() {
      if (!this.throws_.isEmpty()) {
         int var1 = this.throws_.remove(this.throws_.size() - 1);
         int var2 = rfU_2.byte_(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)var1)));
         int var3 = rfU_2.byte_(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)var1)));
         this.class_(new rfH_2(var2, 75, var3));
      }
   }

   private void volatile_() {
      this.implements_ = 0;
      this.private_ = 0;

      for (rUG var2 : rUE.class_(this.protected_)) {
         this.private_ = this.private_ + this.protected_.class_(rSa_1.class, var2.case_()).size();
      }

      class_.debug("Found {} end crystals still alive", this.private_);
   }

   private void native_() {
      HashSet var1 = Sets.newHashSet();

      for (rhN_2 var3 : this.protected_.class_(break_)) {
         this.byte_.class_(var3);
         var1.add(var3);
      }

      HashSet var5 = Sets.newHashSet(this.byte_.int_());
      var5.removeAll(var1);

      for (rhN_2 var4 : var5) {
         this.byte_.break_(var4);
      }
   }
}
