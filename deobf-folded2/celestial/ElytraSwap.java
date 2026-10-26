package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ElytraSwap extends Module {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static long[] id_throws;
   public Object[] id_break;
   private static int[] id_catch;
   private static short[] id_private;
   private static String[] id_implements;

   private void id_char() {
      this.id_super();
      boolean var1 = rrfY_2.id_class(rdy_3.kc);
      rdn_3 var2 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
      if (var2.id_break() != rdy_3.kc || var1) {
         int var3 = rrfY_2.id_break(rrfY_2.id_class(id_protected[21], false));
         if (var3 != -1) {
            if (((rrIk_1)this.id_break[7]).id_class() && rrfZ_2.id_byte()) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), "Вы находитесь в ПВП режиме", 2000));
            } else {
               ((rrmi_3)this.id_break[10]).id_class(var2, var3);
               this.id_class(var3, 6);
               Boolean var8 = true;
               this.id_break[13] = var8;
            }
         }
      }
   }

   public ElytraSwap() {
      super("Elytra Swap", "Автоматически переключает слот\nс нагрудником на элитру", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_super();
      rrIF var5 = new rrIF("Клавиша свапа", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_break[0] = var5;
      rrIF var6 = new rrIF("Клавиша\nфейерверка", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Получил урон", false);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Приземлился", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Нанёс урон", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Автоматический полёт", true);
      this.id_break[5] = var10;
      rrIk_1 var11 = new rrIk_1("Запускать 1 фейерверк", false);
      this.id_break[6] = var11;
      rrIk_1 var12 = new rrIk_1("Не работать в ПВП", false);
      this.id_break[7] = var12;
      rrfP_2 var13 = new rrfP_2();
      this.id_break[8] = var13;
      rrmi_3 var14 = new rrmi_3();
      this.id_break[10] = var14;
      rrfg_3 var15 = new rrfg_3();
      this.id_break[11] = var15;
      this.id_class(
         new Setting[]{
            new rrIc_1("Перекл. если", (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[2], (rrIk_1)this.id_break[3]),
            (rrIF)this.id_break[0],
            (rrIF)this.id_break[1],
            (rrIk_1)this.id_break[5],
            (rrIk_1)this.id_break[6],
            (rrIk_1)this.id_break[7]
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_implements = new String[]{
         new String("Elytra Swap"),
         new String("Автоматически переключает слот\nс нагрудником на элитру"),
         new String("Клавиша свапа"),
         new String("Клавиша\nфейерверка"),
         new String("Получил урон"),
         new String("Приземлился"),
         new String("Нанёс урон"),
         new String("Автоматический полёт"),
         new String("Запускать 1 фейерверк"),
         new String("Не работать в ПВП"),
         new String("Перекл. если"),
         new String("Вы находитесь в ПВП режиме")
      };
   }

   private boolean id_interface() {
      this.id_super();
      if (!(Boolean)this.id_break[13]) {
         return false;
      } else if (((rrIk_1)this.id_break[2]).id_class() && ((rrfg_3)this.id_break[11]).id_class()) {
         return true;
      } else {
         return ((rrIk_1)this.id_break[3]).id_class() && ((cb_3)id_import.id_class[57]).BL() && ((cb_3)id_import.id_class[57]).id_break[40]
            ? true
            : id_protected[30];
      }
   }

   private void id_class(int var1, int var2) {
      int var3 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
      if (var1 > 36) {
         ((Ax_1)id_import.id_class[55]).id_class(var3, var2, var1 - 36, rXa_1.SWAP, false);
      } else {
         int var4 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected % 8 + 1;
         ((Ax_1)id_import.id_class[55]).id_class(var3, var1, var4, rXa_1.SWAP, true);
         ((Ax_1)id_import.id_class[55]).id_class(var3, var2, var4, rXa_1.SWAP, true);
         ((Ax_1)id_import.id_class[55]).id_class(var3, var1, var4, rXa_1.SWAP, false);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1596290211;
   }

   @EventTarget
   public void id_class(rrAg_1 var1) {
      this.id_super();
      rdn_3 var2 = var1.id_byte();
      if ((rdn_3)this.id_break[12] != null) {
         if (rdn_3.id_break(var2, (rdn_3)this.id_break[12])) {
            if (var2.id_break() == rdy_3.kc) {
               Boolean var7 = false;
               this.id_break[13] = var7;
            } else {
               ((rrmi_3)this.id_break[10]).id_class(var2, var1.id_class());
               Boolean var8 = true;
               this.id_break[13] = var8;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAK var1) {
      this.id_super();
      rdn_3 var6 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
      this.id_break[12] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2268418545072937999L;
   }

   @EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rhd_3 && ((rrIk_1)this.id_break[4]).id_class() && (Boolean)this.id_break[13]) {
         this.id_continue();
      }
   }

   @EventTarget
   public void id_class(rrnh_3 var1) {
      this.id_super();
      ((rrfg_3)this.id_break[11]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      ((rrfP_2)this.id_break[8]).id_class(var1);
      ((rrfg_3)this.id_break[11]).id_class(var1);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_break[8]).id_class(rqR_2.id_break() - this.id_break[9] > 200L ? true : id_protected[14]);
         if (this.id_interface()) {
            this.id_continue();
         }

         if (((cb_3)id_import.id_class[57]).Sy()) {
            rdn_3 var2 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
            if (var2.id_break() == rdy_3.kc) {
               Integer var7 = (Integer)this.id_break[15] + 1;
               this.id_break[15] = var7;
               if (((rrIk_1)this.id_break[6]).id_class() && (Integer)this.id_break[15] < 2) {
                  this.id_try();
               }
            } else {
               Integer var8 = 0;
               this.id_break[15] = var8;
            }

            if ((Boolean)this.id_break[14]) {
               this.id_try();
               Boolean var9 = false;
               this.id_break[14] = var9;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_super();
      if (var1.id_break() == ((rrIF)this.id_break[0]).id_finally().id_byte()) {
         this.id_goto();
      } else if (var1.id_break() == ((rrIF)this.id_break[1]).id_finally().id_byte() && ((cb_3)id_import.id_class[57]).Sy()) {
         Boolean var6 = true;
         this.id_break[14] = var6;
      }
   }

   @EventTarget
   public void id_class(rrAL var1) {
      this.id_return();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, 53, -10, 114, 102, -47, 94, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private int id_break(int var1) {
      this.id_super();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_break[8]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_break[9] = var6;
         return var1;
      } else {
         return id_byte[18];
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      this.id_while();
      ((rrmi_3)this.id_break[10]).id_throws();
      Boolean var6 = false;
      this.id_break[14] = var6;
      Integer var7 = 0;
      this.id_break[15] = var7;
   }

   private void id_goto() {
      rdn_3 var1 = ((cb_3)id_import.id_class[57]).id_class(rXQ.CHEST);
      if (var1.id_break() == rdy_3.kc) {
         this.id_continue();
      } else {
         this.id_char();
      }
   }

   private void id_continue() {
      this.id_super();
      if (((rrmi_3)this.id_break[10]).id_class()) {
         int var1 = ((rrmi_3)this.id_break[10]).id_class(true);
         if (var1 != -1) {
            this.id_class(var1, 6);
            this.id_while();
         }
      }
   }

   private static void id_else() {
      id_private = new short[]{
         4,
         0,
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         10,
         11,
         4,
         2,
         3,
         0,
         1,
         5,
         6,
         7,
         10,
         14,
         15,
         0,
         1,
         57,
         14,
         0,
         8,
         9,
         57,
         57,
         15,
         15,
         6,
         15,
         15,
         14,
         14,
         8,
         11,
         57,
         12,
         12,
         12,
         13,
         10,
         13,
         11,
         4,
         13,
         57,
         55,
         57,
         57,
         57,
         1,
         57,
         1,
         8,
         57,
         1,
         55,
         9,
         57,
         7,
         0,
         2000,
         10,
         13,
         10,
         10,
         0,
         5,
         57,
         38,
         13,
         2,
         11,
         3,
         57,
         57,
         40,
         57,
         4,
         55,
         57,
         1,
         55,
         55,
         55,
         0,
         11,
         15,
         13
      };
   }

   private static void id_instanceof() {
      id_catch = new int[]{Integer.MAX_VALUE};
   }

   private static void id_new() {
      id_protected = new boolean[]{
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   private void id_return() {
      this.id_super();
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
      if (((rrIk_1)this.id_break[5]).id_class()) {
         if (var1.P().id_super()) {
            cb_3 var10000 = (cb_3)id_import.id_class[57];
            Boolean var6 = true;
            var10000.id_break[38] = var6;
         }
      }
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[16];
         this.id_break[9] = 0L;
         this.id_break[13] = false;
         this.id_break[14] = false;
         this.id_break[15] = 0;
      }
   }

   private static void id_throw() {
      id_throws = new long[]{200L, 0L};
   }

   private void id_try() {
      int var1 = this.id_public();
      int var2 = this.id_break(var1);
      if (var2 > 8) {
         ((Ax_1)id_import.id_class[55]).id_class(var2);
      }
   }

   private void id_while() {
      this.id_super();
      ((rrfg_3)this.id_break[11]).id_break();
      Integer var5 = 0;
      this.id_break[15] = var5;
      Boolean var6 = false;
      this.id_break[13] = var6;
   }

   private int id_public() {
      if (((cb_3)id_import.id_class[57]).ss().id_break() == rdy_3.dc) {
         return -2;
      } else if (((cb_3)id_import.id_class[57]).Sn().id_break() == rdy_3.dc) {
         return -3;
      } else {
         int var1 = id_catch[0];
         int var2 = -1;

         for (int var3 = 0; var3 < 45; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var3);
            if (var4.id_break() == rdy_3.dc) {
               int var5 = var4.id_char();
               if (var5 < var1) {
                  var2 = var3;
                  var1 = var5;
               }
            }
         }

         return var2;
      }
   }

   private static void id_abstract() {
      id_byte = new byte[]{6, 3, 2, 2, 3, 4, 5, 2, 8, -2, -3, -1, 45, -2, -3, 9, 9, 36, -1, -1, 6, -1, 6, 36, 36, 8, 16, 9, 13, 14, 15};
   }
}
