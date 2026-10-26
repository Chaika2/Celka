package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rCr_1 {
   public static final File class_ = new File("banned-players.json");
   public static final File break_ = new File("banned-ips.json");
   public static final File byte_ = new File("ops.json");
   public static final File protected_ = new File("whitelist.json");
   private static final Logger case_ = LogManager.getLogger();
   private static final SimpleDateFormat catch_ = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final rnW_2 private_;
   private final List<rhN_2> implements_ = Lists.newArrayList();
   private final Map<UUID, rhN_2> finally_ = Maps.newHashMap();
   private final rno_3 extends_ = new rno_3(class_);
   private final rnU_2 native_ = new rnU_2(break_);
   private final rna_3 volatile_ = new rna_3(byte_);
   private final rCk_1 final_ = new rCk_1(protected_);
   private final Map<UUID, rCa_1> package_ = Maps.newHashMap();
   private final Map<UUID, hs_3> int_ = Maps.newHashMap();
   private final rrGx_1 new_;
   private boolean continue_;
   private final rVv_1 super_;
   protected final int throws_;
   private int this_;
   private rRl_1 else_;
   private boolean synchronized_;
   private int return_;

   public boolean byte_(GameProfile var1) {
      return !this.continue_ || this.volatile_.protected_(var1) || this.final_.protected_(var1);
   }

   public rnW_2 byte_() {
      return this.private_;
   }

   public void byte_(rhN_2 var1) {
      rrEm_1 var2 = var1.continue_();
      var1.break_(rlB_2.finally_);
      this.class_(var1);
      if (var1.Pm()) {
         an_3 var3 = var1.PO();
         if (var3.Pq()) {
            case_.debug("Removing player mount");
            var1.BH();
            var2.extends_(var3);
            Boolean var10 = true;
            var3.throws_[27] = var10;

            for (an_3 var5 : var3.PP()) {
               var2.extends_(var5);
               Boolean var11 = true;
               var5.throws_[27] = var11;
            }

            var2.throws_((Integer)var1.throws_[51], (Integer)var1.throws_[53]).case_();
         }
      }

      var1.K();
      var2.throws_(var1);
      var1.r().class_();
      this.implements_.remove(var1);
      this.private_.U().break_(var1);
      UUID var12 = var1.ro();
      rhN_2 var13 = this.finally_.get(var12);
      if (var13 == var1) {
         this.finally_.remove(var12);
         this.package_.remove(var12);
         this.int_.remove(var12);
      }

      this.class_(new rvg_3(rvY_2.REMOVE_PLAYER, var1));
   }

   public boolean int_() {
      return this.continue_;
   }

   public rCr_1(rnW_2 var1, rVv_1 var2, rrGx_1 var3, int var4) {
      this.private_ = var1;
      this.super_ = var2;
      this.throws_ = var4;
      this.new_ = var3;
   }

   public void this_() {
      for (hs_3 var2 : this.int_.values()) {
         var2.class_(this.private_.t());
      }

      this.class_(new rFN(this.private_.g()));
      rFl_1 var4 = new rFl_1(this.private_.V().break_());

      for (rhN_2 var3 : this.implements_) {
         var3.class_.class_(var4);
         var3.float_().class_(var3);
      }
   }

   public void class_(rhN_2 var1, rrEm_1 var2) {
      roE_2 var3 = this.private_.abstract_().instanceof_();
      var1.class_.class_(new rFw_1(var3, rFf_1.INITIALIZE));
      var1.class_.class_(new rFp_1(var2.r(), var2.P(), var2.B().break_(rRu_1.finally_)));
      var1.class_.class_(new rFj_1(var2.X(), var2.J()));
      if (var2.s()) {
         var1.class_.class_(new rZY(rZY.break_, 0.0F));
         var1.class_.class_(new rZY(rZY.private_, var2.private_(1.0F)));
         var1.class_.class_(new rZY(rZY.implements_, var2.case_(1.0F)));
      }
   }

   protected void class_(rnG_2 var1, rhN_2 var2) {
      HashSet var3 = Sets.newHashSet();

      for (rnB_2 var5 : var1.throws_()) {
         var2.class_.class_(new rFc_1(var5, 0));
      }

      for (int var8 = 0; var8 < 19; var8++) {
         rnP_2 var9 = var1.class_(var8);
         if (var9 != null && !var3.contains(var9)) {
            for (ruS_2 var7 : var1.catch_(var9)) {
               var2.class_.class_(var7);
            }

            var3.add(var9);
         }
      }
   }

   public void class_(boolean var1) {
      this.continue_ = var1;
   }

   public void class_(rud_3 var1, rhN_2 var2) {
      GameProfile var3 = var2.sv();
      rCB var4 = this.private_.F();
      GameProfile var5 = var4.class_(var3.getId());
      String var6 = var5 == null ? var3.getName() : var5.getName();
      var4.class_(var3);
      rcd_3 var7 = this.break_(var2);
      rqM_2 var8 = var7 != null ? rRJ.class_(new Dynamic(rcf_3.class_, var7.byte_("Dimension"))).resultOrPartial(case_::error).orElse(rYB.byte_) : rYB.byte_;
      rrEm_1 var9 = this.private_.class_(var8);
      rrEm_1 var10;
      if (var9 == null) {
         case_.warn("Unknown respawn dimension {}, defaulting to overworld", var8);
         var10 = this.private_.abstract_();
      } else {
         var10 = var9;
      }

      var2.class_((rYB)var10);
      var2.finally_.class_((rrEm_1)((rYB)var2.throws_[7]));
      String var11 = "local";
      if (var1.byte_() != null) {
         var11 = var1.byte_().toString();
      }

      case_.info("{}[{}] logged in with entity id {} at ({}, {}, {})", var2.g().getString(), var11, var2.V(), var2.rx(), var2.re(), var2.BO());
      rrGs_1 var12 = var10.public_();
      this.class_(var2, (rhN_2)null, var10);
      rmy_3 var13 = new rmy_3(this.private_, var1, var2);
      rRu_1 var14 = var10.B();
      boolean var15 = var14.break_(rRu_1.while_);
      boolean var16 = var14.break_(rRu_1.package_);
      var13.class_(
         new rvZ_2(
            var2.V(),
            var2.finally_.break_(),
            var2.finally_.byte_(),
            rYA.class_(var10.break_()),
            var12.implements_(),
            this.private_.long_(),
            this.super_,
            var10.default_(),
            var10.E(),
            this.package_(),
            this.this_,
            var16,
            !var15,
            var10.b(),
            var10.z()
         )
      );
      var13.class_(new rvE_2(rvE_2.class_, new ruu_3(Unpooled.buffer()).class_(this.byte_().void_())));
      var13.class_(new rFE(var12.extends_(), var12.native_()));
      var13.class_(new rvf_3((rhx_3)var2.implements_[18]));
      var13.class_(new rvm_3(((rhz_3)var2.implements_[1]).protected_));
      var13.class_(new rFl_1(this.private_.V().break_()));
      var13.class_(new rFN(this.private_.g()));
      this.protected_(var2);
      var2.long_().byte_();
      var2.float_().class_(var2);
      this.class_(var10.native_(), var2);
      this.private_.A();
      rgn_3 var17;
      if (var2.sv().getName().equalsIgnoreCase(var6)) {
         var17 = new rgn_3("multiplayer.player.joined", var2.L_());
      } else {
         var17 = new rgn_3("multiplayer.player.joined.renamed", var2.L_(), var6);
      }

      this.class_(var17.class_(rgF_2.YELLOW), rVU.SYSTEM, rqR_2.break_);
      var13.class_(var2.rx(), var2.re(), var2.BO(), (Float)var2.throws_[15], (Float)var2.throws_[16]);
      this.implements_.add(var2);
      this.finally_.put(var2.ro(), var2);
      this.class_(new rvg_3(rvY_2.ADD_PLAYER, var2));

      for (int var18 = 0; var18 < this.implements_.size(); var18++) {
         var2.class_.class_(new rvg_3(rvY_2.ADD_PLAYER, this.implements_.get(var18)));
      }

      var10.byte_(var2);
      this.private_.U().class_(var2);
      this.class_(var2, var10);
      if (!this.private_.for_().isEmpty()) {
         var2.class_(this.private_.for_(), this.private_.double_());
      }

      for (rLY var19 : var2.So()) {
         var13.class_(new rvT_2(var2.V(), var19));
      }

      if (var7 != null && var7.byte_("RootVehicle", 10)) {
         rcd_3 var24 = var7.int_("RootVehicle");
         an_3 var25 = aI_2.class_(var24.int_("Entity"), var10, var1x -> !var10.case_(var1x) ? null : var1x);
         if (var25 != null) {
            UUID var20;
            if (var24.break_("Attach")) {
               var20 = var24.class_("Attach");
            } else {
               var20 = null;
            }

            if (var25.ro().equals(var20)) {
               var2.class_(var25, true);
            } else {
               for (an_3 var22 : var25.PP()) {
                  if (var22.ro().equals(var20)) {
                     var2.class_(var22, true);
                     break;
                  }
               }
            }

            if (!var2.Pm()) {
               case_.warn("Couldn't reattach entity to player");
               var10.extends_(var25);

               for (an_3 var27 : var25.PP()) {
                  var10.extends_(var27);
               }
            }
         }
      }

      var2.throws_();
   }

   public rhN_2 class_(String var1) {
      for (rhN_2 var3 : this.implements_) {
         if (var3.sv().getName().equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void class_(rhd_3 var1, double var2, double var4, double var6, double var8, rqM_2<rYB> var10, ruS_2<?> var11) {
      for (int var12 = 0; var12 < this.implements_.size(); var12++) {
         rhN_2 var13 = this.implements_.get(var12);
         if (var13 != var1 && ((rYB)var13.throws_[7]).E() == var10) {
            double var14 = var2 - var13.rx();
            double var16 = var4 - var13.re();
            double var18 = var6 - var13.BO();
            if (var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
               var13.class_.class_(var11);
            }
         }
      }
   }

   public void class_(rrEm_1 var1) {
      var1.instanceof_().class_(new rCP(this));
   }

   public void class_() {
   }

   public rCa_1 class_(rhd_3 var1) {
      UUID var2 = var1.ro();
      rCa_1 var3 = var2 == null ? null : this.package_.get(var2);
      if (var3 == null) {
         File var4 = this.private_.class_(rrGr_1.break_).toFile();
         File var5 = new File(var4, var2 + ".json");
         if (!var5.exists()) {
            File var6 = new File(var4, var1.g().getString() + ".json");
            if (var6.exists() && var6.isFile()) {
               var6.renameTo(var5);
            }
         }

         var3 = new rCa_1(this.private_, var5);
         this.package_.put(var2, var3);
      }

      return var3;
   }

   public void class_(int var1) {
      this.this_ = var1;
      this.class_(new rFq_1(var1));

      for (rrEm_1 var3 : this.private_.float_()) {
         if (var3 != null) {
            var3.else_().class_(var1);
         }
      }
   }

   public rhN_2 class_(UUID var1) {
      return this.finally_.get(var1);
   }

   public void class_(rgP_2 var1, rVU var2, UUID var3) {
      this.private_.class_(var1, var3);
      this.class_(new rZK(var1, var2, var3));
   }

   private void class_(rhN_2 var1, rhN_2 var2, rrEm_1 var3) {
      if (var2 != null) {
         var1.finally_.class_(var2.finally_.break_(), var2.finally_.byte_());
      } else if (this.else_ != null) {
         var1.finally_.class_(this.else_, rRl_1.NOT_SET);
      }

      var1.finally_.break_(var3.const_().rB().new_());
   }

   public void class_(rRl_1 var1) {
      this.else_ = var1;
   }

   public rgP_2 class_(SocketAddress var1, GameProfile var2) {
      if (this.extends_.class_(var2)) {
         rCJ var5 = this.extends_.break_(var2);
         rgn_3 var6 = new rgn_3("multiplayer.disconnect.banned.reason", var5.byte_());
         if (var5.break_() != null) {
            var6.class_(new rgn_3("multiplayer.disconnect.banned.expiration", catch_.format(var5.break_())));
         }

         return var6;
      } else if (!this.byte_(var2)) {
         return new rgn_3("multiplayer.disconnect.not_whitelisted");
      } else if (this.native_.class_(var1)) {
         rnD_2 var3 = this.native_.break_(var1);
         rgn_3 var4 = new rgn_3("multiplayer.disconnect.banned_ip.reason", var3.byte_());
         if (var3.break_() != null) {
            var4.class_(new rgn_3("multiplayer.disconnect.banned_ip.expiration", catch_.format(var3.break_())));
         }

         return var4;
      } else {
         return this.implements_.size() >= this.throws_ && !this.protected_(var2) ? new rgn_3("multiplayer.disconnect.server_full") : null;
      }
   }

   public void class_(ruS_2<?> var1) {
      for (int var2 = 0; var2 < this.implements_.size(); var2++) {
         this.implements_.get(var2).class_.class_(var1);
      }
   }

   public void class_(GameProfile var1) {
      this.volatile_.class_(new rne_3(var1, this.private_.new_(), this.volatile_.class_(var1)));
      rhN_2 var2 = this.class_(var1.getId());
      if (var2 != null) {
         this.protected_(var2);
      }
   }

   public void class_(ruS_2<?> var1, rqM_2<rYB> var2) {
      for (int var3 = 0; var3 < this.implements_.size(); var3++) {
         rhN_2 var4 = this.implements_.get(var3);
         if (((rYB)var4.throws_[7]).E() == var2) {
            var4.class_.class_(var1);
         }
      }
   }

   public rhN_2 class_(rhN_2 var1, boolean var2) {
      this.implements_.remove(var1);
      var1.continue_().throws_(var1);
      rfH_2 var3 = var1.S();
      float var4 = var1.s();
      boolean var5 = var1.b();
      rrEm_1 var6 = this.private_.class_(var1.E());
      Optional var7;
      if (var6 != null && var3 != null) {
         var7 = rhd_3.class_(var6, var3, var4, var5, var2);
      } else {
         var7 = Optional.empty();
      }

      rrEm_1 var8 = var6 != null && var7.isPresent() ? var6 : this.private_.abstract_();
      Object var9;
      if (this.private_.transient_()) {
         var9 = new rnK_2(var8);
      } else {
         var9 = new rni_3(var8);
      }

      rhN_2 var10 = new rhN_2(this.private_, var8, var1.sv(), (rni_3)var9);
      var10.class_ = var1.class_;
      var10.class_(var1, var2);
      var10.implements_(var1.V());
      var10.class_(var1.Su());

      for (String var12 : var1.y()) {
         var10.implements_(var12);
      }

      this.class_(var10, var1, var8);
      boolean var17 = false;
      if (var7.isPresent()) {
         xc_3 var18 = var8.byte_(var3);
         boolean var13 = var18.class_(xu_3.Jk);
         rjU_2 var14 = (rjU_2)var7.get();
         float var15;
         if (!var18.class_(rls_3.short_) && !var13) {
            var15 = var4;
         } else {
            rjU_2 var16 = rjU_2.protected_(var3).protected_(var14).protected_();
            var15 = (float)rfU_2.case_(rfU_2.protected_(var16.protected_, var16.break_) * 180.0F / (float)Math.PI - 90.0);
         }

         var10.class_(var14.break_, var14.byte_, var14.protected_, var15, 0.0F);
         var10.class_(var8.E(), var3, var4, var5, false);
         var17 = !var2 && var13;
      } else if (var3 != null) {
         var10.class_.class_(new rZY(rZY.class_, 0.0F));
      }

      while (!var8.throws_(var10) && var10.re() < 256.0) {
         var10.new_(var10.rx(), var10.re() + 1.0, var10.BO());
      }

      rrGs_1 var19 = ((rYB)var10.throws_[7]).public_();
      var10.class_
         .class_(
            new rFP(
               ((rYB)var10.throws_[7]).default_(),
               ((rYB)var10.throws_[7]).E(),
               rYA.class_(var10.continue_().break_()),
               var10.finally_.break_(),
               var10.finally_.byte_(),
               var10.continue_().b(),
               var10.continue_().z(),
               var2
            )
         );
      var10.class_.class_(var10.rx(), var10.re(), var10.BO(), (Float)var10.throws_[15], (Float)var10.throws_[16]);
      var10.class_.class_(new rFj_1(var8.X(), var8.J()));
      var10.class_.class_(new rFE(var19.extends_(), var19.native_()));
      var10.class_.class_(new rFG((Float)var10.implements_[21], (Integer)var10.implements_[20], (Integer)var10.implements_[19]));
      this.class_(var10, var8);
      this.protected_(var10);
      var8.protected_(var10);
      this.implements_.add(var10);
      this.finally_.put(var10.ro(), var10);
      var10.throws_();
      var10.public_(var10.Ss());
      if (var17) {
         var10.class_.class_(new rvt_3(rqn_3.XH, rqL_2.BLOCKS, (double)var3.b_(), (double)var3.c_(), (double)var3.d_(), 1.0F, 1.0F));
      }

      return var10;
   }

   public void class_(rhd_3 var1, rgP_2 var2) {
      rnM_2 var3 = var1.BG();
      if (var3 != null) {
         for (String var5 : var3.case_()) {
            rhN_2 var6 = this.class_(var5);
            if (var6 != null && var6 != var1) {
               var6.class_(var2, var1.ro());
            }
         }
      }
   }

   private void class_(rhN_2 var1, int var2) {
      if (var1.class_ != null) {
         byte var3;
         if (var2 <= 0) {
            var3 = 24;
         } else if (var2 >= 4) {
            var3 = 28;
         } else {
            var3 = (byte)(24 + var2);
         }

         var1.class_.class_(new rvQ_2(var1, var3));
      }

      this.private_.f().class_(var1);
   }

   protected void class_(rhN_2 var1) {
      this.new_.class_(var1);
      rCa_1 var2 = this.package_.get(var1.ro());
      if (var2 != null) {
         var2.class_();
      }

      hs_3 var3 = this.int_.get(var1.ro());
      if (var3 != null) {
         var3.break_();
      }
   }

   public void break_(boolean var1) {
      this.synchronized_ = var1;
   }

   public void break_(rhd_3 var1, rgP_2 var2) {
      rnM_2 var3 = var1.BG();
      if (var3 == null) {
         this.class_(var2, rVU.SYSTEM, var1.ro());
      } else {
         for (int var4 = 0; var4 < this.implements_.size(); var4++) {
            rhN_2 var5 = this.implements_.get(var4);
            if (var5.BG() != var3) {
               var5.class_(var2, var1.ro());
            }
         }
      }
   }

   public List<rhN_2> break_(String var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rhN_2 var4 : this.implements_) {
         if (var4.super_().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public rcd_3 break_(rhN_2 var1) {
      rcd_3 var2 = this.private_.rB().char_();
      rcd_3 var3;
      if (var1.g().getString().equals(this.private_.default_()) && var2 != null) {
         var3 = var2;
         var1.throws_(var2);
         case_.debug("loading single player");
      } else {
         var3 = this.new_.break_(var1);
      }

      return var3;
   }

   public void break_(GameProfile var1) {
      this.volatile_.byte_(var1);
      rhN_2 var2 = this.class_(var1.getId());
      if (var2 != null) {
         this.protected_(var2);
      }
   }

   public rhN_2 throws_(GameProfile var1) {
      UUID var2 = rhd_3.class_(var1);
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < this.implements_.size(); var4++) {
         rhN_2 var5 = this.implements_.get(var4);
         if (var5.ro().equals(var2)) {
            var3.add(var5);
         }
      }

      rhN_2 var7 = this.finally_.get(var1.getId());
      if (var7 != null && !var3.contains(var7)) {
         var3.add(var7);
      }

      for (rhN_2 var6 : var3) {
         var6.class_.class_(new rgn_3("multiplayer.disconnect.duplicate_login"));
      }

      rrEm_1 var9 = this.private_.abstract_();
      Object var10;
      if (this.private_.transient_()) {
         var10 = new rnK_2(var9);
      } else {
         var10 = new rni_3(var9);
      }

      return new rhN_2(this.private_, var9, var1, (rni_3)var10);
   }

   public void throws_() {
      if (++this.return_ > 600) {
         this.class_(new rvg_3(rvY_2.UPDATE_LATENCY, this.implements_));
         this.return_ = 0;
      }
   }

   public void throws_(rhN_2 var1) {
      var1.class_((rJT)var1.implements_[3]);
      var1.new_();
      var1.class_.class_(new rvm_3(((rhz_3)var1.implements_[1]).protected_));
   }

   public rCk_1 finally_() {
      return this.final_;
   }

   public rno_3 catch_() {
      return this.extends_;
   }

   public String[] extends_() {
      return this.final_.class_();
   }

   public boolean case_(GameProfile var1) {
      return this.volatile_.protected_(var1) || this.private_.break_(var1) && this.private_.rB().continue_() || this.synchronized_;
   }

   public hs_3 case_(rhN_2 var1) {
      UUID var2 = var1.ro();
      hs_3 var3 = this.int_.get(var2);
      if (var3 == null) {
         File var4 = this.private_.class_(rrGr_1.class_).toFile();
         File var5 = new File(var4, var2 + ".json");
         var3 = new hs_3(this.private_.T(), this, this.private_.t(), var5, var1);
         this.int_.put(var2, var3);
      }

      var3.class_(var1);
      return var3;
   }

   public String[] case_() {
      String[] var1 = new String[this.implements_.size()];

      for (int var2 = 0; var2 < this.implements_.size(); var2++) {
         var1[var2] = this.implements_.get(var2).sv().getName();
      }

      return var1;
   }

   public void continue_() {
      for (int var1 = 0; var1 < this.implements_.size(); var1++) {
         this.implements_.get(var1).class_.class_(new rgn_3("multiplayer.disconnect.server_shutdown"));
      }
   }

   public boolean else_() {
      return this.synchronized_;
   }

   public void implements_() {
      for (int var1 = 0; var1 < this.implements_.size(); var1++) {
         this.class_(this.implements_.get(var1));
      }
   }

   public int new_() {
      return this.this_;
   }

   public int package_() {
      return this.throws_;
   }

   public List<rhN_2> super_() {
      return this.implements_;
   }

   public boolean protected_(GameProfile var1) {
      return false;
   }

   public rcd_3 protected_() {
      return null;
   }

   public void protected_(rhN_2 var1) {
      GameProfile var2 = var1.sv();
      int var3 = this.private_.class_(var2);
      this.class_(var1, var3);
   }

   public rnU_2 private_() {
      return this.native_;
   }

   public int final_() {
      return this.implements_.size();
   }

   public String[] volatile_() {
      return this.volatile_.class_();
   }

   public rna_3 native_() {
      return this.volatile_;
   }
}
