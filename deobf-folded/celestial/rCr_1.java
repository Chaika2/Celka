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
   public static final File id_class = new File("banned-players.json");
   public static final File id_break = new File("banned-ips.json");
   public static final File id_byte = new File("ops.json");
   public static final File id_protected = new File("whitelist.json");
   private static final Logger id_case = LogManager.getLogger();
   private static final SimpleDateFormat id_catch = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final rnW_2 id_private;
   private final List<rhN_2> id_implements = Lists.newArrayList();
   private final Map<UUID, rhN_2> id_finally = Maps.newHashMap();
   private final rno_3 id_extends = new rno_3(id_class);
   private final rnU_2 id_native = new rnU_2(id_break);
   private final rna_3 id_volatile = new rna_3(id_byte);
   private final rCk_1 id_final = new rCk_1(id_protected);
   private final Map<UUID, rCa_1> id_package = Maps.newHashMap();
   private final Map<UUID, hs_3> id_int = Maps.newHashMap();
   private final rrGx_1 id_new;
   private boolean id_continue;
   private final rVv_1 id_super;
   protected final int id_throws;
   private int id_this;
   private rRl_1 id_else;
   private boolean id_synchronized;
   private int id_return;

   public boolean id_byte(GameProfile var1) {
      return !this.id_continue || this.id_volatile.id_protected(var1) || this.id_final.id_protected(var1);
   }

   public rnW_2 id_byte() {
      return this.id_private;
   }

   public void id_byte(rhN_2 var1) {
      rrEm_1 var2 = var1.id_continue();
      var1.id_break(rlB_2.id_finally);
      this.id_class(var1);
      if (var1.Pm()) {
         an_3 var3 = var1.PO();
         if (var3.Pq()) {
            id_case.debug("Removing player mount");
            var1.BH();
            var2.id_extends(var3);
            Boolean var10 = true;
            var3.id_throws[27] = var10;

            for (an_3 var5 : var3.PP()) {
               var2.id_extends(var5);
               Boolean var11 = true;
               var5.id_throws[27] = var11;
            }

            var2.id_throws((Integer)var1.id_throws[51], (Integer)var1.id_throws[53]).id_case();
         }
      }

      var1.K();
      var2.id_throws(var1);
      var1.r().id_class();
      this.id_implements.remove(var1);
      this.id_private.U().id_break(var1);
      UUID var12 = var1.ro();
      rhN_2 var13 = this.id_finally.get(var12);
      if (var13 == var1) {
         this.id_finally.remove(var12);
         this.id_package.remove(var12);
         this.id_int.remove(var12);
      }

      this.id_class(new rvg_3(rvY_2.REMOVE_PLAYER, var1));
   }

   public boolean id_int() {
      return this.id_continue;
   }

   public rCr_1(rnW_2 var1, rVv_1 var2, rrGx_1 var3, int var4) {
      this.id_private = var1;
      this.id_super = var2;
      this.id_throws = var4;
      this.id_new = var3;
   }

   public void id_this() {
      for (hs_3 var2 : this.id_int.values()) {
         var2.id_class(this.id_private.t());
      }

      this.id_class(new rFN(this.id_private.g()));
      rFl_1 var4 = new rFl_1(this.id_private.V().id_break());

      for (rhN_2 var3 : this.id_implements) {
         var3.id_class.id_class(var4);
         var3.id_float().id_class(var3);
      }
   }

   public void id_class(rhN_2 var1, rrEm_1 var2) {
      roE_2 var3 = this.id_private.id_abstract().id_instanceof();
      var1.id_class.id_class(new rFw_1(var3, rFf_1.INITIALIZE));
      var1.id_class.id_class(new rFp_1(var2.r(), var2.P(), var2.B().id_break(rRu_1.id_finally)));
      var1.id_class.id_class(new rFj_1(var2.X(), var2.J()));
      if (var2.s()) {
         var1.id_class.id_class(new rZY(rZY.id_break, 0.0F));
         var1.id_class.id_class(new rZY(rZY.id_private, var2.id_private(1.0F)));
         var1.id_class.id_class(new rZY(rZY.id_implements, var2.id_case(1.0F)));
      }
   }

   protected void id_class(rnG_2 var1, rhN_2 var2) {
      HashSet var3 = Sets.newHashSet();

      for (rnB_2 var5 : var1.id_throws()) {
         var2.id_class.id_class(new rFc_1(var5, 0));
      }

      for (int var8 = 0; var8 < 19; var8++) {
         rnP_2 var9 = var1.id_class(var8);
         if (var9 != null && !var3.contains(var9)) {
            for (ruS_2 var7 : var1.id_catch(var9)) {
               var2.id_class.id_class(var7);
            }

            var3.add(var9);
         }
      }
   }

   public void id_class(boolean var1) {
      this.id_continue = var1;
   }

   public void id_class(rud_3 var1, rhN_2 var2) {
      GameProfile var3 = var2.sv();
      rCB var4 = this.id_private.F();
      GameProfile var5 = var4.id_class(var3.getId());
      String var6 = var5 == null ? var3.getName() : var5.getName();
      var4.id_class(var3);
      rcd_3 var7 = this.id_break(var2);
      rqM_2 var8 = var7 != null
         ? rRJ.id_class(new Dynamic(rcf_3.id_class, var7.id_byte("Dimension"))).resultOrPartial(id_case::error).orElse(rYB.id_byte)
         : rYB.id_byte;
      rrEm_1 var9 = this.id_private.id_class(var8);
      rrEm_1 var10;
      if (var9 == null) {
         id_case.warn("Unknown respawn dimension {}, defaulting to overworld", var8);
         var10 = this.id_private.id_abstract();
      } else {
         var10 = var9;
      }

      var2.id_class((rYB)var10);
      var2.id_finally.id_class((rrEm_1)((rYB)var2.id_throws[7]));
      String var11 = "local";
      if (var1.id_byte() != null) {
         var11 = var1.id_byte().toString();
      }

      id_case.info("{}[{}] logged in with entity id {} at ({}, {}, {})", var2.g().getString(), var11, var2.V(), var2.rx(), var2.re(), var2.BO());
      rrGs_1 var12 = var10.id_public();
      this.id_class(var2, (rhN_2)null, var10);
      rmy_3 var13 = new rmy_3(this.id_private, var1, var2);
      rRu_1 var14 = var10.B();
      boolean var15 = var14.id_break(rRu_1.id_while);
      boolean var16 = var14.id_break(rRu_1.id_package);
      var13.id_class(
         new rvZ_2(
            var2.V(),
            var2.id_finally.id_break(),
            var2.id_finally.id_byte(),
            rYA.id_class(var10.id_break()),
            var12.id_implements(),
            this.id_private.id_long(),
            this.id_super,
            var10.id_default(),
            var10.E(),
            this.id_package(),
            this.id_this,
            var16,
            !var15,
            var10.b(),
            var10.z()
         )
      );
      var13.id_class(new rvE_2(rvE_2.id_class, new ruu_3(Unpooled.buffer()).id_class(this.id_byte().id_void())));
      var13.id_class(new rFE(var12.id_extends(), var12.id_native()));
      var13.id_class(new rvf_3((rhx_3)var2.id_implements[18]));
      var13.id_class(new rvm_3(((rhz_3)var2.id_implements[1]).id_protected));
      var13.id_class(new rFl_1(this.id_private.V().id_break()));
      var13.id_class(new rFN(this.id_private.g()));
      this.id_protected(var2);
      var2.id_long().id_byte();
      var2.id_float().id_class(var2);
      this.id_class(var10.id_native(), var2);
      this.id_private.A();
      rgn_3 var17;
      if (var2.sv().getName().equalsIgnoreCase(var6)) {
         var17 = new rgn_3("multiplayer.player.joined", var2.L_());
      } else {
         var17 = new rgn_3("multiplayer.player.joined.renamed", var2.L_(), var6);
      }

      this.id_class(var17.id_class(rgF_2.YELLOW), rVU.SYSTEM, rqR_2.id_break);
      var13.id_class(var2.rx(), var2.re(), var2.BO(), (Float)var2.id_throws[15], (Float)var2.id_throws[16]);
      this.id_implements.add(var2);
      this.id_finally.put(var2.ro(), var2);
      this.id_class(new rvg_3(rvY_2.ADD_PLAYER, var2));

      for (int var18 = 0; var18 < this.id_implements.size(); var18++) {
         var2.id_class.id_class(new rvg_3(rvY_2.ADD_PLAYER, this.id_implements.get(var18)));
      }

      var10.id_byte(var2);
      this.id_private.U().id_class(var2);
      this.id_class(var2, var10);
      if (!this.id_private.id_for().isEmpty()) {
         var2.id_class(this.id_private.id_for(), this.id_private.id_double());
      }

      for (rLY var19 : var2.So()) {
         var13.id_class(new rvT_2(var2.V(), var19));
      }

      if (var7 != null && var7.id_byte("RootVehicle", 10)) {
         rcd_3 var24 = var7.id_int("RootVehicle");
         an_3 var25 = aI_2.id_class(var24.id_int("Entity"), var10, var1x -> !var10.id_case(var1x) ? null : var1x);
         if (var25 != null) {
            UUID var20;
            if (var24.id_break("Attach")) {
               var20 = var24.id_class("Attach");
            } else {
               var20 = null;
            }

            if (var25.ro().equals(var20)) {
               var2.id_class(var25, true);
            } else {
               for (an_3 var22 : var25.PP()) {
                  if (var22.ro().equals(var20)) {
                     var2.id_class(var22, true);
                     break;
                  }
               }
            }

            if (!var2.Pm()) {
               id_case.warn("Couldn't reattach entity to player");
               var10.id_extends(var25);

               for (an_3 var27 : var25.PP()) {
                  var10.id_extends(var27);
               }
            }
         }
      }

      var2.id_throws();
   }

   public rhN_2 id_class(String var1) {
      for (rhN_2 var3 : this.id_implements) {
         if (var3.sv().getName().equalsIgnoreCase(var1)) {
            return var3;
         }
      }

      return null;
   }

   public void id_class(rhd_3 var1, double var2, double var4, double var6, double var8, rqM_2<rYB> var10, ruS_2<?> var11) {
      for (int var12 = 0; var12 < this.id_implements.size(); var12++) {
         rhN_2 var13 = this.id_implements.get(var12);
         if (var13 != var1 && ((rYB)var13.id_throws[7]).E() == var10) {
            double var14 = var2 - var13.rx();
            double var16 = var4 - var13.re();
            double var18 = var6 - var13.BO();
            if (var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
               var13.id_class.id_class(var11);
            }
         }
      }
   }

   public void id_class(rrEm_1 var1) {
      var1.id_instanceof().id_class(new rCP(this));
   }

   public void id_class() {
   }

   public rCa_1 id_class(rhd_3 var1) {
      UUID var2 = var1.ro();
      rCa_1 var3 = var2 == null ? null : this.id_package.get(var2);
      if (var3 == null) {
         File var4 = this.id_private.id_class(rrGr_1.id_break).toFile();
         File var5 = new File(var4, var2 + ".json");
         if (!var5.exists()) {
            File var6 = new File(var4, var1.g().getString() + ".json");
            if (var6.exists() && var6.isFile()) {
               var6.renameTo(var5);
            }
         }

         var3 = new rCa_1(this.id_private, var5);
         this.id_package.put(var2, var3);
      }

      return var3;
   }

   public void id_class(int var1) {
      this.id_this = var1;
      this.id_class(new rFq_1(var1));

      for (rrEm_1 var3 : this.id_private.id_float()) {
         if (var3 != null) {
            var3.id_else().id_class(var1);
         }
      }
   }

   public rhN_2 id_class(UUID var1) {
      return this.id_finally.get(var1);
   }

   public void id_class(rgP_2 var1, rVU var2, UUID var3) {
      this.id_private.id_class(var1, var3);
      this.id_class(new rZK(var1, var2, var3));
   }

   private void id_class(rhN_2 var1, rhN_2 var2, rrEm_1 var3) {
      if (var2 != null) {
         var1.id_finally.id_class(var2.id_finally.id_break(), var2.id_finally.id_byte());
      } else if (this.id_else != null) {
         var1.id_finally.id_class(this.id_else, rRl_1.NOT_SET);
      }

      var1.id_finally.id_break(var3.id_const().rB().id_new());
   }

   public void id_class(rRl_1 var1) {
      this.id_else = var1;
   }

   public rgP_2 id_class(SocketAddress var1, GameProfile var2) {
      if (this.id_extends.id_class(var2)) {
         rCJ var5 = this.id_extends.id_break(var2);
         rgn_3 var6 = new rgn_3("multiplayer.disconnect.banned.reason", var5.id_byte());
         if (var5.id_break() != null) {
            var6.id_class(new rgn_3("multiplayer.disconnect.banned.expiration", id_catch.format(var5.id_break())));
         }

         return var6;
      } else if (!this.id_byte(var2)) {
         return new rgn_3("multiplayer.disconnect.not_whitelisted");
      } else if (this.id_native.id_class(var1)) {
         rnD_2 var3 = this.id_native.id_break(var1);
         rgn_3 var4 = new rgn_3("multiplayer.disconnect.banned_ip.reason", var3.id_byte());
         if (var3.id_break() != null) {
            var4.id_class(new rgn_3("multiplayer.disconnect.banned_ip.expiration", id_catch.format(var3.id_break())));
         }

         return var4;
      } else {
         return this.id_implements.size() >= this.id_throws && !this.id_protected(var2) ? new rgn_3("multiplayer.disconnect.server_full") : null;
      }
   }

   public void id_class(ruS_2<?> var1) {
      for (int var2 = 0; var2 < this.id_implements.size(); var2++) {
         this.id_implements.get(var2).id_class.id_class(var1);
      }
   }

   public void id_class(GameProfile var1) {
      this.id_volatile.id_class(new rne_3(var1, this.id_private.id_new(), this.id_volatile.id_class(var1)));
      rhN_2 var2 = this.id_class(var1.getId());
      if (var2 != null) {
         this.id_protected(var2);
      }
   }

   public void id_class(ruS_2<?> var1, rqM_2<rYB> var2) {
      for (int var3 = 0; var3 < this.id_implements.size(); var3++) {
         rhN_2 var4 = this.id_implements.get(var3);
         if (((rYB)var4.id_throws[7]).E() == var2) {
            var4.id_class.id_class(var1);
         }
      }
   }

   public rhN_2 id_class(rhN_2 var1, boolean var2) {
      this.id_implements.remove(var1);
      var1.id_continue().id_throws(var1);
      rfH_2 var3 = var1.S();
      float var4 = var1.s();
      boolean var5 = var1.b();
      rrEm_1 var6 = this.id_private.id_class(var1.E());
      Optional var7;
      if (var6 != null && var3 != null) {
         var7 = rhd_3.id_class(var6, var3, var4, var5, var2);
      } else {
         var7 = Optional.empty();
      }

      rrEm_1 var8 = var6 != null && var7.isPresent() ? var6 : this.id_private.id_abstract();
      Object var9;
      if (this.id_private.id_transient()) {
         var9 = new rnK_2(var8);
      } else {
         var9 = new rni_3(var8);
      }

      rhN_2 var10 = new rhN_2(this.id_private, var8, var1.sv(), (rni_3)var9);
      var10.id_class = var1.id_class;
      var10.id_class(var1, var2);
      var10.id_implements(var1.V());
      var10.id_class(var1.Su());

      for (String var12 : var1.y()) {
         var10.id_implements(var12);
      }

      this.id_class(var10, var1, var8);
      boolean var17 = false;
      if (var7.isPresent()) {
         xc_3 var18 = var8.id_byte(var3);
         boolean var13 = var18.id_class(xu_3.Jk);
         rjU_2 var14 = (rjU_2)var7.get();
         float var15;
         if (!var18.id_class(rls_3.id_short) && !var13) {
            var15 = var4;
         } else {
            rjU_2 var16 = rjU_2.id_protected(var3).id_protected(var14).id_protected();
            var15 = (float)rfU_2.id_case(rfU_2.id_protected(var16.id_protected, var16.id_break) * 180.0F / (float)Math.PI - 90.0);
         }

         var10.id_class(var14.id_break, var14.id_byte, var14.id_protected, var15, 0.0F);
         var10.id_class(var8.E(), var3, var4, var5, false);
         var17 = !var2 && var13;
      } else if (var3 != null) {
         var10.id_class.id_class(new rZY(rZY.id_class, 0.0F));
      }

      while (!var8.id_throws(var10) && var10.re() < 256.0) {
         var10.id_new(var10.rx(), var10.re() + 1.0, var10.BO());
      }

      rrGs_1 var19 = ((rYB)var10.id_throws[7]).id_public();
      var10.id_class
         .id_class(
            new rFP(
               ((rYB)var10.id_throws[7]).id_default(),
               ((rYB)var10.id_throws[7]).E(),
               rYA.id_class(var10.id_continue().id_break()),
               var10.id_finally.id_break(),
               var10.id_finally.id_byte(),
               var10.id_continue().b(),
               var10.id_continue().z(),
               var2
            )
         );
      var10.id_class.id_class(var10.rx(), var10.re(), var10.BO(), (Float)var10.id_throws[15], (Float)var10.id_throws[16]);
      var10.id_class.id_class(new rFj_1(var8.X(), var8.J()));
      var10.id_class.id_class(new rFE(var19.id_extends(), var19.id_native()));
      var10.id_class.id_class(new rFG((Float)var10.id_implements[21], (Integer)var10.id_implements[20], (Integer)var10.id_implements[19]));
      this.id_class(var10, var8);
      this.id_protected(var10);
      var8.id_protected(var10);
      this.id_implements.add(var10);
      this.id_finally.put(var10.ro(), var10);
      var10.id_throws();
      var10.id_public(var10.Ss());
      if (var17) {
         var10.id_class.id_class(new rvt_3(rqn_3.XH, rqL_2.BLOCKS, (double)var3.b_(), (double)var3.c_(), (double)var3.d_(), 1.0F, 1.0F));
      }

      return var10;
   }

   public void id_class(rhd_3 var1, rgP_2 var2) {
      rnM_2 var3 = var1.BG();
      if (var3 != null) {
         for (String var5 : var3.id_case()) {
            rhN_2 var6 = this.id_class(var5);
            if (var6 != null && var6 != var1) {
               var6.id_class(var2, var1.ro());
            }
         }
      }
   }

   private void id_class(rhN_2 var1, int var2) {
      if (var1.id_class != null) {
         byte var3;
         if (var2 <= 0) {
            var3 = 24;
         } else if (var2 >= 4) {
            var3 = 28;
         } else {
            var3 = (byte)(24 + var2);
         }

         var1.id_class.id_class(new rvQ_2(var1, var3));
      }

      this.id_private.f().id_class(var1);
   }

   protected void id_class(rhN_2 var1) {
      this.id_new.id_class(var1);
      rCa_1 var2 = this.id_package.get(var1.ro());
      if (var2 != null) {
         var2.id_class();
      }

      hs_3 var3 = this.id_int.get(var1.ro());
      if (var3 != null) {
         var3.id_break();
      }
   }

   public void id_break(boolean var1) {
      this.id_synchronized = var1;
   }

   public void id_break(rhd_3 var1, rgP_2 var2) {
      rnM_2 var3 = var1.BG();
      if (var3 == null) {
         this.id_class(var2, rVU.SYSTEM, var1.ro());
      } else {
         for (int var4 = 0; var4 < this.id_implements.size(); var4++) {
            rhN_2 var5 = this.id_implements.get(var4);
            if (var5.BG() != var3) {
               var5.id_class(var2, var1.ro());
            }
         }
      }
   }

   public List<rhN_2> id_break(String var1) {
      ArrayList var2 = Lists.newArrayList();

      for (rhN_2 var4 : this.id_implements) {
         if (var4.id_super().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public rcd_3 id_break(rhN_2 var1) {
      rcd_3 var2 = this.id_private.rB().id_char();
      rcd_3 var3;
      if (var1.g().getString().equals(this.id_private.id_default()) && var2 != null) {
         var3 = var2;
         var1.id_throws(var2);
         id_case.debug("loading single player");
      } else {
         var3 = this.id_new.id_break(var1);
      }

      return var3;
   }

   public void id_break(GameProfile var1) {
      this.id_volatile.id_byte(var1);
      rhN_2 var2 = this.id_class(var1.getId());
      if (var2 != null) {
         this.id_protected(var2);
      }
   }

   public rhN_2 id_throws(GameProfile var1) {
      UUID var2 = rhd_3.id_class(var1);
      ArrayList var3 = Lists.newArrayList();

      for (int var4 = 0; var4 < this.id_implements.size(); var4++) {
         rhN_2 var5 = this.id_implements.get(var4);
         if (var5.ro().equals(var2)) {
            var3.add(var5);
         }
      }

      rhN_2 var7 = this.id_finally.get(var1.getId());
      if (var7 != null && !var3.contains(var7)) {
         var3.add(var7);
      }

      for (rhN_2 var6 : var3) {
         var6.id_class.id_class(new rgn_3("multiplayer.disconnect.duplicate_login"));
      }

      rrEm_1 var9 = this.id_private.id_abstract();
      Object var10;
      if (this.id_private.id_transient()) {
         var10 = new rnK_2(var9);
      } else {
         var10 = new rni_3(var9);
      }

      return new rhN_2(this.id_private, var9, var1, (rni_3)var10);
   }

   public void id_throws() {
      if (++this.id_return > 600) {
         this.id_class(new rvg_3(rvY_2.UPDATE_LATENCY, this.id_implements));
         this.id_return = 0;
      }
   }

   public void id_throws(rhN_2 var1) {
      var1.id_class((rJT)var1.id_implements[3]);
      var1.id_new();
      var1.id_class.id_class(new rvm_3(((rhz_3)var1.id_implements[1]).id_protected));
   }

   public rCk_1 id_finally() {
      return this.id_final;
   }

   public rno_3 id_catch() {
      return this.id_extends;
   }

   public String[] id_extends() {
      return this.id_final.id_class();
   }

   public boolean id_case(GameProfile var1) {
      return this.id_volatile.id_protected(var1) || this.id_private.id_break(var1) && this.id_private.rB().id_continue() || this.id_synchronized;
   }

   public hs_3 id_case(rhN_2 var1) {
      UUID var2 = var1.ro();
      hs_3 var3 = this.id_int.get(var2);
      if (var3 == null) {
         File var4 = this.id_private.id_class(rrGr_1.id_class).toFile();
         File var5 = new File(var4, var2 + ".json");
         var3 = new hs_3(this.id_private.T(), this, this.id_private.t(), var5, var1);
         this.id_int.put(var2, var3);
      }

      var3.id_class(var1);
      return var3;
   }

   public String[] id_case() {
      String[] var1 = new String[this.id_implements.size()];

      for (int var2 = 0; var2 < this.id_implements.size(); var2++) {
         var1[var2] = this.id_implements.get(var2).sv().getName();
      }

      return var1;
   }

   public void id_continue() {
      for (int var1 = 0; var1 < this.id_implements.size(); var1++) {
         this.id_implements.get(var1).id_class.id_class(new rgn_3("multiplayer.disconnect.server_shutdown"));
      }
   }

   public boolean id_else() {
      return this.id_synchronized;
   }

   public void id_implements() {
      for (int var1 = 0; var1 < this.id_implements.size(); var1++) {
         this.id_class(this.id_implements.get(var1));
      }
   }

   public int id_new() {
      return this.id_this;
   }

   public int id_package() {
      return this.id_throws;
   }

   public List<rhN_2> id_super() {
      return this.id_implements;
   }

   public boolean id_protected(GameProfile var1) {
      return false;
   }

   public rcd_3 id_protected() {
      return null;
   }

   public void id_protected(rhN_2 var1) {
      GameProfile var2 = var1.sv();
      int var3 = this.id_private.id_class(var2);
      this.id_class(var1, var3);
   }

   public rnU_2 id_private() {
      return this.id_native;
   }

   public int id_final() {
      return this.id_implements.size();
   }

   public String[] id_volatile() {
      return this.id_volatile.id_class();
   }

   public rna_3 id_native() {
      return this.id_volatile;
   }
}
