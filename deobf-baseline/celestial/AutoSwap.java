package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoSwap extends Module {
   private static String[] id_protected;
   public Object[] id_break;
   private static byte[] id_throws;
   private static long[] id_catch;
   private static boolean[] id_private;
   private static short[] id_implements;
   public static Object[] id_byte;
   private static float[] id_finally;

   private rrCh_1 id_boolean() {
      this.B();
      if (this.id_instanceof()) {
         return (rrCh_1)this.id_break[id_implements[71]];
      } else if (this.id_new()) {
         return (rrCh_1)this.id_break[id_implements[72]];
      } else if (this.id_continue()) {
         return (rrCh_1)this.id_break[id_implements[73]];
      } else if (this.id_else()) {
         return (rrCh_1)this.id_break[id_implements[74]];
      } else if (this.id_this()) {
         return (rrCh_1)this.id_break[id_implements[75]];
      } else {
         return (rrCh_1)(this.id_throw() ? (rrCd_1)this.id_break[id_implements[76]] : (rrCh_1)this.id_break[id_implements[77]]);
      }
   }

   public boolean id_char() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[93]]).id_byte().equals(id_protected[45]);
   }

   private static void id_byte(String var0) {
   }

   private boolean id_byte(rrCh_1 var1) {
      return ((cb_3)id_import.id_class[id_implements[78]]).sK().id_class(var1.id_class());
   }

   private static void id_long() {
      id_private = new boolean[]{
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
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
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   public AutoSwap() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_implements[0]]);
      this.B();
      rrmi_3 var5 = new rrmi_3();
      this.id_break[id_implements[1]] = var5;
      rrCM var6 = new rrCM();
      this.id_break[id_implements[2]] = var6;
      rrCb_1 var7 = new rrCb_1();
      this.id_break[id_implements[3]] = var7;
      rrCx_1 var8 = new rrCx_1();
      this.id_break[id_implements[4]] = var8;
      rrCJ var9 = new rrCJ();
      this.id_break[id_implements[5]] = var9;
      rrCX var10 = new rrCX();
      this.id_break[id_implements[6]] = var10;
      rrCd_1 var11 = new rrCd_1();
      this.id_break[id_implements[7]] = var11;
      String var10003 = id_protected[2];
      String var10004 = id_protected[3];
      String[] var10005 = new String[id_throws[0]];
      var10005[id_private[0]] = id_protected[4];
      var10005[id_private[1]] = id_protected[5];
      rrIQ var12 = new rrIQ(var10003, var10004, var10005).id_class(id_protected[6], (var1, var2) -> this.id_strictfp());
      this.id_break[id_implements[8]] = var12;
      var10003 = id_protected[7];
      var10004 = id_protected[8];
      var10005 = new String[id_throws[1]];
      var10005[id_private[2]] = id_protected[9];
      var10005[id_private[3]] = id_protected[10];
      var10005[id_throws[2]] = id_protected[11];
      var10005[id_throws[3]] = id_protected[12];
      var10005[id_throws[4]] = id_protected[13];
      var10005[id_throws[5]] = id_protected[14];
      rrIQ var13 = new rrIQ(var10003, var10004, var10005).id_class(id_protected[15], (var1, var2) -> this.id_strictfp());
      this.id_break[id_implements[9]] = var13;
      var10003 = id_protected[16];
      var10004 = id_protected[17];
      var10005 = new String[id_throws[6]];
      var10005[id_private[4]] = id_protected[18];
      var10005[id_private[5]] = id_protected[19];
      var10005[id_throws[7]] = id_protected[20];
      var10005[id_throws[8]] = id_protected[21];
      var10005[id_throws[9]] = id_protected[22];
      var10005[id_throws[10]] = id_protected[23];
      rrIQ var14 = new rrIQ(var10003, var10004, var10005).id_class(id_protected[24], (var1, var2) -> this.id_strictfp());
      this.id_break[id_implements[10]] = var14;
      rrIF var15 = new rrIF(id_protected[25], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_implements[11]]).id_class(() -> this.id_try());
      this.id_break[id_implements[12]] = var15;
      rrIm_1 var16 = new rrIm_1(id_protected[26], id_finally[0], id_finally[1], id_finally[2], id_finally[3]).id_class(() -> this.id_char());
      this.id_break[id_implements[13]] = var16;
      rrIk_1 var17 = new rrIk_1(id_protected[27], id_private[6]).id_class(() -> this.id_char() && this.id_continue() ? id_private[45] : id_private[46]);
      this.id_break[id_implements[14]] = var17;
      Setting[] var10001 = new Setting[id_throws[11]];
      var10001[id_private[7]] = (rrIQ)this.id_break[id_implements[15]];
      var10001[id_private[8]] = (rrIQ)this.id_break[id_implements[16]];
      var10001[id_throws[12]] = (rrIQ)this.id_break[id_implements[17]];
      var10001[id_throws[13]] = (rrIF)this.id_break[id_implements[18]];
      var10001[id_throws[14]] = (rrIm_1)this.id_break[id_implements[19]];
      var10001[id_throws[15]] = (rrIk_1)this.id_break[id_implements[20]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private void B() {
      if (this.id_break == null) {
         this.id_break = new Object[15];
         this.id_break[7] = 0L;
         this.id_break[8] = 0;
      }
   }

   public boolean id_this() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[88]]).id_byte().equals(id_protected[40]);
   }

   public boolean id_interface() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[82]]).id_byte().equals(id_protected[34]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1553158444;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4924245967987713692L;
   }

   @EventTarget
   public void id_class(rrLa_1 var1) {
      if (this.id_char()) {
         rdn_3 var2 = var1.id_class();
         rrLi_1 var3 = var1.id_break();
         if (this.P()) {
            int var4 = ((rJr_1)((cb_3)id_import.id_class[id_implements[35]]).id_implements[id_implements[36]]).id_case;
            rdn_3 var5 = ((cb_3)id_import.id_class[id_implements[37]]).Sn();
            rrCh_1 var6 = this.id_switch();
            rrCh_1 var7 = this.id_boolean();
            Pair var8 = this.id_class(var6);
            Pair var9 = this.id_class(var7);
            Predicate var10 = var6.id_break(this);
            Predicate var11 = var7.id_break(this);
            if (this.id_class(var2, var3)) {
               this.id_class(var8, var10, var9, var5, var4);
            } else if (this.id_class(var10, var2, var3) && this.id_static()) {
               this.id_class(var7, var9, var11, var5, var4, id_private[13]);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrAM var1) {
      this.id_strictfp();
   }

   private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2, rrLi_1 var3) {
      if (var3 instanceof rrAP && this.id_instanceof() && var2.id_break() == rdy_3.kN) {
         return id_private[33];
      } else {
         return var3 instanceof rrAr_1 && var1.test(var2) ? id_private[34] : id_private[35];
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.B();
      if (var1.id_break() == ((rrIF)this.id_break[id_implements[31]]).id_finally().id_byte() && this.id_try()) {
         int var2 = ((rJr_1)((cb_3)id_import.id_class[id_implements[32]]).id_implements[id_implements[33]]).id_case;
         rdn_3 var3 = ((cb_3)id_import.id_class[id_implements[34]]).Sn();
         rrCh_1 var4 = this.id_switch();
         rrCh_1 var5 = this.id_boolean();
         Pair var6 = this.id_class(var4);
         Pair var7 = this.id_class(var5);
         if (!this.P()) {
            return;
         }

         Predicate var8 = var4.id_break(this);
         Predicate var9 = var5.id_break(this);
         if (this.id_class(var8, var3)) {
            this.id_class(var5, var7, var9, var3, var2, id_private[12]);
         } else {
            this.id_class(var6, var8, var7, var3, var2);
         }
      }
   }

   private boolean id_class(rdn_3 var1, rrLi_1 var2) {
      if (!(var2 instanceof rrAr_1)) {
         return id_private[32];
      } else {
         return this.id_instanceof() && var1.id_break() == rdy_3.kN ? id_private[30] : id_private[31];
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.B();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_implements[21]] && this.id_char()) {
         int var2 = ((rJr_1)((cb_3)id_import.id_class[id_implements[22]]).id_implements[id_implements[23]]).id_case;
         rdn_3 var3 = ((cb_3)id_import.id_class[id_implements[24]]).Sn();
         rrCh_1 var4 = this.id_switch();
         rrCh_1 var5 = this.id_boolean();
         Predicate var6 = var4.id_break(this);
         Predicate var7 = var5.id_break(this);
         if (this.id_break(var7, var3)) {
            Integer var14 = (Integer)this.id_break[id_implements[25]] + id_private[9];
            this.id_break[id_implements[26]] = var14;
         } else {
            Integer var15 = Integer.valueOf(id_private[10]);
            this.id_break[id_implements[27]] = var15;
         }

         if (((cb_3)id_import.id_class[id_implements[28]]).P() == rpm_3.OFF_HAND && this.id_class(var6, ((cb_3)id_import.id_class[id_implements[29]]).sX())) {
            Long var16 = System.currentTimeMillis();
            this.id_break[id_implements[30]] = var16;
         }

         if (!this.P()) {
            return;
         }

         Pair var8 = this.id_class(var4);
         Pair var9 = this.id_class(var5);
         if (this.id_break(var4)) {
            this.id_class(var8, var6, var9, var3, var2);
         } else if (this.id_static()) {
            this.id_class(var5, var9, var7, var3, var2, id_private[11]);
         }
      }
   }

   private Pair<rdn_3, Integer> id_class(rrCh_1 var1) {
      Predicate var2 = var1.id_break(this);
      ArrayList var3 = new ArrayList();

      for (int var4 = id_private[41]; var4 < id_throws[22]; var4++) {
         rdn_3 var5 = ((rhz_3)((cb_3)id_import.id_class[id_implements[62]]).id_implements[id_implements[63]]).id_extends(var4);
         if (!var5.id_class() && var2.test(var5)) {
            var3.add(Pair.of(var5, var4));
         }
      }

      Comparator var6 = var1.id_byte(this);
      if (var6 != null) {
         var3.sort(var6);
      }

      return var3.isEmpty() ? null : (Pair)var3.get(id_private[42]);
   }

   private void id_class(Pair<rdn_3, Integer> var1, Predicate<rdn_3> var2, Pair<rdn_3, Integer> var3, rdn_3 var4, int var5) {
      this.B();
      if (var1 != null) {
         if (!this.id_class(var2, var4)) {
            int var6 = (Integer)var1.getRight();
            if (var6 != id_throws[16]) {
               int var7 = rrfY_2.id_break(var6);
               if (var3 != null) {
                  rdn_3 var8 = (rdn_3)var3.getLeft();
                  ((rrmi_3)this.id_break[id_implements[38]]).id_class(var8, var7);
                  id_byte("saved swap back item " + var7);
               }

               this.id_class(var5, var7, id_throws[17]);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[39]]).id_finally().id_class(rrLY.id_class());
               rVi_1 var9 = rrfu_3.id_class()
                  .id_class(id_protected[28])
                  .id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_))
                  .id_break()
                  .id_class(((cb_3)id_import.id_class[id_implements[40]]).Sn().id_continue());
               ((cq_3)id_import.id_class[id_implements[41]]).id_class(var9, id_private[14], id_private[15]);
            }
         }
      }
   }

   private boolean id_class(rdb_3 var1) {
      boolean var2 = id_private[19];

      for (int var3 = id_private[20]; var3 < id_throws[20]; var3++) {
         if (((rhz_3)((cb_3)id_import.id_class[id_implements[49]]).id_implements[id_implements[50]]).id_extends(var3).id_break() == var1) {
            var2 = id_private[21];
            break;
         }
      }

      return var2;
   }

   private int id_class(Pair<rdn_3, Integer> var1) {
      this.B();
      if (this.id_try()) {
         return var1 != null ? (Integer)var1.getValue() : id_throws[21];
      } else {
         return ((rrmi_3)this.id_break[id_implements[61]]).id_class(id_private[39]);
      }
   }

   private void id_class(int var1, int var2, int var3) {
      ((Ax_1)id_import.id_class[id_implements[48]]).id_class(var1, var2, var3, rXa_1.SWAP, id_private[18]);
   }

   private void id_class(rrCh_1 var1, Pair<rdn_3, Integer> var2, Predicate<rdn_3> var3, rdn_3 var4, int var5, boolean var6) {
      this.B();
      int var7 = this.id_class(var2);
      if (var7 >= 0) {
         int var8 = rrfY_2.id_break(var7);
         if (this.id_break(var3, var4) && (!var1.id_class(this) || !this.id_class(var4.id_break()))) {
            if (!var6 && (Integer)this.id_break[id_implements[45]] > id_throws[19]) {
               ((rrmi_3)this.id_break[id_implements[46]]).id_throws();
               id_byte(id_protected[30]);
            }
         } else {
            this.id_class(var5, var8, id_throws[18]);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[42]]).id_finally().id_class(rrLY.id_class());
            rVi_1 var9 = rrfu_3.id_class()
               .id_class(id_protected[29])
               .id_break(rVa_1.id_class(rrZF.d_), rVa_1.id_class(rrZF.d_))
               .id_break()
               .id_class(((cb_3)id_import.id_class[id_implements[43]]).Sn().id_continue());
            ((cq_3)id_import.id_class[id_implements[44]]).id_class(var9, id_private[16], id_private[17]);
         }

         if (var6) {
            ((rrmi_3)this.id_break[id_implements[47]]).id_throws();
            id_byte(id_protected[31]);
         }
      }
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_strictfp();
   }

   private boolean id_class(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   private static void id_short() {
      id_finally = new float[]{16.5F, 1.0F, 19.5F, 0.5F, 6.0F};
   }

   private static void id_void() {
      Object[] var0 = new Object[]{40, -1, false};
      id_byte = var0;
   }

   private static void r() {
      id_throws = new byte[]{2, 6, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 2, 3, 4, 5, -1, 40, 40, 5, 36, -1, 36, 15, 7, 8, 3, 40, -1, 2};
   }

   private boolean id_break(rrCh_1 var1) {
      if (this.id_byte(var1)) {
         return id_private[25];
      } else {
         return this.id_const() ? id_private[26] : this.id_abstract();
      }
   }

   private boolean id_break(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{6, -25, -84, -87, 105, -3, -76, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_strictfp();
   }

   private boolean P() {
      if (((cb_3)id_import.id_class[id_implements[51]]).id_native()) {
         return id_private[22];
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[52]]).id_private().id_this().id_new().id_break()
            ? id_private[23]
            : id_private[24];
      }
   }

   public boolean id_goto() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[83]]).id_byte().equals(id_protected[35]);
   }

   private boolean id_const() {
      this.B();
      return ((rrIk_1)this.id_break[id_implements[59]]).id_class() && this.id_continue()
         ? ((gm_3)id_import.id_class[id_implements[60]])
            .id_return()
            .int2ObjectEntrySet()
            .stream()
            .filter(var0 -> var0.getValue() instanceof rSa_1)
            .anyMatch(
               var0 -> ((an_3)var0.getValue()).id_implements((cb_3)id_import.id_class[id_implements[94]]) <= id_finally[4] ? id_private[43] : id_private[44]
            )
         : id_private[38];
   }

   public boolean id_continue() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[86]]).id_byte().equals(id_protected[38]);
   }

   public boolean id_else() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[87]]).id_byte().equals(id_protected[39]);
   }

   private static void id_for() {
      id_catch = new long[]{400L, 0L};
   }

   private static void id_import() {
      id_implements = new short[]{
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         9,
         10,
         11,
         3,
         12,
         13,
         14,
         9,
         10,
         11,
         12,
         13,
         14,
         0,
         57,
         4,
         57,
         8,
         8,
         8,
         57,
         57,
         7,
         12,
         57,
         4,
         57,
         57,
         4,
         57,
         0,
         0,
         57,
         19,
         0,
         57,
         19,
         8,
         0,
         0,
         55,
         57,
         1,
         57,
         0,
         57,
         0,
         7,
         57,
         57,
         13,
         14,
         56,
         0,
         57,
         1,
         1,
         4,
         2,
         3,
         5,
         6,
         1,
         4,
         1,
         2,
         3,
         5,
         6,
         4,
         57,
         0,
         11,
         11,
         11,
         11,
         11,
         11,
         10,
         10,
         10,
         10,
         10,
         10,
         9,
         9,
         57
      };
   }

   public boolean id_instanceof() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[89]]).id_byte().equals(id_protected[41]);
   }

   public boolean id_new() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[90]]).id_byte().equals(id_protected[42]);
   }

   public boolean id_return() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[80]]).id_byte().equals(id_protected[32]);
   }

   public boolean id_super() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[84]]).id_byte().equals(id_protected[36]);
   }

   private rrCh_1 id_switch() {
      this.B();
      if (this.id_return()) {
         return (rrCh_1)this.id_break[id_implements[64]];
      } else if (this.id_while()) {
         return (rrCh_1)this.id_break[id_implements[65]];
      } else if (this.id_interface()) {
         return (rrCh_1)this.id_break[id_implements[66]];
      } else if (this.id_goto()) {
         return (rrCh_1)this.id_break[id_implements[67]];
      } else if (this.id_super()) {
         return (rrCh_1)this.id_break[id_implements[68]];
      } else {
         return (rrCh_1)(this.id_public() ? (rrCd_1)this.id_break[id_implements[69]] : (rrCh_1)this.id_break[id_implements[70]]);
      }
   }

   public boolean id_throw() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[91]]).id_byte().equals(id_protected[43]);
   }

   public boolean id_try() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[92]]).id_byte().equals(id_protected[44]);
   }

   public boolean id_while() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[81]]).id_byte().equals(id_protected[33]);
   }

   private boolean id_static() {
      this.B();
      if (((cb_3)id_import.id_class[id_implements[53]]).sK().id_class(((rrmi_3)this.id_break[id_implements[54]]).id_protected())) {
         return id_private[27];
      } else {
         return System.currentTimeMillis() - this.id_break[id_implements[55]] < id_catch[0] ? id_private[28] : id_private[29];
      }
   }

   public boolean id_public() {
      this.B();
      return ((rrIQ)this.id_break[id_implements[85]]).id_byte().equals(id_protected[37]);
   }

   private boolean id_abstract() {
      this.B();
      float var1 = ((cb_3)id_import.id_class[id_implements[56]]).Ss() + ((cb_3)id_import.id_class[id_implements[57]]).Sd();
      return var1 <= ((rrIm_1)this.id_break[id_implements[58]]).id_byte() ? id_private[36] : id_private[37];
   }

   private static void id_transient() {
      id_protected = new String[]{
         new String("Auto Swap"),
         new String("Автоматически меняет предмет\nв правой руке"),
         new String("Режим"),
         new String("Умный"),
         new String("Умный"),
         new String("Бинд"),
         new String("change_mode"),
         new String("Менять с"),
         new String("Щит"),
         new String("Щит"),
         new String("Гепл"),
         new String("Шар"),
         new String("Руна"),
         new String("Сфера"),
         new String("Тотем"),
         new String("change_mode"),
         new String("Менять на"),
         new String("Гепл"),
         new String("Гепл"),
         new String("Щит"),
         new String("Шар"),
         new String("Руна"),
         new String("Сфера"),
         new String("Тотем"),
         new String("change_mode"),
         new String("Клавиша свапа"),
         new String("Здоровье"),
         new String("Проверять кристалл"),
         new String("Свапнул "),
         new String("Свапнул "),
         new String("reset swap back item"),
         new String("reset swap back item"),
         new String("Гепл"),
         new String("Щит"),
         new String("Шар"),
         new String("Сфера"),
         new String("Руна"),
         new String("Тотем"),
         new String("Шар"),
         new String("Сфера"),
         new String("Руна"),
         new String("Щит"),
         new String("Гепл"),
         new String("Тотем"),
         new String("Бинд"),
         new String("Умный")
      };
   }

   private void id_strictfp() {
      this.B();
      ((rrmi_3)this.id_break[id_implements[79]]).id_throws();
   }
}
