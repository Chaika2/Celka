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
   private static final Logger id_class = LogManager.getLogger();
   private static final Predicate<an_3> id_break = rpJ_2.id_class.and(rpJ_2.id_class(0.0, 128.0, 0.0, 192.0));
   private final rrEQ id_byte = (rrEQ)new rrEQ(new rgn_3("entity.minecraft.ender_dragon"), rRb_1.PINK, rRM.PROGRESS).id_break(true).id_byte(true);
   private final rrEm_1 id_protected;
   private final List<Integer> id_throws = Lists.newArrayList();
   private final Qh_1 id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   private int id_finally;
   private boolean id_extends;
   private boolean id_native;
   private UUID id_volatile;
   private boolean id_final = true;
   private rfH_2 id_package;
   private rKb_1 id_int;
   private int id_new;
   private List<rSa_1> id_continue;

   public int id_byte() {
      return this.id_private;
   }

   public rKG(rrEm_1 var1, long var2, rcd_3 var4) {
      this.id_protected = var1;
      if (var4.id_byte("DragonKilled", 99)) {
         if (var4.id_break("Dragon")) {
            this.id_volatile = var4.id_class("Dragon");
         }

         this.id_extends = var4.id_new("DragonKilled");
         this.id_native = var4.id_new("PreviouslyKilled");
         if (var4.id_new("IsRespawning")) {
            this.id_int = rKb_1.START;
         }

         if (var4.id_byte("ExitPortalLocation", 10)) {
            this.id_package = rco_3.id_break(var4.id_int("ExitPortalLocation"));
         }
      } else {
         this.id_extends = true;
         this.id_native = true;
      }

      if (var4.id_byte("Gateways", 9)) {
         rcy_3 var5 = var4.id_protected("Gateways", 3);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.id_throws.add(var5.id_throws(var6));
         }
      } else {
         this.id_throws.addAll(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         Collections.shuffle(this.id_throws, new Random(var2));
      }

      this.id_case = Qx_1.id_class()
         .id_class("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .id_class("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .id_class("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .id_class("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .id_class("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .id_class('#', ryw_3.id_class(Qb_1.id_class(xu_3.id_while)))
         .id_break();
   }

   public void id_class(rSa_1 var1, rye_3 var2) {
      if (this.id_int != null && this.id_continue.contains(var1)) {
         id_class.debug("Aborting respawn sequence");
         this.id_int = null;
         this.id_new = 0;
         this.id_case();
         this.id_class(true);
      } else {
         this.id_volatile();
         an_3 var3 = this.id_protected.id_break(this.id_volatile);
         if (var3 instanceof rSu_1) {
            ((rSu_1)var3).id_class(var1, var1.Bs(), var2);
         }
      }
   }

   public rcd_3 id_class() {
      rcd_3 var1 = new rcd_3();
      if (this.id_volatile != null) {
         var1.id_class("Dragon", this.id_volatile);
      }

      var1.id_class("DragonKilled", this.id_extends);
      var1.id_class("PreviouslyKilled", this.id_native);
      if (this.id_package != null) {
         var1.id_class("ExitPortalLocation", rco_3.id_class(this.id_package));
      }

      rcy_3 var2 = new rcy_3();

      for (int var4 : this.id_throws) {
         var2.add(rcn_3.id_class(var4));
      }

      var1.id_class("Gateways", var2);
      return var1;
   }

   public void id_class(rSu_1 var1) {
      if (var1.ro().equals(this.id_volatile)) {
         this.id_byte.id_class(0.0F);
         this.id_byte.id_protected(false);
         this.id_class(true);
         this.id_final();
         if (!this.id_native) {
            this.id_protected.id_break(this.id_protected.id_class(rKv_1.MOTION_BLOCKING, rUs_1.id_class), xu_3.SX.id_continue());
         }

         this.id_native = true;
         this.id_extends = true;
      }
   }

   private void id_class(boolean var1) {
      rUs_1 var2 = new rUs_1(var1);
      if (this.id_package == null) {
         this.id_package = this.id_protected.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class).id_break();

         while (this.id_protected.id_byte(this.id_package).id_class(xu_3.id_while) && this.id_package.c_() > this.id_protected.id_short()) {
            this.id_package = this.id_package.id_break();
         }
      }

      var2.id_break(rUv_1.id_volatile).id_class(this.id_protected, this.id_protected.id_else().id_implements(), new Random(), this.id_package);
   }

   private void id_class(List<rSa_1> var1) {
      if (this.id_extends && this.id_int == null) {
         for (QJ var2 = this.id_finally(); var2 != null; var2 = this.id_finally()) {
            for (int var3 = 0; var3 < this.id_case.id_byte(); var3++) {
               for (int var4 = 0; var4 < this.id_case.id_break(); var4++) {
                  for (int var5 = 0; var5 < this.id_case.id_class(); var5++) {
                     ryw_3 var6 = var2.id_class(var3, var4, var5);
                     if (var6.id_class().id_class(xu_3.id_while) || var6.id_class().id_class(xu_3.SM)) {
                        this.id_protected.id_break(var6.id_protected(), xu_3.Sh.id_continue());
                     }
                  }
               }
            }
         }

         this.id_int = rKb_1.START;
         this.id_new = 0;
         this.id_class(false);
         this.id_continue = var1;
      }
   }

   protected void id_class(rKb_1 var1) {
      if (this.id_int == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.id_new = 0;
         if (var1 == rKb_1.END) {
            this.id_int = null;
            this.id_extends = false;
            rSu_1 var2 = this.id_package();

            for (rhN_2 var4 : this.id_byte.id_int()) {
               Oo_1.id_final.id_class(var4, var2);
            }
         } else {
            this.id_int = var1;
         }
      }
   }

   private void id_class(rfH_2 var1) {
      this.id_protected.id_byte(3000, var1, 0);
      rUx_1.id_byte.id_class(this.id_protected, this.id_protected.id_else().id_implements(), new Random(), var1);
   }

   public void id_break() {
      this.id_byte.id_protected(!this.id_extends);
      if (++this.id_finally >= 20) {
         this.id_native();
         this.id_finally = 0;
      }

      if (!this.id_byte.id_int().isEmpty()) {
         this.id_protected.id_else().id_class(rrEl_1.id_break, new rfj_3(0, 0), 9, rqg_3.INSTANCE);
         boolean var1 = this.id_extends();
         if (this.id_final && var1) {
            this.id_catch();
            this.id_final = false;
         }

         if (this.id_int != null) {
            if (this.id_continue == null && var1) {
               this.id_int = null;
               this.id_throws();
            }

            this.id_int.id_class(this.id_protected, this, this.id_continue, this.id_new++, this.id_package);
         }

         if (!this.id_extends) {
            if ((this.id_volatile == null || ++this.id_catch >= 1200) && var1) {
               this.id_private();
               this.id_catch = 0;
            }

            if (++this.id_implements >= 100 && var1) {
               this.id_volatile();
               this.id_implements = 0;
            }
         }
      } else {
         this.id_protected.id_else().id_break(rrEl_1.id_break, new rfj_3(0, 0), 9, rqg_3.INSTANCE);
      }
   }

   public void id_break(rSu_1 var1) {
      if (var1.ro().equals(this.id_volatile)) {
         this.id_byte.id_class(var1.Ss() / var1.SK());
         this.id_catch = 0;
         if (var1.Bk()) {
            this.id_byte.id_class(var1.L_());
         }
      }
   }

   public void id_throws() {
      if (this.id_extends && this.id_int == null) {
         rfH_2 var1 = this.id_package;
         if (var1 == null) {
            id_class.debug("Tried to respawn, but need to find the portal first.");
            QJ var2 = this.id_finally();
            if (var2 == null) {
               id_class.debug("Couldn't find a portal, so we made one.");
               this.id_class(true);
            } else {
               id_class.debug("Found the exit portal & temporarily using it.");
            }

            var1 = this.id_package;
         }

         ArrayList var7 = Lists.newArrayList();
         rfH_2 var3 = var1.id_break(1);

         for (rpr_3 var5 : rpb_3.HORIZONTAL) {
            List var6 = this.id_protected.id_class(rSa_1.class, new rfl_3(var3.id_class(var5, 2)));
            if (var6.isEmpty()) {
               return;
            }

            var7.addAll(var6);
         }

         id_class.debug("Found all crystals, respawning dragon.");
         this.id_class(var7);
      }
   }

   private QJ id_finally() {
      for (int var1 = -8; var1 <= 8; var1++) {
         for (int var2 = -8; var2 <= 8; var2++) {
            roJ_2 var3 = this.id_protected.id_throws(var1, var2);

            for (ryO_2 var5 : var3.id_volatile().values()) {
               if (var5 instanceof rHp_1) {
                  QJ var6 = this.id_case.id_class(this.id_protected, var5.id_char());
                  if (var6 != null) {
                     rfH_2 var7 = var6.id_class(3, 3, 3).id_protected();
                     if (this.id_package == null && var7.b_() == 0 && var7.d_() == 0) {
                        this.id_package = var7;
                     }

                     return var6;
                  }
               }
            }
         }
      }

      int var8 = this.id_protected.id_class(rKv_1.MOTION_BLOCKING, rUs_1.id_class).c_();

      for (int var9 = var8; var9 >= 0; var9--) {
         QJ var10 = this.id_case.id_class(this.id_protected, new rfH_2(rUs_1.id_class.b_(), var9, rUs_1.id_class.d_()));
         if (var10 != null) {
            if (this.id_package == null) {
               this.id_package = var10.id_class(3, 3, 3).id_protected();
            }

            return var10;
         }
      }

      return null;
   }

   private void id_catch() {
      id_class.info("Scanning for legacy world dragon fight...");
      boolean var1 = this.id_implements();
      if (var1) {
         id_class.info("Found that the dragon has been killed in this world already.");
         this.id_native = true;
      } else {
         id_class.info("Found that the dragon has not yet been killed in this world.");
         this.id_native = false;
         if (this.id_finally() == null) {
            this.id_class(false);
         }
      }

      List var2 = this.id_protected.id_super();
      if (var2.isEmpty()) {
         this.id_extends = true;
      } else {
         rSu_1 var3 = (rSu_1)var2.get(0);
         this.id_volatile = var3.ro();
         id_class.info("Found that there's a dragon still alive ({})", var3);
         this.id_extends = false;
         if (!var1) {
            id_class.info("But we didn't have a portal, let's remove it.");
            var3.PD();
            this.id_volatile = null;
         }
      }

      if (!this.id_native && this.id_extends) {
         this.id_extends = false;
      }
   }

   private boolean id_extends() {
      for (int var1 = -8; var1 <= 8; var1++) {
         for (int var2 = 8; var2 <= 8; var2++) {
            roC_2 var3 = this.id_protected.id_class(var1, var2, roN_2.id_volatile, false);
            if (!(var3 instanceof roJ_2)) {
               return false;
            }

            rrEJ var4 = ((roJ_2)var3).id_instanceof();
            if (!var4.id_class(rrEJ.TICKING)) {
               return false;
            }
         }
      }

      return true;
   }

   public void id_case() {
      for (rUG var2 : rUE.id_class(this.id_protected)) {
         for (rSa_1 var4 : this.id_protected.id_class(rSa_1.class, var2.id_case())) {
            var4.id_catch(false);
            var4.id_class((rfH_2)null);
         }
      }
   }

   private boolean id_implements() {
      for (int var1 = -8; var1 <= 8; var1++) {
         for (int var2 = -8; var2 <= 8; var2++) {
            roJ_2 var3 = this.id_protected.id_throws(var1, var2);

            for (ryO_2 var5 : var3.id_volatile().values()) {
               if (var5 instanceof rHp_1) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private rSu_1 id_package() {
      this.id_protected.id_this(new rfH_2(0, 128, 0));
      rSu_1 var1 = aI_2.id_this.id_class(this.id_protected);
      var1.L().id_class(rST.id_class);
      var1.id_class(0.0, 128.0, 0.0, this.id_protected.id_int.nextFloat() * 360.0F, 0.0F);
      this.id_protected.a_(var1);
      this.id_volatile = var1.ro();
      return var1;
   }

   public boolean id_protected() {
      return this.id_native;
   }

   private void id_private() {
      List var1 = this.id_protected.id_super();
      if (var1.isEmpty()) {
         id_class.debug("Haven't seen the dragon, respawning it");
         this.id_package();
      } else {
         id_class.debug("Haven't seen our dragon, but found another one to use.");
         this.id_volatile = ((rSu_1)var1.get(0)).ro();
      }
   }

   private void id_final() {
      if (!this.id_throws.isEmpty()) {
         int var1 = this.id_throws.remove(this.id_throws.size() - 1);
         int var2 = rfU_2.id_byte(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)var1)));
         int var3 = rfU_2.id_byte(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)var1)));
         this.id_class(new rfH_2(var2, 75, var3));
      }
   }

   private void id_volatile() {
      this.id_implements = 0;
      this.id_private = 0;

      for (rUG var2 : rUE.id_class(this.id_protected)) {
         this.id_private = this.id_private + this.id_protected.id_class(rSa_1.class, var2.id_case()).size();
      }

      id_class.debug("Found {} end crystals still alive", this.id_private);
   }

   private void id_native() {
      HashSet var1 = Sets.newHashSet();

      for (rhN_2 var3 : this.id_protected.id_class(id_break)) {
         this.id_byte.id_class(var3);
         var1.add(var3);
      }

      HashSet var5 = Sets.newHashSet(this.id_byte.id_int());
      var5.removeAll(var1);

      for (rhN_2 var4 : var5) {
         this.id_byte.id_break(var4);
      }
   }
}
