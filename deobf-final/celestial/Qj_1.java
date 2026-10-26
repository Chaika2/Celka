package celestial;

import java.io.File;
import java.util.List;
import java.util.Locale;

public class Qj_1 {
   private final QY class_;
   private boolean break_;
   private final Ql_1 byte_ = new Ql_1();
   private long protected_ = -1L;
   private long throws_ = -1L;
   private long case_ = -1L;
   private boolean catch_;

   public Qj_1(QY var1) {
      this.class_ = var1;
   }

   public String class_() {
      return this.byte_.class_(this.class_.else_().implements_(), (var1, var2) -> {
         if (var1 != 65545) {
            this.class_.else_().class_(var1, var2);
         }
      });
   }

   public void class_(String var1) {
      this.byte_.class_(this.class_.else_().implements_(), var1);
   }

   private void class_(rqO_2 var1, rjU_2 var2, rcd_3 var3) {
      String var4;
      if (var3 != null) {
         var3.continue_("UUID");
         var3.continue_("Pos");
         var3.continue_("Dimension");
         String var5 = var3.volatile_().getString();
         var4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", var1.toString(), var2.break_, var2.byte_, var2.protected_, var5);
      } else {
         var4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", var1.toString(), var2.break_, var2.byte_, var2.protected_);
      }

      this.class_(var4);
   }

   private void class_(xc_3 var1, rfH_2 var2, rcd_3 var3) {
      if (var3 != null) {
         var3.continue_("x");
         var3.continue_("y");
         var3.continue_("z");
         var3.continue_("id");
      }

      StringBuilder var4 = new StringBuilder(Rk_1.class_(var1));
      if (var3 != null) {
         var4.append(var3);
      }

      String var5 = String.format(Locale.ROOT, "/setblock %d %d %d %s", var2.b_(), var2.c_(), var2.d_(), var4);
      this.class_(var5);
   }

   private void class_(boolean var1, boolean var2) {
      rjG_2 var3 = (rjG_2)this.class_.class_[64];
      if (var3 != null) {
         switch (var3.byte_()) {
            case BLOCK:
               rfH_2 var4 = ((rff_3)var3).class_();
               xc_3 var5 = ((rYB)((cb_3)this.class_.class_[57]).throws_[7]).byte_(var4);
               if (var1) {
                  if (var2) {
                     ((Aq_1)((cb_3)this.class_.class_[57]).break_[0]).native_().class_(var4, var3x -> {
                        this.class_(var5, var4, var3x);
                        this.class_("debug.inspect.server.block");
                     });
                  } else {
                     ryO_2 var9 = ((rYB)((cb_3)this.class_.class_[57]).throws_[7]).class_(var4);
                     rcd_3 var10 = var9 != null ? var9.class_(new rcd_3()) : null;
                     this.class_(var5, var4, var10);
                     this.class_("debug.inspect.client.block");
                  }
               } else {
                  this.class_(var5, var4, (rcd_3)null);
                  this.class_("debug.inspect.client.block");
               }
               break;
            case ENTITY:
               an_3 var6 = ((rfo_3)var3).class_();
               rqO_2 var7 = rVL.transient_.break_(var6.BC());
               if (var1) {
                  if (var2) {
                     ((Aq_1)((cb_3)this.class_.class_[57]).break_[0]).native_().class_(var6.V(), var3x -> {
                        this.class_(var7, var6.Ps(), var3x);
                        this.class_("debug.inspect.server.entity");
                     });
                  } else {
                     rcd_3 var8 = var6.case_(new rcd_3());
                     this.class_(var7, var6.Ps(), var8);
                     this.class_("debug.inspect.client.entity");
                  }
               } else {
                  this.class_(var7, var6.Ps(), (rcd_3)null);
                  this.class_("debug.inspect.client.entity");
               }
         }
      }
   }

   private boolean class_(int var1) {
      if (this.protected_ > 0L && this.protected_ < rqR_2.break_() - 100L) {
         return true;
      } else {
         switch (var1) {
            case 65:
               ((yX_2)this.class_.class_[8]).throws_();
               this.class_("debug.reload_chunks.message");
               return true;
            case 66:
               boolean var2 = !this.class_.case_().break_();
               this.class_.case_().break_(var2);
               this.class_(var2 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (((cb_3)this.class_.class_[57]).sW()) {
                  return false;
               } else {
                  Aq_1 var7 = (Aq_1)((cb_3)this.class_.class_[57]).break_[0];
                  if (var7 == null) {
                     return false;
                  }

                  this.class_("debug.copy_location.message");
                  this.class_(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        ((rYB)((cb_3)this.class_.class_[57]).throws_[7]).E().class_(),
                        ((cb_3)this.class_.class_[57]).rx(),
                        ((cb_3)this.class_.class_[57]).re(),
                        ((cb_3)this.class_.class_[57]).BO(),
                        (Float)((cb_3)this.class_.class_[57]).throws_[15],
                        (Float)((cb_3)this.class_.class_[57]).throws_[16]
                     )
                  );
                  return true;
               }
            case 68:
               if ((cq_3)this.class_.class_[19] != null) {
                  ((cq_3)this.class_.class_[19]).throws_().class_(false);
                  ((cq_3)this.class_.class_[19]).class_(null, null, -1, -1, -1);
                  ((cq_3)this.class_.class_[19]).class_();
               }

               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_();
               ((List)TestFunc.byte_[0]).clear();
               return true;
            case 70:
               QF.int_
                  .class_(
                     (Qw_1)this.class_.class_[20],
                     rfU_2.class_((double)(((Qw_1)this.class_.class_[20]).break_ + (vm_3.synchronized_() ? -1 : 1)), QF.int_.throws_(), QF.int_.case_())
                  );
               this.class_("debug.cycle_renderdistance.message", ((Qw_1)this.class_.class_[20]).break_);
               return true;
            case 71:
               boolean var3 = ((yK_2)this.class_.class_[17]).break_();
               this.class_(var3 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               ((Qw_1)this.class_.class_[20]).int_ = !((Qw_1)this.class_.class_[20]).int_;
               this.class_(((Qw_1)this.class_.class_[20]).int_ ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               ((Qw_1)this.class_.class_[20]).break_();
               return true;
            case 73:
               if (!((cb_3)this.class_.class_[57]).sW()) {
                  this.class_(((cb_3)this.class_.class_[57]).catch_(2), !vm_3.synchronized_());
               }

               return true;
            case 76:
               QY var4 = rrbb_3.X();
               ((yX_2)var4.class_[8]).catch_ = 1;
               rgN_2 var5 = new rgN_2(jI_2.class_("of.message.loadingVisibleChunks"));
               ((cq_3)var4.class_[19]).throws_().class_(var5, 201435902);
               return true;
            case 78:
               if (!((cb_3)this.class_.class_[57]).catch_(2)) {
                  this.class_("debug.creative_spectator.error");
               } else if (!((cb_3)this.class_.class_[57]).native_()) {
                  ((cb_3)this.class_.class_[57]).protected_("/gamemode spectator");
               } else {
                  ((cb_3)this.class_.class_[57]).protected_("/gamemode " + ((Ax_1)this.class_.class_[55]).extends_().break_());
               }

               return true;
            case 79:
               if (rrbb_3.rs()) {
                  rrkJ var8 = new rrkJ((vm_3)null, rrbb_3.rE());
                  rrbb_3.X().break_(var8);
               }

               return true;
            case 80:
               ((Qw_1)this.class_.class_[20]).new_ = !((Qw_1)this.class_.class_[20]).new_;
               ((Qw_1)this.class_.class_[20]).break_();
               this.class_(((Qw_1)this.class_.class_[20]).new_ ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.class_("debug.help.message");
               cI_2 var6 = ((cq_3)this.class_.class_[19]).throws_();
               var6.class_(new rgn_3("debug.reload_chunks.help"));
               var6.class_(new rgn_3("debug.show_hitboxes.help"));
               var6.class_(new rgn_3("debug.copy_location.help"));
               var6.class_(new rgn_3("debug.clear_chat.help"));
               var6.class_(new rgn_3("debug.cycle_renderdistance.help"));
               var6.class_(new rgn_3("debug.chunk_boundaries.help"));
               var6.class_(new rgn_3("debug.advanced_tooltips.help"));
               var6.class_(new rgn_3("debug.inspect.help"));
               var6.class_(new rgn_3("debug.creative_spectator.help"));
               var6.class_(new rgn_3("debug.pause_focus.help"));
               var6.class_(new rgn_3("debug.help.help"));
               var6.class_(new rgn_3("debug.reload_resourcepacks.help"));
               var6.class_(new rgn_3("debug.pause.help"));
               var6.class_(new rgn_3("debug.gamemodes.help"));
               return true;
            case 82:
               if (rrbb_3.rs()) {
                  rrdZ.while_();
                  rrdZ.byte_();
               }

               return true;
            case 84:
               this.class_("debug.reload_resourcepacks.message");
               this.class_.private_();
               return true;
            case 293:
               if (!((cb_3)this.class_.class_[57]).catch_(2)) {
                  this.class_("debug.gamemodes.error");
               } else {
                  this.class_.break_(new Zt_1());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void class_(String var1, Object... var2) {
      ((cq_3)this.class_.class_[19])
         .throws_()
         .class_(new rgN_2("").class_(new rgn_3("debug.prefix").class_(new rgF_2[]{rgF_2.YELLOW, rgF_2.BOLD})).break_(" ").class_(new rgn_3(var1, var2)));
   }

   public void class_(long var1) {
      Ve_1.class_(
         var1,
         (var1x, var3, var4, var5, var6) -> this.class_.execute(() -> this.class_(var1x, var3, var4, var5, var6)),
         (var1x, var3, var4) -> this.class_.execute(() -> this.class_(var1x, var3, var4))
      );
   }

   private void class_(long var1, int var3, int var4) {
      if (var1 == this.class_.else_().implements_()) {
         vm_3 var5 = (vm_3)this.class_.class_[73];
         if (var5 != null && this.class_.long_() == null) {
            if (Character.charCount(var3) == 1) {
               vm_3.class_(() -> {
                  if (!rrxr_3.rC.byte_() || !rrxr_3.break_(rrxr_3.rC, (vm_3)this.class_.class_[73], (char)var3, var4)) {
                     boolean var4x = var5.class_((char)var3, var4);
                     if (rrxr_3.rl.byte_() && !var4x) {
                        rrxr_3.break_(rrxr_3.rl, (vm_3)this.class_.class_[73], (char)var3, var4);
                     }
                  }
               }, "charTyped event handler", var5.getClass().getCanonicalName());
            } else {
               for (char var9 : Character.toChars(var3)) {
                  vm_3.class_(() -> {
                     if (!rrxr_3.rC.byte_() || !rrxr_3.break_(rrxr_3.rC, (vm_3)this.class_.class_[73], var9, var4)) {
                        boolean var4x = var5.class_(var9, var4);
                        if (rrxr_3.rl.byte_() && !var4x) {
                           rrxr_3.break_(rrxr_3.rl, (vm_3)this.class_.class_[73], var9, var4);
                        }
                     }
                  }, "charTyped event handler", var5.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void class_(long var1, int var3, int var4, int var5, int var6) {
      if (var1 == this.class_.else_().implements_()) {
         boolean var7 = Ve_1.class_(QY.instanceof_().else_().implements_(), 292);
         if (this.protected_ > 0L) {
            if (!Ve_1.class_(QY.instanceof_().else_().implements_(), 67) || !var7) {
               this.protected_ = -1L;
            }
         } else if (Ve_1.class_(QY.instanceof_().else_().implements_(), 67) && var7) {
            this.catch_ = true;
            this.protected_ = rqR_2.break_();
            this.throws_ = rqR_2.break_();
            this.case_ = 0L;
         }

         Va_1 var8 = Ve_1.class_(var3, var4);
         if (rrLs_1.class_(var8, var3, var5).byte_()) {
            return;
         }

         vm_3 var9 = (vm_3)this.class_.class_[73];
         if ((!((vm_3)this.class_.class_[73] instanceof mI_2) || ((mI_2)var9).throws_ <= rqR_2.break_() - 20L) && var5 == 1) {
            if (((Qw_1)this.class_.class_[20]).y.class_(var3, var4)) {
               this.class_.else_().private_();
               ((Qw_1)this.class_.class_[20]).s = this.class_.else_().finally_();
               ((Qw_1)this.class_.class_[20]).break_();
               return;
            }

            if (((Qw_1)this.class_.class_[20]).n.class_(var3, var4)) {
               if (vm_3.else_()) {
               }

               rqW_2.class_(
                  (File)this.class_.class_[24],
                  this.class_.else_().extends_(),
                  this.class_.else_().native_(),
                  this.class_.B(),
                  var1x -> this.class_.execute(() -> ((cq_3)this.class_.class_[19]).throws_().class_(var1x))
               );
               return;
            }
         }

         if (var9 != null && var9.catch_() instanceof Lu_1 && ((Lu_1)var9.catch_()).volatile_()) {
            boolean var13 = false;
         } else {
            boolean var10000 = true;
         }

         if (var9 != null) {
            boolean[] var11 = new boolean[]{false};
            vm_3.class_(() -> {
               if (var5 != 1 && (var5 != 2 || !this.break_)) {
                  if (var5 == 0) {
                     if (rrxr_3.rp.byte_()) {
                        var11[0] = rrxr_3.break_(rrxr_3.rp, (vm_3)this.class_.class_[73], var3, var4, var6);
                        if (var11[0]) {
                           return;
                        }
                     }

                     var11[0] = var9.break_(var3, var4, var6);
                     if (rrxr_3.rq.byte_() && !var11[0]) {
                        var11[0] = rrxr_3.break_(rrxr_3.rq, (vm_3)this.class_.class_[73], var3, var4, var6);
                     }
                  }
               } else {
                  if (rrxr_3.rH.byte_()) {
                     var11[0] = rrxr_3.break_(rrxr_3.rH, (vm_3)this.class_.class_[73], var3, var4, var6);
                     if (var11[0]) {
                        return;
                     }
                  }

                  var11[0] = var9.class_(var3, var4, var6);
                  if (rrxr_3.ry.byte_() && !var11[0]) {
                     var11[0] = rrxr_3.break_(rrxr_3.ry, (vm_3)this.class_.class_[73], var3, var4, var6);
                  }
               }
            }, "keyPressed event handler", var9.getClass().getCanonicalName());
            if (var11[0]) {
               return;
            }
         }

         if ((vm_3)this.class_.class_[73] == null || ((vm_3)this.class_.class_[73]).continue_) {
            if (var5 == 0) {
               Vu_1.class_(var8, false);
               if (var3 == 292) {
                  if (this.catch_) {
                     this.catch_ = false;
                  } else {
                     ((Qw_1)this.class_.class_[20]).R = !((Qw_1)this.class_.class_[20]).R;
                     ((Qw_1)this.class_.class_[20]).Y = ((Qw_1)this.class_.class_[20]).R && vm_3.synchronized_();
                     ((Qw_1)this.class_.class_[20]).o = ((Qw_1)this.class_.class_[20]).R && vm_3.return_();
                     if (((Qw_1)this.class_.class_[20]).R) {
                        if (((Qw_1)this.class_.class_[20]).rA) {
                           ((Qw_1)this.class_.class_[20]).o = true;
                        }

                        if (((Qw_1)this.class_.class_[20]).rn) {
                           ((Qw_1)this.class_.class_[20]).Y = true;
                        }
                     }
                  }
               }
            } else {
               if (var3 == 293 && (Hh_1)this.class_.class_[16] != null) {
                  ((Hh_1)this.class_.class_[16]).byte_();
               }

               if ((vm_3)this.class_.class_[73] == null) {
                  if (var5 == 1) {
                     rrLB.break_((rrLS)rrLS.staticFields5263c46d9cc33ff8a76200218759034b[1], var3, var7);
                  }

                  if (var3 == 256) {
                     this.class_.break_(var7);
                  }

                  boolean var12 = var7 && this.class_(var3);
                  this.catch_ |= var12;
                  if (var3 == 290) {
                     ((Qw_1)this.class_.class_[20]).g = !((Qw_1)this.class_.class_[20]).g;
                  }
               }

               Vu_1.class_(var8, true);
               Vu_1.class_(var8);
            }
         }
      }
   }

   public void class_(boolean var1) {
      this.break_ = var1;
   }

   private void break_(String var1, Object... var2) {
      ((cq_3)this.class_.class_[19])
         .throws_()
         .class_(new rgN_2("").class_(new rgn_3("debug.prefix").class_(new rgF_2[]{rgF_2.RED, rgF_2.BOLD})).break_(" ").class_(new rgn_3(var1, var2)));
   }

   public void break_() {
      if (this.protected_ > 0L) {
         long var1 = rqR_2.break_();
         long var3 = 10000L - (var1 - this.protected_);
         long var5 = var1 - this.throws_;
         if (var3 < 0L) {
            if (vm_3.else_()) {
               gb_3.class_();
            }

            throw new KU(new KY("Manually triggered debug crash", new Throwable()));
         }

         if (var5 >= 1000L) {
            if (this.case_ == 0L) {
               this.class_("debug.crash.message");
            } else {
               this.break_("debug.crash.warning", rfU_2.case_((float)var3 / 1000.0F));
            }

            this.throws_ = var1;
            this.case_++;
         }
      }
   }
}
