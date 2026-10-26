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
      rdn_3 var2 = ((cb_3)id_import.id_class[id_private[66]]).id_class(rXQ.CHEST);
      if (var2.id_break() != rdy_3.kc || var1) {
         int var3 = rrfY_2.id_break(rrfY_2.id_class(id_protected[21], id_protected[22]));
         if (var3 != id_byte[19]) {
            if (((rrIk_1)this.id_break[id_private[67]]).id_class() && rrfZ_2.id_byte()) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_private[68]])
                  .id_class(new rrtx_3(this.id_final(), id_implements[11], id_private[69]));
            } else {
               ((rrmi_3)this.id_break[id_private[70]]).id_class(var2, var3);
               this.id_class(var3, id_byte[20]);
               Boolean var8 = id_protected[23];
               this.id_break[id_private[71]] = var8;
            }
         }
      }
   }

   public ElytraSwap() {
      super(id_implements[0], id_implements[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_private[0]]);
      this.id_super();
      rrIF var5 = new rrIF(id_implements[2], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_private[1]]);
      this.id_break[id_private[2]] = var5;
      rrIF var6 = new rrIF(id_implements[3], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_private[3]]);
      this.id_break[id_private[4]] = var6;
      rrIk_1 var7 = new rrIk_1(id_implements[4], id_protected[0]);
      this.id_break[id_private[5]] = var7;
      rrIk_1 var8 = new rrIk_1(id_implements[5], id_protected[1]);
      this.id_break[id_private[6]] = var8;
      rrIk_1 var9 = new rrIk_1(id_implements[6], id_protected[2]);
      this.id_break[id_private[7]] = var9;
      rrIk_1 var10 = new rrIk_1(id_implements[7], id_protected[3]);
      this.id_break[id_private[8]] = var10;
      rrIk_1 var11 = new rrIk_1(id_implements[8], id_protected[4]);
      this.id_break[id_private[9]] = var11;
      rrIk_1 var12 = new rrIk_1(id_implements[9], id_protected[5]);
      this.id_break[id_private[10]] = var12;
      rrfP_2 var13 = new rrfP_2();
      this.id_break[id_private[11]] = var13;
      rrmi_3 var14 = new rrmi_3();
      this.id_break[id_private[12]] = var14;
      rrfg_3 var15 = new rrfg_3();
      this.id_break[id_private[13]] = var15;
      Setting[] var10001 = new Setting[id_byte[0]];
      byte var10003 = id_protected[6];
      String var10006 = id_implements[10];
      rrIk_1[] var10007 = new rrIk_1[id_byte[1]];
      var10007[id_protected[7]] = (rrIk_1)this.id_break[id_private[14]];
      var10007[id_protected[8]] = (rrIk_1)this.id_break[id_private[15]];
      var10007[id_byte[2]] = (rrIk_1)this.id_break[id_private[16]];
      var10001[var10003] = new rrIc_1(var10006, var10007);
      var10001[id_protected[9]] = (rrIF)this.id_break[id_private[17]];
      var10001[id_byte[3]] = (rrIF)this.id_break[id_private[18]];
      var10001[id_byte[4]] = (rrIk_1)this.id_break[id_private[19]];
      var10001[id_byte[5]] = (rrIk_1)this.id_break[id_private[20]];
      var10001[id_byte[6]] = (rrIk_1)this.id_break[id_private[21]];
      this.id_class(var10001);
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
      if (!(Boolean)this.id_break[id_private[78]]) {
         return id_protected[27];
      } else if (((rrIk_1)this.id_break[id_private[79]]).id_class() && ((rrfg_3)this.id_break[id_private[80]]).id_class()) {
         return id_protected[28];
      } else {
         return ((rrIk_1)this.id_break[id_private[81]]).id_class()
               && ((cb_3)id_import.id_class[id_private[82]]).BL()
               && ((cb_3)id_import.id_class[id_private[83]]).id_break[id_private[84]]
            ? id_protected[29]
            : id_protected[30];
      }
   }

   private void id_class(int var1, int var2) {
      int var3 = ((rJr_1)((cb_3)id_import.id_class[id_private[85]]).id_implements[id_private[86]]).id_case;
      if (var1 > id_byte[23]) {
         ((Ax_1)id_import.id_class[id_private[87]]).id_class(var3, var2, var1 - id_byte[24], rXa_1.SWAP, id_protected[31]);
      } else {
         int var4 = ((rhz_3)((cb_3)id_import.id_class[id_private[88]]).id_implements[id_private[89]]).id_protected % id_byte[25] + id_protected[32];
         ((Ax_1)id_import.id_class[id_private[90]]).id_class(var3, var1, var4, rXa_1.SWAP, id_protected[33]);
         ((Ax_1)id_import.id_class[id_private[91]]).id_class(var3, var2, var4, rXa_1.SWAP, id_protected[34]);
         ((Ax_1)id_import.id_class[id_private[92]]).id_class(var3, var1, var4, rXa_1.SWAP, id_protected[35]);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[93]]).id_finally().id_class(rrLY.id_class());
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1596290211;
   }

   @EventTarget
   public void id_class(rrAg_1 var1) {
      this.id_super();
      rdn_3 var2 = var1.id_byte();
      if ((rdn_3)this.id_break[id_private[45]] != null) {
         if (rdn_3.id_break(var2, (rdn_3)this.id_break[id_private[46]])) {
            if (var2.id_break() == rdy_3.kc) {
               Boolean var7 = id_protected[18];
               this.id_break[id_private[47]] = var7;
            } else {
               ((rrmi_3)this.id_break[id_private[48]]).id_class(var2, var1.id_class());
               Boolean var8 = id_protected[19];
               this.id_break[id_private[49]] = var8;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAK var1) {
      this.id_super();
      rdn_3 var6 = ((cb_3)id_import.id_class[id_private[43]]).id_class(rXQ.CHEST);
      this.id_break[id_private[44]] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2268418545072937999L;
   }

   @EventTarget
   public void id_class(rrFj_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rhd_3 && ((rrIk_1)this.id_break[id_private[51]]).id_class() && (Boolean)this.id_break[id_private[52]]) {
         this.id_continue();
      }
   }

   @EventTarget
   public void id_class(rrnh_3 var1) {
      this.id_super();
      ((rrfg_3)this.id_break[id_private[50]]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      ((rrfP_2)this.id_break[id_private[41]]).id_class(var1);
      ((rrfg_3)this.id_break[id_private[42]]).id_class(var1);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[29]]) {
         ((rrfP_2)this.id_break[id_private[30]])
            .id_class(rqR_2.id_break() - this.id_break[id_private[31]] > id_throws[0] ? id_protected[13] : id_protected[14]);
         if (this.id_interface()) {
            this.id_continue();
         }

         if (((cb_3)id_import.id_class[id_private[32]]).Sy()) {
            rdn_3 var2 = ((cb_3)id_import.id_class[id_private[33]]).id_class(rXQ.CHEST);
            if (var2.id_break() == rdy_3.kc) {
               Integer var7 = (Integer)this.id_break[id_private[34]] + id_protected[15];
               this.id_break[id_private[35]] = var7;
               if (((rrIk_1)this.id_break[id_private[36]]).id_class() && (Integer)this.id_break[id_private[37]] < id_byte[7]) {
                  this.id_try();
               }
            } else {
               Integer var8 = Integer.valueOf(id_protected[16]);
               this.id_break[id_private[38]] = var8;
            }

            if ((Boolean)this.id_break[id_private[39]]) {
               this.id_try();
               Boolean var9 = id_protected[17];
               this.id_break[id_private[40]] = var9;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_super();
      if (var1.id_break() == ((rrIF)this.id_break[id_private[25]]).id_finally().id_byte()) {
         this.id_goto();
      } else if (var1.id_break() == ((rrIF)this.id_break[id_private[26]]).id_finally().id_byte() && ((cb_3)id_import.id_class[id_private[27]]).Sy()) {
         Boolean var6 = id_protected[12];
         this.id_break[id_private[28]] = var6;
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
      if (var1 == id_byte[13]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_byte[14]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_byte[15]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_private[59]]).id_implements[id_private[60]]).id_protected);
         return var1;
      } else if (var1 >= id_byte[16] && var1 <= id_byte[17]) {
         ((rrfP_2)this.id_break[id_private[61]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_private[62]]).id_implements[id_private[63]]).id_protected);
         ((Ax_1)id_import.id_class[id_private[64]]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_break[id_private[65]] = var6;
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
      ((rrmi_3)this.id_break[id_private[22]]).id_throws();
      Boolean var6 = id_protected[10];
      this.id_break[id_private[23]] = var6;
      Integer var7 = Integer.valueOf(id_protected[11]);
      this.id_break[id_private[24]] = var7;
   }

   private void id_goto() {
      rdn_3 var1 = ((cb_3)id_import.id_class[id_private[53]]).id_class(rXQ.CHEST);
      if (var1.id_break() == rdy_3.kc) {
         this.id_continue();
      } else {
         this.id_char();
      }
   }

   private void id_continue() {
      this.id_super();
      if (((rrmi_3)this.id_break[id_private[72]]).id_class()) {
         int var1 = ((rrmi_3)this.id_break[id_private[73]]).id_class(id_protected[24]);
         if (var1 != id_byte[21]) {
            this.id_class(var1, id_byte[22]);
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
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[74]]).id_private();
      if (((rrIk_1)this.id_break[id_private[75]]).id_class()) {
         if (var1.P().id_super()) {
            cb_3 var10000 = (cb_3)id_import.id_class[id_private[76]];
            Boolean var6 = id_protected[26];
            var10000.id_break[id_private[77]] = var6;
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
      if (var2 > id_byte[8]) {
         ((Ax_1)id_import.id_class[id_private[54]]).id_class(var2);
      }
   }

   private void id_while() {
      this.id_super();
      ((rrfg_3)this.id_break[id_private[94]]).id_break();
      Integer var5 = Integer.valueOf(id_protected[36]);
      this.id_break[id_private[95]] = var5;
      Boolean var6 = id_protected[37];
      this.id_break[id_private[96]] = var6;
   }

   private int id_public() {
      if (((cb_3)id_import.id_class[id_private[55]]).ss().id_break() == rdy_3.dc) {
         return id_byte[9];
      } else if (((cb_3)id_import.id_class[id_private[56]]).Sn().id_break() == rdy_3.dc) {
         return id_byte[10];
      } else {
         int var1 = id_catch[0];
         int var2 = id_byte[11];

         for (int var3 = id_protected[20]; var3 < id_byte[12]; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)id_import.id_class[id_private[57]]).id_implements[id_private[58]]).id_extends(var3);
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
