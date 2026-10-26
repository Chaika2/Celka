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
   private static final Logger break_ = LogManager.getLogger();
   public static final rgP_2 class_ = new rgn_3("disconnect.lost");
   private final rud_3 byte_;
   private final GameProfile protected_;
   private final vm_3 throws_;
   private QY case_;
   private gm_3 catch_;
   private gv_3 private_;
   private boolean implements_;
   private final Map<UUID, Aw_1> finally_ = Maps.newHashMap();
   private final Ab_1 extends_;
   private final AX native_;
   private rlQ_2 volatile_ = rlQ_2.class_;
   private final gG_2 final_ = new gG_2(this);
   private int package_ = 3;
   private final Random int_ = new Random();
   private CommandDispatcher<gR_2> new_ = new CommandDispatcher();
   private final rWB continue_ = new rWB();
   private final UUID super_ = UUID.randomUUID();
   private Set<rqM_2<rYB>> this_;
   private rVm_1 else_ = rVm_1.break_();

   public void byte_() {
      this.catch_ = null;
   }

   public Aq_1(QY var1, vm_3 var2, rud_3 var3, GameProfile var4) {
      this.case_ = var1;
      this.throws_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.extends_ = new Ab_1(var1);
      this.native_ = new AX(this, var1);
   }

   @Override
   public void class_(rvv_3 var1) {
      this.class_(new rZr_1(var1.break_()));
   }

   @Override
   public void class_(rvf_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      cb_3 var2 = (cb_3)this.case_.class_[57];
      ((rhx_3)var2.implements_[18]).break_ = var1.byte_();
      ((rhx_3)var2.implements_[18]).protected_ = var1.throws_();
      ((rhx_3)var2.implements_[18]).class_ = var1.break_();
      ((rhx_3)var2.implements_[18]).byte_ = var1.protected_();
      ((rhx_3)var2.implements_[18]).class_(var1.case_());
      ((rhx_3)var2.implements_[18]).break_(var1.catch_());
   }

   @Override
   public void class_(rvt_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((gm_3)this.case_.class_[56])
         .class_((cb_3)this.case_.class_[57], var1.protected_(), var1.throws_(), var1.case_(), var1.break_(), var1.byte_(), var1.catch_(), var1.private_());
   }

   @Override
   public void class_(rFX var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.protected_());
      if (var2 != null) {
         ((gm_3)this.case_.class_[56]).class_((cb_3)this.case_.class_[57], var2, var1.break_(), var1.byte_(), var1.throws_(), var1.case_());
      }
   }

   @Override
   public void class_(rvg_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      Aw_1 var2 = null;

      for (rvo_3 var4 : var1.break_()) {
         if (var1.byte_() == rvY_2.REMOVE_PLAYER) {
            this.case_.volatile_().case_(var4.class_().getId());
            var2 = this.finally_.remove(var4.class_().getId());
         } else {
            var2 = this.finally_.get(var4.class_().getId());
            if (var1.byte_() == rvY_2.ADD_PLAYER) {
               var2 = new Aw_1(var4);
               this.finally_.put(var2.class_().getId(), var2);
               this.case_.volatile_().class_(var2);
            }

            if (var2 != null) {
               switch (var1.byte_()) {
                  case ADD_PLAYER:
                     var2.class_(var4.byte_());
                     var2.class_(var4.break_());
                     var2.class_(var4.protected_());
                     break;
                  case UPDATE_GAME_MODE:
                     var2.class_(var4.byte_());
                     break;
                  case UPDATE_LATENCY:
                     var2.class_(var4.break_());
                     break;
                  case UPDATE_DISPLAY_NAME:
                     var2.class_(var4.protected_());
               }
            }
         }
      }

      if (var2 != null) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLN.class_(var2, var1.byte_()));
      }
   }

   @Override
   public void class_(rFr_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = var1.class_(this.catch_);
      if (var2 instanceof iB_2) {
         ((iB_2)var2).class_(var1.break_());
      }
   }

   @Override
   public void class_(rvV_2 var1) {
      ((cq_3)this.case_.class_[19]).implements_().break_(var1.break_().getString().isEmpty() ? null : var1.break_());
      ((cq_3)this.case_.class_[19]).implements_().class_(var1.byte_().getString().isEmpty() ? null : var1.byte_());
   }

   public void class_(rZN var1) {
      this.byte_.class_(new rZQ(var1));
   }

   @Override
   public void class_(rFv_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((cq_3)this.case_.class_[19]).extends_().class_(var1);
   }

   @Override
   public void class_(rvs_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLn_1.class_(var1)).byte_()) {
         if (var1.byte_() == 0) {
            ((cb_3)this.case_.class_[57]).sK().break_(var1.break_());
         } else {
            ((cb_3)this.case_.class_[57]).sK().class_(var1.break_(), var1.byte_());
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLA.class_(var1));
      }
   }

   @Override
   public void class_(rvn_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = ((cb_3)this.case_.class_[57]).PO();
      if (var2 != (cb_3)this.case_.class_[57] && var2.Po()) {
         var2.break_(var1.break_(), var1.byte_(), var1.protected_(), var1.throws_(), var1.case_());
         this.byte_.class_(new rZS(var2));
      }
   }

   private void class_(CompletableFuture<?> var1) {
      var1.thenRun(() -> this.class_(rZN.SUCCESSFULLY_LOADED)).exceptionally(var1x -> {
         this.class_(rZN.FAILED_DOWNLOAD);
         return null;
      });
   }

   @Override
   public void class_(rFs_1 var1) {
      String var2 = var1.break_();
      String var3 = var1.byte_();
      if (this.break_(var2)) {
         if (var2.startsWith("level://")) {
            String var4 = URLDecoder.decode(var2.substring("level://".length()), StandardCharsets.UTF_8);
            File var5 = new File((File)this.case_.class_[24], "saves");
            File var6 = new File(var5, var4);
            if (var6.isFile()) {
               this.class_(rZN.ACCEPTED);
               CompletableFuture var7 = this.case_.Z().class_(var6, rAZ.byte_);
               this.class_(var7);
               return;
            }

            this.class_(rZN.FAILED_DOWNLOAD);
         } else {
            Ak_1 var8 = this.case_.S();
            if (var8 != null && var8.break_() == Az_1.ENABLED) {
               this.class_(rZN.ACCEPTED);
               this.class_(this.case_.Z().class_(var2, var3));
            } else if (var8 != null && var8.break_() != Az_1.PROMPT) {
               this.class_(rZN.DECLINED);
            } else {
               this.case_.execute(() -> this.case_.break_(new mT_2(var3x -> {
                     this.case_ = QY.instanceof_();
                     Ak_1 var4x = this.case_.S();
                     if (var3x) {
                        if (var4x != null) {
                           var4x.class_(Az_1.ENABLED);
                        }

                        this.class_(rZN.ACCEPTED);
                        this.class_(this.case_.Z().class_(var2, var3));
                     } else {
                        if (var4x != null) {
                           var4x.class_(Az_1.DISABLED);
                        }

                        this.class_(rZN.DECLINED);
                     }

                     AQ.byte_(var4x);
                     this.case_.break_(null);
                  }, new rgn_3("multiplayer.texturePrompt.line1"), new rgn_3("multiplayer.texturePrompt.line2"))));
            }
         }
      }
   }

   @Override
   public void class_(rvI_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.case_
         .c()
         .class_(
            new Np_1(var1.break_(), var1.byte_(), var1.catch_(), var1.private_(), false, 0, NN.LINEAR, var1.protected_(), var1.throws_(), var1.case_(), false)
         );
   }

   @Override
   public void class_(rvK_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rjU_2 var2 = var1.class_(this.catch_);
      if (var2 != null) {
         ((cb_3)this.case_.class_[57]).class_(var1.break_(), var2);
      }
   }

   @Override
   public void class_(rve_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      if (!this.final_.class_(var1.break_(), var1.byte_())) {
         break_.debug("Got unhandled response to tag query {}", var1.break_());
      }
   }

   @Override
   public void class_(rFW var1) {
      ruZ_2.class_(var1, this, this.case_);

      for (Entry var3 : var1.break_().entrySet()) {
         rCi_1 var4 = (rCi_1)var3.getKey();
         int var5 = (Integer)var3.getValue();
         ((cb_3)this.case_.class_[57]).abstract_().class_((cb_3)this.case_.class_[57], var4, var5);
      }

      if ((vm_3)this.case_.class_[73] instanceof cy_3) {
         ((cy_3)((vm_3)this.case_.class_[73])).break_();
      }
   }

   @Override
   public void class_(rvT_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.byte_());
      if (var2 instanceof iB_2) {
         rLR var3 = rLR.class_(var1.protected_());
         if (var3 != null) {
            rLY var4 = new rLY(var3, var1.case_(), var1.throws_(), var1.private_(), var1.catch_(), var1.implements_());
            var4.class_(var1.break_());
            ((iB_2)var2).byte_(var4);
         }
      }
   }

   @Override
   public void class_(rFl_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.continue_.class_(var1.break_());
      Vo_1 var2 = this.case_.class_(gJ_2.byte_);
      var2.class_();
      VR var3 = ((cb_3)this.case_.class_[57]).Z();
      var3.class_(this.continue_.break_());
      var3.class_().forEach(var2::class_);
      var2.break_();
   }

   @Override
   public void class_(rFQ var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.native_.class_(var1.break_(), var1.byte_());
   }

   @Override
   public void class_(rFz_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.case_.c().class_(var1.break_(), var1.byte_());
   }

   @Override
   public void class_(rFu_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rFm_1 var2 = var1.break_();
      rgP_2 var3 = null;
      rgP_2 var4 = null;
      rgP_2 var5 = var1.byte_() != null ? var1.byte_() : rgN_2.byte_;
      switch (var2) {
         case TITLE:
            var3 = var5;
            break;
         case SUBTITLE:
            var4 = var5;
            break;
         case ACTIONBAR:
            if (!var5.getString().isEmpty()) {
               ((cq_3)this.case_.class_[19]).class_(var5, false, false);
            }

            return;
         case RESET:
            ((cq_3)this.case_.class_[19]).class_(null, null, -1, -1, -1);
            ((cq_3)this.case_.class_[19]).class_();
            return;
      }

      ((cq_3)this.case_.class_[19]).class_(var3, var4, var1.protected_(), var1.throws_(), var1.case_());
   }

   @Override
   public void class_(rFw_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      var1.class_(this.catch_.instanceof_());
   }

   @Override
   public void class_(rZg_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = var1.class_(this.catch_);
      if (var2 != null) {
         this.case_.break_(var2);
      }
   }

   @Override
   public void class_(rFE var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.private_.class_(var1.byte_());
      this.private_.break_(var1.break_());
   }

   @Override
   public void class_(rZa_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      if (var1.class_ == rvr_3.ENTITY_DIED) {
         an_3 var2 = this.catch_.break_(var1.break_);
         if (var2 == (cb_3)this.case_.class_[57]) {
            if (((cb_3)this.case_.class_[57]).d()) {
               ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_();
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrAG.class_(var2.Ps()));
               this.case_.break_(new ZS(var1.throws_, this.catch_.synchronized_().implements_()));
            } else {
               ((cb_3)this.case_.class_[57]).J();
            }
         }
      }
   }

   @Override
   public void class_(rFN var1) {
      ruZ_2.class_(var1, this, this.case_);
      rlQ_2 var2 = var1.break_();
      Multimap var3 = rlA_2.break_(var2);
      if (false) {
         break_.warn("Incomplete server tags, disconnecting. Missing: {}", var3);
         this.byte_.class_(new rgn_3("multiplayer.disconnect.missing_tags"));
      } else {
         this.volatile_ = var2;
         if (!this.byte_.protected_()) {
            var2.throws_();
         }

         this.case_.class_(gJ_2.break_).break_();
      }
   }

   public Aw_1 class_(UUID var1) {
      return this.finally_.get(var1);
   }

   public Aw_1 class_(String var1) {
      for (Aw_1 var3 : this.finally_.values()) {
         if (var3.class_().getName().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public rud_3 class_() {
      return this.byte_;
   }

   private void class_(int var1, int var2, rrse_3 var3, rRo_1 var4, int var5, int var6, Iterator<byte[]> var7, boolean var8) {
      for (int var9 = 0; var9 < 18; var9++) {
         int var10 = -1 + var9;
         boolean var11 = (var5 & 1 << var9) != 0;
         boolean var12 = (var6 & 1 << var9) != 0;
         if (var11 || var12) {
            var3.class_(var4, rjh_3.class_(var1, var10, var2), var11 ? new roH_2((byte[])((byte[])var7.next()).clone()) : new roH_2(), var8);
            this.catch_.break_(var1, var10, var2);
         }
      }
   }

   @Override
   public void class_(rvj_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((Ax_1)this.case_.class_[55]).class_(this.catch_, var1.byte_(), var1.break_(), var1.throws_(), var1.protected_());
   }

   @Override
   public void class_(rva_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      VR var2 = ((cb_3)this.case_.class_[57]).Z();
      var2.class_(var1.protected_());
      rvi_3 var3 = var1.throws_();
      switch (var3) {
         case REMOVE:
            for (rqO_2 var11 : var1.break_()) {
               this.continue_.class_(var11).ifPresent(var2::byte_);
            }
            break;
         case INIT:
            for (rqO_2 var9 : var1.break_()) {
               this.continue_.class_(var9).ifPresent(var2::class_);
            }

            for (rqO_2 var10 : var1.byte_()) {
               this.continue_.class_(var10).ifPresent(var2::case_);
            }
            break;
         case ADD:
            for (rqO_2 var5 : var1.break_()) {
               this.continue_.class_(var5).ifPresent(var1x -> {
                  var2.class_((rkw_3<?>)var1x);
                  var2.case_((rkw_3<?>)var1x);
               });
            }
      }

      var2.class_().forEach(var1x -> var1x.class_(var2));
      if ((vm_3)this.case_.class_[73] instanceof mB_2) {
         ((mB_2)((vm_3)this.case_.class_[73])).class_();
      }
   }

   @Override
   public void class_(rFH var1) {
      ruZ_2.class_(var1, this, this.case_);
      rns_3 var2 = this.catch_.package_();
      String var3 = var1.byte_();
      switch (var1.throws_()) {
         case CHANGE:
            rnP_2 var4 = var2.break_(var3);
            rAa_1 var5 = var2.break_(var1.break_(), var4);
            var5.break_(var1.protected_());
            break;
         case REMOVE:
            var2.byte_(var1.break_(), var2.byte_(var3));
      }
   }

   @Override
   public void class_(rvM_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rns_3 var2 = this.catch_.package_();
      String var3 = var1.byte_();
      rnP_2 var4 = var3 == null ? null : var2.break_(var3);
      var2.class_(var1.break_(), var4);
   }

   @Override
   public void class_(rFc_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rns_3 var2 = this.catch_.package_();
      rnB_2 var3;
      if (var1.throws_() == 0) {
         var3 = var2.case_(var1.break_());
      } else {
         var3 = var2.throws_(var1.break_());
      }

      if (var1.throws_() == 0 || var1.throws_() == 2) {
         var3.class_(var1.byte_());
         var3.class_(var1.catch_());
         var3.class_(var1.case_());
         rnX_2 var4 = rnX_2.class_(var1.private_());
         if (var4 != null) {
            var3.class_(var4);
         }

         rnh_3 var5 = rnh_3.class_(var1.implements_());
         if (var5 != null) {
            var3.class_(var5);
         }

         var3.break_(var1.finally_());
         var3.byte_(var1.extends_());
      }

      if (var1.throws_() == 0 || var1.throws_() == 3) {
         for (String var8 : var1.protected_()) {
            var2.class_(var8, var3);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .finally_()
               .class_(rrLL.class_(new Aw_1(new GameProfile(UUID.randomUUID(), var8)), var1.finally_()));
         }
      }

      if (var1.throws_() == 4) {
         for (String var9 : var1.protected_()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
               .finally_()
               .class_(rrLL.class_(new Aw_1(new GameProfile(UUID.randomUUID(), var9)), var1.finally_()));
            var2.break_(var9, var3);
         }
      }

      if (var1.throws_() == 1) {
         var2.class_(var3);
      }
   }

   @Override
   public void class_(rFd_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      double var2 = var1.byte_();
      double var4 = var1.protected_();
      double var6 = var1.throws_();
      if (!Double.isInfinite(var2) && !Double.isInfinite(var4) && !Double.isInfinite(var6)) {
         if (var1.finally_() == 0) {
            double var8 = (double)(var1.implements_() * var1.case_());
            double var10 = (double)(var1.implements_() * var1.catch_());
            double var12 = (double)(var1.implements_() * var1.private_());

            try {
               this.catch_.class_(var1.extends_(), var1.break_(), var2, var4, var6, var8, var10, var12);
            } catch (Throwable var23) {
               break_.warn("Could not spawn particle effect {}", var1.extends_());
            }
         } else {
            for (int var24 = 0; var24 < var1.finally_(); var24++) {
               double var9 = this.int_.nextGaussian() * (double)var1.case_();
               double var11 = this.int_.nextGaussian() * (double)var1.catch_();
               double var13 = this.int_.nextGaussian() * (double)var1.private_();
               double var15 = this.int_.nextGaussian() * (double)var1.implements_();
               double var17 = this.int_.nextGaussian() * (double)var1.implements_();
               double var19 = this.int_.nextGaussian() * (double)var1.implements_();

               try {
                  this.catch_.class_(var1.extends_(), var1.break_(), var2 + var9, var4 + var11, var6 + var13, var15, var17, var19);
               } catch (Throwable var22) {
                  break_.warn("Could not spawn particle effect {}", var1.extends_());
                  return;
               }
            }
         }
      } else {
         rrfZ_2.class_();
      }
   }

   @Override
   public void class_(rFB var1) {
      ruZ_2.class_(var1, this, this.case_);
      rns_3 var2 = this.catch_.package_();
      String var3 = var1.break_();
      if (var1.protected_() == 0) {
         var2.class_(var3, rAi_1.break_, var1.byte_(), var1.throws_());
      } else if (var2.class_(var3)) {
         rnP_2 var4 = var2.byte_(var3);
         if (var1.protected_() == 1) {
            var2.byte_(var4);
         } else if (var1.protected_() == 2) {
            var4.class_(var1.throws_());
            var4.class_(var1.byte_());
         }
      }
   }

   @Override
   public void class_(rvE_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rqO_2 var2 = var1.break_();
      ruu_3 var3 = null;

      try {
         var3 = var1.byte_();
         if (rvE_2.class_.equals(var2)) {
            ((cb_3)this.case_.class_[57]).byte_(var3.throws_(32767));
         } else if (rvE_2.break_.equals(var2)) {
            int var4 = var3.readInt();
            float var5 = var3.readFloat();
            rLC var6 = rLC.class_(var3);
            ((yK_2)this.case_.class_[17]).class_.class_(var4, var6, var5);
         } else if (rvE_2.byte_.equals(var2)) {
            long var34 = var3.catch_();
            rfH_2 var58 = var3.byte_();
            ((pS_2)((yK_2)this.case_.class_[17]).case_).class_(var34, var58);
         } else if (rvE_2.protected_.equals(var2)) {
            rfH_2 var35 = var3.byte_();
            int var48 = var3.readInt();
            ArrayList var59 = Lists.newArrayList();
            ArrayList var7 = Lists.newArrayList();

            for (int var8 = 0; var8 < var48; var8++) {
               var59.add(var3.byte_());
               var7.add(var3.readFloat());
            }

            ((yK_2)this.case_.class_[17]).catch_.class_(var35, var59, var7);
         } else if (rvE_2.throws_.equals(var2)) {
            rRJ var36 = this.else_.class_().class_(var3.volatile_());
            rfi_3 var49 = new rfi_3(var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt());
            int var60 = var3.readInt();
            ArrayList var69 = Lists.newArrayList();
            ArrayList var74 = Lists.newArrayList();

            for (int var9 = 0; var9 < var60; var9++) {
               var69.add(new rfi_3(var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt(), var3.readInt()));
               var74.add(var3.readBoolean());
            }

            ((yK_2)this.case_.class_[17]).private_.class_(var49, var69, var74, var36);
         } else if (rvE_2.case_.equals(var2)) {
            ((px_3)((yK_2)this.case_.class_[17]).finally_)
               .class_(var3.byte_(), var3.readFloat(), var3.readFloat(), var3.readFloat(), var3.readFloat(), var3.readFloat());
         } else if (rvE_2.finally_.equals(var2)) {
            int var37 = var3.readInt();

            for (int var50 = 0; var50 < var37; var50++) {
               ((yK_2)this.case_.class_[17]).final_.class_(var3.protected_());
            }

            int var51 = var3.readInt();

            for (int var61 = 0; var61 < var51; var61++) {
               ((yK_2)this.case_.class_[17]).final_.break_(var3.protected_());
            }
         } else if (rvE_2.private_.equals(var2)) {
            rfH_2 var38 = var3.byte_();
            String var52 = var3.native_();
            int var62 = var3.readInt();
            pb_3 var70 = new pb_3(var38, var52, var62);
            ((yK_2)this.case_.class_[17]).volatile_.class_(var70);
         } else if (rvE_2.implements_.equals(var2)) {
            rfH_2 var39 = var3.byte_();
            ((yK_2)this.case_.class_[17]).volatile_.class_(var39);
         } else if (rvE_2.catch_.equals(var2)) {
            rfH_2 var40 = var3.byte_();
            int var53 = var3.readInt();
            ((yK_2)this.case_.class_[17]).volatile_.class_(var40, var53);
         } else if (rvE_2.extends_.equals(var2)) {
            rfH_2 var41 = var3.byte_();
            int var54 = var3.readInt();
            int var63 = var3.readInt();
            ArrayList var71 = Lists.newArrayList();

            for (int var75 = 0; var75 < var63; var75++) {
               int var79 = var3.readInt();
               boolean var10 = var3.readBoolean();
               String var11 = var3.throws_(255);
               var71.add(new ye_3(var41, var79, var11, var10));
            }

            ((yK_2)this.case_.class_[17]).new_.class_(var54, var71);
         } else if (rvE_2.new_.equals(var2)) {
            int var42 = var3.readInt();
            ArrayList var55 = Lists.newArrayList();

            for (int var64 = 0; var64 < var42; var64++) {
               var55.add(var3.byte_());
            }

            ((yK_2)this.case_.class_[17]).int_.class_(var55);
         } else if (rvE_2.native_.equals(var2)) {
            double var43 = var3.readDouble();
            double var65 = var3.readDouble();
            double var76 = var3.readDouble();
            ex_3 var81 = new ex_3(var43, var65, var76);
            UUID var83 = var3.private_();
            int var12 = var3.readInt();
            String var13 = var3.native_();
            String var14 = var3.native_();
            int var15 = var3.readInt();
            float var16 = var3.readFloat();
            float var17 = var3.readFloat();
            String var18 = var3.native_();
            boolean var19 = var3.readBoolean();
            rLC var20;
            if (var19) {
               var20 = rLC.class_(var3);
            } else {
               var20 = null;
            }

            boolean var21 = var3.readBoolean();
            pG_2 var22 = new pG_2(var83, var12, var13, var14, var15, var16, var17, var81, var18, var20, var21);
            int var23 = var3.readInt();

            for (int var24 = 0; var24 < var23; var24++) {
               String var25 = var3.native_();
               var22.native_.add(var25);
            }

            int var99 = var3.readInt();

            for (int var101 = 0; var101 < var99; var101++) {
               String var26 = var3.native_();
               var22.volatile_.add(var26);
            }

            int var102 = var3.readInt();

            for (int var103 = 0; var103 < var102; var103++) {
               String var27 = var3.native_();
               var22.final_.add(var27);
            }

            int var104 = var3.readInt();

            for (int var105 = 0; var105 < var104; var105++) {
               rfH_2 var28 = var3.byte_();
               var22.int_.add(var28);
            }

            int var106 = var3.readInt();

            for (int var107 = 0; var107 < var106; var107++) {
               rfH_2 var29 = var3.byte_();
               var22.new_.add(var29);
            }

            int var108 = var3.readInt();

            for (int var109 = 0; var109 < var108; var109++) {
               String var30 = var3.native_();
               var22.package_.add(var30);
            }

            ((yK_2)this.case_.class_[17]).volatile_.class_(var22);
         } else if (rvE_2.volatile_.equals(var2)) {
            double var44 = var3.readDouble();
            double var66 = var3.readDouble();
            double var77 = var3.readDouble();
            ex_3 var82 = new ex_3(var44, var66, var77);
            UUID var84 = var3.private_();
            int var85 = var3.readInt();
            boolean var86 = var3.readBoolean();
            rfH_2 var87 = null;
            if (var86) {
               var87 = var3.byte_();
            }

            boolean var88 = var3.readBoolean();
            rfH_2 var89 = null;
            if (var88) {
               var89 = var3.byte_();
            }

            int var90 = var3.readInt();
            boolean var91 = var3.readBoolean();
            rLC var92 = null;
            if (var91) {
               var92 = rLC.class_(var3);
            }

            yf_3 var93 = new yf_3(var84, var85, var82, var92, var87, var89, var90);
            int var94 = var3.readInt();

            for (int var95 = 0; var95 < var94; var95++) {
               String var97 = var3.native_();
               var93.private_.add(var97);
            }

            int var96 = var3.readInt();

            for (int var98 = 0; var98 < var96; var98++) {
               rfH_2 var100 = var3.byte_();
               var93.implements_.add(var100);
            }

            ((yK_2)this.case_.class_[17]).package_.class_(var93);
         } else if (rvE_2.final_.equals(var2)) {
            rfH_2 var45 = var3.byte_();
            String var56 = var3.native_();
            int var67 = var3.readInt();
            int var72 = var3.readInt();
            boolean var78 = var3.readBoolean();
            yj_3 var80 = new yj_3(var45, var56, var67, var72, var78, this.catch_.r());
            ((yK_2)this.case_.class_[17]).package_.class_(var80);
         } else if (rvE_2.int_.equals(var2)) {
            ((yK_2)this.case_.class_[17]).continue_.class_();
         } else if (rvE_2.package_.equals(var2)) {
            rfH_2 var46 = var3.byte_();
            int var57 = var3.readInt();
            String var68 = var3.native_();
            int var73 = var3.readInt();
            ((yK_2)this.case_.class_[17]).continue_.class_(var46, var57, var68, var73);
         } else if (var2.break_().equals("custom_ping_packet") && rrjA_2.protected_().throws_().byte_(ProtocolVersion.v1_17_1)) {
            ruu_3 var47 = new ruu_3(Unpooled.buffer());
            var47.writeInt(var1.byte_().readInt());
            this.byte_.class_(new rmY_2(var2, var47));
         } else {
            break_.warn("Unknown custom packed identifier: {}", var2);
         }
      } finally {
         if (var3 != null) {
            var3.release();
         }
      }
   }

   @Override
   public void class_(rvl_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rdn_3 var2 = ((cb_3)this.case_.class_[57]).protected_(var1.break_());
      if (var2.break_() == rdy_3.dr) {
         this.case_.break_(new vz_3(new vu_3(var2)));
      }
   }

   @Override
   public void class_(rFA var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.catch_.native_().break_(var1.break_(), var1.byte_());
   }

   @Override
   public void class_(rFq_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.package_ = var1.break_();
      this.catch_.native_().class_(var1.break_());
   }

   @Override
   public void class_(rvL_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rJr_1 var2 = (rJr_1)((cb_3)this.case_.class_[57]).implements_[4];
      if (var1.break_() == var2.case_ && var2 instanceof rJp_1) {
         ((rJp_1)var2).class_(new rdf_3(var1.byte_().class_()));
         ((rJp_1)var2).throws_(var1.throws_());
         ((rJp_1)var2).case_(var1.protected_());
         ((rJp_1)var2).class_(var1.case_());
         ((rJp_1)var2).break_(var1.catch_());
      }
   }

   @Override
   public void class_(rFC var1) {
      ruZ_2.class_(var1, this, this.case_);
      int var2 = var1.break_();
      int var3 = var1.byte_();
      rrse_3 var4 = this.catch_.native_().class_();
      int var5 = var1.protected_();
      int var6 = var1.throws_();
      Iterator var7 = var1.case_().iterator();
      this.class_(var2, var3, var4, rRo_1.SKY, var5, var6, var7, var1.finally_());
      int var8 = var1.catch_();
      int var9 = var1.private_();
      Iterator var10 = var1.implements_().iterator();
      this.class_(var2, var3, var4, rRo_1.BLOCK, var8, var9, var10, var1.finally_());
   }

   @Override
   public void class_(rvq_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rJr_1 var2 = (rJr_1)((cb_3)this.case_.class_[57]).implements_[4];
      if (var2.case_ == var1.byte_() && var2.byte_((cb_3)this.case_.class_[57])) {
         this.continue_.class_(var1.break_()).ifPresent(var2x -> {
            if ((vm_3)this.case_.class_[73] instanceof mB_2) {
               ms_3 var3 = ((mB_2)((vm_3)this.case_.class_[73])).break_();
               var3.class_((rkw_3<?>)var2x, var2.throws_);
            }
         });
      }
   }

   @Override
   public void class_(rvW_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.break_());
      if (var2 != null) {
         if (!(var2 instanceof iB_2)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var2 + ")");
         }

         ik_3 var3 = ((iB_2)var2).BT();

         for (rvz_3 var5 : var1.byte_()) {
            ic_3 var6 = var3.class_(var5.class_());
            if (var6 == null) {
               break_.warn("Entity {} does not have attribute {}", var2, rVL.O.break_(var5.class_()));
            } else {
               var6.class_(var5.break_());
               var6.throws_();

               for (ix_3 var8 : var5.byte_()) {
                  var6.break_(var8);
               }
            }
         }
      }
   }

   @Override
   public void class_(rvb_3 var1) {
      this.byte_.class_(var1.break_());
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
      this.case_.transient_();
      if (this.throws_ != null) {
         this.case_.break_(new ZG(this.throws_, var1, var2));
      } else {
         this.case_.break_(new ZG(new vG_2(new rrvL()), var1, var2));
      }
   }

   public void class_(ruS_2<?> var1) {
      this.byte_.class_(var1);
   }

   @Override
   public void class_(rvZ_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      QY var10000 = this.case_;
      Ax_1 var13 = new Ax_1(this.case_, this);
      var10000.class_[55] = var13;
      if (!this.byte_.protected_()) {
         rlA_2.class_();
      }

      ArrayList var2 = Lists.newArrayList(var1.catch_());
      Collections.shuffle(var2);
      this.this_ = Sets.newLinkedHashSet(var2);
      this.else_ = var1.private_();
      rqM_2 var3 = var1.finally_();
      rRJ var4 = var1.implements_();
      this.package_ = var1.extends_();
      boolean var5 = var1.final_();
      boolean var6 = var1.package_();
      gv_3 var7 = new gv_3(rRO.NORMAL, var1.protected_(), var6);
      this.private_ = var7;
      this.catch_ = new gm_3(this, var7, var3, var4, this.package_, (yX_2)this.case_.class_[8], var5, var1.byte_());
      this.case_.class_(this.catch_);
      if ((cb_3)this.case_.class_[57] == null) {
         var10000 = this.case_;
         cb_3 var14 = ((Ax_1)this.case_.class_[55]).class_(this.catch_, new rlP_2(), new VR());
         var10000.class_[57] = var14;
         cb_3 var19 = (cb_3)this.case_.class_[57];
         Float var15 = -180.0F;
         var19.throws_[15] = var15;
         if (this.case_.this_() != null) {
            this.case_.this_().class_(((cb_3)this.case_.class_[57]).ro());
         }
      }

      ((yK_2)this.case_.class_[17]).class_();
      ((cb_3)this.case_.class_[57]).Bc();
      int var8 = var1.break_();
      this.catch_.class_(var8, (cG_2)((cb_3)this.case_.class_[57]));
      cb_3 var20 = (cb_3)this.case_.class_[57];
      rqP_2 var16 = new rqP_2((Qw_1)this.case_.class_[20]);
      var20.break_[17] = var16;
      ((Ax_1)this.case_.class_[55]).class_((cb_3)this.case_.class_[57]);
      cb_3 var17 = (cb_3)this.case_.class_[57];
      this.case_.class_[62] = var17;
      this.case_.break_(new Zb_1());
      ((cb_3)this.case_.class_[57]).implements_(var8);
      ((cb_3)this.case_.class_[57]).synchronized_(var1.native_());
      ((cb_3)this.case_.class_[57]).throws_(var1.volatile_());
      ((Ax_1)this.case_.class_[55]).break_(var1.throws_());
      ((Ax_1)this.case_.class_[55]).class_(var1.case_());
      ((Qw_1)this.case_.class_[20]).byte_();
      this.byte_.class_(new rmY_2(rmY_2.class_, new ruu_3(Unpooled.buffer()).class_(Qn_1.class_())));
      this.case_.short_().break_();
   }

   @Override
   public void class_(rZR var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.catch_.class_(var1.byte_(), var1.break_());
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
   }

   @Override
   public void class_(rFZ var1) {
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
      ruZ_2.class_(var1, this, this.case_);
      int var2 = var1.break_();
      int var3 = var1.byte_();
      AO var4 = this.catch_.native_();
      var4.class_(var2, var3);
      rrse_3 var5 = var4.class_();

      for (int var6 = 0; var6 < 16; var6++) {
         this.catch_.break_(var2, var6, var3);
         var5.class_(rjh_3.class_(var2, var6, var3), true);
      }

      var5.class_(new rfj_3(var2, var3), false);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).break_(var1);
   }

   @Override
   public void class_(rZD var1) {
      ruZ_2.class_(var1, this, this.case_);
      int var2 = var1.byte_();
      int var3 = var1.protected_();
      rYZ var4 = var1.implements_() == null ? null : new rYZ(this.else_.break_(rVL.n), var1.implements_());
      roJ_2 var5 = this.catch_.native_().class_(var2, var3, var4, var1.break_(), var1.catch_(), var1.throws_(), var1.case_());
      if (var5 != null && var1.case_()) {
         this.catch_.break_(var5);
      }

      for (int var6 = 0; var6 < 16; var6++) {
         this.catch_.break_(var2, var6, var3);
      }

      for (rcd_3 var7 : var1.private_()) {
         rfH_2 var8 = new rfH_2(var7.private_("x"), var7.private_("y"), var7.private_("z"));
         ryO_2 var9 = this.catch_.class_(var8);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnO_2.class_(var9, var8));
         if (var9 != null) {
            var9.class_(this.catch_.byte_(var8), var7);
         }
      }

      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
   }

   @Override
   public void class_(rFh_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      double var2 = var1.throws_();
      double var4 = var1.case_();
      double var6 = var1.catch_();
      float var8 = (float)(var1.extends_() * 360) / 256.0F;
      float var9 = (float)(var1.native_() * 360) / 256.0F;
      iB_2 var10 = (iB_2)aI_2.class_(var1.protected_(), (gm_3)this.case_.class_[56]);
      if (var10 != null) {
         var10.byte_(var2, var4, var6);
         Float var17 = (float)(var1.volatile_() * 360) / 256.0F;
         var10.private_[23] = var17;
         Float var18 = (float)(var1.volatile_() * 360) / 256.0F;
         var10.private_[25] = var18;
         if (var10 instanceof rSu_1) {
            rSm_1[] var11 = ((rSu_1)var10).implements_();

            for (int var12 = 0; var12 < var11.length; var12++) {
               var11[var12].implements_(var12 + var1.break_());
            }
         }

         var10.implements_(var1.break_());
         var10.a_(var1.byte_());
         var10.break_(var2, var4, var6, var8, var9);
         var10.catch_((double)((float)var1.private_() / 8000.0F), (double)((float)var1.implements_() / 8000.0F), (double)((float)var1.finally_() / 8000.0F));
         this.catch_.class_(var1.break_(), var10);
         if (var10 instanceof rbF_2) {
            boolean var19 = ((rbF_2)var10).T_();
            Object var20;
            if (var19) {
               var20 = new NE((rbF_2)var10);
            } else {
               var20 = new NG((rbF_2)var10);
            }

            this.case_.c().class_((Nm_1)var20);
         }
      }
   }

   @Override
   public void class_(rFp_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((gm_3)this.case_.class_[56]).class_(var1.break_());
      ((gm_3)this.case_.class_[56]).break_(var1.byte_());
   }

   @Override
   public void class_(rFj_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((gm_3)this.case_.class_[56]).break_(var1.break_(), var1.byte_());
   }

   @Override
   public void class_(rFb_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.byte_());
      if (var2 == null) {
         break_.warn("Received passengers for unknown entity");
      } else {
         boolean var3 = var2.else_((cb_3)this.case_.class_[57]);
         var2.Bn();

         for (int var7 : var1.break_()) {
            an_3 var8 = this.catch_.break_(var7);
            if (var8 != null) {
               var8.class_(var2, true);
               if (var8 == (cb_3)this.case_.class_[57] && !var3) {
                  ((cq_3)this.case_.class_[19]).class_(new rgn_3("mount.onboard", ((Qw_1)this.case_.class_[20]).k.native_()), false, false);
               }
            }
         }
      }
   }

   @Override
   public void class_(rZj_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.break_());
      if (var2 != null) {
         if (var1.byte_() == 0) {
            iB_2 var3 = (iB_2)var2;
            var3.class_(rpm_3.MAIN_HAND);
         } else if (var1.byte_() == 3) {
            iB_2 var4 = (iB_2)var2;
            var4.class_(rpm_3.OFF_HAND);
         } else if (var1.byte_() == 1) {
            var2.rF();
         } else if (var1.byte_() == 2) {
            rhd_3 var5 = (rhd_3)var2;
            var5.class_(false, false);
         } else if (var1.byte_() == 4) {
            ((Cy_1)this.case_.class_[12]).class_(var2, rLQ.catch_);
         } else if (var1.byte_() == 5) {
            ((Cy_1)this.case_.class_[12]).class_(var2, rLQ.continue_);
         }
      }
   }

   @Override
   public void class_(rZK var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((cq_3)this.case_.class_[19]).class_(var1.protected_(), var1.break_(), var1.throws_());
   }

   @Override
   public void class_(rZe_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.break_());
      Object var3 = (iB_2)this.catch_.break_(var1.byte_());
      if (var3 == null) {
         var3 = (cb_3)this.case_.class_[57];
      }

      if (var2 != null) {
         if (var2 instanceof rsP_2) {
            this.catch_
               .class_(var2.rx(), var2.re(), var2.BO(), rqn_3.SB, rqL_2.PLAYERS, 0.1F, (this.int_.nextFloat() - this.int_.nextFloat()) * 0.35F + 0.9F, false);
         } else {
            this.catch_
               .class_(var2.rx(), var2.re(), var2.BO(), rqn_3.ER, rqL_2.PLAYERS, 0.2F, (this.int_.nextFloat() - this.int_.nextFloat()) * 1.4F + 2.0F, false);
         }

         ((Cy_1)this.case_.class_[12]).class_(new CN(this.case_.case_(), this.case_.interface_(), this.catch_, var2, (an_3)var3));
         if (var2 instanceof rsE_2 var4) {
            rdn_3 var5 = var4.protected_();
            rrLf_1.class_((iB_2)var3, var5.implements_());
            var5.catch_(var1.protected_());
            if (var5.class_()) {
               this.catch_.class_(var1.break_());
            }
         } else {
            this.catch_.class_(var1.break_());
         }
      }
   }

   @Override
   public void class_(rvc_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.break_());
      if (var2 != null) {
         var2.extends_((double)var1.byte_() / 8000.0, (double)var1.protected_() / 8000.0, (double)var1.throws_() / 8000.0);
      }
   }

   @Override
   public void class_(rvX_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.byte_());
      List var3 = var1.break_();
      if (var2 != null && var3 != null) {
         var2.BQ().class_(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLQ.class_(var2, var3));
      }
   }

   @Override
   public void class_(rFk_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      UUID var2 = var1.byte_();
      if (var2 != null) {
         Aw_1 var3 = this.class_(var2);
         if (var3 != null) {
            double var4 = var1.protected_();
            double var6 = var1.throws_();
            double var8 = var1.case_();
            float var10 = (float)(var1.catch_() * 360) / 256.0F;
            float var11 = (float)(var1.private_() * 360) / 256.0F;
            int var12 = var1.break_();
            cM_2 var13 = new cM_2((gm_3)this.case_.class_[56], var3.class_());
            var13.implements_(var12);
            var13.native_(var4, var6, var8);
            var13.byte_(var4, var6, var8);
            var13.break_(var4, var6, var8, var10, var11);
            this.catch_.class_(var12, (cG_2)var13);
         }
      }
   }

   @Override
   public void class_(rvN_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.break_());
      if (var2 != null) {
         double var3 = var1.byte_();
         double var5 = var1.protected_();
         double var7 = var1.throws_();
         var2.byte_(var3, var5, var7);
         if (!var2.Po()) {
            float var9 = (float)(var1.case_() * 360) / 256.0F;
            float var10 = (float)(var1.catch_() * 360) / 256.0F;
            var2.class_(var3, var5, var7, var9, var10, 3, true);
            var2.int_(var1.private_());
         }
      }
   }

   @Override
   public void class_(rFx_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rsO_2 var2 = new rsO_2(this.catch_, var1.protected_(), var1.throws_(), var1.case_());
      var2.implements_(var1.break_());
      var2.a_(var1.byte_());
      this.catch_.class_(var1.break_(), var2);
   }

   @Override
   public void class_(rFO var1) {
      ruZ_2.class_(var1, this, this.case_);
      double var2 = var1.byte_();
      double var4 = var1.protected_();
      double var6 = var1.throws_();
      rsP_2 var8 = new rsP_2(this.catch_, var2, var4, var6, var1.case_());
      var8.byte_(var2, var4, var6);
      Float var13 = 0.0F;
      var8.throws_[15] = var13;
      Float var14 = 0.0F;
      var8.throws_[16] = var14;
      var8.implements_(var1.break_());
      this.catch_.class_(var1.break_(), var8);
   }

   @Override
   public void class_(rFJ var1) {
      ruZ_2.class_(var1, this, this.case_);
      double var2 = var1.protected_();
      double var4 = var1.throws_();
      double var6 = var1.case_();
      aI_2 var8 = var1.native_();
      Object var9;
      if (var8 == aI_2.r) {
         var9 = new rsk_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.B) {
         var9 = new rsN_2(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.E) {
         var9 = new rsv_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.s) {
         var9 = new rsm_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.S) {
         var9 = new rsc_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.P) {
         var9 = new rsW_2(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.switch_) {
         var9 = new rsu_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.rO) {
         an_3 var10 = this.catch_.break_(var1.volatile_());
         if (var10 instanceof rhd_3) {
            var9 = new rhp_3(this.catch_, (rhd_3)var10, var2, var4, var6);
         } else {
            var9 = null;
         }
      } else if (var8 == aI_2.byte_) {
         var9 = new rhF_2(this.catch_, var2, var4, var6);
         an_3 var17 = this.catch_.break_(var1.volatile_());
         if (var17 != null) {
            ((rhm_3)var9).break_(var17);
         }
      } else if (var8 == aI_2.p) {
         var9 = new rho_3(this.catch_, var2, var4, var6);
         an_3 var18 = this.catch_.break_(var1.volatile_());
         if (var18 != null) {
            ((rhm_3)var9).break_(var18);
         }
      } else if (var8 == aI_2.g) {
         var9 = new rhD_2(this.catch_, var2, var4, var6);
         an_3 var19 = this.catch_.break_(var1.volatile_());
         if (var19 != null) {
            ((rhm_3)var9).break_(var19);
         }
      } else if (var8 == aI_2.y) {
         var9 = new rhY_2(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.for_) {
         var9 = new rhw_3(this.catch_, var2, var4, var6, var1.catch_(), var1.private_(), var1.implements_());
      } else if (var8 == aI_2.default_) {
         var9 = new rsG_2(this.catch_, new rfH_2(var2, var4, var6), rpr_3.class_(var1.volatile_()));
      } else if (var8 == aI_2.strictfp_) {
         var9 = new rsM_2(this.catch_, new rfH_2(var2, var4, var6));
      } else if (var8 == aI_2.f) {
         var9 = new rSi_1(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.while_) {
         var9 = new rhl_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.instanceof_) {
         var9 = new rhy_3(this.catch_, var2, var4, var6, rdn_3.break_);
      } else if (var8 == aI_2.const_) {
         var9 = new rhH_2(this.catch_, var2, var4, var6, var1.catch_(), var1.private_(), var1.implements_());
      } else if (var8 == aI_2.int_) {
         var9 = new rhA_2(this.catch_, var2, var4, var6, var1.catch_(), var1.private_(), var1.implements_());
      } else if (var8 == aI_2.l) {
         var9 = new rhR_2(this.catch_, var2, var4, var6, var1.catch_(), var1.private_(), var1.implements_());
      } else if (var8 == aI_2.rP) {
         var9 = new rhU_2(this.catch_, var2, var4, var6, var1.catch_(), var1.private_(), var1.implements_());
      } else if (var8 == aI_2.F) {
         var9 = new rhg_3(this.catch_, var2, var4, var6, var1.catch_(), var1.private_(), var1.implements_());
      } else if (var8 == aI_2.I) {
         var9 = new rhn_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.public_) {
         var9 = new rhC_2(this.catch_, var2, var4, var6, 0.0F, 0, null);
      } else if (var8 == aI_2.V) {
         var9 = new rhI_2(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.j) {
         var9 = new rsr_3(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.catch_) {
         var9 = new rSK(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.Q) {
         var9 = new rsX_2(this.catch_, var2, var4, var6, null);
      } else if (var8 == aI_2.break_) {
         var9 = new rSY(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.super_) {
         var9 = new rSa_1(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.short_) {
         var9 = new rsE_2(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.try_) {
         var9 = new rsB_2(this.catch_, var2, var4, var6, xd_3.class_(var1.volatile_()));
      } else if (var8 == aI_2.class_) {
         var9 = new aZ_2(this.catch_, var2, var4, var6);
      } else if (var8 == aI_2.boolean_) {
         var9 = new rSg_1(aI_2.boolean_, this.catch_);
      } else {
         var9 = null;
      }

      if (var9 != null) {
         int var20 = var1.break_();
         ((an_3)var9).byte_(var2, var4, var6);
         ((an_3)var9).private_(var2, var4, var6);
         Float var15 = (float)(var1.finally_() * 360) / 256.0F;
         ((an_3)var9).throws_[16] = var15;
         Float var16 = (float)(var1.extends_() * 360) / 256.0F;
         ((an_3)var9).throws_[15] = var16;
         ((an_3)var9).implements_(var20);
         ((an_3)var9).a_(var1.byte_());
         this.catch_.class_(var20, (an_3)var9);
         if (var9 instanceof rsJ_2) {
            this.case_.c().class_((NQ)(new NF((rsJ_2)var9)));
         }
      }
   }

   @Override
   public void class_(rvC_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      int var2 = 19 | (var1.break_() ? 128 : 0);
      var1.class_((var2x, var3) -> this.catch_.class_(var2x, var3, var2));
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var1);
   }

   @Override
   public void class_(rvD_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      double var2 = var1.break_();
      double var4 = var1.byte_();
      double var6 = var1.protected_();
      if (!Double.isInfinite(var2) && !Double.isInfinite(var4) && !Double.isInfinite(var6)) {
         cb_3 var8 = (cb_3)this.case_.class_[57];
         rjU_2 var9 = var8.rv();
         boolean var10 = var1.private_().contains(rvU_2.X);
         boolean var11 = var1.private_().contains(rvU_2.Y);
         boolean var12 = var1.private_().contains(rvU_2.Z);
         rrAl_1 var17 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(rrAl_1.class_(var2, var4, var6, var8.rx(), var8.re(), var8.BO(), var1.catch_(), false, false));
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var17);
         var17.implements_();
         if (!var17.byte_()) {
            double var18 = var17.break_();
            double var20 = var17.extends_();
            double var22 = var17.catch_();
            double var13;
            double var15;
            if (var10) {
               var13 = var9.class_();
               var15 = var8.rx() + var18;
               Double var41 = (Double)var8.throws_[34] + var18;
               var8.throws_[34] = var41;
            } else {
               var13 = 0.0;
               var15 = var18;
               Double var42 = var18;
               var8.throws_[34] = var42;
            }

            double var24;
            double var26;
            if (var11) {
               var24 = var9.break_();
               var26 = var8.re() + var20;
               Double var43 = (Double)var8.throws_[35] + var20;
               var8.throws_[35] = var43;
            } else {
               var24 = 0.0;
               var26 = var20;
               Double var44 = var20;
               var8.throws_[35] = var44;
            }

            double var28;
            double var30;
            if (var12) {
               var28 = var9.byte_();
               var30 = var8.BO() + var22;
               Double var45 = (Double)var8.throws_[36] + var22;
               var8.throws_[36] = var45;
            } else {
               var28 = 0.0;
               var30 = var22;
               Double var46 = var22;
               var8.throws_[36] = var46;
            }

            if ((Integer)var8.throws_[41] > 0 && var8.ra() != null) {
               var8.const_();
            }

            var8.volatile_(var15, var26, var30);
            Double var47 = var15;
            var8.throws_[8] = var47;
            Double var48 = var26;
            var8.throws_[9] = var48;
            Double var49 = var30;
            var8.throws_[10] = var49;
            var8.catch_(var13, var24, var28);
            float var32 = var1.throws_();
            float var33 = var1.case_();
            if (var1.private_().contains(rvU_2.X_ROT)) {
               var33 += var8.throws_[16];
            }

            if (var1.private_().contains(rvU_2.Y_ROT)) {
               var32 += var8.throws_[15];
            }

            float var34 = var32;
            float var35 = var33;
            if (var17.case_()) {
               var34 = (Float)var8.throws_[15];
               var35 = (Float)var8.throws_[16];
            }

            rrAH var36 = rrAH.class_((Float)var8.throws_[15], (Float)var8.throws_[16], true);
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var36);
            if (!var17.native_()) {
               var8.class_(var15, var26, var30, var34, var35, var36.break_());
            }

            this.byte_.class_(new rmV_2(var17.finally_()));
            this.byte_.class_(new rZX(var8.rx(), var8.re(), var8.BO(), var36.class_(), var36.byte_(), false));
            if (!this.implements_) {
               this.implements_ = true;
               this.case_.break_(null);
            }
         }
      } else {
         rrfZ_2.class_();
      }
   }

   @Override
   public void class_(rvG_2 var1) {
      ruZ_2.class_(var1, this, this.case_);

      for (int var2 = 0; var2 < var1.break_().length; var2++) {
         int var3 = var1.break_()[var2];
         this.catch_.class_(var3);
      }
   }

   @Override
   public void class_(rvh_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = var1.class_(this.catch_);
      if (var2 != null) {
         float var3 = (float)(var1.break_() * 360) / 256.0F;
         var2.class_(var3, 3);
      }
   }

   @Override
   public void class_(rvJ_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = var1.class_(this.catch_);
      if (var2 != null && !var2.Po()) {
         if (var1.throws_()) {
            rjU_2 var3 = var1.class_(var2.rm());
            var2.catch_(var3);
            float var4 = var1.protected_() ? (float)(var1.break_() * 360) / 256.0F : (Float)var2.throws_[15];
            float var5 = var1.protected_() ? (float)(var1.byte_() * 360) / 256.0F : (Float)var2.throws_[16];
            var2.class_(var3.class_(), var3.break_(), var3.byte_(), var4, var5, 3, false);
         } else if (var1.protected_()) {
            float var6 = (float)(var1.break_() * 360) / 256.0F;
            float var7 = (float)(var1.byte_() * 360) / 256.0F;
            var2.class_(var2.rx(), var2.re(), var2.BO(), var6, var7, 3, false);
         }

         var2.int_(var1.case_());
      }
   }

   @Override
   public void class_(rvm_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      if (rhz_3.break_(var1.break_())) {
         ((rhz_3)((cb_3)this.case_.class_[57]).implements_[1]).protected_ = var1.break_();
      }
   }

   @Override
   public void class_(rvO_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.break_());
      if (var2 != null) {
         var1.byte_().forEach(var1x -> var2.class_((rXQ)var1x.getFirst(), (rdn_3)var1x.getSecond()));
      }
   }

   @Override
   public void class_(rZU var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((cb_3)this.case_.class_[57]).k();
   }

   @Override
   public void class_(rZV var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((gm_3)this.case_.class_[56]).class_(var1.break_(), var1.throws_(), var1.byte_(), var1.protected_());
   }

   @Override
   public void class_(rZf_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((gm_3)this.case_.class_[56]).class_(var1.break_(), var1.byte_(), var1.protected_());
   }

   @Override
   public void class_(rFt_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      cb_3 var2 = (cb_3)this.case_.class_[57];
      if ((rJr_1)var2.implements_[4] != null && ((rJr_1)var2.implements_[4]).case_ == var1.break_()) {
         ((rJr_1)var2.implements_[4]).class_(var1.byte_(), var1.protected_());
      }
   }

   @Override
   public void class_(rFy_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      rfH_2 var2 = var1.break_();
      ryO_2 var3 = ((gm_3)this.case_.class_[56]).class_(var2);
      int var4 = var1.byte_();
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
         var3.class_(((gm_3)this.case_.class_[56]).byte_(var2), var1.protected_());
      }

      if (var5 && (vm_3)this.case_.class_[73] instanceof ml_3) {
         ((ml_3)((vm_3)this.case_.class_[73])).final_();
      }
   }

   @Override
   public void class_(rvy_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      Object var2 = this.catch_.class_(var1.break_());
      if (!(var2 instanceof ryS_2)) {
         var2 = new ryS_2();
         ((ryO_2)var2).break_(this.catch_, var1.break_());
      }

      ((cb_3)this.case_.class_[57]).class_((ryS_2)var2);
   }

   @Override
   public void class_(rvP_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.new_ = new CommandDispatcher(var1.break_());
   }

   @Override
   public void class_(rFS var1) {
      ruZ_2.class_(var1, this, this.case_);
      rqO_2 var2 = var1.break_();
      if (var2 == null) {
         this.extends_.class_(null, false);
      } else {
         OT var3 = this.extends_.class_().class_(var2);
         this.extends_.class_(var3, false);
      }
   }

   @Override
   public void class_(rZI var1) {
      ruZ_2.class_(var1, this, this.case_);
      this.extends_.class_(var1);
   }

   @Override
   public void class_(rvw_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      if (var1.break_()) {
         ((gm_3)this.case_.class_[56]).break_(var1.byte_(), var1.throws_(), var1.protected_());
      } else {
         ((gm_3)this.case_.class_[56]).byte_(var1.byte_(), var1.throws_(), var1.protected_());
      }
   }

   @Override
   public void class_(rvF_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ct_3 var2 = ((Hh_1)this.case_.class_[16]).catch_();
      String var3 = rxI_2.class_(var1.break_());
      rrGb_1 var4 = ((gm_3)this.case_.class_[56]).class_(var3);
      if (var4 == null) {
         var4 = new rrGb_1(var3);
         if (var2.class_(var3) != null) {
            rrGb_1 var5 = var2.class_(var2.class_(var3));
            if (var5 != null) {
               var4 = var5;
            }
         }

         ((gm_3)this.case_.class_[56]).class_(var4);
      }

      var1.class_(var4);
      var2.class_(var4);
   }

   @Override
   public void class_(rZY var1) {
      ruZ_2.class_(var1, this, this.case_);
      cb_3 var2 = (cb_3)this.case_.class_[57];
      rZo_1 var3 = var1.break_();
      float var4 = var1.byte_();
      int var5 = rfU_2.protected_(var4 + 0.5F);
      if (var3 == rZY.class_) {
         var2.class_(new rgn_3("block.minecraft.spawn.not_valid"), false);
      } else if (var3 == rZY.break_) {
         this.catch_.synchronized_().class_(true);
         this.catch_.implements_(0.0F);
      } else if (var3 == rZY.byte_) {
         this.catch_.synchronized_().class_(false);
         this.catch_.implements_(1.0F);
      } else if (var3 == rZY.protected_) {
         ((Ax_1)this.case_.class_[55]).break_(rRl_1.class_(var5));
      } else if (var3 == rZY.throws_) {
         if (var5 == 0) {
            ((Aq_1)((cb_3)this.case_.class_[57]).break_[0]).class_(new rmI_2(rmf_3.PERFORM_RESPAWN));
            this.case_.break_(new Zb_1());
         } else if (var5 == 1) {
            this.case_.break_(new vg_3(true, () -> ((Aq_1)((cb_3)this.case_.class_[57]).break_[0]).class_(new rmI_2(rmf_3.PERFORM_RESPAWN))));
         }
      } else if (var3 == rZY.case_) {
         Qw_1 var6 = (Qw_1)this.case_.class_[20];
         if (var4 == 0.0F) {
            this.case_.break_(new Zs_1());
         } else if (var4 == 101.0F) {
            ((cq_3)this.case_.class_[19])
               .throws_()
               .class_(new rgn_3("demo.help.movement", var6.h.native_(), var6.X.native_(), var6.J.native_(), var6.x.native_()));
         } else if (var4 == 102.0F) {
            ((cq_3)this.case_.class_[19]).throws_().class_(new rgn_3("demo.help.jump", var6.d.native_()));
         } else if (var4 == 103.0F) {
            ((cq_3)this.case_.class_[19]).throws_().class_(new rgn_3("demo.help.inventory", var6.z.native_()));
         } else if (var4 == 104.0F) {
            ((cq_3)this.case_.class_[19]).throws_().class_(new rgn_3("demo.day.6", var6.n.native_()));
         }
      } else if (var3 == rZY.catch_) {
         this.catch_.class_(var2, var2.rx(), var2.rH(), var2.BO(), rqn_3.S, rqL_2.PLAYERS, 0.18F, 0.45F);
      } else if (var3 == rZY.private_) {
         this.catch_.implements_(var4);
      } else if (var3 == rZY.implements_) {
         this.catch_.catch_(var4);
      } else if (var3 == rZY.finally_) {
         this.catch_.class_(var2, var2.rx(), var2.re(), var2.BO(), rqn_3.XB, rqL_2.NEUTRAL, 1.0F, 1.0F);
      } else if (var3 == rZY.extends_) {
         this.catch_.class_(rLQ.new_, var2.rx(), var2.re(), var2.BO(), 0.0, 0.0, 0.0);
         if (var5 == 1) {
            this.catch_.class_(var2, var2.rx(), var2.re(), var2.BO(), rqn_3.BX, rqL_2.HOSTILE, 1.0F, 1.0F);
         }
      } else if (var3 == rZY.native_) {
         ((cb_3)this.case_.class_[57]).throws_(var4 == 0.0F);
      }
   }

   @Override
   public void class_(rvH_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      if (this.catch_.break_(var1.protected_()) instanceof rOD var3) {
         cb_3 var4 = (cb_3)this.case_.class_[57];
         rXA var5 = new rXA(var1.byte_());
         rJQ var6 = new rJQ(var1.break_(), (rhz_3)var4.implements_[1], var5, var3);
         var4.implements_[4] = var6;
         this.case_.break_(new Fl_1(var6, (rhz_3)var4.implements_[1], var3));
      }
   }

   @Override
   public void class_(rvu_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      double var2 = var1.throws_();
      double var4 = var1.case_();
      double var6 = var1.catch_();
      if (!Double.isInfinite(var2) && !Double.isInfinite(var4) && !Double.isInfinite(var6)) {
         rRW var8 = new rRW((gm_3)this.case_.class_[56], null, var2, var4, var6, var1.private_(), var1.implements_());
         var8.class_(true);
         ((cb_3)this.case_.class_[57]).byte_(((cb_3)this.case_.class_[57]).rv().break_((double)var1.break_(), (double)var1.byte_(), (double)var1.protected_()));
      } else {
         rrfZ_2.class_();
      }
   }

   @Override
   public void class_(rvQ_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = var1.class_(this.catch_);
      if (var2 != null) {
         if (var1.break_() == 21) {
            this.case_.c().class_((NQ)(new Nk_1((rEI)var2)));
         } else if (var1.break_() == 35) {
            ((Cy_1)this.case_.class_[12]).class_(var2, rLQ.S, 30);
            this.catch_.class_(var2.rx(), var2.re(), var2.BO(), rqn_3.dM, var2.Pr(), 1.0F, 1.0F, false);
            if (var2 == (cb_3)this.case_.class_[57] && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().h().super_()) {
               ((Hh_1)this.case_.class_[16]).class_(class_((cb_3)this.case_.class_[57]));
            }
         } else {
            var2.class_(var1.break_());
         }
      }
   }

   @Override
   public void class_(rFn_1 var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((cb_3)this.case_.class_[57]).byte_(var1.break_());
      ((cb_3)this.case_.class_[57]).sk().class_(var1.byte_());
      ((cb_3)this.case_.class_[57]).sk().break_(var1.protected_());
   }

   @Override
   public void class_(rFG var1) {
      ruZ_2.class_(var1, this, this.case_);
      ((cb_3)this.case_.class_[57]).class_(var1.break_(), var1.byte_(), var1.protected_());
   }

   @Override
   public void class_(rFP var1) {
      ruZ_2.class_(var1, this, this.case_);
      rqM_2 var2 = var1.byte_();
      rRJ var3 = var1.break_();
      cb_3 var4 = (cb_3)this.case_.class_[57];
      int var5 = var4.V();
      this.implements_ = false;
      if (var2 != ((rYB)var4.throws_[7]).E()) {
         rns_3 var6 = this.catch_.package_();
         boolean var7 = var1.catch_();
         boolean var8 = var1.private_();
         gv_3 var9 = new gv_3(this.private_.extends_(), this.private_.implements_(), var8);
         this.private_ = var9;
         this.catch_ = new gm_3(this, var9, var2, var3, this.package_, (yX_2)this.case_.class_[8], var7, var1.protected_());
         this.catch_.class_(var6);
         this.case_.class_(this.catch_);
         this.case_.break_(new Zb_1());
      }

      this.catch_.private_();
      String var19 = var4.short_();
      Object var14 = null;
      this.case_.class_[62] = var14;
      cb_3 var20 = ((Ax_1)this.case_.class_[55]).class_(this.catch_, var4.abstract_(), var4.Z(), var4.h(), var4.PF());
      var20.implements_(var5);
      this.case_.class_[57] = var20;
      if (var2 != ((rYB)var4.throws_[7]).E()) {
         this.case_.N().break_();
      }

      this.case_.class_[62] = var20;
      var20.BQ().class_(var4.BQ().byte_());
      if (var1.implements_()) {
         var20.BT().class_(var4.BT());
      }

      var20.Bc();
      var20.byte_(var19);
      this.catch_.class_(var5, (cG_2)var20);
      Float var17 = -180.0F;
      var20.throws_[15] = var17;
      rqP_2 var18 = new rqP_2((Qw_1)this.case_.class_[20]);
      var20.break_[17] = var18;
      ((Ax_1)this.case_.class_[55]).class_(var20);
      var20.synchronized_(var4.sW());
      var20.throws_(var4.d());
      if ((vm_3)this.case_.class_[73] instanceof ZS) {
         this.case_.break_(null);
      }

      ((Ax_1)this.case_.class_[55]).break_(var1.throws_());
      ((Ax_1)this.case_.class_[55]).class_(var1.case_());
   }

   @Override
   public void class_(rvS_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      Object var2 = null;
      cb_3 var3 = (cb_3)this.case_.class_[57];
      if (var1.break_() == 0) {
         var2 = (rJT)var3.implements_[3];
      } else if (var1.break_() == ((rJr_1)var3.implements_[4]).case_) {
         var2 = (rJr_1)var3.implements_[4];
      }

      if (var2 != null && !var1.protected_()) {
         this.class_(new rmg_3(var1.break_(), var1.byte_(), true));
      }
   }

   @Override
   public void class_(rFT var1) {
      ruZ_2.class_(var1, this, this.case_);
      cb_3 var2 = (cb_3)this.case_.class_[57];
      if (var1.break_() == 0) {
         ((rJT)var2.implements_[3]).class_(var1.byte_());
      } else if (var1.break_() == ((rJr_1)var2.implements_[4]).case_) {
         ((rJr_1)var2.implements_[4]).class_(var1.byte_());
      }
   }

   @Override
   public void class_(rFM var1) {
      ruZ_2.class_(var1, this, this.case_);
      cb_3 var2 = (cb_3)this.case_.class_[57];
      rdn_3 var3 = var1.protected_();
      int var4 = var1.byte_();
      if (var1.break_() == -1) {
         if (!((vm_3)this.case_.class_[73] instanceof Fv_1)) {
            ((rhz_3)var2.implements_[1]).private_(var3);
         }
      } else if (var1.break_() == -2) {
         ((rhz_3)var2.implements_[1]).break_(var4, var3);
      } else {
         boolean var5 = false;
         vm_3 var7 = (vm_3)this.case_.class_[73];
         if (var7 instanceof Fv_1 var6) {
            var5 = var6.interface_() != rdX_2.final_.class_();
         }

         if (var1.break_() == 0 && var1.byte_() >= 36 && var4 < 45) {
            if (!var3.class_()) {
               rdn_3 var8 = ((rJT)var2.implements_[3]).class_(var4).class_();
               if (var8.class_() || var8.char_() < var3.char_()) {
                  var3.protected_(5);
               }
            }

            ((rJT)var2.implements_[3]).class_(var4, var3);
         } else if (var1.break_() == ((rJr_1)var2.implements_[4]).case_ && (var1.break_() != 0 || !var5)) {
            ((rJr_1)var2.implements_[4]).class_(var4, var3);
         }
      }
   }

   private static rdn_3 class_(rhd_3 var0) {
      for (rpm_3 var4 : rpm_3.values()) {
         rdn_3 var5 = var0.protected_(var4);
         if (var5.break_() == rdy_3.kL) {
            return var5;
         }
      }

      return new rdn_3(rdy_3.kL);
   }

   @Override
   public void class_(rvA_2 var1) {
      ruZ_2.class_(var1, this, this.case_);
      an_3 var2 = this.catch_.break_(var1.break_());
      if (var2 instanceof is_3) {
         ((is_3)var2).super_(var1.byte_());
      }
   }

   @Override
   public void class_(rvp_3 var1) {
      ruZ_2.class_(var1, this, this.case_);
      cg_3.class_(var1.byte_(), this.case_, var1.break_(), var1.protected_());
   }

   public void break_(ruS_2<?> var1) {
      this.byte_.break_(var1);
   }

   public AX break_() {
      return this.native_;
   }

   private boolean break_(String var1) {
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
         this.class_(rZN.FAILED_DOWNLOAD);
         return false;
      }
   }

   public Collection<Aw_1> throws_() {
      return this.finally_.values();
   }

   public gm_3 finally_() {
      return this.catch_;
   }

   public GameProfile catch_() {
      return this.protected_;
   }

   public rlQ_2 extends_() {
      return this.volatile_;
   }

   public Collection<UUID> case_() {
      return this.finally_.keySet();
   }

   public CommandDispatcher<gR_2> implements_() {
      return this.new_;
   }

   public rVm_1 package_() {
      return this.else_;
   }

   public rWB protected_() {
      return this.continue_;
   }

   public Ab_1 private_() {
      return this.extends_;
   }

   public Set<rqM_2<rYB>> final_() {
      return this.this_;
   }

   public UUID volatile_() {
      return this.super_;
   }

   public gG_2 native_() {
      return this.final_;
   }
}
