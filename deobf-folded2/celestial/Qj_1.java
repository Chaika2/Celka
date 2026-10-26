package celestial;

import java.io.File;
import java.util.List;
import java.util.Locale;

public class Qj_1 {
   private final QY id_class;
   private boolean id_break;
   private final Ql_1 id_byte = new Ql_1();
   private long id_protected = -1L;
   private long id_throws = -1L;
   private long id_case = -1L;
   private boolean id_catch;

   public Qj_1(QY var1) {
      this.id_class = var1;
   }

   public String id_class() {
      return this.id_byte.id_class(this.id_class.id_else().id_implements(), (var1, var2) -> {
         if (var1 != 65545) {
            this.id_class.id_else().id_class(var1, var2);
         }
      });
   }

   public void id_class(String var1) {
      this.id_byte.id_class(this.id_class.id_else().id_implements(), var1);
   }

   private void id_class(rqO_2 var1, rjU_2 var2, rcd_3 var3) {
      String var4;
      if (var3 != null) {
         var3.id_continue("UUID");
         var3.id_continue("Pos");
         var3.id_continue("Dimension");
         String var5 = var3.id_volatile().getString();
         var4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", var1.toString(), var2.id_break, var2.id_byte, var2.id_protected, var5);
      } else {
         var4 = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", var1.toString(), var2.id_break, var2.id_byte, var2.id_protected);
      }

      this.id_class(var4);
   }

   private void id_class(xc_3 var1, rfH_2 var2, rcd_3 var3) {
      if (var3 != null) {
         var3.id_continue("x");
         var3.id_continue("y");
         var3.id_continue("z");
         var3.id_continue("id");
      }

      StringBuilder var4 = new StringBuilder(Rk_1.id_class(var1));
      if (var3 != null) {
         var4.append(var3);
      }

      String var5 = String.format(Locale.ROOT, "/setblock %d %d %d %s", var2.b_(), var2.c_(), var2.d_(), var4);
      this.id_class(var5);
   }

   private void id_class(boolean var1, boolean var2) {
      rjG_2 var3 = (rjG_2)this.id_class.id_class[64];
      if (var3 != null) {
         switch (var3.id_byte()) {
            case BLOCK:
               rfH_2 var4 = ((rff_3)var3).id_class();
               xc_3 var5 = ((rYB)((cb_3)this.id_class.id_class[57]).id_throws[7]).id_byte(var4);
               if (var1) {
                  if (var2) {
                     ((Aq_1)((cb_3)this.id_class.id_class[57]).id_break[0]).id_native().id_class(var4, var3x -> {
                        this.id_class(var5, var4, var3x);
                        this.id_class("debug.inspect.server.block");
                     });
                  } else {
                     ryO_2 var9 = ((rYB)((cb_3)this.id_class.id_class[57]).id_throws[7]).id_class(var4);
                     rcd_3 var10 = var9 != null ? var9.id_class(new rcd_3()) : null;
                     this.id_class(var5, var4, var10);
                     this.id_class("debug.inspect.client.block");
                  }
               } else {
                  this.id_class(var5, var4, (rcd_3)null);
                  this.id_class("debug.inspect.client.block");
               }
               break;
            case ENTITY:
               an_3 var6 = ((rfo_3)var3).id_class();
               rqO_2 var7 = rVL.id_transient.id_break(var6.BC());
               if (var1) {
                  if (var2) {
                     ((Aq_1)((cb_3)this.id_class.id_class[57]).id_break[0]).id_native().id_class(var6.V(), var3x -> {
                        this.id_class(var7, var6.Ps(), var3x);
                        this.id_class("debug.inspect.server.entity");
                     });
                  } else {
                     rcd_3 var8 = var6.id_case(new rcd_3());
                     this.id_class(var7, var6.Ps(), var8);
                     this.id_class("debug.inspect.client.entity");
                  }
               } else {
                  this.id_class(var7, var6.Ps(), (rcd_3)null);
                  this.id_class("debug.inspect.client.entity");
               }
         }
      }
   }

   private boolean id_class(int var1) {
      if (this.id_protected > 0L && this.id_protected < rqR_2.id_break() - 100L) {
         return true;
      } else {
         switch (var1) {
            case 65:
               ((yX_2)this.id_class.id_class[8]).id_throws();
               this.id_class("debug.reload_chunks.message");
               return true;
            case 66:
               boolean var2 = !this.id_class.id_case().id_break();
               this.id_class.id_case().id_break(var2);
               this.id_class(var2 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off");
               return true;
            case 67:
               if (((cb_3)this.id_class.id_class[57]).sW()) {
                  return false;
               } else {
                  Aq_1 var7 = (Aq_1)((cb_3)this.id_class.id_class[57]).id_break[0];
                  if (var7 == null) {
                     return false;
                  }

                  this.id_class("debug.copy_location.message");
                  this.id_class(
                     String.format(
                        Locale.ROOT,
                        "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f",
                        ((rYB)((cb_3)this.id_class.id_class[57]).id_throws[7]).E().id_class(),
                        ((cb_3)this.id_class.id_class[57]).rx(),
                        ((cb_3)this.id_class.id_class[57]).re(),
                        ((cb_3)this.id_class.id_class[57]).BO(),
                        (Float)((cb_3)this.id_class.id_class[57]).id_throws[15],
                        (Float)((cb_3)this.id_class.id_class[57]).id_throws[16]
                     )
                  );
                  return true;
               }
            case 68:
               if ((cq_3)this.id_class.id_class[19] != null) {
                  ((cq_3)this.id_class.id_class[19]).id_throws().id_class(false);
                  ((cq_3)this.id_class.id_class[19]).id_class(null, null, -1, -1, -1);
                  ((cq_3)this.id_class.id_class[19]).id_class();
               }

               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class();
               ((List)TestFunc.id_byte[0]).clear();
               return true;
            case 70:
               QF.id_int
                  .id_class(
                     (Qw_1)this.id_class.id_class[20],
                     rfU_2.id_class(
                        (double)(((Qw_1)this.id_class.id_class[20]).id_break + (vm_3.id_synchronized() ? -1 : 1)), QF.id_int.id_throws(), QF.id_int.id_case()
                     )
                  );
               this.id_class("debug.cycle_renderdistance.message", ((Qw_1)this.id_class.id_class[20]).id_break);
               return true;
            case 71:
               boolean var3 = ((yK_2)this.id_class.id_class[17]).id_break();
               this.id_class(var3 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off");
               return true;
            case 72:
               ((Qw_1)this.id_class.id_class[20]).id_int = !((Qw_1)this.id_class.id_class[20]).id_int;
               this.id_class(((Qw_1)this.id_class.id_class[20]).id_int ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off");
               ((Qw_1)this.id_class.id_class[20]).id_break();
               return true;
            case 73:
               if (!((cb_3)this.id_class.id_class[57]).sW()) {
                  this.id_class(((cb_3)this.id_class.id_class[57]).id_catch(2), !vm_3.id_synchronized());
               }

               return true;
            case 76:
               QY var4 = rrbb_3.X();
               ((yX_2)var4.id_class[8]).id_catch = 1;
               rgN_2 var5 = new rgN_2(jI_2.id_class("of.message.loadingVisibleChunks"));
               ((cq_3)var4.id_class[19]).id_throws().id_class(var5, 201435902);
               return true;
            case 78:
               if (!((cb_3)this.id_class.id_class[57]).id_catch(2)) {
                  this.id_class("debug.creative_spectator.error");
               } else if (!((cb_3)this.id_class.id_class[57]).id_native()) {
                  ((cb_3)this.id_class.id_class[57]).id_protected("/gamemode spectator");
               } else {
                  ((cb_3)this.id_class.id_class[57]).id_protected("/gamemode " + ((Ax_1)this.id_class.id_class[55]).id_extends().id_break());
               }

               return true;
            case 79:
               if (rrbb_3.rs()) {
                  rrkJ var8 = new rrkJ((vm_3)null, rrbb_3.rE());
                  rrbb_3.X().id_break(var8);
               }

               return true;
            case 80:
               ((Qw_1)this.id_class.id_class[20]).id_new = !((Qw_1)this.id_class.id_class[20]).id_new;
               ((Qw_1)this.id_class.id_class[20]).id_break();
               this.id_class(((Qw_1)this.id_class.id_class[20]).id_new ? "debug.pause_focus.on" : "debug.pause_focus.off");
               return true;
            case 81:
               this.id_class("debug.help.message");
               cI_2 var6 = ((cq_3)this.id_class.id_class[19]).id_throws();
               var6.id_class(new rgn_3("debug.reload_chunks.help"));
               var6.id_class(new rgn_3("debug.show_hitboxes.help"));
               var6.id_class(new rgn_3("debug.copy_location.help"));
               var6.id_class(new rgn_3("debug.clear_chat.help"));
               var6.id_class(new rgn_3("debug.cycle_renderdistance.help"));
               var6.id_class(new rgn_3("debug.chunk_boundaries.help"));
               var6.id_class(new rgn_3("debug.advanced_tooltips.help"));
               var6.id_class(new rgn_3("debug.inspect.help"));
               var6.id_class(new rgn_3("debug.creative_spectator.help"));
               var6.id_class(new rgn_3("debug.pause_focus.help"));
               var6.id_class(new rgn_3("debug.help.help"));
               var6.id_class(new rgn_3("debug.reload_resourcepacks.help"));
               var6.id_class(new rgn_3("debug.pause.help"));
               var6.id_class(new rgn_3("debug.gamemodes.help"));
               return true;
            case 82:
               if (rrbb_3.rs()) {
                  rrdZ.id_while();
                  rrdZ.id_byte();
               }

               return true;
            case 84:
               this.id_class("debug.reload_resourcepacks.message");
               this.id_class.id_private();
               return true;
            case 293:
               if (!((cb_3)this.id_class.id_class[57]).id_catch(2)) {
                  this.id_class("debug.gamemodes.error");
               } else {
                  this.id_class.id_break(new Zt_1());
               }

               return true;
            default:
               return false;
         }
      }
   }

   private void id_class(String var1, Object... var2) {
      ((cq_3)this.id_class.id_class[19])
         .id_throws()
         .id_class(
            new rgN_2("").id_class(new rgn_3("debug.prefix").id_class(new rgF_2[]{rgF_2.YELLOW, rgF_2.BOLD})).id_break(" ").id_class(new rgn_3(var1, var2))
         );
   }

   public void id_class(long var1) {
      Ve_1.id_class(
         var1,
         (var1x, var3, var4, var5, var6) -> this.id_class.execute(() -> this.id_class(var1x, var3, var4, var5, var6)),
         (var1x, var3, var4) -> this.id_class.execute(() -> this.id_class(var1x, var3, var4))
      );
   }

   private void id_class(long var1, int var3, int var4) {
      if (var1 == this.id_class.id_else().id_implements()) {
         vm_3 var5 = (vm_3)this.id_class.id_class[73];
         if (var5 != null && this.id_class.id_long() == null) {
            if (Character.charCount(var3) == 1) {
               vm_3.id_class(() -> {
                  if (!rrxr_3.rC.id_byte() || !rrxr_3.id_break(rrxr_3.rC, (vm_3)this.id_class.id_class[73], (char)var3, var4)) {
                     boolean var4x = var5.id_class((char)var3, var4);
                     if (rrxr_3.rl.id_byte() && !var4x) {
                        rrxr_3.id_break(rrxr_3.rl, (vm_3)this.id_class.id_class[73], (char)var3, var4);
                     }
                  }
               }, "charTyped event handler", var5.getClass().getCanonicalName());
            } else {
               for (char var9 : Character.toChars(var3)) {
                  vm_3.id_class(() -> {
                     if (!rrxr_3.rC.id_byte() || !rrxr_3.id_break(rrxr_3.rC, (vm_3)this.id_class.id_class[73], var9, var4)) {
                        boolean var4x = var5.id_class(var9, var4);
                        if (rrxr_3.rl.id_byte() && !var4x) {
                           rrxr_3.id_break(rrxr_3.rl, (vm_3)this.id_class.id_class[73], var9, var4);
                        }
                     }
                  }, "charTyped event handler", var5.getClass().getCanonicalName());
               }
            }
         }
      }
   }

   public void id_class(long var1, int var3, int var4, int var5, int var6) {
      if (var1 == this.id_class.id_else().id_implements()) {
         boolean var7 = Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 292);
         if (this.id_protected > 0L) {
            if (!Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 67) || !var7) {
               this.id_protected = -1L;
            }
         } else if (Ve_1.id_class(QY.id_instanceof().id_else().id_implements(), 67) && var7) {
            this.id_catch = true;
            this.id_protected = rqR_2.id_break();
            this.id_throws = rqR_2.id_break();
            this.id_case = 0L;
         }

         Va_1 var8 = Ve_1.id_class(var3, var4);
         if (rrLs_1.id_class(var8, var3, var5).id_byte()) {
            return;
         }

         vm_3 var9 = (vm_3)this.id_class.id_class[73];
         if ((!((vm_3)this.id_class.id_class[73] instanceof mI_2) || ((mI_2)var9).id_throws <= rqR_2.id_break() - 20L) && var5 == 1) {
            if (((Qw_1)this.id_class.id_class[20]).y.id_class(var3, var4)) {
               this.id_class.id_else().id_private();
               ((Qw_1)this.id_class.id_class[20]).s = this.id_class.id_else().id_finally();
               ((Qw_1)this.id_class.id_class[20]).id_break();
               return;
            }

            if (((Qw_1)this.id_class.id_class[20]).n.id_class(var3, var4)) {
               if (vm_3.id_else()) {
               }

               rqW_2.id_class(
                  (File)this.id_class.id_class[24],
                  this.id_class.id_else().id_extends(),
                  this.id_class.id_else().id_native(),
                  this.id_class.B(),
                  var1x -> this.id_class.execute(() -> ((cq_3)this.id_class.id_class[19]).id_throws().id_class(var1x))
               );
               return;
            }
         }

         if (var9 != null && var9.id_catch() instanceof Lu_1 && ((Lu_1)var9.id_catch()).id_volatile()) {
            boolean var13 = false;
         } else {
            boolean var10000 = true;
         }

         if (var9 != null) {
            boolean[] var11 = new boolean[]{false};
            vm_3.id_class(() -> {
               if (var5 != 1 && (var5 != 2 || !this.id_break)) {
                  if (var5 == 0) {
                     if (rrxr_3.rp.id_byte()) {
                        var11[0] = rrxr_3.id_break(rrxr_3.rp, (vm_3)this.id_class.id_class[73], var3, var4, var6);
                        if (var11[0]) {
                           return;
                        }
                     }

                     var11[0] = var9.id_break(var3, var4, var6);
                     if (rrxr_3.rq.id_byte() && !var11[0]) {
                        var11[0] = rrxr_3.id_break(rrxr_3.rq, (vm_3)this.id_class.id_class[73], var3, var4, var6);
                     }
                  }
               } else {
                  if (rrxr_3.rH.id_byte()) {
                     var11[0] = rrxr_3.id_break(rrxr_3.rH, (vm_3)this.id_class.id_class[73], var3, var4, var6);
                     if (var11[0]) {
                        return;
                     }
                  }

                  var11[0] = var9.id_class(var3, var4, var6);
                  if (rrxr_3.ry.id_byte() && !var11[0]) {
                     var11[0] = rrxr_3.id_break(rrxr_3.ry, (vm_3)this.id_class.id_class[73], var3, var4, var6);
                  }
               }
            }, "keyPressed event handler", var9.getClass().getCanonicalName());
            if (var11[0]) {
               return;
            }
         }

         if ((vm_3)this.id_class.id_class[73] == null || ((vm_3)this.id_class.id_class[73]).id_continue) {
            if (var5 == 0) {
               Vu_1.id_class(var8, false);
               if (var3 == 292) {
                  if (this.id_catch) {
                     this.id_catch = false;
                  } else {
                     ((Qw_1)this.id_class.id_class[20]).R = !((Qw_1)this.id_class.id_class[20]).R;
                     ((Qw_1)this.id_class.id_class[20]).Y = ((Qw_1)this.id_class.id_class[20]).R && vm_3.id_synchronized();
                     ((Qw_1)this.id_class.id_class[20]).o = ((Qw_1)this.id_class.id_class[20]).R && vm_3.id_return();
                     if (((Qw_1)this.id_class.id_class[20]).R) {
                        if (((Qw_1)this.id_class.id_class[20]).rA) {
                           ((Qw_1)this.id_class.id_class[20]).o = true;
                        }

                        if (((Qw_1)this.id_class.id_class[20]).rn) {
                           ((Qw_1)this.id_class.id_class[20]).Y = true;
                        }
                     }
                  }
               }
            } else {
               if (var3 == 293 && (Hh_1)this.id_class.id_class[16] != null) {
                  ((Hh_1)this.id_class.id_class[16]).id_byte();
               }

               if ((vm_3)this.id_class.id_class[73] == null) {
                  if (var5 == 1) {
                     rrLB.id_break((rrLS)rrLS.staticFields5263c46d9cc33ff8a76200218759034b[1], var3, var7);
                  }

                  if (var3 == 256) {
                     this.id_class.id_break(var7);
                  }

                  boolean var12 = var7 && this.id_class(var3);
                  this.id_catch |= var12;
                  if (var3 == 290) {
                     ((Qw_1)this.id_class.id_class[20]).g = !((Qw_1)this.id_class.id_class[20]).g;
                  }
               }

               Vu_1.id_class(var8, true);
               Vu_1.id_class(var8);
            }
         }
      }
   }

   public void id_class(boolean var1) {
      this.id_break = var1;
   }

   private void id_break(String var1, Object... var2) {
      ((cq_3)this.id_class.id_class[19])
         .id_throws()
         .id_class(new rgN_2("").id_class(new rgn_3("debug.prefix").id_class(new rgF_2[]{rgF_2.RED, rgF_2.BOLD})).id_break(" ").id_class(new rgn_3(var1, var2)));
   }

   public void id_break() {
      if (this.id_protected > 0L) {
         long var1 = rqR_2.id_break();
         long var3 = 10000L - (var1 - this.id_protected);
         long var5 = var1 - this.id_throws;
         if (var3 < 0L) {
            if (vm_3.id_else()) {
               gb_3.id_class();
            }

            throw new KU(new KY("Manually triggered debug crash", new Throwable()));
         }

         if (var5 >= 1000L) {
            if (this.id_case == 0L) {
               this.id_class("debug.crash.message");
            } else {
               this.id_break("debug.crash.warning", rfU_2.id_case((float)var3 / 1000.0F));
            }

            this.id_throws = var1;
            this.id_case++;
         }
      }
   }
}
