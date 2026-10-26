package celestial;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import it.unimi.dsi.fastutil.ints.Int2ShortMap;
import it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rmy_3 implements rmH_2 {
   private static final Logger byte_ = LogManager.getLogger();
   public final rud_3 class_;
   private final rnW_2 protected_;
   public rhN_2 break_;
   private int throws_;
   private long case_;
   private boolean catch_;
   private long private_;
   private int implements_;
   private int finally_;
   private final Int2ShortMap extends_ = new Int2ShortOpenHashMap();
   private double native_;
   private double volatile_;
   private double final_;
   private double package_;
   private double int_;
   private double new_;
   private an_3 continue_;
   private double super_;
   private double this_;
   private double else_;
   private double synchronized_;
   private double return_;
   private double public_;
   private rjU_2 goto_;
   private int while_;
   private int try_;
   private boolean instanceof_;
   private int throw_;
   private boolean interface_;
   private int char_;
   private int abstract_;
   private int long_;

   public void byte_() {
      this.native_ = this.break_.rx();
      this.volatile_ = this.break_.re();
      this.final_ = this.break_.BO();
      this.package_ = this.break_.rx();
      this.int_ = this.break_.re();
      this.new_ = this.break_.BO();
   }

   public rmy_3(rnW_2 var1, rud_3 var2, rhN_2 var3) {
      this.protected_ = var1;
      this.class_ = var2;
      var2.class_(this);
      this.break_ = var3;
      var3.class_ = this;
      rgV_2 var4 = var3.O();
      if (var4 != null) {
         var4.class_();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void class_(rmI_2 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.public_();
      rmf_3 var2 = var1.break_();
      switch (var2) {
         case PERFORM_RESPAWN:
            if (this.break_.volatile_) {
               this.break_.volatile_ = false;
               this.break_ = this.protected_.x().class_(this.break_, true);
               Oo_1.synchronized_.class_(this.break_, rYB.throws_, rYB.byte_);
            } else {
               if (this.break_.Ss() > 0.0F) {
                  return;
               }

               this.break_ = this.protected_.x().class_(this.break_, false);
               if (this.protected_.int_()) {
                  this.break_.class_(rRl_1.SPECTATOR);
                  this.break_.continue_().B().class_(rRu_1.int_).class_(false, this.protected_);
               }
            }
            break;
         case REQUEST_STATS:
            this.break_.long_().class_(this.break_);
      }
   }

   @Override
   public void class_(rZq_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      rrEm_1 var2 = this.break_.continue_();
      an_3 var3 = var1.class_(var2);
      this.break_.public_();
      this.break_.volatile_(var1.case_());
      if (var3 != null) {
         double var4 = 36.0;
         if (this.break_.int_(var3) < 36.0) {
            rpm_3 var6 = var1.protected_();
            rdn_3 var7 = var6 != null ? this.break_.protected_(var6).implements_() : rdn_3.break_;
            Optional var8 = Optional.empty();
            if (var1.break_() == rZT.INTERACT) {
               var8 = Optional.of(this.break_.class_(var3, var6));
            } else if (var1.break_() == rZT.INTERACT_AT) {
               var8 = Optional.of(var3.class_(this.break_, var1.throws_(), var6));
            } else if (var1.break_() == rZT.ATTACK) {
               if (var3 instanceof rsE_2 || var3 instanceof rsP_2 || var3 instanceof rhm_3 || var3 == this.break_) {
                  this.class_(new rgn_3("multiplayer.disconnect.invalid_entity_attacked"));
                  byte_.warn("Player {} tried to attack an invalid entity", this.break_.g().getString());
                  return;
               }

               this.break_.throw_(var3);
            }

            if (var8.isPresent() && ((ryZ_2)var8.get()).class_()) {
               Oo_1.boolean_.class_(this.break_, var7, var3);
               if (((ryZ_2)var8.get()).break_()) {
                  this.break_.class_(var6, true);
               }
            }
         }
      }
   }

   @Override
   public void class_(rmD_2 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.public_();
      switch (var1.break_()) {
         case PRESS_SHIFT_KEY:
            this.break_.volatile_(true);
            break;
         case RELEASE_SHIFT_KEY:
            this.break_.volatile_(false);
            break;
         case START_SPRINTING:
            this.break_.c_(true);
            break;
         case STOP_SPRINTING:
            this.break_.c_(false);
            break;
         case STOP_SLEEPING:
            if (this.break_.Sc()) {
               this.break_.class_(false, true);
               this.goto_ = this.break_.Ps();
            }
            break;
         case START_RIDING_JUMP:
            if (this.break_.ra() instanceof aD_2) {
               aD_2 var4 = (aD_2)this.break_.ra();
               int var3 = var1.byte_();
               if (var4.throws_() && var3 > 0) {
                  var4.break_(var3);
               }
            }
            break;
         case STOP_RIDING_JUMP:
            if (this.break_.ra() instanceof aD_2) {
               aD_2 var2 = (aD_2)this.break_.ra();
               var2.case_();
            }
            break;
         case OPEN_INVENTORY:
            if (this.break_.ra() instanceof rOD) {
               ((rOD)this.break_.ra()).case_(this.break_);
            }
            break;
         case START_FALL_FLYING:
            if (!this.break_.sw()) {
               this.break_.sx();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   @Override
   public void class_(rmq_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.public_();
      this.break_.class_(var1.break_());
   }

   private void class_(String var1) {
      if (this.break_.else_() == rhJ_2.HIDDEN) {
         this.class_(new rZK(new rgn_3("chat.cannotSend").class_(rgF_2.RED), rVU.SYSTEM, rqR_2.break_));
      } else {
         this.break_.public_();

         for (int var2 = 0; var2 < var1.length(); var2++) {
            if (!rqu_3.class_(var1.charAt(var2))) {
               this.class_(new rgn_3("multiplayer.disconnect.illegal_characters"));
               return;
            }
         }

         if (var1.startsWith("/")) {
            this.break_(var1);
         } else {
            rgn_3 var3 = new rgn_3("chat.type.text", this.break_.L_(), var1);
            this.protected_.x().class_(var3, rVU.CHAT, this.break_.ro());
         }

         this.implements_ += 20;
         if (this.implements_ > 200 && !this.protected_.x().case_(this.break_.sv())) {
            this.class_(new rgn_3("disconnect.spam"));
         }
      }
   }

   @Override
   public void class_(rmK_2 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.public_();
      if (((rJr_1)this.break_.implements_[4]).case_ == var1.break_() && ((rJr_1)this.break_.implements_[4]).byte_(this.break_) && !this.break_.native_()) {
         ((rJr_1)this.break_.implements_[4]).break_(this.break_, var1.byte_());
         ((rJr_1)this.break_.implements_[4]).native_();
      }
   }

   @Override
   public void class_(rZE var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.public_();
      if (!this.break_.native_()
         && ((rJr_1)this.break_.implements_[4]).case_ == var1.break_()
         && ((rJr_1)this.break_.implements_[4]).byte_(this.break_)
         && (rJr_1)this.break_.implements_[4] instanceof rJI) {
         this.protected_
            .V()
            .class_(var1.byte_())
            .ifPresent(var2 -> ((rJI)((rJr_1)this.break_.implements_[4])).class_(var1.protected_(), (rkw_3<?>)var2, this.break_));
      }
   }

   @Override
   public void class_(rmt_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.public_();
      if (((rJr_1)this.break_.implements_[4]).case_ == var1.break_() && ((rJr_1)this.break_.implements_[4]).byte_(this.break_)) {
         if (this.break_.native_()) {
            rqs_3 var2 = rqs_3.class_();

            for (int var3 = 0; var3 < ((rJr_1)this.break_.implements_[4]).throws_.size(); var3++) {
               var2.add(((rJr_1)this.break_.implements_[4]).throws_.get(var3).class_());
            }

            this.break_.class_((rJr_1)this.break_.implements_[4], var2);
         } else {
            rdn_3 var6 = ((rJr_1)this.break_.implements_[4]).class_(var1.byte_(), var1.protected_(), var1.catch_(), this.break_);
            if (rdn_3.break_(var1.case_(), var6)) {
               this.break_.class_.class_(new rvS_2(var1.break_(), var1.throws_(), true));
               this.break_.extends_ = true;
               ((rJr_1)this.break_.implements_[4]).native_();
               this.break_.private_();
               this.break_.extends_ = false;
            } else {
               this.extends_.put(((rJr_1)this.break_.implements_[4]).case_, var1.throws_());
               this.break_.class_.class_(new rvS_2(var1.break_(), var1.throws_(), false));
               ((rJr_1)this.break_.implements_[4]).break_(this.break_, false);
               rqs_3 var7 = rqs_3.class_();

               for (int var4 = 0; var4 < ((rJr_1)this.break_.implements_[4]).throws_.size(); var4++) {
                  rdn_3 var5 = ((rJr_1)this.break_.implements_[4]).throws_.get(var4).class_();
                  var7.add(var5.class_() ? rdn_3.break_ : var5);
               }

               this.break_.class_((rJr_1)this.break_.implements_[4], var7);
            }
         }
      }
   }

   @Override
   public void class_(rmj_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.final_();
   }

   @Override
   public void class_(rgP_2 var1, rgP_2 var2) {
      byte_.info("{} lost connection: {}", this.break_.g().getString(), var2.getString());
      this.protected_.A();
      this.protected_.x().class_(new rgn_3("multiplayer.player.left", this.break_.L_()).class_(rgF_2.YELLOW), rVU.SYSTEM, rqR_2.break_);
      this.break_.package_();
      this.protected_.x().byte_(this.break_);
      rgV_2 var3 = this.break_.O();
      if (var3 != null) {
         var3.break_();
      }

      if (this.protected_()) {
         byte_.info("Stopping singleplayer server as player logged out");
         this.protected_.class_(false);
      }
   }

   @Override
   public void class_(rZF var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      an_3 var2 = this.break_.ra();
      if (var2 instanceof rSK) {
         ((rSK)var2).class_(var1.break_(), var1.byte_());
      }
   }

   @Override
   public void class_(rZQ var1) {
   }

   @Override
   public void class_(rZd_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      rrEm_1 var2 = this.break_.continue_();
      rpm_3 var3 = var1.break_();
      rdn_3 var4 = this.break_.protected_(var3);
      this.break_.public_();
      if (!var4.class_()) {
         ryZ_2 var5 = this.break_.finally_.class_(this.break_, var2, var4, var3);
         if (var5.break_()) {
            this.break_.class_(var3, true);
         }
      }
   }

   @Override
   public void class_(rZx_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      rrEm_1 var2 = this.break_.continue_();
      rpm_3 var3 = var1.break_();
      rdn_3 var4 = this.break_.protected_(var3);
      rff_3 var5 = var1.byte_();
      rfH_2 var6 = var5.class_();
      rpr_3 var7 = var5.break_();
      this.break_.public_();
      if (var6.c_() < this.protected_.X()) {
         if (this.goto_ == null
            && this.break_.class_((double)var6.b_() + 0.5, (double)var6.c_() + 0.5, (double)var6.d_() + 0.5) < 64.0
            && var2.class_(this.break_, var6)) {
            ryZ_2 var8 = this.break_.finally_.class_(this.break_, var2, var4, var3, var5);
            if (var7 == rpr_3.UP && !var8.class_() && var6.c_() >= this.protected_.X() - 1 && class_(this.break_, var4)) {
               rVi_1 var9 = new rgn_3("build.tooHigh", this.protected_.X()).class_(rgF_2.RED);
               this.break_.class_.class_(new rZK(var9, rVU.GAME_INFO, rqR_2.break_));
            } else if (var8.break_()) {
               this.break_.class_(var3, true);
            }
         }
      } else {
         rVi_1 var10 = new rgn_3("build.tooHigh", this.protected_.X()).class_(rgF_2.RED);
         this.break_.class_.class_(new rZK(var10, rVU.GAME_INFO, rqR_2.break_));
      }

      this.break_.class_.class_(new rZR(var2, var6));
      this.break_.class_.class_(new rZR(var2, var6.break_(var7)));
   }

   @Override
   public void class_(rmT_2 var1) {
      String var2 = StringUtils.normalizeSpace(var1.break_());
      if (var2.startsWith("/")) {
         ruZ_2.class_(var1, this, this.break_.continue_());
         this.class_(var2);
      } else {
         this.class_(var2, this::class_);
      }
   }

   @Override
   public void class_(rme_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (var1.break_() >= 0 && var1.break_() < rhz_3.protected_()) {
         if (((rhz_3)this.break_.implements_[1]).protected_ != var1.break_() && this.break_.P() == rpm_3.MAIN_HAND) {
            this.break_.throw_();
         }

         ((rhz_3)this.break_.implements_[1]).protected_ = var1.break_();
         this.break_.public_();
      } else {
         byte_.warn("{} tried to set an invalid carried item", this.break_.g().getString());
      }
   }

   public void class_(ruS_2<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      if (var1 instanceof rZK var3) {
         rhJ_2 var4 = this.break_.else_();
         if (var4 == rhJ_2.HIDDEN && var3.protected_() != rVU.GAME_INFO) {
            return;
         }

         if (var4 == rhJ_2.SYSTEM && !var3.byte_()) {
            return;
         }
      }

      try {
         this.class_.class_(var1, var2);
      } catch (Throwable var6) {
         KY var7 = KY.class_(var6, "Sending packet");
         Ko_1 var5 = var7.class_("Packet being sent");
         var5.class_("Packet class", () -> var1.getClass().getCanonicalName());
         throw new KU(var7);
      }
   }

   public void class_(ruS_2<?> var1) {
      this.class_(var1, (GenericFutureListener<? extends Future<? super Void>>)null);
   }

   @Override
   public void class_(rZP var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.catch_(2) || this.protected_()) {
         this.protected_.break_(var1.break_());
      }
   }

   @Override
   public void class_(rZv_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.native_()) {
         for (rrEm_1 var3 : this.protected_.float_()) {
            an_3 var4 = var1.class_(var3);
            if (var4 != null) {
               this.break_.class_(var3, var4.rx(), var4.re(), var4.BO(), (Float)var4.throws_[15], (Float)var4.throws_[16]);
               return;
            }
         }
      }
   }

   @Override
   public void class_(rZr_1 var1) {
      if (this.catch_ && var1.break_() == this.private_) {
         int var2 = (int)(rqR_2.break_() - this.case_);
         this.break_.native_ = (this.break_.native_ * 3 + var2) / 4;
         this.catch_ = false;
      } else if (!this.protected_()) {
         this.class_(new rgn_3("disconnect.timeout"));
      }
   }

   private void class_(rZy_1 var1, List<String> var2) {
      this.break_.public_();
      rrEm_1 var3 = this.break_.continue_();
      rfH_2 var4 = var1.break_();
      if (var3.int_(var4)) {
         xc_3 var5 = var3.byte_(var4);
         if (!(var3.class_(var4) instanceof ryS_2 var7)) {
            return;
         }

         if (!var7.throws_() || var7.catch_() != this.break_) {
            byte_.warn("Player {} just tried to change non-editable sign", this.break_.g().getString());
            return;
         }

         for (int var8 = 0; var8 < var2.size(); var8++) {
            var7.class_(var8, new rgN_2((String)var2.get(var8)));
         }

         var7.break_();
         var3.class_(var4, var5, var5, 3);
      }
   }

   @Override
   public void class_(rZy_1 var1) {
      List var2 = Stream.of(var1.byte_()).map(rgF_2::class_).collect(Collectors.toList());
      this.class_(var2, var2x -> this.class_(var1, var2x));
   }

   @Override
   public void class_(rmg_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      int var2 = ((rJr_1)this.break_.implements_[4]).case_;
      if (var2 == var1.break_()
         && this.extends_.getOrDefault(var2, (short)(var1.byte_() + 1)) == var1.byte_()
         && !((rJr_1)this.break_.implements_[4]).byte_(this.break_)
         && !this.break_.native_()) {
         ((rJr_1)this.break_.implements_[4]).break_(this.break_, true);
      }
   }

   @Override
   public void class_(rmR_2 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.finally_.throws_()) {
         boolean var2 = var1.break_() < 0;
         rdn_3 var3 = var1.byte_();
         rcd_3 var4 = var3.break_("BlockEntityTag");
         if (!var3.class_() && var4 != null && var4.throws_("x") && var4.throws_("y") && var4.throws_("z")) {
            rfH_2 var5 = new rfH_2(var4.private_("x"), var4.private_("y"), var4.private_("z"));
            ryO_2 var6 = ((rYB)this.break_.throws_[7]).class_(var5);
            if (var6 != null) {
               rcd_3 var7 = var6.class_(new rcd_3());
               var7.continue_("x");
               var7.continue_("y");
               var7.continue_("z");
               var3.class_("BlockEntityTag", var7);
            }
         }

         boolean var8 = var1.break_() >= 1 && var1.break_() <= 45;
         boolean var9 = var3.class_() || var3.catch_() >= 0 && var3.char_() <= 64 && !var3.class_();
         if (var8 && var9) {
            if (var3.class_()) {
               ((rJT)this.break_.implements_[3]).class_(var1.break_(), rdn_3.break_);
            } else {
               ((rJT)this.break_.implements_[3]).class_(var1.break_(), var3);
            }

            ((rJT)this.break_.implements_[3]).break_(this.break_, true);
            ((rJT)this.break_.implements_[3]).native_();
         } else if (var2 && var9 && this.finally_ < 200) {
            this.finally_ += 20;
            this.break_.class_(var3, true);
         }
      }
   }

   @Override
   public void class_(rZZ var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.catch_(2) || this.protected_()) {
         this.protected_.class_(var1.break_(), false);
      }
   }

   @Override
   public void class_(rmY_2 var1) {
   }

   @Override
   public void class_(rmw_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.class_(var1);
   }

   @Override
   public void class_(rZG var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      ((rhx_3)this.break_.implements_[18]).break_ = var1.break_() && ((rhx_3)this.break_.implements_[18]).byte_;
   }

   @Override
   public void class_(rZn_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (!this.protected_.O()) {
         this.break_.class_(new rgn_3("advMode.notEnabled"), rqR_2.break_);
      } else if (!this.break_.sU()) {
         this.break_.class_(new rgn_3("advMode.notAllowed"), rqR_2.break_);
      } else {
         rHm_1 var2 = null;
         rHZ var3 = null;
         rfH_2 var4 = var1.break_();
         ryO_2 var5 = ((rYB)this.break_.throws_[7]).class_(var4);
         if (var5 instanceof rHZ) {
            var3 = (rHZ)var5;
            var2 = var3.throws_();
         }

         String var6 = var1.byte_();
         boolean var7 = var1.protected_();
         if (var2 != null) {
            rHF var8 = var3.final_();
            rpr_3 var9 = ((rYB)this.break_.throws_[7]).byte_(var4).byte_(xK_2.volatile_);
            switch (var1.catch_()) {
               case SEQUENCE:
                  xc_3 var10 = xu_3.bf.continue_();
                  ((rYB)this.break_.throws_[7]).class_(var4, var10.class_(xK_2.volatile_, var9).class_(xK_2.final_, Boolean.valueOf(var1.throws_())), 2);
                  break;
               case AUTO:
                  xc_3 var11 = xu_3.bI.continue_();
                  ((rYB)this.break_.throws_[7]).class_(var4, var11.class_(xK_2.volatile_, var9).class_(xK_2.final_, Boolean.valueOf(var1.throws_())), 2);
                  break;
               case REDSTONE:
               default:
                  xc_3 var12 = xu_3.SZ.continue_();
                  ((rYB)this.break_.throws_[7]).class_(var4, var12.class_(xK_2.volatile_, var9).class_(xK_2.final_, Boolean.valueOf(var1.throws_())), 2);
            }

            var5.int_();
            ((rYB)this.break_.throws_[7]).class_(var4, var5);
            var2.class_(var6);
            var2.class_(var7);
            if (!var7) {
               var2.break_((rgP_2)null);
            }

            var3.break_(var1.case_());
            if (var8 != var1.catch_()) {
               var3.finally_();
            }

            var2.break_();
            if (!rql_3.break_(var6)) {
               this.break_.class_(new rgn_3("advMode.setCommand.success", var6), rqR_2.break_);
            }
         }
      }
   }

   @Override
   public void class_(rZL var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      StringReader var2 = new StringReader(var1.byte_());
      if (var2.canRead() && var2.peek() == '/') {
         var2.skip();
      }

      ParseResults var3 = this.protected_.f().class_().parse(var2, this.break_.PL());
      this.protected_.f().class_().getCompletionSuggestions(var3).thenAccept(var2x -> this.class_.class_(new rFQ(var1.break_(), var2x)));
   }

   @Override
   public void class_(rZc_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (var1.byte_() == rZu_1.OPENED_TAB) {
         rqO_2 var2 = var1.protected_();
         OT var3 = this.protected_.t().class_(var2);
         if (var3 != null) {
            this.break_.r().class_(var3);
         }
      }
   }

   @Override
   public void class_(rZH var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.float_().class_(var1.break_(), var1.byte_(), var1.protected_());
   }

   @Override
   public void class_(rZB var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.protected_.V().class_(var1.break_()).ifPresent(this.break_.float_()::throws_);
   }

   @Override
   public void class_(rZA var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if ((rJr_1)this.break_.implements_[4] instanceof rXT) {
         ((rXT)((rJr_1)this.break_.implements_[4])).break_(var1.break_(), var1.byte_());
      }
   }

   @Override
   public void class_(rZz_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if ((rJr_1)this.break_.implements_[4] instanceof rJf_1 var2) {
         String var3 = rqu_3.class_(var1.break_());
         if (var3.length() <= 35) {
            var2.class_(var3);
         }
      }
   }

   @Override
   public void class_(rZs_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      ((rhz_3)this.break_.implements_[1]).class_(var1.break_());
      this.break_
         .class_
         .class_(
            new rFM(
               -2, ((rhz_3)this.break_.implements_[1]).protected_, ((rhz_3)this.break_.implements_[1]).extends_(((rhz_3)this.break_.implements_[1]).protected_)
            )
         );
      this.break_.class_.class_(new rFM(-2, var1.break_(), ((rhz_3)this.break_.implements_[1]).extends_(var1.break_())));
      this.break_.class_.class_(new rvm_3(((rhz_3)this.break_.implements_[1]).protected_));
   }

   @Override
   public void class_(rZl_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (!this.protected_.O()) {
         this.break_.class_(new rgn_3("advMode.notEnabled"), rqR_2.break_);
      } else if (!this.break_.sU()) {
         this.break_.class_(new rgn_3("advMode.notAllowed"), rqR_2.break_);
      } else {
         rHm_1 var2 = var1.class_((rYB)this.break_.throws_[7]);
         if (var2 != null) {
            var2.class_(var1.break_());
            var2.class_(var1.byte_());
            if (!var1.byte_()) {
               var2.break_((rgP_2)null);
            }

            var2.break_();
            this.break_.class_(new rgn_3("advMode.setCommand.success", var1.break_()), rqR_2.break_);
         }
      }
   }

   private void class_(List<String> var1, Consumer<List<String>> var2) {
      this.class_(var1, var2, rgV_2::class_);
   }

   private void class_(String var1, Consumer<String> var2) {
      this.class_(var1, var2, rgV_2::class_);
   }

   private <T> void class_(T var1, Consumer<T> var2, BiFunction<rgV_2, T, CompletableFuture<Optional<T>>> var3) {
      rnW_2 var4 = this.break_.continue_().const_();
      Consumer var5 = var2x -> {
         if (this.class_().case_()) {
            var2.accept(var2x);
         } else {
            byte_.debug("Ignoring packet due to disconnection");
         }
      };
      rgV_2 var6 = this.break_.O();
      if (var6 != null) {
         ((CompletableFuture)var3.apply(var6, var1)).thenAcceptAsync(var1x -> var1x.ifPresent(var5), var4);
      } else {
         var4.execute(() -> var5.accept(var1));
      }
   }

   public void class_(rgP_2 var1) {
      this.class_.class_(new rvb_3(var1), var2 -> this.class_.class_(var1));
      this.class_.extends_();
      this.protected_.catch_(this.class_::native_);
   }

   @Override
   public rud_3 class_() {
      return this.class_;
   }

   @Override
   public void class_(rmV_2 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (var1.break_() == this.while_) {
         this.break_.break_(this.goto_.break_, this.goto_.byte_, this.goto_.protected_, (Float)this.break_.throws_[15], (Float)this.break_.throws_[16]);
         this.package_ = this.goto_.break_;
         this.int_ = this.goto_.byte_;
         this.new_ = this.goto_.protected_;
         if (this.break_.for_()) {
            this.break_.double_();
         }

         this.goto_ = null;
      }
   }

   private boolean class_(an_3 var1) {
      return ((rYB)var1.throws_[7]).class_(var1.rN().class_(0.0625).break_(0.0, -0.55, 0.0)).allMatch(JC::catch_);
   }

   @Override
   public void class_(rZS var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (break_(var1)) {
         this.class_(new rgn_3("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         an_3 var2 = this.break_.PO();
         if (var2 != this.break_ && var2.rU() == this.break_ && var2 == this.continue_) {
            rrEm_1 var3 = this.break_.continue_();
            double var4 = var2.rx();
            double var6 = var2.re();
            double var8 = var2.BO();
            double var10 = var1.break_();
            double var12 = var1.byte_();
            double var14 = var1.protected_();
            float var16 = var1.throws_();
            float var17 = var1.case_();
            double var18 = var10 - this.super_;
            double var20 = var12 - this.this_;
            double var22 = var14 - this.else_;
            double var24 = var2.rv().catch_();
            double var26 = var18 * var18 + var20 * var20 + var22 * var22;
            if (var26 - var24 > 100.0 && !this.protected_()) {
               byte_.warn("{} (vehicle of {}) moved too quickly! {},{},{}", var2.g().getString(), this.break_.g().getString(), var18, var20, var22);
               this.class_.class_(new rvn_3(var2));
               return;
            }

            boolean var28 = var3.a_(var2, var2.rN().break_(0.0625));
            var18 = var10 - this.synchronized_;
            var20 = var12 - this.return_ - 1.0E-6;
            var22 = var14 - this.public_;
            var2.class_(iG_2.PLAYER, new rjU_2(var18, var20, var22));
            var18 = var10 - var2.rx();
            var20 = var12 - var2.re();
            if (var20 > -0.5 || var20 < 0.5) {
               var20 = 0.0;
            }

            var22 = var14 - var2.BO();
            var26 = var18 * var18 + var20 * var20 + var22 * var22;
            boolean var29 = false;
            if (var26 > 0.0625) {
               var29 = true;
               byte_.warn("{} (vehicle of {}) moved wrongly! {}", var2.g().getString(), this.break_.g().getString(), Math.sqrt(var26));
            }

            var2.break_(var10, var12, var14, var16, var17);
            boolean var30 = var3.a_(var2, var2.rN().break_(0.0625));
            if (var28 && (var29 || !var30)) {
               var2.break_(var4, var6, var8, var16, var17);
               this.class_.class_(new rvn_3(var2));
               return;
            }

            this.break_.continue_().else_().class_(this.break_);
            this.break_.continue_(this.break_.rx() - var4, this.break_.re() - var6, this.break_.BO() - var8);
            this.interface_ = var20 >= -0.03125 && !this.protected_.M() && this.class_(var2);
            this.synchronized_ = var2.rx();
            this.return_ = var2.re();
            this.public_ = var2.BO();
         }
      }
   }

   @Override
   public void class_(rma_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      this.break_.class_(var1.break_(), var1.byte_(), var1.protected_(), var1.throws_());
   }

   private static boolean class_(rhN_2 var0, rdn_3 var1) {
      if (var1.class_()) {
         return false;
      } else {
         rdb_3 var2 = var1.break_();
         return (var2 instanceof rxJ_2 || var2 instanceof rxN_2) && !var0.sK().class_(var2);
      }
   }

   @Override
   public void class_(rZO var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (break_(var1)) {
         this.class_(new rgn_3("multiplayer.disconnect.invalid_player_movement"));
      } else {
         rrEm_1 var2 = this.break_.continue_();
         if (!this.break_.volatile_) {
            if (this.throws_ == 0) {
               this.byte_();
            }

            if (this.goto_ != null) {
               if (this.throws_ - this.try_ > 20) {
                  this.try_ = this.throws_;
                  this.class_(this.goto_.break_, this.goto_.byte_, this.goto_.protected_, (Float)this.break_.throws_[15], (Float)this.break_.throws_[16]);
               }
            } else {
               this.try_ = this.throws_;
               if (this.break_.Pm()) {
                  this.break_
                     .break_(
                        this.break_.rx(),
                        this.break_.re(),
                        this.break_.BO(),
                        var1.class_((Float)this.break_.throws_[15]),
                        var1.break_((Float)this.break_.throws_[16])
                     );
                  this.break_.continue_().else_().class_(this.break_);
               } else {
                  double var3 = this.break_.rx();
                  double var5 = this.break_.re();
                  double var7 = this.break_.BO();
                  double var9 = this.break_.re();
                  double var11 = var1.class_(this.break_.rx());
                  double var13 = var1.break_(this.break_.re());
                  double var15 = var1.byte_(this.break_.BO());
                  float var17 = var1.class_((Float)this.break_.throws_[15]);
                  float var18 = var1.break_((Float)this.break_.throws_[16]);
                  double var19 = var11 - this.native_;
                  double var21 = var13 - this.volatile_;
                  double var23 = var15 - this.final_;
                  double var25 = this.break_.rv().catch_();
                  double var27 = var19 * var19 + var21 * var21 + var23 * var23;
                  if (this.break_.Sc()) {
                     if (var27 > 1.0) {
                        this.class_(
                           this.break_.rx(),
                           this.break_.re(),
                           this.break_.BO(),
                           var1.class_((Float)this.break_.throws_[15]),
                           var1.break_((Float)this.break_.throws_[16])
                        );
                     }
                  } else {
                     this.abstract_++;
                     int var29 = this.abstract_ - this.long_;
                     if (var29 > 5) {
                        byte_.debug("{} is sending move packets too frequently ({} packets since last tick)", this.break_.g().getString(), var29);
                        var29 = 1;
                     }

                     if (!this.break_.for_() && (!this.break_.continue_().B().break_(rRu_1.continue_) || !this.break_.Sy())) {
                        float var30 = this.break_.Sy() ? 300.0F : 100.0F;
                        if (var27 - var25 > (double)(var30 * (float)var29) && !this.protected_()) {
                           byte_.warn("{} moved too quickly! {},{},{}", this.break_.g().getString(), var19, var21, var23);
                           this.class_(this.break_.rx(), this.break_.re(), this.break_.BO(), (Float)this.break_.throws_[15], (Float)this.break_.throws_[16]);
                           return;
                        }
                     }

                     rfl_3 var46 = this.break_.rN();
                     var19 = var11 - this.package_;
                     var21 = var13 - this.int_;
                     var23 = var15 - this.new_;
                     boolean var31 = var21 > 0.0;
                     if (this.break_.BL() && !var1.break_() && var31) {
                        this.break_.sl();
                     }

                     this.break_.class_(iG_2.PLAYER, new rjU_2(var19, var21, var23));
                     var19 = var11 - this.break_.rx();
                     var21 = var13 - this.break_.re();
                     if (var21 > -0.5 || var21 < 0.5) {
                        var21 = 0.0;
                     }

                     var23 = var15 - this.break_.BO();
                     var27 = var19 * var19 + var21 * var21 + var23 * var23;
                     boolean var32 = false;
                     if (!this.break_.for_()
                        && var27 > 0.0625
                        && !this.break_.Sc()
                        && !this.break_.finally_.throws_()
                        && this.break_.finally_.break_() != rRl_1.SPECTATOR) {
                        var32 = true;
                        byte_.warn("{} moved wrongly!", this.break_.g().getString());
                     }

                     this.break_.break_(var11, var13, var15, var17, var18);
                     boolean var33 = (Boolean)this.break_.throws_[38];
                     if (var33 || this.break_.Sc() || (!var32 || !var2.a_(this.break_, var46)) && !this.class_(var2, var46)) {
                        this.instanceof_ = var21 >= -0.03125
                           && this.break_.finally_.break_() != rRl_1.SPECTATOR
                           && !this.protected_.M()
                           && !((rhx_3)this.break_.implements_[18]).byte_
                           && !this.break_.break_(rLD.goto_)
                           && !this.break_.Sy()
                           && this.class_(this.break_);
                        this.break_.continue_().else_().class_(this.break_);
                        this.break_.class_(this.break_.re() - var9, var1.break_());
                        this.break_.int_(var1.break_());
                        if (var31) {
                           rhN_2 var10000 = this.break_;
                           Float var38 = 0.0F;
                           var10000.throws_[31] = var38;
                        }

                        this.break_.continue_(this.break_.rx() - var3, this.break_.re() - var5, this.break_.BO() - var7);
                        this.package_ = this.break_.rx();
                        this.int_ = this.break_.re();
                        this.new_ = this.break_.BO();
                     } else {
                        this.class_(var3, var5, var7, var17, var18);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void class_(rZW var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.catch_(2)) {
         ryO_2 var2 = this.break_.continue_().class_(var1.byte_());
         rcd_3 var3 = var2 != null ? var2.class_(new rcd_3()) : null;
         this.break_.class_.class_(new rve_3(var1.break_(), var3));
      }
   }

   @Override
   public void class_(rZk_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.catch_(2)) {
         an_3 var2 = this.break_.continue_().break_(var1.byte_());
         if (var2 != null) {
            rcd_3 var3 = var2.case_(new rcd_3());
            this.break_.class_.class_(new rve_3(var1.break_(), var3));
         }
      }
   }

   @Override
   public void class_(rZb_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      rfH_2 var2 = var1.break_();
      this.break_.public_();
      rZM var3 = var1.protected_();
      switch (var3) {
         case SWAP_ITEM_WITH_OFFHAND:
            if (!this.break_.native_()) {
               rdn_3 var4 = this.break_.protected_(rpm_3.OFF_HAND);
               this.break_.class_(rpm_3.OFF_HAND, this.break_.protected_(rpm_3.MAIN_HAND));
               this.break_.class_(rpm_3.MAIN_HAND, var4);
               this.break_.throw_();
            }

            return;
         case DROP_ITEM:
            if (!this.break_.native_()) {
               this.break_.protected_(false);
            }

            return;
         case DROP_ALL_ITEMS:
            if (!this.break_.native_()) {
               this.break_.protected_(true);
            }

            return;
         case RELEASE_USE_ITEM:
            this.break_.SC();
            return;
         case START_DESTROY_BLOCK:
         case ABORT_DESTROY_BLOCK:
         case STOP_DESTROY_BLOCK:
            this.break_.finally_.class_(var2, var3, var1.byte_(), this.protected_.X());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   public void class_(double var1, double var3, double var5, float var7, float var8, Set<rvU_2> var9) {
      double var10 = var9.contains(rvU_2.X) ? this.break_.rx() : 0.0;
      double var12 = var9.contains(rvU_2.Y) ? this.break_.re() : 0.0;
      double var14 = var9.contains(rvU_2.Z) ? this.break_.BO() : 0.0;
      float var16 = var9.contains(rvU_2.Y_ROT) ? (Float)this.break_.throws_[15] : 0.0F;
      float var17 = var9.contains(rvU_2.X_ROT) ? (Float)this.break_.throws_[16] : 0.0F;
      this.goto_ = new rjU_2(var1, var3, var5);
      if (++this.while_ == Integer.MAX_VALUE) {
         this.while_ = 0;
      }

      this.try_ = this.throws_;
      this.break_.break_(var1, var3, var5, var7, var8);
      this.break_.class_.class_(new rvD_2(var1 - var10, var3 - var12, var5 - var14, var7 - var16, var8 - var17, var9, this.while_));
   }

   public void class_(double var1, double var3, double var5, float var7, float var8) {
      this.class_(var1, var3, var5, var7, var8, Collections.emptySet());
   }

   private boolean class_(rRR var1, rfl_3 var2) {
      Stream var3 = var1.byte_(this.break_, this.break_.rN().break_(1.0E-5F), var0 -> true);
      rjC_2 var4 = rjw_3.class_(var2.break_(1.0E-5F));
      return var3.anyMatch(var1x -> !rjw_3.byte_(var1x, var4, rjN_2.implements_));
   }

   @Override
   public void class_(rmo_3 var1) {
      rdn_3 var2 = var1.break_();
      if (var2.break_() == rdy_3.xi) {
         rcd_3 var3 = var2.package_();
         if (rkm_3.class_(var3)) {
            ArrayList var4 = Lists.newArrayList();
            boolean var5 = var1.byte_();
            if (var5) {
               var4.add(var3.native_("title"));
            }

            rcy_3 var6 = var3.protected_("pages", 8);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               var4.add(var6.implements_(var7));
            }

            int var8 = var1.protected_();
            if (rhz_3.break_(var8) || var8 == 40) {
               this.class_(var4, var5 ? var2x -> this.class_(var2x.get(0), var2x.subList(1, var2x.size()), var8) : var2x -> this.class_(var2x, var8));
            }
         }
      }
   }

   @Override
   public void class_(rZp_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.sU()) {
         rfH_2 var2 = var1.break_();
         xc_3 var3 = ((rYB)this.break_.throws_[7]).byte_(var2);
         if (((rYB)this.break_.throws_[7]).class_(var2) instanceof ryG_2 var5) {
            var5.class_(var1.protected_());
            var5.class_(var1.throws_());
            var5.class_(var1.case_());
            var5.break_(var1.catch_());
            var5.class_(var1.private_());
            var5.class_(var1.implements_());
            var5.break_(var1.finally_());
            var5.class_(var1.extends_());
            var5.protected_(var1.native_());
            var5.throws_(var1.volatile_());
            var5.class_(var1.final_());
            var5.class_(var1.package_());
            if (var5.private_()) {
               String var6 = var5.throws_();
               if (var1.byte_() == ryM_2.SAVE_AREA) {
                  if (var5.synchronized_()) {
                     this.break_.class_(new rgn_3("structure_block.save_success", var6), false);
                  } else {
                     this.break_.class_(new rgn_3("structure_block.save_failure", var6), false);
                  }
               } else if (var1.byte_() == ryM_2.LOAD_AREA) {
                  if (!var5.public_()) {
                     this.break_.class_(new rgn_3("structure_block.load_not_found", var6), false);
                  } else if (var5.class_(this.break_.continue_())) {
                     this.break_.class_(new rgn_3("structure_block.load_success", var6), false);
                  } else {
                     this.break_.class_(new rgn_3("structure_block.load_prepare", var6), false);
                  }
               } else if (var1.byte_() == ryM_2.SCAN_AREA) {
                  if (var5.else_()) {
                     this.break_.class_(new rgn_3("structure_block.size_success", var6), false);
                  } else {
                     this.break_.class_(new rgn_3("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.break_.class_(new rgn_3("structure_block.invalid_structure_name", var1.throws_()), false);
            }

            var5.break_();
            ((rYB)this.break_.throws_[7]).class_(var2, var3, var3, 3);
         }
      }
   }

   @Override
   public void class_(rZm_1 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      int var2 = var1.break_();
      rJr_1 var3 = (rJr_1)this.break_.implements_[4];
      if (var3 instanceof rJp_1 var4) {
         var4.protected_(var2);
         var4.catch_(var2);
      }
   }

   @Override
   public void class_(rZC var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.sU()) {
         rfH_2 var2 = var1.break_();
         xc_3 var3 = ((rYB)this.break_.throws_[7]).byte_(var2);
         if (((rYB)this.break_.throws_[7]).class_(var2) instanceof rHj_1 var5) {
            var5.class_(var1.byte_());
            var5.break_(var1.protected_());
            var5.byte_(var1.throws_());
            var5.class_(var1.case_());
            var5.class_(var1.catch_());
            var5.break_();
            ((rYB)this.break_.throws_[7]).class_(var2, var3, var3, 3);
         }
      }
   }

   @Override
   public void class_(rmi_3 var1) {
      ruZ_2.class_(var1, this, this.break_.continue_());
      if (this.break_.sU()) {
         rfH_2 var2 = var1.break_();
         if (((rYB)this.break_.throws_[7]).class_(var2) instanceof rHj_1 var4) {
            var4.class_(this.break_.continue_(), var1.byte_(), var1.protected_());
         }
      }
   }

   private void class_(String var1, List<String> var2, int var3) {
      rdn_3 var4 = ((rhz_3)this.break_.implements_[1]).extends_(var3);
      if (var4.break_() == rdy_3.xi) {
         rdn_3 var5 = new rdn_3(rdy_3.dr);
         rcd_3 var6 = var4.package_();
         if (var6 != null) {
            var5.byte_(var6.catch_());
         }

         var5.class_("author", rca_3.class_(this.break_.g().getString()));
         var5.class_("title", rca_3.class_(var1));
         rcy_3 var7 = new rcy_3();

         for (String var9 : var2) {
            rgN_2 var10 = new rgN_2(var9);
            String var11 = rgB_2.class_(var10);
            var7.add(rca_3.class_(var11));
         }

         var5.class_("pages", var7);
         ((rhz_3)this.break_.implements_[1]).break_(var3, var5);
      }
   }

   private void class_(List<String> var1, int var2) {
      rdn_3 var3 = ((rhz_3)this.break_.implements_[1]).extends_(var2);
      if (var3.break_() == rdy_3.xi) {
         rcy_3 var4 = new rcy_3();
         var1.stream().map(rca_3::class_).forEach(var4::add);
         var3.class_("pages", var4);
      }
   }

   public void break_() {
      this.byte_();
      rhN_2 var10000 = this.break_;
      Double var7 = this.break_.rx();
      var10000.throws_[8] = var7;
      var10000 = this.break_;
      Double var8 = this.break_.re();
      var10000.throws_[9] = var8;
      var10000 = this.break_;
      Double var9 = this.break_.BO();
      var10000.throws_[10] = var9;
      this.break_.catch_();
      this.break_.break_(this.native_, this.volatile_, this.final_, (Float)this.break_.throws_[15], (Float)this.break_.throws_[16]);
      this.throws_++;
      this.long_ = this.abstract_;
      if (this.instanceof_ && !this.break_.Sc()) {
         if (++this.throw_ > 80) {
            byte_.warn("{} was kicked for floating too long!", this.break_.g().getString());
            this.class_(new rgn_3("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.instanceof_ = false;
         this.throw_ = 0;
      }

      this.continue_ = this.break_.PO();
      if (this.continue_ != this.break_ && this.continue_.rU() == this.break_) {
         this.super_ = this.continue_.rx();
         this.this_ = this.continue_.re();
         this.else_ = this.continue_.BO();
         this.synchronized_ = this.continue_.rx();
         this.return_ = this.continue_.re();
         this.public_ = this.continue_.BO();
         if (this.interface_ && this.break_.PO().rU() == this.break_) {
            if (++this.char_ > 80) {
               byte_.warn("{} was kicked for floating a vehicle too long!", this.break_.g().getString());
               this.class_(new rgn_3("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.interface_ = false;
            this.char_ = 0;
         }
      } else {
         this.continue_ = null;
         this.interface_ = false;
         this.char_ = 0;
      }

      long var1 = rqR_2.break_();
      if (var1 - this.case_ >= 15000L) {
         if (this.catch_) {
            this.class_(new rgn_3("disconnect.timeout"));
         } else {
            this.catch_ = true;
            this.case_ = var1;
            this.private_ = var1;
            this.class_(new rvv_3(this.private_));
         }
      }

      if (this.implements_ > 0) {
         this.implements_--;
      }

      if (this.finally_ > 0) {
         this.finally_--;
      }

      if (this.break_.short_() > 0L && this.protected_.m() > 0 && rqR_2.break_() - this.break_.short_() > (long)(this.protected_.m() * 1000 * 60)) {
         this.class_(new rgn_3("multiplayer.disconnect.idling"));
      }
   }

   private void break_(String var1) {
      this.protected_.f().class_(this.break_.PL(), var1);
   }

   private static boolean break_(rZS var0) {
      return !Doubles.isFinite(var0.break_())
         || !Doubles.isFinite(var0.byte_())
         || !Doubles.isFinite(var0.protected_())
         || !Floats.isFinite(var0.case_())
         || !Floats.isFinite(var0.throws_());
   }

   private static boolean break_(rZO var0) {
      return Doubles.isFinite(var0.class_(0.0))
            && Doubles.isFinite(var0.break_(0.0))
            && Doubles.isFinite(var0.byte_(0.0))
            && Floats.isFinite(var0.break_(0.0F))
            && Floats.isFinite(var0.class_(0.0F))
         ? Math.abs(var0.class_(0.0)) > 3.0E7 || Math.abs(var0.break_(0.0)) > 3.0E7 || Math.abs(var0.byte_(0.0)) > 3.0E7
         : true;
   }

   private boolean protected_() {
      return this.protected_.break_(this.break_.sv());
   }
}
