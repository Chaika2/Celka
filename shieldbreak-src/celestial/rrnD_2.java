package celestial;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnD_2 implements MinecraftAccessor {
   public static Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;
   private static long[] id_throws;
   private static boolean[] id_case;
   private static float[] id_catch;
   public Object[] id_break;
   private boolean shieldBreakRenamed;
   private static double[] id_private;

   public void id_byte() {
      Integer var5 = Integer.valueOf(0);
      this.id_break[5] = var5;
      Integer var6 = Integer.valueOf(0);
      this.id_break[6] = var6;
   }

   private static void id_int() {
      id_byte = new short[]{0, 1, 0, 0, 56, 56, 57, 1, 3, 0, 57, 0, 0, 57, 6, 6, 57, 0, 57, 4, 0, 57, 55, 57, 55, 57, 7, 7, 7, 6, 2, 0, 57, 57, 5, 0, 57, 57, 5, 5, 57, 31, 57, 57, 31, 0, 57, 57, 57, 17, 57, 57, 56, 57, 57, 57, 57, 57, 57, 18, 57, 57, 57, 57, 57, 57, 57, 57, 0, 57, 57, 0, 57, 57, 57, 57, 0, 2, 55, 57, 0, 57, 0, 57, 0, 55, 57, 57, 0, 57, 1, 55, 57, 0, 57, 0, 55, 57, 5, 6, 0, 57, 1, 3, 2, 57, 57, 2, 3, 4, 4, 0, 57, 57, 0, 57, 57, 57, 57};
   }

   public rrnD_2(AttackAura var1) {
      this.id_private();
      this.id_break[0] = var1;
      rrnU_2 var7 = new rrnU_2(var1);
      this.id_break[1] = var7;
      System.out.println("[Celestial] ShieldBreak patch loaded (held-item swap)");
   }

   /**
    * Hook used by the patched {@code rrwI_2#b()} (the settings list of every
    * module). It runs when the click GUI builds its setting list and also when
    * the config is saved/loaded, so "ByPass SB" is visible without waiting for
    * the first Attack Aura tick.
    */
   public static void shieldRenameHook(AttackAura var0) {
      if (var0 == null) {
         return;
      }

      rrnD_2 var1 = var0.id_long();
      if (var1 != null) {
         var1.ensureShieldBreakLabel();
      }
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, 78, 39, 51, 26, 119, 78, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 636227653;
   }

   public boolean id_class(AttackAura var1, float var2, int var3, boolean var4, boolean var5, int var6) {
      if (var1.id_continue() == null) {
         return false;
      } else if (!var1.id_instanceof().id_class() && !var1.s() || !((cb_3)id_import.id_class[57]).sL() || ((cb_3)id_import.id_class[57]).sX().id_break() == rdy_3.kN && ((AttackAura)this.id_break[0]).id_double().id_class()) {
         if (var1.id_else().id_class() && C_throws.id_byte().id_return().id_class()) {
            return false;
         } else if (!this.id_class(var2, var3)) {
            return false;
         } else {
            return var1.id_public().id_class() ? this.id_class(var4, var5, var6) : true;
         }
      } else {
         return false;
      }
   }

   public boolean id_class(AttackAura var1) {
      return this.id_class(var1, 0.5F, id_case[38] ? 1 : 0, id_case[39], id_case[40], id_case[41] ? 1 : 0);
   }

   public boolean id_class(float var1, int var2) {
      if (!rrfo_3.id_class(var1)) {
         return false;
      } else {
         return (float)(System.currentTimeMillis() - (Long)this.id_break[2]) >= 500.0F - (float)var2 ? true : false;
      }
   }

   public boolean id_class(boolean var1, boolean var2, int var3) {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().t().id_new()) {
         return true;
      } else if (var1 && !this.id_case()) {
         return true;
      } else {
         if (var2) {
            double var4 = Math.abs((double)((int)((cb_3)id_import.id_class[57]).re()) - ((cb_3)id_import.id_class[57]).re());
            if (var4 == 0.43152384527073195) {
               Integer var12 = 2;
               this.id_break[5] = var12;
            } else if (var4 == 0.0548933470320776) {
               Integer var13 = 3;
               this.id_break[5] = var13;
            }
         }

         boolean var14;
         if (var3 > 0) {
            rrvy_1 var5 = new rrvy_1((cb_3)id_import.id_class[57]);
            var5.id_class(var3);
            var14 = !var5.BL() && (Float)var5.id_throws[31] > 0.0F ? true : false;
         } else {
            var14 = !((cb_3)id_import.id_class[57]).BL() && (Float)((cb_3)id_import.id_class[57]).id_throws[31] > 0.0F ? true : false;
         }

         rrne_3 var15 = ((AttackAura)this.id_break[0]).id_for();
         if (var15.id_break() && var15.id_class()) {
            rrvy_1 var6 = new rrvy_1((cb_3)id_import.id_class[57]);
            List var7 = var6.id_else();
            if (var7.size() > 1) {
               return false;
            }
         }

         return var14;
      }
   }

   public boolean id_class(iB_2 var1, rrTT var2) {
      if ((C_volatile)rrTT.id_break[3] != var2) {
         return false;
      } else {
         float var3 = ((AttackAura)this.id_break[0]).id_try();
         if (var2.id_package()) {
            an_3 var4 = Ph_1.id_class((an_3)var1, ((cb_3)id_import.id_class[57]).id_new(1.0F), var2.id_throws(), var3, ((AttackAura)this.id_break[0]).id_switch().id_class(), (var1x) -> !((AttackAura)this.id_break[0]).P().id_class(var1x) ? true : false);
            if (var4 != var1) {
               return false;
            }
         }

         boolean var18 = ((AttackAura)this.id_break[0]).id_float();
         if (rmD_2.id_break && this.id_case()) {
            ((cb_3)id_import.id_class[57]).c_(false);
            if (var18) {
               if ((Integer)this.id_break[6] == 0) {
                  Integer var11 = Integer.valueOf(1);
                  this.id_break[6] = var11;
               }

               return false;
            }

            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.STOP_SPRINTING));
            Boolean var12 = true;
            this.id_break[4] = var12;
         }

         int var19 = -1;
         if (((AttackAura)this.id_break[0]).id_this().id_class()) {
            var19 = this.shieldBreakPrepare(var1);
         }

         if (((AttackAura)this.id_break[0]).id_double().id_class() && ((cb_3)id_import.id_class[57]).sd()) {
            ((Ax_1)id_import.id_class[55]).id_break((cb_3)id_import.id_class[57]);
         }

         ((Ax_1)id_import.id_class[55]).id_class((cb_3)id_import.id_class[57], var1, true);
         if (var19 >= 0) {
            this.shieldBreakRestore(var19);
         }

         if (var18 && rrjS_2.id_protected()) {
            int var10002 = (Integer)this.id_break[7] + 1;
            Integer var13 = var10002;
            this.id_break[7] = var13;
            if (var10002 >= 1) {
               Integer var14 = Integer.valueOf(0);
               this.id_break[7] = var14;
               Integer var15 = Integer.valueOf(1);
               this.id_break[6] = var15;
            }
         }

         Long var16 = System.currentTimeMillis();
         this.id_break[2] = var16;
         if (this.id_new()) {
            int var5 = ((cb_3)id_import.id_class[57]).id_byte((rLR)rLD.id_protected).id_byte() + 1;
            int var6 = var5 * 2 - var5 / 2;
            if (((cb_3)id_import.id_class[57]).rv().id_byte < -0.15233518685055708) {
               ++var6;
            }

            Integer var17 = var6;
            this.id_break[5] = var17;
         }

         return true;
      }
   }

   public long id_class() {
      return (Long)this.id_break[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6129004129455492945L;
   }

   /**
    * ShieldBreaker: make the aura's next hit land with an axe.
    *
    * MineLegacy resolves the weapon server-side from the player's *selected*
    * slot, so a shield only pops from a real axe hit. A container click
    * (ClickSlot SWAP) is rejected by the server (it answers with a full window
    * resync), therefore the swap uses the same held-item-change packet the
    * client itself uses. The selected slot is switched right before the aura
    * sends its hit and switched back right after it, so the whole sequence fits
    * into one tick and contains exactly one attack:
    *
    *    rme_3(axeHotbarSlot)  ->  UseEntity/ATTACK (axe)  ->  rme_3(oldSlot)
    *
    * Only the local selected-slot value is flipped (nothing is rendered between
    * the packets) and Ax_1.id_new() keeps its own bookkeeping in sync, so the
    * player never sees the switch.
    *
    * @return the previously selected hotbar slot, to be passed to
    *         {@link #shieldBreakRestore(int)}, or -1 when no swap was started
    */
   private int shieldBreakPrepare(iB_2 var1) {
      if (!(var1 instanceof rhd_3)) {
         return -1;
      }

      // target must be actively blocking with a shield
      if (!var1.id_extends(2) || rrfH_2.id_class(var1, rdy_3.kN) == null) {
         return -1;
      }

      cb_3 var2 = (cb_3)id_import.id_class[57];
      if (var2 == null) {
         return -1;
      }

      // -2 main hand, -3 off hand, 0..8 hotbar, -1 not found
      int var3 = rrfY_2.id_class(rxM_2.class);
      if (var3 < 0) {
         if (var3 == -2) {
            // already holding an axe: the normal hit is an axe hit
            return -1;
         }

         // Axe only in the main inventory (9..44). Moving it into the hotbar
         // needs a server round-trip, so it cannot be used in this tick; the
         // pick-item packet puts it into a free hotbar slot and the next aura
         // tick finds it there and does the swap.
         int var4 = rrfY_2.id_class(rxM_2.class, true);
         if (var4 >= 0) {
            ((Ax_1)id_import.id_class[55]).id_class(var4);
         }

         return -1;
      }

      rhz_3 var5 = (rhz_3)var2.id_implements[1];
      int var6 = var5.id_protected;
      if (var6 == var3) {
         return -1;
      }

      var5.id_protected = var3;
      return var6;
   }

   /**
    * Switches the selected slot back to what the player was holding and lets
    * Ax_1 emit the matching held-item-change packet (rme_3).
    */
   private void shieldBreakRestore(int var1) {
      cb_3 var2 = (cb_3)id_import.id_class[57];
      if (var2 == null) {
         return;
      }

      ((rhz_3)var2.id_implements[1]).id_protected = var1;
      ((Ax_1)id_import.id_class[55]).id_package();
      this.id_break[3] = System.currentTimeMillis();
   }

   /**
    * Renames the shipped AttackAura switch "Ломать щит" (group "Удары") to
    * "ByPass SB". It is the only shield-break switch now; this class does not
    * register any extra setting. The value is kept, because the config is
    * loaded before the first in-game tick (settings are matched by name while
    * loading, so an old config still restores the switch correctly).
    */
   private void ensureShieldBreakLabel() {
      if (this.shieldBreakRenamed) {
         return;
      }

      rrIk_1 var1 = ((AttackAura)this.id_break[0]).id_this();
      if (var1 == null) {
         return;
      }

      this.shieldBreakRenamed = true;
      var1.id_byte("ByPass SB");
      System.out.println("[Celestial] ShieldBreak: label renamed to ByPass SB");
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_break[4] = var6;
   }

   public iB_2 id_class(CheckGroup var1) {
      this.ensureShieldBreakLabel();
      float var2 = ((AttackAura)this.id_break[0]).G();
      Predicate<iB_2> var3 = (iB_2 var3x) -> {
         if (var3x == null) {
            return false;
         } else if (var3x == ((cb_3)id_import.id_class[57]).ra()) {
            return false;
         } else if (var3x == (cb_3)id_import.id_class[57]) {
            return false;
         } else if (var3x.id_native()) {
            return false;
         } else if (var3x instanceof rSY) {
            return false;
         } else if (!var3x.Pu()) {
            return false;
         } else {
            if (((AttackAura)this.id_break[0]).id_throw()) {
               if (((cb_3)id_import.id_class[57]).id_class(var3x, iM_2.STANDING, var3x.Pb()) > (double)var2 && ((cb_3)id_import.id_class[57]).id_class(var3x, iM_2.FALL_FLYING, iM_2.STANDING) > (double)var2) {
                  return false;
               }
            } else if (((cb_3)id_import.id_class[57]).id_class(var3x, iM_2.STANDING, var3x.Pb()) > (double)var2 && ((cb_3)id_import.id_class[57]).id_class(var3x, iM_2.FALL_FLYING, var3x.Pb()) > (double)var2) {
               return false;
            }

            return rrff_3.id_class(var3x, var1);
         }
      };
      iB_2 var4 = ((AttackAura)this.id_break[0]).id_continue();
      if (var3.test(var4)) {
         return var4;
      } else {
         Object var5;
         if (var2 == Float.MAX_VALUE) {
            ArrayList var6 = new ArrayList();
            ObjectIterator var7 = ((gm_3)id_import.id_class[56]).id_return().values().iterator();

            while(var7.hasNext()) {
               an_3 var8 = (an_3)var7.next();
               if (var8 instanceof iB_2) {
                  iB_2 var9 = (iB_2)var8;
                  if (var3.test(var9)) {
                     var6.add(var9);
                  }
               }
            }

            var5 = var6;
         } else {
            var5 = ((gm_3)id_import.id_class[56]).id_class(iB_2.class, ((cb_3)id_import.id_class[57]).rN().id_class((double)(var2 * 2.0F)), var3);
         }

         ((List)var5).sort((Comparator)this.id_break[1]);
         return ((List)var5).isEmpty() ? null : (iB_2)((List)var5).get(0);
      }
   }

   public void id_class(AttackAura var1, q_1 var2) {
      if (var2.id_class() == var1.id_default() && this.id_catch()) {
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.START_SPRINTING));
         ((cb_3)id_import.id_class[57]).c_(true);
         this.id_class(false);
      }

   }

   public long id_break() {
      return System.currentTimeMillis() - (Long)this.id_break[2];
   }

   public boolean id_throws() {
      if (((AttackAura)this.id_break[0]).id_import().id_class()) {
         return true;
      } else {
         return ((cb_3)id_import.id_class[57]).id_break((rLR)rLD.id_private) ? true : false;
      }
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_implements();
      id_native();
      id_int();
      id_final();
      id_package();
      id_finally();
      id_volatile();
   }

   private static void id_finally() {
      id_protected = new byte[]{2, 2, 2, 3, 2, 8, -1, 3, 8, 2, 3, 4, 5, 6, 7, 2};
   }

   public boolean id_catch() {
      return (Boolean)this.id_break[4];
   }

   public boolean id_case() {
      boolean var1 = ((cb_3)id_import.id_class[57]).BL();
      if (this.id_throws() && !((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private && var1) {
         return false;
      } else {
         float var2 = 0.8F;
         boolean var3 = ((cb_3)id_import.id_class[57]).PZ() && !((cb_3)id_import.id_class[57]).id_catch(var2) ? true : false;
         boolean var4 = ((gm_3)id_import.id_class[56]).id_break(((cb_3)id_import.id_class[57]).rN().id_protected((double)0.0F, 0.1, (double)0.0F));
         double var5 = Math.abs((double)((int)((cb_3)id_import.id_class[57]).re()) - ((cb_3)id_import.id_class[57]).re());
         boolean var7 = (var5 == (double)0.125F || var5 == (double)0.1875F) && !var4 ? true : false;
         boolean var8 = ((cb_3)id_import.id_class[57]).id_throws(iM_2.STANDING) && var1 ? true : false;
         boolean var9 = !var4 && var1 ? true : false;
         return !((cb_3)id_import.id_class[57]).Sy() && !((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break && !((cb_3)id_import.id_class[57]).id_break((rLR)rLD.id_goto) && !((cb_3)id_import.id_class[57]).id_break((rLR)rLD.id_package) && !((cb_3)id_import.id_class[57]).id_break((rLR)rLD.id_instanceof) && !((cb_3)id_import.id_class[57]).Pm() && !((cb_3)id_import.id_class[57]).o_() && !((cb_3)id_import.id_class[57]).Y() && !((cb_3)id_import.id_class[57]).Pe() && !((cb_3)id_import.id_class[57]).Py() && !var3 && !var7 && !var8 && !var9 ? true : false;
      }
   }

   private static void id_implements() {
      id_case = new boolean[]{false, false, false, false, true, false, true, true, true, true, false, true, true, true, true, true, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, false, true, true, false, true, false, false, true, true, false, false, false, false, false, true, false, true, false, false, false, true, true, false, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true};
   }

   private boolean id_new() {
      return ((cb_3)id_import.id_class[57]).id_break((rLR)rLD.id_protected) && ((cb_3)id_import.id_class[57]).id_byte((rLR)rLD.id_protected).id_byte() < 3 ? true : false;
   }

   private static void id_package() {
      id_private = new double[]{-0.15233518685055708, 0.43152384527073195, 0.0548933470320776, (double)0.0F, 0.1, (double)0.0F, (double)0.125F, (double)0.1875F};
   }

   public long id_protected() {
      return (Long)this.id_break[3];
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[8];
         this.id_break[2] = 0L;
         this.id_break[3] = 0L;
         this.id_break[4] = false;
         this.id_break[5] = 0;
         this.id_break[6] = 0;
         this.id_break[7] = 0;
      }

   }

   private static void id_final() {
      id_catch = new float[]{Float.MAX_VALUE, 2.0F, 1.0F, 0.0F, 0.0F, 0.8F, 0.5F, 500.0F, 500.0F};
   }

   private static void id_volatile() {
      Object[] var0 = new Object[]{0.0F, 1};
      id_class = var0;
   }

   private static void id_native() {
      id_throws = new long[2];
   }
}
