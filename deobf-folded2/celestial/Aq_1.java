package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aq_1 implements At_1 {
   private static final Logger id_break = LogManager.getLogger();
   public static final rgP_2 id_class = new rgn_3("disconnect.lost");
   private final rud_3 id_byte;
   private final GameProfile id_protected;
   private final vm_3 id_throws;
   private QY id_case;
   private gm_3 id_catch;
   private gv_3 id_private;
   private boolean id_implements;
   private final Map<UUID, Aw_1> id_finally = Maps.newHashMap();
   private final Ab_1 id_extends;
   private final AX id_native;
   private rlQ_2 id_volatile = rlQ_2.id_class;
   private final gG_2 id_final = new gG_2(this);
   private int id_package = 3;
   private final Random id_int = new Random();
   private CommandDispatcher<gR_2> id_new = new CommandDispatcher();
   private final rWB id_continue = new rWB();
   private final UUID id_super = UUID.randomUUID();
   private Set<rqM_2<rYB>> id_this;
   private rVm_1 id_else = rVm_1.id_break();

   public void id_byte() {
      this.id_catch = null;
   }

   public Aq_1(QY var1, vm_3 var2, rud_3 var3, GameProfile var4) {
      this.id_case = var1;
      this.id_throws = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_extends = new Ab_1(var1);
      this.id_native = new AX(this, var1);
   }

   @Override
   public void id_class(rvv_3 var1) {
      this.id_class(new rZr_1(var1.id_break()));
   }

   @Override
   public void id_class(rvf_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      cb_3 var2 = (cb_3)this.id_case.id_class[57];
      ((rhx_3)var2.id_implements[18]).id_break = var1.id_byte();
      ((rhx_3)var2.id_implements[18]).id_protected = var1.id_throws();
      ((rhx_3)var2.id_implements[18]).id_class = var1.id_break();
      ((rhx_3)var2.id_implements[18]).id_byte = var1.id_protected();
      ((rhx_3)var2.id_implements[18]).id_class(var1.id_case());
      ((rhx_3)var2.id_implements[18]).id_break(var1.id_catch());
   }

   @Override
   public void id_class(rvt_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((gm_3)this.id_case.id_class[56])
         .id_class(
            (cb_3)this.id_case.id_class[57],
            var1.id_protected(),
            var1.id_throws(),
            var1.id_case(),
            var1.id_break(),
            var1.id_byte(),
            var1.id_catch(),
            var1.id_private()
         );
   }

   @Override
   public void id_class(rFX var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_protected());
      if (var2 != null) {
         ((gm_3)this.id_case.id_class[56]).id_class((cb_3)this.id_case.id_class[57], var2, var1.id_break(), var1.id_byte(), var1.id_throws(), var1.id_case());
      }
   }

   @Override
   public void id_class(rvg_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      Aw_1 var2 = null;

      for (rvo_3 var4 : var1.id_break()) {
         if (var1.id_byte() == rvY_2.REMOVE_PLAYER) {
            this.id_case.id_volatile().id_case(var4.id_class().getId());
            var2 = this.id_finally.remove(var4.id_class().getId());
         } else {
            var2 = this.id_finally.get(var4.id_class().getId());
            if (var1.id_byte() == rvY_2.ADD_PLAYER) {
               var2 = new Aw_1(var4);
               this.id_finally.put(var2.id_class().getId(), var2);
               this.id_case.id_volatile().id_class(var2);
            }

            if (var2 != null) {
               switch (var1.id_byte()) {
                  case ADD_PLAYER:
                     var2.id_class(var4.id_byte());
                     var2.id_class(var4.id_break());
                     var2.id_class(var4.id_protected());
                     break;
                  case UPDATE_GAME_MODE:
                     var2.id_class(var4.id_byte());
                     break;
                  case UPDATE_LATENCY:
                     var2.id_class(var4.id_break());
                     break;
                  case UPDATE_DISPLAY_NAME:
                     var2.id_class(var4.id_protected());
               }
            }
         }
      }

      if (var2 != null) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLN.id_class(var2, var1.id_byte()));
      }
   }

   @Override
   public void id_class(rFr_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = var1.id_class(this.id_catch);
      if (var2 instanceof iB_2) {
         ((iB_2)var2).id_class(var1.id_break());
      }
   }

   @Override
   public void id_class(rvV_2 var1) {
      ((cq_3)this.id_case.id_class[19]).id_implements().id_break(var1.id_break().getString().isEmpty() ? null : var1.id_break());
      ((cq_3)this.id_case.id_class[19]).id_implements().id_class(var1.id_byte().getString().isEmpty() ? null : var1.id_byte());
   }

   public void id_class(rZN var1) {
      this.id_byte.id_class(new rZQ(var1));
   }

   @Override
   public void id_class(rFv_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((cq_3)this.id_case.id_class[19]).id_extends().id_class(var1);
   }

   @Override
   public void id_class(rvs_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLn_1.id_class(var1)).id_byte()) {
         if (var1.id_byte() == 0) {
            ((cb_3)this.id_case.id_class[57]).sK().id_break(var1.id_break());
         } else {
            ((cb_3)this.id_case.id_class[57]).sK().id_class(var1.id_break(), var1.id_byte());
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLA.id_class(var1));
      }
   }

   @Override
   public void id_class(rvn_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = ((cb_3)this.id_case.id_class[57]).PO();
      if (var2 != (cb_3)this.id_case.id_class[57] && var2.Po()) {
         var2.id_break(var1.id_break(), var1.id_byte(), var1.id_protected(), var1.id_throws(), var1.id_case());
         this.id_byte.id_class(new rZS(var2));
      }
   }

   private void id_class(CompletableFuture<?> var1) {
      var1.thenRun(() -> this.id_class(rZN.SUCCESSFULLY_LOADED)).exceptionally(var1x -> {
         this.id_class(rZN.FAILED_DOWNLOAD);
         return null;
      });
   }

   @Override
   public void id_class(rFs_1 var1) {
      String var2 = var1.id_break();
      String var3 = var1.id_byte();
      if (this.id_break(var2)) {
         if (var2.startsWith("level://")) {
            String var4 = URLDecoder.decode(var2.substring("level://".length()), StandardCharsets.UTF_8);
            File var5 = new File((File)this.id_case.id_class[24], "saves");
            File var6 = new File(var5, var4);
            if (var6.isFile()) {
               this.id_class(rZN.ACCEPTED);
               CompletableFuture var7 = this.id_case.Z().id_class(var6, rAZ.id_byte);
               this.id_class(var7);
               return;
            }

            this.id_class(rZN.FAILED_DOWNLOAD);
         } else {
            Ak_1 var8 = this.id_case.S();
            if (var8 != null && var8.id_break() == Az_1.ENABLED) {
               this.id_class(rZN.ACCEPTED);
               this.id_class(this.id_case.Z().id_class(var2, var3));
            } else if (var8 != null && var8.id_break() != Az_1.PROMPT) {
               this.id_class(rZN.DECLINED);
            } else {
               this.id_case.execute(() -> this.id_case.id_break(new mT_2(var3x -> {
                     this.id_case = QY.id_instanceof();
                     Ak_1 var4x = this.id_case.S();
                     if (var3x) {
                        if (var4x != null) {
                           var4x.id_class(Az_1.ENABLED);
                        }

                        this.id_class(rZN.ACCEPTED);
                        this.id_class(this.id_case.Z().id_class(var2, var3));
                     } else {
                        if (var4x != null) {
                           var4x.id_class(Az_1.DISABLED);
                        }

                        this.id_class(rZN.DECLINED);
                     }

                     AQ.id_byte(var4x);
                     this.id_case.id_break(null);
                  }, new rgn_3("multiplayer.texturePrompt.line1"), new rgn_3("multiplayer.texturePrompt.line2"))));
            }
         }
      }
   }

   @Override
   public void id_class(rvI_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_case
         .c()
         .id_class(
            new Np_1(
               var1.id_break(),
               var1.id_byte(),
               var1.id_catch(),
               var1.id_private(),
               false,
               0,
               NN.LINEAR,
               var1.id_protected(),
               var1.id_throws(),
               var1.id_case(),
               false
            )
         );
   }

   @Override
   public void id_class(rvK_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rjU_2 var2 = var1.id_class(this.id_catch);
      if (var2 != null) {
         ((cb_3)this.id_case.id_class[57]).id_class(var1.id_break(), var2);
      }
   }

   @Override
   public void id_class(rve_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      if (!this.id_final.id_class(var1.id_break(), var1.id_byte())) {
         id_break.debug("Got unhandled response to tag query {}", var1.id_break());
      }
   }

   @Override
   public void id_class(rFW var1) {
      ruZ_2.id_class(var1, this, this.id_case);

      for (Entry var3 : var1.id_break().entrySet()) {
         rCi_1 var4 = (rCi_1)var3.getKey();
         int var5 = (Integer)var3.getValue();
         ((cb_3)this.id_case.id_class[57]).id_abstract().id_class((cb_3)this.id_case.id_class[57], var4, var5);
      }

      if ((vm_3)this.id_case.id_class[73] instanceof cy_3) {
         ((cy_3)((vm_3)this.id_case.id_class[73])).id_break();
      }
   }

   @Override
   public void id_class(rvT_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_byte());
      if (var2 instanceof iB_2) {
         rLR var3 = rLR.id_class(var1.id_protected());
         if (var3 != null) {
            rLY var4 = new rLY(var3, var1.id_case(), var1.id_throws(), var1.id_private(), var1.id_catch(), var1.id_implements());
            var4.id_class(var1.id_break());
            ((iB_2)var2).id_byte(var4);
         }
      }
   }

   @Override
   public void id_class(rFl_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_continue.id_class(var1.id_break());
      Vo_1 var2 = this.id_case.id_class(gJ_2.id_byte);
      var2.id_class();
      VR var3 = ((cb_3)this.id_case.id_class[57]).Z();
      var3.id_class(this.id_continue.id_break());
      var3.id_class().forEach(var2::id_class);
      var2.id_break();
   }

   @Override
   public void id_class(rFQ var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_native.id_class(var1.id_break(), var1.id_byte());
   }

   @Override
   public void id_class(rFz_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_case.c().id_class(var1.id_break(), var1.id_byte());
   }

   @Override
   public void id_class(rFu_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rFm_1 var2 = var1.id_break();
      rgP_2 var3 = null;
      rgP_2 var4 = null;
      rgP_2 var5 = var1.id_byte() != null ? var1.id_byte() : rgN_2.id_byte;
      switch (var2) {
         case TITLE:
            var3 = var5;
            break;
         case SUBTITLE:
            var4 = var5;
            break;
         case ACTIONBAR:
            if (!var5.getString().isEmpty()) {
               ((cq_3)this.id_case.id_class[19]).id_class(var5, false, false);
            }

            return;
         case RESET:
            ((cq_3)this.id_case.id_class[19]).id_class(null, null, -1, -1, -1);
            ((cq_3)this.id_case.id_class[19]).id_class();
            return;
      }

      ((cq_3)this.id_case.id_class[19]).id_class(var3, var4, var1.id_protected(), var1.id_throws(), var1.id_case());
   }

   @Override
   public void id_class(rFw_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      var1.id_class(this.id_catch.id_instanceof());
   }

   @Override
   public void id_class(rZg_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = var1.id_class(this.id_catch);
      if (var2 != null) {
         this.id_case.id_break(var2);
      }
   }

   @Override
   public void id_class(rFE var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_private.id_class(var1.id_byte());
      this.id_private.id_break(var1.id_break());
   }

   @Override
   public void id_class(rZa_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      if (var1.id_class == rvr_3.ENTITY_DIED) {
         an_3 var2 = this.id_catch.id_break(var1.id_break);
         if (var2 == (cb_3)this.id_case.id_class[57]) {
            if (((cb_3)this.id_case.id_class[57]).d()) {
               ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class();
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAG.id_class(var2.Ps()));
               this.id_case.id_break(new ZS(var1.id_throws, this.id_catch.id_synchronized().id_implements()));
            } else {
               ((cb_3)this.id_case.id_class[57]).J();
            }
         }
      }
   }

   @Override
   public void id_class(rFN var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rlQ_2 var2 = var1.id_break();
      Multimap var3 = rlA_2.id_break(var2);
      if (false) {
         id_break.warn("Incomplete server tags, disconnecting. Missing: {}", var3);
         this.id_byte.id_class(new rgn_3("multiplayer.disconnect.missing_tags"));
      } else {
         this.id_volatile = var2;
         if (!this.id_byte.id_protected()) {
            var2.id_throws();
         }

         this.id_case.id_class(gJ_2.id_break).id_break();
      }
   }

   public Aw_1 id_class(UUID var1) {
      return this.id_finally.get(var1);
   }

   public Aw_1 id_class(String var1) {
      for (Aw_1 var3 : this.id_finally.values()) {
         if (var3.id_class().getName().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public rud_3 id_class() {
      return this.id_byte;
   }

   private void id_class(int var1, int var2, rrse_3 var3, rRo_1 var4, int var5, int var6, Iterator<byte[]> var7, boolean var8) {
      for (int var9 = 0; var9 < 18; var9++) {
         int var10 = -1 + var9;
         boolean var11 = (var5 & 1 << var9) != 0;
         boolean var12 = (var6 & 1 << var9) != 0;
         if (var11 || var12) {
            var3.id_class(var4, rjh_3.id_class(var1, var10, var2), var11 ? new roH_2((byte[])((byte[])var7.next()).clone()) : new roH_2(), var8);
            this.id_catch.id_break(var1, var10, var2);
         }
      }
   }

   @Override
   public void id_class(rvj_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((Ax_1)this.id_case.id_class[55]).id_class(this.id_catch, var1.id_byte(), var1.id_break(), var1.id_throws(), var1.id_protected());
   }

   @Override
   public void id_class(rva_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      VR var2 = ((cb_3)this.id_case.id_class[57]).Z();
      var2.id_class(var1.id_protected());
      rvi_3 var3 = var1.id_throws();
      switch (var3) {
         case REMOVE:
            for (rqO_2 var11 : var1.id_break()) {
               this.id_continue.id_class(var11).ifPresent(var2::id_byte);
            }
            break;
         case INIT:
            for (rqO_2 var9 : var1.id_break()) {
               this.id_continue.id_class(var9).ifPresent(var2::id_class);
            }

            for (rqO_2 var10 : var1.id_byte()) {
               this.id_continue.id_class(var10).ifPresent(var2::id_case);
            }
            break;
         case ADD:
            for (rqO_2 var5 : var1.id_break()) {
               this.id_continue.id_class(var5).ifPresent(var1x -> {
                  var2.id_class((rkw_3<?>)var1x);
                  var2.id_case((rkw_3<?>)var1x);
               });
            }
      }

      var2.id_class().forEach(var1x -> var1x.id_class(var2));
      if ((vm_3)this.id_case.id_class[73] instanceof mB_2) {
         ((mB_2)((vm_3)this.id_case.id_class[73])).id_class();
      }
   }

   @Override
   public void id_class(rFH var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rns_3 var2 = this.id_catch.id_package();
      String var3 = var1.id_byte();
      switch (var1.id_throws()) {
         case CHANGE:
            rnP_2 var4 = var2.id_break(var3);
            rAa_1 var5 = var2.id_break(var1.id_break(), var4);
            var5.id_break(var1.id_protected());
            break;
         case REMOVE:
            var2.id_byte(var1.id_break(), var2.id_byte(var3));
      }
   }

   @Override
   public void id_class(rvM_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rns_3 var2 = this.id_catch.id_package();
      String var3 = var1.id_byte();
      rnP_2 var4 = var3 == null ? null : var2.id_break(var3);
      var2.id_class(var1.id_break(), var4);
   }

   @Override
   public void id_class(rFc_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rns_3 var2 = this.id_catch.id_package();
      rnB_2 var3;
      if (var1.id_throws() == 0) {
         var3 = var2.id_case(var1.id_break());
      } else {
         var3 = var2.id_throws(var1.id_break());
      }

      if (var1.id_throws() == 0 || var1.id_throws() == 2) {
         var3.id_class(var1.id_byte());
         var3.id_class(var1.id_catch());
         var3.id_class(var1.id_case());
         rnX_2 var4 = rnX_2.id_class(var1.id_private());
         if (var4 != null) {
            var3.id_class(var4);
         }

         rnh_3 var5 = rnh_3.id_class(var1.id_implements());
         if (var5 != null) {
            var3.id_class(var5);
         }

         var3.id_break(var1.id_finally());
         var3.id_byte(var1.id_extends());
      }

      if (var1.id_throws() == 0 || var1.id_throws() == 3) {
         for (String var8 : var1.id_protected()) {
            var2.id_class(var8, var3);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .id_finally()
               .id_class(rrLL.id_class(new Aw_1(new GameProfile(UUID.randomUUID(), var8)), var1.id_finally()));
         }
      }

      if (var1.id_throws() == 4) {
         for (String var9 : var1.id_protected()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .id_finally()
               .id_class(rrLL.id_class(new Aw_1(new GameProfile(UUID.randomUUID(), var9)), var1.id_finally()));
            var2.id_break(var9, var3);
         }
      }

      if (var1.id_throws() == 1) {
         var2.id_class(var3);
      }
   }

   @Override
   public void id_class(rFd_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      double var2 = var1.id_byte();
      double var4 = var1.id_protected();
      double var6 = var1.id_throws();
      if (!Double.isInfinite(var2) && !Double.isInfinite(var4) && !Double.isInfinite(var6)) {
         if (var1.id_finally() == 0) {
            double var8 = (double)(var1.id_implements() * var1.id_case());
            double var10 = (double)(var1.id_implements() * var1.id_catch());
            double var12 = (double)(var1.id_implements() * var1.id_private());

            try {
               this.id_catch.id_class(var1.id_extends(), var1.id_break(), var2, var4, var6, var8, var10, var12);
            } catch (Throwable var23) {
               id_break.warn("Could not spawn particle effect {}", var1.id_extends());
            }
         } else {
            for (int var24 = 0; var24 < var1.id_finally(); var24++) {
               double var9 = this.id_int.nextGaussian() * (double)var1.id_case();
               double var11 = this.id_int.nextGaussian() * (double)var1.id_catch();
               double var13 = this.id_int.nextGaussian() * (double)var1.id_private();
               double var15 = this.id_int.nextGaussian() * (double)var1.id_implements();
               double var17 = this.id_int.nextGaussian() * (double)var1.id_implements();
               double var19 = this.id_int.nextGaussian() * (double)var1.id_implements();

               try {
                  this.id_catch.id_class(var1.id_extends(), var1.id_break(), var2 + var9, var4 + var11, var6 + var13, var15, var17, var19);
               } catch (Throwable var22) {
                  id_break.warn("Could not spawn particle effect {}", var1.id_extends());
                  return;
               }
            }
         }
      } else {
         rrfZ_2.id_class();
      }
   }

   @Override
   public void id_class(rFB var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rns_3 var2 = this.id_catch.id_package();
      String var3 = var1.id_break();
      if (var1.id_protected() == 0) {
         var2.id_class(var3, rAi_1.id_break, var1.id_byte(), var1.id_throws());
      } else if (var2.id_class(var3)) {
         rnP_2 var4 = var2.id_byte(var3);
         if (var1.id_protected() == 1) {
            var2.id_byte(var4);
         } else if (var1.id_protected() == 2) {
            var4.id_class(var1.id_throws());
            var4.id_class(var1.id_byte());
         }
      }
   }

   @Override
   public void id_class(rvE_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rqO_2 var2 = var1.id_break();
      ruu_3 var3 = null;

      try {
         var3 = var1.id_byte();
         if (rvE_2.id_class.equals(var2)) {
            ((cb_3)this.id_case.id_class[57]).id_byte(var3.id_throws(32767));
         } else if (rvE_2.id_break.equals(var2)) {
            int var4 = var3.readInt();
            float var5 = var3.readFloat();
            rLC var6 = rLC.id_class(var3);
            ((yK_2)this.id_case.id_class[17]).id_class.id_class(var4, var6, var5);
         } else if (rvE_2.id_byte.equals(var2)) {
            long var34 = var3.id_catch();
            rfH_2 var58 = var3.id_byte();
            ((pS_2)((yK_2)this.id_case.id_class[17]).id_case).id_class(var34, var58);
         } else if (rvE_2.id_protected.equals(var2)) {
            rfH_2 var35 = var3.id_byte();
            int var48 = var3.readInt();
            ArrayList var59 = Lists.newArrayList();
            ArrayList var7 = Lists.newArrayList();

            for (int var8 = 0; var8 < var48; var8++) {
               var59.add(var3.id_byte());
               var7.add(var3.readFloat());
            }

            ((yK_2)this.id_case.id_class[17]).id_catch.id_class(var35, var59, var7);
         } else if (rvE_2.id_throws.equals(var2)) {
            rRJ var36 = this.id_else.id_class().id_class(var3.id_volatile());
            rfi_3 var49 = new rfi_3(var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt());
            int var60 = var3.readInt();
            ArrayList var69 = Lists.newArrayList();
            ArrayList var74 = Lists.newArrayList();

            for (int var9 = 0; var9 < var60; var9++) {
               var69.add(new rfi_3(var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt()));
               var74.add(var3.readBoolean());
            }

            ((yK_2)this.id_case.id_class[17]).id_private.id_class(var49, var69, var74, var36);
         } else if (rvE_2.id_case.equals(var2)) {
            ((px_3)((yK_2)this.id_case.id_class[17]).id_finally)
               .id_class(var3.id_byte(), var3.readFloat(), var3.readFloat(), var3.readFloat(), var3.readFloat(), var3.readFloat());
         } else if (rvE_2.id_finally.equals(var2)) {
            int var37 = var3.readInt();

            for (int var50 = 0; var50 < var37; var50++) {
               ((yK_2)this.id_case.id_class[17]).id_final.id_class(var3.id_protected());
            }

            int var51 = var3.readInt();

            for (int var61 = 0; var61 < var51; var61++) {
               ((yK_2)this.id_case.id_class[17]).id_final.id_break(var3.id_protected());
            }
         } else if (rvE_2.id_private.equals(var2)) {
            rfH_2 var38 = var3.id_byte();
            String var52 = var3.id_native();
            int var62 = var3.readInt();
            pb_3 var70 = new pb_3(var38, var52, var62);
            ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(var70);
         } else if (rvE_2.id_implements.equals(var2)) {
            rfH_2 var39 = var3.id_byte();
            ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(var39);
         } else if (rvE_2.id_catch.equals(var2)) {
            rfH_2 var40 = var3.id_byte();
            int var53 = var3.readInt();
            ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(var40, var53);
         } else if (rvE_2.id_extends.equals(var2)) {
            rfH_2 var41 = var3.id_byte();
            int var54 = var3.readInt();
            int var63 = var3.readInt();
            ArrayList var71 = Lists.newArrayList();

            for (int var75 = 0; var75 < var63; var75++) {
               int var79 = var3.readInt();
               boolean var10 = var3.readBoolean();
               String var11 = var3.id_throws(255);
               var71.add(new ye_3(var41, var79, var11, var10));
            }

            ((yK_2)this.id_case.id_class[17]).id_new.id_class(var54, var71);
         } else if (rvE_2.id_new.equals(var2)) {
            int var42 = var3.readInt();
            ArrayList var55 = Lists.newArrayList();

            for (int var64 = 0; var64 < var42; var64++) {
               var55.add(var3.id_byte());
            }

            ((yK_2)this.id_case.id_class[17]).id_int.id_class(var55);
         } else if (rvE_2.id_native.equals(var2)) {
            double var43 = var3.readDouble();
            double var65 = var3.readDouble();
            double var76 = var3.readDouble();
            ex_3 var81 = new ex_3(var43, var65, var76);
            UUID var83 = var3.id_private();
            int var12 = var3.readInt();
            String var13 = var3.id_native();
            String var14 = var3.id_native();
            int var15 = var3.readInt();
            float var16 = var3.readFloat();
            float var17 = var3.readFloat();
            String var18 = var3.id_native();
            boolean var19 = var3.readBoolean();
            rLC var20;
            if (var19) {
               var20 = rLC.id_class(var3);
            } else {
               var20 = null;
            }

            boolean var21 = var3.readBoolean();
            pG_2 var22 = new pG_2(var83, var12, var13, var14, var15, var16, var17, var81, var18, var20, var21);
            int var23 = var3.readInt();

            for (int var24 = 0; var24 < var23; var24++) {
               String var25 = var3.id_native();
               var22.id_native.add(var25);
            }

            int var99 = var3.readInt();

            for (int var101 = 0; var101 < var99; var101++) {
               String var26 = var3.id_native();
               var22.id_volatile.add(var26);
            }

            int var102 = var3.readInt();

            for (int var103 = 0; var103 < var102; var103++) {
               String var27 = var3.id_native();
               var22.id_final.add(var27);
            }

            int var104 = var3.readInt();

            for (int var105 = 0; var105 < var104; var105++) {
               rfH_2 var28 = var3.id_byte();
               var22.id_int.add(var28);
            }

            int var106 = var3.readInt();

            for (int var107 = 0; var107 < var106; var107++) {
               rfH_2 var29 = var3.id_byte();
               var22.id_new.add(var29);
            }

            int var108 = var3.readInt();

            for (int var109 = 0; var109 < var108; var109++) {
               String var30 = var3.id_native();
               var22.id_package.add(var30);
            }

            ((yK_2)this.id_case.id_class[17]).id_volatile.id_class(var22);
         } else if (rvE_2.id_volatile.equals(var2)) {
            double var44 = var3.readDouble();
            double var66 = var3.readDouble();
            double var77 = var3.readDouble();
            ex_3 var82 = new ex_3(var44, var66, var77);
            UUID var84 = var3.id_private();
            int var85 = var3.readInt();
            boolean var86 = var3.readBoolean();
            rfH_2 var87 = null;
            if (var86) {
               var87 = var3.id_byte();
            }

            boolean var88 = var3.readBoolean();
            rfH_2 var89 = null;
            if (var88) {
               var89 = var3.id_byte();
            }

            int var90 = var3.readInt();
            boolean var91 = var3.readBoolean();
            rLC var92 = null;
            if (var91) {
               var92 = rLC.id_class(var3);
            }

            yf_3 var93 = new yf_3(var84, var85, var82, var92, var87, var89, var90);
            int var94 = var3.readInt();

            for (int var95 = 0; var95 < var94; var95++) {
               String var97 = var3.id_native();
               var93.id_private.add(var97);
            }

            int var96 = var3.readInt();

            for (int var98 = 0; var98 < var96; var98++) {
               rfH_2 var100 = var3.id_byte();
               var93.id_implements.add(var100);
            }

            ((yK_2)this.id_case.id_class[17]).id_package.id_class(var93);
         } else if (rvE_2.id_final.equals(var2)) {
            rfH_2 var45 = var3.id_byte();
            String var56 = var3.id_native();
            int var67 = var3.readInt();
            int var72 = var3.readInt();
            boolean var78 = var3.readBoolean();
            yj_3 var80 = new yj_3(var45, var56, var67, var72, var78, this.id_catch.r());
            ((yK_2)this.id_case.id_class[17]).id_package.id_class(var80);
         } else if (rvE_2.id_int.equals(var2)) {
            ((yK_2)this.id_case.id_class[17]).id_continue.id_class();
         } else if (rvE_2.id_package.equals(var2)) {
            rfH_2 var46 = var3.id_byte();
            int var57 = var3.readInt();
            String var68 = var3.id_native();
            int var73 = var3.readInt();
            ((yK_2)this.id_case.id_class[17]).id_continue.id_class(var46, var57, var68, var73);
         } else if (var2.id_break().equals("custom_ping_packet") && rrjA_2.id_protected().id_throws().id_byte(ProtocolVersion.v1_17_1)) {
            ruu_3 var47 = new ruu_3(Unpooled.buffer());
            var47.writeInt(var1.id_byte().readInt());
            this.id_byte.id_class(new rmY_2(var2, var47));
         } else {
            id_break.warn("Unknown custom packed identifier: {}", var2);
         }
      } finally {
         if (var3 != null) {
            var3.release();
         }
      }
   }

   @Override
   public void id_class(rvl_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rdn_3 var2 = ((cb_3)this.id_case.id_class[57]).id_protected(var1.id_break());
      if (var2.id_break() == rdy_3.dr) {
         this.id_case.id_break(new vz_3(new vu_3(var2)));
      }
   }

   @Override
   public void id_class(rFA var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_catch.id_native().id_break(var1.id_break(), var1.id_byte());
   }

   @Override
   public void id_class(rFq_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_package = var1.id_break();
      this.id_catch.id_native().id_class(var1.id_break());
   }

   @Override
   public void id_class(rvL_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rJr_1 var2 = (rJr_1)((cb_3)this.id_case.id_class[57]).id_implements[4];
      if (var1.id_break() == var2.id_case && var2 instanceof rJp_1) {
         ((rJp_1)var2).id_class(new rdf_3(var1.id_byte().id_class()));
         ((rJp_1)var2).id_throws(var1.id_throws());
         ((rJp_1)var2).id_case(var1.id_protected());
         ((rJp_1)var2).id_class(var1.id_case());
         ((rJp_1)var2).id_break(var1.id_catch());
      }
   }

   @Override
   public void id_class(rFC var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      int var2 = var1.id_break();
      int var3 = var1.id_byte();
      rrse_3 var4 = this.id_catch.id_native().id_class();
      int var5 = var1.id_protected();
      int var6 = var1.id_throws();
      Iterator var7 = var1.id_case().iterator();
      this.id_class(var2, var3, var4, rRo_1.SKY, var5, var6, var7, var1.id_finally());
      int var8 = var1.id_catch();
      int var9 = var1.id_private();
      Iterator var10 = var1.id_implements().iterator();
      this.id_class(var2, var3, var4, rRo_1.BLOCK, var8, var9, var10, var1.id_finally());
   }

   @Override
   public void id_class(rvq_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rJr_1 var2 = (rJr_1)((cb_3)this.id_case.id_class[57]).id_implements[4];
      if (var2.id_case == var1.id_byte() && var2.id_byte((cb_3)this.id_case.id_class[57])) {
         this.id_continue.id_class(var1.id_break()).ifPresent(var2x -> {
            if ((vm_3)this.id_case.id_class[73] instanceof mB_2) {
               ms_3 var3 = ((mB_2)((vm_3)this.id_case.id_class[73])).id_break();
               var3.id_class((rkw_3<?>)var2x, var2.id_throws);
            }
         });
      }
   }

   @Override
   public void id_class(rvW_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_break());
      if (var2 != null) {
         if (!(var2 instanceof iB_2)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var2 + ")");
         }

         ik_3 var3 = ((iB_2)var2).BT();

         for (rvz_3 var5 : var1.id_byte()) {
            ic_3 var6 = var3.id_class(var5.id_class());
            if (var6 == null) {
               id_break.warn("Entity {} does not have attribute {}", var2, rVL.O.id_break(var5.id_class()));
            } else {
               var6.id_class(var5.id_break());
               var6.id_throws();

               for (ix_3 var8 : var5.id_byte()) {
                  var6.id_break(var8);
               }
            }
         }
      }
   }

   @Override
   public void id_class(rvb_3 var1) {
      this.id_byte.id_class(var1.id_break());
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
      this.id_case.id_transient();
      if (this.id_throws != null) {
         this.id_case.id_break(new ZG(this.id_throws, var1, var2));
      } else {
         this.id_case.id_break(new ZG(new vG_2(new rrvL()), var1, var2));
      }
   }

   public void id_class(ruS_2<?> var1) {
      this.id_byte.id_class(var1);
   }

   @Override
   public void id_class(rvZ_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      QY var10000 = this.id_case;
      Ax_1 var13 = new Ax_1(this.id_case, this);
      var10000.id_class[55] = var13;
      if (!this.id_byte.id_protected()) {
         rlA_2.id_class();
      }

      ArrayList var2 = Lists.newArrayList(var1.id_catch());
      Collections.shuffle(var2);
      this.id_this = Sets.newLinkedHashSet(var2);
      this.id_else = var1.id_private();
      rqM_2 var3 = var1.id_finally();
      rRJ var4 = var1.id_implements();
      this.id_package = var1.id_extends();
      boolean var5 = var1.id_final();
      boolean var6 = var1.id_package();
      gv_3 var7 = new gv_3(rRO.NORMAL, var1.id_protected(), var6);
      this.id_private = var7;
      this.id_catch = new gm_3(this, var7, var3, var4, this.id_package, (yX_2)this.id_case.id_class[8], var5, var1.id_byte());
      this.id_case.id_class(this.id_catch);
      if ((cb_3)this.id_case.id_class[57] == null) {
         var10000 = this.id_case;
         cb_3 var14 = ((Ax_1)this.id_case.id_class[55]).id_class(this.id_catch, new rlP_2(), new VR());
         var10000.id_class[57] = var14;
         cb_3 var19 = (cb_3)this.id_case.id_class[57];
         Float var15 = -180.0F;
         var19.id_throws[15] = var15;
         if (this.id_case.id_this() != null) {
            this.id_case.id_this().id_class(((cb_3)this.id_case.id_class[57]).ro());
         }
      }

      ((yK_2)this.id_case.id_class[17]).id_class();
      ((cb_3)this.id_case.id_class[57]).Bc();
      int var8 = var1.id_break();
      this.id_catch.id_class(var8, (cG_2)((cb_3)this.id_case.id_class[57]));
      cb_3 var20 = (cb_3)this.id_case.id_class[57];
      rqP_2 var16 = new rqP_2((Qw_1)this.id_case.id_class[20]);
      var20.id_break[17] = var16;
      ((Ax_1)this.id_case.id_class[55]).id_class((cb_3)this.id_case.id_class[57]);
      cb_3 var17 = (cb_3)this.id_case.id_class[57];
      this.id_case.id_class[62] = var17;
      this.id_case.id_break(new Zb_1());
      ((cb_3)this.id_case.id_class[57]).id_implements(var8);
      ((cb_3)this.id_case.id_class[57]).id_synchronized(var1.id_native());
      ((cb_3)this.id_case.id_class[57]).id_throws(var1.id_volatile());
      ((Ax_1)this.id_case.id_class[55]).id_break(var1.id_throws());
      ((Ax_1)this.id_case.id_class[55]).id_class(var1.id_case());
      ((Qw_1)this.id_case.id_class[20]).id_byte();
      this.id_byte.id_class(new rmY_2(rmY_2.id_class, new ruu_3(Unpooled.buffer()).id_class(Qn_1.id_class())));
      this.id_case.id_short().id_break();
   }

   @Override
   public void id_class(rZR var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_catch.id_class(var1.id_byte(), var1.id_break());
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
   }

   @Override
   public void id_class(rFZ var1) {
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
      ruZ_2.id_class(var1, this, this.id_case);
      int var2 = var1.id_break();
      int var3 = var1.id_byte();
      AO var4 = this.id_catch.id_native();
      var4.id_class(var2, var3);
      rrse_3 var5 = var4.id_class();

      for (int var6 = 0; var6 < 16; var6++) {
         this.id_catch.id_break(var2, var6, var3);
         var5.id_class(rjh_3.id_class(var2, var6, var3), true);
      }

      var5.id_class(new rfj_3(var2, var3), false);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_break(var1);
   }

   @Override
   public void id_class(rZD var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      int var2 = var1.id_byte();
      int var3 = var1.id_protected();
      rYZ var4 = var1.id_implements() == null ? null : new rYZ(this.id_else.id_break(rVL.n), var1.id_implements());
      roJ_2 var5 = this.id_catch.id_native().id_class(var2, var3, var4, var1.id_break(), var1.id_catch(), var1.id_throws(), var1.id_case());
      if (var5 != null && var1.id_case()) {
         this.id_catch.id_break(var5);
      }

      for (int var6 = 0; var6 < 16; var6++) {
         this.id_catch.id_break(var2, var6, var3);
      }

      for (rcd_3 var7 : var1.id_private()) {
         rfH_2 var8 = new rfH_2(var7.id_private("x"), var7.id_private("y"), var7.id_private("z"));
         ryO_2 var9 = this.id_catch.id_class(var8);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnO_2.id_class(var9, var8));
         if (var9 != null) {
            var9.id_class(this.id_catch.id_byte(var8), var7);
         }
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
   }

   @Override
   public void id_class(rFh_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      double var2 = var1.id_throws();
      double var4 = var1.id_case();
      double var6 = var1.id_catch();
      float var8 = (float)(var1.id_extends() * 360) / 256.0F;
      float var9 = (float)(var1.id_native() * 360) / 256.0F;
      iB_2 var10 = (iB_2)aI_2.id_class(var1.id_protected(), (gm_3)this.id_case.id_class[56]);
      if (var10 != null) {
         var10.id_byte(var2, var4, var6);
         Float var17 = (float)(var1.id_volatile() * 360) / 256.0F;
         var10.id_private[23] = var17;
         Float var18 = (float)(var1.id_volatile() * 360) / 256.0F;
         var10.id_private[25] = var18;
         if (var10 instanceof rSu_1) {
            rSm_1[] var11 = ((rSu_1)var10).id_implements();

            for (int var12 = 0; var12 < var11.length; var12++) {
               var11[var12].id_implements(var12 + var1.id_break());
            }
         }

         var10.id_implements(var1.id_break());
         var10.a_(var1.id_byte());
         var10.id_break(var2, var4, var6, var8, var9);
         var10.id_catch(
            (double)((float)var1.id_private() / 8000.0F), (double)((float)var1.id_implements() / 8000.0F), (double)((float)var1.id_finally() / 8000.0F)
         );
         this.id_catch.id_class(var1.id_break(), var10);
         if (var10 instanceof rbF_2) {
            boolean var19 = ((rbF_2)var10).T_();
            Object var20;
            if (var19) {
               var20 = new NE((rbF_2)var10);
            } else {
               var20 = new NG((rbF_2)var10);
            }

            this.id_case.c().id_class((Nm_1)var20);
         }
      }
   }

   @Override
   public void id_class(rFp_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((gm_3)this.id_case.id_class[56]).id_class(var1.id_break());
      ((gm_3)this.id_case.id_class[56]).id_break(var1.id_byte());
   }

   @Override
   public void id_class(rFj_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((gm_3)this.id_case.id_class[56]).id_break(var1.id_break(), var1.id_byte());
   }

   @Override
   public void id_class(rFb_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_byte());
      if (var2 == null) {
         id_break.warn("Received passengers for unknown entity");
      } else {
         boolean var3 = var2.id_else((cb_3)this.id_case.id_class[57]);
         var2.Bn();

         for (int var7 : var1.id_break()) {
            an_3 var8 = this.id_catch.id_break(var7);
            if (var8 != null) {
               var8.id_class(var2, true);
               if (var8 == (cb_3)this.id_case.id_class[57] && !var3) {
                  ((cq_3)this.id_case.id_class[19]).id_class(new rgn_3("mount.onboard", ((Qw_1)this.id_case.id_class[20]).k.id_native()), false, false);
               }
            }
         }
      }
   }

   @Override
   public void id_class(rZj_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_break());
      if (var2 != null) {
         if (var1.id_byte() == 0) {
            iB_2 var3 = (iB_2)var2;
            var3.id_class(rpm_3.MAIN_HAND);
         } else if (var1.id_byte() == 3) {
            iB_2 var4 = (iB_2)var2;
            var4.id_class(rpm_3.OFF_HAND);
         } else if (var1.id_byte() == 1) {
            var2.rF();
         } else if (var1.id_byte() == 2) {
            rhd_3 var5 = (rhd_3)var2;
            var5.id_class(false, false);
         } else if (var1.id_byte() == 4) {
            ((Cy_1)this.id_case.id_class[12]).id_class(var2, rLQ.id_catch);
         } else if (var1.id_byte() == 5) {
            ((Cy_1)this.id_case.id_class[12]).id_class(var2, rLQ.id_continue);
         }
      }
   }

   @Override
   public void id_class(rZK var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((cq_3)this.id_case.id_class[19]).id_class(var1.id_protected(), var1.id_break(), var1.id_throws());
   }

   @Override
   public void id_class(rZe_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_break());
      Object var3 = (iB_2)this.id_catch.id_break(var1.id_byte());
      if (var3 == null) {
         var3 = (cb_3)this.id_case.id_class[57];
      }

      if (var2 != null) {
         if (var2 instanceof rsP_2) {
            this.id_catch
               .id_class(
                  var2.rx(), var2.re(), var2.BO(), rqn_3.SB, rqL_2.PLAYERS, 0.1F, (this.id_int.nextFloat() - this.id_int.nextFloat()) * 0.35F + 0.9F, false
               );
         } else {
            this.id_catch
               .id_class(
                  var2.rx(), var2.re(), var2.BO(), rqn_3.ER, rqL_2.PLAYERS, 0.2F, (this.id_int.nextFloat() - this.id_int.nextFloat()) * 1.4F + 2.0F, false
               );
         }

         ((Cy_1)this.id_case.id_class[12]).id_class(new CN(this.id_case.id_case(), this.id_case.id_interface(), this.id_catch, var2, (an_3)var3));
         if (var2 instanceof rsE_2 var4) {
            rdn_3 var5 = var4.id_protected();
            rrLf_1.id_class((iB_2)var3, var5.id_implements());
            var5.id_catch(var1.id_protected());
            if (var5.id_class()) {
               this.id_catch.id_class(var1.id_break());
            }
         } else {
            this.id_catch.id_class(var1.id_break());
         }
      }
   }

   @Override
   public void id_class(rvc_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_break());
      if (var2 != null) {
         var2.id_extends((double)var1.id_byte() / 8000.0, (double)var1.id_protected() / 8000.0, (double)var1.id_throws() / 8000.0);
      }
   }

   @Override
   public void id_class(rvX_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_byte());
      List var3 = var1.id_break();
      if (var2 != null && var3 != null) {
         var2.BQ().id_class(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLQ.id_class(var2, var3));
      }
   }

   @Override
   public void id_class(rFk_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      UUID var2 = var1.id_byte();
      if (var2 != null) {
         Aw_1 var3 = this.id_class(var2);
         if (var3 != null) {
            double var4 = var1.id_protected();
            double var6 = var1.id_throws();
            double var8 = var1.id_case();
            float var10 = (float)(var1.id_catch() * 360) / 256.0F;
            float var11 = (float)(var1.id_private() * 360) / 256.0F;
            int var12 = var1.id_break();
            cM_2 var13 = new cM_2((gm_3)this.id_case.id_class[56], var3.id_class());
            var13.id_implements(var12);
            var13.id_native(var4, var6, var8);
            var13.id_byte(var4, var6, var8);
            var13.id_break(var4, var6, var8, var10, var11);
            this.id_catch.id_class(var12, (cG_2)var13);
         }
      }
   }

   @Override
   public void id_class(rvN_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_break());
      if (var2 != null) {
         double var3 = var1.id_byte();
         double var5 = var1.id_protected();
         double var7 = var1.id_throws();
         var2.id_byte(var3, var5, var7);
         if (!var2.Po()) {
            float var9 = (float)(var1.id_case() * 360) / 256.0F;
            float var10 = (float)(var1.id_catch() * 360) / 256.0F;
            var2.id_class(var3, var5, var7, var9, var10, 3, true);
            var2.id_int(var1.id_private());
         }
      }
   }

   @Override
   public void id_class(rFx_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rsO_2 var2 = new rsO_2(this.id_catch, var1.id_protected(), var1.id_throws(), var1.id_case());
      var2.id_implements(var1.id_break());
      var2.a_(var1.id_byte());
      this.id_catch.id_class(var1.id_break(), var2);
   }

   @Override
   public void id_class(rFO var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      double var2 = var1.id_byte();
      double var4 = var1.id_protected();
      double var6 = var1.id_throws();
      rsP_2 var8 = new rsP_2(this.id_catch, var2, var4, var6, var1.id_case());
      var8.id_byte(var2, var4, var6);
      Float var13 = 0.0F;
      var8.id_throws[15] = var13;
      Float var14 = 0.0F;
      var8.id_throws[16] = var14;
      var8.id_implements(var1.id_break());
      this.id_catch.id_class(var1.id_break(), var8);
   }

   @Override
   public void id_class(rFJ var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      double var2 = var1.id_protected();
      double var4 = var1.id_throws();
      double var6 = var1.id_case();
      aI_2 var8 = var1.id_native();
      Object var9;
      if (var8 == aI_2.r) {
         var9 = new rsk_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.B) {
         var9 = new rsN_2(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.E) {
         var9 = new rsv_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.s) {
         var9 = new rsm_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.S) {
         var9 = new rsc_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.P) {
         var9 = new rsW_2(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_switch) {
         var9 = new rsu_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.rO) {
         an_3 var10 = this.id_catch.id_break(var1.id_volatile());
         if (var10 instanceof rhd_3) {
            var9 = new rhp_3(this.id_catch, (rhd_3)var10, var2, var4, var6);
         } else {
            var9 = null;
         }
      } else if (var8 == aI_2.id_byte) {
         var9 = new rhF_2(this.id_catch, var2, var4, var6);
         an_3 var17 = this.id_catch.id_break(var1.id_volatile());
         if (var17 != null) {
            ((rhm_3)var9).id_break(var17);
         }
      } else if (var8 == aI_2.p) {
         var9 = new rho_3(this.id_catch, var2, var4, var6);
         an_3 var18 = this.id_catch.id_break(var1.id_volatile());
         if (var18 != null) {
            ((rhm_3)var9).id_break(var18);
         }
      } else if (var8 == aI_2.g) {
         var9 = new rhD_2(this.id_catch, var2, var4, var6);
         an_3 var19 = this.id_catch.id_break(var1.id_volatile());
         if (var19 != null) {
            ((rhm_3)var9).id_break(var19);
         }
      } else if (var8 == aI_2.y) {
         var9 = new rhY_2(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_for) {
         var9 = new rhw_3(this.id_catch, var2, var4, var6, var1.id_catch(), var1.id_private(), var1.id_implements());
      } else if (var8 == aI_2.id_default) {
         var9 = new rsG_2(this.id_catch, new rfH_2(var2, var4, var6), rpr_3.id_class(var1.id_volatile()));
      } else if (var8 == aI_2.id_strictfp) {
         var9 = new rsM_2(this.id_catch, new rfH_2(var2, var4, var6));
      } else if (var8 == aI_2.f) {
         var9 = new rSi_1(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_while) {
         var9 = new rhl_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_instanceof) {
         var9 = new rhy_3(this.id_catch, var2, var4, var6, rdn_3.id_break);
      } else if (var8 == aI_2.id_const) {
         var9 = new rhH_2(this.id_catch, var2, var4, var6, var1.id_catch(), var1.id_private(), var1.id_implements());
      } else if (var8 == aI_2.id_int) {
         var9 = new rhA_2(this.id_catch, var2, var4, var6, var1.id_catch(), var1.id_private(), var1.id_implements());
      } else if (var8 == aI_2.l) {
         var9 = new rhR_2(this.id_catch, var2, var4, var6, var1.id_catch(), var1.id_private(), var1.id_implements());
      } else if (var8 == aI_2.rP) {
         var9 = new rhU_2(this.id_catch, var2, var4, var6, var1.id_catch(), var1.id_private(), var1.id_implements());
      } else if (var8 == aI_2.F) {
         var9 = new rhg_3(this.id_catch, var2, var4, var6, var1.id_catch(), var1.id_private(), var1.id_implements());
      } else if (var8 == aI_2.I) {
         var9 = new rhn_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_public) {
         var9 = new rhC_2(this.id_catch, var2, var4, var6, 0.0F, 0, null);
      } else if (var8 == aI_2.V) {
         var9 = new rhI_2(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.j) {
         var9 = new rsr_3(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_catch) {
         var9 = new rSK(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.Q) {
         var9 = new rsX_2(this.id_catch, var2, var4, var6, null);
      } else if (var8 == aI_2.id_break) {
         var9 = new rSY(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_super) {
         var9 = new rSa_1(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_short) {
         var9 = new rsE_2(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_try) {
         var9 = new rsB_2(this.id_catch, var2, var4, var6, xd_3.id_class(var1.id_volatile()));
      } else if (var8 == aI_2.id_class) {
         var9 = new aZ_2(this.id_catch, var2, var4, var6);
      } else if (var8 == aI_2.id_boolean) {
         var9 = new rSg_1(aI_2.id_boolean, this.id_catch);
      } else {
         var9 = null;
      }

      if (var9 != null) {
         int var20 = var1.id_break();
         ((an_3)var9).id_byte(var2, var4, var6);
         ((an_3)var9).id_private(var2, var4, var6);
         Float var15 = (float)(var1.id_finally() * 360) / 256.0F;
         ((an_3)var9).id_throws[16] = var15;
         Float var16 = (float)(var1.id_extends() * 360) / 256.0F;
         ((an_3)var9).id_throws[15] = var16;
         ((an_3)var9).id_implements(var20);
         ((an_3)var9).a_(var1.id_byte());
         this.id_catch.id_class(var20, (an_3)var9);
         if (var9 instanceof rsJ_2) {
            this.id_case.c().id_class((NQ)(new NF((rsJ_2)var9)));
         }
      }
   }

   @Override
   public void id_class(rvC_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      int var2 = 19 | (var1.id_break() ? 128 : 0);
      var1.id_class((var2x, var3) -> this.id_catch.id_class(var2x, var3, var2));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
   }

   @Override
   public void id_class(rvD_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      double var2 = var1.id_break();
      double var4 = var1.id_byte();
      double var6 = var1.id_protected();
      if (!Double.isInfinite(var2) && !Double.isInfinite(var4) && !Double.isInfinite(var6)) {
         cb_3 var8 = (cb_3)this.id_case.id_class[57];
         rjU_2 var9 = var8.rv();
         boolean var10 = var1.id_private().contains(rvU_2.X);
         boolean var11 = var1.id_private().contains(rvU_2.Y);
         boolean var12 = var1.id_private().contains(rvU_2.Z);
         rrAl_1 var17 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .id_finally()
            .id_class(rrAl_1.id_class(var2, var4, var6, var8.rx(), var8.re(), var8.BO(), var1.id_catch(), false, false));
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var17);
         var17.id_implements();
         if (!var17.id_byte()) {
            double var18 = var17.id_break();
            double var20 = var17.id_extends();
            double var22 = var17.id_catch();
            double var13;
            double var15;
            if (var10) {
               var13 = var9.id_class();
               var15 = var8.rx() + var18;
               Double var41 = (Double)var8.id_throws[34] + var18;
               var8.id_throws[34] = var41;
            } else {
               var13 = 0.0;
               var15 = var18;
               Double var42 = var18;
               var8.id_throws[34] = var42;
            }

            double var24;
            double var26;
            if (var11) {
               var24 = var9.id_break();
               var26 = var8.re() + var20;
               Double var43 = (Double)var8.id_throws[35] + var20;
               var8.id_throws[35] = var43;
            } else {
               var24 = 0.0;
               var26 = var20;
               Double var44 = var20;
               var8.id_throws[35] = var44;
            }

            double var28;
            double var30;
            if (var12) {
               var28 = var9.id_byte();
               var30 = var8.BO() + var22;
               Double var45 = (Double)var8.id_throws[36] + var22;
               var8.id_throws[36] = var45;
            } else {
               var28 = 0.0;
               var30 = var22;
               Double var46 = var22;
               var8.id_throws[36] = var46;
            }

            if ((Integer)var8.id_throws[41] > 0 && var8.ra() != null) {
               var8.id_const();
            }

            var8.id_volatile(var15, var26, var30);
            Double var47 = var15;
            var8.id_throws[8] = var47;
            Double var48 = var26;
            var8.id_throws[9] = var48;
            Double var49 = var30;
            var8.id_throws[10] = var49;
            var8.id_catch(var13, var24, var28);
            float var32 = var1.id_throws();
            float var33 = var1.id_case();
            if (var1.id_private().contains(rvU_2.X_ROT)) {
               var33 += var8.id_throws[16];
            }

            if (var1.id_private().contains(rvU_2.Y_ROT)) {
               var32 += var8.id_throws[15];
            }

            float var34 = var32;
            float var35 = var33;
            if (var17.id_case()) {
               var34 = (Float)var8.id_throws[15];
               var35 = (Float)var8.id_throws[16];
            }

            rrAH var36 = rrAH.id_class((Float)var8.id_throws[15], (Float)var8.id_throws[16], true);
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var36);
            if (!var17.id_native()) {
               var8.id_class(var15, var26, var30, var34, var35, var36.id_break());
            }

            this.id_byte.id_class(new rmV_2(var17.id_finally()));
            this.id_byte.id_class(new rZX(var8.rx(), var8.re(), var8.BO(), var36.id_class(), var36.id_byte(), false));
            if (!this.id_implements) {
               this.id_implements = true;
               this.id_case.id_break(null);
            }
         }
      } else {
         rrfZ_2.id_class();
      }
   }

   @Override
   public void id_class(rvG_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);

      for (int var2 = 0; var2 < var1.id_break().length; var2++) {
         int var3 = var1.id_break()[var2];
         this.id_catch.id_class(var3);
      }
   }

   @Override
   public void id_class(rvh_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = var1.id_class(this.id_catch);
      if (var2 != null) {
         float var3 = (float)(var1.id_break() * 360) / 256.0F;
         var2.id_class(var3, 3);
      }
   }

   @Override
   public void id_class(rvJ_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = var1.id_class(this.id_catch);
      if (var2 != null && !var2.Po()) {
         if (var1.id_throws()) {
            rjU_2 var3 = var1.id_class(var2.rm());
            var2.id_catch(var3);
            float var4 = var1.id_protected() ? (float)(var1.id_break() * 360) / 256.0F : (Float)var2.id_throws[15];
            float var5 = var1.id_protected() ? (float)(var1.id_byte() * 360) / 256.0F : (Float)var2.id_throws[16];
            var2.id_class(var3.id_class(), var3.id_break(), var3.id_byte(), var4, var5, 3, false);
         } else if (var1.id_protected()) {
            float var6 = (float)(var1.id_break() * 360) / 256.0F;
            float var7 = (float)(var1.id_byte() * 360) / 256.0F;
            var2.id_class(var2.rx(), var2.re(), var2.BO(), var6, var7, 3, false);
         }

         var2.id_int(var1.id_case());
      }
   }

   @Override
   public void id_class(rvm_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      if (rhz_3.id_break(var1.id_break())) {
         ((rhz_3)((cb_3)this.id_case.id_class[57]).id_implements[1]).id_protected = var1.id_break();
      }
   }

   @Override
   public void id_class(rvO_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_break());
      if (var2 != null) {
         var1.id_byte().forEach(var1x -> var2.id_class((rXQ)var1x.getFirst(), (rdn_3)var1x.getSecond()));
      }
   }

   @Override
   public void id_class(rZU var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((cb_3)this.id_case.id_class[57]).k();
   }

   @Override
   public void id_class(rZV var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((gm_3)this.id_case.id_class[56]).id_class(var1.id_break(), var1.id_throws(), var1.id_byte(), var1.id_protected());
   }

   @Override
   public void id_class(rZf_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((gm_3)this.id_case.id_class[56]).id_class(var1.id_break(), var1.id_byte(), var1.id_protected());
   }

   @Override
   public void id_class(rFt_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      cb_3 var2 = (cb_3)this.id_case.id_class[57];
      if ((rJr_1)var2.id_implements[4] != null && ((rJr_1)var2.id_implements[4]).id_case == var1.id_break()) {
         ((rJr_1)var2.id_implements[4]).id_class(var1.id_byte(), var1.id_protected());
      }
   }

   @Override
   public void id_class(rFy_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rfH_2 var2 = var1.id_break();
      ryO_2 var3 = ((gm_3)this.id_case.id_class[56]).id_class(var2);
      int var4 = var1.id_byte();
      boolean var5 = var4 == 2 && var3 instanceof rHZ;
      if (var4 == 1 && var3 instanceof rHU
         || var5
         || var4 == 3 && var3 instanceof rHO
         || var4 == 4 && var3 instanceof rys_3
         || var4 == 6 && var3 instanceof rHb_1
         || var4 == 7 && var3 instanceof ryG_2
         || var4 == 8 && var3 instanceof rHy_1
         || var4 == 9 && var3 instanceof ryS_2
         || var4 == 11 && var3 instanceof rHJ
         || var4 == 5 && var3 instanceof rHA
         || var4 == 12 && var3 instanceof rHj_1
         || var4 == 13 && var3 instanceof rHc_1
         || var4 == 14 && var3 instanceof rHx_1) {
         var3.id_class(((gm_3)this.id_case.id_class[56]).id_byte(var2), var1.id_protected());
      }

      if (var5 && (vm_3)this.id_case.id_class[73] instanceof ml_3) {
         ((ml_3)((vm_3)this.id_case.id_class[73])).id_final();
      }
   }

   @Override
   public void id_class(rvy_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      Object var2 = this.id_catch.id_class(var1.id_break());
      if (!(var2 instanceof ryS_2)) {
         var2 = new ryS_2();
         ((ryO_2)var2).id_break(this.id_catch, var1.id_break());
      }

      ((cb_3)this.id_case.id_class[57]).id_class((ryS_2)var2);
   }

   @Override
   public void id_class(rvP_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_new = new CommandDispatcher(var1.id_break());
   }

   @Override
   public void id_class(rFS var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rqO_2 var2 = var1.id_break();
      if (var2 == null) {
         this.id_extends.id_class(null, false);
      } else {
         OT var3 = this.id_extends.id_class().id_class(var2);
         this.id_extends.id_class(var3, false);
      }
   }

   @Override
   public void id_class(rZI var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      this.id_extends.id_class(var1);
   }

   @Override
   public void id_class(rvw_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      if (var1.id_break()) {
         ((gm_3)this.id_case.id_class[56]).id_break(var1.id_byte(), var1.id_throws(), var1.id_protected());
      } else {
         ((gm_3)this.id_case.id_class[56]).id_byte(var1.id_byte(), var1.id_throws(), var1.id_protected());
      }
   }

   @Override
   public void id_class(rvF_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ct_3 var2 = ((Hh_1)this.id_case.id_class[16]).id_catch();
      String var3 = rxI_2.id_class(var1.id_break());
      rrGb_1 var4 = ((gm_3)this.id_case.id_class[56]).id_class(var3);
      if (var4 == null) {
         var4 = new rrGb_1(var3);
         if (var2.id_class(var3) != null) {
            rrGb_1 var5 = var2.id_class(var2.id_class(var3));
            if (var5 != null) {
               var4 = var5;
            }
         }

         ((gm_3)this.id_case.id_class[56]).id_class(var4);
      }

      var1.id_class(var4);
      var2.id_class(var4);
   }

   @Override
   public void id_class(rZY var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      cb_3 var2 = (cb_3)this.id_case.id_class[57];
      rZo_1 var3 = var1.id_break();
      float var4 = var1.id_byte();
      int var5 = rfU_2.id_protected(var4 + 0.5F);
      if (var3 == rZY.id_class) {
         var2.id_class(new rgn_3("block.minecraft.spawn.not_valid"), false);
      } else if (var3 == rZY.id_break) {
         this.id_catch.id_synchronized().id_class(true);
         this.id_catch.id_implements(0.0F);
      } else if (var3 == rZY.id_byte) {
         this.id_catch.id_synchronized().id_class(false);
         this.id_catch.id_implements(1.0F);
      } else if (var3 == rZY.id_protected) {
         ((Ax_1)this.id_case.id_class[55]).id_break(rRl_1.id_class(var5));
      } else if (var3 == rZY.id_throws) {
         if (var5 == 0) {
            ((Aq_1)((cb_3)this.id_case.id_class[57]).id_break[0]).id_class(new rmI_2(rmf_3.PERFORM_RESPAWN));
            this.id_case.id_break(new Zb_1());
         } else if (var5 == 1) {
            this.id_case.id_break(new vg_3(true, () -> ((Aq_1)((cb_3)this.id_case.id_class[57]).id_break[0]).id_class(new rmI_2(rmf_3.PERFORM_RESPAWN))));
         }
      } else if (var3 == rZY.id_case) {
         Qw_1 var6 = (Qw_1)this.id_case.id_class[20];
         if (var4 == 0.0F) {
            this.id_case.id_break(new Zs_1());
         } else if (var4 == 101.0F) {
            ((cq_3)this.id_case.id_class[19])
               .id_throws()
               .id_class(new rgn_3("demo.help.movement", var6.h.id_native(), var6.X.id_native(), var6.J.id_native(), var6.x.id_native()));
         } else if (var4 == 102.0F) {
            ((cq_3)this.id_case.id_class[19]).id_throws().id_class(new rgn_3("demo.help.jump", var6.d.id_native()));
         } else if (var4 == 103.0F) {
            ((cq_3)this.id_case.id_class[19]).id_throws().id_class(new rgn_3("demo.help.inventory", var6.z.id_native()));
         } else if (var4 == 104.0F) {
            ((cq_3)this.id_case.id_class[19]).id_throws().id_class(new rgn_3("demo.day.6", var6.n.id_native()));
         }
      } else if (var3 == rZY.id_catch) {
         this.id_catch.id_class(var2, var2.rx(), var2.rH(), var2.BO(), rqn_3.S, rqL_2.PLAYERS, 0.18F, 0.45F);
      } else if (var3 == rZY.id_private) {
         this.id_catch.id_implements(var4);
      } else if (var3 == rZY.id_implements) {
         this.id_catch.id_catch(var4);
      } else if (var3 == rZY.id_finally) {
         this.id_catch.id_class(var2, var2.rx(), var2.re(), var2.BO(), rqn_3.XB, rqL_2.NEUTRAL, 1.0F, 1.0F);
      } else if (var3 == rZY.id_extends) {
         this.id_catch.id_class(rLQ.id_new, var2.rx(), var2.re(), var2.BO(), 0.0, 0.0, 0.0);
         if (var5 == 1) {
            this.id_catch.id_class(var2, var2.rx(), var2.re(), var2.BO(), rqn_3.BX, rqL_2.HOSTILE, 1.0F, 1.0F);
         }
      } else if (var3 == rZY.id_native) {
         ((cb_3)this.id_case.id_class[57]).id_throws(var4 == 0.0F);
      }
   }

   @Override
   public void id_class(rvH_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      if (this.id_catch.id_break(var1.id_protected()) instanceof rOD var3) {
         cb_3 var4 = (cb_3)this.id_case.id_class[57];
         rXA var5 = new rXA(var1.id_byte());
         rJQ var6 = new rJQ(var1.id_break(), (rhz_3)var4.id_implements[1], var5, var3);
         var4.id_implements[4] = var6;
         this.id_case.id_break(new Fl_1(var6, (rhz_3)var4.id_implements[1], var3));
      }
   }

   @Override
   public void id_class(rvu_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      double var2 = var1.id_throws();
      double var4 = var1.id_case();
      double var6 = var1.id_catch();
      if (!Double.isInfinite(var2) && !Double.isInfinite(var4) && !Double.isInfinite(var6)) {
         rRW var8 = new rRW((gm_3)this.id_case.id_class[56], null, var2, var4, var6, var1.id_private(), var1.id_implements());
         var8.id_class(true);
         ((cb_3)this.id_case.id_class[57])
            .id_byte(((cb_3)this.id_case.id_class[57]).rv().id_break((double)var1.id_break(), (double)var1.id_byte(), (double)var1.id_protected()));
      } else {
         rrfZ_2.id_class();
      }
   }

   @Override
   public void id_class(rvQ_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = var1.id_class(this.id_catch);
      if (var2 != null) {
         if (var1.id_break() == 21) {
            this.id_case.c().id_class((NQ)(new Nk_1((rEI)var2)));
         } else if (var1.id_break() == 35) {
            ((Cy_1)this.id_case.id_class[12]).id_class(var2, rLQ.S, 30);
            this.id_catch.id_class(var2.rx(), var2.re(), var2.BO(), rqn_3.dM, var2.Pr(), 1.0F, 1.0F, false);
            if (var2 == (cb_3)this.id_case.id_class[57] && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_super()) {
               ((Hh_1)this.id_case.id_class[16]).id_class(id_class((cb_3)this.id_case.id_class[57]));
            }
         } else {
            var2.id_class(var1.id_break());
         }
      }
   }

   @Override
   public void id_class(rFn_1 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((cb_3)this.id_case.id_class[57]).id_byte(var1.id_break());
      ((cb_3)this.id_case.id_class[57]).sk().id_class(var1.id_byte());
      ((cb_3)this.id_case.id_class[57]).sk().id_break(var1.id_protected());
   }

   @Override
   public void id_class(rFG var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      ((cb_3)this.id_case.id_class[57]).id_class(var1.id_break(), var1.id_byte(), var1.id_protected());
   }

   @Override
   public void id_class(rFP var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      rqM_2 var2 = var1.id_byte();
      rRJ var3 = var1.id_break();
      cb_3 var4 = (cb_3)this.id_case.id_class[57];
      int var5 = var4.V();
      this.id_implements = false;
      if (var2 != ((rYB)var4.id_throws[7]).E()) {
         rns_3 var6 = this.id_catch.id_package();
         boolean var7 = var1.id_catch();
         boolean var8 = var1.id_private();
         gv_3 var9 = new gv_3(this.id_private.id_extends(), this.id_private.id_implements(), var8);
         this.id_private = var9;
         this.id_catch = new gm_3(this, var9, var2, var3, this.id_package, (yX_2)this.id_case.id_class[8], var7, var1.id_protected());
         this.id_catch.id_class(var6);
         this.id_case.id_class(this.id_catch);
         this.id_case.id_break(new Zb_1());
      }

      this.id_catch.id_private();
      String var19 = var4.id_short();
      Object var14 = null;
      this.id_case.id_class[62] = var14;
      cb_3 var20 = ((Ax_1)this.id_case.id_class[55]).id_class(this.id_catch, var4.id_abstract(), var4.Z(), var4.h(), var4.PF());
      var20.id_implements(var5);
      this.id_case.id_class[57] = var20;
      if (var2 != ((rYB)var4.id_throws[7]).E()) {
         this.id_case.N().id_break();
      }

      this.id_case.id_class[62] = var20;
      var20.BQ().id_class(var4.BQ().id_byte());
      if (var1.id_implements()) {
         var20.BT().id_class(var4.BT());
      }

      var20.Bc();
      var20.id_byte(var19);
      this.id_catch.id_class(var5, (cG_2)var20);
      Float var17 = -180.0F;
      var20.id_throws[15] = var17;
      rqP_2 var18 = new rqP_2((Qw_1)this.id_case.id_class[20]);
      var20.id_break[17] = var18;
      ((Ax_1)this.id_case.id_class[55]).id_class(var20);
      var20.id_synchronized(var4.sW());
      var20.id_throws(var4.d());
      if ((vm_3)this.id_case.id_class[73] instanceof ZS) {
         this.id_case.id_break(null);
      }

      ((Ax_1)this.id_case.id_class[55]).id_break(var1.id_throws());
      ((Ax_1)this.id_case.id_class[55]).id_class(var1.id_case());
   }

   @Override
   public void id_class(rvS_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      Object var2 = null;
      cb_3 var3 = (cb_3)this.id_case.id_class[57];
      if (var1.id_break() == 0) {
         var2 = (rJT)var3.id_implements[3];
      } else if (var1.id_break() == ((rJr_1)var3.id_implements[4]).id_case) {
         var2 = (rJr_1)var3.id_implements[4];
      }

      if (var2 != null && !var1.id_protected()) {
         this.id_class(new rmg_3(var1.id_break(), var1.id_byte(), true));
      }
   }

   @Override
   public void id_class(rFT var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      cb_3 var2 = (cb_3)this.id_case.id_class[57];
      if (var1.id_break() == 0) {
         ((rJT)var2.id_implements[3]).id_class(var1.id_byte());
      } else if (var1.id_break() == ((rJr_1)var2.id_implements[4]).id_case) {
         ((rJr_1)var2.id_implements[4]).id_class(var1.id_byte());
      }
   }

   @Override
   public void id_class(rFM var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      cb_3 var2 = (cb_3)this.id_case.id_class[57];
      rdn_3 var3 = var1.id_protected();
      int var4 = var1.id_byte();
      if (var1.id_break() == -1) {
         if (!((vm_3)this.id_case.id_class[73] instanceof Fv_1)) {
            ((rhz_3)var2.id_implements[1]).id_private(var3);
         }
      } else if (var1.id_break() == -2) {
         ((rhz_3)var2.id_implements[1]).id_break(var4, var3);
      } else {
         boolean var5 = false;
         vm_3 var7 = (vm_3)this.id_case.id_class[73];
         if (var7 instanceof Fv_1 var6) {
            var5 = var6.id_interface() != rdX_2.id_final.id_class();
         }

         if (var1.id_break() == 0 && var1.id_byte() >= 36 && var4 < 45) {
            if (!var3.id_class()) {
               rdn_3 var8 = ((rJT)var2.id_implements[3]).id_class(var4).id_class();
               if (var8.id_class() || var8.id_char() < var3.id_char()) {
                  var3.id_protected(5);
               }
            }

            ((rJT)var2.id_implements[3]).id_class(var4, var3);
         } else if (var1.id_break() == ((rJr_1)var2.id_implements[4]).id_case && (var1.id_break() != 0 || !var5)) {
            ((rJr_1)var2.id_implements[4]).id_class(var4, var3);
         }
      }
   }

   private static rdn_3 id_class(rhd_3 var0) {
      for (rpm_3 var4 : rpm_3.values()) {
         rdn_3 var5 = var0.id_protected(var4);
         if (var5.id_break() == rdy_3.kL) {
            return var5;
         }
      }

      return new rdn_3(rdy_3.kL);
   }

   @Override
   public void id_class(rvA_2 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      an_3 var2 = this.id_catch.id_break(var1.id_break());
      if (var2 instanceof is_3) {
         ((is_3)var2).id_super(var1.id_byte());
      }
   }

   @Override
   public void id_class(rvp_3 var1) {
      ruZ_2.id_class(var1, this, this.id_case);
      cg_3.id_class(var1.id_byte(), this.id_case, var1.id_break(), var1.id_protected());
   }

   public void id_break(ruS_2<?> var1) {
      this.id_byte.id_break(var1);
   }

   public AX id_break() {
      return this.id_native;
   }

   private boolean id_break(String var1) {
      try {
         URI var2 = new URI(var1);
         String var3 = var2.getScheme();
         boolean var4 = "level".equals(var3);
         if (!"http".equals(var3) && !"https".equals(var3) && !var4) {
            throw new URISyntaxException(var1, "Wrong protocol");
         } else if (var4 && (var1.contains("..") || !var1.endsWith("/resources.zip"))) {
            throw new URISyntaxException(var1, "Invalid levelstorage resourcepack path");
         } else {
            return true;
         }
      } catch (URISyntaxException var5) {
         this.id_class(rZN.FAILED_DOWNLOAD);
         return false;
      }
   }

   public Collection<Aw_1> id_throws() {
      return this.id_finally.values();
   }

   public gm_3 id_finally() {
      return this.id_catch;
   }

   public GameProfile id_catch() {
      return this.id_protected;
   }

   public rlQ_2 id_extends() {
      return this.id_volatile;
   }

   public Collection<UUID> id_case() {
      return this.id_finally.keySet();
   }

   public CommandDispatcher<gR_2> id_implements() {
      return this.id_new;
   }

   public rVm_1 id_package() {
      return this.id_else;
   }

   public rWB id_protected() {
      return this.id_continue;
   }

   public Ab_1 id_private() {
      return this.id_extends;
   }

   public Set<rqM_2<rYB>> id_final() {
      return this.id_this;
   }

   public UUID id_volatile() {
      return this.id_super;
   }

   public gG_2 id_native() {
      return this.id_final;
   }
}
