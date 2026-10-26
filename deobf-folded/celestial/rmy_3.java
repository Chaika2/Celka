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
   private static final Logger id_byte = LogManager.getLogger();
   public final rud_3 id_class;
   private final rnW_2 id_protected;
   public rhN_2 id_break;
   private int id_throws;
   private long id_case;
   private boolean id_catch;
   private long id_private;
   private int id_implements;
   private int id_finally;
   private final Int2ShortMap id_extends = new Int2ShortOpenHashMap();
   private double id_native;
   private double id_volatile;
   private double id_final;
   private double id_package;
   private double id_int;
   private double id_new;
   private an_3 id_continue;
   private double id_super;
   private double id_this;
   private double id_else;
   private double id_synchronized;
   private double id_return;
   private double id_public;
   private rjU_2 id_goto;
   private int id_while;
   private int id_try;
   private boolean id_instanceof;
   private int id_throw;
   private boolean id_interface;
   private int id_char;
   private int id_abstract;
   private int id_long;

   public void id_byte() {
      this.id_native = this.id_break.rx();
      this.id_volatile = this.id_break.re();
      this.id_final = this.id_break.BO();
      this.id_package = this.id_break.rx();
      this.id_int = this.id_break.re();
      this.id_new = this.id_break.BO();
   }

   public rmy_3(rnW_2 var1, rud_3 var2, rhN_2 var3) {
      this.id_protected = var1;
      this.id_class = var2;
      var2.id_class(this);
      this.id_break = var3;
      var3.id_class = this;
      rgV_2 var4 = var3.O();
      if (var4 != null) {
         var4.id_class();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void id_class(rmI_2 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_public();
      rmf_3 var2 = var1.id_break();
      switch (var2) {
         case PERFORM_RESPAWN:
            if (this.id_break.id_volatile) {
               this.id_break.id_volatile = false;
               this.id_break = this.id_protected.x().id_class(this.id_break, true);
               Oo_1.id_synchronized.id_class(this.id_break, rYB.id_throws, rYB.id_byte);
            } else {
               if (this.id_break.Ss() > 0.0F) {
                  return;
               }

               this.id_break = this.id_protected.x().id_class(this.id_break, false);
               if (this.id_protected.id_int()) {
                  this.id_break.id_class(rRl_1.SPECTATOR);
                  this.id_break.id_continue().B().id_class(rRu_1.id_int).id_class(false, this.id_protected);
               }
            }
            break;
         case REQUEST_STATS:
            this.id_break.id_long().id_class(this.id_break);
      }
   }

   @Override
   public void id_class(rZq_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      rrEm_1 var2 = this.id_break.id_continue();
      an_3 var3 = var1.id_class(var2);
      this.id_break.id_public();
      this.id_break.id_volatile(var1.id_case());
      if (var3 != null) {
         double var4 = 36.0;
         if (this.id_break.id_int(var3) < 36.0) {
            rpm_3 var6 = var1.id_protected();
            rdn_3 var7 = var6 != null ? this.id_break.id_protected(var6).id_implements() : rdn_3.id_break;
            Optional var8 = Optional.empty();
            if (var1.id_break() == rZT.INTERACT) {
               var8 = Optional.of(this.id_break.id_class(var3, var6));
            } else if (var1.id_break() == rZT.INTERACT_AT) {
               var8 = Optional.of(var3.id_class(this.id_break, var1.id_throws(), var6));
            } else if (var1.id_break() == rZT.ATTACK) {
               if (var3 instanceof rsE_2 || var3 instanceof rsP_2 || var3 instanceof rhm_3 || var3 == this.id_break) {
                  this.id_class(new rgn_3("multiplayer.disconnect.invalid_entity_attacked"));
                  id_byte.warn("Player {} tried to attack an invalid entity", this.id_break.g().getString());
                  return;
               }

               this.id_break.id_throw(var3);
            }

            if (var8.isPresent() && ((ryZ_2)var8.get()).id_class()) {
               Oo_1.id_boolean.id_class(this.id_break, var7, var3);
               if (((ryZ_2)var8.get()).id_break()) {
                  this.id_break.id_class(var6, true);
               }
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void id_class(rmD_2 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_public();
      switch (var1.id_break()) {
         case PRESS_SHIFT_KEY:
            this.id_break.id_volatile(true);
            break;
         case RELEASE_SHIFT_KEY:
            this.id_break.id_volatile(false);
            break;
         case START_SPRINTING:
            this.id_break.c_(true);
            break;
         case STOP_SPRINTING:
            this.id_break.c_(false);
            break;
         case STOP_SLEEPING:
            if (this.id_break.Sc()) {
               this.id_break.id_class(false, true);
               this.id_goto = this.id_break.Ps();
            }
            break;
         case START_RIDING_JUMP:
            if (this.id_break.ra() instanceof aD_2) {
               aD_2 var4 = (aD_2)this.id_break.ra();
               int var3 = var1.id_byte();
               if (var4.id_throws() && var3 > 0) {
                  var4.id_break(var3);
               }
            }
            break;
         case STOP_RIDING_JUMP:
            if (this.id_break.ra() instanceof aD_2) {
               aD_2 var2 = (aD_2)this.id_break.ra();
               var2.id_case();
            }
            break;
         case OPEN_INVENTORY:
            if (this.id_break.ra() instanceof rOD) {
               ((rOD)this.id_break.ra()).id_case(this.id_break);
            }
            break;
         case START_FALL_FLYING:
            if (!this.id_break.sw()) {
               this.id_break.sx();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   @Override
   public void id_class(rmq_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_public();
      this.id_break.id_class(var1.id_break());
   }

   private void id_class(String var1) {
      if (this.id_break.id_else() == rhJ_2.HIDDEN) {
         this.id_class(new rZK(new rgn_3("chat.cannotSend").id_class(rgF_2.RED), rVU.SYSTEM, rqR_2.id_break));
      } else {
         this.id_break.id_public();

         for (int var2 = 0; var2 < var1.length(); var2++) {
            if (!rqu_3.id_class(var1.charAt(var2))) {
               this.id_class(new rgn_3("multiplayer.disconnect.illegal_characters"));
               return;
            }
         }

         if (var1.startsWith("/")) {
            this.id_break(var1);
         } else {
            rgn_3 var3 = new rgn_3("chat.type.text", this.id_break.L_(), var1);
            this.id_protected.x().id_class(var3, rVU.CHAT, this.id_break.ro());
         }

         this.id_implements += 20;
         if (this.id_implements > 200 && !this.id_protected.x().id_case(this.id_break.sv())) {
            this.id_class(new rgn_3("disconnect.spam"));
         }
      }
   }

   @Override
   public void id_class(rmK_2 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_public();
      if (((rJr_1)this.id_break.id_implements[4]).id_case == var1.id_break()
         && ((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break)
         && !this.id_break.id_native()) {
         ((rJr_1)this.id_break.id_implements[4]).id_break(this.id_break, var1.id_byte());
         ((rJr_1)this.id_break.id_implements[4]).id_native();
      }
   }

   @Override
   public void id_class(rZE var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_public();
      if (!this.id_break.id_native()
         && ((rJr_1)this.id_break.id_implements[4]).id_case == var1.id_break()
         && ((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break)
         && (rJr_1)this.id_break.id_implements[4] instanceof rJI) {
         this.id_protected
            .V()
            .id_class(var1.id_byte())
            .ifPresent(var2 -> ((rJI)((rJr_1)this.id_break.id_implements[4])).id_class(var1.id_protected(), (rkw_3<?>)var2, this.id_break));
      }
   }

   @Override
   public void id_class(rmt_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_public();
      if (((rJr_1)this.id_break.id_implements[4]).id_case == var1.id_break() && ((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break)) {
         if (this.id_break.id_native()) {
            rqs_3 var2 = rqs_3.id_class();

            for (int var3 = 0; var3 < ((rJr_1)this.id_break.id_implements[4]).id_throws.size(); var3++) {
               var2.add(((rJr_1)this.id_break.id_implements[4]).id_throws.get(var3).id_class());
            }

            this.id_break.id_class((rJr_1)this.id_break.id_implements[4], var2);
         } else {
            rdn_3 var6 = ((rJr_1)this.id_break.id_implements[4]).id_class(var1.id_byte(), var1.id_protected(), var1.id_catch(), this.id_break);
            if (rdn_3.id_break(var1.id_case(), var6)) {
               this.id_break.id_class.id_class(new rvS_2(var1.id_break(), var1.id_throws(), true));
               this.id_break.id_extends = true;
               ((rJr_1)this.id_break.id_implements[4]).id_native();
               this.id_break.id_private();
               this.id_break.id_extends = false;
            } else {
               this.id_extends.put(((rJr_1)this.id_break.id_implements[4]).id_case, var1.id_throws());
               this.id_break.id_class.id_class(new rvS_2(var1.id_break(), var1.id_throws(), false));
               ((rJr_1)this.id_break.id_implements[4]).id_break(this.id_break, false);
               rqs_3 var7 = rqs_3.id_class();

               for (int var4 = 0; var4 < ((rJr_1)this.id_break.id_implements[4]).id_throws.size(); var4++) {
                  rdn_3 var5 = ((rJr_1)this.id_break.id_implements[4]).id_throws.get(var4).id_class();
                  var7.add(var5.id_class() ? rdn_3.id_break : var5);
               }

               this.id_break.id_class((rJr_1)this.id_break.id_implements[4], var7);
            }
         }
      }
   }

   @Override
   public void id_class(rmj_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_final();
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
      id_byte.info("{} lost connection: {}", this.id_break.g().getString(), var2.getString());
      this.id_protected.A();
      this.id_protected.x().id_class(new rgn_3("multiplayer.player.left", this.id_break.L_()).id_class(rgF_2.YELLOW), rVU.SYSTEM, rqR_2.id_break);
      this.id_break.id_package();
      this.id_protected.x().id_byte(this.id_break);
      rgV_2 var3 = this.id_break.O();
      if (var3 != null) {
         var3.id_break();
      }

      if (this.id_protected()) {
         id_byte.info("Stopping singleplayer server as player logged out");
         this.id_protected.id_class(false);
      }
   }

   @Override
   public void id_class(rZF var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      an_3 var2 = this.id_break.ra();
      if (var2 instanceof rSK) {
         ((rSK)var2).id_class(var1.id_break(), var1.id_byte());
      }
   }

   @Override
   public void id_class(rZQ var1) {
   }

   @Override
   public void id_class(rZd_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      rrEm_1 var2 = this.id_break.id_continue();
      rpm_3 var3 = var1.id_break();
      rdn_3 var4 = this.id_break.id_protected(var3);
      this.id_break.id_public();
      if (!var4.id_class()) {
         ryZ_2 var5 = this.id_break.id_finally.id_class(this.id_break, var2, var4, var3);
         if (var5.id_break()) {
            this.id_break.id_class(var3, true);
         }
      }
   }

   @Override
   public void id_class(rZx_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      rrEm_1 var2 = this.id_break.id_continue();
      rpm_3 var3 = var1.id_break();
      rdn_3 var4 = this.id_break.id_protected(var3);
      rff_3 var5 = var1.id_byte();
      rfH_2 var6 = var5.id_class();
      rpr_3 var7 = var5.id_break();
      this.id_break.id_public();
      if (var6.c_() < this.id_protected.X()) {
         if (this.id_goto == null
            && this.id_break.id_class((double)var6.b_() + 0.5, (double)var6.c_() + 0.5, (double)var6.d_() + 0.5) < 64.0
            && var2.id_class(this.id_break, var6)) {
            ryZ_2 var8 = this.id_break.id_finally.id_class(this.id_break, var2, var4, var3, var5);
            if (var7 == rpr_3.UP && !var8.id_class() && var6.c_() >= this.id_protected.X() - 1 && id_class(this.id_break, var4)) {
               rVi_1 var9 = new rgn_3("build.tooHigh", this.id_protected.X()).id_class(rgF_2.RED);
               this.id_break.id_class.id_class(new rZK(var9, rVU.GAME_INFO, rqR_2.id_break));
            } else if (var8.id_break()) {
               this.id_break.id_class(var3, true);
            }
         }
      } else {
         rVi_1 var10 = new rgn_3("build.tooHigh", this.id_protected.X()).id_class(rgF_2.RED);
         this.id_break.id_class.id_class(new rZK(var10, rVU.GAME_INFO, rqR_2.id_break));
      }

      this.id_break.id_class.id_class(new rZR(var2, var6));
      this.id_break.id_class.id_class(new rZR(var2, var6.id_break(var7)));
   }

   @Override
   public void id_class(rmT_2 var1) {
      String var2 = StringUtils.normalizeSpace(var1.id_break());
      if (var2.startsWith("/")) {
         ruZ_2.id_class(var1, this, this.id_break.id_continue());
         this.id_class(var2);
      } else {
         this.id_class(var2, this::id_class);
      }
   }

   @Override
   public void id_class(rme_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (var1.id_break() >= 0 && var1.id_break() < rhz_3.id_protected()) {
         if (((rhz_3)this.id_break.id_implements[1]).id_protected != var1.id_break() && this.id_break.P() == rpm_3.MAIN_HAND) {
            this.id_break.id_throw();
         }

         ((rhz_3)this.id_break.id_implements[1]).id_protected = var1.id_break();
         this.id_break.id_public();
      } else {
         id_byte.warn("{} tried to set an invalid carried item", this.id_break.g().getString());
      }
   }

   public void id_class(ruS_2<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      if (var1 instanceof rZK var3) {
         rhJ_2 var4 = this.id_break.id_else();
         if (var4 == rhJ_2.HIDDEN && var3.id_protected() != rVU.GAME_INFO) {
            return;
         }

         if (var4 == rhJ_2.SYSTEM && !var3.id_byte()) {
            return;
         }
      }

      try {
         this.id_class.id_class(var1, var2);
      } catch (Throwable var6) {
         KY var7 = KY.id_class(var6, "Sending packet");
         Ko_1 var5 = var7.id_class("Packet being sent");
         var5.id_class("Packet class", () -> var1.getClass().getCanonicalName());
         throw new KU(var7);
      }
   }

   public void id_class(ruS_2<?> var1) {
      this.id_class(var1, (GenericFutureListener<? extends Future<? super Void>>)null);
   }

   @Override
   public void id_class(rZP var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.id_catch(2) || this.id_protected()) {
         this.id_protected.id_break(var1.id_break());
      }
   }

   @Override
   public void id_class(rZv_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.id_native()) {
         for (rrEm_1 var3 : this.id_protected.id_float()) {
            an_3 var4 = var1.id_class(var3);
            if (var4 != null) {
               this.id_break.id_class(var3, var4.rx(), var4.re(), var4.BO(), (Float)var4.id_throws[15], (Float)var4.id_throws[16]);
               return;
            }
         }
      }
   }

   @Override
   public void id_class(rZr_1 var1) {
      if (this.id_catch && var1.id_break() == this.id_private) {
         int var2 = (int)(rqR_2.id_break() - this.id_case);
         this.id_break.id_native = (this.id_break.id_native * 3 + var2) / 4;
         this.id_catch = false;
      } else if (!this.id_protected()) {
         this.id_class(new rgn_3("disconnect.timeout"));
      }
   }

   private void id_class(rZy_1 var1, List<String> var2) {
      this.id_break.id_public();
      rrEm_1 var3 = this.id_break.id_continue();
      rfH_2 var4 = var1.id_break();
      if (var3.id_int(var4)) {
         xc_3 var5 = var3.id_byte(var4);
         if (!(var3.id_class(var4) instanceof ryS_2 var7)) {
            return;
         }

         if (!var7.id_throws() || var7.id_catch() != this.id_break) {
            id_byte.warn("Player {} just tried to change non-editable sign", this.id_break.g().getString());
            return;
         }

         for (int var8 = 0; var8 < var2.size(); var8++) {
            var7.id_class(var8, new rgN_2((String)var2.get(var8)));
         }

         var7.id_break();
         var3.id_class(var4, var5, var5, 3);
      }
   }

   @Override
   public void id_class(rZy_1 var1) {
      List var2 = Stream.of(var1.id_byte()).map(rgF_2::id_class).collect(Collectors.toList());
      this.id_class(var2, var2x -> this.id_class(var1, var2x));
   }

   @Override
   public void id_class(rmg_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      int var2 = ((rJr_1)this.id_break.id_implements[4]).id_case;
      if (var2 == var1.id_break()
         && this.id_extends.getOrDefault(var2, (short)(var1.id_byte() + 1)) == var1.id_byte()
         && !((rJr_1)this.id_break.id_implements[4]).id_byte(this.id_break)
         && !this.id_break.id_native()) {
         ((rJr_1)this.id_break.id_implements[4]).id_break(this.id_break, true);
      }
   }

   @Override
   public void id_class(rmR_2 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.id_finally.id_throws()) {
         boolean var2 = var1.id_break() < 0;
         rdn_3 var3 = var1.id_byte();
         rcd_3 var4 = var3.id_break("BlockEntityTag");
         if (!var3.id_class() && var4 != null && var4.id_throws("x") && var4.id_throws("y") && var4.id_throws("z")) {
            rfH_2 var5 = new rfH_2(var4.id_private("x"), var4.id_private("y"), var4.id_private("z"));
            ryO_2 var6 = ((rYB)this.id_break.id_throws[7]).id_class(var5);
            if (var6 != null) {
               rcd_3 var7 = var6.id_class(new rcd_3());
               var7.id_continue("x");
               var7.id_continue("y");
               var7.id_continue("z");
               var3.id_class("BlockEntityTag", var7);
            }
         }

         boolean var8 = var1.id_break() >= 1 && var1.id_break() <= 45;
         boolean var9 = var3.id_class() || var3.id_catch() >= 0 && var3.id_char() <= 64 && !var3.id_class();
         if (var8 && var9) {
            if (var3.id_class()) {
               ((rJT)this.id_break.id_implements[3]).id_class(var1.id_break(), rdn_3.id_break);
            } else {
               ((rJT)this.id_break.id_implements[3]).id_class(var1.id_break(), var3);
            }

            ((rJT)this.id_break.id_implements[3]).id_break(this.id_break, true);
            ((rJT)this.id_break.id_implements[3]).id_native();
         } else if (var2 && var9 && this.id_finally < 200) {
            this.id_finally += 20;
            this.id_break.id_class(var3, true);
         }
      }
   }

   @Override
   public void id_class(rZZ var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.id_catch(2) || this.id_protected()) {
         this.id_protected.id_class(var1.id_break(), false);
      }
   }

   @Override
   public void id_class(rmY_2 var1) {
   }

   @Override
   public void id_class(rmw_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_class(var1);
   }

   @Override
   public void id_class(rZG var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      ((rhx_3)this.id_break.id_implements[18]).id_break = var1.id_break() && ((rhx_3)this.id_break.id_implements[18]).id_byte;
   }

   @Override
   public void id_class(rZn_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (!this.id_protected.O()) {
         this.id_break.id_class(new rgn_3("advMode.notEnabled"), rqR_2.id_break);
      } else if (!this.id_break.sU()) {
         this.id_break.id_class(new rgn_3("advMode.notAllowed"), rqR_2.id_break);
      } else {
         rHm_1 var2 = null;
         rHZ var3 = null;
         rfH_2 var4 = var1.id_break();
         ryO_2 var5 = ((rYB)this.id_break.id_throws[7]).id_class(var4);
         if (var5 instanceof rHZ) {
            var3 = (rHZ)var5;
            var2 = var3.id_throws();
         }

         String var6 = var1.id_byte();
         boolean var7 = var1.id_protected();
         if (var2 != null) {
            rHF var8 = var3.id_final();
            rpr_3 var9 = ((rYB)this.id_break.id_throws[7]).id_byte(var4).id_byte(xK_2.id_volatile);
            switch (var1.id_catch()) {
               case SEQUENCE:
                  xc_3 var10 = xu_3.bf.id_continue();
                  ((rYB)this.id_break.id_throws[7])
                     .id_class(var4, var10.id_class(xK_2.id_volatile, var9).id_class(xK_2.id_final, Boolean.valueOf(var1.id_throws())), 2);
                  break;
               case AUTO:
                  xc_3 var11 = xu_3.bI.id_continue();
                  ((rYB)this.id_break.id_throws[7])
                     .id_class(var4, var11.id_class(xK_2.id_volatile, var9).id_class(xK_2.id_final, Boolean.valueOf(var1.id_throws())), 2);
                  break;
               case REDSTONE:
               default:
                  xc_3 var12 = xu_3.SZ.id_continue();
                  ((rYB)this.id_break.id_throws[7])
                     .id_class(var4, var12.id_class(xK_2.id_volatile, var9).id_class(xK_2.id_final, Boolean.valueOf(var1.id_throws())), 2);
            }

            var5.id_int();
            ((rYB)this.id_break.id_throws[7]).id_class(var4, var5);
            var2.id_class(var6);
            var2.id_class(var7);
            if (!var7) {
               var2.id_break((rgP_2)null);
            }

            var3.id_break(var1.id_case());
            if (var8 != var1.id_catch()) {
               var3.id_finally();
            }

            var2.id_break();
            if (!rql_3.id_break(var6)) {
               this.id_break.id_class(new rgn_3("advMode.setCommand.success", var6), rqR_2.id_break);
            }
         }
      }
   }

   @Override
   public void id_class(rZL var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      StringReader var2 = new StringReader(var1.id_byte());
      if (var2.canRead() && var2.peek() == '/') {
         var2.skip();
      }

      ParseResults var3 = this.id_protected.f().id_class().parse(var2, this.id_break.PL());
      this.id_protected.f().id_class().getCompletionSuggestions(var3).thenAccept(var2x -> this.id_class.id_class(new rFQ(var1.id_break(), var2x)));
   }

   @Override
   public void id_class(rZc_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (var1.id_byte() == rZu_1.OPENED_TAB) {
         rqO_2 var2 = var1.id_protected();
         OT var3 = this.id_protected.t().id_class(var2);
         if (var3 != null) {
            this.id_break.r().id_class(var3);
         }
      }
   }

   @Override
   public void id_class(rZH var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_float().id_class(var1.id_break(), var1.id_byte(), var1.id_protected());
   }

   @Override
   public void id_class(rZB var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_protected.V().id_class(var1.id_break()).ifPresent(this.id_break.id_float()::id_throws);
   }

   @Override
   public void id_class(rZA var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if ((rJr_1)this.id_break.id_implements[4] instanceof rXT) {
         ((rXT)((rJr_1)this.id_break.id_implements[4])).id_break(var1.id_break(), var1.id_byte());
      }
   }

   @Override
   public void id_class(rZz_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if ((rJr_1)this.id_break.id_implements[4] instanceof rJf_1 var2) {
         String var3 = rqu_3.id_class(var1.id_break());
         if (var3.length() <= 35) {
            var2.id_class(var3);
         }
      }
   }

   @Override
   public void id_class(rZs_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      ((rhz_3)this.id_break.id_implements[1]).id_class(var1.id_break());
      this.id_break
         .id_class
         .id_class(
            new rFM(
               -2,
               ((rhz_3)this.id_break.id_implements[1]).id_protected,
               ((rhz_3)this.id_break.id_implements[1]).id_extends(((rhz_3)this.id_break.id_implements[1]).id_protected)
            )
         );
      this.id_break.id_class.id_class(new rFM(-2, var1.id_break(), ((rhz_3)this.id_break.id_implements[1]).id_extends(var1.id_break())));
      this.id_break.id_class.id_class(new rvm_3(((rhz_3)this.id_break.id_implements[1]).id_protected));
   }

   @Override
   public void id_class(rZl_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (!this.id_protected.O()) {
         this.id_break.id_class(new rgn_3("advMode.notEnabled"), rqR_2.id_break);
      } else if (!this.id_break.sU()) {
         this.id_break.id_class(new rgn_3("advMode.notAllowed"), rqR_2.id_break);
      } else {
         rHm_1 var2 = var1.id_class((rYB)this.id_break.id_throws[7]);
         if (var2 != null) {
            var2.id_class(var1.id_break());
            var2.id_class(var1.id_byte());
            if (!var1.id_byte()) {
               var2.id_break((rgP_2)null);
            }

            var2.id_break();
            this.id_break.id_class(new rgn_3("advMode.setCommand.success", var1.id_break()), rqR_2.id_break);
         }
      }
   }

   private void id_class(List<String> var1, Consumer<List<String>> var2) {
      this.id_class(var1, var2, rgV_2::id_class);
   }

   private void id_class(String var1, Consumer<String> var2) {
      this.id_class(var1, var2, rgV_2::id_class);
   }

   private <T> void id_class(T var1, Consumer<T> var2, BiFunction<rgV_2, T, CompletableFuture<Optional<T>>> var3) {
      rnW_2 var4 = this.id_break.id_continue().id_const();
      Consumer var5 = var2x -> {
         if (this.id_class().id_case()) {
            var2.accept(var2x);
         } else {
            id_byte.debug("Ignoring packet due to disconnection");
         }
      };
      rgV_2 var6 = this.id_break.O();
      if (var6 != null) {
         ((CompletableFuture)var3.apply(var6, var1)).thenAcceptAsync(var1x -> var1x.ifPresent(var5), var4);
      } else {
         var4.execute(() -> var5.accept(var1));
      }
   }

   public void id_class(rgP_2 var1) {
      this.id_class.id_class(new rvb_3(var1), var2 -> this.id_class.id_class(var1));
      this.id_class.id_extends();
      this.id_protected.id_catch(this.id_class::id_native);
   }

   @Override
   public rud_3 id_class() {
      return this.id_class;
   }

   @Override
   public void id_class(rmV_2 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (var1.id_break() == this.id_while) {
         this.id_break
            .id_break(
               this.id_goto.id_break, this.id_goto.id_byte, this.id_goto.id_protected, (Float)this.id_break.id_throws[15], (Float)this.id_break.id_throws[16]
            );
         this.id_package = this.id_goto.id_break;
         this.id_int = this.id_goto.id_byte;
         this.id_new = this.id_goto.id_protected;
         if (this.id_break.id_for()) {
            this.id_break.id_double();
         }

         this.id_goto = null;
      }
   }

   private boolean id_class(an_3 var1) {
      return ((rYB)var1.id_throws[7]).id_class(var1.rN().id_class(0.0625).id_break(0.0, -0.55, 0.0)).allMatch(JC::id_catch);
   }

   @Override
   public void id_class(rZS var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (id_break(var1)) {
         this.id_class(new rgn_3("multiplayer.disconnect.invalid_vehicle_movement"));
      } else {
         an_3 var2 = this.id_break.PO();
         if (var2 != this.id_break && var2.rU() == this.id_break && var2 == this.id_continue) {
            rrEm_1 var3 = this.id_break.id_continue();
            double var4 = var2.rx();
            double var6 = var2.re();
            double var8 = var2.BO();
            double var10 = var1.id_break();
            double var12 = var1.id_byte();
            double var14 = var1.id_protected();
            float var16 = var1.id_throws();
            float var17 = var1.id_case();
            double var18 = var10 - this.id_super;
            double var20 = var12 - this.id_this;
            double var22 = var14 - this.id_else;
            double var24 = var2.rv().id_catch();
            double var26 = var18 * var18 + var20 * var20 + var22 * var22;
            if (var26 - var24 > 100.0 && !this.id_protected()) {
               id_byte.warn("{} (vehicle of {}) moved too quickly! {},{},{}", var2.g().getString(), this.id_break.g().getString(), var18, var20, var22);
               this.id_class.id_class(new rvn_3(var2));
               return;
            }

            boolean var28 = var3.a_(var2, var2.rN().id_break(0.0625));
            var18 = var10 - this.id_synchronized;
            var20 = var12 - this.id_return - 1.0E-6;
            var22 = var14 - this.id_public;
            var2.id_class(iG_2.PLAYER, new rjU_2(var18, var20, var22));
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
               id_byte.warn("{} (vehicle of {}) moved wrongly! {}", var2.g().getString(), this.id_break.g().getString(), Math.sqrt(var26));
            }

            var2.id_break(var10, var12, var14, var16, var17);
            boolean var30 = var3.a_(var2, var2.rN().id_break(0.0625));
            if (var28 && (var29 || !var30)) {
               var2.id_break(var4, var6, var8, var16, var17);
               this.id_class.id_class(new rvn_3(var2));
               return;
            }

            this.id_break.id_continue().id_else().id_class(this.id_break);
            this.id_break.id_continue(this.id_break.rx() - var4, this.id_break.re() - var6, this.id_break.BO() - var8);
            this.id_interface = var20 >= -0.03125 && !this.id_protected.M() && this.id_class(var2);
            this.id_synchronized = var2.rx();
            this.id_return = var2.re();
            this.id_public = var2.BO();
         }
      }
   }

   @Override
   public void id_class(rma_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      this.id_break.id_class(var1.id_break(), var1.id_byte(), var1.id_protected(), var1.id_throws());
   }

   private static boolean id_class(rhN_2 var0, rdn_3 var1) {
      if (var1.id_class()) {
         return false;
      } else {
         rdb_3 var2 = var1.id_break();
         return (var2 instanceof rxJ_2 || var2 instanceof rxN_2) && !var0.sK().id_class(var2);
      }
   }

   @Override
   public void id_class(rZO var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (id_break(var1)) {
         this.id_class(new rgn_3("multiplayer.disconnect.invalid_player_movement"));
      } else {
         rrEm_1 var2 = this.id_break.id_continue();
         if (!this.id_break.id_volatile) {
            if (this.id_throws == 0) {
               this.id_byte();
            }

            if (this.id_goto != null) {
               if (this.id_throws - this.id_try > 20) {
                  this.id_try = this.id_throws;
                  this.id_class(
                     this.id_goto.id_break,
                     this.id_goto.id_byte,
                     this.id_goto.id_protected,
                     (Float)this.id_break.id_throws[15],
                     (Float)this.id_break.id_throws[16]
                  );
               }
            } else {
               this.id_try = this.id_throws;
               if (this.id_break.Pm()) {
                  this.id_break
                     .id_break(
                        this.id_break.rx(),
                        this.id_break.re(),
                        this.id_break.BO(),
                        var1.id_class((Float)this.id_break.id_throws[15]),
                        var1.id_break((Float)this.id_break.id_throws[16])
                     );
                  this.id_break.id_continue().id_else().id_class(this.id_break);
               } else {
                  double var3 = this.id_break.rx();
                  double var5 = this.id_break.re();
                  double var7 = this.id_break.BO();
                  double var9 = this.id_break.re();
                  double var11 = var1.id_class(this.id_break.rx());
                  double var13 = var1.id_break(this.id_break.re());
                  double var15 = var1.id_byte(this.id_break.BO());
                  float var17 = var1.id_class((Float)this.id_break.id_throws[15]);
                  float var18 = var1.id_break((Float)this.id_break.id_throws[16]);
                  double var19 = var11 - this.id_native;
                  double var21 = var13 - this.id_volatile;
                  double var23 = var15 - this.id_final;
                  double var25 = this.id_break.rv().id_catch();
                  double var27 = var19 * var19 + var21 * var21 + var23 * var23;
                  if (this.id_break.Sc()) {
                     if (var27 > 1.0) {
                        this.id_class(
                           this.id_break.rx(),
                           this.id_break.re(),
                           this.id_break.BO(),
                           var1.id_class((Float)this.id_break.id_throws[15]),
                           var1.id_break((Float)this.id_break.id_throws[16])
                        );
                     }
                  } else {
                     this.id_abstract++;
                     int var29 = this.id_abstract - this.id_long;
                     if (var29 > 5) {
                        id_byte.debug("{} is sending move packets too frequently ({} packets since last tick)", this.id_break.g().getString(), var29);
                        var29 = 1;
                     }

                     if (!this.id_break.id_for() && (!this.id_break.id_continue().B().id_break(rRu_1.id_continue) || !this.id_break.Sy())) {
                        float var30 = this.id_break.Sy() ? 300.0F : 100.0F;
                        if (var27 - var25 > (double)(var30 * (float)var29) && !this.id_protected()) {
                           id_byte.warn("{} moved too quickly! {},{},{}", this.id_break.g().getString(), var19, var21, var23);
                           this.id_class(
                              this.id_break.rx(),
                              this.id_break.re(),
                              this.id_break.BO(),
                              (Float)this.id_break.id_throws[15],
                              (Float)this.id_break.id_throws[16]
                           );
                           return;
                        }
                     }

                     rfl_3 var46 = this.id_break.rN();
                     var19 = var11 - this.id_package;
                     var21 = var13 - this.id_int;
                     var23 = var15 - this.id_new;
                     boolean var31 = var21 > 0.0;
                     if (this.id_break.BL() && !var1.id_break() && var31) {
                        this.id_break.sl();
                     }

                     this.id_break.id_class(iG_2.PLAYER, new rjU_2(var19, var21, var23));
                     var19 = var11 - this.id_break.rx();
                     var21 = var13 - this.id_break.re();
                     if (var21 > -0.5 || var21 < 0.5) {
                        var21 = 0.0;
                     }

                     var23 = var15 - this.id_break.BO();
                     var27 = var19 * var19 + var21 * var21 + var23 * var23;
                     boolean var32 = false;
                     if (!this.id_break.id_for()
                        && var27 > 0.0625
                        && !this.id_break.Sc()
                        && !this.id_break.id_finally.id_throws()
                        && this.id_break.id_finally.id_break() != rRl_1.SPECTATOR) {
                        var32 = true;
                        id_byte.warn("{} moved wrongly!", this.id_break.g().getString());
                     }

                     this.id_break.id_break(var11, var13, var15, var17, var18);
                     boolean var33 = (Boolean)this.id_break.id_throws[38];
                     if (var33 || this.id_break.Sc() || (!var32 || !var2.a_(this.id_break, var46)) && !this.id_class(var2, var46)) {
                        this.id_instanceof = var21 >= -0.03125
                           && this.id_break.id_finally.id_break() != rRl_1.SPECTATOR
                           && !this.id_protected.M()
                           && !((rhx_3)this.id_break.id_implements[18]).id_byte
                           && !this.id_break.id_break(rLD.id_goto)
                           && !this.id_break.Sy()
                           && this.id_class(this.id_break);
                        this.id_break.id_continue().id_else().id_class(this.id_break);
                        this.id_break.id_class(this.id_break.re() - var9, var1.id_break());
                        this.id_break.id_int(var1.id_break());
                        if (var31) {
                           rhN_2 var10000 = this.id_break;
                           Float var38 = 0.0F;
                           var10000.id_throws[31] = var38;
                        }

                        this.id_break.id_continue(this.id_break.rx() - var3, this.id_break.re() - var5, this.id_break.BO() - var7);
                        this.id_package = this.id_break.rx();
                        this.id_int = this.id_break.re();
                        this.id_new = this.id_break.BO();
                     } else {
                        this.id_class(var3, var5, var7, var17, var18);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void id_class(rZW var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.id_catch(2)) {
         ryO_2 var2 = this.id_break.id_continue().id_class(var1.id_byte());
         rcd_3 var3 = var2 != null ? var2.id_class(new rcd_3()) : null;
         this.id_break.id_class.id_class(new rve_3(var1.id_break(), var3));
      }
   }

   @Override
   public void id_class(rZk_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.id_catch(2)) {
         an_3 var2 = this.id_break.id_continue().id_break(var1.id_byte());
         if (var2 != null) {
            rcd_3 var3 = var2.id_case(new rcd_3());
            this.id_break.id_class.id_class(new rve_3(var1.id_break(), var3));
         }
      }
   }

   @Override
   public void id_class(rZb_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      rfH_2 var2 = var1.id_break();
      this.id_break.id_public();
      rZM var3 = var1.id_protected();
      switch (var3) {
         case SWAP_ITEM_WITH_OFFHAND:
            if (!this.id_break.id_native()) {
               rdn_3 var4 = this.id_break.id_protected(rpm_3.OFF_HAND);
               this.id_break.id_class(rpm_3.OFF_HAND, this.id_break.id_protected(rpm_3.MAIN_HAND));
               this.id_break.id_class(rpm_3.MAIN_HAND, var4);
               this.id_break.id_throw();
            }

            return;
         case DROP_ITEM:
            if (!this.id_break.id_native()) {
               this.id_break.id_protected(false);
            }

            return;
         case DROP_ALL_ITEMS:
            if (!this.id_break.id_native()) {
               this.id_break.id_protected(true);
            }

            return;
         case RELEASE_USE_ITEM:
            this.id_break.SC();
            return;
         case START_DESTROY_BLOCK:
         case ABORT_DESTROY_BLOCK:
         case STOP_DESTROY_BLOCK:
            this.id_break.id_finally.id_class(var2, var3, var1.id_byte(), this.id_protected.X());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8, Set<rvU_2> var9) {
      double var10 = var9.contains(rvU_2.X) ? this.id_break.rx() : 0.0;
      double var12 = var9.contains(rvU_2.Y) ? this.id_break.re() : 0.0;
      double var14 = var9.contains(rvU_2.Z) ? this.id_break.BO() : 0.0;
      float var16 = var9.contains(rvU_2.Y_ROT) ? (Float)this.id_break.id_throws[15] : 0.0F;
      float var17 = var9.contains(rvU_2.X_ROT) ? (Float)this.id_break.id_throws[16] : 0.0F;
      this.id_goto = new rjU_2(var1, var3, var5);
      if (++this.id_while == Integer.MAX_VALUE) {
         this.id_while = 0;
      }

      this.id_try = this.id_throws;
      this.id_break.id_break(var1, var3, var5, var7, var8);
      this.id_break.id_class.id_class(new rvD_2(var1 - var10, var3 - var12, var5 - var14, var7 - var16, var8 - var17, var9, this.id_while));
   }

   public void id_class(double var1, double var3, double var5, float var7, float var8) {
      this.id_class(var1, var3, var5, var7, var8, Collections.emptySet());
   }

   private boolean id_class(rRR var1, rfl_3 var2) {
      Stream var3 = var1.id_byte(this.id_break, this.id_break.rN().id_break(1.0E-5F), var0 -> true);
      rjC_2 var4 = rjw_3.id_class(var2.id_break(1.0E-5F));
      return var3.anyMatch(var1x -> !rjw_3.id_byte(var1x, var4, rjN_2.id_implements));
   }

   @Override
   public void id_class(rmo_3 var1) {
      rdn_3 var2 = var1.id_break();
      if (var2.id_break() == rdy_3.xi) {
         rcd_3 var3 = var2.id_package();
         if (rkm_3.id_class(var3)) {
            ArrayList var4 = Lists.newArrayList();
            boolean var5 = var1.id_byte();
            if (var5) {
               var4.add(var3.id_native("title"));
            }

            rcy_3 var6 = var3.id_protected("pages", 8);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               var4.add(var6.id_implements(var7));
            }

            int var8 = var1.id_protected();
            if (rhz_3.id_break(var8) || var8 == 40) {
               this.id_class(var4, var5 ? var2x -> this.id_class(var2x.get(0), var2x.subList(1, var2x.size()), var8) : var2x -> this.id_class(var2x, var8));
            }
         }
      }
   }

   @Override
   public void id_class(rZp_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.sU()) {
         rfH_2 var2 = var1.id_break();
         xc_3 var3 = ((rYB)this.id_break.id_throws[7]).id_byte(var2);
         if (((rYB)this.id_break.id_throws[7]).id_class(var2) instanceof ryG_2 var5) {
            var5.id_class(var1.id_protected());
            var5.id_class(var1.id_throws());
            var5.id_class(var1.id_case());
            var5.id_break(var1.id_catch());
            var5.id_class(var1.id_private());
            var5.id_class(var1.id_implements());
            var5.id_break(var1.id_finally());
            var5.id_class(var1.id_extends());
            var5.id_protected(var1.id_native());
            var5.id_throws(var1.id_volatile());
            var5.id_class(var1.id_final());
            var5.id_class(var1.id_package());
            if (var5.id_private()) {
               String var6 = var5.id_throws();
               if (var1.id_byte() == ryM_2.SAVE_AREA) {
                  if (var5.id_synchronized()) {
                     this.id_break.id_class(new rgn_3("structure_block.save_success", var6), false);
                  } else {
                     this.id_break.id_class(new rgn_3("structure_block.save_failure", var6), false);
                  }
               } else if (var1.id_byte() == ryM_2.LOAD_AREA) {
                  if (!var5.id_public()) {
                     this.id_break.id_class(new rgn_3("structure_block.load_not_found", var6), false);
                  } else if (var5.id_class(this.id_break.id_continue())) {
                     this.id_break.id_class(new rgn_3("structure_block.load_success", var6), false);
                  } else {
                     this.id_break.id_class(new rgn_3("structure_block.load_prepare", var6), false);
                  }
               } else if (var1.id_byte() == ryM_2.SCAN_AREA) {
                  if (var5.id_else()) {
                     this.id_break.id_class(new rgn_3("structure_block.size_success", var6), false);
                  } else {
                     this.id_break.id_class(new rgn_3("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.id_break.id_class(new rgn_3("structure_block.invalid_structure_name", var1.id_throws()), false);
            }

            var5.id_break();
            ((rYB)this.id_break.id_throws[7]).id_class(var2, var3, var3, 3);
         }
      }
   }

   @Override
   public void id_class(rZm_1 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      int var2 = var1.id_break();
      rJr_1 var3 = (rJr_1)this.id_break.id_implements[4];
      if (var3 instanceof rJp_1 var4) {
         var4.id_protected(var2);
         var4.id_catch(var2);
      }
   }

   @Override
   public void id_class(rZC var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.sU()) {
         rfH_2 var2 = var1.id_break();
         xc_3 var3 = ((rYB)this.id_break.id_throws[7]).id_byte(var2);
         if (((rYB)this.id_break.id_throws[7]).id_class(var2) instanceof rHj_1 var5) {
            var5.id_class(var1.id_byte());
            var5.id_break(var1.id_protected());
            var5.id_byte(var1.id_throws());
            var5.id_class(var1.id_case());
            var5.id_class(var1.id_catch());
            var5.id_break();
            ((rYB)this.id_break.id_throws[7]).id_class(var2, var3, var3, 3);
         }
      }
   }

   @Override
   public void id_class(rmi_3 var1) {
      ruZ_2.id_class(var1, this, this.id_break.id_continue());
      if (this.id_break.sU()) {
         rfH_2 var2 = var1.id_break();
         if (((rYB)this.id_break.id_throws[7]).id_class(var2) instanceof rHj_1 var4) {
            var4.id_class(this.id_break.id_continue(), var1.id_byte(), var1.id_protected());
         }
      }
   }

   private void id_class(String var1, List<String> var2, int var3) {
      rdn_3 var4 = ((rhz_3)this.id_break.id_implements[1]).id_extends(var3);
      if (var4.id_break() == rdy_3.xi) {
         rdn_3 var5 = new rdn_3(rdy_3.dr);
         rcd_3 var6 = var4.id_package();
         if (var6 != null) {
            var5.id_byte(var6.id_catch());
         }

         var5.id_class("author", rca_3.id_class(this.id_break.g().getString()));
         var5.id_class("title", rca_3.id_class(var1));
         rcy_3 var7 = new rcy_3();

         for (String var9 : var2) {
            rgN_2 var10 = new rgN_2(var9);
            String var11 = rgB_2.id_class(var10);
            var7.add(rca_3.id_class(var11));
         }

         var5.id_class("pages", var7);
         ((rhz_3)this.id_break.id_implements[1]).id_break(var3, var5);
      }
   }

   private void id_class(List<String> var1, int var2) {
      rdn_3 var3 = ((rhz_3)this.id_break.id_implements[1]).id_extends(var2);
      if (var3.id_break() == rdy_3.xi) {
         rcy_3 var4 = new rcy_3();
         var1.stream().map(rca_3::id_class).forEach(var4::add);
         var3.id_class("pages", var4);
      }
   }

   public void id_break() {
      this.id_byte();
      rhN_2 var10000 = this.id_break;
      Double var7 = this.id_break.rx();
      var10000.id_throws[8] = var7;
      var10000 = this.id_break;
      Double var8 = this.id_break.re();
      var10000.id_throws[9] = var8;
      var10000 = this.id_break;
      Double var9 = this.id_break.BO();
      var10000.id_throws[10] = var9;
      this.id_break.id_catch();
      this.id_break.id_break(this.id_native, this.id_volatile, this.id_final, (Float)this.id_break.id_throws[15], (Float)this.id_break.id_throws[16]);
      this.id_throws++;
      this.id_long = this.id_abstract;
      if (this.id_instanceof && !this.id_break.Sc()) {
         if (++this.id_throw > 80) {
            id_byte.warn("{} was kicked for floating too long!", this.id_break.g().getString());
            this.id_class(new rgn_3("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.id_instanceof = false;
         this.id_throw = 0;
      }

      this.id_continue = this.id_break.PO();
      if (this.id_continue != this.id_break && this.id_continue.rU() == this.id_break) {
         this.id_super = this.id_continue.rx();
         this.id_this = this.id_continue.re();
         this.id_else = this.id_continue.BO();
         this.id_synchronized = this.id_continue.rx();
         this.id_return = this.id_continue.re();
         this.id_public = this.id_continue.BO();
         if (this.id_interface && this.id_break.PO().rU() == this.id_break) {
            if (++this.id_char > 80) {
               id_byte.warn("{} was kicked for floating a vehicle too long!", this.id_break.g().getString());
               this.id_class(new rgn_3("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.id_interface = false;
            this.id_char = 0;
         }
      } else {
         this.id_continue = null;
         this.id_interface = false;
         this.id_char = 0;
      }

      long var1 = rqR_2.id_break();
      if (var1 - this.id_case >= 15000L) {
         if (this.id_catch) {
            this.id_class(new rgn_3("disconnect.timeout"));
         } else {
            this.id_catch = true;
            this.id_case = var1;
            this.id_private = var1;
            this.id_class(new rvv_3(this.id_private));
         }
      }

      if (this.id_implements > 0) {
         this.id_implements--;
      }

      if (this.id_finally > 0) {
         this.id_finally--;
      }

      if (this.id_break.id_short() > 0L && this.id_protected.m() > 0 && rqR_2.id_break() - this.id_break.id_short() > (long)(this.id_protected.m() * 1000 * 60)
         )
       {
         this.id_class(new rgn_3("multiplayer.disconnect.idling"));
      }
   }

   private void id_break(String var1) {
      this.id_protected.f().id_class(this.id_break.PL(), var1);
   }

   private static boolean id_break(rZS var0) {
      return !Doubles.isFinite(var0.id_break())
         || !Doubles.isFinite(var0.id_byte())
         || !Doubles.isFinite(var0.id_protected())
         || !Floats.isFinite(var0.id_case())
         || !Floats.isFinite(var0.id_throws());
   }

   private static boolean id_break(rZO var0) {
      return Doubles.isFinite(var0.id_class(0.0))
            && Doubles.isFinite(var0.id_break(0.0))
            && Doubles.isFinite(var0.id_byte(0.0))
            && Floats.isFinite(var0.id_break(0.0F))
            && Floats.isFinite(var0.id_class(0.0F))
         ? Math.abs(var0.id_class(0.0)) > 3.0E7 || Math.abs(var0.id_break(0.0)) > 3.0E7 || Math.abs(var0.id_byte(0.0)) > 3.0E7
         : true;
   }

   private boolean id_protected() {
      return this.id_protected.id_break(this.id_break.sv());
   }
}
